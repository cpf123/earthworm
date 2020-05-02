package com.sql.antlr3.hive.parse;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import com.sql.antlr3.hive.HiveLexer;
import com.sql.antlr3.hive.HiveParser;
import org.antlr.runtime.ANTLRStringStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenRewriteStream;
import org.antlr.runtime.TokenStream;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeAdaptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ParseDriver.
 */
public class ParseDriver {
    public static int WITH_COUNT = 0;
    public static int DISTINCT_COUNT = 0;
    public static int SELECT_DISTINCT_COUNT = 0;
    public static int INSERT_INTO_COUNT = 0;
    public static int TABLE_COUNT = 0;
    public static int INSERT_OVERWRITE_COUNT = 0;
    public static int TABNAME_COUNT = 0;
//    public static int SELECT_COUNT = 0; // select 列表
    public static int ROW_NUMBER_COUNT = 0;
    public static int SELECT_COL_COUNT = 0;
    public static int XINGHAO_COUNT = 0;
    public static int FROM_COUNT = 0;
    public static int SORT_BY_COUNT = 0;
    public static int ORDER_BY_COUNT = 0;
    public static int GROUP_BY_COUNT = 0;
    public static int OVER_ORDER_BY_COUNT = 0;
    public static int LEVELS_UNIONALL = 0;
    public static int LEVEL_UNIONALL = 0;
    public static int JOIN_COUNT = 0;
    public static int CROSS_JOIN_COUNT = 0;
    public static int FULL_OUTER_JOIN_COUNT = 0;
    public static int LEFT_SEMI_JOIN_COUNT = 0;
    public static int RIGHT_OUTER_JOIN_COUNT = 0;
    public static int UNIQUE_JOIN_COUNT = 0;
    public static int LEFT_OUTER_JOIN_COUNT = 0;
    public static int SUBQUERY_COUNT = 0;
    public static int OTHER_JOIN_COUNT = 0;

    // 注释节点和输出位置
    public class CommentsWhere {
        public Token Comment; // 这个是评论节点
        public Token Where; // 这个是应该放到哪里

        @Override
        public String toString() {
            String w = "";
            if (this.Where != null) {
                w = this.Where.toString();
            }
            return "\n[" + this.Comment.toString() + "\n" + w + "]";
        }
    }

    public Deque<CommentsWhere> AllCommentsDeq;

    public Deque<ASTNode> allnodelist;

    public static int TABSPACE = 4;

    private static final Logger LOG = LoggerFactory.getLogger("hive.ql.parse.ParseDriver");

    public class ANTLRNoCaseStringStream extends ANTLRStringStream {

        public ANTLRNoCaseStringStream(String input) {
            super(input);
        }

        @Override
        public int LA(int i) {

            int returnChar = super.LA(i);
            if (returnChar == CharStream.EOF) {
                return returnChar;
            } else if (returnChar == 0) {
                return returnChar;
            }

            return Character.toUpperCase((char) returnChar);
        }
    }

    public class HiveLexerX extends HiveLexer {
        private final ArrayList<ParseError> errors;

        public HiveLexerX() {
            super();
            errors = new ArrayList<ParseError>();
        }

        public HiveLexerX(CharStream input) {
            super(input);
            errors = new ArrayList<ParseError>();
        }

        @Override
        public void displayRecognitionError(String[] tokenNames, RecognitionException e) {

            errors.add(new ParseError(this, e, tokenNames));
        }

        @Override
        public String getErrorMessage(RecognitionException e, String[] tokenNames) {
            String msg = null;

            if (e instanceof NoViableAltException) {
                @SuppressWarnings("unused")
                NoViableAltException nvae = (NoViableAltException) e;
                // for development, can add
                // "decision=<<"+nvae.grammarDecisionDescription+">>"
                // and "(decision="+nvae.decisionNumber+") and
                // "state "+nvae.stateNumber
                msg = "character " + getCharErrorDisplay(e.c) + " not supported here";
            } else {
                msg = super.getErrorMessage(e, tokenNames);
            }

            return msg;
        }

        public ArrayList<ParseError> getErrors() {
            return errors;
        }

    }

