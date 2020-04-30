// $ANTLR 3.5.2 HiveLexer.g 2020-04-30 21:24:59

package com.sql.antlr3.hive;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int ByteLengthLiteral=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int CONCATENATE=10;
	public static final int CharSetLiteral=11;
	public static final int CharSetName=12;
	public static final int DIV=13;
	public static final int DIVIDE=14;
	public static final int DOLLAR=15;
	public static final int DOT=16;
	public static final int Digit=17;
	public static final int EQUAL=18;
	public static final int EQUAL_NS=19;
	public static final int Exponent=20;
	public static final int GREATERTHAN=21;
	public static final int GREATERTHANOREQUALTO=22;
	public static final int HexDigit=23;
	public static final int Identifier=24;
	public static final int IntegralLiteral=25;
	public static final int KW_ABORT=26;
	public static final int KW_ACTIVATE=27;
	public static final int KW_ACTIVE=28;
	public static final int KW_ADD=29;
	public static final int KW_ADMIN=30;
	public static final int KW_AFTER=31;
	public static final int KW_ALL=32;
	public static final int KW_ALLOC_FRACTION=33;
	public static final int KW_ALTER=34;
	public static final int KW_ANALYZE=35;
	public static final int KW_AND=36;
	public static final int KW_ANY=37;
	public static final int KW_APPLICATION=38;
	public static final int KW_ARCHIVE=39;
	public static final int KW_ARRAY=40;
	public static final int KW_AS=41;
	public static final int KW_ASC=42;
	public static final int KW_AST=43;
	public static final int KW_AUTHORIZATION=44;
	public static final int KW_AUTOCOMMIT=45;
	public static final int KW_BEFORE=46;
	public static final int KW_BETWEEN=47;
	public static final int KW_BIGINT=48;
	public static final int KW_BINARY=49;
	public static final int KW_BOOLEAN=50;
	public static final int KW_BOTH=51;
	public static final int KW_BUCKET=52;
	public static final int KW_BUCKETS=53;
	public static final int KW_BY=54;
	public static final int KW_CACHE=55;
	public static final int KW_CASCADE=56;
	public static final int KW_CASE=57;
	public static final int KW_CAST=58;
	public static final int KW_CHANGE=59;
	public static final int KW_CHAR=60;
	public static final int KW_CHECK=61;
	public static final int KW_CLUSTER=62;
	public static final int KW_CLUSTERED=63;
	public static final int KW_CLUSTERSTATUS=64;
	public static final int KW_COLLECTION=65;
	public static final int KW_COLUMN=66;
	public static final int KW_COLUMNS=67;
	public static final int KW_COMMENT=68;
	public static final int KW_COMMIT=69;
	public static final int KW_COMPACT=70;
	public static final int KW_COMPACTIONS=71;
	public static final int KW_COMPUTE=72;
	public static final int KW_CONCATENATE=73;
	public static final int KW_CONF=74;
	public static final int KW_CONSTRAINT=75;
	public static final int KW_CONTINUE=76;
	public static final int KW_CREATE=77;
	public static final int KW_CROSS=78;
	public static final int KW_CUBE=79;
	public static final int KW_CURRENT=80;
	public static final int KW_CURRENT_DATE=81;
	public static final int KW_CURRENT_TIMESTAMP=82;
	public static final int KW_CURSOR=83;
	public static final int KW_DATA=84;
	public static final int KW_DATABASE=85;
	public static final int KW_DATABASES=86;
	public static final int KW_DATE=87;
	public static final int KW_DATETIME=88;
	public static final int KW_DAY=89;
	public static final int KW_DBPROPERTIES=90;
	public static final int KW_DEBUG=91;
	public static final int KW_DECIMAL=92;
	public static final int KW_DEFAULT=93;
	public static final int KW_DEFERRED=94;
	public static final int KW_DEFINED=95;
	public static final int KW_DELETE=96;
	public static final int KW_DELIMITED=97;
	public static final int KW_DEPENDENCY=98;
	public static final int KW_DESC=99;
	public static final int KW_DESCRIBE=100;
	public static final int KW_DETAIL=101;
	public static final int KW_DIRECTORIES=102;
	public static final int KW_DIRECTORY=103;
	public static final int KW_DISABLE=104;
	public static final int KW_DISTINCT=105;
	public static final int KW_DISTRIBUTE=106;
	public static final int KW_DO=107;
	public static final int KW_DOUBLE=108;
	public static final int KW_DOW=109;
	public static final int KW_DROP=110;
	public static final int KW_DUMP=111;
	public static final int KW_ELEM_TYPE=112;
	public static final int KW_ELSE=113;
	public static final int KW_ENABLE=114;
	public static final int KW_END=115;
	public static final int KW_ENFORCED=116;
	public static final int KW_ESCAPED=117;
	public static final int KW_EXCEPT=118;
	public static final int KW_EXCHANGE=119;
	public static final int KW_EXCLUSIVE=120;
	public static final int KW_EXISTS=121;
	public static final int KW_EXPLAIN=122;
	public static final int KW_EXPORT=123;
	public static final int KW_EXPRESSION=124;
	public static final int KW_EXTENDED=125;
	public static final int KW_EXTERNAL=126;
	public static final int KW_EXTRACT=127;
	public static final int KW_FALSE=128;
	public static final int KW_FETCH=129;
	public static final int KW_FIELDS=130;
	public static final int KW_FILE=131;
	public static final int KW_FILEFORMAT=132;
	public static final int KW_FIRST=133;
	public static final int KW_FLOAT=134;
	public static final int KW_FLOOR=135;
	public static final int KW_FOLLOWING=136;
	public static final int KW_FOR=137;
	public static final int KW_FORCE=138;
	public static final int KW_FOREIGN=139;
	public static final int KW_FORMAT=140;
	public static final int KW_FORMATTED=141;
	public static final int KW_FROM=142;
	public static final int KW_FULL=143;
	public static final int KW_FUNCTION=144;
	public static final int KW_FUNCTIONS=145;
	public static final int KW_GRANT=146;
	public static final int KW_GROUP=147;
	public static final int KW_GROUPING=148;
	public static final int KW_HAVING=149;
	public static final int KW_HOUR=150;
	public static final int KW_IDXPROPERTIES=151;
	public static final int KW_IF=152;
	public static final int KW_IMPORT=153;
	public static final int KW_IN=154;
	public static final int KW_INDEX=155;
	public static final int KW_INDEXES=156;
	public static final int KW_INNER=157;
	public static final int KW_INPATH=158;
	public static final int KW_INPUTDRIVER=159;
	public static final int KW_INPUTFORMAT=160;
	public static final int KW_INSERT=161;
	public static final int KW_INT=162;
	public static final int KW_INTERSECT=163;
	public static final int KW_INTERVAL=164;
	public static final int KW_INTO=165;
	public static final int KW_IS=166;
	public static final int KW_ISOLATION=167;
	public static final int KW_ITEMS=168;
	public static final int KW_JAR=169;
	public static final int KW_JOIN=170;
	public static final int KW_KEY=171;
	public static final int KW_KEYS=172;
	public static final int KW_KEY_TYPE=173;
	public static final int KW_KILL=174;
	public static final int KW_LAST=175;
	public static final int KW_LATERAL=176;
	public static final int KW_LEFT=177;
	public static final int KW_LESS=178;
	public static final int KW_LEVEL=179;
	public static final int KW_LIKE=180;
	public static final int KW_LIMIT=181;
	public static final int KW_LINES=182;
	public static final int KW_LOAD=183;
	public static final int KW_LOCAL=184;
	public static final int KW_LOCATION=185;
	public static final int KW_LOCK=186;
	public static final int KW_LOCKS=187;
	public static final int KW_LOGICAL=188;
	public static final int KW_LONG=189;
	public static final int KW_MACRO=190;
	public static final int KW_MANAGEMENT=191;
	public static final int KW_MAP=192;
	public static final int KW_MAPJOIN=193;
	public static final int KW_MAPPING=194;
	public static final int KW_MATCHED=195;
	public static final int KW_MATERIALIZED=196;
	public static final int KW_MERGE=197;
	public static final int KW_METADATA=198;
	public static final int KW_MINUS=199;
	public static final int KW_MINUTE=200;
	public static final int KW_MONTH=201;
	public static final int KW_MORE=202;
	public static final int KW_MOVE=203;
	public static final int KW_MSCK=204;
	public static final int KW_NONE=205;
	public static final int KW_NORELY=206;
	public static final int KW_NOSCAN=207;
	public static final int KW_NOT=208;
	public static final int KW_NOVALIDATE=209;
	public static final int KW_NULL=210;
	public static final int KW_NULLS=211;
	public static final int KW_OF=212;
	public static final int KW_OFFSET=213;
	public static final int KW_ON=214;
	public static final int KW_ONLY=215;
	public static final int KW_OPERATOR=216;
	public static final int KW_OPTION=217;
	public static final int KW_OR=218;
	public static final int KW_ORDER=219;
	public static final int KW_OUT=220;
	public static final int KW_OUTER=221;
	public static final int KW_OUTPUTDRIVER=222;
	public static final int KW_OUTPUTFORMAT=223;
	public static final int KW_OVER=224;
	public static final int KW_OVERWRITE=225;
	public static final int KW_OWNER=226;
	public static final int KW_PARTITION=227;
	public static final int KW_PARTITIONED=228;
	public static final int KW_PARTITIONS=229;
	public static final int KW_PATH=230;
	public static final int KW_PERCENT=231;
	public static final int KW_PLAN=232;
	public static final int KW_PLANS=233;
	public static final int KW_PLUS=234;
	public static final int KW_POOL=235;
	public static final int KW_PRECEDING=236;
	public static final int KW_PRECISION=237;
	public static final int KW_PRESERVE=238;
	public static final int KW_PRIMARY=239;
	public static final int KW_PRINCIPALS=240;
	public static final int KW_PROCEDURE=241;
	public static final int KW_PURGE=242;
	public static final int KW_QUARTER=243;
	public static final int KW_QUERY=244;
	public static final int KW_QUERY_PARALLELISM=245;
	public static final int KW_RANGE=246;
	public static final int KW_READ=247;
	public static final int KW_READS=248;
	public static final int KW_REAL=249;
	public static final int KW_REBUILD=250;
	public static final int KW_RECORDREADER=251;
	public static final int KW_RECORDWRITER=252;
	public static final int KW_REDUCE=253;
	public static final int KW_REFERENCES=254;
	public static final int KW_REGEXP=255;
	public static final int KW_RELOAD=256;
	public static final int KW_RELY=257;
	public static final int KW_RENAME=258;
	public static final int KW_REOPTIMIZATION=259;
	public static final int KW_REPAIR=260;
	public static final int KW_REPL=261;
	public static final int KW_REPLACE=262;
	public static final int KW_REPLICATION=263;
	public static final int KW_RESOURCE=264;
	public static final int KW_RESTRICT=265;
	public static final int KW_REVOKE=266;
	public static final int KW_REWRITE=267;
	public static final int KW_RIGHT=268;
	public static final int KW_RLIKE=269;
	public static final int KW_ROLE=270;
	public static final int KW_ROLES=271;
	public static final int KW_ROLLBACK=272;
	public static final int KW_ROLLUP=273;
	public static final int KW_ROW=274;
	public static final int KW_ROWS=275;
	public static final int KW_SCHEDULING_POLICY=276;
	public static final int KW_SCHEMA=277;
	public static final int KW_SCHEMAS=278;
	public static final int KW_SECOND=279;
	public static final int KW_SELECT=280;
	public static final int KW_SEMI=281;
	public static final int KW_SERDE=282;
	public static final int KW_SERDEPROPERTIES=283;
	public static final int KW_SERVER=284;
	public static final int KW_SET=285;
	public static final int KW_SETS=286;
	public static final int KW_SHARED=287;
	public static final int KW_SHOW=288;
	public static final int KW_SHOW_DATABASE=289;
	public static final int KW_SKEWED=290;
	public static final int KW_SMALLINT=291;
	public static final int KW_SNAPSHOT=292;
	public static final int KW_SORT=293;
	public static final int KW_SORTED=294;
	public static final int KW_SSL=295;
	public static final int KW_START=296;
	public static final int KW_STATISTICS=297;
	public static final int KW_STATUS=298;
	public static final int KW_STORED=299;
	public static final int KW_STREAMTABLE=300;
	public static final int KW_STRING=301;
	public static final int KW_STRUCT=302;
	public static final int KW_SUMMARY=303;
	public static final int KW_SYNC=304;
	public static final int KW_TABLE=305;
	public static final int KW_TABLES=306;
	public static final int KW_TABLESAMPLE=307;
	public static final int KW_TBLPROPERTIES=308;
	public static final int KW_TEMPORARY=309;
	public static final int KW_TERMINATED=310;
	public static final int KW_THEN=311;
	public static final int KW_TIME=312;
	public static final int KW_TIMESTAMP=313;
	public static final int KW_TIMESTAMPLOCALTZ=314;
	public static final int KW_TINYINT=315;
	public static final int KW_TO=316;
	public static final int KW_TOUCH=317;
	public static final int KW_TRANSACTION=318;
	public static final int KW_TRANSACTIONAL=319;
	public static final int KW_TRANSACTIONS=320;
	public static final int KW_TRANSFORM=321;
	public static final int KW_TRIGGER=322;
	public static final int KW_TRUE=323;
	public static final int KW_TRUNCATE=324;
	public static final int KW_UNARCHIVE=325;
	public static final int KW_UNBOUNDED=326;
	public static final int KW_UNDO=327;
	public static final int KW_UNION=328;
	public static final int KW_UNIONTYPE=329;
	public static final int KW_UNIQUE=330;
	public static final int KW_UNIQUEJOIN=331;
	public static final int KW_UNKNOWN=332;
	public static final int KW_UNLOCK=333;
	public static final int KW_UNMANAGED=334;
	public static final int KW_UNSET=335;
	public static final int KW_UNSIGNED=336;
	public static final int KW_UPDATE=337;
	public static final int KW_URI=338;
	public static final int KW_USE=339;
	public static final int KW_USER=340;
	public static final int KW_USING=341;
	public static final int KW_UTC=342;
	public static final int KW_UTCTIMESTAMP=343;
	public static final int KW_VALIDATE=344;
	public static final int KW_VALUES=345;
	public static final int KW_VALUE_TYPE=346;
	public static final int KW_VARCHAR=347;
	public static final int KW_VECTORIZATION=348;
	public static final int KW_VIEW=349;
	public static final int KW_VIEWS=350;
	public static final int KW_WAIT=351;
	public static final int KW_WEEK=352;
	public static final int KW_WHEN=353;
	public static final int KW_WHERE=354;
	public static final int KW_WHILE=355;
	public static final int KW_WINDOW=356;
	public static final int KW_WITH=357;
	public static final int KW_WORK=358;
	public static final int KW_WORKLOAD=359;
	public static final int KW_WRITE=360;
	public static final int KW_YEAR=361;
	public static final int KW_ZONE=362;
	public static final int LCURLY=363;
	public static final int LESSTHAN=364;
	public static final int LESSTHANOREQUALTO=365;
	public static final int LINE_COMMENT=366;
	public static final int LPAREN=367;
	public static final int LSQUARE=368;
	public static final int Letter=369;
	public static final int MINUS=370;
	public static final int MOD=371;
	public static final int NOTEQUAL=372;
	public static final int Number=373;
	public static final int NumberLiteral=374;
	public static final int PLUS=375;
	public static final int QUERY_HINT=376;
	public static final int QUESTION=377;
	public static final int QuotedIdentifier=378;
	public static final int RCURLY=379;
	public static final int RPAREN=380;
	public static final int RSQUARE=381;
	public static final int RegexComponent=382;
	public static final int SEMICOLON=383;
	public static final int STAR=384;
	public static final int StringLiteral=385;
	public static final int TILDE=386;
	public static final int WS=387;


	  public static final int COMMENTS = 88;

	  protected boolean allowQuotedId() {
	    return true;
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "HiveLexer.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:35:9: ( 'TRUE' )
			// HiveLexer.g:35:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:36:10: ( 'FALSE' )
			// HiveLexer.g:36:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_UNKNOWN"
	public final void mKW_UNKNOWN() throws RecognitionException {
		try {
			int _type = KW_UNKNOWN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:37:12: ( 'UNKNOWN' )
			// HiveLexer.g:37:14: 'UNKNOWN'
			{
			match("UNKNOWN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNKNOWN"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:38:8: ( 'ALL' )
			// HiveLexer.g:38:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_NONE"
	public final void mKW_NONE() throws RecognitionException {
		try {
			int _type = KW_NONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:39:8: ( 'NONE' )
			// HiveLexer.g:39:10: 'NONE'
			{
			match("NONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NONE"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:40:8: ( 'AND' )
			// HiveLexer.g:40:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:41:7: ( 'OR' )
			// HiveLexer.g:41:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:42:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// HiveLexer.g:42:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// HiveLexer.g:42:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:43:9: ( 'LIKE' )
			// HiveLexer.g:43:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_ANY"
	public final void mKW_ANY() throws RecognitionException {
		try {
			int _type = KW_ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:44:8: ( 'ANY' )
			// HiveLexer.g:44:10: 'ANY'
			{
			match("ANY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANY"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:46:7: ( 'IF' )
			// HiveLexer.g:46:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:47:11: ( 'EXISTS' )
			// HiveLexer.g:47:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:49:8: ( 'ASC' )
			// HiveLexer.g:49:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:50:9: ( 'DESC' )
			// HiveLexer.g:50:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_NULLS"
	public final void mKW_NULLS() throws RecognitionException {
		try {
			int _type = KW_NULLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:51:10: ( 'NULLS' )
			// HiveLexer.g:51:12: 'NULLS'
			{
			match("NULLS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULLS"

	// $ANTLR start "KW_LAST"
	public final void mKW_LAST() throws RecognitionException {
		try {
			int _type = KW_LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:52:9: ( 'LAST' )
			// HiveLexer.g:52:11: 'LAST'
			{
			match("LAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LAST"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:53:10: ( 'ORDER' )
			// HiveLexer.g:53:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:54:10: ( 'GROUP' )
			// HiveLexer.g:54:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:55:7: ( 'BY' )
			// HiveLexer.g:55:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:56:11: ( 'HAVING' )
			// HiveLexer.g:56:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:57:10: ( 'WHERE' )
			// HiveLexer.g:57:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:58:9: ( 'FROM' )
			// HiveLexer.g:58:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:59:7: ( 'AS' )
			// HiveLexer.g:59:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:60:11: ( 'SELECT' )
			// HiveLexer.g:60:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:61:13: ( 'DISTINCT' )
			// HiveLexer.g:61:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:62:11: ( 'INSERT' )
			// HiveLexer.g:62:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:63:14: ( 'OVERWRITE' )
			// HiveLexer.g:63:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:64:10: ( 'OUTER' )
			// HiveLexer.g:64:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:65:15: ( 'UNIQUEJOIN' )
			// HiveLexer.g:65:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:66:13: ( 'PRESERVE' )
			// HiveLexer.g:66:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:67:9: ( 'JOIN' )
			// HiveLexer.g:67:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:68:9: ( 'LEFT' )
			// HiveLexer.g:68:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:69:10: ( 'RIGHT' )
			// HiveLexer.g:69:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:70:9: ( 'FULL' )
			// HiveLexer.g:70:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:71:7: ( 'ON' )
			// HiveLexer.g:71:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:72:14: ( 'PARTITION' )
			// HiveLexer.g:72:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:73:15: ( 'PARTITIONS' )
			// HiveLexer.g:73:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:74:9: ( 'TABLE' )
			// HiveLexer.g:74:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:75:10: ( 'TABLES' )
			// HiveLexer.g:75:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:76:11: ( 'COLUMNS' )
			// HiveLexer.g:76:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:77:9: ( 'INDEX' )
			// HiveLexer.g:77:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:78:11: ( 'INDEXES' )
			// HiveLexer.g:78:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:79:11: ( 'REBUILD' )
			// HiveLexer.g:79:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:80:13: ( 'FUNCTIONS' )
			// HiveLexer.g:80:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:81:8: ( 'SHOW' )
			// HiveLexer.g:81:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:82:8: ( 'MSCK' )
			// HiveLexer.g:82:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:83:10: ( 'REPAIR' )
			// HiveLexer.g:83:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:84:13: ( 'DIRECTORY' )
			// HiveLexer.g:84:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:85:9: ( 'LOCAL' )
			// HiveLexer.g:85:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:86:14: ( 'TRANSFORM' )
			// HiveLexer.g:86:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:87:9: ( 'USING' )
			// HiveLexer.g:87:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:88:11: ( 'CLUSTER' )
			// HiveLexer.g:88:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:89:14: ( 'DISTRIBUTE' )
			// HiveLexer.g:89:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:90:8: ( 'SORT' )
			// HiveLexer.g:90:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:91:9: ( 'UNION' )
			// HiveLexer.g:91:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_EXCEPT"
	public final void mKW_EXCEPT() throws RecognitionException {
		try {
			int _type = KW_EXCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:92:10: ( 'EXCEPT' )
			// HiveLexer.g:92:12: 'EXCEPT'
			{
			match("EXCEPT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCEPT"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:93:8: ( 'LOAD' )
			// HiveLexer.g:93:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:94:10: ( 'EXPORT' )
			// HiveLexer.g:94:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:95:10: ( 'IMPORT' )
			// HiveLexer.g:95:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_REPLICATION"
	public final void mKW_REPLICATION() throws RecognitionException {
		try {
			int _type = KW_REPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:96:15: ( 'REPLICATION' )
			// HiveLexer.g:96:17: 'REPLICATION'
			{
			match("REPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLICATION"

	// $ANTLR start "KW_METADATA"
	public final void mKW_METADATA() throws RecognitionException {
		try {
			int _type = KW_METADATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:97:12: ( 'METADATA' )
			// HiveLexer.g:97:14: 'METADATA'
			{
			match("METADATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_METADATA"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:98:8: ( 'DATA' )
			// HiveLexer.g:98:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:99:10: ( 'INPATH' )
			// HiveLexer.g:99:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:100:6: ( 'IS' )
			// HiveLexer.g:100:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:101:8: ( 'NULL' )
			// HiveLexer.g:101:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:102:10: ( 'CREATE' )
			// HiveLexer.g:102:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:103:12: ( 'EXTERNAL' )
			// HiveLexer.g:103:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:104:9: ( 'ALTER' )
			// HiveLexer.g:104:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:105:10: ( 'CHANGE' )
			// HiveLexer.g:105:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:106:10: ( 'COLUMN' )
			// HiveLexer.g:106:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:107:9: ( 'FIRST' )
			// HiveLexer.g:107:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:108:9: ( 'AFTER' )
			// HiveLexer.g:108:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:109:12: ( 'DESCRIBE' )
			// HiveLexer.g:109:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:110:8: ( 'DROP' )
			// HiveLexer.g:110:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:111:10: ( 'RENAME' )
			// HiveLexer.g:111:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:112:6: ( 'TO' )
			// HiveLexer.g:112:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:113:11: ( 'COMMENT' )
			// HiveLexer.g:113:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:114:11: ( 'BOOLEAN' )
			// HiveLexer.g:114:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:115:11: ( 'TINYINT' )
			// HiveLexer.g:115:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:116:12: ( 'SMALLINT' )
			// HiveLexer.g:116:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:117:7: ( 'INT' | 'INTEGER' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='I') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='N') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='T') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='E') ) {
							alt2=2;
						}

						else {
							alt2=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// HiveLexer.g:117:9: 'INT'
					{
					match("INT"); 

					}
					break;
				case 2 :
					// HiveLexer.g:117:17: 'INTEGER'
					{
					match("INTEGER"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:118:10: ( 'BIGINT' )
			// HiveLexer.g:118:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:119:9: ( 'FLOAT' )
			// HiveLexer.g:119:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_REAL"
	public final void mKW_REAL() throws RecognitionException {
		try {
			int _type = KW_REAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:120:8: ( 'REAL' )
			// HiveLexer.g:120:10: 'REAL'
			{
			match("REAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REAL"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:121:10: ( 'DOUBLE' )
			// HiveLexer.g:121:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_PRECISION"
	public final void mKW_PRECISION() throws RecognitionException {
		try {
			int _type = KW_PRECISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:122:13: ( 'PRECISION' )
			// HiveLexer.g:122:15: 'PRECISION'
			{
			match("PRECISION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECISION"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:123:8: ( 'DATE' )
			// HiveLexer.g:123:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:124:12: ( 'DATETIME' )
			// HiveLexer.g:124:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:125:13: ( 'TIMESTAMP' )
			// HiveLexer.g:125:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_TIMESTAMPLOCALTZ"
	public final void mKW_TIMESTAMPLOCALTZ() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMPLOCALTZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:126:20: ( 'TIMESTAMPLOCALTZ' )
			// HiveLexer.g:126:22: 'TIMESTAMPLOCALTZ'
			{
			match("TIMESTAMPLOCALTZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMPLOCALTZ"

	// $ANTLR start "KW_TIME"
	public final void mKW_TIME() throws RecognitionException {
		try {
			int _type = KW_TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:127:8: ( 'TIME' )
			// HiveLexer.g:127:10: 'TIME'
			{
			match("TIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIME"

	// $ANTLR start "KW_ZONE"
	public final void mKW_ZONE() throws RecognitionException {
		try {
			int _type = KW_ZONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:128:8: ( 'ZONE' )
			// HiveLexer.g:128:10: 'ZONE'
			{
			match("ZONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ZONE"

	// $ANTLR start "KW_INTERVAL"
	public final void mKW_INTERVAL() throws RecognitionException {
		try {
			int _type = KW_INTERVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:129:12: ( 'INTERVAL' )
			// HiveLexer.g:129:14: 'INTERVAL'
			{
			match("INTERVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERVAL"

	// $ANTLR start "KW_DECIMAL"
	public final void mKW_DECIMAL() throws RecognitionException {
		try {
			int _type = KW_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:130:11: ( 'DECIMAL' | 'DEC' | 'NUMERIC' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='D') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='E') ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3=='C') ) {
						int LA3_4 = input.LA(4);
						if ( (LA3_4=='I') ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0=='N') ) {
				alt3=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// HiveLexer.g:130:13: 'DECIMAL'
					{
					match("DECIMAL"); 

					}
					break;
				case 2 :
					// HiveLexer.g:130:25: 'DEC'
					{
					match("DEC"); 

					}
					break;
				case 3 :
					// HiveLexer.g:130:33: 'NUMERIC'
					{
					match("NUMERIC"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DECIMAL"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:131:10: ( 'STRING' )
			// HiveLexer.g:131:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_CHAR"
	public final void mKW_CHAR() throws RecognitionException {
		try {
			int _type = KW_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:132:8: ( 'CHAR' )
			// HiveLexer.g:132:10: 'CHAR'
			{
			match("CHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHAR"

	// $ANTLR start "KW_VARCHAR"
	public final void mKW_VARCHAR() throws RecognitionException {
		try {
			int _type = KW_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:133:11: ( 'VARCHAR' )
			// HiveLexer.g:133:13: 'VARCHAR'
			{
			match("VARCHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VARCHAR"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:134:9: ( 'ARRAY' )
			// HiveLexer.g:134:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:135:10: ( 'STRUCT' )
			// HiveLexer.g:135:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:136:7: ( 'MAP' )
			// HiveLexer.g:136:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:137:13: ( 'UNIONTYPE' )
			// HiveLexer.g:137:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:138:10: ( 'REDUCE' )
			// HiveLexer.g:138:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:139:15: ( 'PARTITIONED' )
			// HiveLexer.g:139:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:140:13: ( 'CLUSTERED' )
			// HiveLexer.g:140:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:141:10: ( 'SORTED' )
			// HiveLexer.g:141:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:142:8: ( 'INTO' )
			// HiveLexer.g:142:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:143:11: ( 'BUCKETS' )
			// HiveLexer.g:143:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:144:7: ( 'ROW' )
			// HiveLexer.g:144:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_ROWS"
	public final void mKW_ROWS() throws RecognitionException {
		try {
			int _type = KW_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:145:8: ( 'ROWS' )
			// HiveLexer.g:145:10: 'ROWS'
			{
			match("ROWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROWS"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:146:10: ( 'FORMAT' )
			// HiveLexer.g:146:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:147:13: ( 'DELIMITED' )
			// HiveLexer.g:147:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:148:10: ( 'FIELDS' )
			// HiveLexer.g:148:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:149:14: ( 'TERMINATED' )
			// HiveLexer.g:149:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:150:11: ( 'ESCAPED' )
			// HiveLexer.g:150:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:151:14: ( 'COLLECTION' )
			// HiveLexer.g:151:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:152:9: ( 'ITEMS' )
			// HiveLexer.g:152:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:153:8: ( 'KEYS' )
			// HiveLexer.g:153:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:154:12: ( '$KEY$' )
			// HiveLexer.g:154:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_KILL"
	public final void mKW_KILL() throws RecognitionException {
		try {
			int _type = KW_KILL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:155:8: ( 'KILL' )
			// HiveLexer.g:155:10: 'KILL'
			{
			match("KILL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KILL"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:156:9: ( 'LINES' )
			// HiveLexer.g:156:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:157:10: ( 'STORED' )
			// HiveLexer.g:157:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:158:14: ( 'FILEFORMAT' )
			// HiveLexer.g:158:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:159:15: ( 'INPUTFORMAT' )
			// HiveLexer.g:159:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:160:16: ( 'OUTPUTFORMAT' )
			// HiveLexer.g:160:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:161:15: ( 'INPUTDRIVER' )
			// HiveLexer.g:161:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:162:16: ( 'OUTPUTDRIVER' )
			// HiveLexer.g:162:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:163:10: ( 'ENABLE' )
			// HiveLexer.g:163:12: 'ENABLE'
			{
			match("ENABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:164:11: ( 'DISABLE' )
			// HiveLexer.g:164:13: 'DISABLE'
			{
			match("DISABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:165:12: ( 'LOCATION' )
			// HiveLexer.g:165:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:166:15: ( 'TABLESAMPLE' )
			// HiveLexer.g:166:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:167:10: ( 'BUCKET' )
			// HiveLexer.g:167:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:168:7: ( 'OUT' )
			// HiveLexer.g:168:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:169:6: ( 'OF' )
			// HiveLexer.g:169:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:170:11: ( 'PERCENT' )
			// HiveLexer.g:170:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:171:8: ( 'CAST' )
			// HiveLexer.g:171:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:172:7: ( 'ADD' )
			// HiveLexer.g:172:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:173:11: ( 'REPLACE' )
			// HiveLexer.g:173:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:174:9: ( 'RLIKE' )
			// HiveLexer.g:174:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:175:10: ( 'REGEXP' )
			// HiveLexer.g:175:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:176:13: ( 'TEMPORARY' )
			// HiveLexer.g:176:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:177:12: ( 'FUNCTION' )
			// HiveLexer.g:177:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_MACRO"
	public final void mKW_MACRO() throws RecognitionException {
		try {
			int _type = KW_MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:178:9: ( 'MACRO' )
			// HiveLexer.g:178:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MACRO"

	// $ANTLR start "KW_FILE"
	public final void mKW_FILE() throws RecognitionException {
		try {
			int _type = KW_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:179:8: ( 'FILE' )
			// HiveLexer.g:179:10: 'FILE'
			{
			match("FILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILE"

	// $ANTLR start "KW_JAR"
	public final void mKW_JAR() throws RecognitionException {
		try {
			int _type = KW_JAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:180:7: ( 'JAR' )
			// HiveLexer.g:180:9: 'JAR'
			{
			match("JAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JAR"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:181:11: ( 'EXPLAIN' )
			// HiveLexer.g:181:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:182:12: ( 'EXTENDED' )
			// HiveLexer.g:182:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_DEBUG"
	public final void mKW_DEBUG() throws RecognitionException {
		try {
			int _type = KW_DEBUG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:183:9: ( 'DEBUG' )
			// HiveLexer.g:183:11: 'DEBUG'
			{
			match("DEBUG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEBUG"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:184:13: ( 'FORMATTED' )
			// HiveLexer.g:184:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_DEPENDENCY"
	public final void mKW_DEPENDENCY() throws RecognitionException {
		try {
			int _type = KW_DEPENDENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:185:14: ( 'DEPENDENCY' )
			// HiveLexer.g:185:16: 'DEPENDENCY'
			{
			match("DEPENDENCY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEPENDENCY"

	// $ANTLR start "KW_LOGICAL"
	public final void mKW_LOGICAL() throws RecognitionException {
		try {
			int _type = KW_LOGICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:186:11: ( 'LOGICAL' )
			// HiveLexer.g:186:13: 'LOGICAL'
			{
			match("LOGICAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOGICAL"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:187:9: ( 'SERDE' )
			// HiveLexer.g:187:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:188:8: ( 'WITH' )
			// HiveLexer.g:188:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:189:12: ( 'DEFERRED' )
			// HiveLexer.g:189:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:190:19: ( 'SERDEPROPERTIES' )
			// HiveLexer.g:190:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:191:16: ( 'DBPROPERTIES' )
			// HiveLexer.g:191:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:192:9: ( 'LIMIT' )
			// HiveLexer.g:192:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_OFFSET"
	public final void mKW_OFFSET() throws RecognitionException {
		try {
			int _type = KW_OFFSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:193:10: ( 'OFFSET' )
			// HiveLexer.g:193:12: 'OFFSET'
			{
			match("OFFSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFSET"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:194:7: ( 'SET' )
			// HiveLexer.g:194:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_UNSET"
	public final void mKW_UNSET() throws RecognitionException {
		try {
			int _type = KW_UNSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:195:9: ( 'UNSET' )
			// HiveLexer.g:195:11: 'UNSET'
			{
			match("UNSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:196:17: ( 'TBLPROPERTIES' )
			// HiveLexer.g:196:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:197:17: ( 'IDXPROPERTIES' )
			// HiveLexer.g:197:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:198:14: ( '$VALUE$' )
			// HiveLexer.g:198:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:199:13: ( '$ELEM$' )
			// HiveLexer.g:199:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_DEFINED"
	public final void mKW_DEFINED() throws RecognitionException {
		try {
			int _type = KW_DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:200:11: ( 'DEFINED' )
			// HiveLexer.g:200:13: 'DEFINED'
			{
			match("DEFINED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFINED"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:201:8: ( 'CASE' )
			// HiveLexer.g:201:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:202:8: ( 'WHEN' )
			// HiveLexer.g:202:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:203:8: ( 'THEN' )
			// HiveLexer.g:203:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:204:8: ( 'ELSE' )
			// HiveLexer.g:204:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:205:7: ( 'END' )
			// HiveLexer.g:205:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:206:11: ( 'MAPJOIN' )
			// HiveLexer.g:206:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:207:15: ( 'STREAMTABLE' )
			// HiveLexer.g:207:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:208:17: ( 'CLUSTERSTATUS' )
			// HiveLexer.g:208:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:209:7: ( 'UTC' )
			// HiveLexer.g:209:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:210:16: ( 'UTC_TMESTAMP' )
			// HiveLexer.g:210:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:211:8: ( 'LONG' )
			// HiveLexer.g:211:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:212:10: ( 'DELETE' )
			// HiveLexer.g:212:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:213:8: ( 'PLUS' )
			// HiveLexer.g:213:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:214:9: ( 'MINUS' )
			// HiveLexer.g:214:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:215:9: ( 'FETCH' )
			// HiveLexer.g:215:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:216:13: ( 'INTERSECT' )
			// HiveLexer.g:216:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:217:8: ( 'VIEW' )
			// HiveLexer.g:217:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_VIEWS"
	public final void mKW_VIEWS() throws RecognitionException {
		try {
			int _type = KW_VIEWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:218:9: ( 'VIEWS' )
			// HiveLexer.g:218:11: 'VIEWS'
			{
			match("VIEWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEWS"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:219:6: ( 'IN' )
			// HiveLexer.g:219:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:220:12: ( 'DATABASE' )
			// HiveLexer.g:220:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:221:13: ( 'DATABASES' )
			// HiveLexer.g:221:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:222:16: ( 'MATERIALIZED' )
			// HiveLexer.g:222:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:223:10: ( 'SCHEMA' )
			// HiveLexer.g:223:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:224:11: ( 'SCHEMAS' )
			// HiveLexer.g:224:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:225:9: ( 'GRANT' )
			// HiveLexer.g:225:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:226:10: ( 'REVOKE' )
			// HiveLexer.g:226:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:227:7: ( 'SSL' )
			// HiveLexer.g:227:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:228:8: ( 'UNDO' )
			// HiveLexer.g:228:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:229:8: ( 'LOCK' )
			// HiveLexer.g:229:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:230:9: ( 'LOCKS' )
			// HiveLexer.g:230:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:231:10: ( 'UNLOCK' )
			// HiveLexer.g:231:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:232:10: ( 'SHARED' )
			// HiveLexer.g:232:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:233:13: ( 'EXCLUSIVE' )
			// HiveLexer.g:233:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:234:13: ( 'PROCEDURE' )
			// HiveLexer.g:234:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:235:12: ( 'UNSIGNED' )
			// HiveLexer.g:235:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:236:9: ( 'WHILE' )
			// HiveLexer.g:236:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:237:8: ( 'READ' )
			// HiveLexer.g:237:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:238:9: ( 'READS' )
			// HiveLexer.g:238:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:239:9: ( 'PURGE' )
			// HiveLexer.g:239:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:240:9: ( 'RANGE' )
			// HiveLexer.g:240:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:241:11: ( 'ANALYZE' )
			// HiveLexer.g:241:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:242:10: ( 'BEFORE' )
			// HiveLexer.g:242:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:243:11: ( 'BETWEEN' )
			// HiveLexer.g:243:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:244:8: ( 'BOTH' )
			// HiveLexer.g:244:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:245:10: ( 'BINARY' )
			// HiveLexer.g:245:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:246:9: ( 'CROSS' )
			// HiveLexer.g:246:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:247:12: ( 'CONTINUE' )
			// HiveLexer.g:247:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:248:10: ( 'CURSOR' )
			// HiveLexer.g:248:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:249:11: ( 'TRIGGER' )
			// HiveLexer.g:249:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:250:16: ( 'RECORDREADER' )
			// HiveLexer.g:250:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:251:16: ( 'RECORDWRITER' )
			// HiveLexer.g:251:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:252:8: ( 'SEMI' )
			// HiveLexer.g:252:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:253:11: ( 'LATERAL' )
			// HiveLexer.g:253:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:254:9: ( 'TOUCH' )
			// HiveLexer.g:254:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:255:11: ( 'ARCHIVE' )
			// HiveLexer.g:255:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:256:13: ( 'UNARCHIVE' )
			// HiveLexer.g:256:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:257:11: ( 'COMPUTE' )
			// HiveLexer.g:257:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:258:14: ( 'STATISTICS' )
			// HiveLexer.g:258:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:259:7: ( 'USE' )
			// HiveLexer.g:259:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:260:10: ( 'OPTION' )
			// HiveLexer.g:260:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:261:15: ( 'CONCATENATE' )
			// HiveLexer.g:261:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:262:17: ( 'SHOW_DATABASE' )
			// HiveLexer.g:262:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:263:10: ( 'UPDATE' )
			// HiveLexer.g:263:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:264:12: ( 'RESTRICT' )
			// HiveLexer.g:264:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:265:11: ( 'CASCADE' )
			// HiveLexer.g:265:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "KW_SKEWED"
	public final void mKW_SKEWED() throws RecognitionException {
		try {
			int _type = KW_SKEWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:266:10: ( 'SKEWED' )
			// HiveLexer.g:266:12: 'SKEWED'
			{
			match("SKEWED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SKEWED"

	// $ANTLR start "KW_ROLLUP"
	public final void mKW_ROLLUP() throws RecognitionException {
		try {
			int _type = KW_ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:267:10: ( 'ROLLUP' )
			// HiveLexer.g:267:12: 'ROLLUP'
			{
			match("ROLLUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLUP"

	// $ANTLR start "KW_CUBE"
	public final void mKW_CUBE() throws RecognitionException {
		try {
			int _type = KW_CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:268:8: ( 'CUBE' )
			// HiveLexer.g:268:10: 'CUBE'
			{
			match("CUBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CUBE"

	// $ANTLR start "KW_DIRECTORIES"
	public final void mKW_DIRECTORIES() throws RecognitionException {
		try {
			int _type = KW_DIRECTORIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:269:15: ( 'DIRECTORIES' )
			// HiveLexer.g:269:17: 'DIRECTORIES'
			{
			match("DIRECTORIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORIES"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:270:7: ( 'FOR' )
			// HiveLexer.g:270:9: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "KW_WINDOW"
	public final void mKW_WINDOW() throws RecognitionException {
		try {
			int _type = KW_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:271:10: ( 'WINDOW' )
			// HiveLexer.g:271:12: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WINDOW"

	// $ANTLR start "KW_UNBOUNDED"
	public final void mKW_UNBOUNDED() throws RecognitionException {
		try {
			int _type = KW_UNBOUNDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:272:13: ( 'UNBOUNDED' )
			// HiveLexer.g:272:15: 'UNBOUNDED'
			{
			match("UNBOUNDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNBOUNDED"

	// $ANTLR start "KW_PRECEDING"
	public final void mKW_PRECEDING() throws RecognitionException {
		try {
			int _type = KW_PRECEDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:273:13: ( 'PRECEDING' )
			// HiveLexer.g:273:15: 'PRECEDING'
			{
			match("PRECEDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECEDING"

	// $ANTLR start "KW_FOLLOWING"
	public final void mKW_FOLLOWING() throws RecognitionException {
		try {
			int _type = KW_FOLLOWING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:274:13: ( 'FOLLOWING' )
			// HiveLexer.g:274:15: 'FOLLOWING'
			{
			match("FOLLOWING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOLLOWING"

	// $ANTLR start "KW_CURRENT"
	public final void mKW_CURRENT() throws RecognitionException {
		try {
			int _type = KW_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:275:11: ( 'CURRENT' )
			// HiveLexer.g:275:13: 'CURRENT'
			{
			match("CURRENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT"

	// $ANTLR start "KW_CURRENT_DATE"
	public final void mKW_CURRENT_DATE() throws RecognitionException {
		try {
			int _type = KW_CURRENT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:276:16: ( 'CURRENT_DATE' )
			// HiveLexer.g:276:18: 'CURRENT_DATE'
			{
			match("CURRENT_DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_DATE"

	// $ANTLR start "KW_CURRENT_TIMESTAMP"
	public final void mKW_CURRENT_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_CURRENT_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:277:21: ( 'CURRENT_TIMESTAMP' )
			// HiveLexer.g:277:23: 'CURRENT_TIMESTAMP'
			{
			match("CURRENT_TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_TIMESTAMP"

	// $ANTLR start "KW_LESS"
	public final void mKW_LESS() throws RecognitionException {
		try {
			int _type = KW_LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:278:8: ( 'LESS' )
			// HiveLexer.g:278:10: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LESS"

	// $ANTLR start "KW_MORE"
	public final void mKW_MORE() throws RecognitionException {
		try {
			int _type = KW_MORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:279:8: ( 'MORE' )
			// HiveLexer.g:279:10: 'MORE'
			{
			match("MORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MORE"

	// $ANTLR start "KW_OVER"
	public final void mKW_OVER() throws RecognitionException {
		try {
			int _type = KW_OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:280:8: ( 'OVER' )
			// HiveLexer.g:280:10: 'OVER'
			{
			match("OVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVER"

	// $ANTLR start "KW_GROUPING"
	public final void mKW_GROUPING() throws RecognitionException {
		try {
			int _type = KW_GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:281:12: ( 'GROUPING' )
			// HiveLexer.g:281:14: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUPING"

	// $ANTLR start "KW_SETS"
	public final void mKW_SETS() throws RecognitionException {
		try {
			int _type = KW_SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:282:8: ( 'SETS' )
			// HiveLexer.g:282:10: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SETS"

	// $ANTLR start "KW_TRUNCATE"
	public final void mKW_TRUNCATE() throws RecognitionException {
		try {
			int _type = KW_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:283:12: ( 'TRUNCATE' )
			// HiveLexer.g:283:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUNCATE"

	// $ANTLR start "KW_NOSCAN"
	public final void mKW_NOSCAN() throws RecognitionException {
		try {
			int _type = KW_NOSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:284:10: ( 'NOSCAN' )
			// HiveLexer.g:284:12: 'NOSCAN'
			{
			match("NOSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOSCAN"

	// $ANTLR start "KW_USER"
	public final void mKW_USER() throws RecognitionException {
		try {
			int _type = KW_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:285:8: ( 'USER' )
			// HiveLexer.g:285:10: 'USER'
			{
			match("USER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USER"

	// $ANTLR start "KW_ROLE"
	public final void mKW_ROLE() throws RecognitionException {
		try {
			int _type = KW_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:286:8: ( 'ROLE' )
			// HiveLexer.g:286:10: 'ROLE'
			{
			match("ROLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLE"

	// $ANTLR start "KW_ROLES"
	public final void mKW_ROLES() throws RecognitionException {
		try {
			int _type = KW_ROLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:287:9: ( 'ROLES' )
			// HiveLexer.g:287:11: 'ROLES'
			{
			match("ROLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLES"

	// $ANTLR start "KW_INNER"
	public final void mKW_INNER() throws RecognitionException {
		try {
			int _type = KW_INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:288:9: ( 'INNER' )
			// HiveLexer.g:288:11: 'INNER'
			{
			match("INNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INNER"

	// $ANTLR start "KW_EXCHANGE"
	public final void mKW_EXCHANGE() throws RecognitionException {
		try {
			int _type = KW_EXCHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:289:12: ( 'EXCHANGE' )
			// HiveLexer.g:289:14: 'EXCHANGE'
			{
			match("EXCHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCHANGE"

	// $ANTLR start "KW_URI"
	public final void mKW_URI() throws RecognitionException {
		try {
			int _type = KW_URI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:290:7: ( 'URI' )
			// HiveLexer.g:290:9: 'URI'
			{
			match("URI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_URI"

	// $ANTLR start "KW_SERVER"
	public final void mKW_SERVER() throws RecognitionException {
		try {
			int _type = KW_SERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:291:11: ( 'SERVER' )
			// HiveLexer.g:291:13: 'SERVER'
			{
			match("SERVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERVER"

	// $ANTLR start "KW_ADMIN"
	public final void mKW_ADMIN() throws RecognitionException {
		try {
			int _type = KW_ADMIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:292:9: ( 'ADMIN' )
			// HiveLexer.g:292:11: 'ADMIN'
			{
			match("ADMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADMIN"

	// $ANTLR start "KW_OWNER"
	public final void mKW_OWNER() throws RecognitionException {
		try {
			int _type = KW_OWNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:293:9: ( 'OWNER' )
			// HiveLexer.g:293:11: 'OWNER'
			{
			match("OWNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OWNER"

	// $ANTLR start "KW_PRINCIPALS"
	public final void mKW_PRINCIPALS() throws RecognitionException {
		try {
			int _type = KW_PRINCIPALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:294:14: ( 'PRINCIPALS' )
			// HiveLexer.g:294:16: 'PRINCIPALS'
			{
			match("PRINCIPALS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRINCIPALS"

	// $ANTLR start "KW_COMPACT"
	public final void mKW_COMPACT() throws RecognitionException {
		try {
			int _type = KW_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:295:11: ( 'COMPACT' )
			// HiveLexer.g:295:13: 'COMPACT'
			{
			match("COMPACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACT"

	// $ANTLR start "KW_COMPACTIONS"
	public final void mKW_COMPACTIONS() throws RecognitionException {
		try {
			int _type = KW_COMPACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:296:15: ( 'COMPACTIONS' )
			// HiveLexer.g:296:17: 'COMPACTIONS'
			{
			match("COMPACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACTIONS"

	// $ANTLR start "KW_TRANSACTIONS"
	public final void mKW_TRANSACTIONS() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:297:16: ( 'TRANSACTIONS' )
			// HiveLexer.g:297:18: 'TRANSACTIONS'
			{
			match("TRANSACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONS"

	// $ANTLR start "KW_TRANSACTIONAL"
	public final void mKW_TRANSACTIONAL() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:298:17: ( 'TRANSACTIONAL' )
			// HiveLexer.g:298:19: 'TRANSACTIONAL'
			{
			match("TRANSACTIONAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONAL"

	// $ANTLR start "KW_REWRITE"
	public final void mKW_REWRITE() throws RecognitionException {
		try {
			int _type = KW_REWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:299:12: ( 'REWRITE' )
			// HiveLexer.g:299:14: 'REWRITE'
			{
			match("REWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REWRITE"

	// $ANTLR start "KW_AUTHORIZATION"
	public final void mKW_AUTHORIZATION() throws RecognitionException {
		try {
			int _type = KW_AUTHORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:300:17: ( 'AUTHORIZATION' )
			// HiveLexer.g:300:19: 'AUTHORIZATION'
			{
			match("AUTHORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTHORIZATION"

	// $ANTLR start "KW_REOPTIMIZATION"
	public final void mKW_REOPTIMIZATION() throws RecognitionException {
		try {
			int _type = KW_REOPTIMIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:301:18: ( 'REOPTIMIZATION' )
			// HiveLexer.g:301:20: 'REOPTIMIZATION'
			{
			match("REOPTIMIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REOPTIMIZATION"

	// $ANTLR start "KW_CONF"
	public final void mKW_CONF() throws RecognitionException {
		try {
			int _type = KW_CONF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:302:8: ( 'CONF' )
			// HiveLexer.g:302:10: 'CONF'
			{
			match("CONF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONF"

	// $ANTLR start "KW_VALUES"
	public final void mKW_VALUES() throws RecognitionException {
		try {
			int _type = KW_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:303:10: ( 'VALUES' )
			// HiveLexer.g:303:12: 'VALUES'
			{
			match("VALUES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUES"

	// $ANTLR start "KW_RELOAD"
	public final void mKW_RELOAD() throws RecognitionException {
		try {
			int _type = KW_RELOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:304:10: ( 'RELOAD' )
			// HiveLexer.g:304:12: 'RELOAD'
			{
			match("RELOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELOAD"

	// $ANTLR start "KW_YEAR"
	public final void mKW_YEAR() throws RecognitionException {
		try {
			int _type = KW_YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:305:8: ( 'YEAR' | 'YEARS' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='Y') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='E') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='A') ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3=='R') ) {
							int LA4_4 = input.LA(5);
							if ( (LA4_4=='S') ) {
								alt4=2;
							}

							else {
								alt4=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// HiveLexer.g:305:10: 'YEAR'
					{
					match("YEAR"); 

					}
					break;
				case 2 :
					// HiveLexer.g:305:19: 'YEARS'
					{
					match("YEARS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_YEAR"

	// $ANTLR start "KW_QUERY"
	public final void mKW_QUERY() throws RecognitionException {
		try {
			int _type = KW_QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:306:9: ( 'QUERY' )
			// HiveLexer.g:306:11: 'QUERY'
			{
			match("QUERY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY"

	// $ANTLR start "KW_QUARTER"
	public final void mKW_QUARTER() throws RecognitionException {
		try {
			int _type = KW_QUARTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:307:11: ( 'QUARTER' )
			// HiveLexer.g:307:13: 'QUARTER'
			{
			match("QUARTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUARTER"

	// $ANTLR start "KW_MONTH"
	public final void mKW_MONTH() throws RecognitionException {
		try {
			int _type = KW_MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:308:9: ( 'MONTH' | 'MONTHS' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='M') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='O') ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2=='N') ) {
						int LA5_3 = input.LA(4);
						if ( (LA5_3=='T') ) {
							int LA5_4 = input.LA(5);
							if ( (LA5_4=='H') ) {
								int LA5_5 = input.LA(6);
								if ( (LA5_5=='S') ) {
									alt5=2;
								}

								else {
									alt5=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// HiveLexer.g:308:11: 'MONTH'
					{
					match("MONTH"); 

					}
					break;
				case 2 :
					// HiveLexer.g:308:21: 'MONTHS'
					{
					match("MONTHS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MONTH"

	// $ANTLR start "KW_WEEK"
	public final void mKW_WEEK() throws RecognitionException {
		try {
			int _type = KW_WEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:309:8: ( 'WEEK' | 'WEEKS' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='W') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='E') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='E') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='K') ) {
							int LA6_4 = input.LA(5);
							if ( (LA6_4=='S') ) {
								alt6=2;
							}

							else {
								alt6=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// HiveLexer.g:309:10: 'WEEK'
					{
					match("WEEK"); 

					}
					break;
				case 2 :
					// HiveLexer.g:309:19: 'WEEKS'
					{
					match("WEEKS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WEEK"

	// $ANTLR start "KW_DAY"
	public final void mKW_DAY() throws RecognitionException {
		try {
			int _type = KW_DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:310:7: ( 'DAY' | 'DAYS' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='D') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='A') ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2=='Y') ) {
						int LA7_3 = input.LA(4);
						if ( (LA7_3=='S') ) {
							alt7=2;
						}

						else {
							alt7=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// HiveLexer.g:310:9: 'DAY'
					{
					match("DAY"); 

					}
					break;
				case 2 :
					// HiveLexer.g:310:17: 'DAYS'
					{
					match("DAYS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DAY"

	// $ANTLR start "KW_DOW"
	public final void mKW_DOW() throws RecognitionException {
		try {
			int _type = KW_DOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:311:7: ( 'DAYOFWEEK' )
			// HiveLexer.g:311:9: 'DAYOFWEEK'
			{
			match("DAYOFWEEK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOW"

	// $ANTLR start "KW_HOUR"
	public final void mKW_HOUR() throws RecognitionException {
		try {
			int _type = KW_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:312:8: ( 'HOUR' | 'HOURS' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='H') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='O') ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2=='U') ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3=='R') ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4=='S') ) {
								alt8=2;
							}

							else {
								alt8=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// HiveLexer.g:312:10: 'HOUR'
					{
					match("HOUR"); 

					}
					break;
				case 2 :
					// HiveLexer.g:312:19: 'HOURS'
					{
					match("HOURS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOUR"

	// $ANTLR start "KW_MINUTE"
	public final void mKW_MINUTE() throws RecognitionException {
		try {
			int _type = KW_MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:313:10: ( 'MINUTE' | 'MINUTES' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='M') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='I') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='N') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='U') ) {
							int LA9_4 = input.LA(5);
							if ( (LA9_4=='T') ) {
								int LA9_5 = input.LA(6);
								if ( (LA9_5=='E') ) {
									int LA9_6 = input.LA(7);
									if ( (LA9_6=='S') ) {
										alt9=2;
									}

									else {
										alt9=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 9, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 9, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 9, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// HiveLexer.g:313:12: 'MINUTE'
					{
					match("MINUTE"); 

					}
					break;
				case 2 :
					// HiveLexer.g:313:23: 'MINUTES'
					{
					match("MINUTES"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUTE"

	// $ANTLR start "KW_SECOND"
	public final void mKW_SECOND() throws RecognitionException {
		try {
			int _type = KW_SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:314:10: ( 'SECOND' | 'SECONDS' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='S') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='E') ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2=='C') ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3=='O') ) {
							int LA10_4 = input.LA(5);
							if ( (LA10_4=='N') ) {
								int LA10_5 = input.LA(6);
								if ( (LA10_5=='D') ) {
									int LA10_6 = input.LA(7);
									if ( (LA10_6=='S') ) {
										alt10=2;
									}

									else {
										alt10=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 10, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 10, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// HiveLexer.g:314:12: 'SECOND'
					{
					match("SECOND"); 

					}
					break;
				case 2 :
					// HiveLexer.g:314:23: 'SECONDS'
					{
					match("SECONDS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SECOND"

	// $ANTLR start "KW_START"
	public final void mKW_START() throws RecognitionException {
		try {
			int _type = KW_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:315:9: ( 'START' )
			// HiveLexer.g:315:11: 'START'
			{
			match("START"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_START"

	// $ANTLR start "KW_TRANSACTION"
	public final void mKW_TRANSACTION() throws RecognitionException {
		try {
			int _type = KW_TRANSACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:316:15: ( 'TRANSACTION' )
			// HiveLexer.g:316:17: 'TRANSACTION'
			{
			match("TRANSACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTION"

	// $ANTLR start "KW_COMMIT"
	public final void mKW_COMMIT() throws RecognitionException {
		try {
			int _type = KW_COMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:317:10: ( 'COMMIT' )
			// HiveLexer.g:317:12: 'COMMIT'
			{
			match("COMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMIT"

	// $ANTLR start "KW_ROLLBACK"
	public final void mKW_ROLLBACK() throws RecognitionException {
		try {
			int _type = KW_ROLLBACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:318:12: ( 'ROLLBACK' )
			// HiveLexer.g:318:14: 'ROLLBACK'
			{
			match("ROLLBACK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLBACK"

	// $ANTLR start "KW_WORK"
	public final void mKW_WORK() throws RecognitionException {
		try {
			int _type = KW_WORK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:319:8: ( 'WORK' )
			// HiveLexer.g:319:10: 'WORK'
			{
			match("WORK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORK"

	// $ANTLR start "KW_ONLY"
	public final void mKW_ONLY() throws RecognitionException {
		try {
			int _type = KW_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:320:8: ( 'ONLY' )
			// HiveLexer.g:320:10: 'ONLY'
			{
			match("ONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ONLY"

	// $ANTLR start "KW_WRITE"
	public final void mKW_WRITE() throws RecognitionException {
		try {
			int _type = KW_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:321:9: ( 'WRITE' )
			// HiveLexer.g:321:11: 'WRITE'
			{
			match("WRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WRITE"

	// $ANTLR start "KW_ISOLATION"
	public final void mKW_ISOLATION() throws RecognitionException {
		try {
			int _type = KW_ISOLATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:322:13: ( 'ISOLATION' )
			// HiveLexer.g:322:15: 'ISOLATION'
			{
			match("ISOLATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ISOLATION"

	// $ANTLR start "KW_LEVEL"
	public final void mKW_LEVEL() throws RecognitionException {
		try {
			int _type = KW_LEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:323:9: ( 'LEVEL' )
			// HiveLexer.g:323:11: 'LEVEL'
			{
			match("LEVEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEVEL"

	// $ANTLR start "KW_SNAPSHOT"
	public final void mKW_SNAPSHOT() throws RecognitionException {
		try {
			int _type = KW_SNAPSHOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:324:12: ( 'SNAPSHOT' )
			// HiveLexer.g:324:14: 'SNAPSHOT'
			{
			match("SNAPSHOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SNAPSHOT"

	// $ANTLR start "KW_AUTOCOMMIT"
	public final void mKW_AUTOCOMMIT() throws RecognitionException {
		try {
			int _type = KW_AUTOCOMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:325:14: ( 'AUTOCOMMIT' )
			// HiveLexer.g:325:16: 'AUTOCOMMIT'
			{
			match("AUTOCOMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTOCOMMIT"

	// $ANTLR start "KW_CACHE"
	public final void mKW_CACHE() throws RecognitionException {
		try {
			int _type = KW_CACHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:326:9: ( 'CACHE' )
			// HiveLexer.g:326:11: 'CACHE'
			{
			match("CACHE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CACHE"

	// $ANTLR start "KW_PRIMARY"
	public final void mKW_PRIMARY() throws RecognitionException {
		try {
			int _type = KW_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:327:11: ( 'PRIMARY' )
			// HiveLexer.g:327:13: 'PRIMARY'
			{
			match("PRIMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRIMARY"

	// $ANTLR start "KW_FOREIGN"
	public final void mKW_FOREIGN() throws RecognitionException {
		try {
			int _type = KW_FOREIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:328:11: ( 'FOREIGN' )
			// HiveLexer.g:328:13: 'FOREIGN'
			{
			match("FOREIGN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOREIGN"

	// $ANTLR start "KW_REFERENCES"
	public final void mKW_REFERENCES() throws RecognitionException {
		try {
			int _type = KW_REFERENCES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:329:14: ( 'REFERENCES' )
			// HiveLexer.g:329:16: 'REFERENCES'
			{
			match("REFERENCES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REFERENCES"

	// $ANTLR start "KW_CONSTRAINT"
	public final void mKW_CONSTRAINT() throws RecognitionException {
		try {
			int _type = KW_CONSTRAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:330:14: ( 'CONSTRAINT' )
			// HiveLexer.g:330:16: 'CONSTRAINT'
			{
			match("CONSTRAINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONSTRAINT"

	// $ANTLR start "KW_FORCE"
	public final void mKW_FORCE() throws RecognitionException {
		try {
			int _type = KW_FORCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:331:9: ( 'FORCE' )
			// HiveLexer.g:331:11: 'FORCE'
			{
			match("FORCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORCE"

	// $ANTLR start "KW_ENFORCED"
	public final void mKW_ENFORCED() throws RecognitionException {
		try {
			int _type = KW_ENFORCED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:332:12: ( 'ENFORCED' )
			// HiveLexer.g:332:14: 'ENFORCED'
			{
			match("ENFORCED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENFORCED"

	// $ANTLR start "KW_VALIDATE"
	public final void mKW_VALIDATE() throws RecognitionException {
		try {
			int _type = KW_VALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:333:12: ( 'VALIDATE' )
			// HiveLexer.g:333:14: 'VALIDATE'
			{
			match("VALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALIDATE"

	// $ANTLR start "KW_NOVALIDATE"
	public final void mKW_NOVALIDATE() throws RecognitionException {
		try {
			int _type = KW_NOVALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:334:14: ( 'NOVALIDATE' )
			// HiveLexer.g:334:16: 'NOVALIDATE'
			{
			match("NOVALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOVALIDATE"

	// $ANTLR start "KW_RELY"
	public final void mKW_RELY() throws RecognitionException {
		try {
			int _type = KW_RELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:335:8: ( 'RELY' )
			// HiveLexer.g:335:10: 'RELY'
			{
			match("RELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELY"

	// $ANTLR start "KW_NORELY"
	public final void mKW_NORELY() throws RecognitionException {
		try {
			int _type = KW_NORELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:336:10: ( 'NORELY' )
			// HiveLexer.g:336:12: 'NORELY'
			{
			match("NORELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NORELY"

	// $ANTLR start "KW_UNIQUE"
	public final void mKW_UNIQUE() throws RecognitionException {
		try {
			int _type = KW_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:337:10: ( 'UNIQUE' )
			// HiveLexer.g:337:12: 'UNIQUE'
			{
			match("UNIQUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUE"

	// $ANTLR start "KW_KEY"
	public final void mKW_KEY() throws RecognitionException {
		try {
			int _type = KW_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:338:7: ( 'KEY' )
			// HiveLexer.g:338:9: 'KEY'
			{
			match("KEY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY"

	// $ANTLR start "KW_ABORT"
	public final void mKW_ABORT() throws RecognitionException {
		try {
			int _type = KW_ABORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:339:9: ( 'ABORT' )
			// HiveLexer.g:339:11: 'ABORT'
			{
			match("ABORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ABORT"

	// $ANTLR start "KW_EXTRACT"
	public final void mKW_EXTRACT() throws RecognitionException {
		try {
			int _type = KW_EXTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:340:11: ( 'EXTRACT' )
			// HiveLexer.g:340:13: 'EXTRACT'
			{
			match("EXTRACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTRACT"

	// $ANTLR start "KW_FLOOR"
	public final void mKW_FLOOR() throws RecognitionException {
		try {
			int _type = KW_FLOOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:341:9: ( 'FLOOR' )
			// HiveLexer.g:341:11: 'FLOOR'
			{
			match("FLOOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOOR"

	// $ANTLR start "KW_MERGE"
	public final void mKW_MERGE() throws RecognitionException {
		try {
			int _type = KW_MERGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:342:9: ( 'MERGE' )
			// HiveLexer.g:342:11: 'MERGE'
			{
			match("MERGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MERGE"

	// $ANTLR start "KW_MATCHED"
	public final void mKW_MATCHED() throws RecognitionException {
		try {
			int _type = KW_MATCHED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:343:11: ( 'MATCHED' )
			// HiveLexer.g:343:13: 'MATCHED'
			{
			match("MATCHED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATCHED"

	// $ANTLR start "KW_REPL"
	public final void mKW_REPL() throws RecognitionException {
		try {
			int _type = KW_REPL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:344:8: ( 'REPL' )
			// HiveLexer.g:344:10: 'REPL'
			{
			match("REPL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPL"

	// $ANTLR start "KW_DUMP"
	public final void mKW_DUMP() throws RecognitionException {
		try {
			int _type = KW_DUMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:345:8: ( 'DUMP' )
			// HiveLexer.g:345:10: 'DUMP'
			{
			match("DUMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DUMP"

	// $ANTLR start "KW_STATUS"
	public final void mKW_STATUS() throws RecognitionException {
		try {
			int _type = KW_STATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:346:10: ( 'STATUS' )
			// HiveLexer.g:346:12: 'STATUS'
			{
			match("STATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATUS"

	// $ANTLR start "KW_VECTORIZATION"
	public final void mKW_VECTORIZATION() throws RecognitionException {
		try {
			int _type = KW_VECTORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:347:17: ( 'VECTORIZATION' )
			// HiveLexer.g:347:19: 'VECTORIZATION'
			{
			match("VECTORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VECTORIZATION"

	// $ANTLR start "KW_SUMMARY"
	public final void mKW_SUMMARY() throws RecognitionException {
		try {
			int _type = KW_SUMMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:348:11: ( 'SUMMARY' )
			// HiveLexer.g:348:13: 'SUMMARY'
			{
			match("SUMMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SUMMARY"

	// $ANTLR start "KW_OPERATOR"
	public final void mKW_OPERATOR() throws RecognitionException {
		try {
			int _type = KW_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:349:12: ( 'OPERATOR' )
			// HiveLexer.g:349:14: 'OPERATOR'
			{
			match("OPERATOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPERATOR"

	// $ANTLR start "KW_EXPRESSION"
	public final void mKW_EXPRESSION() throws RecognitionException {
		try {
			int _type = KW_EXPRESSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:350:14: ( 'EXPRESSION' )
			// HiveLexer.g:350:16: 'EXPRESSION'
			{
			match("EXPRESSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPRESSION"

	// $ANTLR start "KW_DETAIL"
	public final void mKW_DETAIL() throws RecognitionException {
		try {
			int _type = KW_DETAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:351:10: ( 'DETAIL' )
			// HiveLexer.g:351:12: 'DETAIL'
			{
			match("DETAIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DETAIL"

	// $ANTLR start "KW_WAIT"
	public final void mKW_WAIT() throws RecognitionException {
		try {
			int _type = KW_WAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:352:8: ( 'WAIT' )
			// HiveLexer.g:352:10: 'WAIT'
			{
			match("WAIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WAIT"

	// $ANTLR start "KW_RESOURCE"
	public final void mKW_RESOURCE() throws RecognitionException {
		try {
			int _type = KW_RESOURCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:353:12: ( 'RESOURCE' )
			// HiveLexer.g:353:14: 'RESOURCE'
			{
			match("RESOURCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESOURCE"

	// $ANTLR start "KW_PLAN"
	public final void mKW_PLAN() throws RecognitionException {
		try {
			int _type = KW_PLAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:354:8: ( 'PLAN' )
			// HiveLexer.g:354:10: 'PLAN'
			{
			match("PLAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLAN"

	// $ANTLR start "KW_QUERY_PARALLELISM"
	public final void mKW_QUERY_PARALLELISM() throws RecognitionException {
		try {
			int _type = KW_QUERY_PARALLELISM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:355:21: ( 'QUERY_PARALLELISM' )
			// HiveLexer.g:355:23: 'QUERY_PARALLELISM'
			{
			match("QUERY_PARALLELISM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY_PARALLELISM"

	// $ANTLR start "KW_PLANS"
	public final void mKW_PLANS() throws RecognitionException {
		try {
			int _type = KW_PLANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:356:9: ( 'PLANS' )
			// HiveLexer.g:356:11: 'PLANS'
			{
			match("PLANS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLANS"

	// $ANTLR start "KW_ACTIVATE"
	public final void mKW_ACTIVATE() throws RecognitionException {
		try {
			int _type = KW_ACTIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:357:12: ( 'ACTIVATE' )
			// HiveLexer.g:357:14: 'ACTIVATE'
			{
			match("ACTIVATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVATE"

	// $ANTLR start "KW_DEFAULT"
	public final void mKW_DEFAULT() throws RecognitionException {
		try {
			int _type = KW_DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:358:11: ( 'DEFAULT' )
			// HiveLexer.g:358:13: 'DEFAULT'
			{
			match("DEFAULT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFAULT"

	// $ANTLR start "KW_CHECK"
	public final void mKW_CHECK() throws RecognitionException {
		try {
			int _type = KW_CHECK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:359:9: ( 'CHECK' )
			// HiveLexer.g:359:11: 'CHECK'
			{
			match("CHECK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHECK"

	// $ANTLR start "KW_POOL"
	public final void mKW_POOL() throws RecognitionException {
		try {
			int _type = KW_POOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:360:8: ( 'POOL' )
			// HiveLexer.g:360:10: 'POOL'
			{
			match("POOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_POOL"

	// $ANTLR start "KW_MOVE"
	public final void mKW_MOVE() throws RecognitionException {
		try {
			int _type = KW_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:361:8: ( 'MOVE' )
			// HiveLexer.g:361:10: 'MOVE'
			{
			match("MOVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MOVE"

	// $ANTLR start "KW_DO"
	public final void mKW_DO() throws RecognitionException {
		try {
			int _type = KW_DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:362:6: ( 'DO' )
			// HiveLexer.g:362:8: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DO"

	// $ANTLR start "KW_ALLOC_FRACTION"
	public final void mKW_ALLOC_FRACTION() throws RecognitionException {
		try {
			int _type = KW_ALLOC_FRACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:363:18: ( 'ALLOC_FRACTION' )
			// HiveLexer.g:363:20: 'ALLOC_FRACTION'
			{
			match("ALLOC_FRACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALLOC_FRACTION"

	// $ANTLR start "KW_SCHEDULING_POLICY"
	public final void mKW_SCHEDULING_POLICY() throws RecognitionException {
		try {
			int _type = KW_SCHEDULING_POLICY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:364:21: ( 'SCHEDULING_POLICY' )
			// HiveLexer.g:364:23: 'SCHEDULING_POLICY'
			{
			match("SCHEDULING_POLICY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEDULING_POLICY"

	// $ANTLR start "KW_PATH"
	public final void mKW_PATH() throws RecognitionException {
		try {
			int _type = KW_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:365:8: ( 'PATH' )
			// HiveLexer.g:365:10: 'PATH'
			{
			match("PATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PATH"

	// $ANTLR start "KW_MAPPING"
	public final void mKW_MAPPING() throws RecognitionException {
		try {
			int _type = KW_MAPPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:366:11: ( 'MAPPING' )
			// HiveLexer.g:366:13: 'MAPPING'
			{
			match("MAPPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPPING"

	// $ANTLR start "KW_WORKLOAD"
	public final void mKW_WORKLOAD() throws RecognitionException {
		try {
			int _type = KW_WORKLOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:367:12: ( 'WORKLOAD' )
			// HiveLexer.g:367:14: 'WORKLOAD'
			{
			match("WORKLOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORKLOAD"

	// $ANTLR start "KW_MANAGEMENT"
	public final void mKW_MANAGEMENT() throws RecognitionException {
		try {
			int _type = KW_MANAGEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:368:14: ( 'MANAGEMENT' )
			// HiveLexer.g:368:16: 'MANAGEMENT'
			{
			match("MANAGEMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MANAGEMENT"

	// $ANTLR start "KW_ACTIVE"
	public final void mKW_ACTIVE() throws RecognitionException {
		try {
			int _type = KW_ACTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:369:10: ( 'ACTIVE' )
			// HiveLexer.g:369:12: 'ACTIVE'
			{
			match("ACTIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVE"

	// $ANTLR start "KW_UNMANAGED"
	public final void mKW_UNMANAGED() throws RecognitionException {
		try {
			int _type = KW_UNMANAGED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:370:13: ( 'UNMANAGED' )
			// HiveLexer.g:370:15: 'UNMANAGED'
			{
			match("UNMANAGED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNMANAGED"

	// $ANTLR start "KW_APPLICATION"
	public final void mKW_APPLICATION() throws RecognitionException {
		try {
			int _type = KW_APPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:371:15: ( 'APPLICATION' )
			// HiveLexer.g:371:17: 'APPLICATION'
			{
			match("APPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_APPLICATION"

	// $ANTLR start "KW_SYNC"
	public final void mKW_SYNC() throws RecognitionException {
		try {
			int _type = KW_SYNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:372:8: ( 'SYNC' )
			// HiveLexer.g:372:10: 'SYNC'
			{
			match("SYNC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SYNC"

	// $ANTLR start "KW_AST"
	public final void mKW_AST() throws RecognitionException {
		try {
			int _type = KW_AST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:373:7: ( 'AST' )
			// HiveLexer.g:373:9: 'AST'
			{
			match("AST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AST"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:378:5: ( '.' )
			// HiveLexer.g:378:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:379:7: ( ':' )
			// HiveLexer.g:379:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:380:7: ( ',' )
			// HiveLexer.g:380:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:381:11: ( ';' )
			// HiveLexer.g:381:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:383:8: ( '(' )
			// HiveLexer.g:383:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:384:8: ( ')' )
			// HiveLexer.g:384:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:385:9: ( '[' )
			// HiveLexer.g:385:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:386:9: ( ']' )
			// HiveLexer.g:386:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:387:8: ( '{' )
			// HiveLexer.g:387:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:388:8: ( '}' )
			// HiveLexer.g:388:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:390:7: ( '=' | '==' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='=') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='=') ) {
					alt11=2;
				}

				else {
					alt11=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// HiveLexer.g:390:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// HiveLexer.g:390:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUAL_NS"
	public final void mEQUAL_NS() throws RecognitionException {
		try {
			int _type = EQUAL_NS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:391:10: ( '<=>' )
			// HiveLexer.g:391:12: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_NS"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:392:10: ( '<>' | '!=' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='<') ) {
				alt12=1;
			}
			else if ( (LA12_0=='!') ) {
				alt12=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// HiveLexer.g:392:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// HiveLexer.g:392:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:393:19: ( '<=' )
			// HiveLexer.g:393:21: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:394:10: ( '<' )
			// HiveLexer.g:394:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:395:22: ( '>=' )
			// HiveLexer.g:395:24: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:396:13: ( '>' )
			// HiveLexer.g:396:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:398:8: ( '/' )
			// HiveLexer.g:398:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:399:6: ( '+' )
			// HiveLexer.g:399:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:400:7: ( '-' )
			// HiveLexer.g:400:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:401:6: ( '*' )
			// HiveLexer.g:401:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:402:5: ( '%' )
			// HiveLexer.g:402:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:403:5: ( 'DIV' )
			// HiveLexer.g:403:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:405:11: ( '&' )
			// HiveLexer.g:405:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:406:7: ( '~' )
			// HiveLexer.g:406:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:407:11: ( '|' )
			// HiveLexer.g:407:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "CONCATENATE"
	public final void mCONCATENATE() throws RecognitionException {
		try {
			int _type = CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:408:13: ( '||' )
			// HiveLexer.g:408:15: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONCATENATE"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:409:12: ( '^' )
			// HiveLexer.g:409:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:410:10: ( '?' )
			// HiveLexer.g:410:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:411:8: ( '$' )
			// HiveLexer.g:411:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// HiveLexer.g:416:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// HiveLexer.g:421:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// HiveLexer.g:426:5: ( '0' .. '9' )
			// HiveLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// HiveLexer.g:432:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// HiveLexer.g:433:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// HiveLexer.g:433:17: ( PLUS | MINUS )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='+'||LA13_0=='-') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// HiveLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// HiveLexer.g:433:33: ( Digit )+
			int cnt14=0;
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( ((LA14_0 >= '0' && LA14_0 <= '9')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt14 >= 1 ) break loop14;
					EarlyExitException eee = new EarlyExitException(14, input);
					throw eee;
				}
				cnt14++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// HiveLexer.g:438:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR | '!' )
			// HiveLexer.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:445:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// HiveLexer.g:446:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// HiveLexer.g:446:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt17=0;
			loop17:
			while (true) {
				int alt17=3;
				int LA17_0 = input.LA(1);
				if ( (LA17_0=='\'') ) {
					alt17=1;
				}
				else if ( (LA17_0=='\"') ) {
					alt17=2;
				}

				switch (alt17) {
				case 1 :
					// HiveLexer.g:446:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// HiveLexer.g:446:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop15:
					while (true) {
						int alt15=3;
						int LA15_0 = input.LA(1);
						if ( ((LA15_0 >= '\u0000' && LA15_0 <= '&')||(LA15_0 >= '(' && LA15_0 <= '[')||(LA15_0 >= ']' && LA15_0 <= '\uFFFF')) ) {
							alt15=1;
						}
						else if ( (LA15_0=='\\') ) {
							alt15=2;
						}

						switch (alt15) {
						case 1 :
							// HiveLexer.g:446:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// HiveLexer.g:446:29: ( '\\\\' . )
							{
							// HiveLexer.g:446:29: ( '\\\\' . )
							// HiveLexer.g:446:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop15;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// HiveLexer.g:447:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// HiveLexer.g:447:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop16:
					while (true) {
						int alt16=3;
						int LA16_0 = input.LA(1);
						if ( ((LA16_0 >= '\u0000' && LA16_0 <= '!')||(LA16_0 >= '#' && LA16_0 <= '[')||(LA16_0 >= ']' && LA16_0 <= '\uFFFF')) ) {
							alt16=1;
						}
						else if ( (LA16_0=='\\') ) {
							alt16=2;
						}

						switch (alt16) {
						case 1 :
							// HiveLexer.g:447:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// HiveLexer.g:447:29: ( '\\\\' . )
							{
							// HiveLexer.g:447:29: ( '\\\\' . )
							// HiveLexer.g:447:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop16;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt17 >= 1 ) break loop17;
					EarlyExitException eee = new EarlyExitException(17, input);
					throw eee;
				}
				cnt17++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:452:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt19=2;
			int LA19_0 = input.LA(1);
			if ( (LA19_0=='\"'||LA19_0=='\'') ) {
				alt19=1;
			}
			else if ( (LA19_0=='0') ) {
				alt19=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}

			switch (alt19) {
				case 1 :
					// HiveLexer.g:453:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// HiveLexer.g:454:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// HiveLexer.g:454:15: ( HexDigit | Digit )+
					int cnt18=0;
					loop18:
					while (true) {
						int alt18=2;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '0' && LA18_0 <= '9')||(LA18_0 >= 'A' && LA18_0 <= 'F')||(LA18_0 >= 'a' && LA18_0 <= 'f')) ) {
							alt18=1;
						}

						switch (alt18) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt18 >= 1 ) break loop18;
							EarlyExitException eee = new EarlyExitException(18, input);
							throw eee;
						}
						cnt18++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "IntegralLiteral"
	public final void mIntegralLiteral() throws RecognitionException {
		try {
			int _type = IntegralLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:458:5: ( ( Digit )+ ( 'L' | 'S' | 'Y' ) )
			// HiveLexer.g:459:5: ( Digit )+ ( 'L' | 'S' | 'Y' )
			{
			// HiveLexer.g:459:5: ( Digit )+
			int cnt20=0;
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( ((LA20_0 >= '0' && LA20_0 <= '9')) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt20 >= 1 ) break loop20;
					EarlyExitException eee = new EarlyExitException(20, input);
					throw eee;
				}
				cnt20++;
			}

			if ( input.LA(1)=='L'||input.LA(1)=='S'||input.LA(1)=='Y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegralLiteral"

	// $ANTLR start "NumberLiteral"
	public final void mNumberLiteral() throws RecognitionException {
		try {
			int _type = NumberLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:463:5: ( Number ( 'D' | 'B' 'D' ) )
			// HiveLexer.g:464:5: Number ( 'D' | 'B' 'D' )
			{
			mNumber(); 

			// HiveLexer.g:464:12: ( 'D' | 'B' 'D' )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='D') ) {
				alt21=1;
			}
			else if ( (LA21_0=='B') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// HiveLexer.g:464:13: 'D'
					{
					match('D'); 
					}
					break;
				case 2 :
					// HiveLexer.g:464:19: 'B' 'D'
					{
					match('B'); 
					match('D'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NumberLiteral"

	// $ANTLR start "ByteLengthLiteral"
	public final void mByteLengthLiteral() throws RecognitionException {
		try {
			int _type = ByteLengthLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:468:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// HiveLexer.g:469:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// HiveLexer.g:469:5: ( Digit )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ByteLengthLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:473:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// HiveLexer.g:474:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// HiveLexer.g:474:5: ( Digit )+
			int cnt23=0;
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt23 >= 1 ) break loop23;
					EarlyExitException eee = new EarlyExitException(23, input);
					throw eee;
				}
				cnt23++;
			}

			// HiveLexer.g:474:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt26=3;
			int LA26_0 = input.LA(1);
			if ( (LA26_0=='.') ) {
				alt26=1;
			}
			else if ( (LA26_0=='E'||LA26_0=='e') ) {
				alt26=2;
			}
			switch (alt26) {
				case 1 :
					// HiveLexer.g:474:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// HiveLexer.g:474:20: ( Digit )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop24;
						}
					}

					// HiveLexer.g:474:29: ( Exponent )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0=='E'||LA25_0=='e') ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// HiveLexer.g:474:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// HiveLexer.g:474:43: Exponent
					{
					mExponent(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:500:5: (| ( Letter | Digit ) ( Letter | Digit | '_' | ':' )* | DOLLAR LCURLY ( Letter | Digit | '_' | ':' )* RCURLY |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
			int alt30=5;
			alt30 = dfa30.predict(input);
			switch (alt30) {
				case 1 :
					// HiveLexer.g:501:5: 
					{
					}
					break;
				case 2 :
					// HiveLexer.g:501:7: ( Letter | Digit ) ( Letter | Digit | '_' | ':' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// HiveLexer.g:501:24: ( Letter | Digit | '_' | ':' )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( ((LA27_0 >= '0' && LA27_0 <= ':')||(LA27_0 >= 'A' && LA27_0 <= 'Z')||LA27_0=='_'||(LA27_0 >= 'a' && LA27_0 <= 'z')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop27;
						}
					}

					}
					break;
				case 3 :
					// HiveLexer.g:502:7: DOLLAR LCURLY ( Letter | Digit | '_' | ':' )* RCURLY
					{
					mDOLLAR(); 

					mLCURLY(); 

					// HiveLexer.g:502:21: ( Letter | Digit | '_' | ':' )*
					loop28:
					while (true) {
						int alt28=2;
						int LA28_0 = input.LA(1);
						if ( ((LA28_0 >= '0' && LA28_0 <= ':')||(LA28_0 >= 'A' && LA28_0 <= 'Z')||LA28_0=='_'||(LA28_0 >= 'a' && LA28_0 <= 'z')) ) {
							alt28=1;
						}

						switch (alt28) {
						case 1 :
							// HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop28;
						}
					}

					mRCURLY(); 

					}
					break;
				case 4 :
					// HiveLexer.g:503:7: {...}? QuotedIdentifier
					{
					if ( !((allowQuotedId())) ) {
						throw new FailedPredicateException(input, "Identifier", "allowQuotedId()");
					}
					mQuotedIdentifier(); 

					}
					break;
				case 5 :
					// HiveLexer.g:505:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// HiveLexer.g:505:11: ( RegexComponent )+
					int cnt29=0;
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( (LA29_0=='!'||LA29_0=='$'||(LA29_0 >= '(' && LA29_0 <= '+')||(LA29_0 >= '-' && LA29_0 <= '.')||(LA29_0 >= '0' && LA29_0 <= '9')||LA29_0=='?'||(LA29_0 >= 'A' && LA29_0 <= '[')||(LA29_0 >= ']' && LA29_0 <= '_')||(LA29_0 >= 'a' && LA29_0 <= '}')) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// HiveLexer.g:
							{
							if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt29 >= 1 ) break loop29;
							EarlyExitException eee = new EarlyExitException(29, input);
							throw eee;
						}
						cnt29++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "QuotedIdentifier"
	public final void mQuotedIdentifier() throws RecognitionException {
		try {
			// HiveLexer.g:511:5: ( '`' ( '``' |~ ( '`' ) )* '`' )
			// HiveLexer.g:512:5: '`' ( '``' |~ ( '`' ) )* '`'
			{
			match('`'); 
			// HiveLexer.g:512:10: ( '``' |~ ( '`' ) )*
			loop31:
			while (true) {
				int alt31=3;
				int LA31_0 = input.LA(1);
				if ( (LA31_0=='`') ) {
					int LA31_1 = input.LA(2);
					if ( (LA31_1=='`') ) {
						alt31=1;
					}

				}
				else if ( ((LA31_0 >= '\u0000' && LA31_0 <= '_')||(LA31_0 >= 'a' && LA31_0 <= '\uFFFF')) ) {
					alt31=2;
				}

				switch (alt31) {
				case 1 :
					// HiveLexer.g:512:12: '``'
					{
					match("``"); 

					}
					break;
				case 2 :
					// HiveLexer.g:512:19: ~ ( '`' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop31;
				}
			}

			match('`'); 
			 setText(getText().substring(1, getText().length() -1 ).replaceAll("``", "`")); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuotedIdentifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:516:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// HiveLexer.g:517:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// HiveLexer.g:517:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt32=0;
			loop32:
			while (true) {
				int alt32=2;
				int LA32_0 = input.LA(1);
				if ( ((LA32_0 >= '-' && LA32_0 <= '.')||(LA32_0 >= '0' && LA32_0 <= ':')||(LA32_0 >= 'A' && LA32_0 <= 'Z')||LA32_0=='_'||(LA32_0 >= 'a' && LA32_0 <= 'z')) ) {
					alt32=1;
				}

				switch (alt32) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt32 >= 1 ) break loop32;
					EarlyExitException eee = new EarlyExitException(32, input);
					throw eee;
				}
				cnt32++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:520:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// HiveLexer.g:520:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:524:5: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// HiveLexer.g:524:7: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// HiveLexer.g:524:12: (~ ( '\\n' | '\\r' ) )*
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( ((LA33_0 >= '\u0000' && LA33_0 <= '\t')||(LA33_0 >= '\u000B' && LA33_0 <= '\f')||(LA33_0 >= '\u000E' && LA33_0 <= '\uFFFF')) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// HiveLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop33;
				}
			}

			_channel=88;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "QUERY_HINT"
	public final void mQUERY_HINT() throws RecognitionException {
		try {
			int _type = QUERY_HINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// HiveLexer.g:528:5: ( '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/' )
			// HiveLexer.g:528:7: '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/'
			{
			match("/*"); 

			// HiveLexer.g:528:12: ( options {greedy=false; } : QUERY_HINT | . )*
			loop34:
			while (true) {
				int alt34=3;
				int LA34_0 = input.LA(1);
				if ( (LA34_0=='*') ) {
					int LA34_1 = input.LA(2);
					if ( (LA34_1=='/') ) {
						alt34=3;
					}
					else if ( ((LA34_1 >= '\u0000' && LA34_1 <= '.')||(LA34_1 >= '0' && LA34_1 <= '\uFFFF')) ) {
						alt34=2;
					}

				}
				else if ( (LA34_0=='/') ) {
					int LA34_2 = input.LA(2);
					if ( (LA34_2=='*') ) {
						alt34=1;
					}
					else if ( ((LA34_2 >= '\u0000' && LA34_2 <= ')')||(LA34_2 >= '+' && LA34_2 <= '\uFFFF')) ) {
						alt34=2;
					}

				}
				else if ( ((LA34_0 >= '\u0000' && LA34_0 <= ')')||(LA34_0 >= '+' && LA34_0 <= '.')||(LA34_0 >= '0' && LA34_0 <= '\uFFFF')) ) {
					alt34=2;
				}

				switch (alt34) {
				case 1 :
					// HiveLexer.g:528:41: QUERY_HINT
					{
					mQUERY_HINT(); 

					}
					break;
				case 2 :
					// HiveLexer.g:528:52: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop34;
				}
			}

			match("*/"); 

			 if(getText().charAt(2) != '+') { _channel=HIDDEN; } else { setText(getText().substring(3, getText().length() - 2)); } 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY_HINT"

	@Override
	public void mTokens() throws RecognitionException {
		// HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_REAL | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_AST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT )
		int alt35=378;
		alt35 = dfa35.predict(input);
		switch (alt35) {
			case 1 :
				// HiveLexer.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// HiveLexer.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// HiveLexer.g:1:27: KW_UNKNOWN
				{
				mKW_UNKNOWN(); 

				}
				break;
			case 4 :
				// HiveLexer.g:1:38: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 5 :
				// HiveLexer.g:1:45: KW_NONE
				{
				mKW_NONE(); 

				}
				break;
			case 6 :
				// HiveLexer.g:1:53: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 7 :
				// HiveLexer.g:1:60: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 8 :
				// HiveLexer.g:1:66: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 9 :
				// HiveLexer.g:1:73: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 10 :
				// HiveLexer.g:1:81: KW_ANY
				{
				mKW_ANY(); 

				}
				break;
			case 11 :
				// HiveLexer.g:1:88: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 12 :
				// HiveLexer.g:1:94: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 13 :
				// HiveLexer.g:1:104: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 14 :
				// HiveLexer.g:1:111: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 15 :
				// HiveLexer.g:1:119: KW_NULLS
				{
				mKW_NULLS(); 

				}
				break;
			case 16 :
				// HiveLexer.g:1:128: KW_LAST
				{
				mKW_LAST(); 

				}
				break;
			case 17 :
				// HiveLexer.g:1:136: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 18 :
				// HiveLexer.g:1:145: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 19 :
				// HiveLexer.g:1:154: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 20 :
				// HiveLexer.g:1:160: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 21 :
				// HiveLexer.g:1:170: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 22 :
				// HiveLexer.g:1:179: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 23 :
				// HiveLexer.g:1:187: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 24 :
				// HiveLexer.g:1:193: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 25 :
				// HiveLexer.g:1:203: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 26 :
				// HiveLexer.g:1:215: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 27 :
				// HiveLexer.g:1:225: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 28 :
				// HiveLexer.g:1:238: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 29 :
				// HiveLexer.g:1:247: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 30 :
				// HiveLexer.g:1:261: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 31 :
				// HiveLexer.g:1:273: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 32 :
				// HiveLexer.g:1:281: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 33 :
				// HiveLexer.g:1:289: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 34 :
				// HiveLexer.g:1:298: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 35 :
				// HiveLexer.g:1:306: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 36 :
				// HiveLexer.g:1:312: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 37 :
				// HiveLexer.g:1:325: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 38 :
				// HiveLexer.g:1:339: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 39 :
				// HiveLexer.g:1:348: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 40 :
				// HiveLexer.g:1:358: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 41 :
				// HiveLexer.g:1:369: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 42 :
				// HiveLexer.g:1:378: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 43 :
				// HiveLexer.g:1:389: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 44 :
				// HiveLexer.g:1:400: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 45 :
				// HiveLexer.g:1:413: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 46 :
				// HiveLexer.g:1:421: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 47 :
				// HiveLexer.g:1:429: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 48 :
				// HiveLexer.g:1:439: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 49 :
				// HiveLexer.g:1:452: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 50 :
				// HiveLexer.g:1:461: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 51 :
				// HiveLexer.g:1:474: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 52 :
				// HiveLexer.g:1:483: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 53 :
				// HiveLexer.g:1:494: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 54 :
				// HiveLexer.g:1:508: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 55 :
				// HiveLexer.g:1:516: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 56 :
				// HiveLexer.g:1:525: KW_EXCEPT
				{
				mKW_EXCEPT(); 

				}
				break;
			case 57 :
				// HiveLexer.g:1:535: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 58 :
				// HiveLexer.g:1:543: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 59 :
				// HiveLexer.g:1:553: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 60 :
				// HiveLexer.g:1:563: KW_REPLICATION
				{
				mKW_REPLICATION(); 

				}
				break;
			case 61 :
				// HiveLexer.g:1:578: KW_METADATA
				{
				mKW_METADATA(); 

				}
				break;
			case 62 :
				// HiveLexer.g:1:590: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 63 :
				// HiveLexer.g:1:598: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 64 :
				// HiveLexer.g:1:608: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 65 :
				// HiveLexer.g:1:614: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 66 :
				// HiveLexer.g:1:622: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 67 :
				// HiveLexer.g:1:632: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 68 :
				// HiveLexer.g:1:644: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 69 :
				// HiveLexer.g:1:653: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 70 :
				// HiveLexer.g:1:663: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 71 :
				// HiveLexer.g:1:673: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 72 :
				// HiveLexer.g:1:682: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 73 :
				// HiveLexer.g:1:691: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 74 :
				// HiveLexer.g:1:703: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 75 :
				// HiveLexer.g:1:711: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 76 :
				// HiveLexer.g:1:721: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 77 :
				// HiveLexer.g:1:727: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 78 :
				// HiveLexer.g:1:738: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 79 :
				// HiveLexer.g:1:749: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 80 :
				// HiveLexer.g:1:760: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 81 :
				// HiveLexer.g:1:772: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 82 :
				// HiveLexer.g:1:779: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 83 :
				// HiveLexer.g:1:789: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 84 :
				// HiveLexer.g:1:798: KW_REAL
				{
				mKW_REAL(); 

				}
				break;
			case 85 :
				// HiveLexer.g:1:806: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 86 :
				// HiveLexer.g:1:816: KW_PRECISION
				{
				mKW_PRECISION(); 

				}
				break;
			case 87 :
				// HiveLexer.g:1:829: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 88 :
				// HiveLexer.g:1:837: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 89 :
				// HiveLexer.g:1:849: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 90 :
				// HiveLexer.g:1:862: KW_TIMESTAMPLOCALTZ
				{
				mKW_TIMESTAMPLOCALTZ(); 

				}
				break;
			case 91 :
				// HiveLexer.g:1:882: KW_TIME
				{
				mKW_TIME(); 

				}
				break;
			case 92 :
				// HiveLexer.g:1:890: KW_ZONE
				{
				mKW_ZONE(); 

				}
				break;
			case 93 :
				// HiveLexer.g:1:898: KW_INTERVAL
				{
				mKW_INTERVAL(); 

				}
				break;
			case 94 :
				// HiveLexer.g:1:910: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 95 :
				// HiveLexer.g:1:921: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 96 :
				// HiveLexer.g:1:931: KW_CHAR
				{
				mKW_CHAR(); 

				}
				break;
			case 97 :
				// HiveLexer.g:1:939: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 98 :
				// HiveLexer.g:1:950: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 99 :
				// HiveLexer.g:1:959: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 100 :
				// HiveLexer.g:1:969: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 101 :
				// HiveLexer.g:1:976: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 102 :
				// HiveLexer.g:1:989: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 103 :
				// HiveLexer.g:1:999: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 104 :
				// HiveLexer.g:1:1014: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 105 :
				// HiveLexer.g:1:1027: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 106 :
				// HiveLexer.g:1:1037: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 107 :
				// HiveLexer.g:1:1045: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 108 :
				// HiveLexer.g:1:1056: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 109 :
				// HiveLexer.g:1:1063: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 110 :
				// HiveLexer.g:1:1071: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 111 :
				// HiveLexer.g:1:1081: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 112 :
				// HiveLexer.g:1:1094: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 113 :
				// HiveLexer.g:1:1104: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 114 :
				// HiveLexer.g:1:1118: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 115 :
				// HiveLexer.g:1:1129: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 116 :
				// HiveLexer.g:1:1143: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 117 :
				// HiveLexer.g:1:1152: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 118 :
				// HiveLexer.g:1:1160: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 119 :
				// HiveLexer.g:1:1172: KW_KILL
				{
				mKW_KILL(); 

				}
				break;
			case 120 :
				// HiveLexer.g:1:1180: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 121 :
				// HiveLexer.g:1:1189: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 122 :
				// HiveLexer.g:1:1199: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 123 :
				// HiveLexer.g:1:1213: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 124 :
				// HiveLexer.g:1:1228: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 125 :
				// HiveLexer.g:1:1244: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 126 :
				// HiveLexer.g:1:1259: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 127 :
				// HiveLexer.g:1:1275: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 128 :
				// HiveLexer.g:1:1285: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 129 :
				// HiveLexer.g:1:1296: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 130 :
				// HiveLexer.g:1:1308: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 131 :
				// HiveLexer.g:1:1323: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 132 :
				// HiveLexer.g:1:1333: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 133 :
				// HiveLexer.g:1:1340: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 134 :
				// HiveLexer.g:1:1346: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 135 :
				// HiveLexer.g:1:1357: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 136 :
				// HiveLexer.g:1:1365: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 137 :
				// HiveLexer.g:1:1372: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 138 :
				// HiveLexer.g:1:1383: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 139 :
				// HiveLexer.g:1:1392: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 140 :
				// HiveLexer.g:1:1402: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 141 :
				// HiveLexer.g:1:1415: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 142 :
				// HiveLexer.g:1:1427: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 143 :
				// HiveLexer.g:1:1436: KW_FILE
				{
				mKW_FILE(); 

				}
				break;
			case 144 :
				// HiveLexer.g:1:1444: KW_JAR
				{
				mKW_JAR(); 

				}
				break;
			case 145 :
				// HiveLexer.g:1:1451: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 146 :
				// HiveLexer.g:1:1462: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 147 :
				// HiveLexer.g:1:1474: KW_DEBUG
				{
				mKW_DEBUG(); 

				}
				break;
			case 148 :
				// HiveLexer.g:1:1483: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 149 :
				// HiveLexer.g:1:1496: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 150 :
				// HiveLexer.g:1:1510: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 151 :
				// HiveLexer.g:1:1521: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 152 :
				// HiveLexer.g:1:1530: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 153 :
				// HiveLexer.g:1:1538: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 154 :
				// HiveLexer.g:1:1550: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 155 :
				// HiveLexer.g:1:1569: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 156 :
				// HiveLexer.g:1:1585: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 157 :
				// HiveLexer.g:1:1594: KW_OFFSET
				{
				mKW_OFFSET(); 

				}
				break;
			case 158 :
				// HiveLexer.g:1:1604: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 159 :
				// HiveLexer.g:1:1611: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 160 :
				// HiveLexer.g:1:1620: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 161 :
				// HiveLexer.g:1:1637: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 162 :
				// HiveLexer.g:1:1654: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 163 :
				// HiveLexer.g:1:1668: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 164 :
				// HiveLexer.g:1:1681: KW_DEFINED
				{
				mKW_DEFINED(); 

				}
				break;
			case 165 :
				// HiveLexer.g:1:1692: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 166 :
				// HiveLexer.g:1:1700: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 167 :
				// HiveLexer.g:1:1708: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 168 :
				// HiveLexer.g:1:1716: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 169 :
				// HiveLexer.g:1:1724: KW_END
				{
				mKW_END(); 

				}
				break;
			case 170 :
				// HiveLexer.g:1:1731: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 171 :
				// HiveLexer.g:1:1742: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 172 :
				// HiveLexer.g:1:1757: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 173 :
				// HiveLexer.g:1:1774: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 174 :
				// HiveLexer.g:1:1781: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 175 :
				// HiveLexer.g:1:1797: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 176 :
				// HiveLexer.g:1:1805: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 177 :
				// HiveLexer.g:1:1815: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 178 :
				// HiveLexer.g:1:1823: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 179 :
				// HiveLexer.g:1:1832: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 180 :
				// HiveLexer.g:1:1841: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 181 :
				// HiveLexer.g:1:1854: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 182 :
				// HiveLexer.g:1:1862: KW_VIEWS
				{
				mKW_VIEWS(); 

				}
				break;
			case 183 :
				// HiveLexer.g:1:1871: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 184 :
				// HiveLexer.g:1:1877: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 185 :
				// HiveLexer.g:1:1889: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 186 :
				// HiveLexer.g:1:1902: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 187 :
				// HiveLexer.g:1:1918: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 188 :
				// HiveLexer.g:1:1928: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 189 :
				// HiveLexer.g:1:1939: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 190 :
				// HiveLexer.g:1:1948: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 191 :
				// HiveLexer.g:1:1958: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 192 :
				// HiveLexer.g:1:1965: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 193 :
				// HiveLexer.g:1:1973: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 194 :
				// HiveLexer.g:1:1981: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 195 :
				// HiveLexer.g:1:1990: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 196 :
				// HiveLexer.g:1:2000: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 197 :
				// HiveLexer.g:1:2010: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 198 :
				// HiveLexer.g:1:2023: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 199 :
				// HiveLexer.g:1:2036: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 200 :
				// HiveLexer.g:1:2048: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 201 :
				// HiveLexer.g:1:2057: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 202 :
				// HiveLexer.g:1:2065: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 203 :
				// HiveLexer.g:1:2074: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 204 :
				// HiveLexer.g:1:2083: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 205 :
				// HiveLexer.g:1:2092: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 206 :
				// HiveLexer.g:1:2103: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 207 :
				// HiveLexer.g:1:2113: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 208 :
				// HiveLexer.g:1:2124: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 209 :
				// HiveLexer.g:1:2132: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 210 :
				// HiveLexer.g:1:2142: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 211 :
				// HiveLexer.g:1:2151: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 212 :
				// HiveLexer.g:1:2163: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 213 :
				// HiveLexer.g:1:2173: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 214 :
				// HiveLexer.g:1:2184: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 215 :
				// HiveLexer.g:1:2200: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 216 :
				// HiveLexer.g:1:2216: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 217 :
				// HiveLexer.g:1:2224: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 218 :
				// HiveLexer.g:1:2235: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 219 :
				// HiveLexer.g:1:2244: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 220 :
				// HiveLexer.g:1:2255: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 221 :
				// HiveLexer.g:1:2268: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 222 :
				// HiveLexer.g:1:2279: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 223 :
				// HiveLexer.g:1:2293: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 224 :
				// HiveLexer.g:1:2300: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 225 :
				// HiveLexer.g:1:2310: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 226 :
				// HiveLexer.g:1:2325: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 227 :
				// HiveLexer.g:1:2342: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 228 :
				// HiveLexer.g:1:2352: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 229 :
				// HiveLexer.g:1:2364: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 230 :
				// HiveLexer.g:1:2375: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 231 :
				// HiveLexer.g:1:2385: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 232 :
				// HiveLexer.g:1:2395: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 233 :
				// HiveLexer.g:1:2403: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 234 :
				// HiveLexer.g:1:2418: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 235 :
				// HiveLexer.g:1:2425: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 236 :
				// HiveLexer.g:1:2435: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 237 :
				// HiveLexer.g:1:2448: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 238 :
				// HiveLexer.g:1:2461: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 239 :
				// HiveLexer.g:1:2474: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 240 :
				// HiveLexer.g:1:2485: KW_CURRENT_DATE
				{
				mKW_CURRENT_DATE(); 

				}
				break;
			case 241 :
				// HiveLexer.g:1:2501: KW_CURRENT_TIMESTAMP
				{
				mKW_CURRENT_TIMESTAMP(); 

				}
				break;
			case 242 :
				// HiveLexer.g:1:2522: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 243 :
				// HiveLexer.g:1:2530: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 244 :
				// HiveLexer.g:1:2538: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 245 :
				// HiveLexer.g:1:2546: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 246 :
				// HiveLexer.g:1:2558: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 247 :
				// HiveLexer.g:1:2566: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 248 :
				// HiveLexer.g:1:2578: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 249 :
				// HiveLexer.g:1:2588: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 250 :
				// HiveLexer.g:1:2596: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 251 :
				// HiveLexer.g:1:2604: KW_ROLES
				{
				mKW_ROLES(); 

				}
				break;
			case 252 :
				// HiveLexer.g:1:2613: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 253 :
				// HiveLexer.g:1:2622: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 254 :
				// HiveLexer.g:1:2634: KW_URI
				{
				mKW_URI(); 

				}
				break;
			case 255 :
				// HiveLexer.g:1:2641: KW_SERVER
				{
				mKW_SERVER(); 

				}
				break;
			case 256 :
				// HiveLexer.g:1:2651: KW_ADMIN
				{
				mKW_ADMIN(); 

				}
				break;
			case 257 :
				// HiveLexer.g:1:2660: KW_OWNER
				{
				mKW_OWNER(); 

				}
				break;
			case 258 :
				// HiveLexer.g:1:2669: KW_PRINCIPALS
				{
				mKW_PRINCIPALS(); 

				}
				break;
			case 259 :
				// HiveLexer.g:1:2683: KW_COMPACT
				{
				mKW_COMPACT(); 

				}
				break;
			case 260 :
				// HiveLexer.g:1:2694: KW_COMPACTIONS
				{
				mKW_COMPACTIONS(); 

				}
				break;
			case 261 :
				// HiveLexer.g:1:2709: KW_TRANSACTIONS
				{
				mKW_TRANSACTIONS(); 

				}
				break;
			case 262 :
				// HiveLexer.g:1:2725: KW_TRANSACTIONAL
				{
				mKW_TRANSACTIONAL(); 

				}
				break;
			case 263 :
				// HiveLexer.g:1:2742: KW_REWRITE
				{
				mKW_REWRITE(); 

				}
				break;
			case 264 :
				// HiveLexer.g:1:2753: KW_AUTHORIZATION
				{
				mKW_AUTHORIZATION(); 

				}
				break;
			case 265 :
				// HiveLexer.g:1:2770: KW_REOPTIMIZATION
				{
				mKW_REOPTIMIZATION(); 

				}
				break;
			case 266 :
				// HiveLexer.g:1:2788: KW_CONF
				{
				mKW_CONF(); 

				}
				break;
			case 267 :
				// HiveLexer.g:1:2796: KW_VALUES
				{
				mKW_VALUES(); 

				}
				break;
			case 268 :
				// HiveLexer.g:1:2806: KW_RELOAD
				{
				mKW_RELOAD(); 

				}
				break;
			case 269 :
				// HiveLexer.g:1:2816: KW_YEAR
				{
				mKW_YEAR(); 

				}
				break;
			case 270 :
				// HiveLexer.g:1:2824: KW_QUERY
				{
				mKW_QUERY(); 

				}
				break;
			case 271 :
				// HiveLexer.g:1:2833: KW_QUARTER
				{
				mKW_QUARTER(); 

				}
				break;
			case 272 :
				// HiveLexer.g:1:2844: KW_MONTH
				{
				mKW_MONTH(); 

				}
				break;
			case 273 :
				// HiveLexer.g:1:2853: KW_WEEK
				{
				mKW_WEEK(); 

				}
				break;
			case 274 :
				// HiveLexer.g:1:2861: KW_DAY
				{
				mKW_DAY(); 

				}
				break;
			case 275 :
				// HiveLexer.g:1:2868: KW_DOW
				{
				mKW_DOW(); 

				}
				break;
			case 276 :
				// HiveLexer.g:1:2875: KW_HOUR
				{
				mKW_HOUR(); 

				}
				break;
			case 277 :
				// HiveLexer.g:1:2883: KW_MINUTE
				{
				mKW_MINUTE(); 

				}
				break;
			case 278 :
				// HiveLexer.g:1:2893: KW_SECOND
				{
				mKW_SECOND(); 

				}
				break;
			case 279 :
				// HiveLexer.g:1:2903: KW_START
				{
				mKW_START(); 

				}
				break;
			case 280 :
				// HiveLexer.g:1:2912: KW_TRANSACTION
				{
				mKW_TRANSACTION(); 

				}
				break;
			case 281 :
				// HiveLexer.g:1:2927: KW_COMMIT
				{
				mKW_COMMIT(); 

				}
				break;
			case 282 :
				// HiveLexer.g:1:2937: KW_ROLLBACK
				{
				mKW_ROLLBACK(); 

				}
				break;
			case 283 :
				// HiveLexer.g:1:2949: KW_WORK
				{
				mKW_WORK(); 

				}
				break;
			case 284 :
				// HiveLexer.g:1:2957: KW_ONLY
				{
				mKW_ONLY(); 

				}
				break;
			case 285 :
				// HiveLexer.g:1:2965: KW_WRITE
				{
				mKW_WRITE(); 

				}
				break;
			case 286 :
				// HiveLexer.g:1:2974: KW_ISOLATION
				{
				mKW_ISOLATION(); 

				}
				break;
			case 287 :
				// HiveLexer.g:1:2987: KW_LEVEL
				{
				mKW_LEVEL(); 

				}
				break;
			case 288 :
				// HiveLexer.g:1:2996: KW_SNAPSHOT
				{
				mKW_SNAPSHOT(); 

				}
				break;
			case 289 :
				// HiveLexer.g:1:3008: KW_AUTOCOMMIT
				{
				mKW_AUTOCOMMIT(); 

				}
				break;
			case 290 :
				// HiveLexer.g:1:3022: KW_CACHE
				{
				mKW_CACHE(); 

				}
				break;
			case 291 :
				// HiveLexer.g:1:3031: KW_PRIMARY
				{
				mKW_PRIMARY(); 

				}
				break;
			case 292 :
				// HiveLexer.g:1:3042: KW_FOREIGN
				{
				mKW_FOREIGN(); 

				}
				break;
			case 293 :
				// HiveLexer.g:1:3053: KW_REFERENCES
				{
				mKW_REFERENCES(); 

				}
				break;
			case 294 :
				// HiveLexer.g:1:3067: KW_CONSTRAINT
				{
				mKW_CONSTRAINT(); 

				}
				break;
			case 295 :
				// HiveLexer.g:1:3081: KW_FORCE
				{
				mKW_FORCE(); 

				}
				break;
			case 296 :
				// HiveLexer.g:1:3090: KW_ENFORCED
				{
				mKW_ENFORCED(); 

				}
				break;
			case 297 :
				// HiveLexer.g:1:3102: KW_VALIDATE
				{
				mKW_VALIDATE(); 

				}
				break;
			case 298 :
				// HiveLexer.g:1:3114: KW_NOVALIDATE
				{
				mKW_NOVALIDATE(); 

				}
				break;
			case 299 :
				// HiveLexer.g:1:3128: KW_RELY
				{
				mKW_RELY(); 

				}
				break;
			case 300 :
				// HiveLexer.g:1:3136: KW_NORELY
				{
				mKW_NORELY(); 

				}
				break;
			case 301 :
				// HiveLexer.g:1:3146: KW_UNIQUE
				{
				mKW_UNIQUE(); 

				}
				break;
			case 302 :
				// HiveLexer.g:1:3156: KW_KEY
				{
				mKW_KEY(); 

				}
				break;
			case 303 :
				// HiveLexer.g:1:3163: KW_ABORT
				{
				mKW_ABORT(); 

				}
				break;
			case 304 :
				// HiveLexer.g:1:3172: KW_EXTRACT
				{
				mKW_EXTRACT(); 

				}
				break;
			case 305 :
				// HiveLexer.g:1:3183: KW_FLOOR
				{
				mKW_FLOOR(); 

				}
				break;
			case 306 :
				// HiveLexer.g:1:3192: KW_MERGE
				{
				mKW_MERGE(); 

				}
				break;
			case 307 :
				// HiveLexer.g:1:3201: KW_MATCHED
				{
				mKW_MATCHED(); 

				}
				break;
			case 308 :
				// HiveLexer.g:1:3212: KW_REPL
				{
				mKW_REPL(); 

				}
				break;
			case 309 :
				// HiveLexer.g:1:3220: KW_DUMP
				{
				mKW_DUMP(); 

				}
				break;
			case 310 :
				// HiveLexer.g:1:3228: KW_STATUS
				{
				mKW_STATUS(); 

				}
				break;
			case 311 :
				// HiveLexer.g:1:3238: KW_VECTORIZATION
				{
				mKW_VECTORIZATION(); 

				}
				break;
			case 312 :
				// HiveLexer.g:1:3255: KW_SUMMARY
				{
				mKW_SUMMARY(); 

				}
				break;
			case 313 :
				// HiveLexer.g:1:3266: KW_OPERATOR
				{
				mKW_OPERATOR(); 

				}
				break;
			case 314 :
				// HiveLexer.g:1:3278: KW_EXPRESSION
				{
				mKW_EXPRESSION(); 

				}
				break;
			case 315 :
				// HiveLexer.g:1:3292: KW_DETAIL
				{
				mKW_DETAIL(); 

				}
				break;
			case 316 :
				// HiveLexer.g:1:3302: KW_WAIT
				{
				mKW_WAIT(); 

				}
				break;
			case 317 :
				// HiveLexer.g:1:3310: KW_RESOURCE
				{
				mKW_RESOURCE(); 

				}
				break;
			case 318 :
				// HiveLexer.g:1:3322: KW_PLAN
				{
				mKW_PLAN(); 

				}
				break;
			case 319 :
				// HiveLexer.g:1:3330: KW_QUERY_PARALLELISM
				{
				mKW_QUERY_PARALLELISM(); 

				}
				break;
			case 320 :
				// HiveLexer.g:1:3351: KW_PLANS
				{
				mKW_PLANS(); 

				}
				break;
			case 321 :
				// HiveLexer.g:1:3360: KW_ACTIVATE
				{
				mKW_ACTIVATE(); 

				}
				break;
			case 322 :
				// HiveLexer.g:1:3372: KW_DEFAULT
				{
				mKW_DEFAULT(); 

				}
				break;
			case 323 :
				// HiveLexer.g:1:3383: KW_CHECK
				{
				mKW_CHECK(); 

				}
				break;
			case 324 :
				// HiveLexer.g:1:3392: KW_POOL
				{
				mKW_POOL(); 

				}
				break;
			case 325 :
				// HiveLexer.g:1:3400: KW_MOVE
				{
				mKW_MOVE(); 

				}
				break;
			case 326 :
				// HiveLexer.g:1:3408: KW_DO
				{
				mKW_DO(); 

				}
				break;
			case 327 :
				// HiveLexer.g:1:3414: KW_ALLOC_FRACTION
				{
				mKW_ALLOC_FRACTION(); 

				}
				break;
			case 328 :
				// HiveLexer.g:1:3432: KW_SCHEDULING_POLICY
				{
				mKW_SCHEDULING_POLICY(); 

				}
				break;
			case 329 :
				// HiveLexer.g:1:3453: KW_PATH
				{
				mKW_PATH(); 

				}
				break;
			case 330 :
				// HiveLexer.g:1:3461: KW_MAPPING
				{
				mKW_MAPPING(); 

				}
				break;
			case 331 :
				// HiveLexer.g:1:3472: KW_WORKLOAD
				{
				mKW_WORKLOAD(); 

				}
				break;
			case 332 :
				// HiveLexer.g:1:3484: KW_MANAGEMENT
				{
				mKW_MANAGEMENT(); 

				}
				break;
			case 333 :
				// HiveLexer.g:1:3498: KW_ACTIVE
				{
				mKW_ACTIVE(); 

				}
				break;
			case 334 :
				// HiveLexer.g:1:3508: KW_UNMANAGED
				{
				mKW_UNMANAGED(); 

				}
				break;
			case 335 :
				// HiveLexer.g:1:3521: KW_APPLICATION
				{
				mKW_APPLICATION(); 

				}
				break;
			case 336 :
				// HiveLexer.g:1:3536: KW_SYNC
				{
				mKW_SYNC(); 

				}
				break;
			case 337 :
				// HiveLexer.g:1:3544: KW_AST
				{
				mKW_AST(); 

				}
				break;
			case 338 :
				// HiveLexer.g:1:3551: DOT
				{
				mDOT(); 

				}
				break;
			case 339 :
				// HiveLexer.g:1:3555: COLON
				{
				mCOLON(); 

				}
				break;
			case 340 :
				// HiveLexer.g:1:3561: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 341 :
				// HiveLexer.g:1:3567: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 342 :
				// HiveLexer.g:1:3577: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 343 :
				// HiveLexer.g:1:3584: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 344 :
				// HiveLexer.g:1:3591: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 345 :
				// HiveLexer.g:1:3599: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 346 :
				// HiveLexer.g:1:3607: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 347 :
				// HiveLexer.g:1:3614: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 348 :
				// HiveLexer.g:1:3621: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 349 :
				// HiveLexer.g:1:3627: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 350 :
				// HiveLexer.g:1:3636: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 351 :
				// HiveLexer.g:1:3645: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 352 :
				// HiveLexer.g:1:3663: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 353 :
				// HiveLexer.g:1:3672: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 354 :
				// HiveLexer.g:1:3693: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 355 :
				// HiveLexer.g:1:3705: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 356 :
				// HiveLexer.g:1:3712: PLUS
				{
				mPLUS(); 

				}
				break;
			case 357 :
				// HiveLexer.g:1:3717: MINUS
				{
				mMINUS(); 

				}
				break;
			case 358 :
				// HiveLexer.g:1:3723: STAR
				{
				mSTAR(); 

				}
				break;
			case 359 :
				// HiveLexer.g:1:3728: MOD
				{
				mMOD(); 

				}
				break;
			case 360 :
				// HiveLexer.g:1:3732: DIV
				{
				mDIV(); 

				}
				break;
			case 361 :
				// HiveLexer.g:1:3736: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 362 :
				// HiveLexer.g:1:3746: TILDE
				{
				mTILDE(); 

				}
				break;
			case 363 :
				// HiveLexer.g:1:3752: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 364 :
				// HiveLexer.g:1:3762: CONCATENATE
				{
				mCONCATENATE(); 

				}
				break;
			case 365 :
				// HiveLexer.g:1:3774: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 366 :
				// HiveLexer.g:1:3785: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 367 :
				// HiveLexer.g:1:3794: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 368 :
				// HiveLexer.g:1:3801: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 369 :
				// HiveLexer.g:1:3815: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 370 :
				// HiveLexer.g:1:3830: IntegralLiteral
				{
				mIntegralLiteral(); 

				}
				break;
			case 371 :
				// HiveLexer.g:1:3846: NumberLiteral
				{
				mNumberLiteral(); 

				}
				break;
			case 372 :
				// HiveLexer.g:1:3860: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 373 :
				// HiveLexer.g:1:3878: Number
				{
				mNumber(); 

				}
				break;
			case 374 :
				// HiveLexer.g:1:3885: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 375 :
				// HiveLexer.g:1:3896: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 376 :
				// HiveLexer.g:1:3908: WS
				{
				mWS(); 

				}
				break;
			case 377 :
				// HiveLexer.g:1:3911: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 378 :
				// HiveLexer.g:1:3924: QUERY_HINT
				{
				mQUERY_HINT(); 

				}
				break;

		}
	}


	protected DFA30 dfa30 = new DFA30(this);
	protected DFA35 dfa35 = new DFA35(this);
	static final String DFA30_eotS =
		"\1\1\10\uffff";
	static final String DFA30_eofS =
		"\11\uffff";
	static final String DFA30_minS =
		"\1\44\3\uffff\1\0\1\uffff\2\0\1\uffff";
	static final String DFA30_maxS =
		"\1\172\3\uffff\1\uffff\1\uffff\1\uffff\1\0\1\uffff";
	static final String DFA30_acceptS =
		"\1\uffff\1\1\1\2\1\3\1\uffff\1\4\2\uffff\1\5";
	static final String DFA30_specialS =
		"\4\uffff\1\1\1\uffff\1\2\1\0\1\uffff}>";
	static final String[] DFA30_transitionS = {
			"\1\3\13\uffff\12\2\7\uffff\32\2\5\uffff\1\4\32\2",
			"",
			"",
			"",
			"\41\5\1\6\2\5\1\6\3\5\4\6\1\5\2\6\1\5\12\6\5\5\1\6\1\5\33\6\1\5\3\6"+
			"\1\5\35\6\uff82\5",
			"",
			"\41\5\1\6\2\5\1\6\3\5\4\6\1\5\2\6\1\5\12\6\5\5\1\6\1\5\33\6\1\5\3\6"+
			"\1\7\35\6\uff82\5",
			"\1\uffff",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "499:1: Identifier : (| ( Letter | Digit ) ( Letter | Digit | '_' | ':' )* | DOLLAR LCURLY ( Letter | Digit | '_' | ':' )* RCURLY |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA30_7 = input.LA(1);
						 
						int index30_7 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowQuotedId())) ) {s = 5;}
						else if ( (true) ) {s = 8;}
						 
						input.seek(index30_7);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA30_4 = input.LA(1);
						s = -1;
						if ( ((LA30_4 >= '\u0000' && LA30_4 <= ' ')||(LA30_4 >= '\"' && LA30_4 <= '#')||(LA30_4 >= '%' && LA30_4 <= '\'')||LA30_4==','||LA30_4=='/'||(LA30_4 >= ':' && LA30_4 <= '>')||LA30_4=='@'||LA30_4=='\\'||LA30_4=='`'||(LA30_4 >= '~' && LA30_4 <= '\uFFFF')) ) {s = 5;}
						else if ( (LA30_4=='!'||LA30_4=='$'||(LA30_4 >= '(' && LA30_4 <= '+')||(LA30_4 >= '-' && LA30_4 <= '.')||(LA30_4 >= '0' && LA30_4 <= '9')||LA30_4=='?'||(LA30_4 >= 'A' && LA30_4 <= '[')||(LA30_4 >= ']' && LA30_4 <= '_')||(LA30_4 >= 'a' && LA30_4 <= '}')) ) {s = 6;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA30_6 = input.LA(1);
						s = -1;
						if ( (LA30_6=='`') ) {s = 7;}
						else if ( (LA30_6=='!'||LA30_6=='$'||(LA30_6 >= '(' && LA30_6 <= '+')||(LA30_6 >= '-' && LA30_6 <= '.')||(LA30_6 >= '0' && LA30_6 <= '9')||LA30_6=='?'||(LA30_6 >= 'A' && LA30_6 <= '[')||(LA30_6 >= ']' && LA30_6 <= '_')||(LA30_6 >= 'a' && LA30_6 <= '}')) ) {s = 6;}
						else if ( ((LA30_6 >= '\u0000' && LA30_6 <= ' ')||(LA30_6 >= '\"' && LA30_6 <= '#')||(LA30_6 >= '%' && LA30_6 <= '\'')||LA30_6==','||LA30_6=='/'||(LA30_6 >= ':' && LA30_6 <= '>')||LA30_6=='@'||LA30_6=='\\'||(LA30_6 >= '~' && LA30_6 <= '\uFFFF')) ) {s = 5;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 30, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA35_eotS =
		"\7\67\1\141\21\67\1\u00b1\2\67\13\uffff\1\u00b5\1\u00b7\1\u00b9\1\uffff"+
		"\1\u00bb\4\uffff\1\u00bd\4\uffff\2\u00c9\3\uffff\2\67\1\u00d2\22\67\1"+
		"\u00f8\11\67\1\u010a\2\67\1\u010e\1\u0110\2\67\2\uffff\4\67\1\u0120\1"+
		"\u0126\1\67\1\u0129\12\67\1\u0143\3\67\1\u0148\65\67\4\uffff\2\67\1\u01ac"+
		"\13\uffff\1\u01ae\2\uffff\1\u01ae\1\67\1\u01b1\2\u00c9\1\67\1\uffff\1"+
		"\u01b4\2\u01b8\5\67\1\uffff\16\67\1\u01d1\13\67\1\u01e0\1\u01e2\1\67\1"+
		"\u01e4\1\u01e6\1\67\1\u01e8\1\u01e9\1\67\1\u01eb\1\u01ec\1\uffff\3\67"+
		"\1\u01f0\6\67\1\141\6\67\1\uffff\1\67\1\u0201\1\67\1\uffff\1\67\1\uffff"+
		"\17\67\1\uffff\3\67\1\u021a\1\67\1\uffff\2\67\1\uffff\10\67\1\u022b\3"+
		"\67\1\u0230\7\67\1\u023c\1\67\1\u0241\2\67\1\uffff\4\67\1\uffff\23\67"+
		"\1\u025e\12\67\1\u026c\17\67\1\u027e\16\67\1\u0292\22\67\1\u02b1\14\67"+
		"\1\u02c1\4\67\5\uffff\1\u02c6\1\uffff\1\u00c9\3\uffff\1\u00c9\1\u01b4"+
		"\1\uffff\1\u02cb\6\67\1\u02d3\3\67\1\u02d7\1\67\1\u02d9\1\u02da\3\67\1"+
		"\u02df\5\67\1\uffff\7\67\1\u02ec\5\67\1\u02f2\1\uffff\1\67\1\uffff\1\67"+
		"\1\uffff\1\67\1\uffff\1\67\2\uffff\1\67\2\uffff\3\67\1\uffff\6\67\1\u0301"+
		"\3\67\1\u0306\2\67\1\u030a\2\67\1\uffff\1\u030d\4\67\1\u0312\2\67\1\u0315"+
		"\1\67\1\u0317\1\u0318\2\67\1\u031d\1\u031e\1\67\1\u0320\5\67\1\u0327\1"+
		"\uffff\20\67\1\uffff\1\67\1\u033a\1\u033c\1\67\1\uffff\13\67\1\uffff\1"+
		"\u034b\1\u034d\1\u0241\1\67\1\uffff\1\u034f\2\67\1\u0352\3\67\1\u0356"+
		"\6\67\1\u035e\1\67\1\u0360\1\67\1\u0362\1\67\1\u0365\1\u0367\1\67\1\u0369"+
		"\3\67\1\u036d\1\uffff\1\u036e\1\67\1\u0371\1\67\1\u0374\10\67\1\uffff"+
		"\3\67\1\u0382\6\67\1\u038a\1\67\1\u038c\1\u038e\1\67\1\u0390\1\u0391\1"+
		"\uffff\3\67\1\u0397\1\67\1\u0399\1\u039b\11\67\1\u03a5\1\67\1\u03a7\1"+
		"\uffff\1\67\1\u03ab\10\67\1\u03b6\5\67\1\u03bc\1\67\1\u03be\1\u03bf\4"+
		"\67\1\u03c4\1\u03c5\4\67\1\uffff\5\67\1\u03d0\1\67\1\u03d2\1\u03d3\3\67"+
		"\1\u03d8\1\67\1\u03da\1\uffff\1\u03db\1\u03dd\2\67\2\uffff\2\u00c9\1\67"+
		"\1\uffff\3\67\1\u03e5\1\u03e6\2\67\1\uffff\3\67\1\uffff\1\u03ec\2\uffff"+
		"\1\67\1\u03ee\2\67\1\uffff\1\u03f1\1\u03f2\2\67\1\u03f5\1\67\1\u03f7\2"+
		"\67\1\u03fb\1\u03fc\1\67\1\uffff\4\67\1\u0402\1\uffff\3\67\1\u0406\1\67"+
		"\1\u0408\1\u0409\1\67\1\u040b\2\67\1\u040e\2\67\1\uffff\3\67\1\u0415\1"+
		"\uffff\1\67\1\u0417\1\67\1\uffff\1\u0419\1\67\1\uffff\3\67\1\u041e\1\uffff"+
		"\1\u041f\1\u0420\1\uffff\1\67\2\uffff\1\u0422\1\u0423\1\67\1\u0425\2\uffff"+
		"\1\67\1\uffff\1\67\1\u0429\4\67\1\uffff\1\u0430\2\67\1\u0433\16\67\1\uffff"+
		"\1\67\1\uffff\3\67\1\u0446\12\67\1\uffff\1\67\1\uffff\1\67\1\uffff\2\67"+
		"\1\uffff\1\u0456\1\u0457\1\67\1\uffff\6\67\1\u035e\1\uffff\1\u045f\1\uffff"+
		"\1\u0460\1\uffff\1\67\1\u0365\1\uffff\1\67\1\uffff\1\u0463\1\uffff\1\67"+
		"\1\u0466\1\67\2\uffff\2\67\1\uffff\2\67\1\uffff\7\67\1\u0473\5\67\1\uffff"+
		"\7\67\1\uffff\1\67\1\uffff\1\u0481\1\uffff\1\u0482\2\uffff\1\u0483\4\67"+
		"\1\uffff\1\67\1\uffff\1\u0489\1\uffff\11\67\1\uffff\1\67\1\uffff\2\67"+
		"\1\u0496\1\uffff\1\u0497\1\u0498\10\67\1\uffff\3\67\1\u04a4\1\67\1\uffff"+
		"\1\u04a6\2\uffff\1\67\1\u04a8\2\67\2\uffff\1\67\1\u04ac\2\67\1\u04af\3"+
		"\67\1\u04b3\1\67\1\uffff\1\u04b6\2\uffff\3\67\1\u04ba\1\uffff\1\67\2\uffff"+
		"\1\u03dd\1\uffff\1\u04bd\5\67\1\u04c4\2\uffff\5\67\1\uffff\1\67\1\uffff"+
		"\1\u04cb\1\67\2\uffff\1\u04ce\1\67\1\uffff\1\67\1\uffff\1\67\1\u04d3\1"+
		"\67\2\uffff\1\67\1\u04d6\3\67\1\uffff\1\67\1\u04db\1\67\1\uffff\1\67\2"+
		"\uffff\1\67\1\uffff\2\67\1\uffff\1\67\1\u04e2\1\67\1\u04e4\1\67\1\u04e6"+
		"\1\uffff\1\67\1\uffff\1\67\1\uffff\1\67\1\u04eb\1\u04ec\1\67\3\uffff\1"+
		"\67\2\uffff\1\67\1\uffff\1\67\1\u04f1\1\67\1\uffff\1\u04f3\5\67\1\uffff"+
		"\1\u04f9\1\67\1\uffff\1\67\1\u04fc\1\u04fd\2\67\1\u0500\6\67\1\u0507\4"+
		"\67\1\u050c\1\uffff\4\67\1\u0511\7\67\1\u0519\2\67\2\uffff\1\67\1\u051d"+
		"\1\u051e\1\u0520\1\u0521\1\67\1\u0523\2\uffff\1\u0524\1\67\1\uffff\1\u0526"+
		"\1\67\1\uffff\1\u0528\1\u052a\1\67\1\u052c\1\u052d\1\67\1\u052f\1\u0530"+
		"\1\67\1\u0532\1\67\1\u0534\1\uffff\1\u0536\1\67\1\u0538\12\67\3\uffff"+
		"\1\67\1\u0544\2\67\1\u0547\1\uffff\1\u0548\1\u0549\1\u054a\5\67\1\u0551"+
		"\1\67\1\u0553\1\67\3\uffff\1\u0556\2\67\1\u0559\6\67\1\u0560\1\uffff\1"+
		"\u0561\1\uffff\1\67\1\uffff\1\u0563\2\67\1\uffff\2\67\1\uffff\3\67\1\uffff"+
		"\1\u056c\1\u04b6\1\uffff\1\67\1\u056e\1\67\1\uffff\2\67\1\uffff\4\67\1"+
		"\u0576\1\67\1\uffff\1\u0578\5\67\1\uffff\2\67\1\uffff\1\u0580\1\67\1\u0582"+
		"\1\67\1\uffff\2\67\1\uffff\4\67\1\uffff\1\67\1\u058b\1\u058c\3\67\1\uffff"+
		"\1\67\1\uffff\1\67\1\uffff\1\u0230\3\67\2\uffff\1\67\1\u0596\1\67\1\u0598"+
		"\1\uffff\1\u0599\1\uffff\2\67\1\u021a\2\67\1\uffff\2\67\2\uffff\2\67\1"+
		"\uffff\1\u05a2\3\67\1\u05a6\1\u05a7\1\uffff\2\67\1\u0230\1\67\1\uffff"+
		"\2\67\1\u05ad\1\u05ae\1\uffff\2\67\1\u05b1\4\67\1\uffff\2\67\1\u05b8\2"+
		"\uffff\1\u05b9\2\uffff\1\u05ba\2\uffff\1\67\1\uffff\1\67\1\uffff\1\u052a"+
		"\1\uffff\1\67\2\uffff\1\67\2\uffff\1\67\1\uffff\1\67\1\uffff\1\u05c1\1"+
		"\uffff\1\67\1\uffff\1\67\1\u05c4\5\67\1\u05ca\1\67\1\u05cc\1\u05cd\1\uffff"+
		"\1\67\1\u05cf\4\uffff\4\67\1\u05d4\1\67\1\uffff\1\67\1\uffff\1\67\1\u05d8"+
		"\1\uffff\1\67\1\u05da\1\uffff\1\u05db\1\u05dd\3\67\1\u05e3\2\uffff\1\u05e4"+
		"\1\uffff\1\u05e6\1\67\1\u05e8\1\u05e9\1\67\1\u05eb\1\67\1\u056c\1\uffff"+
		"\1\u05ed\1\uffff\3\67\1\u05f1\1\u05f2\2\67\1\uffff\1\67\1\uffff\4\67\1"+
		"\u05fb\2\67\1\uffff\1\67\1\uffff\2\67\1\u0601\5\67\2\uffff\2\67\1\u0609"+
		"\5\67\1\u060f\1\uffff\1\u0610\2\uffff\2\67\1\u0613\4\67\1\u0618\1\uffff"+
		"\1\67\1\u061a\1\u061b\2\uffff\1\u061c\1\u061d\2\67\1\u0620\2\uffff\1\u0621"+
		"\1\67\1\uffff\1\67\1\u0626\1\u0627\2\67\1\u062a\3\uffff\1\u062b\2\67\1"+
		"\u062e\2\67\1\uffff\1\67\1\u0632\1\uffff\1\u0633\4\67\1\uffff\1\67\2\uffff"+
		"\1\67\1\uffff\2\67\1\u063c\1\u063d\1\uffff\2\67\1\u0640\1\uffff\1\67\2"+
		"\uffff\1\67\1\uffff\1\u0643\4\67\2\uffff\1\67\1\uffff\1\u064a\2\uffff"+
		"\1\67\1\uffff\1\67\1\uffff\1\u064d\2\67\2\uffff\1\u0650\2\67\1\u0654\1"+
		"\67\1\u0656\1\67\1\u0658\1\uffff\1\67\1\u065a\1\u065b\1\67\1\u065d\1\uffff"+
		"\1\u065e\1\u065f\1\u0660\4\67\1\uffff\2\67\1\u0667\2\67\2\uffff\2\67\1"+
		"\uffff\1\u066c\1\u066d\1\67\1\u066f\1\uffff\1\67\4\uffff\1\u0671\1\67"+
		"\2\uffff\1\67\1\u0674\1\67\1\u0676\2\uffff\1\u0677\1\67\2\uffff\2\67\1"+
		"\uffff\3\67\2\uffff\1\u067e\1\u067f\1\u0680\1\67\1\u0684\3\67\2\uffff"+
		"\2\67\1\uffff\2\67\1\uffff\2\67\1\u068e\3\67\1\uffff\2\67\1\uffff\2\67"+
		"\1\uffff\3\67\1\uffff\1\u0699\1\uffff\1\67\1\uffff\1\u069b\2\uffff\1\u069c"+
		"\4\uffff\3\67\1\u06a0\1\67\1\u06a2\1\uffff\4\67\2\uffff\1\67\1\uffff\1"+
		"\u06a8\1\uffff\1\u06a9\1\u06aa\1\uffff\1\67\2\uffff\4\67\1\u06b0\1\67"+
		"\3\uffff\1\u06b2\1\u06b3\1\67\1\uffff\4\67\1\u06b9\1\u06ba\2\67\1\u06bd"+
		"\1\uffff\4\67\1\u06c2\2\67\1\u06c7\1\u06c8\1\67\1\uffff\1\67\2\uffff\3"+
		"\67\1\uffff\1\u06ce\1\uffff\2\67\1\u06d1\1\u06d2\1\67\3\uffff\1\u06d4"+
		"\3\67\1\u06d8\1\uffff\1\67\2\uffff\1\u06da\1\u06db\3\67\2\uffff\1\u06df"+
		"\1\u06e0\1\uffff\4\67\1\uffff\2\67\1\u06e7\1\67\2\uffff\2\67\1\u06eb\2"+
		"\67\1\uffff\1\u06ee\1\u06ef\2\uffff\1\67\1\uffff\1\u06f1\2\67\1\uffff"+
		"\1\67\2\uffff\1\u06f5\1\u06f6\1\67\2\uffff\1\67\1\u06f9\1\67\1\u06fb\2"+
		"\67\1\uffff\1\u06fe\1\67\1\u0700\1\uffff\1\67\1\u0702\2\uffff\1\u0703"+
		"\1\uffff\1\67\1\u0705\1\67\2\uffff\1\67\1\u0708\1\uffff\1\67\1\uffff\1"+
		"\u070a\1\67\1\uffff\1\67\1\uffff\1\u070d\2\uffff\1\67\1\uffff\1\67\1\u0710"+
		"\1\uffff\1\67\1\uffff\2\67\1\uffff\1\u0714\1\67\1\uffff\2\67\1\u0718\1"+
		"\uffff\3\67\1\uffff\1\u071c\1\u071d\1\u071e\3\uffff";
	static final String DFA35_eofS =
		"\u071f\uffff";
	static final String DFA35_minS =
		"\1\11\2\101\1\116\1\102\1\117\1\106\1\75\1\101\1\104\1\114\1\101\1\122"+
		"\1\105\2\101\1\103\5\101\1\117\1\101\3\105\1\125\13\uffff\2\75\1\52\1"+
		"\uffff\1\55\4\uffff\1\174\2\uffff\2\0\2\56\3\uffff\1\101\1\102\1\60\2"+
		"\115\1\114\1\105\1\114\1\117\1\114\1\105\1\117\1\114\1\124\1\101\1\105"+
		"\1\103\1\104\1\111\1\114\1\101\1\60\1\124\1\103\1\104\1\124\1\117\1\124"+
		"\1\120\1\116\1\114\1\60\1\105\1\124\2\60\1\105\1\116\2\uffff\1\113\1\123"+
		"\1\106\1\101\2\60\1\120\1\60\1\105\1\130\2\103\1\101\1\123\1\102\1\122"+
		"\1\124\1\117\1\60\1\120\1\115\1\101\1\60\1\117\1\107\1\103\1\106\1\126"+
		"\1\125\1\105\1\116\1\105\1\122\2\111\1\103\1\101\1\122\2\101\1\110\1\114"+
		"\1\105\1\101\1\115\1\116\1\105\2\122\1\101\1\122\1\117\1\111\1\122\1\107"+
		"\1\101\1\114\1\111\1\116\1\114\1\125\1\105\1\101\1\103\1\102\1\103\1\122"+
		"\1\103\3\116\1\114\1\105\1\103\1\131\1\114\4\uffff\2\101\1\76\11\uffff"+
		"\2\0\1\42\2\0\1\42\2\60\1\56\1\60\1\53\1\uffff\3\60\1\105\1\116\1\107"+
		"\1\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1\115\1\114\1"+
		"\103\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\116\1\117\1\105\2\117"+
		"\1\122\1\117\1\101\1\116\2\60\1\101\2\60\1\105\2\60\1\114\2\60\1\uffff"+
		"\1\105\1\101\1\110\1\60\1\111\1\110\1\122\1\111\1\114\1\105\1\60\1\103"+
		"\1\101\1\105\1\114\2\105\1\uffff\1\122\1\60\1\131\1\uffff\1\123\1\uffff"+
		"\1\111\1\122\3\105\1\111\1\124\1\105\1\124\1\123\1\105\1\101\1\104\1\111"+
		"\1\107\1\uffff\2\105\1\101\1\60\1\105\1\uffff\1\117\1\114\1\uffff\1\115"+
		"\1\120\1\123\1\105\1\114\1\105\1\101\1\102\1\60\1\117\1\105\1\103\1\60"+
		"\1\105\1\125\1\105\3\101\1\105\1\60\1\101\1\60\1\120\1\102\1\uffff\1\122"+
		"\1\120\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1"+
		"\111\1\122\1\116\1\114\1\110\1\104\2\113\2\124\1\105\1\104\1\60\1\111"+
		"\1\117\1\127\1\122\1\124\1\114\1\105\2\122\1\105\1\60\1\127\1\120\1\115"+
		"\3\103\1\115\1\124\1\110\1\103\1\123\1\116\1\107\1\114\1\116\1\60\1\110"+
		"\1\125\2\101\1\104\1\125\1\105\3\117\1\122\1\120\1\117\1\105\1\60\1\105"+
		"\1\113\1\107\1\114\1\115\1\103\1\123\1\101\1\123\1\116\2\103\1\110\1\122"+
		"\1\105\1\113\1\101\1\107\1\60\1\122\1\103\1\101\1\125\1\105\1\124\2\105"+
		"\1\103\1\111\1\127\1\124\1\60\1\114\3\122\2\uffff\1\0\1\uffff\1\0\1\60"+
		"\1\uffff\1\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\107\1\105\1"+
		"\110\1\111\1\60\1\111\1\117\1\122\1\60\1\105\2\60\2\124\1\104\1\60\1\124"+
		"\1\122\1\101\1\111\1\105\1\uffff\1\117\1\110\1\117\1\125\1\116\1\124\1"+
		"\107\1\60\2\103\1\125\1\116\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\uffff"+
		"\1\103\1\uffff\1\122\2\uffff\1\131\2\uffff\1\122\1\131\1\111\1\uffff\1"+
		"\116\1\117\1\103\1\124\1\126\1\111\1\60\1\101\2\114\1\60\2\122\1\60\1"+
		"\122\1\125\1\uffff\1\60\1\105\1\117\1\101\1\122\1\60\1\123\1\124\1\60"+
		"\1\122\2\60\2\114\2\60\1\103\1\60\1\122\1\130\2\124\1\107\1\60\1\uffff"+
		"\2\122\1\101\1\123\1\122\1\124\1\120\1\125\1\101\1\122\1\101\1\105\1\116"+
		"\1\101\1\120\1\114\1\uffff\1\122\2\60\1\115\1\uffff\1\115\1\124\1\107"+
		"\1\116\1\122\1\116\1\125\2\111\1\102\1\103\1\uffff\3\60\1\106\1\uffff"+
		"\1\60\1\114\1\117\1\60\1\120\1\124\1\105\1\60\1\116\1\122\1\105\1\122"+
		"\1\105\1\116\1\60\1\105\1\60\1\105\1\60\1\117\2\60\1\105\1\60\1\103\2"+
		"\105\1\60\1\uffff\1\60\1\116\1\60\1\105\1\60\1\114\1\116\1\103\1\101\1"+
		"\105\1\111\1\124\1\104\1\uffff\1\105\1\123\1\101\1\60\3\105\1\103\1\101"+
		"\1\111\1\60\1\105\2\60\1\105\2\60\1\uffff\1\124\2\111\1\60\1\115\2\60"+
		"\1\103\1\130\1\113\2\122\1\125\1\111\1\124\1\101\1\60\1\122\1\60\1\uffff"+
		"\1\102\1\60\2\105\1\115\2\105\1\101\1\111\1\101\1\60\3\124\1\123\1\107"+
		"\1\60\1\113\2\60\1\101\1\105\1\117\1\105\2\60\1\104\1\105\1\117\1\111"+
		"\1\uffff\1\117\1\122\1\110\1\107\1\123\1\60\1\110\2\60\1\110\1\105\1\104"+
		"\1\60\1\117\1\60\1\uffff\2\60\1\131\1\124\1\uffff\3\60\1\104\1\uffff\2"+
		"\101\1\105\2\60\1\116\1\124\1\uffff\1\116\1\122\1\117\1\uffff\1\60\2\uffff"+
		"\1\111\1\60\1\123\1\117\1\uffff\2\60\1\124\1\107\1\60\1\127\1\60\1\127"+
		"\1\105\2\60\1\116\1\uffff\1\113\1\110\1\116\1\101\1\60\1\uffff\1\115\1"+
		"\105\1\137\1\60\1\132\2\60\1\126\1\60\1\122\1\117\1\60\1\101\1\103\1\uffff"+
		"\1\116\1\111\1\131\1\60\1\uffff\1\111\1\60\1\122\1\uffff\1\60\1\124\1"+
		"\uffff\1\124\1\116\1\124\1\60\1\uffff\2\60\1\uffff\1\101\2\uffff\2\60"+
		"\1\111\1\60\2\uffff\1\101\1\uffff\1\124\1\60\1\110\1\104\1\105\1\123\1"+
		"\uffff\1\60\2\124\1\60\1\117\1\123\1\124\1\123\1\116\1\124\1\111\1\123"+
		"\1\116\1\104\1\103\2\105\1\103\1\uffff\1\111\1\uffff\1\101\1\111\1\105"+
		"\1\60\1\104\1\122\1\105\2\114\1\116\1\111\1\114\1\124\1\101\1\uffff\1"+
		"\111\1\uffff\1\127\1\uffff\1\105\1\120\1\uffff\2\60\1\101\1\uffff\1\124"+
		"\1\131\1\124\2\105\1\107\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\127"+
		"\1\60\1\uffff\1\117\1\uffff\1\60\1\uffff\1\124\1\60\1\122\2\uffff\2\104"+
		"\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115\1\104\2\123\1\60\1\101"+
		"\1\125\1\104\1\110\1\122\1\uffff\1\122\1\123\2\104\1\111\1\122\1\124\1"+
		"\uffff\1\116\1\uffff\1\60\1\uffff\1\60\2\uffff\1\60\1\114\1\122\2\103"+
		"\1\uffff\1\105\1\uffff\1\60\1\uffff\1\105\1\120\1\105\1\104\1\111\1\122"+
		"\1\124\1\111\1\104\1\uffff\1\105\1\uffff\1\120\1\101\1\60\1\uffff\2\60"+
		"\1\116\1\103\1\116\2\124\1\103\1\116\1\124\1\uffff\1\122\2\105\1\60\1"+
		"\105\1\uffff\1\60\2\uffff\1\104\1\60\1\122\1\116\2\uffff\1\101\1\60\1"+
		"\111\1\116\1\60\1\111\2\105\1\60\1\105\1\uffff\1\60\2\uffff\1\101\1\123"+
		"\1\101\1\60\1\uffff\1\122\2\uffff\1\60\1\uffff\1\60\1\105\1\124\1\117"+
		"\1\103\1\122\1\60\2\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\60"+
		"\1\122\2\uffff\1\60\1\116\1\uffff\1\111\1\uffff\1\116\1\60\1\131\2\uffff"+
		"\1\105\1\60\1\111\1\104\1\107\1\uffff\1\105\1\60\1\106\1\uffff\1\105\2"+
		"\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1\124\1\60\1\101\1\60\1\104\1"+
		"\60\1\uffff\1\103\1\uffff\1\111\1\uffff\1\104\2\60\1\117\3\uffff\1\114"+
		"\2\uffff\1\117\1\uffff\1\114\1\60\1\123\1\uffff\1\60\1\117\2\122\1\101"+
		"\1\105\1\uffff\1\60\1\111\1\uffff\1\120\2\60\1\111\1\107\1\60\1\116\1"+
		"\123\1\101\1\105\1\124\1\104\1\60\1\105\1\102\1\114\1\124\1\60\1\uffff"+
		"\2\105\1\104\1\124\1\60\1\103\1\102\1\105\1\117\1\123\1\115\1\105\1\60"+
		"\1\105\1\116\2\uffff\1\116\4\60\1\116\1\60\2\uffff\1\60\1\101\1\uffff"+
		"\1\60\1\122\1\uffff\2\60\1\101\2\60\1\116\2\60\1\124\1\60\1\124\1\60\1"+
		"\uffff\1\60\1\114\1\60\1\117\1\131\1\126\2\111\1\125\1\120\1\131\1\111"+
		"\1\124\3\uffff\1\104\1\60\1\101\1\105\1\60\1\uffff\3\60\1\122\2\103\1"+
		"\105\1\115\1\60\1\116\1\60\1\103\3\uffff\1\60\2\124\1\60\1\105\1\124\1"+
		"\125\1\105\1\101\1\122\1\60\1\uffff\1\60\1\uffff\1\105\1\uffff\1\60\2"+
		"\124\1\uffff\1\116\1\107\1\uffff\1\101\1\104\1\115\1\uffff\2\60\1\uffff"+
		"\1\122\1\60\1\124\1\uffff\1\111\1\120\1\uffff\1\122\1\105\1\122\1\124"+
		"\1\60\1\115\1\uffff\1\60\1\115\1\124\1\122\1\105\1\116\1\uffff\1\115\1"+
		"\105\1\uffff\1\60\1\116\1\60\1\117\1\uffff\1\120\1\104\1\uffff\1\126\2"+
		"\105\1\123\1\uffff\1\122\2\60\1\132\1\115\1\105\1\uffff\1\124\1\uffff"+
		"\1\101\1\uffff\1\60\1\124\1\117\1\122\2\uffff\1\122\1\60\1\116\1\60\1"+
		"\uffff\1\60\1\uffff\1\122\1\111\1\60\1\114\1\103\1\uffff\1\117\1\105\2"+
		"\uffff\1\126\1\105\1\uffff\1\60\1\111\1\114\1\104\2\60\1\uffff\1\104\1"+
		"\105\1\60\1\105\1\uffff\1\116\1\104\2\60\1\uffff\1\124\1\125\1\60\1\122"+
		"\3\105\1\uffff\1\122\1\107\1\60\2\uffff\1\60\2\uffff\1\60\2\uffff\1\104"+
		"\1\uffff\1\117\1\uffff\1\60\1\uffff\1\124\2\uffff\1\124\2\uffff\1\101"+
		"\1\uffff\1\111\1\uffff\1\60\1\uffff\1\111\1\uffff\1\124\1\60\1\105\1\117"+
		"\1\116\1\122\1\101\1\60\1\117\2\60\1\uffff\1\124\1\60\4\uffff\1\105\1"+
		"\122\1\124\1\105\1\60\1\111\1\uffff\1\103\1\uffff\1\113\1\60\1\uffff\1"+
		"\111\1\60\1\uffff\2\60\1\105\1\116\1\111\1\60\2\uffff\1\60\1\uffff\1\60"+
		"\1\101\2\60\1\114\1\60\1\105\1\60\1\uffff\1\60\1\uffff\1\105\1\132\1\101"+
		"\2\60\1\115\1\111\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122\1\60\1"+
		"\101\1\104\1\uffff\1\107\1\uffff\1\111\1\105\1\60\1\105\2\104\1\124\1"+
		"\101\2\uffff\1\101\1\111\1\60\1\111\1\124\1\105\1\122\1\111\1\60\1\uffff"+
		"\1\60\2\uffff\1\115\1\126\1\60\1\124\1\116\1\122\1\105\1\60\1\uffff\1"+
		"\117\2\60\2\uffff\2\60\1\104\1\103\1\60\2\uffff\1\60\1\124\1\uffff\1\111"+
		"\2\60\1\113\1\124\1\60\3\uffff\1\60\1\120\1\101\1\60\1\102\1\103\1\uffff"+
		"\1\116\1\60\1\uffff\1\60\1\116\1\107\1\105\1\114\1\uffff\1\116\2\uffff"+
		"\1\111\1\uffff\1\101\1\111\2\60\1\uffff\1\132\1\105\1\60\1\uffff\1\117"+
		"\2\uffff\1\117\1\uffff\1\60\1\101\1\116\1\104\1\124\2\uffff\1\104\1\uffff"+
		"\1\60\2\uffff\1\111\1\uffff\1\116\1\uffff\1\60\1\101\1\122\2\uffff\1\60"+
		"\1\117\1\114\1\60\1\104\1\60\1\124\1\60\1\uffff\1\124\2\60\1\116\1\60"+
		"\1\uffff\3\60\1\101\1\103\2\124\1\uffff\1\117\1\105\1\60\1\115\1\126\2"+
		"\uffff\1\101\1\105\1\uffff\2\60\1\124\1\60\1\uffff\1\116\4\uffff\1\60"+
		"\1\131\2\uffff\1\105\1\60\1\105\1\60\2\uffff\1\60\1\111\2\uffff\1\105"+
		"\1\102\1\uffff\1\114\1\123\1\107\2\uffff\3\60\1\123\1\60\1\117\1\104\1"+
		"\124\2\uffff\1\101\1\123\1\uffff\2\116\1\uffff\2\124\1\60\2\101\1\111"+
		"\1\uffff\1\132\1\124\1\uffff\1\124\1\101\1\uffff\1\116\1\105\1\117\1\uffff"+
		"\1\60\1\uffff\1\111\1\uffff\1\60\2\uffff\1\60\4\uffff\1\115\1\124\1\111"+
		"\1\60\1\116\1\60\1\uffff\1\101\1\105\1\124\1\122\2\uffff\1\111\1\uffff"+
		"\1\60\1\uffff\2\60\1\uffff\1\123\2\uffff\1\105\1\122\1\101\1\105\1\60"+
		"\1\137\3\uffff\2\60\1\104\1\uffff\1\116\2\105\1\124\2\60\1\123\1\105\1"+
		"\60\1\uffff\2\124\1\115\1\105\1\60\1\111\1\114\2\60\1\103\1\uffff\1\105"+
		"\2\uffff\1\120\1\111\1\117\1\uffff\1\60\1\uffff\1\124\1\122\2\60\1\105"+
		"\3\uffff\1\60\1\123\1\124\1\123\1\60\1\uffff\1\120\2\uffff\2\60\2\122"+
		"\1\111\2\uffff\2\60\1\uffff\1\125\2\105\1\104\1\uffff\1\117\1\114\1\60"+
		"\1\114\2\uffff\1\101\1\123\1\60\1\117\1\116\1\uffff\2\60\2\uffff\1\123"+
		"\1\uffff\1\60\1\111\1\105\1\uffff\1\117\2\uffff\2\60\1\117\2\uffff\1\123"+
		"\1\60\1\123\1\60\1\116\1\105\1\uffff\1\60\1\114\1\60\1\uffff\1\116\1\60"+
		"\2\uffff\1\60\1\uffff\1\105\1\60\1\114\2\uffff\1\116\1\60\1\uffff\1\124"+
		"\1\uffff\1\60\1\114\1\uffff\1\124\1\uffff\1\60\2\uffff\1\123\1\uffff\1"+
		"\111\1\60\1\uffff\1\101\1\uffff\1\111\1\132\1\uffff\1\60\1\103\1\uffff"+
		"\1\115\1\123\1\60\1\uffff\1\131\1\120\1\115\1\uffff\3\60\3\uffff";
	static final String DFA35_maxS =
		"\1\176\1\122\1\125\1\124\2\125\1\127\1\75\1\117\1\124\1\130\1\125\1\122"+
		"\1\131\1\117\1\122\1\131\1\125\2\117\1\125\1\123\1\117\2\111\1\173\1\105"+
		"\1\125\13\uffff\1\76\1\75\1\52\1\uffff\1\55\4\uffff\1\174\2\uffff\2\uffff"+
		"\2\172\3\uffff\1\125\1\102\1\172\1\116\1\122\1\114\1\105\1\114\1\117\1"+
		"\116\1\122\1\117\1\122\1\124\1\123\1\111\1\103\1\104\1\111\1\124\1\131"+
		"\1\172\1\124\1\122\1\115\1\124\1\117\1\124\1\120\1\126\1\115\1\172\1\105"+
		"\1\124\2\172\1\124\1\116\2\uffff\1\116\1\124\1\126\1\116\2\172\1\120\1"+
		"\172\1\105\1\130\1\124\1\103\1\106\1\123\1\124\1\126\1\131\1\117\1\172"+
		"\1\120\1\115\1\117\1\172\1\124\1\116\1\103\1\124\1\126\1\125\1\111\1\124"+
		"\1\105\1\122\2\111\1\124\1\117\1\122\1\101\1\122\1\110\1\114\1\105\1\101"+
		"\1\115\1\116\1\117\1\124\1\122\1\125\1\122\1\117\1\111\1\122\1\107\2\127"+
		"\1\111\2\116\1\125\1\117\1\105\1\123\1\122\1\103\2\124\1\116\1\126\1\116"+
		"\1\122\1\105\1\103\1\131\1\114\4\uffff\1\101\1\105\1\76\11\uffff\2\uffff"+
		"\1\47\2\uffff\1\47\1\146\2\172\1\145\1\71\1\uffff\3\172\2\116\1\107\1"+
		"\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1\115\1\114\1\103"+
		"\1\123\1\114\1\105\1\117\1\172\1\114\1\103\1\116\1\121\1\111\2\117\1\122"+
		"\1\117\1\101\1\116\2\172\1\101\2\172\1\105\2\172\1\114\2\172\1\uffff\1"+
		"\105\1\101\1\110\1\172\1\111\1\117\1\122\1\111\1\114\1\105\1\172\1\103"+
		"\1\101\1\105\1\114\2\105\1\uffff\1\122\1\172\1\131\1\uffff\1\123\1\uffff"+
		"\1\111\1\122\3\105\1\111\1\124\1\105\1\124\1\123\1\105\1\113\1\104\1\111"+
		"\1\107\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\114\1\uffff\1\115"+
		"\1\120\1\123\1\114\2\122\1\101\1\102\1\172\1\117\1\105\1\103\1\172\1\111"+
		"\1\125\1\105\1\111\1\101\1\124\1\105\1\172\1\105\1\172\1\120\1\102\1\uffff"+
		"\1\122\1\120\1\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1"+
		"\127\1\111\2\122\1\114\1\110\1\104\2\113\2\124\1\105\1\126\1\172\1\111"+
		"\1\117\1\127\1\122\1\124\1\114\1\125\1\122\1\124\1\105\1\172\1\127\1\120"+
		"\1\115\1\103\1\123\1\103\1\116\1\124\1\110\1\103\1\123\1\116\1\107\1\114"+
		"\1\116\1\172\1\110\1\125\1\114\1\101\1\114\1\125\1\105\2\117\1\124\1\122"+
		"\1\120\1\131\1\105\1\172\1\114\1\113\1\107\1\125\1\120\1\124\1\123\1\101"+
		"\1\123\1\122\1\103\1\124\1\110\1\123\1\105\1\113\1\101\1\107\1\172\1\122"+
		"\1\105\1\101\1\125\1\105\1\124\2\105\1\103\1\125\1\127\1\124\1\172\1\114"+
		"\3\122\2\uffff\1\uffff\1\uffff\1\uffff\1\172\1\uffff\1\145\1\71\1\uffff"+
		"\1\71\2\172\1\uffff\1\172\1\103\1\123\1\107\1\105\1\110\1\111\1\172\1"+
		"\111\1\117\1\122\1\172\1\105\2\172\2\124\1\104\1\172\1\124\1\122\1\101"+
		"\1\111\1\105\1\uffff\1\117\1\110\1\117\1\125\1\116\1\124\1\107\1\172\2"+
		"\103\1\125\1\116\1\107\1\172\1\uffff\1\124\1\uffff\1\124\1\uffff\1\103"+
		"\1\uffff\1\122\2\uffff\1\131\2\uffff\1\122\1\131\1\111\1\uffff\1\116\1"+
		"\117\1\103\1\124\1\126\1\111\1\172\1\101\2\114\1\172\2\122\1\172\1\122"+
		"\1\125\1\uffff\1\172\1\105\1\117\1\101\1\122\1\172\1\123\1\124\1\172\1"+
		"\122\2\172\1\114\1\124\2\172\1\103\1\172\1\122\1\130\2\124\1\122\1\172"+
		"\1\uffff\2\122\1\101\1\123\1\122\1\124\1\120\1\125\1\101\1\122\1\101\1"+
		"\105\1\122\1\101\1\120\1\114\1\uffff\1\122\2\172\1\115\1\uffff\1\115\1"+
		"\124\1\107\1\116\1\122\1\116\1\125\1\111\1\122\1\102\1\103\1\uffff\3\172"+
		"\1\106\1\uffff\1\172\1\114\1\117\1\172\1\120\1\124\1\105\1\172\1\116\1"+
		"\122\1\105\1\122\1\105\1\116\1\172\1\105\1\172\1\105\1\172\1\117\2\172"+
		"\1\105\1\172\1\103\2\105\1\172\1\uffff\1\172\1\116\1\172\1\105\1\172\1"+
		"\114\1\116\1\103\1\101\1\105\1\125\1\124\1\115\1\uffff\1\105\1\123\1\101"+
		"\1\172\1\105\1\111\1\105\1\103\1\101\1\111\1\172\1\105\2\172\1\105\2\172"+
		"\1\uffff\1\124\2\111\1\172\1\115\2\172\1\103\1\130\1\113\2\122\1\125\1"+
		"\111\1\124\1\101\1\172\1\122\1\172\1\uffff\1\125\1\172\2\105\1\115\1\105"+
		"\1\111\1\125\1\111\1\101\1\172\3\124\1\123\1\107\1\172\1\113\2\172\1\101"+
		"\1\105\1\117\1\105\2\172\1\104\1\105\1\117\1\111\1\uffff\1\117\1\122\1"+
		"\110\1\107\1\124\1\172\1\110\2\172\1\110\1\105\1\104\1\172\1\117\1\172"+
		"\1\uffff\2\172\1\131\1\124\1\uffff\1\71\3\104\1\uffff\1\101\1\106\1\105"+
		"\2\172\1\116\1\124\1\uffff\1\116\1\122\1\117\1\uffff\1\172\2\uffff\1\111"+
		"\1\172\1\123\1\117\1\uffff\2\172\1\124\1\107\1\172\1\127\1\172\1\127\1"+
		"\105\2\172\1\116\1\uffff\1\113\1\110\1\116\1\101\1\172\1\uffff\1\115\1"+
		"\105\1\137\1\172\1\132\2\172\1\126\1\172\1\122\1\117\1\172\1\105\1\103"+
		"\1\uffff\1\116\1\111\1\131\1\172\1\uffff\1\111\1\172\1\122\1\uffff\1\172"+
		"\1\124\1\uffff\1\124\1\116\1\124\1\172\1\uffff\2\172\1\uffff\1\101\2\uffff"+
		"\2\172\1\111\1\172\2\uffff\1\101\1\uffff\1\124\1\172\1\110\1\106\1\105"+
		"\1\126\1\uffff\1\172\2\124\1\172\1\117\1\123\1\124\1\123\1\116\1\124\1"+
		"\111\1\123\1\116\1\104\1\103\2\105\1\103\1\uffff\1\111\1\uffff\1\101\1"+
		"\111\1\105\1\172\1\104\1\122\1\105\2\114\1\116\1\111\1\114\1\124\1\101"+
		"\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\1\120\1\uffff\2\172\1\101\1"+
		"\uffff\1\124\1\131\1\124\2\105\1\107\1\172\1\uffff\1\172\1\uffff\1\172"+
		"\1\uffff\1\127\1\172\1\uffff\1\117\1\uffff\1\172\1\uffff\1\124\1\172\1"+
		"\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124\1\115\1\104"+
		"\2\123\1\172\1\101\1\125\1\104\1\110\1\122\1\uffff\1\122\1\123\2\104\1"+
		"\111\1\122\1\124\1\uffff\1\116\1\uffff\1\172\1\uffff\1\172\2\uffff\1\172"+
		"\1\114\1\122\2\103\1\uffff\1\105\1\uffff\1\172\1\uffff\1\105\1\120\1\105"+
		"\1\104\1\111\1\122\1\124\1\111\1\104\1\uffff\1\105\1\uffff\1\120\1\101"+
		"\1\172\1\uffff\2\172\1\116\1\103\1\116\2\124\1\103\1\116\1\124\1\uffff"+
		"\1\122\2\105\1\172\1\105\1\uffff\1\172\2\uffff\1\104\1\172\1\122\1\116"+
		"\2\uffff\1\101\1\172\1\111\1\116\1\172\1\111\2\105\1\172\1\105\1\uffff"+
		"\1\172\2\uffff\1\101\1\123\1\101\1\172\1\uffff\1\122\2\uffff\1\172\1\uffff"+
		"\1\172\1\105\1\124\1\117\1\103\1\122\1\172\2\uffff\1\124\3\101\1\120\1"+
		"\uffff\1\117\1\uffff\1\172\1\122\2\uffff\1\172\1\116\1\uffff\1\111\1\uffff"+
		"\1\116\1\172\1\131\2\uffff\1\105\1\172\1\111\1\104\1\107\1\uffff\1\105"+
		"\1\172\1\106\1\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1"+
		"\124\1\172\1\101\1\172\1\104\1\172\1\uffff\1\103\1\uffff\1\111\1\uffff"+
		"\1\106\2\172\1\117\3\uffff\1\114\2\uffff\1\117\1\uffff\1\114\1\172\1\123"+
		"\1\uffff\1\172\1\117\2\122\1\101\1\105\1\uffff\1\172\1\111\1\uffff\1\120"+
		"\2\172\1\111\1\107\1\172\1\116\1\123\1\101\1\105\1\124\1\104\1\172\1\105"+
		"\1\102\1\114\1\124\1\172\1\uffff\2\105\1\104\1\124\1\172\1\103\1\102\1"+
		"\105\1\117\1\123\1\115\1\105\1\172\1\105\1\116\2\uffff\1\116\4\172\1\116"+
		"\1\172\2\uffff\1\172\1\101\1\uffff\1\172\1\122\1\uffff\2\172\1\101\2\172"+
		"\1\116\2\172\1\124\1\172\1\124\1\172\1\uffff\1\172\1\114\1\172\1\117\1"+
		"\131\1\126\2\111\1\125\1\120\1\131\1\111\1\124\3\uffff\1\104\1\172\1\101"+
		"\1\105\1\172\1\uffff\3\172\1\127\2\103\1\105\1\115\1\172\1\116\1\172\1"+
		"\103\3\uffff\1\172\2\124\1\172\1\105\1\124\1\125\1\105\1\101\1\122\1\172"+
		"\1\uffff\1\172\1\uffff\1\105\1\uffff\1\172\2\124\1\uffff\1\116\1\107\1"+
		"\uffff\1\101\1\104\1\115\1\uffff\2\172\1\uffff\1\122\1\172\1\124\1\uffff"+
		"\1\111\1\120\1\uffff\1\122\1\105\1\122\1\124\1\172\1\115\1\uffff\1\172"+
		"\1\115\1\124\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\172\1\116"+
		"\1\172\1\117\1\uffff\1\120\1\104\1\uffff\1\126\2\105\1\123\1\uffff\1\122"+
		"\2\172\1\132\1\115\1\105\1\uffff\1\124\1\uffff\1\101\1\uffff\1\172\1\124"+
		"\1\117\1\122\2\uffff\1\122\1\172\1\116\1\172\1\uffff\1\172\1\uffff\1\122"+
		"\1\111\1\172\1\114\1\103\1\uffff\1\117\1\105\2\uffff\1\126\1\105\1\uffff"+
		"\1\172\1\111\1\114\1\104\2\172\1\uffff\1\104\1\105\1\172\1\105\1\uffff"+
		"\1\116\1\104\2\172\1\uffff\1\124\1\125\1\172\1\122\3\105\1\uffff\1\122"+
		"\1\107\1\172\2\uffff\1\172\2\uffff\1\172\2\uffff\1\104\1\uffff\1\117\1"+
		"\uffff\1\172\1\uffff\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1\111\1"+
		"\uffff\1\172\1\uffff\1\111\1\uffff\1\124\1\172\1\105\1\117\1\116\1\122"+
		"\1\101\1\172\1\117\2\172\1\uffff\1\124\1\172\4\uffff\1\105\1\122\1\124"+
		"\1\105\1\172\1\111\1\uffff\1\103\1\uffff\1\113\1\172\1\uffff\1\111\1\172"+
		"\1\uffff\2\172\1\105\1\116\1\111\1\172\2\uffff\1\172\1\uffff\1\172\1\101"+
		"\2\172\1\114\1\172\1\105\1\172\1\uffff\1\172\1\uffff\1\105\1\132\1\101"+
		"\2\172\1\115\1\111\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122\1\172"+
		"\1\101\1\104\1\uffff\1\107\1\uffff\1\111\1\105\1\172\1\105\2\104\1\124"+
		"\1\101\2\uffff\1\101\1\111\1\172\1\111\1\124\1\105\1\122\1\111\1\172\1"+
		"\uffff\1\172\2\uffff\1\115\1\126\1\172\1\124\1\116\1\122\1\105\1\172\1"+
		"\uffff\1\117\2\172\2\uffff\2\172\1\104\1\103\1\172\2\uffff\1\172\1\124"+
		"\1\uffff\1\131\2\172\1\113\1\124\1\172\3\uffff\1\172\1\120\1\101\1\172"+
		"\1\102\1\103\1\uffff\1\116\1\172\1\uffff\1\172\1\116\1\107\1\105\1\114"+
		"\1\uffff\1\116\2\uffff\1\111\1\uffff\1\101\1\111\2\172\1\uffff\1\132\1"+
		"\105\1\172\1\uffff\1\117\2\uffff\1\117\1\uffff\1\172\1\101\1\116\1\104"+
		"\1\124\2\uffff\1\124\1\uffff\1\172\2\uffff\1\111\1\uffff\1\116\1\uffff"+
		"\1\172\1\101\1\122\2\uffff\1\172\1\117\1\114\1\172\1\104\1\172\1\124\1"+
		"\172\1\uffff\1\124\2\172\1\116\1\172\1\uffff\3\172\1\101\1\103\2\124\1"+
		"\uffff\1\117\1\105\1\172\1\115\1\126\2\uffff\1\101\1\105\1\uffff\2\172"+
		"\1\124\1\172\1\uffff\1\116\4\uffff\1\172\1\131\2\uffff\1\105\1\172\1\105"+
		"\1\172\2\uffff\1\172\1\111\2\uffff\1\105\1\102\1\uffff\1\114\1\123\1\107"+
		"\2\uffff\3\172\1\123\1\172\1\117\1\104\1\124\2\uffff\1\101\1\123\1\uffff"+
		"\2\116\1\uffff\2\124\1\172\2\101\1\111\1\uffff\1\132\1\124\1\uffff\1\124"+
		"\1\101\1\uffff\1\116\1\105\1\117\1\uffff\1\172\1\uffff\1\111\1\uffff\1"+
		"\172\2\uffff\1\172\4\uffff\1\115\1\124\1\111\1\172\1\116\1\172\1\uffff"+
		"\1\101\1\105\1\124\1\122\2\uffff\1\111\1\uffff\1\172\1\uffff\2\172\1\uffff"+
		"\1\123\2\uffff\1\105\1\122\1\101\1\105\1\172\1\137\3\uffff\2\172\1\104"+
		"\1\uffff\1\116\2\105\1\124\2\172\1\123\1\105\1\172\1\uffff\2\124\1\115"+
		"\1\105\1\172\1\111\1\114\2\172\1\103\1\uffff\1\105\2\uffff\1\120\1\111"+
		"\1\117\1\uffff\1\172\1\uffff\1\124\1\122\2\172\1\105\3\uffff\1\172\1\123"+
		"\1\124\1\123\1\172\1\uffff\1\120\2\uffff\2\172\2\122\1\111\2\uffff\2\172"+
		"\1\uffff\1\125\2\105\1\104\1\uffff\1\117\1\114\1\172\1\114\2\uffff\1\101"+
		"\1\123\1\172\1\117\1\116\1\uffff\2\172\2\uffff\1\123\1\uffff\1\172\1\111"+
		"\1\105\1\uffff\1\117\2\uffff\2\172\1\117\2\uffff\1\123\1\172\1\123\1\172"+
		"\1\116\1\105\1\uffff\1\172\1\114\1\172\1\uffff\1\116\1\172\2\uffff\1\172"+
		"\1\uffff\1\105\1\172\1\114\2\uffff\1\116\1\172\1\uffff\1\124\1\uffff\1"+
		"\172\1\114\1\uffff\1\124\1\uffff\1\172\2\uffff\1\123\1\uffff\1\111\1\172"+
		"\1\uffff\1\101\1\uffff\1\111\1\132\1\uffff\1\172\1\103\1\uffff\1\115\1"+
		"\123\1\172\1\uffff\1\131\1\120\1\115\1\uffff\3\172\3\uffff";
	static final String DFA35_acceptS =
		"\34\uffff\1\u0152\1\u0153\1\u0154\1\u0155\1\u0156\1\u0157\1\u0158\1\u0159"+
		"\1\u015a\1\u015b\1\u015c\3\uffff\1\u0164\1\uffff\1\u0166\1\u0167\1\u0169"+
		"\1\u016a\1\uffff\1\u016d\1\u016e\4\uffff\1\u0176\1\u0177\1\u0178\46\uffff"+
		"\1\u015e\1\10\114\uffff\1\166\1\u00a2\1\u00a3\1\u016f\3\uffff\1\u0160"+
		"\1\u0161\1\u0162\1\u017a\1\u0163\1\u0179\1\u0165\1\u016c\1\u016b\13\uffff"+
		"\1\u0175\10\uffff\1\114\45\uffff\1\27\21\uffff\1\7\3\uffff\1\43\1\uffff"+
		"\1\u0085\17\uffff\1\13\5\uffff\1\u00b7\2\uffff\1\100\31\uffff\1\u0146"+
		"\4\uffff\1\23\142\uffff\1\u015d\1\u015f\1\uffff\1\u0170\2\uffff\1\u0172"+
		"\2\uffff\1\u0173\3\uffff\1\u0174\30\uffff\1\u00ea\16\uffff\1\u00df\1\uffff"+
		"\1\u00ad\1\uffff\1\u00fe\1\uffff\1\4\1\uffff\1\6\1\12\1\uffff\1\15\1\u0151"+
		"\3\uffff\1\u0088\20\uffff\1\u0084\30\uffff\1\121\20\uffff\1\u00a9\4\uffff"+
		"\1\136\13\uffff\1\u0168\4\uffff\1\u0112\34\uffff\1\u009e\15\uffff\1\u00bf"+
		"\21\uffff\1\u0090\23\uffff\1\154\36\uffff\1\144\17\uffff\1\u012e\4\uffff"+
		"\1\u0171\4\uffff\1\1\7\uffff\1\133\3\uffff\1\u00a7\1\uffff\1\26\1\42\4"+
		"\uffff\1\u008f\14\uffff\1\u00c0\5\uffff\1\u00f9\16\uffff\1\5\4\uffff\1"+
		"\101\3\uffff\1\u00f4\2\uffff\1\u011c\4\uffff\1\11\2\uffff\1\20\1\uffff"+
		"\1\40\1\u00f2\4\uffff\1\u00c1\1\71\1\uffff\1\u00af\6\uffff\1\152\22\uffff"+
		"\1\u00a8\1\uffff\1\16\16\uffff\1\76\1\uffff\1\127\1\uffff\1\112\2\uffff"+
		"\1\u0135\3\uffff\1\u00d0\7\uffff\1\u0114\1\uffff\1\u00a6\1\uffff\1\u0098"+
		"\2\uffff\1\u0111\1\uffff\1\u011b\1\uffff\1\u013c\3\uffff\1\u00f6\1\u00d8"+
		"\2\uffff\1\55\2\uffff\1\66\15\uffff\1\u0150\7\uffff\1\u0149\1\uffff\1"+
		"\u00b1\1\uffff\1\u013e\1\uffff\1\u0144\1\37\5\uffff\1\u0134\1\uffff\1"+
		"\124\1\uffff\1\u00c9\11\uffff\1\u012b\1\uffff\1\155\3\uffff\1\u00fa\12"+
		"\uffff\1\u010a\5\uffff\1\140\1\uffff\1\u0087\1\u00a5\4\uffff\1\u00e8\1"+
		"\56\12\uffff\1\u00f3\1\uffff\1\u0145\1\134\4\uffff\1\u00b5\1\uffff\1\165"+
		"\1\167\1\uffff\1\u010d\7\uffff\1\46\1\u00da\5\uffff\1\2\1\uffff\1\107"+
		"\2\uffff\1\123\1\u0131\2\uffff\1\u0127\1\uffff\1\u00b3\3\uffff\1\67\1"+
		"\u009f\5\uffff\1\63\3\uffff\1\104\1\uffff\1\110\1\142\1\uffff\1\u0100"+
		"\2\uffff\1\u012f\6\uffff\1\17\1\uffff\1\21\1\uffff\1\34\4\uffff\1\u0101"+
		"\1\170\1\u009c\1\uffff\1\u011f\1\61\1\uffff\1\u00c2\3\uffff\1\51\6\uffff"+
		"\1\u00fc\2\uffff\1\164\22\uffff\1\u0093\17\uffff\1\22\1\u00bd\7\uffff"+
		"\1\25\1\u00c8\2\uffff\1\u011d\2\uffff\1\u0097\14\uffff\1\u0117\15\uffff"+
		"\1\u0140\1\u00cb\1\41\5\uffff\1\u00ca\14\uffff\1\u00fb\1\u008a\1\u00cc"+
		"\13\uffff\1\u00d2\1\uffff\1\u0143\1\uffff\1\u0122\3\uffff\1\u0132\2\uffff"+
		"\1\u008e\3\uffff\1\u00b2\2\uffff\1\u0110\3\uffff\1\u00b6\2\uffff\1\u010e"+
		"\6\uffff\1\47\6\uffff\1\160\2\uffff\1\156\4\uffff\1\u012d\2\uffff\1\u00c3"+
		"\4\uffff\1\u00e3\6\uffff\1\u014d\1\uffff\1\u00f8\1\uffff\1\u012c\4\uffff"+
		"\1\u009d\1\u00e0\4\uffff\1\32\1\uffff\1\77\5\uffff\1\73\2\uffff\1\14\1"+
		"\70\2\uffff\1\72\6\uffff\1\177\4\uffff\1\u00b0\4\uffff\1\u013b\7\uffff"+
		"\1\125\3\uffff\1\122\1\u00d1\1\uffff\1\u0083\1\u00ce\1\uffff\1\24\1\u00eb"+
		"\1\uffff\1\30\1\uffff\1\u00ff\1\uffff\1\u0116\1\uffff\1\u00c4\1\151\1"+
		"\uffff\1\137\1\143\1\uffff\1\171\1\uffff\1\u0136\1\uffff\1\u00bb\1\uffff"+
		"\1\u00e6\13\uffff\1\57\2\uffff\1\113\1\146\1\u008b\1\u00be\6\uffff\1\u010c"+
		"\1\uffff\1\u00e7\2\uffff\1\106\2\uffff\1\u0119\6\uffff\1\102\1\105\1\uffff"+
		"\1\u00d4\10\uffff\1\u0115\1\uffff\1\u010b\7\uffff\1\u00d5\1\uffff\1\117"+
		"\7\uffff\1\u0124\1\uffff\1\3\10\uffff\1\u00cd\1\u00db\11\uffff\1\u00d9"+
		"\1\uffff\1\u0096\1\52\10\uffff\1\u0091\3\uffff\1\u0130\1\162\5\uffff\1"+
		"\u00a4\1\u0142\2\uffff\1\u0080\6\uffff\1\116\1\153\1\u00cf\6\uffff\1\u00bc"+
		"\2\uffff\1\u0138\5\uffff\1\u0123\1\uffff\1\u0086\1\53\1\uffff\1\u0089"+
		"\4\uffff\1\u0107\3\uffff\1\50\1\uffff\1\115\1\u00dd\1\uffff\1\u0103\5"+
		"\uffff\1\64\1\u00e5\1\uffff\1\u00ef\1\uffff\1\u00aa\1\u014a\1\uffff\1"+
		"\u0133\1\uffff\1\141\3\uffff\1\u010f\1\u00f7\10\uffff\1\u008d\5\uffff"+
		"\1\u00c7\7\uffff\1\u0141\5\uffff\1\u0139\1\u0081\2\uffff\1\135\4\uffff"+
		"\1\u00fd\1\uffff\1\103\1\u0092\1\u0128\1\111\2\uffff\1\u0099\1\31\4\uffff"+
		"\1\u00b8\1\130\2\uffff\1\u00f5\1\u014b\2\uffff\1\120\3\uffff\1\u0120\1"+
		"\36\10\uffff\1\u00e4\1\u013d\2\uffff\1\u011a\2\uffff\1\u00d3\6\uffff\1"+
		"\75\2\uffff\1\u0129\2\uffff\1\62\3\uffff\1\131\1\uffff\1\u008c\1\uffff"+
		"\1\54\1\uffff\1\u0094\1\u00ee\1\uffff\1\145\1\u00dc\1\u00ec\1\u014e\6"+
		"\uffff\1\33\4\uffff\1\u00b4\1\u011e\1\uffff\1\u00c5\1\uffff\1\157\2\uffff"+
		"\1\60\1\uffff\1\u00b9\1\u0113\6\uffff\1\126\1\u00ed\1\u00c6\3\uffff\1"+
		"\44\11\uffff\1\150\12\uffff\1\161\1\uffff\1\172\1\35\3\uffff\1\u0121\1"+
		"\uffff\1\u012a\5\uffff\1\u013a\1\u0095\1\65\5\uffff\1\u00de\1\uffff\1"+
		"\u0102\1\45\5\uffff\1\u0125\1\163\2\uffff\1\u0126\4\uffff\1\u014c\4\uffff"+
		"\1\u0118\1\u0082\5\uffff\1\u014f\2\uffff\1\173\1\175\1\uffff\1\u00e9\3"+
		"\uffff\1\u00ab\1\uffff\1\147\1\74\3\uffff\1\u0104\1\u00e1\6\uffff\1\u0105"+
		"\3\uffff\1\u00ae\2\uffff\1\174\1\176\1\uffff\1\u009b\3\uffff\1\u00d6\1"+
		"\u00d7\2\uffff\1\u00f0\1\uffff\1\u00ba\2\uffff\1\u0106\1\uffff\1\u00a0"+
		"\1\uffff\1\u0108\1\u00a1\1\uffff\1\u00e2\2\uffff\1\u00ac\1\uffff\1\u0137"+
		"\2\uffff\1\u0147\2\uffff\1\u0109\3\uffff\1\u009a\3\uffff\1\132\3\uffff"+
		"\1\u0148\1\u00f1\1\u013f";
	static final String DFA35_specialS =
		"\63\uffff\1\6\1\7\u0089\uffff\1\2\1\0\1\uffff\1\4\1\1\u00ea\uffff\1\3"+
		"\1\uffff\1\5\u056f\uffff}>";
	static final String[] DFA35_transitionS = {
			"\2\71\2\uffff\1\71\22\uffff\1\71\1\7\1\64\1\uffff\1\31\1\55\1\56\1\63"+
			"\1\40\1\41\1\54\1\52\1\36\1\53\1\34\1\51\1\65\11\66\1\35\1\37\1\47\1"+
			"\46\1\50\1\62\1\uffff\1\4\1\15\1\24\1\13\1\12\1\2\1\14\1\16\1\11\1\22"+
			"\1\30\1\10\1\25\1\5\1\6\1\21\1\33\1\23\1\20\1\1\1\3\1\27\1\17\1\uffff"+
			"\1\32\1\26\1\42\1\uffff\1\43\1\61\1\70\33\uffff\1\44\1\60\1\45\1\57",
			"\1\73\1\77\2\uffff\1\76\2\uffff\1\100\1\75\5\uffff\1\74\2\uffff\1\72",
			"\1\101\3\uffff\1\107\3\uffff\1\104\2\uffff\1\105\2\uffff\1\106\2\uffff"+
			"\1\102\2\uffff\1\103",
			"\1\110\1\uffff\1\113\1\uffff\1\114\1\111\1\112",
			"\1\124\1\125\1\122\1\uffff\1\120\5\uffff\1\115\1\uffff\1\116\1\uffff"+
			"\1\126\1\uffff\1\121\1\117\1\uffff\1\123",
			"\1\127\5\uffff\1\130",
			"\1\135\7\uffff\1\134\1\uffff\1\136\1\uffff\1\131\2\uffff\1\133\1\132"+
			"\1\137",
			"\1\140",
			"\1\143\3\uffff\1\144\3\uffff\1\142\5\uffff\1\145",
			"\1\153\1\uffff\1\146\6\uffff\1\150\1\147\4\uffff\1\151\1\152",
			"\1\157\1\uffff\1\156\4\uffff\1\155\4\uffff\1\154",
			"\1\162\1\165\2\uffff\1\160\3\uffff\1\161\5\uffff\1\164\2\uffff\1\163"+
			"\2\uffff\1\166",
			"\1\167",
			"\1\174\3\uffff\1\172\5\uffff\1\171\5\uffff\1\173\3\uffff\1\170",
			"\1\175\15\uffff\1\176",
			"\1\u0084\3\uffff\1\u0081\2\uffff\1\177\1\u0080\5\uffff\1\u0082\2\uffff"+
			"\1\u0083",
			"\1\u008a\1\uffff\1\u0085\2\uffff\1\u0086\2\uffff\1\u008c\1\uffff\1\u0088"+
			"\1\u008d\1\u0087\3\uffff\1\u008b\1\u0089\1\u008e\3\uffff\1\u008f",
			"\1\u0091\3\uffff\1\u0092\6\uffff\1\u0093\2\uffff\1\u0095\2\uffff\1\u0090"+
			"\2\uffff\1\u0094",
			"\1\u0097\15\uffff\1\u0096",
			"\1\u009c\3\uffff\1\u0099\3\uffff\1\u0098\2\uffff\1\u009b\2\uffff\1\u009a",
			"\1\u00a1\6\uffff\1\u00a0\3\uffff\1\u009e\2\uffff\1\u009d\2\uffff\1\u009f"+
			"\2\uffff\1\u00a2",
			"\1\u00a5\3\uffff\1\u00a4\3\uffff\1\u00a6\5\uffff\1\u00a7\3\uffff\1\u00a3",
			"\1\u00a8",
			"\1\u00a9\3\uffff\1\u00ab\3\uffff\1\u00aa",
			"\1\u00ac\3\uffff\1\u00ad",
			"\1\u00b0\5\uffff\1\u00ae\12\uffff\1\u00af\44\uffff\1\67",
			"\1\u00b2",
			"\1\u00b3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b4\1\140",
			"\1\u00b6",
			"\1\u00b8",
			"",
			"\1\u00ba",
			"",
			"",
			"",
			"",
			"\1\u00bc",
			"",
			"",
			"\47\u00be\1\u00c0\64\u00be\1\u00bf\uffa3\u00be",
			"\42\u00c1\1\u00c3\71\u00c1\1\u00c2\uffa3\u00c1",
			"\1\u00c7\1\uffff\12\u00c6\1\67\6\uffff\1\67\1\u00cb\1\67\1\u00ca\1\u00c8"+
			"\1\67\1\u00cc\3\67\1\u00cc\1\u00c5\1\u00cc\5\67\1\u00c5\4\67\1\u00c4"+
			"\1\u00c5\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cc\2\67\1\u00c8\1\67\1\u00cc"+
			"\3\67\1\u00cc\1\67\1\u00cc\15\67",
			"\1\u00c7\1\uffff\12\u00c6\1\67\6\uffff\1\67\1\u00cb\1\67\1\u00ca\1\u00c8"+
			"\1\67\1\u00cc\3\67\1\u00cc\1\u00c5\1\u00cc\5\67\1\u00c5\5\67\1\u00c5"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cc\2\67\1\u00c8\1\67\1\u00cc\3\67"+
			"\1\u00cc\1\67\1\u00cc\15\67",
			"",
			"",
			"",
			"\1\u00ce\7\uffff\1\u00cf\13\uffff\1\u00cd",
			"\1\u00d0",
			"\13\67\6\uffff\24\67\1\u00d1\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00d4\1\u00d3",
			"\1\u00d6\4\uffff\1\u00d5",
			"\1\u00d7",
			"\1\u00d8",
			"\1\u00d9",
			"\1\u00da",
			"\1\u00db\1\uffff\1\u00dc",
			"\1\u00de\6\uffff\1\u00df\5\uffff\1\u00dd",
			"\1\u00e0",
			"\1\u00e2\5\uffff\1\u00e1",
			"\1\u00e3",
			"\1\u00e9\1\u00ea\1\uffff\1\u00e7\4\uffff\1\u00e5\1\uffff\1\u00e4\1\u00e8"+
			"\1\u00eb\5\uffff\1\u00e6",
			"\1\u00ed\3\uffff\1\u00ec",
			"\1\u00ee",
			"\1\u00ef",
			"\1\u00f0",
			"\1\u00f1\7\uffff\1\u00f2",
			"\1\u00f5\2\uffff\1\u00f3\24\uffff\1\u00f4",
			"\13\67\6\uffff\2\67\1\u00f6\20\67\1\u00f7\6\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u00f9",
			"\1\u00fb\16\uffff\1\u00fa",
			"\1\u00fc\10\uffff\1\u00fd",
			"\1\u00fe",
			"\1\u00ff",
			"\1\u0100",
			"\1\u0101",
			"\1\u0102\3\uffff\1\u0106\1\u0104\1\u0103\1\uffff\1\u0105",
			"\1\u0107\1\u0108",
			"\13\67\6\uffff\3\67\1\u0109\26\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u010b",
			"\1\u010c",
			"\13\67\6\uffff\13\67\1\u010d\16\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\5\67\1\u010f\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0112\16\uffff\1\u0111",
			"\1\u0113",
			"",
			"",
			"\1\u0114\1\uffff\1\u0116\1\u0115",
			"\1\u0117\1\u0118",
			"\1\u0119\14\uffff\1\u011a\2\uffff\1\u011b",
			"\1\u011d\1\uffff\1\u011c\3\uffff\1\u011e\6\uffff\1\u011f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\3\67\1\u0122\11\67\1\u0125\1\67\1\u0123\2\67\1\u0121"+
			"\1\u0124\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0127",
			"\13\67\6\uffff\16\67\1\u0128\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u012a",
			"\1\u012b",
			"\1\u012d\5\uffff\1\u012c\6\uffff\1\u012e\3\uffff\1\u012f",
			"\1\u0130",
			"\1\u0131\2\uffff\1\u0132\1\uffff\1\u0133",
			"\1\u0134",
			"\1\u0138\1\u0136\2\uffff\1\u013a\5\uffff\1\u0137\3\uffff\1\u0139\2\uffff"+
			"\1\u0135\1\u013b",
			"\1\u013d\1\u013c\2\uffff\1\u013e",
			"\1\u013f\4\uffff\1\u0140",
			"\1\u0141",
			"\13\67\6\uffff\24\67\1\u0142\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0144",
			"\1\u0145",
			"\1\u0147\15\uffff\1\u0146",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0149\4\uffff\1\u014a",
			"\1\u014b\6\uffff\1\u014c",
			"\1\u014d",
			"\1\u014e\15\uffff\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0152\3\uffff\1\u0153",
			"\1\u0155\5\uffff\1\u0154",
			"\1\u0156",
			"\1\u0157",
			"\1\u0158",
			"\1\u0159",
			"\1\u015e\10\uffff\1\u015a\1\u015d\4\uffff\1\u015b\1\uffff\1\u015c",
			"\1\u0160\15\uffff\1\u015f",
			"\1\u0161",
			"\1\u0162",
			"\1\u0165\15\uffff\1\u0164\2\uffff\1\u0163",
			"\1\u0166",
			"\1\u0167",
			"\1\u0168",
			"\1\u0169",
			"\1\u016a",
			"\1\u016b",
			"\1\u016c\3\uffff\1\u016e\5\uffff\1\u016d",
			"\1\u016f\1\uffff\1\u0170",
			"\1\u0171",
			"\1\u0173\23\uffff\1\u0172",
			"\1\u0174",
			"\1\u0175",
			"\1\u0176",
			"\1\u0177",
			"\1\u0178",
			"\1\u017c\1\u0179\1\u0180\1\u017d\1\uffff\1\u0185\1\u017e\4\uffff\1\u0184"+
			"\1\uffff\1\u017b\1\u0183\1\u017a\2\uffff\1\u0181\2\uffff\1\u017f\1\u0182",
			"\1\u0187\12\uffff\1\u0186",
			"\1\u0188",
			"\1\u0189",
			"\1\u018a\1\u018b\1\u018c",
			"\1\u018d",
			"\1\u018e\11\uffff\1\u018f",
			"\1\u0190\3\uffff\1\u0191",
			"\1\u0193\17\uffff\1\u0192",
			"\1\u0195\17\uffff\1\u0194",
			"\1\u0196",
			"\1\u0198\1\uffff\1\u0197",
			"\1\u019a\12\uffff\1\u019c\1\uffff\1\u0199\3\uffff\1\u019b",
			"\1\u019d",
			"\1\u019f\3\uffff\1\u019e\3\uffff\1\u01a0",
			"\1\u01a1",
			"\1\u01a3\5\uffff\1\u01a2",
			"\1\u01a4",
			"\1\u01a5",
			"\1\u01a6",
			"\1\u01a7",
			"",
			"",
			"",
			"",
			"\1\u01a8",
			"\1\u01aa\3\uffff\1\u01a9",
			"\1\u01ab",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u00be\1\u00c0\64\u00be\1\u00bf\uffa3\u00be",
			"\0\u01ad",
			"\1\64\4\uffff\1\63",
			"\42\u00c1\1\u00c3\71\u00c1\1\u00c2\uffa3\u00c1",
			"\0\u01af",
			"\1\64\4\uffff\1\63",
			"\12\u01b0\7\uffff\6\u01b0\32\uffff\6\u01b0",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00c7\1\uffff\12\u00c6\1\67\6\uffff\1\67\1\u00cb\1\67\1\u00ca\1\u00c8"+
			"\1\67\1\u00cc\3\67\1\u00cc\1\u00c5\1\u00cc\5\67\1\u00c5\5\67\1\u00c5"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cc\2\67\1\u00c8\1\67\1\u00cc\3\67"+
			"\1\u00cc\1\67\1\u00cc\15\67",
			"\12\u01b2\10\uffff\1\u01b4\1\uffff\1\u01b4\1\u01b3\37\uffff\1\u01b3",
			"\1\u01b5\1\uffff\1\u01b5\2\uffff\12\u01b6",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\3\67\1\u01b7\26\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01b9\10\uffff\1\u01ba",
			"\1\u01bb",
			"\1\u01bc",
			"\1\u01bd",
			"\1\u01be",
			"",
			"\1\u01bf",
			"\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc\15\uffff\1\u01cd",
			"\13\67\6\uffff\2\67\1\u01d0\1\67\1\u01cf\7\67\1\u01ce\15\67\4\uffff"+
			"\1\67\1\uffff\32\67",
			"\1\u01d2",
			"\1\u01d3",
			"\1\u01d4",
			"\1\u01d6\1\uffff\1\u01d5",
			"\1\u01d7\3\uffff\1\u01d8",
			"\1\u01d9",
			"\1\u01da",
			"\1\u01db",
			"\1\u01dc",
			"\1\u01dd",
			"\1\u01de",
			"\13\67\6\uffff\21\67\1\u01df\10\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\u01e1\1\uffff\32\67",
			"\1\u01e3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\16\67\1\u01e5\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01e7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01ea",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01f1",
			"\1\u01f2\6\uffff\1\u01f3",
			"\1\u01f4",
			"\1\u01f5",
			"\1\u01f6",
			"\1\u01f7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"",
			"\1\u01fe",
			"\13\67\6\uffff\4\67\1\u01ff\12\67\1\u0200\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u0202",
			"",
			"\1\u0203",
			"",
			"\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a",
			"\1\u020b",
			"\1\u020c",
			"\1\u020d",
			"\1\u020e",
			"\1\u020f\11\uffff\1\u0210",
			"\1\u0211",
			"\1\u0212",
			"\1\u0213",
			"",
			"\1\u0214",
			"\1\u0215",
			"\1\u0216\23\uffff\1\u0217",
			"\13\67\6\uffff\4\67\1\u0218\11\67\1\u0219\13\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u021b",
			"",
			"\1\u021c",
			"\1\u021d",
			"",
			"\1\u021e",
			"\1\u021f",
			"\1\u0220",
			"\1\u0221\2\uffff\1\u0223\3\uffff\1\u0222",
			"\1\u0225\2\uffff\1\u0224\2\uffff\1\u0226",
			"\1\u0227\14\uffff\1\u0228",
			"\1\u0229",
			"\1\u022a",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u022c",
			"\1\u022d",
			"\1\u022e",
			"\13\67\6\uffff\10\67\1\u022f\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0232\3\uffff\1\u0231",
			"\1\u0233",
			"\1\u0234",
			"\1\u0237\3\uffff\1\u0235\3\uffff\1\u0236",
			"\1\u0238",
			"\1\u023a\22\uffff\1\u0239",
			"\1\u023b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u023d\3\uffff\1\u023e",
			"\13\67\6\uffff\16\67\1\u0240\3\67\1\u023f\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u0242",
			"\1\u0243",
			"",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0247",
			"",
			"\1\u0248",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0252\3\uffff\1\u0251",
			"\1\u0253",
			"\1\u0254",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025b\21\uffff\1\u025c",
			"\13\67\6\uffff\22\67\1\u025d\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u025f",
			"\1\u0260",
			"\1\u0261",
			"\1\u0262",
			"\1\u0263",
			"\1\u0264",
			"\1\u0267\3\uffff\1\u0265\13\uffff\1\u0266",
			"\1\u0268",
			"\1\u026a\1\uffff\1\u0269",
			"\1\u026b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\1\u0272\17\uffff\1\u0271",
			"\1\u0273",
			"\1\u0275\1\u0274",
			"\1\u0276",
			"\1\u0277",
			"\1\u0278",
			"\1\u0279",
			"\1\u027a",
			"\1\u027b",
			"\1\u027c",
			"\1\u027d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281\12\uffff\1\u0282",
			"\1\u0283",
			"\1\u0285\7\uffff\1\u0284",
			"\1\u0286",
			"\1\u0287",
			"\1\u0288",
			"\1\u0289",
			"\1\u028b\4\uffff\1\u028a",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e\11\uffff\1\u028f",
			"\1\u0290",
			"\13\67\6\uffff\22\67\1\u0291\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0294\6\uffff\1\u0293",
			"\1\u0295",
			"\1\u0296",
			"\1\u0298\10\uffff\1\u0297",
			"\1\u0299\2\uffff\1\u029a",
			"\1\u029c\2\uffff\1\u029d\14\uffff\1\u029e\1\u029b",
			"\1\u029f",
			"\1\u02a0",
			"\1\u02a1",
			"\1\u02a2\3\uffff\1\u02a3",
			"\1\u02a4",
			"\1\u02a7\1\uffff\1\u02a6\16\uffff\1\u02a5",
			"\1\u02a8",
			"\1\u02aa\1\u02a9",
			"\1\u02ab",
			"\1\u02ac",
			"\1\u02ad",
			"\1\u02ae",
			"\13\67\6\uffff\11\67\1\u02af\5\67\1\u02b0\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u02b2",
			"\1\u02b4\1\uffff\1\u02b3",
			"\1\u02b5",
			"\1\u02b6",
			"\1\u02b7",
			"\1\u02b8",
			"\1\u02b9",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bd\13\uffff\1\u02bc",
			"\1\u02be",
			"\1\u02bf",
			"\13\67\6\uffff\22\67\1\u02c0\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c4",
			"\1\u02c5",
			"",
			"",
			"\47\u00be\1\u00c0\64\u00be\1\u00bf\uffa3\u00be",
			"",
			"\42\u00c1\1\u00c3\71\u00c1\1\u00c2\uffa3\u00c1",
			"\12\u01b0\1\67\6\uffff\6\u01b0\24\67\4\uffff\1\67\1\uffff\6\u01b0\24"+
			"\67",
			"",
			"\12\u01b2\10\uffff\1\u01b4\1\uffff\1\u01b4\1\u01b3\37\uffff\1\u01b3",
			"\1\u02c7\1\uffff\1\u02c7\2\uffff\12\u02c8",
			"",
			"\12\u02c9",
			"\12\u01b6\1\67\6\uffff\1\67\1\u02ca\1\67\1\u00ca\26\67\4\uffff\1\67"+
			"\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02cc",
			"\1\u02cd",
			"\1\u02ce",
			"\1\u02cf",
			"\1\u02d0",
			"\1\u02d1",
			"\13\67\6\uffff\22\67\1\u02d2\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d8",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02db",
			"\1\u02dc",
			"\1\u02dd",
			"\13\67\6\uffff\5\67\1\u02de\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02e0",
			"\1\u02e1",
			"\1\u02e2",
			"\1\u02e3",
			"\1\u02e4",
			"",
			"\1\u02e5",
			"\1\u02e6",
			"\1\u02e7",
			"\1\u02e8",
			"\1\u02e9",
			"\1\u02ea",
			"\1\u02eb",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"\1\u02f0",
			"\1\u02f1",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u02f3",
			"",
			"\1\u02f4",
			"",
			"\1\u02f5",
			"",
			"\1\u02f6",
			"",
			"",
			"\1\u02f7",
			"",
			"",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"",
			"\1\u02fb",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\1\u02ff",
			"\1\u0300",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0302",
			"\1\u0303",
			"\1\u0304",
			"\13\67\6\uffff\22\67\1\u0305\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0307",
			"\1\u0308",
			"\13\67\6\uffff\26\67\1\u0309\3\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030b",
			"\1\u030c",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030e",
			"\1\u030f",
			"\1\u0310",
			"\1\u0311",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0313",
			"\1\u0314",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0316",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0319",
			"\1\u031a\7\uffff\1\u031b",
			"\13\67\6\uffff\22\67\1\u031c\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0321",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325\12\uffff\1\u0326",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u032e",
			"\1\u032f",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"\1\u0335\3\uffff\1\u0334",
			"\1\u0336",
			"\1\u0337",
			"\1\u0338",
			"",
			"\1\u0339",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\21\67\1\u033b\10\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u033d",
			"",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342",
			"\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"\1\u0346\10\uffff\1\u0347",
			"\1\u0348",
			"\1\u0349",
			"",
			"\13\67\6\uffff\1\67\1\u034a\30\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\23\67\1\u034c\6\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034e",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0350",
			"\1\u0351",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0357",
			"\1\u0358",
			"\1\u0359",
			"\1\u035a",
			"\1\u035b",
			"\1\u035c",
			"\13\67\6\uffff\22\67\1\u035d\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0361",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0363",
			"\13\67\6\uffff\22\67\1\u0364\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\13\67\1\u0366\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0368",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036a",
			"\1\u036b",
			"\1\u036c",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036f",
			"\13\67\6\uffff\32\67\4\uffff\1\u0370\1\uffff\32\67",
			"\1\u0372",
			"\13\67\6\uffff\4\67\1\u0373\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0375",
			"\1\u0376",
			"\1\u0377",
			"\1\u0378",
			"\1\u0379",
			"\1\u037a\13\uffff\1\u037b",
			"\1\u037c",
			"\1\u037e\10\uffff\1\u037d",
			"",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0383",
			"\1\u0385\3\uffff\1\u0384",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\1\u0389",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\22\67\1\u038d\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u038f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0392",
			"\1\u0393",
			"\1\u0394",
			"\13\67\6\uffff\1\u0396\7\67\1\u0395\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0398",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\22\67\1\u039a\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\1\u039f",
			"\1\u03a0",
			"\1\u03a1",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a6",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03a9\22\uffff\1\u03a8",
			"\13\67\6\uffff\22\67\1\u03aa\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ac",
			"\1\u03ad",
			"\1\u03ae",
			"\1\u03af",
			"\1\u03b0\3\uffff\1\u03b1",
			"\1\u03b3\23\uffff\1\u03b2",
			"\1\u03b4",
			"\1\u03b5",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9",
			"\1\u03ba",
			"\1\u03bb",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03bd",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c0",
			"\1\u03c1",
			"\1\u03c2",
			"\1\u03c3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c6",
			"\1\u03c7",
			"\1\u03c8",
			"\1\u03c9",
			"",
			"\1\u03ca",
			"\1\u03cb",
			"\1\u03cc",
			"\1\u03cd",
			"\1\u03ce\1\u03cf",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d1",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d4",
			"\1\u03d5",
			"\1\u03d6",
			"\13\67\6\uffff\22\67\1\u03d7\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\22\67\1\u03dc\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03de",
			"\1\u03df",
			"",
			"\12\u02c8",
			"\12\u02c8\10\uffff\1\u01b4\1\uffff\1\u01b4",
			"\12\u02c9\10\uffff\1\u01b4\1\uffff\1\u01b4",
			"\1\u01b7",
			"",
			"\1\u03e0",
			"\1\u03e2\4\uffff\1\u03e1",
			"\1\u03e3",
			"\13\67\6\uffff\22\67\1\u03e4\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03e7",
			"\1\u03e8",
			"",
			"\1\u03e9",
			"\1\u03ea",
			"\1\u03eb",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u03ed",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03ef",
			"\1\u03f0",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f3",
			"\1\u03f4",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f6",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f8",
			"\1\u03f9",
			"\13\67\6\uffff\23\67\1\u03fa\6\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fd",
			"",
			"\1\u03fe",
			"\1\u03ff",
			"\1\u0400",
			"\1\u0401",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0403",
			"\1\u0404",
			"\1\u0405",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0407",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040a",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040c",
			"\1\u040d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040f\3\uffff\1\u0410",
			"\1\u0411",
			"",
			"\1\u0412",
			"\1\u0413",
			"\1\u0414",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0416",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0418",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u041a",
			"",
			"\1\u041b",
			"\1\u041c",
			"\1\u041d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0421",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0424",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0426",
			"",
			"\1\u0427",
			"\13\67\6\uffff\4\67\1\u0428\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u042a",
			"\1\u042c\1\uffff\1\u042b",
			"\1\u042d",
			"\1\u042f\2\uffff\1\u042e",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0431",
			"\1\u0432",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"\1\u0441",
			"",
			"\1\u0442",
			"",
			"\1\u0443",
			"\1\u0444",
			"\1\u0445",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"",
			"\1\u0451",
			"",
			"\1\u0452",
			"",
			"\1\u0453",
			"\1\u0454",
			"",
			"\13\67\6\uffff\10\67\1\u0455\21\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0458",
			"",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0461",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0462",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0464",
			"\13\67\6\uffff\17\67\1\u0465\12\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0467",
			"",
			"",
			"\1\u0468",
			"\1\u0469",
			"",
			"\1\u046a",
			"\1\u046b",
			"",
			"\1\u046c",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"",
			"\1\u0479",
			"\1\u047a",
			"\1\u047b",
			"\1\u047c",
			"\1\u047d",
			"\1\u047e",
			"\1\u047f",
			"",
			"\1\u0480",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487",
			"",
			"\1\u0488",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u048a",
			"\1\u048b",
			"\1\u048c",
			"\1\u048d",
			"\1\u048e",
			"\1\u048f",
			"\1\u0490",
			"\1\u0491",
			"\1\u0492",
			"",
			"\1\u0493",
			"",
			"\1\u0494",
			"\1\u0495",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0499",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\1\u049f",
			"\1\u04a0",
			"",
			"\1\u04a1",
			"\1\u04a2",
			"\1\u04a3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04a5",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04a7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04a9",
			"\1\u04aa",
			"",
			"",
			"\1\u04ab",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ad",
			"\1\u04ae",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04b0",
			"\1\u04b1",
			"\1\u04b2",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04b4",
			"",
			"\13\67\6\uffff\22\67\1\u04b5\7\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04b7",
			"\1\u04b8",
			"\1\u04b9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04bb",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\u04bc\1\uffff\32\67",
			"\1\u04be",
			"\1\u04bf",
			"\1\u04c0",
			"\1\u04c1",
			"\1\u04c2",
			"\13\67\6\uffff\1\u04c3\31\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04c5",
			"\1\u04c6",
			"\1\u04c7",
			"\1\u04c8",
			"\1\u04c9",
			"",
			"\1\u04ca",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04cc",
			"",
			"",
			"\13\67\6\uffff\23\67\1\u04cd\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04cf",
			"",
			"\1\u04d0",
			"",
			"\1\u04d1",
			"\13\67\6\uffff\11\67\1\u04d2\20\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04d4",
			"",
			"",
			"\1\u04d5",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04d7",
			"\1\u04d8",
			"\1\u04d9",
			"",
			"\1\u04da",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04dc",
			"",
			"\1\u04dd",
			"",
			"",
			"\1\u04de",
			"",
			"\1\u04df",
			"\1\u04e0",
			"",
			"\1\u04e1",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e5",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04e7",
			"",
			"\1\u04e8",
			"",
			"\1\u04ea\1\uffff\1\u04e9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ed",
			"",
			"",
			"",
			"\1\u04ee",
			"",
			"",
			"\1\u04ef",
			"",
			"\1\u04f0",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f2",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f4",
			"\1\u04f5",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04fa",
			"",
			"\1\u04fb",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04fe",
			"\1\u04ff",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0501",
			"\1\u0502",
			"\1\u0503",
			"\1\u0504",
			"\1\u0505",
			"\1\u0506",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0508",
			"\1\u0509",
			"\1\u050a",
			"\1\u050b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u050d",
			"\1\u050e",
			"\1\u050f",
			"\1\u0510",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0512",
			"\1\u0513",
			"\1\u0514",
			"\1\u0515",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u051a",
			"\1\u051b",
			"",
			"",
			"\1\u051c",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\22\67\1\u051f\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0522",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0525",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0527",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\22\67\1\u0529\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052e",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0531",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0533",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\22\67\1\u0535\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0537",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0539",
			"\1\u053a",
			"\1\u053b",
			"\1\u053c",
			"\1\u053d",
			"\1\u053e",
			"\1\u053f",
			"\1\u0540",
			"\1\u0541",
			"\1\u0542",
			"",
			"",
			"",
			"\1\u0543",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0545",
			"\1\u0546",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u054b\4\uffff\1\u054c",
			"\1\u054d",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0552",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0554",
			"",
			"",
			"",
			"\13\67\6\uffff\22\67\1\u0555\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0557",
			"\1\u0558",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u055a",
			"\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\1\u055e",
			"\1\u055f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0562",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0564",
			"\1\u0565",
			"",
			"\1\u0566",
			"\1\u0567",
			"",
			"\1\u0568",
			"\1\u0569",
			"\1\u056a",
			"",
			"\13\67\6\uffff\22\67\1\u056b\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u056d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u056f",
			"",
			"\1\u0570",
			"\1\u0571",
			"",
			"\1\u0572",
			"\1\u0573",
			"\1\u0574",
			"\1\u0575",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0577",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0579",
			"\1\u057a",
			"\1\u057b",
			"\1\u057c",
			"\1\u057d",
			"",
			"\1\u057e",
			"\1\u057f",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0581",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0583",
			"",
			"\1\u0584",
			"\1\u0585",
			"",
			"\1\u0586",
			"\1\u0587",
			"\1\u0588",
			"\1\u0589",
			"",
			"\1\u058a",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u058d",
			"\1\u058e",
			"\1\u058f",
			"",
			"\1\u0590",
			"",
			"\1\u0591",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0592",
			"\1\u0593",
			"\1\u0594",
			"",
			"",
			"\1\u0595",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0597",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u059a",
			"\1\u059b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u059c",
			"\1\u059d",
			"",
			"\1\u059e",
			"\1\u059f",
			"",
			"",
			"\1\u05a0",
			"\1\u05a1",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05a3",
			"\1\u05a4",
			"\1\u05a5",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05a8",
			"\1\u05a9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05aa",
			"",
			"\1\u05ab",
			"\1\u05ac",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05af",
			"\1\u05b0",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05b2",
			"\1\u05b3",
			"\1\u05b4",
			"\1\u05b5",
			"",
			"\1\u05b6",
			"\1\u05b7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u05bb",
			"",
			"\1\u05bc",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05bd",
			"",
			"",
			"\1\u05be",
			"",
			"",
			"\1\u05bf",
			"",
			"\1\u05c0",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05c2",
			"",
			"\1\u05c3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05c5",
			"\1\u05c6",
			"\1\u05c7",
			"\1\u05c8",
			"\1\u05c9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05cb",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ce",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u05d0",
			"\1\u05d1",
			"\1\u05d2",
			"\1\u05d3",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05d5",
			"",
			"\1\u05d6",
			"",
			"\1\u05d7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05d9",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\10\67\1\u05dc\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05de",
			"\1\u05df",
			"\1\u05e0",
			"\13\67\6\uffff\4\67\1\u05e1\15\67\1\u05e2\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\u05e5\1\uffff\32\67",
			"\1\u05e7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ea",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ec",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ee",
			"\1\u05ef",
			"\1\u05f0",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05f3",
			"\1\u05f4",
			"",
			"\1\u05f5",
			"",
			"\1\u05f6",
			"\1\u05f7",
			"\1\u05f8",
			"\1\u05f9",
			"\13\67\6\uffff\22\67\1\u05fa\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05fc",
			"\1\u05fd",
			"",
			"\1\u05fe",
			"",
			"\1\u05ff",
			"\1\u0600",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0602",
			"\1\u0603",
			"\1\u0604",
			"\1\u0605",
			"\1\u0606",
			"",
			"",
			"\1\u0607",
			"\1\u0608",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u060a",
			"\1\u060b",
			"\1\u060c",
			"\1\u060d",
			"\1\u060e",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0611",
			"\1\u0612",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0614",
			"\1\u0615",
			"\1\u0616",
			"\1\u0617",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0619",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u061e",
			"\1\u061f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0622",
			"",
			"\1\u0624\17\uffff\1\u0623",
			"\13\67\6\uffff\22\67\1\u0625\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0628",
			"\1\u0629",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u062c",
			"\1\u062d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u062f",
			"\1\u0630",
			"",
			"\1\u0631",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0634",
			"\1\u0635",
			"\1\u0636",
			"\1\u0637",
			"",
			"\1\u0638",
			"",
			"",
			"\1\u0639",
			"",
			"\1\u063a",
			"\1\u063b",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u063e",
			"\1\u063f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0641",
			"",
			"",
			"\1\u0642",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0644",
			"\1\u0645",
			"\1\u0646",
			"\1\u0647",
			"",
			"",
			"\1\u0648\17\uffff\1\u0649",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u064b",
			"",
			"\1\u064c",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u064e",
			"\1\u064f",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0651",
			"\1\u0652",
			"\13\67\6\uffff\13\67\1\u0653\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0655",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0657",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0659",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u065c",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0661",
			"\1\u0662",
			"\1\u0663",
			"\1\u0664",
			"",
			"\1\u0665",
			"\1\u0666",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0668",
			"\1\u0669",
			"",
			"",
			"\1\u066a",
			"\1\u066b",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u066e",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0670",
			"",
			"",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0672",
			"",
			"",
			"\1\u0673",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0675",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0678",
			"",
			"",
			"\1\u0679",
			"\1\u067a",
			"",
			"\1\u067b",
			"\1\u067c",
			"\1\u067d",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0681",
			"\13\67\6\uffff\4\67\1\u0683\15\67\1\u0682\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u0685",
			"\1\u0686",
			"\1\u0687",
			"",
			"",
			"\1\u0688",
			"\1\u0689",
			"",
			"\1\u068a",
			"\1\u068b",
			"",
			"\1\u068c",
			"\1\u068d",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u068f",
			"\1\u0690",
			"\1\u0691",
			"",
			"\1\u0692",
			"\1\u0693",
			"",
			"\1\u0694",
			"\1\u0695",
			"",
			"\1\u0696",
			"\1\u0697",
			"\1\u0698",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u069a",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u069d",
			"\1\u069e",
			"\1\u069f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06a1",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06a3",
			"\1\u06a4",
			"\1\u06a5",
			"\1\u06a6",
			"",
			"",
			"\1\u06a7",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06ab",
			"",
			"",
			"\1\u06ac",
			"\1\u06ad",
			"\1\u06ae",
			"\1\u06af",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06b1",
			"",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06b4",
			"",
			"\1\u06b5",
			"\1\u06b6",
			"\1\u06b7",
			"\1\u06b8",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06bb",
			"\1\u06bc",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06be",
			"\1\u06bf",
			"\1\u06c0",
			"\1\u06c1",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06c3",
			"\1\u06c4",
			"\13\67\6\uffff\1\u06c6\21\67\1\u06c5\7\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06c9",
			"",
			"\1\u06ca",
			"",
			"",
			"\1\u06cb",
			"\1\u06cc",
			"\1\u06cd",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06cf",
			"\1\u06d0",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d3",
			"",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d5",
			"\1\u06d6",
			"\1\u06d7",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06d9",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06dc",
			"\1\u06dd",
			"\1\u06de",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06e1",
			"\1\u06e2",
			"\1\u06e3",
			"\1\u06e4",
			"",
			"\1\u06e5",
			"\1\u06e6",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06e8",
			"",
			"",
			"\1\u06e9",
			"\1\u06ea",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06ec",
			"\1\u06ed",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u06f0",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06f2",
			"\1\u06f3",
			"",
			"\1\u06f4",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06f7",
			"",
			"",
			"\1\u06f8",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06fa",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06fc",
			"\1\u06fd",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06ff",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0701",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0704",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0706",
			"",
			"",
			"\1\u0707",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0709",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u070b",
			"",
			"\1\u070c",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u070e",
			"",
			"\1\u070f",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0711",
			"",
			"\1\u0712",
			"\1\u0713",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0715",
			"",
			"\1\u0716",
			"\1\u0717",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0719",
			"\1\u071a",
			"\1\u071b",
			"",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\13\67\6\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			""
	};

	static final short[] DFA35_eot = DFA.unpackEncodedString(DFA35_eotS);
	static final short[] DFA35_eof = DFA.unpackEncodedString(DFA35_eofS);
	static final char[] DFA35_min = DFA.unpackEncodedStringToUnsignedChars(DFA35_minS);
	static final char[] DFA35_max = DFA.unpackEncodedStringToUnsignedChars(DFA35_maxS);
	static final short[] DFA35_accept = DFA.unpackEncodedString(DFA35_acceptS);
	static final short[] DFA35_special = DFA.unpackEncodedString(DFA35_specialS);
	static final short[][] DFA35_transition;

	static {
		int numStates = DFA35_transitionS.length;
		DFA35_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA35_transition[i] = DFA.unpackEncodedString(DFA35_transitionS[i]);
		}
	}

	protected class DFA35 extends DFA {

		public DFA35(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 35;
			this.eot = DFA35_eot;
			this.eof = DFA35_eof;
			this.min = DFA35_min;
			this.max = DFA35_max;
			this.accept = DFA35_accept;
			this.special = DFA35_special;
			this.transition = DFA35_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_REAL | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_LOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_AST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA35_191 = input.LA(1);
						s = -1;
						if ( ((LA35_191 >= '\u0000' && LA35_191 <= '\uFFFF')) ) {s = 429;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA35_194 = input.LA(1);
						s = -1;
						if ( ((LA35_194 >= '\u0000' && LA35_194 <= '\uFFFF')) ) {s = 431;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA35_190 = input.LA(1);
						s = -1;
						if ( (LA35_190=='\'') ) {s = 192;}
						else if ( ((LA35_190 >= '\u0000' && LA35_190 <= '&')||(LA35_190 >= '(' && LA35_190 <= '[')||(LA35_190 >= ']' && LA35_190 <= '\uFFFF')) ) {s = 190;}
						else if ( (LA35_190=='\\') ) {s = 191;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA35_429 = input.LA(1);
						s = -1;
						if ( (LA35_429=='\'') ) {s = 192;}
						else if ( ((LA35_429 >= '\u0000' && LA35_429 <= '&')||(LA35_429 >= '(' && LA35_429 <= '[')||(LA35_429 >= ']' && LA35_429 <= '\uFFFF')) ) {s = 190;}
						else if ( (LA35_429=='\\') ) {s = 191;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA35_193 = input.LA(1);
						s = -1;
						if ( (LA35_193=='\"') ) {s = 195;}
						else if ( ((LA35_193 >= '\u0000' && LA35_193 <= '!')||(LA35_193 >= '#' && LA35_193 <= '[')||(LA35_193 >= ']' && LA35_193 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA35_193=='\\') ) {s = 194;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA35_431 = input.LA(1);
						s = -1;
						if ( (LA35_431=='\"') ) {s = 195;}
						else if ( ((LA35_431 >= '\u0000' && LA35_431 <= '!')||(LA35_431 >= '#' && LA35_431 <= '[')||(LA35_431 >= ']' && LA35_431 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA35_431=='\\') ) {s = 194;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA35_51 = input.LA(1);
						s = -1;
						if ( ((LA35_51 >= '\u0000' && LA35_51 <= '&')||(LA35_51 >= '(' && LA35_51 <= '[')||(LA35_51 >= ']' && LA35_51 <= '\uFFFF')) ) {s = 190;}
						else if ( (LA35_51=='\\') ) {s = 191;}
						else if ( (LA35_51=='\'') ) {s = 192;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA35_52 = input.LA(1);
						s = -1;
						if ( ((LA35_52 >= '\u0000' && LA35_52 <= '!')||(LA35_52 >= '#' && LA35_52 <= '[')||(LA35_52 >= ']' && LA35_52 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA35_52=='\\') ) {s = 194;}
						else if ( (LA35_52=='\"') ) {s = 195;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 35, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