    public class TreeAdaptor extends CommonTreeAdaptor {
        private HiveParser ps = null;

        public TreeAdaptor(HiveParser ps) {
            this.ps = ps;
        }

        @Override
        public Object create(Token payload) {
            return new ASTNode(payload);
        }

        @Override
        public Object dupNode(Object t) {
            return create(((CommonTree) t).token);
        }


        @Override
        public Token createToken(int tokenType, String text) {
            CommonToken ct = new CommonToken(tokenType, text);

            /*
             * if (LOG.isDebugEnabled()) { LOG.debug("create token: " + text);
             * LOG.debug(((Token) ps.xstarttokens.peek()).toString()); }
             */

            Token t = (Token) ps.xstarttokens.peek();
            ct.setLine(t.getLine());
            ct.setCharPositionInLine(t.getCharPositionInLine());
            return ct;
        }

        @Override
        public Object dupTree(Object t, Object parent) {
            // Overriden to copy start index / end index, that is needed through
            // optimization,
            // e.g., for masking/filtering
            ASTNode astNode = (ASTNode) t;
            ASTNode astNodeCopy = (ASTNode) super.dupTree(t, parent);
            astNodeCopy.setTokenStartIndex(astNode.getTokenStartIndex());
            astNodeCopy.setTokenStopIndex(astNode.getTokenStopIndex());
            return astNodeCopy;
        }

        @Override
        public Object errorNode(TokenStream input, Token start, Token stop, RecognitionException e) {
            return new ASTErrorNode(input, start, stop, e);
        }
    }


    public ASTNode parse(String command) throws ParseException {

        HiveLexerX lexer = new HiveLexerX(new ANTLRNoCaseStringStream(command));
        TokenRewriteStream tokens = new TokenRewriteStream(lexer);

        tokens.fill();
        List<Token> alltokens = (List<Token>) tokens.getTokens();

        this.AllCommentsDeq = new LinkedList<CommentsWhere>();
        for (Token t : alltokens) {
            if (t.getChannel() == lexer.COMMENTS) {

                CommentsWhere cw = new CommentsWhere();
                cw.Comment = t;
                cw.Where = null;
                AllCommentsDeq.addLast(cw);
            }
        }
        if (LOG.isDebugEnabled()) {
            LOG.debug("Parsing command: " + command);
            LOG.debug("All comments:" + AllCommentsDeq.toString());
        }


        HiveParser parser = new HiveParser(tokens);
        TreeAdaptor adaptor = new TreeAdaptor(parser);
        parser.setTreeAdaptor(adaptor);
        HiveParser.statement_return r = null;
        try {
            r = parser.statement();
        } catch (RecognitionException e) {
            e.printStackTrace();
            throw new ParseException(parser.errors);
        }

        if (lexer.getErrors().size() == 0 && parser.errors.size() == 0) {
            LOG.debug("Parse Completed");
        } else if (lexer.getErrors().size() != 0) {
            throw new ParseException(lexer.getErrors());
        } else {
            throw new ParseException(parser.errors);
        }

        ASTNode tree = (ASTNode) r.getTree();
        tree.setUnknownTokenBoundaries();
        return tree;
    }

    private void UpdateCommentsWhere(ASTNode tree) {
        allnodelist = new LinkedList<ASTNode>();
        SortAllnodes(tree);
        for (CommentsWhere i : AllCommentsDeq) {
            ASTNode last = null;
            for (ASTNode j : allnodelist) {
                if (j.getLine() < i.Comment.getLine() || (j.getLine() == i.Comment.getLine()
                        && j.getCharPositionInLine() <= i.Comment.getCharPositionInLine())) {
                    if (last != null) {
                        i.Where = last.getToken();
                    }
                    break;
                }
                last = j;
            }
        }
    }

    private void SortAllnodes(ASTNode tree) {

        allnodelist.addFirst(tree);
        List<Node> c = tree.getChildren();
        if (c != null) {
            Collections.sort(c, new Comparator<Node>() {
                public int compare(Node o1, Node o2) {
                    return Integer.compare(((ASTNode) o1).getTokenStartIndex(), ((ASTNode) o2).getTokenStartIndex());
                }
            });
            for (Node i : c) {
                SortAllnodes((ASTNode) i);
            }
        }
    }



    public boolean QueryParse(boolean KeyUpper, ASTNode node, HashMap<String, Integer> map) {
        switch (node.getType()) {

            case HiveParser.TOK_CTE:{
                List<Node> c1 = ((ASTNode) node).getChildren();
                for (Node i1 : c1) {
                    ++WITH_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i1, map);
                }
                return true;
            }

            // insert into
            case HiveParser.TOK_INSERT_INTO: {
                List<Node> c1 = ((ASTNode) node).getChildren();
                for (Node i1 : c1) {
                    ++INSERT_INTO_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i1, map);
                }
                return true;
            }


            // table
            case HiveParser.TOK_TAB: {
                List<Node> c1 = ((ASTNode) node).getChildren();
                for (Node i1 : c1) {
                    ++TABLE_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i1, map);
                }
                return true;
            }


            //insert 目标
            case HiveParser.TOK_DESTINATION: {
                List<Node> c1 = ((ASTNode) node).getChildren();
                for (Node i1 : c1) {
                    switch (((ASTNode) i1).getType()) {
                        case HiveParser.TOK_TAB: {
                            List<Node> c2 = ((ASTNode) i1).getChildren();
                            for (Node i2 : c2) {
                                ++INSERT_OVERWRITE_COUNT;
                                QueryParse(KeyUpper, (ASTNode) i2, map);
                            }
                            break;
                        }
                        case HiveParser.TOK_DIR: {

                            List<Node> c2 = ((ASTNode) i1).getChildren();
                            Collections.sort(c2, new Comparator<Node>() {
                                public int compare(Node o1, Node o2) {
                                    return Integer.compare(((ASTNode) o1).getTokenStartIndex(), ((ASTNode) o2).getTokenStartIndex());
                                }
                            });

                            if (c2.size() == 1 && ((ASTNode) c2.get(0)).getType() == HiveParser.TOK_TMP_FILE) {
                                //临时文件运行需求
                                return true;
                            }
                            int index = 0;
                            for (Node i2 : c2) {
                                switch (((ASTNode) i2).getType()) {
                                    default:
                                        QueryParse(KeyUpper, (ASTNode) i2, map);
                                }
                                index++;
                            }
                            break;
                        }
                        default:
                            QueryParse(KeyUpper, (ASTNode) i1, map);
                    }
                }
                return true;
            }

            // 表引用-》表名称
            case HiveParser.TOK_TABREF: {

                List<Node> c = node.getChildren();
                int index = 0;
                for (Node i : c) {

                    QueryParse(KeyUpper, (ASTNode) i, map);
                    index++;
                }
                return true;
            }
            // 表名称
            case HiveParser.TOK_TABNAME: {


                List<Node> c1 = ((ASTNode) node).getChildren();
                for (Node i1 : c1) {
                    ++TABNAME_COUNT;
                }

                return true;
            }

            // select 列表
            case HiveParser.TOK_SELECTDI: {
                List<Node> c = node.getChildren();
                for (Node i : c) {
                    ++SELECT_DISTINCT_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;
            }
            // select 列表
            case HiveParser.TOK_SELECT: {
                List<Node> c = node.getChildren();

                for (Node i : c) {
//                    ++SELECT_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;
            }

            // distinct 的函数
            case HiveParser.TOK_FUNCTIONDI: {
                List<Node> c0 = ((ASTNode) node).getChildren();
                for (Node i0 : c0) {
                    ++DISTINCT_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i0, map);
                }
                return true;
            }

            case HiveParser.TOK_FUNCTION: {
                List<Node> c0 = ((ASTNode) node).getChildren();
                Node firstnode = c0.get(0);
                String funcname = ((ASTNode) firstnode).getText().toLowerCase();

                if (funcname.equals("row_number")) {
                    for (Node i0 : c0) {
                        ++ROW_NUMBER_COUNT;
                        QueryParse(KeyUpper, (ASTNode) i0, map);
                    }
                }
                return true;
            }

            // select 下面直接的item

            case HiveParser.TOK_TABLE_OR_COL: {
                List<Node> c0 = ((ASTNode) node).getChildren();
                for (Node i0 : c0) {
                    ++SELECT_COL_COUNT;
                }
                return true;
            }

            // select -> TOK_SELEXPR 里面跟着的 a.id 这样的
            case HiveParser.DOT: {

                List<Node> c0 = ((ASTNode) node).getChildren();
                for (Node i0 : c0) {

                    switch (((ASTNode) i0).getType()) {
                        case HiveParser.Identifier: {

                            break;
                        }

                        case HiveParser.TOK_TABLE_OR_COL: {
                            List<Node> c1 = ((ASTNode) i0).getChildren();
                            for (Node i1 : c1) {

                            }
                            break;
                        }
                        default:
                            QueryParse(KeyUpper, (ASTNode) i0, map);
                    }
                }
                return true;

            }

            // select item
            case HiveParser.TOK_SELEXPR: {

                List<Node> c = node.getChildren();
                for (Node i : c) {
                    switch (((ASTNode) i).getType()) {
                        case HiveParser.StringLiteral:

                            break;

                        case HiveParser.Identifier: {

                        }
                        break;

                        case HiveParser.TOK_TABLE_OR_COL: {
                            List<Node> c0 = ((ASTNode) i).getChildren();
                            for (Node i0 : c0) {


                            }
                            break;
                        }

                        // 这个是*号 什么都没有
                        case HiveParser.TOK_SETCOLREF: {
                            ++XINGHAO_COUNT;
                            break;
                        }
                        case HiveParser.TOK_ALLCOLREF: {
                            ++XINGHAO_COUNT;
                            break;
                        }

                        default:
                            QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                return true;
            }

            // from
            case HiveParser.TOK_FROM: {

                List<Node> c = node.getChildren();
                for (Node i : c) {
                    ++FROM_COUNT;//from个数
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;
            }

            // where
            case HiveParser.TOK_WHERE: {
                List<Node> c = node.getChildren();
                for (Node i : c) {
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;

            }

            case HiveParser.KW_OR: {


                List<Node> c = node.getChildren();
                boolean first = true;
                for (Node i : c) {

                    if (!first) {
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    } else {
                        if (((ASTNode) i).getType() == HiveParser.KW_AND || ((ASTNode) i).getType() == HiveParser.KW_OR) {
                            QueryParse(KeyUpper, (ASTNode) i, map);
                        } else {
                            QueryParse(KeyUpper, (ASTNode) i, map);
                        }
                    }
                    first = false;
                }
                return true;
            }
            case HiveParser.KW_AND: {
                List<Node> c = node.getChildren();
                boolean first = true;
                for (Node i : c) {

                    if (!first) {

                        if (((ASTNode) i).getType() == HiveParser.KW_OR) {
                            QueryParse(KeyUpper, (ASTNode) i, map);
                        } else {
                            QueryParse(KeyUpper, (ASTNode) i, map);
                        }
                    } else {
                        if (((ASTNode) i).getType() == HiveParser.KW_AND || ((ASTNode) i).getType() == HiveParser.KW_OR) {
                            if (((ASTNode) i).getType() == HiveParser.KW_OR) {
                                QueryParse(KeyUpper, (ASTNode) i, map);
                            } else {
                                QueryParse(KeyUpper, (ASTNode) i, map);
                            }
                        } else {
                            QueryParse(KeyUpper, (ASTNode) i, map);
                        }
                    }
                    first = false;
                }
                return true;
            }

            // row number -----------------------------
            case HiveParser.TOK_SORTBY: {
                List<Node> c = node.getChildren();

                for (Node i : c) {
                    ++SORT_BY_COUNT;// BY 对应的字段数
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;

            }
            case HiveParser.TOK_PARTITIONINGSPEC: {// over partition by
                List<Node> c = node.getChildren();
                int index = 0;
                for (Node i : c) {
                    switch (((ASTNode) i).getType()) {
                        case HiveParser.TOK_DISTRIBUTEBY: {
                            List<Node> c0 = ((ASTNode) i).getChildren();
                            index = 0;
                            for (Node i0 : c0) {
                                QueryParse(KeyUpper, (ASTNode) i0, map);
                                index++;
                            }
                            break;
                        }

                        case HiveParser.TOK_ORDERBY: {//order by

                            List<Node> c0 = ((ASTNode) i).getChildren();
                            index = 0;
                            for (Node i0 : c0) {
                                ++OVER_ORDER_BY_COUNT;
                                QueryParse(KeyUpper, (ASTNode) i0, map);
                                index++;
                            }
                            break;
                        }
                        default:
                            QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                return true;
            }
            case HiveParser.TOK_WINDOWSPEC: {
                List<Node> c = node.getChildren();

                boolean first = true;
                for (Node i : c) {
                    QueryParse(KeyUpper, (ASTNode) i, map);
                    first = false;
                }
                return true;
            }

            // row number end--------------------------------

            // 正则匹配
            case HiveParser.KW_REGEXP: {
                List<Node> c = node.getChildren();
                for (Node i : c) {
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;

            }
            // group by
            case HiveParser.TOK_GROUPBY: {
                List<Node> c = node.getChildren();
                for (Node i : c) {
                    switch (((ASTNode) i).getType()) {
                        case HiveParser.TOK_TABLE_OR_COL: {

                            List<Node> c0 = ((ASTNode) i).getChildren();
                            for (Node i0 : c0) {
                                ++GROUP_BY_COUNT;
                            }
                            break;
                        }
                        default:
                            QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                return true;

            }

            // order by 孙 子节点
//            case HiveParser.TOK_NULLS_LAST:
//            case HiveParser.TOK_NULLS_FIRST: {
//
//                List<Node> c = node.getChildren();
//                for (Node i : c) {
//                    QueryParse(KeyUpper, (ASTNode) i, map);
//                }
//                return true;
//            }

            // order by 直接 子节点
            // asc
//            case HiveParser.TOK_TABSORTCOLNAMEASC: {
//
//                List<Node> c = node.getChildren();
//                int index = 0;
//                for (Node i : c) {
//                    QueryParse(KeyUpper, (ASTNode) i, map);
//                }
//
//                return true;
//            }
//            // desc
//            case HiveParser.TOK_TABSORTCOLNAMEDESC: {
//
//                List<Node> c = node.getChildren();
//                int index = 0;
//                for (Node i : c) {
//                    QueryParse(KeyUpper, (ASTNode) i, map);
//                }
//                return true;
//            }

            // order by
            case HiveParser.TOK_ORDERBY: {
                List<Node> c0 = ((ASTNode) node).getChildren();
                for (Node i0 : c0) {
                    ++ORDER_BY_COUNT;
                    QueryParse(KeyUpper, (ASTNode) i0, map);
                }
                return true;
            }

            // limit
            case HiveParser.TOK_LIMIT: {

                List<Node> c0 = ((ASTNode) node).getChildren();
                for (Node i0 : c0) {
                    QueryParse(KeyUpper, (ASTNode) i0, map);
                }
                return true;
            }

            // union all
            case HiveParser.TOK_UNIONALL: {
                List<Node> c = node.getChildren();
                for (Node i : c) {
                    if (((ASTNode) i).getType() == HiveParser.TOK_UNIONALL) {
                        // 如果是union all 嵌套的 // 不同等级
                        ++LEVELS_UNIONALL;
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    } else {
                        // 如果是union all 具体的 子query 缩进加1 // 相同等级union all
                        ++LEVEL_UNIONALL;
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                return true;
            }
            case HiveParser.TOK_FULLOUTERJOIN:
            case HiveParser.TOK_CROSSJOIN:
            case HiveParser.TOK_JOIN:
            case HiveParser.TOK_UNIQUEJOIN:

            case HiveParser.TOK_RIGHTOUTERJOIN:
            case HiveParser.TOK_LEFTSEMIJOIN:
            case HiveParser.TOK_LEFTOUTERJOIN: {

                if (node.getType() == HiveParser.TOK_FULLOUTERJOIN) {
//                    ++FULL_OUTER_JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_CROSSJOIN) {
//                    ++CROSS_JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_JOIN) {
//                    ++JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_UNIQUEJOIN) {
//                    ++UNIQUE_JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_RIGHTOUTERJOIN) {
//                    ++RIGHT_OUTER_JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_LEFTSEMIJOIN) {
//                    ++LEFT_SEMI_JOIN_COUNT;
                } else if (node.getType() == HiveParser.TOK_LEFTOUTERJOIN) {
//                    ++LEFT_OUTER_JOIN_COUNT;
                }

                List<Node> c = node.getChildren();
                int index = 0;
                for (Node i : c) {

                    if (index == 1) {
                        //join 关键字
                    }
                    if (index == 2) {
                        // on 关键字
                    }
                    if (((ASTNode) i).getType() == HiveParser.TOK_LEFTOUTERJOIN) {
                        ++LEFT_OUTER_JOIN_COUNT;
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    } else if (((ASTNode) i).getType() == HiveParser.TOK_JOIN) {
                        ++JOIN_COUNT;
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    } else {
                        ++OTHER_JOIN_COUNT;
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    }

                    index++;

                }
                return true;
            }

            // 子查询
            case HiveParser.TOK_SUBQUERY: {

                List<Node> c = node.getChildren();
                Collections.sort(c, new Comparator<Node>() {
                    public int compare(Node o1, Node o2) {
                        return Integer.compare(((ASTNode) o1).getTokenStartIndex(), ((ASTNode) o2).getTokenStartIndex());
                    }
                });

                String subname = "";
                for (Node i : c) {
                    switch (((ASTNode) i).getType()) {

                        // 里面的具体query
                        case HiveParser.TOK_QUERY: {
                            ++SUBQUERY_COUNT;
                            QueryParse(KeyUpper, (ASTNode) i, map);
                            break;
                        }
                        // 最后一个别名
                        case HiveParser.Identifier: {
                            // 获取一下当前别名
                            subname = ((ASTNode) i).getText();
                            break;
                        }
                        default:
                            QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                return true;
            }

            // sub query 例如 x in (select * from a)
            case HiveParser.TOK_SUBQUERY_EXPR: {
                List<Node> c = node.getChildren();
                Collections.sort(c, new Comparator<Node>() {
                    public int compare(Node o1, Node o2) {
                        return Integer.compare(((ASTNode) o1).getTokenStartIndex(), ((ASTNode) o2).getTokenStartIndex());
                    }
                });

                for (Node i : c) {
                    if (((ASTNode) i).getType() != HiveParser.TOK_QUERY && ((ASTNode) i).getType() != HiveParser.TOK_SUBQUERY_OP) {
                        QueryParse(KeyUpper, (ASTNode) i, map);
                    }
                }
                for (Node i : c) {
                    if (((ASTNode) i).getType() == HiveParser.TOK_QUERY) {
                        QueryParse(KeyUpper, (ASTNode) i, map);
                        continue;
                    }

                    if (((ASTNode) i).getType() == HiveParser.TOK_SUBQUERY_OP) {
                        List<Node> c0 = ((ASTNode) i).getChildren();
                        for (Node i0 : c0) {
                            QueryParse(KeyUpper, (ASTNode) i0, map);
                        }
                    }

                }

                return true;

            }
            // query
            case HiveParser.TOK_QUERY: {
                List<Node> c = node.getChildren();

                // 把里面的节点重新排一下序
                // insert 节点包含一些
                // from 节点包含一些
                List<Node> xx = new ArrayList<Node>();
                for (Node i : c) {

                    switch (((ASTNode) i).getType()) {
                        case HiveParser.TOK_INSERT: {
                            List<Node> c0 = ((ASTNode) i).getChildren();
                            xx.addAll(c0);
                            break;
                        }
                        case HiveParser.TOK_FROM: {
                            xx.add(i);
                            break;
                        }
                        default:
                            xx.add(i);
                    }
                }
                xx.sort(new Comparator<Node>() {
                    public int compare(Node o1, Node o2) {
                        return Integer.compare(((ASTNode) o1).getTokenStartIndex(), ((ASTNode) o2).getTokenStartIndex());
                    }
                });

                for (Node i : xx) {
                    QueryParse(KeyUpper, (ASTNode) i, map);
                }
                return true;

            }

//            case HiveParser.KW_IN: {
//                // in 关键字
//                return true;
//            }
//
//            case HiveParser.KW_NOT: {
//                // not 关键字
//                List<Node> c = node.getChildren();
//                for (Node i : c) {
//                    QueryParse(KeyUpper, (ASTNode) i, map);
//                }
//                return true;
//            }
//            case HiveParser.TOK_NULL: {
//
//                return true;
//            }
            // 这个地方是个数字
//            case HiveParser.Number: {
//                return true;
//            }

            case HiveParser.Identifier: {
                return true;
            }

            case HiveParser.StringLiteral:
                return true;

            default:
                return false;

        }

    }

    public HashMap<String, Integer> parse(String sql, HashMap<String, Integer> map) throws ParseException {
        // 解析
        ASTNode tr = this.parse(sql);
        LOG.debug(tr.dump());
        // 更新注释位置
        this.UpdateCommentsWhere(tr);

        LOG.debug(this.AllCommentsDeq.toString());

        Deque<ASTNode> stack = new ArrayDeque<ASTNode>();
        HashMap<ASTNode, Boolean> vistmap = new HashMap<ASTNode, Boolean>();
        stack.push(tr);

        while (!stack.isEmpty()) {
            ASTNode next = stack.peek();
            if (vistmap.get(next) == null) {

                if (next.getType() == HiveParser.TOK_QUERY) {
                    QueryParse(true, next, map);
                }

                if (next.getChildCount() > 0) {

                    List<Node> c = next.getChildren();
                    for (Node i : c) {
                        stack.push((ASTNode) i);
                    }
                }
                vistmap.put(next, true);
            } else {
                stack.pop();
            }
        }
        map.put("WITH_COUNT", WITH_COUNT);
        map.put("DISTINCT_COUNT", DISTINCT_COUNT);
        map.put("SELECT_DISTINCT_COUNT", SELECT_DISTINCT_COUNT);
        map.put("INSERT_INTO_COUNT", INSERT_INTO_COUNT);
        map.put("TABLE_COUNT", TABLE_COUNT);
        map.put("INSERT_OVERWRITE_COUNT", INSERT_OVERWRITE_COUNT);
        map.put("TABNAME_COUNT", TABNAME_COUNT);
//        map.put("SELECT_COUNT", SELECT_COUNT);
        map.put("ROW_NUMBER_COUNT", ROW_NUMBER_COUNT);
        map.put("SELECT_COL_COUNT", SELECT_COL_COUNT);
        map.put("XINGHAO_COUNT", XINGHAO_COUNT);
        map.put("FROM_COUNT", FROM_COUNT);
        map.put("SORT_BY_COUNT", SORT_BY_COUNT);
        map.put("ORDER_BY_COUNT", ORDER_BY_COUNT);
        map.put("GROUP_BY_COUNT", GROUP_BY_COUNT);
        map.put("OVER_ORDER_BY_COUNT", OVER_ORDER_BY_COUNT);
        map.put("LEVELS_UNIONALL", LEVELS_UNIONALL);
        map.put("LEVEL_UNIONALL", LEVEL_UNIONALL);
        map.put("JOIN_COUNT", JOIN_COUNT);
        map.put("CROSS_JOIN_COUNT", CROSS_JOIN_COUNT);
        map.put("FULL_OUTER_JOIN_COUNT", FULL_OUTER_JOIN_COUNT);
        map.put("LEFT_SEMI_JOIN_COUNT", LEFT_SEMI_JOIN_COUNT);
        map.put("RIGHT_OUTER_JOIN_COUNT", RIGHT_OUTER_JOIN_COUNT);
        map.put("UNIQUE_JOIN_COUNT", UNIQUE_JOIN_COUNT);
        map.put("LEFT_OUTER_JOIN_COUNT", LEFT_OUTER_JOIN_COUNT);
        map.put("SUBQUERY_COUNT", SUBQUERY_COUNT);
        map.put("OTHER_JOIN_COUNT", OTHER_JOIN_COUNT);
        return map;
    }

    public String getTokenName(ASTNode node) {

        String k = node.getText().replaceAll("^TOK", "KW");
        String n = HiveParser.getKeyStr(k);
        if (n != null) {
            return n;
        }
        return node.getText();

    }
}
