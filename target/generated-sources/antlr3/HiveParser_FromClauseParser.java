// $ANTLR 3.5.2 FromClauseParser.g 2020-04-30 21:25:01

package whomm.hsqlformat.hive.parse;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


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
public class HiveParser_FromClauseParser extends Parser {
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
	public static final int KW_BATCH=424;
	public static final int KW_DAYOFWEEK=461;
	public static final int KW_HOLD_DDLTIME=509;
	public static final int KW_IGNORE=513;
	public static final int KW_NO_DROP=560;
	public static final int KW_OFFLINE=564;
	public static final int KW_PROTECTION=590;
	public static final int KW_READONLY=597;
	public static final int KW_TIMESTAMPTZ=658;
	public static final int TOK_ABORT_TRANSACTIONS=719;
	public static final int TOK_ACTIVATE=720;
	public static final int TOK_ADD_TRIGGER=721;
	public static final int TOK_ADMIN_OPTION_FOR=722;
	public static final int TOK_ALIASLIST=723;
	public static final int TOK_ALLCOLREF=724;
	public static final int TOK_ALLOC_FRACTION=725;
	public static final int TOK_ALTERDATABASE_LOCATION=726;
	public static final int TOK_ALTERDATABASE_OWNER=727;
	public static final int TOK_ALTERDATABASE_PROPERTIES=728;
	public static final int TOK_ALTERTABLE=729;
	public static final int TOK_ALTERTABLE_ADDCOLS=730;
	public static final int TOK_ALTERTABLE_ADDCONSTRAINT=731;
	public static final int TOK_ALTERTABLE_ADDPARTS=732;
	public static final int TOK_ALTERTABLE_ARCHIVE=733;
	public static final int TOK_ALTERTABLE_BUCKETS=734;
	public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=735;
	public static final int TOK_ALTERTABLE_CLUSTER_SORT=736;
	public static final int TOK_ALTERTABLE_COMPACT=737;
	public static final int TOK_ALTERTABLE_DROPCONSTRAINT=738;
	public static final int TOK_ALTERTABLE_DROPPARTS=739;
	public static final int TOK_ALTERTABLE_DROPPROPERTIES=740;
	public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=741;
	public static final int TOK_ALTERTABLE_FILEFORMAT=742;
	public static final int TOK_ALTERTABLE_LOCATION=743;
	public static final int TOK_ALTERTABLE_MERGEFILES=744;
	public static final int TOK_ALTERTABLE_OWNER=745;
	public static final int TOK_ALTERTABLE_PARTCOLTYPE=746;
	public static final int TOK_ALTERTABLE_PROPERTIES=747;
	public static final int TOK_ALTERTABLE_RENAME=748;
	public static final int TOK_ALTERTABLE_RENAMECOL=749;
	public static final int TOK_ALTERTABLE_RENAMEPART=750;
	public static final int TOK_ALTERTABLE_REPLACECOLS=751;
	public static final int TOK_ALTERTABLE_SERDEPROPERTIES=752;
	public static final int TOK_ALTERTABLE_SERIALIZER=753;
	public static final int TOK_ALTERTABLE_SKEWED=754;
	public static final int TOK_ALTERTABLE_SKEWED_LOCATION=755;
	public static final int TOK_ALTERTABLE_TOUCH=756;
	public static final int TOK_ALTERTABLE_UNARCHIVE=757;
	public static final int TOK_ALTERTABLE_UPDATECOLSTATS=758;
	public static final int TOK_ALTERTABLE_UPDATECOLUMNS=759;
	public static final int TOK_ALTERTABLE_UPDATESTATS=760;
	public static final int TOK_ALTERVIEW=761;
	public static final int TOK_ALTERVIEW_ADDPARTS=762;
	public static final int TOK_ALTERVIEW_DROPPARTS=763;
	public static final int TOK_ALTERVIEW_DROPPROPERTIES=764;
	public static final int TOK_ALTERVIEW_PROPERTIES=765;
	public static final int TOK_ALTERVIEW_RENAME=766;
	public static final int TOK_ALTER_MAPPING=767;
	public static final int TOK_ALTER_MATERIALIZED_VIEW=768;
	public static final int TOK_ALTER_MATERIALIZED_VIEW_REBUILD=769;
	public static final int TOK_ALTER_MATERIALIZED_VIEW_REWRITE=770;
	public static final int TOK_ALTER_POOL=771;
	public static final int TOK_ALTER_RP=772;
	public static final int TOK_ALTER_TRIGGER=773;
	public static final int TOK_ANALYZE=774;
	public static final int TOK_ARCHIVE=775;
	public static final int TOK_BIGINT=776;
	public static final int TOK_BINARY=777;
	public static final int TOK_BLOCKING=778;
	public static final int TOK_BOOLEAN=779;
	public static final int TOK_CACHE_METADATA=780;
	public static final int TOK_CASCADE=781;
	public static final int TOK_CHAR=782;
	public static final int TOK_CHARSETLITERAL=783;
	public static final int TOK_CHECK_CONSTRAINT=784;
	public static final int TOK_CLUSTERBY=785;
	public static final int TOK_COLTYPELIST=786;
	public static final int TOK_COL_NAME=787;
	public static final int TOK_COMMIT=788;
	public static final int TOK_CONSTRAINT_NAME=789;
	public static final int TOK_CREATEDATABASE=790;
	public static final int TOK_CREATEFUNCTION=791;
	public static final int TOK_CREATEMACRO=792;
	public static final int TOK_CREATEROLE=793;
	public static final int TOK_CREATETABLE=794;
	public static final int TOK_CREATEVIEW=795;
	public static final int TOK_CREATE_MAPPING=796;
	public static final int TOK_CREATE_MATERIALIZED_VIEW=797;
	public static final int TOK_CREATE_POOL=798;
	public static final int TOK_CREATE_RP=799;
	public static final int TOK_CREATE_TRIGGER=800;
	public static final int TOK_CROSSJOIN=801;
	public static final int TOK_CTE=802;
	public static final int TOK_CUBE_GROUPBY=803;
	public static final int TOK_DATABASECOMMENT=804;
	public static final int TOK_DATABASELOCATION=805;
	public static final int TOK_DATABASEPROPERTIES=806;
	public static final int TOK_DATE=807;
	public static final int TOK_DATELITERAL=808;
	public static final int TOK_DATETIME=809;
	public static final int TOK_DBNAME=810;
	public static final int TOK_DBPROPLIST=811;
	public static final int TOK_DB_TYPE=812;
	public static final int TOK_DECIMAL=813;
	public static final int TOK_DEFAULT_POOL=814;
	public static final int TOK_DEFAULT_VALUE=815;
	public static final int TOK_DELETE=816;
	public static final int TOK_DELETE_FROM=817;
	public static final int TOK_DESCDATABASE=818;
	public static final int TOK_DESCFUNCTION=819;
	public static final int TOK_DESCTABLE=820;
	public static final int TOK_DESTINATION=821;
	public static final int TOK_DETAIL=822;
	public static final int TOK_DIR=823;
	public static final int TOK_DISABLE=824;
	public static final int TOK_DISTRIBUTEBY=825;
	public static final int TOK_DOUBLE=826;
	public static final int TOK_DROPDATABASE=827;
	public static final int TOK_DROPFUNCTION=828;
	public static final int TOK_DROPMACRO=829;
	public static final int TOK_DROPROLE=830;
	public static final int TOK_DROPTABLE=831;
	public static final int TOK_DROPVIEW=832;
	public static final int TOK_DROP_MAPPING=833;
	public static final int TOK_DROP_MATERIALIZED_VIEW=834;
	public static final int TOK_DROP_POOL=835;
	public static final int TOK_DROP_RP=836;
	public static final int TOK_DROP_TRIGGER=837;
	public static final int TOK_ENABLE=838;
	public static final int TOK_EXCEPTALL=839;
	public static final int TOK_EXCEPTDISTINCT=840;
	public static final int TOK_EXPLAIN=841;
	public static final int TOK_EXPLAIN_SQ_REWRITE=842;
	public static final int TOK_EXPLIST=843;
	public static final int TOK_EXPORT=844;
	public static final int TOK_EXPRESSION=845;
	public static final int TOK_FALSE=846;
	public static final int TOK_FILE=847;
	public static final int TOK_FILEFORMAT_GENERIC=848;
	public static final int TOK_FLOAT=849;
	public static final int TOK_FORCE=850;
	public static final int TOK_FOREIGN_KEY=851;
	public static final int TOK_FROM=852;
	public static final int TOK_FULLOUTERJOIN=853;
	public static final int TOK_FUNCTION=854;
	public static final int TOK_FUNCTIONDI=855;
	public static final int TOK_FUNCTIONSTAR=856;
	public static final int TOK_GRANT=857;
	public static final int TOK_GRANT_OPTION_FOR=858;
	public static final int TOK_GRANT_ROLE=859;
	public static final int TOK_GRANT_WITH_ADMIN_OPTION=860;
	public static final int TOK_GRANT_WITH_OPTION=861;
	public static final int TOK_GROUP=862;
	public static final int TOK_GROUPBY=863;
	public static final int TOK_GROUPING_SETS=864;
	public static final int TOK_GROUPING_SETS_EXPRESSION=865;
	public static final int TOK_HAVING=866;
	public static final int TOK_IFEXISTS=867;
	public static final int TOK_IFNOTEXISTS=868;
	public static final int TOK_IMPORT=869;
	public static final int TOK_INPUTFORMAT=870;
	public static final int TOK_INSERT=871;
	public static final int TOK_INSERT_INTO=872;
	public static final int TOK_INT=873;
	public static final int TOK_INTERSECTALL=874;
	public static final int TOK_INTERSECTDISTINCT=875;
	public static final int TOK_INTERVAL_DAY_LITERAL=876;
	public static final int TOK_INTERVAL_DAY_TIME=877;
	public static final int TOK_INTERVAL_DAY_TIME_LITERAL=878;
	public static final int TOK_INTERVAL_HOUR_LITERAL=879;
	public static final int TOK_INTERVAL_MINUTE_LITERAL=880;
	public static final int TOK_INTERVAL_MONTH_LITERAL=881;
	public static final int TOK_INTERVAL_SECOND_LITERAL=882;
	public static final int TOK_INTERVAL_YEAR_LITERAL=883;
	public static final int TOK_INTERVAL_YEAR_MONTH=884;
	public static final int TOK_INTERVAL_YEAR_MONTH_LITERAL=885;
	public static final int TOK_ISOLATION_LEVEL=886;
	public static final int TOK_ISOLATION_SNAPSHOT=887;
	public static final int TOK_JAR=888;
	public static final int TOK_JOIN=889;
	public static final int TOK_KILL_QUERY=890;
	public static final int TOK_LATERAL_VIEW=891;
	public static final int TOK_LATERAL_VIEW_OUTER=892;
	public static final int TOK_LEFTOUTERJOIN=893;
	public static final int TOK_LEFTSEMIJOIN=894;
	public static final int TOK_LENGTH=895;
	public static final int TOK_LIKERP=896;
	public static final int TOK_LIKETABLE=897;
	public static final int TOK_LIMIT=898;
	public static final int TOK_LIST=899;
	public static final int TOK_LOAD=900;
	public static final int TOK_LOCKDB=901;
	public static final int TOK_LOCKTABLE=902;
	public static final int TOK_MAP=903;
	public static final int TOK_MATCHED=904;
	public static final int TOK_MERGE=905;
	public static final int TOK_METADATA=906;
	public static final int TOK_MSCK=907;
	public static final int TOK_NORELY=908;
	public static final int TOK_NOT_CLUSTERED=909;
	public static final int TOK_NOT_MATCHED=910;
	public static final int TOK_NOT_NULL=911;
	public static final int TOK_NOT_SORTED=912;
	public static final int TOK_NOVALIDATE=913;
	public static final int TOK_NO_DROP=914;
	public static final int TOK_NULL=915;
	public static final int TOK_NULLS_FIRST=916;
	public static final int TOK_NULLS_LAST=917;
	public static final int TOK_OFFLINE=918;
	public static final int TOK_OFFSET=919;
	public static final int TOK_ONLY=920;
	public static final int TOK_OPERATOR=921;
	public static final int TOK_OP_ADD=922;
	public static final int TOK_OP_AND=923;
	public static final int TOK_OP_BITAND=924;
	public static final int TOK_OP_BITNOT=925;
	public static final int TOK_OP_BITOR=926;
	public static final int TOK_OP_BITXOR=927;
	public static final int TOK_OP_DIV=928;
	public static final int TOK_OP_EQ=929;
	public static final int TOK_OP_GE=930;
	public static final int TOK_OP_GT=931;
	public static final int TOK_OP_LE=932;
	public static final int TOK_OP_LIKE=933;
	public static final int TOK_OP_LT=934;
	public static final int TOK_OP_MOD=935;
	public static final int TOK_OP_MUL=936;
	public static final int TOK_OP_NE=937;
	public static final int TOK_OP_NOT=938;
	public static final int TOK_OP_OR=939;
	public static final int TOK_OP_SUB=940;
	public static final int TOK_ORDERBY=941;
	public static final int TOK_ORREPLACE=942;
	public static final int TOK_PARTITIONINGSPEC=943;
	public static final int TOK_PARTITIONLOCATION=944;
	public static final int TOK_PARTSPEC=945;
	public static final int TOK_PARTVAL=946;
	public static final int TOK_PATH=947;
	public static final int TOK_PERCENT=948;
	public static final int TOK_PRIMARY_KEY=949;
	public static final int TOK_PRINCIPAL_NAME=950;
	public static final int TOK_PRIVILEGE=951;
	public static final int TOK_PRIVILEGE_LIST=952;
	public static final int TOK_PRIV_ALL=953;
	public static final int TOK_PRIV_ALTER_DATA=954;
	public static final int TOK_PRIV_ALTER_METADATA=955;
	public static final int TOK_PRIV_CREATE=956;
	public static final int TOK_PRIV_DELETE=957;
	public static final int TOK_PRIV_DROP=958;
	public static final int TOK_PRIV_INSERT=959;
	public static final int TOK_PRIV_LOCK=960;
	public static final int TOK_PRIV_OBJECT=961;
	public static final int TOK_PRIV_OBJECT_COL=962;
	public static final int TOK_PRIV_SELECT=963;
	public static final int TOK_PRIV_SHOW_DATABASE=964;
	public static final int TOK_PTBLFUNCTION=965;
	public static final int TOK_QUERY=966;
	public static final int TOK_QUERY_PARALLELISM=967;
	public static final int TOK_READONLY=968;
	public static final int TOK_REAL=969;
	public static final int TOK_RECORDREADER=970;
	public static final int TOK_RECORDWRITER=971;
	public static final int TOK_RELOADFUNCTION=972;
	public static final int TOK_RELY=973;
	public static final int TOK_RENAME=974;
	public static final int TOK_REPLACE=975;
	public static final int TOK_REPLICATION=976;
	public static final int TOK_REPL_CONFIG=977;
	public static final int TOK_REPL_CONFIG_LIST=978;
	public static final int TOK_REPL_DUMP=979;
	public static final int TOK_REPL_LOAD=980;
	public static final int TOK_REPL_STATUS=981;
	public static final int TOK_RESOURCE_ALL=982;
	public static final int TOK_RESOURCE_LIST=983;
	public static final int TOK_RESOURCE_URI=984;
	public static final int TOK_RESTRICT=985;
	public static final int TOK_REVOKE=986;
	public static final int TOK_REVOKE_ROLE=987;
	public static final int TOK_REWRITE_DISABLED=988;
	public static final int TOK_REWRITE_ENABLED=989;
	public static final int TOK_RIGHTOUTERJOIN=990;
	public static final int TOK_ROLE=991;
	public static final int TOK_ROLLBACK=992;
	public static final int TOK_ROLLUP_GROUPBY=993;
	public static final int TOK_ROWCOUNT=994;
	public static final int TOK_SCHEDULING_POLICY=995;
	public static final int TOK_SELECT=996;
	public static final int TOK_SELECTDI=997;
	public static final int TOK_SELEXPR=998;
	public static final int TOK_SERDE=999;
	public static final int TOK_SERDENAME=1000;
	public static final int TOK_SERDEPROPS=1001;
	public static final int TOK_SERVER_TYPE=1002;
	public static final int TOK_SETCOLREF=1003;
	public static final int TOK_SET_AUTOCOMMIT=1004;
	public static final int TOK_SET_COLUMNS_CLAUSE=1005;
	public static final int TOK_SHOWCOLUMNS=1006;
	public static final int TOK_SHOWCONF=1007;
	public static final int TOK_SHOWDATABASES=1008;
	public static final int TOK_SHOWDBLOCKS=1009;
	public static final int TOK_SHOWFUNCTIONS=1010;
	public static final int TOK_SHOWLOCKS=1011;
	public static final int TOK_SHOWMATERIALIZEDVIEWS=1012;
	public static final int TOK_SHOWPARTITIONS=1013;
	public static final int TOK_SHOWTABLES=1014;
	public static final int TOK_SHOWVIEWS=1015;
	public static final int TOK_SHOW_COMPACTIONS=1016;
	public static final int TOK_SHOW_CREATEDATABASE=1017;
	public static final int TOK_SHOW_CREATETABLE=1018;
	public static final int TOK_SHOW_GRANT=1019;
	public static final int TOK_SHOW_ROLES=1020;
	public static final int TOK_SHOW_ROLE_GRANT=1021;
	public static final int TOK_SHOW_ROLE_PRINCIPALS=1022;
	public static final int TOK_SHOW_RP=1023;
	public static final int TOK_SHOW_SET_ROLE=1024;
	public static final int TOK_SHOW_TABLESTATUS=1025;
	public static final int TOK_SHOW_TBLPROPERTIES=1026;
	public static final int TOK_SHOW_TRANSACTIONS=1027;
	public static final int TOK_SKEWED_LOCATIONS=1028;
	public static final int TOK_SKEWED_LOCATION_LIST=1029;
	public static final int TOK_SKEWED_LOCATION_MAP=1030;
	public static final int TOK_SMALLINT=1031;
	public static final int TOK_SORTBY=1032;
	public static final int TOK_START_TRANSACTION=1033;
	public static final int TOK_STORAGEHANDLER=1034;
	public static final int TOK_STOREDASDIRS=1035;
	public static final int TOK_STRING=1036;
	public static final int TOK_STRINGLITERALSEQUENCE=1037;
	public static final int TOK_STRUCT=1038;
	public static final int TOK_SUBQUERY=1039;
	public static final int TOK_SUBQUERY_EXPR=1040;
	public static final int TOK_SUBQUERY_OP=1041;
	public static final int TOK_SUBQUERY_OP_NOTEXISTS=1042;
	public static final int TOK_SUBQUERY_OP_NOTIN=1043;
	public static final int TOK_SUMMARY=1044;
	public static final int TOK_SWITCHDATABASE=1045;
	public static final int TOK_TAB=1046;
	public static final int TOK_TABALIAS=1047;
	public static final int TOK_TABCOL=1048;
	public static final int TOK_TABCOLLIST=1049;
	public static final int TOK_TABCOLNAME=1050;
	public static final int TOK_TABCOLVALUE=1051;
	public static final int TOK_TABCOLVALUES=1052;
	public static final int TOK_TABCOLVALUE_PAIR=1053;
	public static final int TOK_TABLEBUCKETSAMPLE=1054;
	public static final int TOK_TABLECOMMENT=1055;
	public static final int TOK_TABLEFILEFORMAT=1056;
	public static final int TOK_TABLELOCATION=1057;
	public static final int TOK_TABLEPARTCOLNAMES=1058;
	public static final int TOK_TABLEPARTCOLS=1059;
	public static final int TOK_TABLEPROPERTIES=1060;
	public static final int TOK_TABLEPROPERTY=1061;
	public static final int TOK_TABLEPROPLIST=1062;
	public static final int TOK_TABLEROWFORMAT=1063;
	public static final int TOK_TABLEROWFORMATCOLLITEMS=1064;
	public static final int TOK_TABLEROWFORMATFIELD=1065;
	public static final int TOK_TABLEROWFORMATLINES=1066;
	public static final int TOK_TABLEROWFORMATMAPKEYS=1067;
	public static final int TOK_TABLEROWFORMATNULL=1068;
	public static final int TOK_TABLESERIALIZER=1069;
	public static final int TOK_TABLESKEWED=1070;
	public static final int TOK_TABLESPLITSAMPLE=1071;
	public static final int TOK_TABLE_OR_COL=1072;
	public static final int TOK_TABLE_PARTITION=1073;
	public static final int TOK_TABLE_TYPE=1074;
	public static final int TOK_TABNAME=1075;
	public static final int TOK_TABREF=1076;
	public static final int TOK_TABSORTCOLNAMEASC=1077;
	public static final int TOK_TABSORTCOLNAMEDESC=1078;
	public static final int TOK_TABSRC=1079;
	public static final int TOK_TABTYPE=1080;
	public static final int TOK_TEMPORARY=1081;
	public static final int TOK_TIMESTAMP=1082;
	public static final int TOK_TIMESTAMPLITERAL=1083;
	public static final int TOK_TIMESTAMPLOCALTZ=1084;
	public static final int TOK_TIMESTAMPLOCALTZLITERAL=1085;
	public static final int TOK_TINYINT=1086;
	public static final int TOK_TMP_FILE=1087;
	public static final int TOK_TO=1088;
	public static final int TOK_TRANSFORM=1089;
	public static final int TOK_TRIGGER_EXPRESSION=1090;
	public static final int TOK_TRUE=1091;
	public static final int TOK_TRUNCATETABLE=1092;
	public static final int TOK_TXN_ACCESS_MODE=1093;
	public static final int TOK_TXN_READ_ONLY=1094;
	public static final int TOK_TXN_READ_WRITE=1095;
	public static final int TOK_UNIONALL=1096;
	public static final int TOK_UNIONDISTINCT=1097;
	public static final int TOK_UNIONTYPE=1098;
	public static final int TOK_UNIQUE=1099;
	public static final int TOK_UNIQUEJOIN=1100;
	public static final int TOK_UNKNOWN=1101;
	public static final int TOK_UNLOCKDB=1102;
	public static final int TOK_UNLOCKTABLE=1103;
	public static final int TOK_UNMANAGED=1104;
	public static final int TOK_UPDATE=1105;
	public static final int TOK_UPDATE_TABLE=1106;
	public static final int TOK_URI_TYPE=1107;
	public static final int TOK_USER=1108;
	public static final int TOK_USERSCRIPTCOLNAMES=1109;
	public static final int TOK_USERSCRIPTCOLSCHEMA=1110;
	public static final int TOK_VALIDATE=1111;
	public static final int TOK_VARCHAR=1112;
	public static final int TOK_VIEWPARTCOLS=1113;
	public static final int TOK_WHERE=1114;
	public static final int TOK_WINDOWDEF=1115;
	public static final int TOK_WINDOWRANGE=1116;
	public static final int TOK_WINDOWSPEC=1117;
	public static final int TOK_WINDOWVALUES=1118;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators
	public HiveParser gHiveParser;
	public HiveParser gParent;


	public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
		super(input, state);
		this.gHiveParser = gHiveParser;
		gParent = gHiveParser;
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return HiveParser.tokenNames; }
	@Override public String getGrammarFileName() { return "FromClauseParser.g"; }


	  @Override
	  public Object recoverFromMismatchedSet(IntStream input,
	      RecognitionException re, BitSet follow) throws RecognitionException {
	    throw re;
	  }
	  @Override
	  public void displayRecognitionError(String[] tokenNames,
	      RecognitionException e) {
	    gParent.errors.add(new ParseError(gParent, e, tokenNames));
	  }


	public static class tableAllColumns_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableAllColumns"
	// FromClauseParser.g:49:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
	public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
		HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token STAR1=null;
		Token DOT3=null;
		Token STAR4=null;
		ParserRuleReturnScope tableName2 =null;

		ASTNode STAR1_tree=null;
		ASTNode DOT3_tree=null;
		ASTNode STAR4_tree=null;
		RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		try {
			// FromClauseParser.g:50:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0==STAR) ) {
				alt1=1;
			}
			else if ( (LA1_0==Identifier||(LA1_0 >= KW_ABORT && LA1_0 <= KW_AFTER)||LA1_0==KW_ALLOC_FRACTION||LA1_0==KW_ANALYZE||LA1_0==KW_ARCHIVE||(LA1_0 >= KW_ASC && LA1_0 <= KW_AST)||(LA1_0 >= KW_AUTOCOMMIT && LA1_0 <= KW_BEFORE)||(LA1_0 >= KW_BUCKET && LA1_0 <= KW_BUCKETS)||(LA1_0 >= KW_CACHE && LA1_0 <= KW_CASCADE)||LA1_0==KW_CHANGE||(LA1_0 >= KW_CHECK && LA1_0 <= KW_COLLECTION)||(LA1_0 >= KW_COLUMNS && LA1_0 <= KW_COMMENT)||(LA1_0 >= KW_COMPACT && LA1_0 <= KW_CONCATENATE)||LA1_0==KW_CONTINUE||LA1_0==KW_DATA||(LA1_0 >= KW_DATABASES && LA1_0 <= KW_DEBUG)||(LA1_0 >= KW_DEFAULT && LA1_0 <= KW_DEFINED)||(LA1_0 >= KW_DELIMITED && LA1_0 <= KW_DESC)||(LA1_0 >= KW_DETAIL && LA1_0 <= KW_DISABLE)||(LA1_0 >= KW_DISTRIBUTE && LA1_0 <= KW_DO)||LA1_0==KW_DOW||(LA1_0 >= KW_DUMP && LA1_0 <= KW_ELEM_TYPE)||LA1_0==KW_ENABLE||(LA1_0 >= KW_ENFORCED && LA1_0 <= KW_ESCAPED)||LA1_0==KW_EXCLUSIVE||(LA1_0 >= KW_EXPLAIN && LA1_0 <= KW_EXPRESSION)||(LA1_0 >= KW_FIELDS && LA1_0 <= KW_FIRST)||(LA1_0 >= KW_FORMAT && LA1_0 <= KW_FORMATTED)||LA1_0==KW_FUNCTIONS||LA1_0==KW_GROUP||(LA1_0 >= KW_HOUR && LA1_0 <= KW_IDXPROPERTIES)||(LA1_0 >= KW_INDEX && LA1_0 <= KW_INDEXES)||(LA1_0 >= KW_INPATH && LA1_0 <= KW_INPUTFORMAT)||(LA1_0 >= KW_ISOLATION && LA1_0 <= KW_JAR)||(LA1_0 >= KW_KEY && LA1_0 <= KW_LAST)||LA1_0==KW_LEVEL||(LA1_0 >= KW_LIMIT && LA1_0 <= KW_LOAD)||(LA1_0 >= KW_LOCATION && LA1_0 <= KW_LONG)||LA1_0==KW_MANAGEMENT||(LA1_0 >= KW_MAPJOIN && LA1_0 <= KW_MATERIALIZED)||LA1_0==KW_METADATA||(LA1_0 >= KW_MINUTE && LA1_0 <= KW_MONTH)||(LA1_0 >= KW_MOVE && LA1_0 <= KW_MSCK)||(LA1_0 >= KW_NORELY && LA1_0 <= KW_NOSCAN)||LA1_0==KW_NOVALIDATE||LA1_0==KW_NULLS||LA1_0==KW_OFFSET||(LA1_0 >= KW_OPERATOR && LA1_0 <= KW_OPTION)||LA1_0==KW_ORDER||(LA1_0 >= KW_OUTPUTDRIVER && LA1_0 <= KW_OUTPUTFORMAT)||(LA1_0 >= KW_OVERWRITE && LA1_0 <= KW_OWNER)||(LA1_0 >= KW_PARTITIONED && LA1_0 <= KW_PATH)||(LA1_0 >= KW_PLAN && LA1_0 <= KW_POOL)||LA1_0==KW_PRINCIPALS||(LA1_0 >= KW_PURGE && LA1_0 <= KW_QUERY_PARALLELISM)||LA1_0==KW_READ||(LA1_0 >= KW_REBUILD && LA1_0 <= KW_RECORDWRITER)||(LA1_0 >= KW_RELOAD && LA1_0 <= KW_RESTRICT)||LA1_0==KW_REWRITE||(LA1_0 >= KW_ROLE && LA1_0 <= KW_ROLES)||(LA1_0 >= KW_SCHEDULING_POLICY && LA1_0 <= KW_SECOND)||(LA1_0 >= KW_SEMI && LA1_0 <= KW_SERVER)||(LA1_0 >= KW_SETS && LA1_0 <= KW_SKEWED)||(LA1_0 >= KW_SNAPSHOT && LA1_0 <= KW_SSL)||(LA1_0 >= KW_STATISTICS && LA1_0 <= KW_SUMMARY)||LA1_0==KW_TABLES||(LA1_0 >= KW_TBLPROPERTIES && LA1_0 <= KW_TERMINATED)||LA1_0==KW_TINYINT||(LA1_0 >= KW_TOUCH && LA1_0 <= KW_TRANSACTIONS)||LA1_0==KW_UNARCHIVE||LA1_0==KW_UNDO||LA1_0==KW_UNIONTYPE||(LA1_0 >= KW_UNKNOWN && LA1_0 <= KW_UNSIGNED)||(LA1_0 >= KW_URI && LA1_0 <= KW_USE)||(LA1_0 >= KW_UTC && LA1_0 <= KW_VALIDATE)||LA1_0==KW_VALUE_TYPE||(LA1_0 >= KW_VECTORIZATION && LA1_0 <= KW_WEEK)||LA1_0==KW_WHILE||(LA1_0 >= KW_WORK && LA1_0 <= KW_ZONE)||LA1_0==KW_BATCH||LA1_0==KW_DAYOFWEEK||LA1_0==KW_HOLD_DDLTIME||LA1_0==KW_IGNORE||LA1_0==KW_NO_DROP||LA1_0==KW_OFFLINE||LA1_0==KW_PROTECTION||LA1_0==KW_READONLY||LA1_0==KW_TIMESTAMPTZ) ) {
				alt1=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// FromClauseParser.g:50:7: STAR
					{
					STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns58); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR1);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 51:9: -> ^( TOK_ALLCOLREF )
					{
						// FromClauseParser.g:51:12: ^( TOK_ALLCOLREF )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:52:7: tableName DOT STAR
					{
					pushFollow(FOLLOW_tableName_in_tableAllColumns80);
					tableName2=tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());
					DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns82); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT3);

					STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns84); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_STAR.add(STAR4);

					// AST REWRITE
					// elements: tableName
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 53:9: -> ^( TOK_ALLCOLREF tableName )
					{
						// FromClauseParser.g:53:12: ^( TOK_ALLCOLREF tableName )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF"), root_1);
						adaptor.addChild(root_1, stream_tableName.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableAllColumns"


	public static class tableOrColumn_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableOrColumn"
	// FromClauseParser.g:57:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
	public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
		HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope identifier5 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"table or column identifier", state); 
		try {
			// FromClauseParser.g:60:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
			// FromClauseParser.g:61:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableOrColumn132);
			identifier5=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 61:16: -> ^( TOK_TABLE_OR_COL identifier )
			{
				// FromClauseParser.g:61:19: ^( TOK_TABLE_OR_COL identifier )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableOrColumn"


	public static class expressionList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// FromClauseParser.g:64:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
	public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
		HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA7=null;
		ParserRuleReturnScope expression6 =null;
		ParserRuleReturnScope expression8 =null;

		ASTNode COMMA7_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.pushMsg(retval.start,"expression list", state); 
		try {
			// FromClauseParser.g:67:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
			// FromClauseParser.g:68:5: expression ( COMMA expression )*
			{
			pushFollow(FOLLOW_expression_in_expressionList171);
			expression6=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_expression.add(expression6.getTree());
			// FromClauseParser.g:68:16: ( COMMA expression )*
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( (LA2_0==COMMA) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// FromClauseParser.g:68:17: COMMA expression
					{
					COMMA7=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList174); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA7);

					pushFollow(FOLLOW_expression_in_expressionList176);
					expression8=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression8.getTree());
					}
					break;

				default :
					break loop2;
				}
			}

			// AST REWRITE
			// elements: expression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 68:36: -> ^( TOK_EXPLIST ( expression )+ )
			{
				// FromClauseParser.g:68:39: ^( TOK_EXPLIST ( expression )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				if ( !(stream_expression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class aliasList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "aliasList"
	// FromClauseParser.g:71:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
	public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
		HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA10=null;
		ParserRuleReturnScope identifier9 =null;
		ParserRuleReturnScope identifier11 =null;

		ASTNode COMMA10_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"alias list", state); 
		try {
			// FromClauseParser.g:74:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
			// FromClauseParser.g:75:5: identifier ( COMMA identifier )*
			{
			pushFollow(FOLLOW_identifier_in_aliasList218);
			identifier9=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier9.getTree());
			// FromClauseParser.g:75:16: ( COMMA identifier )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					int LA3_20 = input.LA(2);
					if ( (LA3_20==Identifier||(LA3_20 >= KW_ABORT && LA3_20 <= KW_AFTER)||LA3_20==KW_ALLOC_FRACTION||LA3_20==KW_ANALYZE||LA3_20==KW_ARCHIVE||(LA3_20 >= KW_ASC && LA3_20 <= KW_AST)||(LA3_20 >= KW_AUTOCOMMIT && LA3_20 <= KW_BEFORE)||(LA3_20 >= KW_BUCKET && LA3_20 <= KW_BUCKETS)||(LA3_20 >= KW_CACHE && LA3_20 <= KW_CASCADE)||LA3_20==KW_CHANGE||(LA3_20 >= KW_CHECK && LA3_20 <= KW_COLLECTION)||(LA3_20 >= KW_COLUMNS && LA3_20 <= KW_COMMENT)||(LA3_20 >= KW_COMPACT && LA3_20 <= KW_CONCATENATE)||LA3_20==KW_CONTINUE||LA3_20==KW_DATA||(LA3_20 >= KW_DATABASES && LA3_20 <= KW_DEBUG)||(LA3_20 >= KW_DEFAULT && LA3_20 <= KW_DEFINED)||(LA3_20 >= KW_DELIMITED && LA3_20 <= KW_DESC)||(LA3_20 >= KW_DETAIL && LA3_20 <= KW_DISABLE)||(LA3_20 >= KW_DISTRIBUTE && LA3_20 <= KW_DO)||LA3_20==KW_DOW||(LA3_20 >= KW_DUMP && LA3_20 <= KW_ELEM_TYPE)||LA3_20==KW_ENABLE||(LA3_20 >= KW_ENFORCED && LA3_20 <= KW_ESCAPED)||LA3_20==KW_EXCLUSIVE||(LA3_20 >= KW_EXPLAIN && LA3_20 <= KW_EXPRESSION)||(LA3_20 >= KW_FIELDS && LA3_20 <= KW_FIRST)||(LA3_20 >= KW_FORMAT && LA3_20 <= KW_FORMATTED)||LA3_20==KW_FUNCTIONS||LA3_20==KW_GROUP||(LA3_20 >= KW_HOUR && LA3_20 <= KW_IDXPROPERTIES)||(LA3_20 >= KW_INDEX && LA3_20 <= KW_INDEXES)||(LA3_20 >= KW_INPATH && LA3_20 <= KW_INPUTFORMAT)||(LA3_20 >= KW_ISOLATION && LA3_20 <= KW_JAR)||(LA3_20 >= KW_KEY && LA3_20 <= KW_LAST)||LA3_20==KW_LEVEL||(LA3_20 >= KW_LIMIT && LA3_20 <= KW_LOAD)||(LA3_20 >= KW_LOCATION && LA3_20 <= KW_LONG)||LA3_20==KW_MANAGEMENT||(LA3_20 >= KW_MAPJOIN && LA3_20 <= KW_MATERIALIZED)||LA3_20==KW_METADATA||(LA3_20 >= KW_MINUTE && LA3_20 <= KW_MONTH)||(LA3_20 >= KW_MOVE && LA3_20 <= KW_MSCK)||(LA3_20 >= KW_NORELY && LA3_20 <= KW_NOSCAN)||LA3_20==KW_NOVALIDATE||LA3_20==KW_NULLS||LA3_20==KW_OFFSET||(LA3_20 >= KW_OPERATOR && LA3_20 <= KW_OPTION)||LA3_20==KW_ORDER||(LA3_20 >= KW_OUTPUTDRIVER && LA3_20 <= KW_OUTPUTFORMAT)||(LA3_20 >= KW_OVERWRITE && LA3_20 <= KW_OWNER)||(LA3_20 >= KW_PARTITIONED && LA3_20 <= KW_PATH)||(LA3_20 >= KW_PLAN && LA3_20 <= KW_POOL)||LA3_20==KW_PRINCIPALS||(LA3_20 >= KW_PURGE && LA3_20 <= KW_QUERY_PARALLELISM)||LA3_20==KW_READ||(LA3_20 >= KW_REBUILD && LA3_20 <= KW_RECORDWRITER)||(LA3_20 >= KW_RELOAD && LA3_20 <= KW_RESTRICT)||LA3_20==KW_REWRITE||(LA3_20 >= KW_ROLE && LA3_20 <= KW_ROLES)||(LA3_20 >= KW_SCHEDULING_POLICY && LA3_20 <= KW_SECOND)||(LA3_20 >= KW_SEMI && LA3_20 <= KW_SERVER)||(LA3_20 >= KW_SETS && LA3_20 <= KW_SKEWED)||(LA3_20 >= KW_SNAPSHOT && LA3_20 <= KW_SSL)||(LA3_20 >= KW_STATISTICS && LA3_20 <= KW_SUMMARY)||LA3_20==KW_TABLES||(LA3_20 >= KW_TBLPROPERTIES && LA3_20 <= KW_TERMINATED)||LA3_20==KW_TINYINT||(LA3_20 >= KW_TOUCH && LA3_20 <= KW_TRANSACTIONS)||LA3_20==KW_UNARCHIVE||LA3_20==KW_UNDO||LA3_20==KW_UNIONTYPE||(LA3_20 >= KW_UNKNOWN && LA3_20 <= KW_UNSIGNED)||(LA3_20 >= KW_URI && LA3_20 <= KW_USE)||(LA3_20 >= KW_UTC && LA3_20 <= KW_VALIDATE)||LA3_20==KW_VALUE_TYPE||(LA3_20 >= KW_VECTORIZATION && LA3_20 <= KW_WEEK)||LA3_20==KW_WHILE||(LA3_20 >= KW_WORK && LA3_20 <= KW_ZONE)||LA3_20==KW_BATCH||LA3_20==KW_DAYOFWEEK||LA3_20==KW_HOLD_DDLTIME||LA3_20==KW_IGNORE||LA3_20==KW_NO_DROP||LA3_20==KW_OFFLINE||LA3_20==KW_PROTECTION||LA3_20==KW_READONLY||LA3_20==KW_TIMESTAMPTZ) ) {
						alt3=1;
					}

				}

				switch (alt3) {
				case 1 :
					// FromClauseParser.g:75:17: COMMA identifier
					{
					COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList221); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA10);

					pushFollow(FOLLOW_identifier_in_aliasList223);
					identifier11=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier11.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 75:36: -> ^( TOK_ALIASLIST ( identifier )+ )
			{
				// FromClauseParser.g:75:39: ^( TOK_ALIASLIST ( identifier )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST"), root_1);
				if ( !(stream_identifier.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "aliasList"


	public static class fromClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "fromClause"
	// FromClauseParser.g:80:1: fromClause : KW_FROM fromSource -> ^( TOK_FROM fromSource ) ;
	public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
		HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_FROM12=null;
		ParserRuleReturnScope fromSource13 =null;

		ASTNode KW_FROM12_tree=null;
		RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
		RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");

		 gParent.pushMsg(retval.start,"from clause", state); 
		try {
			// FromClauseParser.g:83:5: ( KW_FROM fromSource -> ^( TOK_FROM fromSource ) )
			// FromClauseParser.g:84:5: KW_FROM fromSource
			{
			KW_FROM12=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause267); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM12);

			pushFollow(FOLLOW_fromSource_in_fromClause269);
			fromSource13=fromSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_fromSource.add(fromSource13.getTree());
			// AST REWRITE
			// elements: fromSource
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 84:24: -> ^( TOK_FROM fromSource )
			{
				// FromClauseParser.g:84:27: ^( TOK_FROM fromSource )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FROM, "TOK_FROM"), root_1);
				adaptor.addChild(root_1, stream_fromSource.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromClause"


	public static class fromSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "fromSource"
	// FromClauseParser.g:87:1: fromSource : ( uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource );
	public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
		HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA16=null;
		ParserRuleReturnScope uniqueJoinToken14 =null;
		ParserRuleReturnScope uniqueJoinSource15 =null;
		ParserRuleReturnScope uniqueJoinSource17 =null;
		ParserRuleReturnScope joinSource18 =null;

		ASTNode COMMA16_tree=null;

		 gParent.pushMsg(retval.start,"join source", state); 
		try {
			// FromClauseParser.g:90:5: ( uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0==KW_UNIQUEJOIN) ) {
				alt5=1;
			}
			else if ( (LA5_0==Identifier||(LA5_0 >= KW_ABORT && LA5_0 <= KW_AFTER)||LA5_0==KW_ALLOC_FRACTION||LA5_0==KW_ANALYZE||LA5_0==KW_ARCHIVE||(LA5_0 >= KW_ASC && LA5_0 <= KW_AST)||(LA5_0 >= KW_AUTOCOMMIT && LA5_0 <= KW_BEFORE)||(LA5_0 >= KW_BUCKET && LA5_0 <= KW_BUCKETS)||(LA5_0 >= KW_CACHE && LA5_0 <= KW_CASCADE)||LA5_0==KW_CHANGE||(LA5_0 >= KW_CHECK && LA5_0 <= KW_COLLECTION)||(LA5_0 >= KW_COLUMNS && LA5_0 <= KW_COMMENT)||(LA5_0 >= KW_COMPACT && LA5_0 <= KW_CONCATENATE)||LA5_0==KW_CONTINUE||LA5_0==KW_DATA||(LA5_0 >= KW_DATABASES && LA5_0 <= KW_DEBUG)||(LA5_0 >= KW_DEFAULT && LA5_0 <= KW_DEFINED)||(LA5_0 >= KW_DELIMITED && LA5_0 <= KW_DESC)||(LA5_0 >= KW_DETAIL && LA5_0 <= KW_DISABLE)||(LA5_0 >= KW_DISTRIBUTE && LA5_0 <= KW_DO)||LA5_0==KW_DOW||(LA5_0 >= KW_DUMP && LA5_0 <= KW_ELEM_TYPE)||LA5_0==KW_ENABLE||(LA5_0 >= KW_ENFORCED && LA5_0 <= KW_ESCAPED)||LA5_0==KW_EXCLUSIVE||(LA5_0 >= KW_EXPLAIN && LA5_0 <= KW_EXPRESSION)||(LA5_0 >= KW_FIELDS && LA5_0 <= KW_FIRST)||(LA5_0 >= KW_FORMAT && LA5_0 <= KW_FORMATTED)||LA5_0==KW_FUNCTIONS||LA5_0==KW_GROUP||(LA5_0 >= KW_HOUR && LA5_0 <= KW_IDXPROPERTIES)||(LA5_0 >= KW_INDEX && LA5_0 <= KW_INDEXES)||(LA5_0 >= KW_INPATH && LA5_0 <= KW_INPUTFORMAT)||(LA5_0 >= KW_ISOLATION && LA5_0 <= KW_JAR)||(LA5_0 >= KW_KEY && LA5_0 <= KW_LAST)||LA5_0==KW_LEVEL||(LA5_0 >= KW_LIMIT && LA5_0 <= KW_LOAD)||(LA5_0 >= KW_LOCATION && LA5_0 <= KW_LONG)||LA5_0==KW_MANAGEMENT||(LA5_0 >= KW_MAPJOIN && LA5_0 <= KW_MATERIALIZED)||LA5_0==KW_METADATA||(LA5_0 >= KW_MINUTE && LA5_0 <= KW_MONTH)||(LA5_0 >= KW_MOVE && LA5_0 <= KW_MSCK)||(LA5_0 >= KW_NORELY && LA5_0 <= KW_NOSCAN)||LA5_0==KW_NOVALIDATE||LA5_0==KW_NULLS||LA5_0==KW_OFFSET||(LA5_0 >= KW_OPERATOR && LA5_0 <= KW_OPTION)||LA5_0==KW_ORDER||(LA5_0 >= KW_OUTPUTDRIVER && LA5_0 <= KW_OUTPUTFORMAT)||(LA5_0 >= KW_OVERWRITE && LA5_0 <= KW_OWNER)||(LA5_0 >= KW_PARTITIONED && LA5_0 <= KW_PATH)||(LA5_0 >= KW_PLAN && LA5_0 <= KW_POOL)||LA5_0==KW_PRINCIPALS||(LA5_0 >= KW_PURGE && LA5_0 <= KW_QUERY_PARALLELISM)||LA5_0==KW_READ||(LA5_0 >= KW_REBUILD && LA5_0 <= KW_RECORDWRITER)||(LA5_0 >= KW_RELOAD && LA5_0 <= KW_RESTRICT)||LA5_0==KW_REWRITE||(LA5_0 >= KW_ROLE && LA5_0 <= KW_ROLES)||(LA5_0 >= KW_SCHEDULING_POLICY && LA5_0 <= KW_SECOND)||(LA5_0 >= KW_SEMI && LA5_0 <= KW_SERVER)||(LA5_0 >= KW_SETS && LA5_0 <= KW_SKEWED)||(LA5_0 >= KW_SNAPSHOT && LA5_0 <= KW_SSL)||(LA5_0 >= KW_STATISTICS && LA5_0 <= KW_SUMMARY)||(LA5_0 >= KW_TABLE && LA5_0 <= KW_TABLES)||(LA5_0 >= KW_TBLPROPERTIES && LA5_0 <= KW_TERMINATED)||LA5_0==KW_TINYINT||(LA5_0 >= KW_TOUCH && LA5_0 <= KW_TRANSACTIONS)||LA5_0==KW_UNARCHIVE||LA5_0==KW_UNDO||LA5_0==KW_UNIONTYPE||(LA5_0 >= KW_UNKNOWN && LA5_0 <= KW_UNSIGNED)||(LA5_0 >= KW_URI && LA5_0 <= KW_USE)||(LA5_0 >= KW_UTC && LA5_0 <= KW_VALIDATE)||LA5_0==KW_VALUE_TYPE||(LA5_0 >= KW_VECTORIZATION && LA5_0 <= KW_WEEK)||LA5_0==KW_WHILE||(LA5_0 >= KW_WORK && LA5_0 <= KW_ZONE)||LA5_0==LPAREN||LA5_0==KW_BATCH||LA5_0==KW_DAYOFWEEK||LA5_0==KW_HOLD_DDLTIME||LA5_0==KW_IGNORE||LA5_0==KW_NO_DROP||LA5_0==KW_OFFLINE||LA5_0==KW_PROTECTION||LA5_0==KW_READONLY||LA5_0==KW_TIMESTAMPTZ) ) {
				alt5=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// FromClauseParser.g:91:5: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_uniqueJoinToken_in_fromSource308);
					uniqueJoinToken14=uniqueJoinToken();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(uniqueJoinToken14.getTree(), root_0);
					pushFollow(FOLLOW_uniqueJoinSource_in_fromSource311);
					uniqueJoinSource15=uniqueJoinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource15.getTree());

					// FromClauseParser.g:91:39: ( COMMA ! uniqueJoinSource )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( (LA4_0==COMMA) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// FromClauseParser.g:91:40: COMMA ! uniqueJoinSource
							{
							COMMA16=(Token)match(input,COMMA,FOLLOW_COMMA_in_fromSource314); if (state.failed) return retval;
							pushFollow(FOLLOW_uniqueJoinSource_in_fromSource317);
							uniqueJoinSource17=uniqueJoinSource();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource17.getTree());

							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:93:5: joinSource
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_joinSource_in_fromSource331);
					joinSource18=joinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource18.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromSource"


	public static class atomjoinSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "atomjoinSource"
	// FromClauseParser.g:97:1: atomjoinSource : ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);
	public final HiveParser_FromClauseParser.atomjoinSource_return atomjoinSource() throws RecognitionException {
		HiveParser_FromClauseParser.atomjoinSource_return retval = new HiveParser_FromClauseParser.atomjoinSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN27=null;
		Token RPAREN29=null;
		ParserRuleReturnScope tableSource19 =null;
		ParserRuleReturnScope lateralView20 =null;
		ParserRuleReturnScope virtualTableSource21 =null;
		ParserRuleReturnScope lateralView22 =null;
		ParserRuleReturnScope subQuerySource23 =null;
		ParserRuleReturnScope lateralView24 =null;
		ParserRuleReturnScope partitionedTableFunction25 =null;
		ParserRuleReturnScope lateralView26 =null;
		ParserRuleReturnScope joinSource28 =null;

		ASTNode LPAREN27_tree=null;
		ASTNode RPAREN29_tree=null;

		 gParent.pushMsg(retval.start,"joinSource", state); 
		try {
			// FromClauseParser.g:100:5: ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !)
			int alt10=5;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// FromClauseParser.g:101:5: tableSource ( lateralView ^)*
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_tableSource_in_atomjoinSource363);
					tableSource19=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource19.getTree());

					// FromClauseParser.g:101:17: ( lateralView ^)*
					loop6:
					while (true) {
						int alt6=2;
						int LA6_0 = input.LA(1);
						if ( (LA6_0==COMMA) ) {
							int LA6_3 = input.LA(2);
							if ( (LA6_3==KW_LATERAL) ) {
								alt6=1;
							}

						}
						else if ( (LA6_0==KW_LATERAL) ) {
							alt6=1;
						}

						switch (alt6) {
						case 1 :
							// FromClauseParser.g:101:18: lateralView ^
							{
							pushFollow(FOLLOW_lateralView_in_atomjoinSource366);
							lateralView20=lateralView();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView20.getTree(), root_0);
							}
							break;

						default :
							break loop6;
						}
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:103:5: virtualTableSource ( lateralView ^)*
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_virtualTableSource_in_atomjoinSource381);
					virtualTableSource21=virtualTableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource21.getTree());

					// FromClauseParser.g:103:24: ( lateralView ^)*
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( (LA7_0==COMMA) ) {
							int LA7_3 = input.LA(2);
							if ( (LA7_3==KW_LATERAL) ) {
								alt7=1;
							}

						}
						else if ( (LA7_0==KW_LATERAL) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// FromClauseParser.g:103:25: lateralView ^
							{
							pushFollow(FOLLOW_lateralView_in_atomjoinSource384);
							lateralView22=lateralView();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView22.getTree(), root_0);
							}
							break;

						default :
							break loop7;
						}
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:105:5: ( subQuerySource )=> subQuerySource ( lateralView ^)*
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_subQuerySource_in_atomjoinSource405);
					subQuerySource23=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource23.getTree());

					// FromClauseParser.g:105:40: ( lateralView ^)*
					loop8:
					while (true) {
						int alt8=2;
						int LA8_0 = input.LA(1);
						if ( (LA8_0==COMMA) ) {
							int LA8_3 = input.LA(2);
							if ( (LA8_3==KW_LATERAL) ) {
								alt8=1;
							}

						}
						else if ( (LA8_0==KW_LATERAL) ) {
							alt8=1;
						}

						switch (alt8) {
						case 1 :
							// FromClauseParser.g:105:41: lateralView ^
							{
							pushFollow(FOLLOW_lateralView_in_atomjoinSource408);
							lateralView24=lateralView();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView24.getTree(), root_0);
							}
							break;

						default :
							break loop8;
						}
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:107:5: partitionedTableFunction ( lateralView ^)*
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_partitionedTableFunction_in_atomjoinSource423);
					partitionedTableFunction25=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction25.getTree());

					// FromClauseParser.g:107:30: ( lateralView ^)*
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( (LA9_0==COMMA) ) {
							int LA9_3 = input.LA(2);
							if ( (LA9_3==KW_LATERAL) ) {
								alt9=1;
							}

						}
						else if ( (LA9_0==KW_LATERAL) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// FromClauseParser.g:107:31: lateralView ^
							{
							pushFollow(FOLLOW_lateralView_in_atomjoinSource426);
							lateralView26=lateralView();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView26.getTree(), root_0);
							}
							break;

						default :
							break loop9;
						}
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:109:5: LPAREN ! joinSource RPAREN !
					{
					root_0 = (ASTNode)adaptor.nil();


					LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomjoinSource441); if (state.failed) return retval;
					pushFollow(FOLLOW_joinSource_in_atomjoinSource444);
					joinSource28=joinSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource28.getTree());

					RPAREN29=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomjoinSource446); if (state.failed) return retval;
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "atomjoinSource"


	public static class joinSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "joinSource"
	// FromClauseParser.g:112:1: joinSource : atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )* ;
	public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
		HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ON33=null;
		Token KW_USING35=null;
		ParserRuleReturnScope atomjoinSource30 =null;
		ParserRuleReturnScope joinToken31 =null;
		ParserRuleReturnScope joinSourcePart32 =null;
		ParserRuleReturnScope expression34 =null;
		ParserRuleReturnScope columnParenthesesList36 =null;

		ASTNode KW_ON33_tree=null;
		ASTNode KW_USING35_tree=null;

		try {
			// FromClauseParser.g:113:5: ( atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )* )
			// FromClauseParser.g:114:5: atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )*
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_atomjoinSource_in_joinSource468);
			atomjoinSource30=atomjoinSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, atomjoinSource30.getTree());

			// FromClauseParser.g:114:20: ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )*
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( (LA12_0==COMMA||LA12_0==KW_CROSS||LA12_0==KW_FULL||LA12_0==KW_INNER||LA12_0==KW_JOIN||LA12_0==KW_LEFT||LA12_0==KW_RIGHT) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// FromClauseParser.g:114:21: joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)?
					{
					pushFollow(FOLLOW_joinToken_in_joinSource471);
					joinToken31=joinToken();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(joinToken31.getTree(), root_0);
					pushFollow(FOLLOW_joinSourcePart_in_joinSource474);
					joinSourcePart32=joinSourcePart();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSourcePart32.getTree());

					// FromClauseParser.g:114:47: ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)?
					int alt11=3;
					int LA11_0 = input.LA(1);
					if ( (LA11_0==KW_ON) ) {
						alt11=1;
					}
					else if ( (LA11_0==KW_USING) ) {
						alt11=2;
					}
					switch (alt11) {
						case 1 :
							// FromClauseParser.g:114:48: KW_ON ! expression {...}?
							{
							KW_ON33=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource477); if (state.failed) return retval;
							pushFollow(FOLLOW_expression_in_joinSource480);
							expression34=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression34.getTree());

							if ( !(((joinToken31!=null?(joinToken31.start):null).getType() != COMMA)) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
							}
							}
							break;
						case 2 :
							// FromClauseParser.g:114:107: KW_USING ! columnParenthesesList {...}?
							{
							KW_USING35=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_joinSource486); if (state.failed) return retval;
							pushFollow(FOLLOW_columnParenthesesList_in_joinSource489);
							columnParenthesesList36=gHiveParser.columnParenthesesList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, columnParenthesesList36.getTree());

							if ( !(((joinToken31!=null?(joinToken31.start):null).getType() != COMMA)) ) {
								if (state.backtracking>0) {state.failed=true; return retval;}
								throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
							}
							}
							break;

					}

					}
					break;

				default :
					break loop12;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinSource"


	public static class joinSourcePart_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "joinSourcePart"
	// FromClauseParser.g:117:1: joinSourcePart : ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* ;
	public final HiveParser_FromClauseParser.joinSourcePart_return joinSourcePart() throws RecognitionException {
		HiveParser_FromClauseParser.joinSourcePart_return retval = new HiveParser_FromClauseParser.joinSourcePart_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope tableSource37 =null;
		ParserRuleReturnScope virtualTableSource38 =null;
		ParserRuleReturnScope subQuerySource39 =null;
		ParserRuleReturnScope partitionedTableFunction40 =null;
		ParserRuleReturnScope lateralView41 =null;


		 gParent.pushMsg(retval.start,"joinSourcePart", state); 
		try {
			// FromClauseParser.g:120:5: ( ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* )
			// FromClauseParser.g:121:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)*
			{
			root_0 = (ASTNode)adaptor.nil();


			// FromClauseParser.g:121:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction )
			int alt13=4;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// FromClauseParser.g:121:6: tableSource
					{
					pushFollow(FOLLOW_tableSource_in_joinSourcePart527);
					tableSource37=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource37.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:121:20: virtualTableSource
					{
					pushFollow(FOLLOW_virtualTableSource_in_joinSourcePart531);
					virtualTableSource38=virtualTableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource38.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:121:41: subQuerySource
					{
					pushFollow(FOLLOW_subQuerySource_in_joinSourcePart535);
					subQuerySource39=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource39.getTree());

					}
					break;
				case 4 :
					// FromClauseParser.g:121:58: partitionedTableFunction
					{
					pushFollow(FOLLOW_partitionedTableFunction_in_joinSourcePart539);
					partitionedTableFunction40=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction40.getTree());

					}
					break;

			}

			// FromClauseParser.g:121:84: ( lateralView ^)*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0==COMMA) ) {
					int LA14_24 = input.LA(2);
					if ( (LA14_24==KW_LATERAL) ) {
						alt14=1;
					}

				}
				else if ( (LA14_0==KW_LATERAL) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// FromClauseParser.g:121:85: lateralView ^
					{
					pushFollow(FOLLOW_lateralView_in_joinSourcePart543);
					lateralView41=lateralView();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView41.getTree(), root_0);
					}
					break;

				default :
					break loop14;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinSourcePart"


	public static class uniqueJoinSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinSource"
	// FromClauseParser.g:124:1: uniqueJoinSource : ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr ;
	public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_PRESERVE42=null;
		ParserRuleReturnScope uniqueJoinTableSource43 =null;
		ParserRuleReturnScope uniqueJoinExpr44 =null;

		ASTNode KW_PRESERVE42_tree=null;

		 gParent.pushMsg(retval.start,"unique join source", state); 
		try {
			// FromClauseParser.g:127:5: ( ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr )
			// FromClauseParser.g:127:7: ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr
			{
			root_0 = (ASTNode)adaptor.nil();


			// FromClauseParser.g:127:7: ( KW_PRESERVE )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KW_PRESERVE) ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// FromClauseParser.g:127:7: KW_PRESERVE
					{
					KW_PRESERVE42=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource573); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					KW_PRESERVE42_tree = (ASTNode)adaptor.create(KW_PRESERVE42);
					adaptor.addChild(root_0, KW_PRESERVE42_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource576);
			uniqueJoinTableSource43=uniqueJoinTableSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinTableSource43.getTree());

			pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource578);
			uniqueJoinExpr44=uniqueJoinExpr();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr44.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinSource"


	public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinExpr"
	// FromClauseParser.g:130:1: uniqueJoinExpr : LPAREN ! expressionList RPAREN !;
	public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN45=null;
		Token RPAREN47=null;
		ParserRuleReturnScope expressionList46 =null;

		ASTNode LPAREN45_tree=null;
		ASTNode RPAREN47_tree=null;

		 gParent.pushMsg(retval.start,"unique join expression list", state); 
		try {
			// FromClauseParser.g:133:5: ( LPAREN ! expressionList RPAREN !)
			// FromClauseParser.g:133:7: LPAREN ! expressionList RPAREN !
			{
			root_0 = (ASTNode)adaptor.nil();


			LPAREN45=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr605); if (state.failed) return retval;
			pushFollow(FOLLOW_expressionList_in_uniqueJoinExpr608);
			expressionList46=expressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList46.getTree());

			RPAREN47=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr610); if (state.failed) return retval;
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinExpr"


	public static class uniqueJoinToken_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinToken"
	// FromClauseParser.g:136:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
	public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UNIQUEJOIN48=null;

		ASTNode KW_UNIQUEJOIN48_tree=null;
		RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

		 gParent.pushMsg(retval.start,"unique join", state); 
		try {
			// FromClauseParser.g:139:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
			// FromClauseParser.g:139:7: KW_UNIQUEJOIN
			{
			KW_UNIQUEJOIN48=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken638); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN48);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 139:21: -> TOK_UNIQUEJOIN
			{
				adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN"));
			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinToken"


	public static class joinToken_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "joinToken"
	// FromClauseParser.g:141:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN );
	public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
		HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_JOIN49=null;
		Token KW_INNER50=null;
		Token KW_JOIN51=null;
		Token COMMA52=null;
		Token KW_CROSS53=null;
		Token KW_JOIN54=null;
		Token KW_LEFT55=null;
		Token KW_OUTER56=null;
		Token KW_JOIN57=null;
		Token KW_RIGHT58=null;
		Token KW_OUTER59=null;
		Token KW_JOIN60=null;
		Token KW_FULL61=null;
		Token KW_OUTER62=null;
		Token KW_JOIN63=null;
		Token KW_LEFT64=null;
		Token KW_SEMI65=null;
		Token KW_JOIN66=null;

		ASTNode KW_JOIN49_tree=null;
		ASTNode KW_INNER50_tree=null;
		ASTNode KW_JOIN51_tree=null;
		ASTNode COMMA52_tree=null;
		ASTNode KW_CROSS53_tree=null;
		ASTNode KW_JOIN54_tree=null;
		ASTNode KW_LEFT55_tree=null;
		ASTNode KW_OUTER56_tree=null;
		ASTNode KW_JOIN57_tree=null;
		ASTNode KW_RIGHT58_tree=null;
		ASTNode KW_OUTER59_tree=null;
		ASTNode KW_JOIN60_tree=null;
		ASTNode KW_FULL61_tree=null;
		ASTNode KW_OUTER62_tree=null;
		ASTNode KW_JOIN63_tree=null;
		ASTNode KW_LEFT64_tree=null;
		ASTNode KW_SEMI65_tree=null;
		ASTNode KW_JOIN66_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
		RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
		RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");
		RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
		RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
		RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");

		 gParent.pushMsg(retval.start,"join type specifier", state); 
		try {
			// FromClauseParser.g:144:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN )
			int alt19=8;
			switch ( input.LA(1) ) {
			case KW_JOIN:
				{
				alt19=1;
				}
				break;
			case KW_INNER:
				{
				alt19=2;
				}
				break;
			case COMMA:
				{
				alt19=3;
				}
				break;
			case KW_CROSS:
				{
				alt19=4;
				}
				break;
			case KW_LEFT:
				{
				int LA19_5 = input.LA(2);
				if ( (LA19_5==KW_SEMI) ) {
					alt19=8;
				}
				else if ( (LA19_5==KW_JOIN||LA19_5==KW_OUTER) ) {
					alt19=5;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 19, 5, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_RIGHT:
				{
				alt19=6;
				}
				break;
			case KW_FULL:
				{
				alt19=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 19, 0, input);
				throw nvae;
			}
			switch (alt19) {
				case 1 :
					// FromClauseParser.g:145:7: KW_JOIN
					{
					KW_JOIN49=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken670); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN49);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 145:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:146:7: KW_INNER KW_JOIN
					{
					KW_INNER50=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken703); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER50);

					KW_JOIN51=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken705); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN51);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 146:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:147:7: COMMA
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinToken729); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA52);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 147:36: -> TOK_JOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:148:7: KW_CROSS KW_JOIN
					{
					KW_CROSS53=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken764); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS53);

					KW_JOIN54=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken766); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN54);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 148:36: -> TOK_CROSSJOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:149:7: KW_LEFT ( KW_OUTER )? KW_JOIN
					{
					KW_LEFT55=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken790); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT55);

					// FromClauseParser.g:149:16: ( KW_OUTER )?
					int alt16=2;
					int LA16_0 = input.LA(1);
					if ( (LA16_0==KW_OUTER) ) {
						alt16=1;
					}
					switch (alt16) {
						case 1 :
							// FromClauseParser.g:149:17: KW_OUTER
							{
							KW_OUTER56=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken794); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER56);

							}
							break;

					}

					KW_JOIN57=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken798); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN57);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 149:36: -> TOK_LEFTOUTERJOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 6 :
					// FromClauseParser.g:150:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
					{
					KW_RIGHT58=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken810); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT58);

					// FromClauseParser.g:150:16: ( KW_OUTER )?
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==KW_OUTER) ) {
						alt17=1;
					}
					switch (alt17) {
						case 1 :
							// FromClauseParser.g:150:17: KW_OUTER
							{
							KW_OUTER59=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken813); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER59);

							}
							break;

					}

					KW_JOIN60=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken817); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN60);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 150:36: -> TOK_RIGHTOUTERJOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 7 :
					// FromClauseParser.g:151:7: KW_FULL ( KW_OUTER )? KW_JOIN
					{
					KW_FULL61=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken829); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL61);

					// FromClauseParser.g:151:16: ( KW_OUTER )?
					int alt18=2;
					int LA18_0 = input.LA(1);
					if ( (LA18_0==KW_OUTER) ) {
						alt18=1;
					}
					switch (alt18) {
						case 1 :
							// FromClauseParser.g:151:17: KW_OUTER
							{
							KW_OUTER62=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken833); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER62);

							}
							break;

					}

					KW_JOIN63=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken837); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN63);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 151:36: -> TOK_FULLOUTERJOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;
				case 8 :
					// FromClauseParser.g:152:7: KW_LEFT KW_SEMI KW_JOIN
					{
					KW_LEFT64=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken849); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT64);

					KW_SEMI65=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken851); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI65);

					KW_JOIN66=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken853); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN66);

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 152:36: -> TOK_LEFTSEMIJOIN
					{
						adaptor.addChild(root_0, (ASTNode)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN"));
					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinToken"


	public static class lateralView_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "lateralView"
	// FromClauseParser.g:155:1: lateralView : ( ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) ) );
	public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
		HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_LATERAL67=null;
		Token KW_VIEW68=null;
		Token KW_OUTER69=null;
		Token KW_AS72=null;
		Token COMMA74=null;
		Token COMMA76=null;
		Token KW_LATERAL77=null;
		Token KW_VIEW78=null;
		Token KW_AS81=null;
		Token COMMA83=null;
		Token COMMA85=null;
		Token KW_LATERAL86=null;
		Token KW_TABLE87=null;
		Token LPAREN88=null;
		Token RPAREN90=null;
		Token KW_AS91=null;
		Token LPAREN93=null;
		Token COMMA95=null;
		Token RPAREN97=null;
		ParserRuleReturnScope function70 =null;
		ParserRuleReturnScope tableAlias71 =null;
		ParserRuleReturnScope identifier73 =null;
		ParserRuleReturnScope identifier75 =null;
		ParserRuleReturnScope function79 =null;
		ParserRuleReturnScope tableAlias80 =null;
		ParserRuleReturnScope identifier82 =null;
		ParserRuleReturnScope identifier84 =null;
		ParserRuleReturnScope valuesClause89 =null;
		ParserRuleReturnScope tableAlias92 =null;
		ParserRuleReturnScope identifier94 =null;
		ParserRuleReturnScope identifier96 =null;

		ASTNode KW_LATERAL67_tree=null;
		ASTNode KW_VIEW68_tree=null;
		ASTNode KW_OUTER69_tree=null;
		ASTNode KW_AS72_tree=null;
		ASTNode COMMA74_tree=null;
		ASTNode COMMA76_tree=null;
		ASTNode KW_LATERAL77_tree=null;
		ASTNode KW_VIEW78_tree=null;
		ASTNode KW_AS81_tree=null;
		ASTNode COMMA83_tree=null;
		ASTNode COMMA85_tree=null;
		ASTNode KW_LATERAL86_tree=null;
		ASTNode KW_TABLE87_tree=null;
		ASTNode LPAREN88_tree=null;
		ASTNode RPAREN90_tree=null;
		ASTNode KW_AS91_tree=null;
		ASTNode LPAREN93_tree=null;
		ASTNode COMMA95_tree=null;
		ASTNode RPAREN97_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
		RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
		RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
		RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");

		gParent.pushMsg(retval.start,"lateral view", state); 
		try {
			// FromClauseParser.g:158:2: ( ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) ) )
			int alt29=3;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==KW_LATERAL) ) {
				int LA29_1 = input.LA(2);
				if ( (LA29_1==KW_VIEW) ) {
					int LA29_3 = input.LA(3);
					if ( (LA29_3==KW_OUTER) && (synpred2_FromClauseParser())) {
						alt29=1;
					}
					else if ( (LA29_3==Identifier||(LA29_3 >= KW_ABORT && LA29_3 <= KW_AFTER)||LA29_3==KW_ALLOC_FRACTION||LA29_3==KW_ANALYZE||(LA29_3 >= KW_ARCHIVE && LA29_3 <= KW_ARRAY)||(LA29_3 >= KW_ASC && LA29_3 <= KW_AST)||(LA29_3 >= KW_AUTOCOMMIT && LA29_3 <= KW_BEFORE)||(LA29_3 >= KW_BIGINT && LA29_3 <= KW_BOOLEAN)||(LA29_3 >= KW_BUCKET && LA29_3 <= KW_BUCKETS)||(LA29_3 >= KW_CACHE && LA29_3 <= KW_CASCADE)||LA29_3==KW_CHANGE||(LA29_3 >= KW_CHECK && LA29_3 <= KW_COLLECTION)||(LA29_3 >= KW_COLUMNS && LA29_3 <= KW_COMMENT)||(LA29_3 >= KW_COMPACT && LA29_3 <= KW_CONCATENATE)||LA29_3==KW_CONTINUE||(LA29_3 >= KW_CURRENT_DATE && LA29_3 <= KW_CURRENT_TIMESTAMP)||LA29_3==KW_DATA||(LA29_3 >= KW_DATABASES && LA29_3 <= KW_DEBUG)||(LA29_3 >= KW_DEFAULT && LA29_3 <= KW_DEFINED)||(LA29_3 >= KW_DELIMITED && LA29_3 <= KW_DESC)||(LA29_3 >= KW_DETAIL && LA29_3 <= KW_DISABLE)||(LA29_3 >= KW_DISTRIBUTE && LA29_3 <= KW_DOW)||(LA29_3 >= KW_DUMP && LA29_3 <= KW_ELEM_TYPE)||LA29_3==KW_ENABLE||(LA29_3 >= KW_ENFORCED && LA29_3 <= KW_ESCAPED)||LA29_3==KW_EXCLUSIVE||(LA29_3 >= KW_EXPLAIN && LA29_3 <= KW_EXPRESSION)||(LA29_3 >= KW_FIELDS && LA29_3 <= KW_FLOAT)||(LA29_3 >= KW_FORMAT && LA29_3 <= KW_FORMATTED)||LA29_3==KW_FUNCTIONS||(LA29_3 >= KW_GROUP && LA29_3 <= KW_GROUPING)||(LA29_3 >= KW_HOUR && LA29_3 <= KW_IF)||(LA29_3 >= KW_INDEX && LA29_3 <= KW_INDEXES)||(LA29_3 >= KW_INPATH && LA29_3 <= KW_INPUTFORMAT)||LA29_3==KW_INT||(LA29_3 >= KW_ISOLATION && LA29_3 <= KW_JAR)||(LA29_3 >= KW_KEY && LA29_3 <= KW_LAST)||LA29_3==KW_LEVEL||(LA29_3 >= KW_LIMIT && LA29_3 <= KW_LOAD)||(LA29_3 >= KW_LOCATION && LA29_3 <= KW_LONG)||(LA29_3 >= KW_MANAGEMENT && LA29_3 <= KW_MATERIALIZED)||LA29_3==KW_METADATA||(LA29_3 >= KW_MINUTE && LA29_3 <= KW_MONTH)||(LA29_3 >= KW_MOVE && LA29_3 <= KW_MSCK)||(LA29_3 >= KW_NORELY && LA29_3 <= KW_NOSCAN)||LA29_3==KW_NOVALIDATE||LA29_3==KW_NULLS||LA29_3==KW_OFFSET||(LA29_3 >= KW_OPERATOR && LA29_3 <= KW_OPTION)||LA29_3==KW_ORDER||(LA29_3 >= KW_OUTPUTDRIVER && LA29_3 <= KW_OUTPUTFORMAT)||(LA29_3 >= KW_OVERWRITE && LA29_3 <= KW_OWNER)||(LA29_3 >= KW_PARTITIONED && LA29_3 <= KW_PATH)||(LA29_3 >= KW_PLAN && LA29_3 <= KW_POOL)||LA29_3==KW_PRINCIPALS||(LA29_3 >= KW_PURGE && LA29_3 <= KW_QUERY_PARALLELISM)||LA29_3==KW_READ||(LA29_3 >= KW_REAL && LA29_3 <= KW_RECORDWRITER)||(LA29_3 >= KW_RELOAD && LA29_3 <= KW_RESTRICT)||LA29_3==KW_REWRITE||(LA29_3 >= KW_ROLE && LA29_3 <= KW_ROLES)||(LA29_3 >= KW_SCHEDULING_POLICY && LA29_3 <= KW_SECOND)||(LA29_3 >= KW_SEMI && LA29_3 <= KW_SERVER)||(LA29_3 >= KW_SETS && LA29_3 <= KW_SSL)||(LA29_3 >= KW_STATISTICS && LA29_3 <= KW_SUMMARY)||LA29_3==KW_TABLES||(LA29_3 >= KW_TBLPROPERTIES && LA29_3 <= KW_TERMINATED)||LA29_3==KW_TIMESTAMP||LA29_3==KW_TINYINT||(LA29_3 >= KW_TOUCH && LA29_3 <= KW_TRANSACTIONS)||LA29_3==KW_UNARCHIVE||LA29_3==KW_UNDO||LA29_3==KW_UNIONTYPE||(LA29_3 >= KW_UNKNOWN && LA29_3 <= KW_UNSIGNED)||(LA29_3 >= KW_URI && LA29_3 <= KW_USE)||(LA29_3 >= KW_UTC && LA29_3 <= KW_VALIDATE)||LA29_3==KW_VALUE_TYPE||(LA29_3 >= KW_VECTORIZATION && LA29_3 <= KW_WEEK)||LA29_3==KW_WHILE||(LA29_3 >= KW_WORK && LA29_3 <= KW_ZONE)||LA29_3==KW_BATCH||LA29_3==KW_DAYOFWEEK||LA29_3==KW_HOLD_DDLTIME||LA29_3==KW_IGNORE||LA29_3==KW_NO_DROP||LA29_3==KW_OFFLINE||LA29_3==KW_PROTECTION||LA29_3==KW_READONLY||LA29_3==KW_TIMESTAMPTZ) ) {
						alt29=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA29_1==KW_TABLE) ) {
					alt29=3;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA29_0==COMMA) ) {
				int LA29_2 = input.LA(2);
				if ( (LA29_2==KW_LATERAL) ) {
					int LA29_5 = input.LA(3);
					if ( (LA29_5==KW_VIEW) ) {
						alt29=2;
					}
					else if ( (LA29_5==KW_TABLE) ) {
						alt29=3;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 29, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 29, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// FromClauseParser.g:159:2: ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					{
					KW_LATERAL67=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView900); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL67);

					KW_VIEW68=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView902); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW68);

					KW_OUTER69=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView904); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER69);

					pushFollow(FOLLOW_function_in_lateralView906);
					function70=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function70.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView908);
					tableAlias71=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias71.getTree());
					// FromClauseParser.g:159:90: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					int alt21=2;
					int LA21_0 = input.LA(1);
					if ( (LA21_0==KW_AS) ) {
						alt21=1;
					}
					switch (alt21) {
						case 1 :
							// FromClauseParser.g:159:91: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
							{
							KW_AS72=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView911); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS72);

							pushFollow(FOLLOW_identifier_in_lateralView913);
							identifier73=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier73.getTree());
							// FromClauseParser.g:159:108: ( ( COMMA )=> COMMA identifier )*
							loop20:
							while (true) {
								int alt20=2;
								alt20 = dfa20.predict(input);
								switch (alt20) {
								case 1 :
									// FromClauseParser.g:159:109: ( COMMA )=> COMMA identifier
									{
									COMMA74=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView921); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA74);

									pushFollow(FOLLOW_identifier_in_lateralView923);
									identifier75=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier75.getTree());
									}
									break;

								default :
									break loop20;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: tableAlias, function, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 160:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:160:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER"), root_1);
						// FromClauseParser.g:160:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:160:43: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						ASTNode root_3 = (ASTNode)adaptor.nil();
						root_3 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:160:66: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:162:2: ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					{
					// FromClauseParser.g:162:2: ( COMMA )?
					int alt22=2;
					int LA22_0 = input.LA(1);
					if ( (LA22_0==COMMA) ) {
						alt22=1;
					}
					switch (alt22) {
						case 1 :
							// FromClauseParser.g:162:2: COMMA
							{
							COMMA76=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView955); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA76);

							}
							break;

					}

					KW_LATERAL77=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView958); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL77);

					KW_VIEW78=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView960); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW78);

					pushFollow(FOLLOW_function_in_lateralView962);
					function79=gHiveParser.function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_function.add(function79.getTree());
					pushFollow(FOLLOW_tableAlias_in_lateralView964);
					tableAlias80=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias80.getTree());
					// FromClauseParser.g:162:48: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==KW_AS) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// FromClauseParser.g:162:49: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
							{
							KW_AS81=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView967); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS81);

							pushFollow(FOLLOW_identifier_in_lateralView969);
							identifier82=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier82.getTree());
							// FromClauseParser.g:162:66: ( ( COMMA )=> COMMA identifier )*
							loop23:
							while (true) {
								int alt23=2;
								alt23 = dfa23.predict(input);
								switch (alt23) {
								case 1 :
									// FromClauseParser.g:162:67: ( COMMA )=> COMMA identifier
									{
									COMMA83=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView977); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA83);

									pushFollow(FOLLOW_identifier_in_lateralView979);
									identifier84=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier84.getTree());
									}
									break;

								default :
									break loop23;
								}
							}

							}
							break;

					}

					// AST REWRITE
					// elements: tableAlias, identifier, function
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 163:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:163:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW"), root_1);
						// FromClauseParser.g:163:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:163:37: ^( TOK_SELEXPR function ( identifier )* tableAlias )
						{
						ASTNode root_3 = (ASTNode)adaptor.nil();
						root_3 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						adaptor.addChild(root_3, stream_function.nextTree());
						// FromClauseParser.g:163:60: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:165:5: ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )?
					{
					// FromClauseParser.g:165:5: ( COMMA )?
					int alt25=2;
					int LA25_0 = input.LA(1);
					if ( (LA25_0==COMMA) ) {
						alt25=1;
					}
					switch (alt25) {
						case 1 :
							// FromClauseParser.g:165:5: COMMA
							{
							COMMA85=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1017); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA85);

							}
							break;

					}

					KW_LATERAL86=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView1020); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL86);

					KW_TABLE87=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_lateralView1022); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE87);

					LPAREN88=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lateralView1024); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN88);

					pushFollow(FOLLOW_valuesClause_in_lateralView1026);
					valuesClause89=valuesClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause89.getTree());
					RPAREN90=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lateralView1028); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN90);

					// FromClauseParser.g:165:59: ( KW_AS )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0==KW_AS) ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// FromClauseParser.g:165:59: KW_AS
							{
							KW_AS91=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView1030); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS91);

							}
							break;

					}

					pushFollow(FOLLOW_tableAlias_in_lateralView1033);
					tableAlias92=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias92.getTree());
					// FromClauseParser.g:165:77: ( LPAREN identifier ( COMMA identifier )* RPAREN )?
					int alt28=2;
					int LA28_0 = input.LA(1);
					if ( (LA28_0==LPAREN) ) {
						alt28=1;
					}
					switch (alt28) {
						case 1 :
							// FromClauseParser.g:165:78: LPAREN identifier ( COMMA identifier )* RPAREN
							{
							LPAREN93=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lateralView1036); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN93);

							pushFollow(FOLLOW_identifier_in_lateralView1038);
							identifier94=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier94.getTree());
							// FromClauseParser.g:165:96: ( COMMA identifier )*
							loop27:
							while (true) {
								int alt27=2;
								int LA27_0 = input.LA(1);
								if ( (LA27_0==COMMA) ) {
									alt27=1;
								}

								switch (alt27) {
								case 1 :
									// FromClauseParser.g:165:97: COMMA identifier
									{
									COMMA95=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1041); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA95);

									pushFollow(FOLLOW_identifier_in_lateralView1043);
									identifier96=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier96.getTree());
									}
									break;

								default :
									break loop27;
								}
							}

							RPAREN97=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lateralView1047); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN97);

							}
							break;

					}

					// AST REWRITE
					// elements: tableAlias, valuesClause, identifier
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 166:5: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) )
					{
						// FromClauseParser.g:166:8: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW"), root_1);
						// FromClauseParser.g:166:27: ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_2);
						// FromClauseParser.g:166:40: ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias )
						{
						ASTNode root_3 = (ASTNode)adaptor.nil();
						root_3 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_3);
						// FromClauseParser.g:166:54: ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause )
						{
						ASTNode root_4 = (ASTNode)adaptor.nil();
						root_4 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_4);
						adaptor.addChild(root_4, (ASTNode)adaptor.create(Identifier, "inline"));
						adaptor.addChild(root_4, stream_valuesClause.nextTree());
						adaptor.addChild(root_3, root_4);
						}

						// FromClauseParser.g:166:104: ( identifier )*
						while ( stream_identifier.hasNext() ) {
							adaptor.addChild(root_3, stream_identifier.nextTree());
						}
						stream_identifier.reset();

						adaptor.addChild(root_3, stream_tableAlias.nextTree());
						adaptor.addChild(root_2, root_3);
						}

						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "lateralView"


	public static class tableAlias_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableAlias"
	// FromClauseParser.g:169:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
	public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
		HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope identifier98 =null;

		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		gParent.pushMsg(retval.start,"table alias", state); 
		try {
			// FromClauseParser.g:172:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
			// FromClauseParser.g:173:5: identifier
			{
			pushFollow(FOLLOW_identifier_in_tableAlias1109);
			identifier98=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier98.getTree());
			// AST REWRITE
			// elements: identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 173:16: -> ^( TOK_TABALIAS identifier )
			{
				// FromClauseParser.g:173:19: ^( TOK_TABALIAS identifier )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) {gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableAlias"


	public static class tableBucketSample_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableBucketSample"
	// FromClauseParser.g:176:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
	public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token numerator=null;
		Token denominator=null;
		Token KW_TABLESAMPLE99=null;
		Token LPAREN100=null;
		Token KW_BUCKET101=null;
		Token KW_OUT102=null;
		Token KW_OF103=null;
		Token KW_ON104=null;
		Token COMMA105=null;
		Token RPAREN106=null;
		List<Object> list_expr=null;
		RuleReturnScope expr = null;
		ASTNode numerator_tree=null;
		ASTNode denominator_tree=null;
		ASTNode KW_TABLESAMPLE99_tree=null;
		ASTNode LPAREN100_tree=null;
		ASTNode KW_BUCKET101_tree=null;
		ASTNode KW_OUT102_tree=null;
		ASTNode KW_OF103_tree=null;
		ASTNode KW_ON104_tree=null;
		ASTNode COMMA105_tree=null;
		ASTNode RPAREN106_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");

		 gParent.pushMsg(retval.start,"table bucket sample specification", state); 
		try {
			// FromClauseParser.g:179:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
			// FromClauseParser.g:180:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
			{
			KW_TABLESAMPLE99=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1148); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE99);

			LPAREN100=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample1150); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN100);

			KW_BUCKET101=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample1152); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET101);

			// FromClauseParser.g:180:37: (numerator= Number )
			// FromClauseParser.g:180:38: numerator= Number
			{
			numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1157); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(numerator);

			}

			KW_OUT102=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample1160); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT102);

			KW_OF103=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample1162); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF103);

			// FromClauseParser.g:180:69: (denominator= Number )
			// FromClauseParser.g:180:70: denominator= Number
			{
			denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1167); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_Number.add(denominator);

			}

			// FromClauseParser.g:180:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
			int alt31=2;
			int LA31_0 = input.LA(1);
			if ( (LA31_0==KW_ON) ) {
				alt31=1;
			}
			switch (alt31) {
				case 1 :
					// FromClauseParser.g:180:91: KW_ON expr+= expression ( COMMA expr+= expression )*
					{
					KW_ON104=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample1171); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON104);

					pushFollow(FOLLOW_expression_in_tableBucketSample1175);
					expr=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
					if (list_expr==null) list_expr=new ArrayList<Object>();
					list_expr.add(expr.getTree());
					// FromClauseParser.g:180:114: ( COMMA expr+= expression )*
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0==COMMA) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// FromClauseParser.g:180:115: COMMA expr+= expression
							{
							COMMA105=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample1178); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA105);

							pushFollow(FOLLOW_expression_in_tableBucketSample1182);
							expr=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
							if (list_expr==null) list_expr=new ArrayList<Object>();
							list_expr.add(expr.getTree());
							}
							break;

						default :
							break loop30;
						}
					}

					}
					break;

			}

			RPAREN106=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample1188); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN106);

			// AST REWRITE
			// elements: expr, numerator, denominator
			// token labels: numerator, denominator
			// rule labels: retval
			// token list labels: 
			// rule list labels: expr
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
			RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
			root_0 = (ASTNode)adaptor.nil();
			// 180:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
			{
				// FromClauseParser.g:180:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE"), root_1);
				adaptor.addChild(root_1, stream_numerator.nextNode());
				adaptor.addChild(root_1, stream_denominator.nextNode());
				// FromClauseParser.g:180:201: ( $expr)*
				while ( stream_expr.hasNext() ) {
					adaptor.addChild(root_1, stream_expr.nextTree());
				}
				stream_expr.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableBucketSample"


	public static class splitSample_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "splitSample"
	// FromClauseParser.g:183:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
	public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
		HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token numerator=null;
		Token percent=null;
		Token KW_TABLESAMPLE107=null;
		Token LPAREN108=null;
		Token KW_ROWS109=null;
		Token RPAREN110=null;
		Token KW_TABLESAMPLE111=null;
		Token LPAREN112=null;
		Token RPAREN113=null;

		ASTNode numerator_tree=null;
		ASTNode percent_tree=null;
		ASTNode KW_TABLESAMPLE107_tree=null;
		ASTNode LPAREN108_tree=null;
		ASTNode KW_ROWS109_tree=null;
		ASTNode RPAREN110_tree=null;
		ASTNode KW_TABLESAMPLE111_tree=null;
		ASTNode LPAREN112_tree=null;
		ASTNode RPAREN113_tree=null;
		RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");

		 gParent.pushMsg(retval.start,"table split sample specification", state); 
		try {
			// FromClauseParser.g:186:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
			int alt33=2;
			int LA33_0 = input.LA(1);
			if ( (LA33_0==KW_TABLESAMPLE) ) {
				int LA33_1 = input.LA(2);
				if ( (LA33_1==LPAREN) ) {
					int LA33_2 = input.LA(3);
					if ( (LA33_2==Number) ) {
						alt33=1;
					}
					else if ( (LA33_2==ByteLengthLiteral) ) {
						alt33=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 33, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 33, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 33, 0, input);
				throw nvae;
			}

			switch (alt33) {
				case 1 :
					// FromClauseParser.g:187:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
					{
					KW_TABLESAMPLE107=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1235); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE107);

					LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1237); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN108);

					// FromClauseParser.g:187:28: (numerator= Number )
					// FromClauseParser.g:187:29: numerator= Number
					{
					numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample1243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(numerator);

					}

					// FromClauseParser.g:187:47: (percent= KW_PERCENT | KW_ROWS )
					int alt32=2;
					int LA32_0 = input.LA(1);
					if ( (LA32_0==KW_PERCENT) ) {
						alt32=1;
					}
					else if ( (LA32_0==KW_ROWS) ) {
						alt32=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 32, 0, input);
						throw nvae;
					}

					switch (alt32) {
						case 1 :
							// FromClauseParser.g:187:48: percent= KW_PERCENT
							{
							percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample1249); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);

							}
							break;
						case 2 :
							// FromClauseParser.g:187:67: KW_ROWS
							{
							KW_ROWS109=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample1251); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS109);

							}
							break;

					}

					RPAREN110=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1254); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN110);

					// AST REWRITE
					// elements: numerator, numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 188:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
					if (percent != null) {
						// FromClauseParser.g:188:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_PERCENT, "TOK_PERCENT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 189:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
					{
						// FromClauseParser.g:189:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:191:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
					{
					KW_TABLESAMPLE111=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1298); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE111);

					LPAREN112=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1300); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN112);

					// FromClauseParser.g:191:28: (numerator= ByteLengthLiteral )
					// FromClauseParser.g:191:29: numerator= ByteLengthLiteral
					{
					numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1306); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);

					}

					RPAREN113=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1309); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN113);

					// AST REWRITE
					// elements: numerator
					// token labels: numerator
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 192:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
					{
						// FromClauseParser.g:192:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_LENGTH, "TOK_LENGTH"));
						adaptor.addChild(root_1, stream_numerator.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "splitSample"


	public static class tableSample_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableSample"
	// FromClauseParser.g:195:1: tableSample : ( tableBucketSample | splitSample );
	public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
		HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope tableBucketSample114 =null;
		ParserRuleReturnScope splitSample115 =null;


		 gParent.pushMsg(retval.start,"table sample specification", state); 
		try {
			// FromClauseParser.g:198:5: ( tableBucketSample | splitSample )
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==KW_TABLESAMPLE) ) {
				int LA34_1 = input.LA(2);
				if ( (LA34_1==LPAREN) ) {
					int LA34_2 = input.LA(3);
					if ( (LA34_2==KW_BUCKET) ) {
						alt34=1;
					}
					else if ( (LA34_2==ByteLengthLiteral||LA34_2==Number) ) {
						alt34=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 34, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 34, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 34, 0, input);
				throw nvae;
			}

			switch (alt34) {
				case 1 :
					// FromClauseParser.g:199:5: tableBucketSample
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_tableBucketSample_in_tableSample1355);
					tableBucketSample114=tableBucketSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample114.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:200:5: splitSample
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_splitSample_in_tableSample1363);
					splitSample115=splitSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample115.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableSample"


	public static class tableSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableSource"
	// FromClauseParser.g:203:1: tableSource : tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) ;
	public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
		HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AS116=null;
		ParserRuleReturnScope tabname =null;
		ParserRuleReturnScope props =null;
		ParserRuleReturnScope ts =null;
		ParserRuleReturnScope alias =null;

		ASTNode KW_AS116_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		 gParent.pushMsg(retval.start,"table source", state); 
		try {
			// FromClauseParser.g:206:5: (tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ) )
			// FromClauseParser.g:206:7: tabname= tableName (props= tableProperties )? (ts= tableSample )? ( ( KW_AS )? alias= identifier )?
			{
			pushFollow(FOLLOW_tableName_in_tableSource1392);
			tabname=tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());
			// FromClauseParser.g:206:30: (props= tableProperties )?
			int alt35=2;
			int LA35_0 = input.LA(1);
			if ( (LA35_0==LPAREN) ) {
				alt35=1;
			}
			switch (alt35) {
				case 1 :
					// FromClauseParser.g:206:30: props= tableProperties
					{
					pushFollow(FOLLOW_tableProperties_in_tableSource1396);
					props=gHiveParser.tableProperties();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());
					}
					break;

			}

			// FromClauseParser.g:206:50: (ts= tableSample )?
			int alt36=2;
			int LA36_0 = input.LA(1);
			if ( (LA36_0==KW_TABLESAMPLE) ) {
				alt36=1;
			}
			switch (alt36) {
				case 1 :
					// FromClauseParser.g:206:50: ts= tableSample
					{
					pushFollow(FOLLOW_tableSample_in_tableSource1401);
					ts=tableSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());
					}
					break;

			}

			// FromClauseParser.g:206:64: ( ( KW_AS )? alias= identifier )?
			int alt38=2;
			alt38 = dfa38.predict(input);
			switch (alt38) {
				case 1 :
					// FromClauseParser.g:206:65: ( KW_AS )? alias= identifier
					{
					// FromClauseParser.g:206:65: ( KW_AS )?
					int alt37=2;
					int LA37_0 = input.LA(1);
					if ( (LA37_0==KW_AS) ) {
						alt37=1;
					}
					switch (alt37) {
						case 1 :
							// FromClauseParser.g:206:65: KW_AS
							{
							KW_AS116=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1405); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS116);

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_tableSource1410);
					alias=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ts, props, tabname, alias
			// token labels: 
			// rule labels: tabname, alias, retval, ts, props
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.getTree():null);
			RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.getTree():null);
			RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 207:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
			{
				// FromClauseParser.g:207:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF"), root_1);
				adaptor.addChild(root_1, stream_tabname.nextTree());
				// FromClauseParser.g:207:31: ( $props)?
				if ( stream_props.hasNext() ) {
					adaptor.addChild(root_1, stream_props.nextTree());
				}
				stream_props.reset();

				// FromClauseParser.g:207:39: ( $ts)?
				if ( stream_ts.hasNext() ) {
					adaptor.addChild(root_1, stream_ts.nextTree());
				}
				stream_ts.reset();

				// FromClauseParser.g:207:44: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextTree());
				}
				stream_alias.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableSource"


	public static class uniqueJoinTableSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "uniqueJoinTableSource"
	// FromClauseParser.g:210:1: uniqueJoinTableSource : tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) ;
	public final HiveParser_FromClauseParser.uniqueJoinTableSource_return uniqueJoinTableSource() throws RecognitionException {
		HiveParser_FromClauseParser.uniqueJoinTableSource_return retval = new HiveParser_FromClauseParser.uniqueJoinTableSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AS117=null;
		ParserRuleReturnScope tabname =null;
		ParserRuleReturnScope ts =null;
		ParserRuleReturnScope alias =null;

		ASTNode KW_AS117_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");

		 gParent.pushMsg(retval.start,"unique join table source", state); 
		try {
			// FromClauseParser.g:213:5: (tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) )
			// FromClauseParser.g:213:7: tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )?
			{
			pushFollow(FOLLOW_tableName_in_uniqueJoinTableSource1466);
			tabname=tableName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());
			// FromClauseParser.g:213:27: (ts= tableSample )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==KW_TABLESAMPLE) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// FromClauseParser.g:213:27: ts= tableSample
					{
					pushFollow(FOLLOW_tableSample_in_uniqueJoinTableSource1470);
					ts=tableSample();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());
					}
					break;

			}

			// FromClauseParser.g:213:41: ( ( KW_AS )? alias= identifier )?
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==Identifier||(LA41_0 >= KW_ABORT && LA41_0 <= KW_AFTER)||LA41_0==KW_ALLOC_FRACTION||LA41_0==KW_ANALYZE||LA41_0==KW_ARCHIVE||(LA41_0 >= KW_AS && LA41_0 <= KW_AST)||(LA41_0 >= KW_AUTOCOMMIT && LA41_0 <= KW_BEFORE)||(LA41_0 >= KW_BUCKET && LA41_0 <= KW_BUCKETS)||(LA41_0 >= KW_CACHE && LA41_0 <= KW_CASCADE)||LA41_0==KW_CHANGE||(LA41_0 >= KW_CHECK && LA41_0 <= KW_COLLECTION)||(LA41_0 >= KW_COLUMNS && LA41_0 <= KW_COMMENT)||(LA41_0 >= KW_COMPACT && LA41_0 <= KW_CONCATENATE)||LA41_0==KW_CONTINUE||LA41_0==KW_DATA||(LA41_0 >= KW_DATABASES && LA41_0 <= KW_DEBUG)||(LA41_0 >= KW_DEFAULT && LA41_0 <= KW_DEFINED)||(LA41_0 >= KW_DELIMITED && LA41_0 <= KW_DESC)||(LA41_0 >= KW_DETAIL && LA41_0 <= KW_DISABLE)||(LA41_0 >= KW_DISTRIBUTE && LA41_0 <= KW_DO)||LA41_0==KW_DOW||(LA41_0 >= KW_DUMP && LA41_0 <= KW_ELEM_TYPE)||LA41_0==KW_ENABLE||(LA41_0 >= KW_ENFORCED && LA41_0 <= KW_ESCAPED)||LA41_0==KW_EXCLUSIVE||(LA41_0 >= KW_EXPLAIN && LA41_0 <= KW_EXPRESSION)||(LA41_0 >= KW_FIELDS && LA41_0 <= KW_FIRST)||(LA41_0 >= KW_FORMAT && LA41_0 <= KW_FORMATTED)||LA41_0==KW_FUNCTIONS||LA41_0==KW_GROUP||(LA41_0 >= KW_HOUR && LA41_0 <= KW_IDXPROPERTIES)||(LA41_0 >= KW_INDEX && LA41_0 <= KW_INDEXES)||(LA41_0 >= KW_INPATH && LA41_0 <= KW_INPUTFORMAT)||(LA41_0 >= KW_ISOLATION && LA41_0 <= KW_JAR)||(LA41_0 >= KW_KEY && LA41_0 <= KW_LAST)||LA41_0==KW_LEVEL||(LA41_0 >= KW_LIMIT && LA41_0 <= KW_LOAD)||(LA41_0 >= KW_LOCATION && LA41_0 <= KW_LONG)||LA41_0==KW_MANAGEMENT||(LA41_0 >= KW_MAPJOIN && LA41_0 <= KW_MATERIALIZED)||LA41_0==KW_METADATA||(LA41_0 >= KW_MINUTE && LA41_0 <= KW_MONTH)||(LA41_0 >= KW_MOVE && LA41_0 <= KW_MSCK)||(LA41_0 >= KW_NORELY && LA41_0 <= KW_NOSCAN)||LA41_0==KW_NOVALIDATE||LA41_0==KW_NULLS||LA41_0==KW_OFFSET||(LA41_0 >= KW_OPERATOR && LA41_0 <= KW_OPTION)||LA41_0==KW_ORDER||(LA41_0 >= KW_OUTPUTDRIVER && LA41_0 <= KW_OUTPUTFORMAT)||(LA41_0 >= KW_OVERWRITE && LA41_0 <= KW_OWNER)||(LA41_0 >= KW_PARTITIONED && LA41_0 <= KW_PATH)||(LA41_0 >= KW_PLAN && LA41_0 <= KW_POOL)||LA41_0==KW_PRINCIPALS||(LA41_0 >= KW_PURGE && LA41_0 <= KW_QUERY_PARALLELISM)||LA41_0==KW_READ||(LA41_0 >= KW_REBUILD && LA41_0 <= KW_RECORDWRITER)||(LA41_0 >= KW_RELOAD && LA41_0 <= KW_RESTRICT)||LA41_0==KW_REWRITE||(LA41_0 >= KW_ROLE && LA41_0 <= KW_ROLES)||(LA41_0 >= KW_SCHEDULING_POLICY && LA41_0 <= KW_SECOND)||(LA41_0 >= KW_SEMI && LA41_0 <= KW_SERVER)||(LA41_0 >= KW_SETS && LA41_0 <= KW_SKEWED)||(LA41_0 >= KW_SNAPSHOT && LA41_0 <= KW_SSL)||(LA41_0 >= KW_STATISTICS && LA41_0 <= KW_SUMMARY)||LA41_0==KW_TABLES||(LA41_0 >= KW_TBLPROPERTIES && LA41_0 <= KW_TERMINATED)||LA41_0==KW_TINYINT||(LA41_0 >= KW_TOUCH && LA41_0 <= KW_TRANSACTIONS)||LA41_0==KW_UNARCHIVE||LA41_0==KW_UNDO||LA41_0==KW_UNIONTYPE||(LA41_0 >= KW_UNKNOWN && LA41_0 <= KW_UNSIGNED)||(LA41_0 >= KW_URI && LA41_0 <= KW_USE)||(LA41_0 >= KW_UTC && LA41_0 <= KW_VALIDATE)||LA41_0==KW_VALUE_TYPE||(LA41_0 >= KW_VECTORIZATION && LA41_0 <= KW_WEEK)||LA41_0==KW_WHILE||(LA41_0 >= KW_WORK && LA41_0 <= KW_ZONE)||LA41_0==KW_BATCH||LA41_0==KW_DAYOFWEEK||LA41_0==KW_HOLD_DDLTIME||LA41_0==KW_IGNORE||LA41_0==KW_NO_DROP||LA41_0==KW_OFFLINE||LA41_0==KW_PROTECTION||LA41_0==KW_READONLY||LA41_0==KW_TIMESTAMPTZ) ) {
				alt41=1;
			}
			switch (alt41) {
				case 1 :
					// FromClauseParser.g:213:42: ( KW_AS )? alias= identifier
					{
					// FromClauseParser.g:213:42: ( KW_AS )?
					int alt40=2;
					int LA40_0 = input.LA(1);
					if ( (LA40_0==KW_AS) ) {
						alt40=1;
					}
					switch (alt40) {
						case 1 :
							// FromClauseParser.g:213:42: KW_AS
							{
							KW_AS117=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_uniqueJoinTableSource1474); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS117);

							}
							break;

					}

					pushFollow(FOLLOW_identifier_in_uniqueJoinTableSource1479);
					alias=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ts, tabname, alias
			// token labels: 
			// rule labels: tabname, alias, retval, ts
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.getTree():null);
			RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
			RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 214:5: -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
			{
				// FromClauseParser.g:214:8: ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF"), root_1);
				adaptor.addChild(root_1, stream_tabname.nextTree());
				// FromClauseParser.g:214:31: ( $ts)?
				if ( stream_ts.hasNext() ) {
					adaptor.addChild(root_1, stream_ts.nextTree());
				}
				stream_ts.reset();

				// FromClauseParser.g:214:36: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextTree());
				}
				stream_alias.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "uniqueJoinTableSource"


	public static class tableName_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "tableName"
	// FromClauseParser.g:217:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );
	public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
		HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token DOT118=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope tab =null;

		ASTNode DOT118_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"table name", state); 
		try {
			// FromClauseParser.g:220:5: (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) )
			int alt42=2;
			alt42 = dfa42.predict(input);
			switch (alt42) {
				case 1 :
					// FromClauseParser.g:221:5: db= identifier DOT tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1535);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT118=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1537); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT118);

					pushFollow(FOLLOW_identifier_in_tableName1541);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: db, tab
					// token labels: 
					// rule labels: tab, db, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);
					RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 222:5: -> ^( TOK_TABNAME $db $tab)
					{
						// FromClauseParser.g:222:8: ^( TOK_TABNAME $db $tab)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_db.nextTree());
						adaptor.addChild(root_1, stream_tab.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:224:5: tab= identifier
					{
					pushFollow(FOLLOW_identifier_in_tableName1571);
					tab=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());
					// AST REWRITE
					// elements: tab
					// token labels: 
					// rule labels: tab, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 225:5: -> ^( TOK_TABNAME $tab)
					{
						// FromClauseParser.g:225:8: ^( TOK_TABNAME $tab)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
						adaptor.addChild(root_1, stream_tab.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableName"


	public static class viewName_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "viewName"
	// FromClauseParser.g:228:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
	public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
		HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token DOT119=null;
		ParserRuleReturnScope db =null;
		ParserRuleReturnScope view =null;

		ASTNode DOT119_tree=null;
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"view name", state); 
		try {
			// FromClauseParser.g:231:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
			// FromClauseParser.g:232:5: (db= identifier DOT )? view= identifier
			{
			// FromClauseParser.g:232:5: (db= identifier DOT )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==Identifier) ) {
				int LA43_1 = input.LA(2);
				if ( (LA43_1==DOT) ) {
					alt43=1;
				}
			}
			else if ( ((LA43_0 >= KW_ABORT && LA43_0 <= KW_AFTER)||LA43_0==KW_ALLOC_FRACTION||LA43_0==KW_ANALYZE||LA43_0==KW_ARCHIVE||(LA43_0 >= KW_ASC && LA43_0 <= KW_AST)||(LA43_0 >= KW_AUTOCOMMIT && LA43_0 <= KW_BEFORE)||(LA43_0 >= KW_BUCKET && LA43_0 <= KW_BUCKETS)||(LA43_0 >= KW_CACHE && LA43_0 <= KW_CASCADE)||LA43_0==KW_CHANGE||(LA43_0 >= KW_CHECK && LA43_0 <= KW_COLLECTION)||(LA43_0 >= KW_COLUMNS && LA43_0 <= KW_COMMENT)||(LA43_0 >= KW_COMPACT && LA43_0 <= KW_CONCATENATE)||LA43_0==KW_CONTINUE||LA43_0==KW_DATA||(LA43_0 >= KW_DATABASES && LA43_0 <= KW_DEBUG)||(LA43_0 >= KW_DEFAULT && LA43_0 <= KW_DEFINED)||(LA43_0 >= KW_DELIMITED && LA43_0 <= KW_DESC)||(LA43_0 >= KW_DETAIL && LA43_0 <= KW_DISABLE)||(LA43_0 >= KW_DISTRIBUTE && LA43_0 <= KW_DO)||LA43_0==KW_DOW||(LA43_0 >= KW_DUMP && LA43_0 <= KW_ELEM_TYPE)||LA43_0==KW_ENABLE||(LA43_0 >= KW_ENFORCED && LA43_0 <= KW_ESCAPED)||LA43_0==KW_EXCLUSIVE||(LA43_0 >= KW_EXPLAIN && LA43_0 <= KW_EXPRESSION)||(LA43_0 >= KW_FIELDS && LA43_0 <= KW_FIRST)||(LA43_0 >= KW_FORMAT && LA43_0 <= KW_FORMATTED)||LA43_0==KW_FUNCTIONS||LA43_0==KW_GROUP||(LA43_0 >= KW_HOUR && LA43_0 <= KW_IDXPROPERTIES)||(LA43_0 >= KW_INDEX && LA43_0 <= KW_INDEXES)||(LA43_0 >= KW_INPATH && LA43_0 <= KW_INPUTFORMAT)||(LA43_0 >= KW_ISOLATION && LA43_0 <= KW_JAR)||(LA43_0 >= KW_KEY && LA43_0 <= KW_LAST)||LA43_0==KW_LEVEL||(LA43_0 >= KW_LIMIT && LA43_0 <= KW_LOAD)||(LA43_0 >= KW_LOCATION && LA43_0 <= KW_LONG)||LA43_0==KW_MANAGEMENT||(LA43_0 >= KW_MAPJOIN && LA43_0 <= KW_MATERIALIZED)||LA43_0==KW_METADATA||(LA43_0 >= KW_MINUTE && LA43_0 <= KW_MONTH)||(LA43_0 >= KW_MOVE && LA43_0 <= KW_MSCK)||(LA43_0 >= KW_NORELY && LA43_0 <= KW_NOSCAN)||LA43_0==KW_NOVALIDATE||LA43_0==KW_NULLS||LA43_0==KW_OFFSET||(LA43_0 >= KW_OPERATOR && LA43_0 <= KW_OPTION)||LA43_0==KW_ORDER||(LA43_0 >= KW_OUTPUTDRIVER && LA43_0 <= KW_OUTPUTFORMAT)||(LA43_0 >= KW_OVERWRITE && LA43_0 <= KW_OWNER)||(LA43_0 >= KW_PARTITIONED && LA43_0 <= KW_PATH)||(LA43_0 >= KW_PLAN && LA43_0 <= KW_POOL)||LA43_0==KW_PRINCIPALS||(LA43_0 >= KW_PURGE && LA43_0 <= KW_QUERY_PARALLELISM)||LA43_0==KW_READ||(LA43_0 >= KW_REBUILD && LA43_0 <= KW_RECORDWRITER)||(LA43_0 >= KW_RELOAD && LA43_0 <= KW_RESTRICT)||LA43_0==KW_REWRITE||(LA43_0 >= KW_ROLE && LA43_0 <= KW_ROLES)||(LA43_0 >= KW_SCHEDULING_POLICY && LA43_0 <= KW_SECOND)||(LA43_0 >= KW_SEMI && LA43_0 <= KW_SERVER)||(LA43_0 >= KW_SETS && LA43_0 <= KW_SKEWED)||(LA43_0 >= KW_SNAPSHOT && LA43_0 <= KW_SSL)||(LA43_0 >= KW_STATISTICS && LA43_0 <= KW_SUMMARY)||LA43_0==KW_TABLES||(LA43_0 >= KW_TBLPROPERTIES && LA43_0 <= KW_TERMINATED)||LA43_0==KW_TINYINT||(LA43_0 >= KW_TOUCH && LA43_0 <= KW_TRANSACTIONS)||LA43_0==KW_UNARCHIVE||LA43_0==KW_UNDO||LA43_0==KW_UNIONTYPE||(LA43_0 >= KW_UNKNOWN && LA43_0 <= KW_UNSIGNED)||(LA43_0 >= KW_URI && LA43_0 <= KW_USE)||(LA43_0 >= KW_UTC && LA43_0 <= KW_VALIDATE)||LA43_0==KW_VALUE_TYPE||(LA43_0 >= KW_VECTORIZATION && LA43_0 <= KW_WEEK)||LA43_0==KW_WHILE||(LA43_0 >= KW_WORK && LA43_0 <= KW_ZONE)||LA43_0==KW_BATCH||LA43_0==KW_DAYOFWEEK||LA43_0==KW_HOLD_DDLTIME||LA43_0==KW_IGNORE||LA43_0==KW_NO_DROP||LA43_0==KW_OFFLINE||LA43_0==KW_PROTECTION||LA43_0==KW_READONLY||LA43_0==KW_TIMESTAMPTZ) ) {
				int LA43_2 = input.LA(2);
				if ( (LA43_2==DOT) ) {
					alt43=1;
				}
			}
			switch (alt43) {
				case 1 :
					// FromClauseParser.g:232:6: db= identifier DOT
					{
					pushFollow(FOLLOW_identifier_in_viewName1618);
					db=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(db.getTree());
					DOT119=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1620); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_DOT.add(DOT119);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_viewName1626);
			view=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(view.getTree());
			// AST REWRITE
			// elements: db, view
			// token labels: 
			// rule labels: view, db, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.getTree():null);
			RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 233:5: -> ^( TOK_TABNAME ( $db)? $view)
			{
				// FromClauseParser.g:233:8: ^( TOK_TABNAME ( $db)? $view)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME"), root_1);
				// FromClauseParser.g:233:23: ( $db)?
				if ( stream_db.hasNext() ) {
					adaptor.addChild(root_1, stream_db.nextTree());
				}
				stream_db.reset();

				adaptor.addChild(root_1, stream_view.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "viewName"


	public static class subQuerySource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "subQuerySource"
	// FromClauseParser.g:236:1: subQuerySource : LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
	public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
		HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN120=null;
		Token RPAREN122=null;
		Token KW_AS123=null;
		ParserRuleReturnScope queryStatementExpression121 =null;
		ParserRuleReturnScope identifier124 =null;

		ASTNode LPAREN120_tree=null;
		ASTNode RPAREN122_tree=null;
		ASTNode KW_AS123_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");

		 gParent.pushMsg(retval.start,"subquery source", state); 
		try {
			// FromClauseParser.g:239:5: ( LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
			// FromClauseParser.g:240:5: LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier
			{
			LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1674); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN120);

			pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1676);
			queryStatementExpression121=gHiveParser.queryStatementExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression121.getTree());
			RPAREN122=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1678); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN122);

			// FromClauseParser.g:240:44: ( KW_AS )?
			int alt44=2;
			int LA44_0 = input.LA(1);
			if ( (LA44_0==KW_AS) ) {
				alt44=1;
			}
			switch (alt44) {
				case 1 :
					// FromClauseParser.g:240:44: KW_AS
					{
					KW_AS123=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_subQuerySource1680); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS123);

					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_subQuerySource1683);
			identifier124=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier124.getTree());
			// AST REWRITE
			// elements: identifier, queryStatementExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 240:62: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
			{
				// FromClauseParser.g:240:65: ^( TOK_SUBQUERY queryStatementExpression identifier )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_1);
				adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subQuerySource"


	public static class partitioningSpec_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "partitioningSpec"
	// FromClauseParser.g:244:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
	public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
		HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope partitionByClause125 =null;
		ParserRuleReturnScope orderByClause126 =null;
		ParserRuleReturnScope orderByClause127 =null;
		ParserRuleReturnScope distributeByClause128 =null;
		ParserRuleReturnScope sortByClause129 =null;
		ParserRuleReturnScope sortByClause130 =null;
		ParserRuleReturnScope clusterByClause131 =null;

		RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
		RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
		RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
		RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
		RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");

		 gParent.pushMsg(retval.start,"partitioningSpec clause", state); 
		try {
			// FromClauseParser.g:247:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
			int alt47=5;
			switch ( input.LA(1) ) {
			case KW_PARTITION:
				{
				alt47=1;
				}
				break;
			case KW_ORDER:
				{
				alt47=2;
				}
				break;
			case KW_DISTRIBUTE:
				{
				alt47=3;
				}
				break;
			case KW_SORT:
				{
				alt47=4;
				}
				break;
			case KW_CLUSTER:
				{
				alt47=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 47, 0, input);
				throw nvae;
			}
			switch (alt47) {
				case 1 :
					// FromClauseParser.g:248:4: partitionByClause ( orderByClause )?
					{
					pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1723);
					partitionByClause125=gHiveParser.partitionByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause125.getTree());
					// FromClauseParser.g:248:22: ( orderByClause )?
					int alt45=2;
					int LA45_0 = input.LA(1);
					if ( (LA45_0==KW_ORDER) ) {
						alt45=1;
					}
					switch (alt45) {
						case 1 :
							// FromClauseParser.g:248:22: orderByClause
							{
							pushFollow(FOLLOW_orderByClause_in_partitioningSpec1725);
							orderByClause126=gHiveParser.orderByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause126.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: orderByClause, partitionByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 248:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
					{
						// FromClauseParser.g:248:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_partitionByClause.nextTree());
						// FromClauseParser.g:248:81: ( orderByClause )?
						if ( stream_orderByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_orderByClause.nextTree());
						}
						stream_orderByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// FromClauseParser.g:249:4: orderByClause
					{
					pushFollow(FOLLOW_orderByClause_in_partitioningSpec1744);
					orderByClause127=gHiveParser.orderByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause127.getTree());
					// AST REWRITE
					// elements: orderByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 249:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
					{
						// FromClauseParser.g:249:21: ^( TOK_PARTITIONINGSPEC orderByClause )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_orderByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// FromClauseParser.g:250:4: distributeByClause ( sortByClause )?
					{
					pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1759);
					distributeByClause128=gHiveParser.distributeByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause128.getTree());
					// FromClauseParser.g:250:23: ( sortByClause )?
					int alt46=2;
					int LA46_0 = input.LA(1);
					if ( (LA46_0==KW_SORT) ) {
						alt46=1;
					}
					switch (alt46) {
						case 1 :
							// FromClauseParser.g:250:23: sortByClause
							{
							pushFollow(FOLLOW_sortByClause_in_partitioningSpec1761);
							sortByClause129=gHiveParser.sortByClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause129.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: distributeByClause, sortByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 250:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
					{
						// FromClauseParser.g:250:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_distributeByClause.nextTree());
						// FromClauseParser.g:250:82: ( sortByClause )?
						if ( stream_sortByClause.hasNext() ) {
							adaptor.addChild(root_1, stream_sortByClause.nextTree());
						}
						stream_sortByClause.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 4 :
					// FromClauseParser.g:251:4: sortByClause
					{
					pushFollow(FOLLOW_sortByClause_in_partitioningSpec1780);
					sortByClause130=gHiveParser.sortByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause130.getTree());
					// AST REWRITE
					// elements: sortByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 251:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
					{
						// FromClauseParser.g:251:20: ^( TOK_PARTITIONINGSPEC sortByClause )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_sortByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 5 :
					// FromClauseParser.g:252:4: clusterByClause
					{
					pushFollow(FOLLOW_clusterByClause_in_partitioningSpec1795);
					clusterByClause131=gHiveParser.clusterByClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause131.getTree());
					// AST REWRITE
					// elements: clusterByClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 252:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
					{
						// FromClauseParser.g:252:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC"), root_1);
						adaptor.addChild(root_1, stream_clusterByClause.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitioningSpec"


	public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "partitionTableFunctionSource"
	// FromClauseParser.g:255:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
	public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
		HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope subQuerySource132 =null;
		ParserRuleReturnScope tableSource133 =null;
		ParserRuleReturnScope partitionedTableFunction134 =null;


		 gParent.pushMsg(retval.start,"partitionTableFunctionSource clause", state); 
		try {
			// FromClauseParser.g:258:4: ( subQuerySource | tableSource | partitionedTableFunction )
			int alt48=3;
			switch ( input.LA(1) ) {
			case LPAREN:
				{
				alt48=1;
				}
				break;
			case Identifier:
				{
				int LA48_2 = input.LA(2);
				if ( (LA48_2==EOF||LA48_2==DOT||LA48_2==Identifier||(LA48_2 >= KW_ABORT && LA48_2 <= KW_AFTER)||LA48_2==KW_ALLOC_FRACTION||LA48_2==KW_ANALYZE||LA48_2==KW_ARCHIVE||(LA48_2 >= KW_AS && LA48_2 <= KW_AST)||(LA48_2 >= KW_AUTOCOMMIT && LA48_2 <= KW_BEFORE)||(LA48_2 >= KW_BUCKET && LA48_2 <= KW_BUCKETS)||(LA48_2 >= KW_CACHE && LA48_2 <= KW_CASCADE)||LA48_2==KW_CHANGE||(LA48_2 >= KW_CHECK && LA48_2 <= KW_COLLECTION)||(LA48_2 >= KW_COLUMNS && LA48_2 <= KW_COMMENT)||(LA48_2 >= KW_COMPACT && LA48_2 <= KW_CONCATENATE)||LA48_2==KW_CONTINUE||LA48_2==KW_DATA||(LA48_2 >= KW_DATABASES && LA48_2 <= KW_DEBUG)||(LA48_2 >= KW_DEFAULT && LA48_2 <= KW_DEFINED)||(LA48_2 >= KW_DELIMITED && LA48_2 <= KW_DESC)||(LA48_2 >= KW_DETAIL && LA48_2 <= KW_DISABLE)||(LA48_2 >= KW_DISTRIBUTE && LA48_2 <= KW_DO)||LA48_2==KW_DOW||(LA48_2 >= KW_DUMP && LA48_2 <= KW_ELEM_TYPE)||LA48_2==KW_ENABLE||(LA48_2 >= KW_ENFORCED && LA48_2 <= KW_ESCAPED)||LA48_2==KW_EXCLUSIVE||(LA48_2 >= KW_EXPLAIN && LA48_2 <= KW_EXPRESSION)||(LA48_2 >= KW_FIELDS && LA48_2 <= KW_FIRST)||(LA48_2 >= KW_FORMAT && LA48_2 <= KW_FORMATTED)||LA48_2==KW_FUNCTIONS||LA48_2==KW_GROUP||(LA48_2 >= KW_HOUR && LA48_2 <= KW_IDXPROPERTIES)||(LA48_2 >= KW_INDEX && LA48_2 <= KW_INDEXES)||(LA48_2 >= KW_INPATH && LA48_2 <= KW_INPUTFORMAT)||(LA48_2 >= KW_ISOLATION && LA48_2 <= KW_JAR)||(LA48_2 >= KW_KEY && LA48_2 <= KW_LAST)||LA48_2==KW_LEVEL||(LA48_2 >= KW_LIMIT && LA48_2 <= KW_LOAD)||(LA48_2 >= KW_LOCATION && LA48_2 <= KW_LONG)||LA48_2==KW_MANAGEMENT||(LA48_2 >= KW_MAPJOIN && LA48_2 <= KW_MATERIALIZED)||LA48_2==KW_METADATA||(LA48_2 >= KW_MINUTE && LA48_2 <= KW_MONTH)||(LA48_2 >= KW_MOVE && LA48_2 <= KW_MSCK)||(LA48_2 >= KW_NORELY && LA48_2 <= KW_NOSCAN)||LA48_2==KW_NOVALIDATE||LA48_2==KW_NULLS||LA48_2==KW_OFFSET||(LA48_2 >= KW_OPERATOR && LA48_2 <= KW_OPTION)||LA48_2==KW_ORDER||(LA48_2 >= KW_OUTPUTDRIVER && LA48_2 <= KW_OUTPUTFORMAT)||(LA48_2 >= KW_OVERWRITE && LA48_2 <= KW_PATH)||(LA48_2 >= KW_PLAN && LA48_2 <= KW_POOL)||LA48_2==KW_PRINCIPALS||(LA48_2 >= KW_PURGE && LA48_2 <= KW_QUERY_PARALLELISM)||LA48_2==KW_READ||(LA48_2 >= KW_REBUILD && LA48_2 <= KW_RECORDWRITER)||(LA48_2 >= KW_RELOAD && LA48_2 <= KW_RESTRICT)||LA48_2==KW_REWRITE||(LA48_2 >= KW_ROLE && LA48_2 <= KW_ROLES)||(LA48_2 >= KW_SCHEDULING_POLICY && LA48_2 <= KW_SECOND)||(LA48_2 >= KW_SEMI && LA48_2 <= KW_SERVER)||(LA48_2 >= KW_SETS && LA48_2 <= KW_SKEWED)||(LA48_2 >= KW_SNAPSHOT && LA48_2 <= KW_SSL)||(LA48_2 >= KW_STATISTICS && LA48_2 <= KW_SUMMARY)||(LA48_2 >= KW_TABLES && LA48_2 <= KW_TERMINATED)||LA48_2==KW_TINYINT||(LA48_2 >= KW_TOUCH && LA48_2 <= KW_TRANSACTIONS)||LA48_2==KW_UNARCHIVE||LA48_2==KW_UNDO||LA48_2==KW_UNIONTYPE||(LA48_2 >= KW_UNKNOWN && LA48_2 <= KW_UNSIGNED)||(LA48_2 >= KW_URI && LA48_2 <= KW_USE)||(LA48_2 >= KW_UTC && LA48_2 <= KW_VALIDATE)||LA48_2==KW_VALUE_TYPE||(LA48_2 >= KW_VECTORIZATION && LA48_2 <= KW_WEEK)||LA48_2==KW_WHILE||(LA48_2 >= KW_WORK && LA48_2 <= KW_ZONE)||LA48_2==RPAREN||LA48_2==KW_BATCH||LA48_2==KW_DAYOFWEEK||LA48_2==KW_HOLD_DDLTIME||LA48_2==KW_IGNORE||LA48_2==KW_NO_DROP||LA48_2==KW_OFFLINE||LA48_2==KW_PROTECTION||LA48_2==KW_READONLY||LA48_2==KW_TIMESTAMPTZ) ) {
					alt48=2;
				}
				else if ( (LA48_2==LPAREN) ) {
					int LA48_5 = input.LA(3);
					if ( (LA48_5==KW_ON) ) {
						alt48=3;
					}
					else if ( (LA48_5==StringLiteral) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 48, 5, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_ABORT:
			case KW_ACTIVATE:
			case KW_ACTIVE:
			case KW_ADD:
			case KW_ADMIN:
			case KW_AFTER:
			case KW_ALLOC_FRACTION:
			case KW_ANALYZE:
			case KW_ARCHIVE:
			case KW_ASC:
			case KW_AST:
			case KW_AUTOCOMMIT:
			case KW_BEFORE:
			case KW_BUCKET:
			case KW_BUCKETS:
			case KW_CACHE:
			case KW_CASCADE:
			case KW_CHANGE:
			case KW_CHECK:
			case KW_CLUSTER:
			case KW_CLUSTERED:
			case KW_CLUSTERSTATUS:
			case KW_COLLECTION:
			case KW_COLUMNS:
			case KW_COMMENT:
			case KW_COMPACT:
			case KW_COMPACTIONS:
			case KW_COMPUTE:
			case KW_CONCATENATE:
			case KW_CONTINUE:
			case KW_DATA:
			case KW_DATABASES:
			case KW_DATE:
			case KW_DATETIME:
			case KW_DAY:
			case KW_DBPROPERTIES:
			case KW_DEBUG:
			case KW_DEFAULT:
			case KW_DEFERRED:
			case KW_DEFINED:
			case KW_DELIMITED:
			case KW_DEPENDENCY:
			case KW_DESC:
			case KW_DETAIL:
			case KW_DIRECTORIES:
			case KW_DIRECTORY:
			case KW_DISABLE:
			case KW_DISTRIBUTE:
			case KW_DO:
			case KW_DOW:
			case KW_DUMP:
			case KW_ELEM_TYPE:
			case KW_ENABLE:
			case KW_ENFORCED:
			case KW_ESCAPED:
			case KW_EXCLUSIVE:
			case KW_EXPLAIN:
			case KW_EXPORT:
			case KW_EXPRESSION:
			case KW_FIELDS:
			case KW_FILE:
			case KW_FILEFORMAT:
			case KW_FIRST:
			case KW_FORMAT:
			case KW_FORMATTED:
			case KW_FUNCTIONS:
			case KW_GROUP:
			case KW_HOUR:
			case KW_IDXPROPERTIES:
			case KW_INDEX:
			case KW_INDEXES:
			case KW_INPATH:
			case KW_INPUTDRIVER:
			case KW_INPUTFORMAT:
			case KW_ISOLATION:
			case KW_ITEMS:
			case KW_JAR:
			case KW_KEY:
			case KW_KEYS:
			case KW_KEY_TYPE:
			case KW_KILL:
			case KW_LAST:
			case KW_LEVEL:
			case KW_LIMIT:
			case KW_LINES:
			case KW_LOAD:
			case KW_LOCATION:
			case KW_LOCK:
			case KW_LOCKS:
			case KW_LOGICAL:
			case KW_LONG:
			case KW_MANAGEMENT:
			case KW_MAPJOIN:
			case KW_MAPPING:
			case KW_MATCHED:
			case KW_MATERIALIZED:
			case KW_METADATA:
			case KW_MINUTE:
			case KW_MONTH:
			case KW_MOVE:
			case KW_MSCK:
			case KW_NORELY:
			case KW_NOSCAN:
			case KW_NOVALIDATE:
			case KW_NULLS:
			case KW_OFFSET:
			case KW_OPERATOR:
			case KW_OPTION:
			case KW_ORDER:
			case KW_OUTPUTDRIVER:
			case KW_OUTPUTFORMAT:
			case KW_OVERWRITE:
			case KW_OWNER:
			case KW_PARTITIONED:
			case KW_PARTITIONS:
			case KW_PATH:
			case KW_PLAN:
			case KW_PLANS:
			case KW_PLUS:
			case KW_POOL:
			case KW_PRINCIPALS:
			case KW_PURGE:
			case KW_QUARTER:
			case KW_QUERY:
			case KW_QUERY_PARALLELISM:
			case KW_READ:
			case KW_REBUILD:
			case KW_RECORDREADER:
			case KW_RECORDWRITER:
			case KW_RELOAD:
			case KW_RELY:
			case KW_RENAME:
			case KW_REOPTIMIZATION:
			case KW_REPAIR:
			case KW_REPL:
			case KW_REPLACE:
			case KW_REPLICATION:
			case KW_RESOURCE:
			case KW_RESTRICT:
			case KW_REWRITE:
			case KW_ROLE:
			case KW_ROLES:
			case KW_SCHEDULING_POLICY:
			case KW_SCHEMA:
			case KW_SCHEMAS:
			case KW_SECOND:
			case KW_SEMI:
			case KW_SERDE:
			case KW_SERDEPROPERTIES:
			case KW_SERVER:
			case KW_SETS:
			case KW_SHARED:
			case KW_SHOW:
			case KW_SHOW_DATABASE:
			case KW_SKEWED:
			case KW_SNAPSHOT:
			case KW_SORT:
			case KW_SORTED:
			case KW_SSL:
			case KW_STATISTICS:
			case KW_STATUS:
			case KW_STORED:
			case KW_STREAMTABLE:
			case KW_STRING:
			case KW_STRUCT:
			case KW_SUMMARY:
			case KW_TABLES:
			case KW_TBLPROPERTIES:
			case KW_TEMPORARY:
			case KW_TERMINATED:
			case KW_TINYINT:
			case KW_TOUCH:
			case KW_TRANSACTION:
			case KW_TRANSACTIONAL:
			case KW_TRANSACTIONS:
			case KW_UNARCHIVE:
			case KW_UNDO:
			case KW_UNIONTYPE:
			case KW_UNKNOWN:
			case KW_UNLOCK:
			case KW_UNMANAGED:
			case KW_UNSET:
			case KW_UNSIGNED:
			case KW_URI:
			case KW_USE:
			case KW_UTC:
			case KW_UTCTIMESTAMP:
			case KW_VALIDATE:
			case KW_VALUE_TYPE:
			case KW_VECTORIZATION:
			case KW_VIEW:
			case KW_VIEWS:
			case KW_WAIT:
			case KW_WEEK:
			case KW_WHILE:
			case KW_WORK:
			case KW_WORKLOAD:
			case KW_WRITE:
			case KW_YEAR:
			case KW_ZONE:
			case KW_BATCH:
			case KW_DAYOFWEEK:
			case KW_HOLD_DDLTIME:
			case KW_IGNORE:
			case KW_NO_DROP:
			case KW_OFFLINE:
			case KW_PROTECTION:
			case KW_READONLY:
			case KW_TIMESTAMPTZ:
				{
				int LA48_3 = input.LA(2);
				if ( (LA48_3==EOF||LA48_3==DOT||LA48_3==Identifier||(LA48_3 >= KW_ABORT && LA48_3 <= KW_AFTER)||LA48_3==KW_ALLOC_FRACTION||LA48_3==KW_ANALYZE||LA48_3==KW_ARCHIVE||(LA48_3 >= KW_AS && LA48_3 <= KW_AST)||(LA48_3 >= KW_AUTOCOMMIT && LA48_3 <= KW_BEFORE)||(LA48_3 >= KW_BUCKET && LA48_3 <= KW_BUCKETS)||(LA48_3 >= KW_CACHE && LA48_3 <= KW_CASCADE)||LA48_3==KW_CHANGE||(LA48_3 >= KW_CHECK && LA48_3 <= KW_COLLECTION)||(LA48_3 >= KW_COLUMNS && LA48_3 <= KW_COMMENT)||(LA48_3 >= KW_COMPACT && LA48_3 <= KW_CONCATENATE)||LA48_3==KW_CONTINUE||LA48_3==KW_DATA||(LA48_3 >= KW_DATABASES && LA48_3 <= KW_DEBUG)||(LA48_3 >= KW_DEFAULT && LA48_3 <= KW_DEFINED)||(LA48_3 >= KW_DELIMITED && LA48_3 <= KW_DESC)||(LA48_3 >= KW_DETAIL && LA48_3 <= KW_DISABLE)||(LA48_3 >= KW_DISTRIBUTE && LA48_3 <= KW_DO)||LA48_3==KW_DOW||(LA48_3 >= KW_DUMP && LA48_3 <= KW_ELEM_TYPE)||LA48_3==KW_ENABLE||(LA48_3 >= KW_ENFORCED && LA48_3 <= KW_ESCAPED)||LA48_3==KW_EXCLUSIVE||(LA48_3 >= KW_EXPLAIN && LA48_3 <= KW_EXPRESSION)||(LA48_3 >= KW_FIELDS && LA48_3 <= KW_FIRST)||(LA48_3 >= KW_FORMAT && LA48_3 <= KW_FORMATTED)||LA48_3==KW_FUNCTIONS||LA48_3==KW_GROUP||(LA48_3 >= KW_HOUR && LA48_3 <= KW_IDXPROPERTIES)||(LA48_3 >= KW_INDEX && LA48_3 <= KW_INDEXES)||(LA48_3 >= KW_INPATH && LA48_3 <= KW_INPUTFORMAT)||(LA48_3 >= KW_ISOLATION && LA48_3 <= KW_JAR)||(LA48_3 >= KW_KEY && LA48_3 <= KW_LAST)||LA48_3==KW_LEVEL||(LA48_3 >= KW_LIMIT && LA48_3 <= KW_LOAD)||(LA48_3 >= KW_LOCATION && LA48_3 <= KW_LONG)||LA48_3==KW_MANAGEMENT||(LA48_3 >= KW_MAPJOIN && LA48_3 <= KW_MATERIALIZED)||LA48_3==KW_METADATA||(LA48_3 >= KW_MINUTE && LA48_3 <= KW_MONTH)||(LA48_3 >= KW_MOVE && LA48_3 <= KW_MSCK)||(LA48_3 >= KW_NORELY && LA48_3 <= KW_NOSCAN)||LA48_3==KW_NOVALIDATE||LA48_3==KW_NULLS||LA48_3==KW_OFFSET||(LA48_3 >= KW_OPERATOR && LA48_3 <= KW_OPTION)||LA48_3==KW_ORDER||(LA48_3 >= KW_OUTPUTDRIVER && LA48_3 <= KW_OUTPUTFORMAT)||(LA48_3 >= KW_OVERWRITE && LA48_3 <= KW_PATH)||(LA48_3 >= KW_PLAN && LA48_3 <= KW_POOL)||LA48_3==KW_PRINCIPALS||(LA48_3 >= KW_PURGE && LA48_3 <= KW_QUERY_PARALLELISM)||LA48_3==KW_READ||(LA48_3 >= KW_REBUILD && LA48_3 <= KW_RECORDWRITER)||(LA48_3 >= KW_RELOAD && LA48_3 <= KW_RESTRICT)||LA48_3==KW_REWRITE||(LA48_3 >= KW_ROLE && LA48_3 <= KW_ROLES)||(LA48_3 >= KW_SCHEDULING_POLICY && LA48_3 <= KW_SECOND)||(LA48_3 >= KW_SEMI && LA48_3 <= KW_SERVER)||(LA48_3 >= KW_SETS && LA48_3 <= KW_SKEWED)||(LA48_3 >= KW_SNAPSHOT && LA48_3 <= KW_SSL)||(LA48_3 >= KW_STATISTICS && LA48_3 <= KW_SUMMARY)||(LA48_3 >= KW_TABLES && LA48_3 <= KW_TERMINATED)||LA48_3==KW_TINYINT||(LA48_3 >= KW_TOUCH && LA48_3 <= KW_TRANSACTIONS)||LA48_3==KW_UNARCHIVE||LA48_3==KW_UNDO||LA48_3==KW_UNIONTYPE||(LA48_3 >= KW_UNKNOWN && LA48_3 <= KW_UNSIGNED)||(LA48_3 >= KW_URI && LA48_3 <= KW_USE)||(LA48_3 >= KW_UTC && LA48_3 <= KW_VALIDATE)||LA48_3==KW_VALUE_TYPE||(LA48_3 >= KW_VECTORIZATION && LA48_3 <= KW_WEEK)||LA48_3==KW_WHILE||(LA48_3 >= KW_WORK && LA48_3 <= KW_ZONE)||LA48_3==RPAREN||LA48_3==KW_BATCH||LA48_3==KW_DAYOFWEEK||LA48_3==KW_HOLD_DDLTIME||LA48_3==KW_IGNORE||LA48_3==KW_NO_DROP||LA48_3==KW_OFFLINE||LA48_3==KW_PROTECTION||LA48_3==KW_READONLY||LA48_3==KW_TIMESTAMPTZ) ) {
					alt48=2;
				}
				else if ( (LA48_3==LPAREN) ) {
					int LA48_18 = input.LA(3);
					if ( (LA48_18==KW_ON) ) {
						alt48=3;
					}
					else if ( (LA48_18==StringLiteral) ) {
						alt48=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 48, 18, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 48, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 48, 0, input);
				throw nvae;
			}
			switch (alt48) {
				case 1 :
					// FromClauseParser.g:259:4: subQuerySource
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource1831);
					subQuerySource132=subQuerySource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource132.getTree());

					}
					break;
				case 2 :
					// FromClauseParser.g:260:4: tableSource
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource1838);
					tableSource133=tableSource();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource133.getTree());

					}
					break;
				case 3 :
					// FromClauseParser.g:261:4: partitionedTableFunction
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1845);
					partitionedTableFunction134=partitionedTableFunction();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction134.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionTableFunctionSource"


	public static class partitionedTableFunction_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "partitionedTableFunction"
	// FromClauseParser.g:264:1: partitionedTableFunction : name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) ;
	public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
		HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN135=null;
		Token KW_ON136=null;
		Token Identifier137=null;
		Token LPAREN138=null;
		Token RPAREN140=null;
		Token COMMA141=null;
		Token Identifier142=null;
		Token LPAREN143=null;
		Token RPAREN145=null;
		Token RPAREN146=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope ptfsrc =null;
		ParserRuleReturnScope spec =null;
		ParserRuleReturnScope alias =null;
		ParserRuleReturnScope expression139 =null;
		ParserRuleReturnScope expression144 =null;

		ASTNode LPAREN135_tree=null;
		ASTNode KW_ON136_tree=null;
		ASTNode Identifier137_tree=null;
		ASTNode LPAREN138_tree=null;
		ASTNode RPAREN140_tree=null;
		ASTNode COMMA141_tree=null;
		ASTNode Identifier142_tree=null;
		ASTNode LPAREN143_tree=null;
		ASTNode RPAREN145_tree=null;
		ASTNode RPAREN146_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");

		 gParent.pushMsg(retval.start,"ptf clause", state); 
		try {
			// FromClauseParser.g:267:4: (name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) )
			// FromClauseParser.g:268:4: name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )?
			{
			pushFollow(FOLLOW_identifier_in_partitionedTableFunction1875);
			name=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(name.getTree());
			LPAREN135=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1877); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN135);

			KW_ON136=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction1879); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON136);

			// FromClauseParser.g:269:4: ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) )
			// FromClauseParser.g:269:5: ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
			{
			// FromClauseParser.g:269:39: (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
			// FromClauseParser.g:269:40: ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )?
			{
			pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1894);
			ptfsrc=partitionTableFunctionSource();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());
			// FromClauseParser.g:269:80: (spec= partitioningSpec )?
			int alt49=2;
			int LA49_0 = input.LA(1);
			if ( (LA49_0==KW_CLUSTER||LA49_0==KW_DISTRIBUTE||LA49_0==KW_ORDER||LA49_0==KW_PARTITION||LA49_0==KW_SORT) ) {
				alt49=1;
			}
			switch (alt49) {
				case 1 :
					// FromClauseParser.g:269:80: spec= partitioningSpec
					{
					pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction1898);
					spec=partitioningSpec();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_partitioningSpec.add(spec.getTree());
					}
					break;

			}

			}

			}

			// FromClauseParser.g:270:4: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
			int alt51=2;
			int LA51_0 = input.LA(1);
			if ( (LA51_0==Identifier) && (synpred6_FromClauseParser())) {
				alt51=1;
			}
			switch (alt51) {
				case 1 :
					// FromClauseParser.g:270:5: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
					{
					Identifier137=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1920); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Identifier.add(Identifier137);

					LPAREN138=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1922); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN138);

					pushFollow(FOLLOW_expression_in_partitionedTableFunction1924);
					expression139=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression139.getTree());
					RPAREN140=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1926); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN140);

					// FromClauseParser.g:270:83: ( COMMA Identifier LPAREN expression RPAREN )*
					loop50:
					while (true) {
						int alt50=2;
						int LA50_0 = input.LA(1);
						if ( (LA50_0==COMMA) ) {
							alt50=1;
						}

						switch (alt50) {
						case 1 :
							// FromClauseParser.g:270:85: COMMA Identifier LPAREN expression RPAREN
							{
							COMMA141=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction1930); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA141);

							Identifier142=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction1932); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_Identifier.add(Identifier142);

							LPAREN143=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction1934); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN143);

							pushFollow(FOLLOW_expression_in_partitionedTableFunction1936);
							expression144=gHiveParser.expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_expression.add(expression144.getTree());
							RPAREN145=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1938); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN145);

							}
							break;

						default :
							break loop50;
						}
					}

					}
					break;

			}

			// FromClauseParser.g:271:4: ( ( RPAREN )=> ( RPAREN ) )
			// FromClauseParser.g:271:5: ( RPAREN )=> ( RPAREN )
			{
			// FromClauseParser.g:271:17: ( RPAREN )
			// FromClauseParser.g:271:18: RPAREN
			{
			RPAREN146=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction1955); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN146);

			}

			}

			// FromClauseParser.g:271:27: ( ( Identifier )=>alias= identifier )?
			int alt52=2;
			alt52 = dfa52.predict(input);
			switch (alt52) {
				case 1 :
					// FromClauseParser.g:271:28: ( Identifier )=>alias= identifier
					{
					pushFollow(FOLLOW_identifier_in_partitionedTableFunction1968);
					alias=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: ptfsrc, expression, name, alias, spec
			// token labels: 
			// rule labels: ptfsrc, name, alias, spec, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_ptfsrc=new RewriteRuleSubtreeStream(adaptor,"rule ptfsrc",ptfsrc!=null?ptfsrc.getTree():null);
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.getTree():null);
			RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 272:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
			{
				// FromClauseParser.g:272:9: ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION"), root_1);
				adaptor.addChild(root_1, stream_name.nextTree());
				// FromClauseParser.g:272:35: ( $alias)?
				if ( stream_alias.hasNext() ) {
					adaptor.addChild(root_1, stream_alias.nextTree());
				}
				stream_alias.reset();

				adaptor.addChild(root_1, stream_ptfsrc.nextTree());
				// FromClauseParser.g:272:51: ( $spec)?
				if ( stream_spec.hasNext() ) {
					adaptor.addChild(root_1, stream_spec.nextTree());
				}
				stream_spec.reset();

				// FromClauseParser.g:272:57: ( expression )*
				while ( stream_expression.hasNext() ) {
					adaptor.addChild(root_1, stream_expression.nextTree());
				}
				stream_expression.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "partitionedTableFunction"


	public static class whereClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "whereClause"
	// FromClauseParser.g:277:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
	public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
		HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_WHERE147=null;
		ParserRuleReturnScope searchCondition148 =null;

		ASTNode KW_WHERE147_tree=null;
		RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
		RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");

		 gParent.pushMsg(retval.start,"where clause", state); 
		try {
			// FromClauseParser.g:280:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
			// FromClauseParser.g:281:5: KW_WHERE searchCondition
			{
			KW_WHERE147=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause2030); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE147);

			pushFollow(FOLLOW_searchCondition_in_whereClause2032);
			searchCondition148=searchCondition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition148.getTree());
			// AST REWRITE
			// elements: searchCondition
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 281:30: -> ^( TOK_WHERE searchCondition )
			{
				// FromClauseParser.g:281:33: ^( TOK_WHERE searchCondition )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WHERE, "TOK_WHERE"), root_1);
				adaptor.addChild(root_1, stream_searchCondition.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whereClause"


	public static class searchCondition_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "searchCondition"
	// FromClauseParser.g:284:1: searchCondition : expression ;
	public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
		HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope expression149 =null;


		 gParent.pushMsg(retval.start,"search condition", state); 
		try {
			// FromClauseParser.g:287:5: ( expression )
			// FromClauseParser.g:288:5: expression
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_expression_in_searchCondition2071);
			expression149=gHiveParser.expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression149.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "searchCondition"


	public static class valuesClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "valuesClause"
	// FromClauseParser.g:302:1: valuesClause : KW_VALUES valuesTableConstructor -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor ) ;
	public final HiveParser_FromClauseParser.valuesClause_return valuesClause() throws RecognitionException {
		HiveParser_FromClauseParser.valuesClause_return retval = new HiveParser_FromClauseParser.valuesClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_VALUES150=null;
		ParserRuleReturnScope valuesTableConstructor151 =null;

		ASTNode KW_VALUES150_tree=null;
		RewriteRuleTokenStream stream_KW_VALUES=new RewriteRuleTokenStream(adaptor,"token KW_VALUES");
		RewriteRuleSubtreeStream stream_valuesTableConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valuesTableConstructor");

		 gParent.pushMsg(retval.start,"values clause", state); 
		try {
			// FromClauseParser.g:305:5: ( KW_VALUES valuesTableConstructor -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor ) )
			// FromClauseParser.g:306:5: KW_VALUES valuesTableConstructor
			{
			KW_VALUES150=(Token)match(input,KW_VALUES,FOLLOW_KW_VALUES_in_valuesClause2110); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_VALUES.add(KW_VALUES150);

			pushFollow(FOLLOW_valuesTableConstructor_in_valuesClause2112);
			valuesTableConstructor151=valuesTableConstructor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valuesTableConstructor.add(valuesTableConstructor151.getTree());
			// AST REWRITE
			// elements: valuesTableConstructor
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 306:38: -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor )
			{
				// FromClauseParser.g:306:41: ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_1);
				adaptor.addChild(root_1, (ASTNode)adaptor.create(Identifier, "array"));
				adaptor.addChild(root_1, stream_valuesTableConstructor.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valuesClause"


	public static class valuesTableConstructor_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "valuesTableConstructor"
	// FromClauseParser.g:309:1: valuesTableConstructor : valueRowConstructor ( COMMA ! valueRowConstructor )* ;
	public final HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor() throws RecognitionException {
		HiveParser_FromClauseParser.valuesTableConstructor_return retval = new HiveParser_FromClauseParser.valuesTableConstructor_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA153=null;
		ParserRuleReturnScope valueRowConstructor152 =null;
		ParserRuleReturnScope valueRowConstructor154 =null;

		ASTNode COMMA153_tree=null;

		 gParent.pushMsg(retval.start,"values table constructor", state); 
		try {
			// FromClauseParser.g:312:5: ( valueRowConstructor ( COMMA ! valueRowConstructor )* )
			// FromClauseParser.g:313:5: valueRowConstructor ( COMMA ! valueRowConstructor )*
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2154);
			valueRowConstructor152=valueRowConstructor();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, valueRowConstructor152.getTree());

			// FromClauseParser.g:313:25: ( COMMA ! valueRowConstructor )*
			loop53:
			while (true) {
				int alt53=2;
				int LA53_0 = input.LA(1);
				if ( (LA53_0==COMMA) ) {
					alt53=1;
				}

				switch (alt53) {
				case 1 :
					// FromClauseParser.g:313:26: COMMA ! valueRowConstructor
					{
					COMMA153=(Token)match(input,COMMA,FOLLOW_COMMA_in_valuesTableConstructor2157); if (state.failed) return retval;
					pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2160);
					valueRowConstructor154=valueRowConstructor();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, valueRowConstructor154.getTree());

					}
					break;

				default :
					break loop53;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valuesTableConstructor"


	public static class valueRowConstructor_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "valueRowConstructor"
	// FromClauseParser.g:316:1: valueRowConstructor : expressionsInParenthesis[true, true] ;
	public final HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor() throws RecognitionException {
		HiveParser_FromClauseParser.valueRowConstructor_return retval = new HiveParser_FromClauseParser.valueRowConstructor_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope expressionsInParenthesis155 =null;


		 gParent.pushMsg(retval.start,"value row constructor", state); 
		try {
			// FromClauseParser.g:319:5: ( expressionsInParenthesis[true, true] )
			// FromClauseParser.g:320:5: expressionsInParenthesis[true, true]
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_expressionsInParenthesis_in_valueRowConstructor2193);
			expressionsInParenthesis155=gHiveParser.expressionsInParenthesis(true, true);
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsInParenthesis155.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "valueRowConstructor"


	public static class virtualTableSource_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "virtualTableSource"
	// FromClauseParser.g:327:1: virtualTableSource : KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) ) ;
	public final HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource() throws RecognitionException {
		HiveParser_FromClauseParser.virtualTableSource_return retval = new HiveParser_FromClauseParser.virtualTableSource_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_TABLE156=null;
		Token LPAREN157=null;
		Token RPAREN159=null;
		Token KW_AS160=null;
		Token LPAREN161=null;
		Token COMMA163=null;
		Token RPAREN165=null;
		ParserRuleReturnScope tabAlias =null;
		ParserRuleReturnScope valuesClause158 =null;
		ParserRuleReturnScope identifier162 =null;
		ParserRuleReturnScope identifier164 =null;

		ASTNode KW_TABLE156_tree=null;
		ASTNode LPAREN157_tree=null;
		ASTNode RPAREN159_tree=null;
		ASTNode KW_AS160_tree=null;
		ASTNode LPAREN161_tree=null;
		ASTNode COMMA163_tree=null;
		ASTNode RPAREN165_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
		RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");

		 gParent.pushMsg(retval.start,"virtual table source", state); 
		try {
			// FromClauseParser.g:330:5: ( KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) ) )
			// FromClauseParser.g:331:5: KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN
			{
			KW_TABLE156=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_virtualTableSource2227); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE156);

			LPAREN157=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2229); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN157);

			pushFollow(FOLLOW_valuesClause_in_virtualTableSource2231);
			valuesClause158=valuesClause();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause158.getTree());
			RPAREN159=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2233); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN159);

			// FromClauseParser.g:331:41: ( KW_AS )?
			int alt54=2;
			int LA54_0 = input.LA(1);
			if ( (LA54_0==KW_AS) ) {
				alt54=1;
			}
			switch (alt54) {
				case 1 :
					// FromClauseParser.g:331:41: KW_AS
					{
					KW_AS160=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_virtualTableSource2235); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS160);

					}
					break;

			}

			pushFollow(FOLLOW_tableAlias_in_virtualTableSource2240);
			tabAlias=tableAlias();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_tableAlias.add(tabAlias.getTree());
			// FromClauseParser.g:331:68: ( LPAREN identifier ( COMMA identifier )* )?
			int alt56=2;
			int LA56_0 = input.LA(1);
			if ( (LA56_0==LPAREN) ) {
				alt56=1;
			}
			switch (alt56) {
				case 1 :
					// FromClauseParser.g:331:69: LPAREN identifier ( COMMA identifier )*
					{
					LPAREN161=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN161);

					pushFollow(FOLLOW_identifier_in_virtualTableSource2245);
					identifier162=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier162.getTree());
					// FromClauseParser.g:331:87: ( COMMA identifier )*
					loop55:
					while (true) {
						int alt55=2;
						int LA55_0 = input.LA(1);
						if ( (LA55_0==COMMA) ) {
							alt55=1;
						}

						switch (alt55) {
						case 1 :
							// FromClauseParser.g:331:88: COMMA identifier
							{
							COMMA163=(Token)match(input,COMMA,FOLLOW_COMMA_in_virtualTableSource2248); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_COMMA.add(COMMA163);

							pushFollow(FOLLOW_identifier_in_virtualTableSource2250);
							identifier164=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier164.getTree());
							}
							break;

						default :
							break loop55;
						}
					}

					}
					break;

			}

			RPAREN165=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2256); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN165);

			// AST REWRITE
			// elements: valuesClause, identifier
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 332:5: -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) )
			{
				// FromClauseParser.g:332:8: ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_1);
				// FromClauseParser.g:333:10: ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) )
				{
				ASTNode root_2 = (ASTNode)adaptor.nil();
				root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_QUERY, "TOK_QUERY"), root_2);
				// FromClauseParser.g:334:12: ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) )
				{
				ASTNode root_3 = (ASTNode)adaptor.nil();
				root_3 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FROM, "TOK_FROM"), root_3);
				// FromClauseParser.g:335:14: ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) )
				{
				ASTNode root_4 = (ASTNode)adaptor.nil();
				root_4 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY"), root_4);
				// FromClauseParser.g:336:16: ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) )
				{
				ASTNode root_5 = (ASTNode)adaptor.nil();
				root_5 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_QUERY, "TOK_QUERY"), root_5);
				// FromClauseParser.g:337:18: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) )
				{
				ASTNode root_6 = (ASTNode)adaptor.nil();
				root_6 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_INSERT, "TOK_INSERT"), root_6);
				// FromClauseParser.g:338:20: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
				{
				ASTNode root_7 = (ASTNode)adaptor.nil();
				root_7 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DESTINATION, "TOK_DESTINATION"), root_7);
				// FromClauseParser.g:338:38: ^( TOK_DIR TOK_TMP_FILE )
				{
				ASTNode root_8 = (ASTNode)adaptor.nil();
				root_8 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DIR, "TOK_DIR"), root_8);
				adaptor.addChild(root_8, (ASTNode)adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE"));
				adaptor.addChild(root_7, root_8);
				}

				adaptor.addChild(root_6, root_7);
				}

				// FromClauseParser.g:339:20: ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) )
				{
				ASTNode root_7 = (ASTNode)adaptor.nil();
				root_7 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_7);
				// FromClauseParser.g:339:33: ^( TOK_SELEXPR IntegralLiteral[\"0\"] )
				{
				ASTNode root_8 = (ASTNode)adaptor.nil();
				root_8 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_8);
				adaptor.addChild(root_8, (ASTNode)adaptor.create(IntegralLiteral, "0"));
				adaptor.addChild(root_7, root_8);
				}

				adaptor.addChild(root_6, root_7);
				}

				adaptor.addChild(root_5, root_6);
				}

				adaptor.addChild(root_4, root_5);
				}

				adaptor.addChild(root_4, adaptor.create(Identifier, (tabAlias!=null?((ASTNode)tabAlias.getTree()):null).getChild(0).getText()));
				adaptor.addChild(root_3, root_4);
				}

				adaptor.addChild(root_2, root_3);
				}

				// FromClauseParser.g:341:12: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) )
				{
				ASTNode root_3 = (ASTNode)adaptor.nil();
				root_3 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_INSERT, "TOK_INSERT"), root_3);
				// FromClauseParser.g:342:14: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
				{
				ASTNode root_4 = (ASTNode)adaptor.nil();
				root_4 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DESTINATION, "TOK_DESTINATION"), root_4);
				// FromClauseParser.g:342:32: ^( TOK_DIR TOK_TMP_FILE )
				{
				ASTNode root_5 = (ASTNode)adaptor.nil();
				root_5 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DIR, "TOK_DIR"), root_5);
				adaptor.addChild(root_5, (ASTNode)adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE"));
				adaptor.addChild(root_4, root_5);
				}

				adaptor.addChild(root_3, root_4);
				}

				// FromClauseParser.g:343:14: ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) )
				{
				ASTNode root_4 = (ASTNode)adaptor.nil();
				root_4 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_4);
				// FromClauseParser.g:343:27: ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* )
				{
				ASTNode root_5 = (ASTNode)adaptor.nil();
				root_5 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_5);
				// FromClauseParser.g:343:41: ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause )
				{
				ASTNode root_6 = (ASTNode)adaptor.nil();
				root_6 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION"), root_6);
				adaptor.addChild(root_6, (ASTNode)adaptor.create(Identifier, "inline"));
				adaptor.addChild(root_6, stream_valuesClause.nextTree());
				adaptor.addChild(root_5, root_6);
				}

				// FromClauseParser.g:343:91: ( identifier )*
				while ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_5, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				adaptor.addChild(root_4, root_5);
				}

				adaptor.addChild(root_3, root_4);
				}

				adaptor.addChild(root_2, root_3);
				}

				adaptor.addChild(root_1, root_2);
				}

				adaptor.addChild(root_1, adaptor.create(Identifier, (tabAlias!=null?((ASTNode)tabAlias.getTree()):null).getChild(0).getText()));
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
			if ( state.backtracking==0 ) { gParent.popMsg(state); }
		}

		catch (RecognitionException e) {
		  throw e;
		}

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "virtualTableSource"

	// $ANTLR start synpred1_FromClauseParser
	public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:105:5: ( subQuerySource )
		// FromClauseParser.g:105:6: subQuerySource
		{
		pushFollow(FOLLOW_subQuerySource_in_synpred1_FromClauseParser400);
		subQuerySource();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_FromClauseParser

	// $ANTLR start synpred2_FromClauseParser
	public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:159:2: ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )
		// FromClauseParser.g:159:3: ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER
		{
		// FromClauseParser.g:159:3: ( COMMA )?
		int alt57=2;
		int LA57_0 = input.LA(1);
		if ( (LA57_0==COMMA) ) {
			alt57=1;
		}
		switch (alt57) {
			case 1 :
				// FromClauseParser.g:159:3: COMMA
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred2_FromClauseParser888); if (state.failed) return;

				}
				break;

		}

		match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_synpred2_FromClauseParser891); if (state.failed) return;

		match(input,KW_VIEW,FOLLOW_KW_VIEW_in_synpred2_FromClauseParser893); if (state.failed) return;

		match(input,KW_OUTER,FOLLOW_KW_OUTER_in_synpred2_FromClauseParser895); if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_FromClauseParser

	// $ANTLR start synpred3_FromClauseParser
	public final void synpred3_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:159:109: ( COMMA )
		// FromClauseParser.g:159:110: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred3_FromClauseParser917); if (state.failed) return;

		}

	}
	// $ANTLR end synpred3_FromClauseParser

	// $ANTLR start synpred4_FromClauseParser
	public final void synpred4_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:162:67: ( COMMA )
		// FromClauseParser.g:162:68: COMMA
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred4_FromClauseParser973); if (state.failed) return;

		}

	}
	// $ANTLR end synpred4_FromClauseParser

	// $ANTLR start synpred6_FromClauseParser
	public final void synpred6_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:270:5: ( Identifier LPAREN expression RPAREN )
		// FromClauseParser.g:270:6: Identifier LPAREN expression RPAREN
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred6_FromClauseParser1908); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred6_FromClauseParser1910); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred6_FromClauseParser1912);
		gHiveParser.expression();
		state._fsp--;
		if (state.failed) return;

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred6_FromClauseParser1914); if (state.failed) return;

		}

	}
	// $ANTLR end synpred6_FromClauseParser

	// $ANTLR start synpred8_FromClauseParser
	public final void synpred8_FromClauseParser_fragment() throws RecognitionException {
		// FromClauseParser.g:271:28: ( Identifier )
		// FromClauseParser.g:271:29: Identifier
		{
		match(input,Identifier,FOLLOW_Identifier_in_synpred8_FromClauseParser1961); if (state.failed) return;

		}

	}
	// $ANTLR end synpred8_FromClauseParser

	// Delegated rules

	public final boolean synpred3_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred3_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred4_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred4_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred2_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred6_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred6_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred8_FromClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred8_FromClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA20 dfa20 = new DFA20(this);
	protected DFA23 dfa23 = new DFA23(this);
	protected DFA38 dfa38 = new DFA38(this);
	protected DFA42 dfa42 = new DFA42(this);
	protected DFA52 dfa52 = new DFA52(this);
	static final String DFA10_eotS =
		"\137\uffff";
	static final String DFA10_eofS =
		"\1\uffff\2\5\134\uffff";
	static final String DFA10_minS =
		"\1\30\2\11\1\uffff\1\30\1\uffff\1\u00d6\40\uffff\1\u00d6\45\uffff\1\30"+
		"\7\uffff\4\0\6\uffff";
	static final String DFA10_maxS =
		"\3\u0292\1\uffff\1\u0292\1\uffff\1\u0181\40\uffff\1\u0181\45\uffff\1\u0292"+
		"\7\uffff\4\0\6\uffff";
	static final String DFA10_acceptS =
		"\3\uffff\1\2\1\uffff\1\1\101\uffff\6\3\1\uffff\1\5\2\uffff\1\4\15\uffff";
	static final String DFA10_specialS =
		"\4\uffff\1\0\120\uffff\1\1\1\2\1\3\1\4\6\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\2\2\5\uffff\2\2\1\uffff\2\2\2\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff"+
			"\4\2\2\uffff\1\2\7\uffff\1\2\1\uffff\6\2\1\uffff\3\2\1\uffff\3\2\1\uffff"+
			"\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
			"\1\2\1\uffff\3\2\5\uffff\4\2\6\uffff\2\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\3\uffff\2\2\1\uffff\3\2\6\uffff\3\2\1\uffff\5\2\3\uffff\1\2\1\uffff"+
			"\3\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\1\2\2\uffff\3\2\3\uffff\12\2\1\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\4\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff\7\2\1\uffff\1\3\1\2"+
			"\1\uffff\3\2\4\uffff\1\2\1\uffff\4\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\5\2\1\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\uffff\5\2\2\uffff"+
			"\1\2\2\uffff\5\2\4\uffff\1\4\70\uffff\1\2\44\uffff\1\2\57\uffff\1\2\3"+
			"\uffff\1\2\56\uffff\1\2\3\uffff\1\2\31\uffff\1\2\6\uffff\1\2\74\uffff"+
			"\1\2",
			"\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\3\5\1\uffff\2\5\5\uffff\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\4\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\uffff"+
			"\6\5\1\uffff\3\5\1\uffff\3\5\1\uffff\4\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\1\uffff\3\5\5\uffff\4\5\6\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\3\uffff\7\5\1\uffff"+
			"\1\5\3\uffff\13\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff\6\5\1\uffff"+
			"\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff"+
			"\2\5\1\uffff\1\5\2\uffff\2\5\1\uffff\2\5\1\uffff\3\5\1\uffff\4\5\4\uffff"+
			"\1\5\1\uffff\4\5\1\uffff\1\5\2\uffff\4\5\2\uffff\12\5\1\uffff\2\5\1\uffff"+
			"\2\5\4\uffff\11\5\1\uffff\5\5\1\uffff\4\5\1\uffff\7\5\2\uffff\5\5\4\uffff"+
			"\1\5\1\uffff\4\5\4\uffff\1\5\1\uffff\3\5\2\uffff\5\5\1\uffff\2\5\2\uffff"+
			"\3\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\5\5\4\uffff\1\6\14\uffff"+
			"\1\5\53\uffff\1\5\44\uffff\1\5\57\uffff\1\5\3\uffff\1\5\56\uffff\1\5"+
			"\3\uffff\1\5\31\uffff\1\5\6\uffff\1\5\74\uffff\1\5",
			"\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\3\5\1\uffff\2\5\5\uffff\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\4\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\uffff"+
			"\6\5\1\uffff\3\5\1\uffff\3\5\1\uffff\4\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\1\uffff\3\5\5\uffff\4\5\6\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\3\uffff\7\5\1\uffff"+
			"\1\5\3\uffff\13\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff\6\5\1\uffff"+
			"\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\2\uffff"+
			"\2\5\1\uffff\1\5\2\uffff\2\5\1\uffff\2\5\1\uffff\3\5\1\uffff\4\5\4\uffff"+
			"\1\5\1\uffff\4\5\1\uffff\1\5\2\uffff\4\5\2\uffff\12\5\1\uffff\2\5\1\uffff"+
			"\2\5\4\uffff\11\5\1\uffff\5\5\1\uffff\4\5\1\uffff\7\5\2\uffff\5\5\4\uffff"+
			"\1\5\1\uffff\4\5\4\uffff\1\5\1\uffff\3\5\2\uffff\5\5\1\uffff\2\5\2\uffff"+
			"\3\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\5\5\4\uffff\1\47\14"+
			"\uffff\1\5\53\uffff\1\5\44\uffff\1\5\57\uffff\1\5\3\uffff\1\5\56\uffff"+
			"\1\5\3\uffff\1\5\31\uffff\1\5\6\uffff\1\5\74\uffff\1\5",
			"",
			"\1\116\1\uffff\6\116\1\uffff\1\116\1\uffff\1\116\3\uffff\1\116\2\uffff"+
			"\2\116\1\uffff\2\116\5\uffff\2\116\1\uffff\2\116\2\uffff\1\116\1\uffff"+
			"\5\116\1\uffff\2\116\1\uffff\4\116\2\uffff\1\116\7\uffff\1\116\1\uffff"+
			"\6\116\1\uffff\3\116\1\uffff\3\116\1\uffff\4\116\1\uffff\2\116\1\uffff"+
			"\1\116\1\uffff\2\116\1\uffff\1\116\1\uffff\2\116\2\uffff\1\116\1\uffff"+
			"\3\116\5\uffff\4\116\6\uffff\2\116\1\110\2\uffff\1\116\1\uffff\1\116"+
			"\2\uffff\2\116\3\uffff\2\116\1\uffff\3\116\1\111\5\uffff\3\116\1\uffff"+
			"\5\116\3\uffff\1\116\1\uffff\3\116\1\uffff\5\116\1\uffff\1\116\1\113"+
			"\4\116\1\uffff\1\116\1\uffff\2\116\1\uffff\2\116\1\uffff\2\116\1\uffff"+
			"\1\116\1\uffff\1\116\1\uffff\1\116\2\uffff\2\116\1\uffff\1\116\2\uffff"+
			"\2\116\1\uffff\2\116\1\uffff\3\116\1\uffff\4\116\4\uffff\1\116\1\uffff"+
			"\4\116\1\uffff\1\116\2\uffff\3\116\1\114\2\uffff\12\116\1\uffff\1\116"+
			"\2\uffff\2\116\4\uffff\4\116\1\112\4\116\1\uffff\5\116\1\uffff\4\116"+
			"\1\uffff\7\116\1\uffff\2\116\1\uffff\3\116\4\uffff\1\116\1\uffff\4\116"+
			"\4\uffff\1\116\1\uffff\1\116\1\uffff\1\116\2\uffff\5\116\1\uffff\2\116"+
			"\2\uffff\3\116\1\uffff\1\116\1\uffff\5\116\2\uffff\1\116\1\uffff\1\107"+
			"\5\116\4\uffff\1\115\70\uffff\1\116\44\uffff\1\116\57\uffff\1\116\3\uffff"+
			"\1\116\56\uffff\1\116\3\uffff\1\116\31\uffff\1\116\6\uffff\1\116\74\uffff"+
			"\1\116",
			"",
			"\1\121\u00aa\uffff\1\5",
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
			"\1\121\u00aa\uffff\1\5",
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
			"",
			"",
			"",
			"",
			"\1\116\1\uffff\6\116\1\uffff\1\116\1\uffff\1\116\3\uffff\1\116\2\uffff"+
			"\2\116\1\uffff\2\116\5\uffff\2\116\1\uffff\2\116\2\uffff\1\116\1\uffff"+
			"\5\116\1\uffff\2\116\1\uffff\4\116\2\uffff\1\116\7\uffff\1\116\1\uffff"+
			"\6\116\1\uffff\3\116\1\uffff\3\116\1\uffff\4\116\1\uffff\2\116\1\uffff"+
			"\1\116\1\uffff\2\116\1\uffff\1\116\1\uffff\2\116\2\uffff\1\116\1\uffff"+
			"\3\116\5\uffff\4\116\6\uffff\3\116\2\uffff\1\116\1\uffff\1\116\2\uffff"+
			"\2\116\3\uffff\2\116\1\uffff\4\116\5\uffff\3\116\1\uffff\5\116\3\uffff"+
			"\1\116\1\uffff\3\116\1\uffff\5\116\1\uffff\1\116\1\126\4\116\1\uffff"+
			"\1\116\1\uffff\2\116\1\uffff\2\116\1\uffff\2\116\1\uffff\1\116\1\uffff"+
			"\1\116\1\uffff\1\116\2\uffff\2\116\1\uffff\1\116\2\uffff\2\116\1\uffff"+
			"\2\116\1\uffff\3\116\1\uffff\4\116\4\uffff\1\116\1\uffff\4\116\1\uffff"+
			"\1\116\2\uffff\3\116\1\127\2\uffff\12\116\1\uffff\1\116\2\uffff\2\116"+
			"\4\uffff\4\116\1\125\4\116\1\uffff\5\116\1\uffff\4\116\1\uffff\7\116"+
			"\1\uffff\2\116\1\uffff\3\116\4\uffff\1\116\1\uffff\4\116\4\uffff\1\116"+
			"\1\uffff\1\116\1\uffff\1\116\2\uffff\5\116\1\uffff\2\116\2\uffff\3\116"+
			"\1\uffff\1\116\1\uffff\5\116\2\uffff\1\116\1\uffff\6\116\4\uffff\1\130"+
			"\70\uffff\1\116\44\uffff\1\116\57\uffff\1\116\3\uffff\1\116\56\uffff"+
			"\1\116\3\uffff\1\116\31\uffff\1\116\6\uffff\1\116\74\uffff\1\116",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"\1\uffff",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "97:1: atomjoinSource : ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( subQuerySource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA10_4 = input.LA(1);
						 
						int index10_4 = input.index();
						input.rewind();
						s = -1;
						if ( (LA10_4==KW_WITH) && (synpred1_FromClauseParser())) {s = 71;}
						else if ( (LA10_4==KW_FROM) && (synpred1_FromClauseParser())) {s = 72;}
						else if ( (LA10_4==KW_INSERT) && (synpred1_FromClauseParser())) {s = 73;}
						else if ( (LA10_4==KW_SELECT) && (synpred1_FromClauseParser())) {s = 74;}
						else if ( (LA10_4==KW_MAP) && (synpred1_FromClauseParser())) {s = 75;}
						else if ( (LA10_4==KW_REDUCE) && (synpred1_FromClauseParser())) {s = 76;}
						else if ( (LA10_4==LPAREN) ) {s = 77;}
						else if ( (LA10_4==Identifier||(LA10_4 >= KW_ABORT && LA10_4 <= KW_AFTER)||LA10_4==KW_ALLOC_FRACTION||LA10_4==KW_ANALYZE||LA10_4==KW_ARCHIVE||(LA10_4 >= KW_ASC && LA10_4 <= KW_AST)||(LA10_4 >= KW_AUTOCOMMIT && LA10_4 <= KW_BEFORE)||(LA10_4 >= KW_BUCKET && LA10_4 <= KW_BUCKETS)||(LA10_4 >= KW_CACHE && LA10_4 <= KW_CASCADE)||LA10_4==KW_CHANGE||(LA10_4 >= KW_CHECK && LA10_4 <= KW_COLLECTION)||(LA10_4 >= KW_COLUMNS && LA10_4 <= KW_COMMENT)||(LA10_4 >= KW_COMPACT && LA10_4 <= KW_CONCATENATE)||LA10_4==KW_CONTINUE||LA10_4==KW_DATA||(LA10_4 >= KW_DATABASES && LA10_4 <= KW_DEBUG)||(LA10_4 >= KW_DEFAULT && LA10_4 <= KW_DEFINED)||(LA10_4 >= KW_DELIMITED && LA10_4 <= KW_DESC)||(LA10_4 >= KW_DETAIL && LA10_4 <= KW_DISABLE)||(LA10_4 >= KW_DISTRIBUTE && LA10_4 <= KW_DO)||LA10_4==KW_DOW||(LA10_4 >= KW_DUMP && LA10_4 <= KW_ELEM_TYPE)||LA10_4==KW_ENABLE||(LA10_4 >= KW_ENFORCED && LA10_4 <= KW_ESCAPED)||LA10_4==KW_EXCLUSIVE||(LA10_4 >= KW_EXPLAIN && LA10_4 <= KW_EXPRESSION)||(LA10_4 >= KW_FIELDS && LA10_4 <= KW_FIRST)||(LA10_4 >= KW_FORMAT && LA10_4 <= KW_FORMATTED)||LA10_4==KW_FUNCTIONS||LA10_4==KW_GROUP||(LA10_4 >= KW_HOUR && LA10_4 <= KW_IDXPROPERTIES)||(LA10_4 >= KW_INDEX && LA10_4 <= KW_INDEXES)||(LA10_4 >= KW_INPATH && LA10_4 <= KW_INPUTFORMAT)||(LA10_4 >= KW_ISOLATION && LA10_4 <= KW_JAR)||(LA10_4 >= KW_KEY && LA10_4 <= KW_LAST)||LA10_4==KW_LEVEL||(LA10_4 >= KW_LIMIT && LA10_4 <= KW_LOAD)||(LA10_4 >= KW_LOCATION && LA10_4 <= KW_LONG)||LA10_4==KW_MANAGEMENT||(LA10_4 >= KW_MAPJOIN && LA10_4 <= KW_MATERIALIZED)||LA10_4==KW_METADATA||(LA10_4 >= KW_MINUTE && LA10_4 <= KW_MONTH)||(LA10_4 >= KW_MOVE && LA10_4 <= KW_MSCK)||(LA10_4 >= KW_NORELY && LA10_4 <= KW_NOSCAN)||LA10_4==KW_NOVALIDATE||LA10_4==KW_NULLS||LA10_4==KW_OFFSET||(LA10_4 >= KW_OPERATOR && LA10_4 <= KW_OPTION)||LA10_4==KW_ORDER||(LA10_4 >= KW_OUTPUTDRIVER && LA10_4 <= KW_OUTPUTFORMAT)||(LA10_4 >= KW_OVERWRITE && LA10_4 <= KW_OWNER)||(LA10_4 >= KW_PARTITIONED && LA10_4 <= KW_PATH)||(LA10_4 >= KW_PLAN && LA10_4 <= KW_POOL)||LA10_4==KW_PRINCIPALS||(LA10_4 >= KW_PURGE && LA10_4 <= KW_QUERY_PARALLELISM)||LA10_4==KW_READ||(LA10_4 >= KW_REBUILD && LA10_4 <= KW_RECORDWRITER)||(LA10_4 >= KW_RELOAD && LA10_4 <= KW_RESTRICT)||LA10_4==KW_REWRITE||(LA10_4 >= KW_ROLE && LA10_4 <= KW_ROLES)||(LA10_4 >= KW_SCHEDULING_POLICY && LA10_4 <= KW_SECOND)||(LA10_4 >= KW_SEMI && LA10_4 <= KW_SERVER)||(LA10_4 >= KW_SETS && LA10_4 <= KW_SKEWED)||(LA10_4 >= KW_SNAPSHOT && LA10_4 <= KW_SSL)||(LA10_4 >= KW_STATISTICS && LA10_4 <= KW_SUMMARY)||(LA10_4 >= KW_TABLE && LA10_4 <= KW_TABLES)||(LA10_4 >= KW_TBLPROPERTIES && LA10_4 <= KW_TERMINATED)||LA10_4==KW_TINYINT||(LA10_4 >= KW_TOUCH && LA10_4 <= KW_TRANSACTIONS)||LA10_4==KW_UNARCHIVE||LA10_4==KW_UNDO||LA10_4==KW_UNIONTYPE||(LA10_4 >= KW_UNKNOWN && LA10_4 <= KW_UNSIGNED)||(LA10_4 >= KW_URI && LA10_4 <= KW_USE)||(LA10_4 >= KW_UTC && LA10_4 <= KW_VALIDATE)||LA10_4==KW_VALUE_TYPE||(LA10_4 >= KW_VECTORIZATION && LA10_4 <= KW_WEEK)||LA10_4==KW_WHILE||(LA10_4 >= KW_WORK && LA10_4 <= KW_ZONE)||LA10_4==KW_BATCH||LA10_4==KW_DAYOFWEEK||LA10_4==KW_HOLD_DDLTIME||LA10_4==KW_IGNORE||LA10_4==KW_NO_DROP||LA10_4==KW_OFFLINE||LA10_4==KW_PROTECTION||LA10_4==KW_READONLY||LA10_4==KW_TIMESTAMPTZ) ) {s = 78;}
						 
						input.seek(index10_4);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA10_85 = input.LA(1);
						 
						int index10_85 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_FromClauseParser()) ) {s = 76;}
						else if ( (true) ) {s = 78;}
						 
						input.seek(index10_85);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA10_86 = input.LA(1);
						 
						int index10_86 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_FromClauseParser()) ) {s = 76;}
						else if ( (true) ) {s = 78;}
						 
						input.seek(index10_86);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA10_87 = input.LA(1);
						 
						int index10_87 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_FromClauseParser()) ) {s = 76;}
						else if ( (true) ) {s = 78;}
						 
						input.seek(index10_87);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA10_88 = input.LA(1);
						 
						int index10_88 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_FromClauseParser()) ) {s = 76;}
						else if ( (true) ) {s = 78;}
						 
						input.seek(index10_88);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 10, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA13_eotS =
		"\117\uffff";
	static final String DFA13_eofS =
		"\1\uffff\2\5\114\uffff";
	static final String DFA13_minS =
		"\1\30\2\11\3\uffff\1\u00d6\42\uffff\1\u00d6\45\uffff";
	static final String DFA13_maxS =
		"\3\u0292\3\uffff\1\u0181\42\uffff\1\u0181\45\uffff";
	static final String DFA13_acceptS =
		"\3\uffff\1\2\1\3\1\1\105\uffff\1\4\3\uffff";
	static final String DFA13_specialS =
		"\117\uffff}>";
	static final String[] DFA13_transitionS = {
			"\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\2\2\5\uffff\2\2\1\uffff\2\2\2\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff"+
			"\4\2\2\uffff\1\2\7\uffff\1\2\1\uffff\6\2\1\uffff\3\2\1\uffff\3\2\1\uffff"+
			"\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
			"\1\2\1\uffff\3\2\5\uffff\4\2\6\uffff\2\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\3\uffff\2\2\1\uffff\3\2\6\uffff\3\2\1\uffff\5\2\3\uffff\1\2\1\uffff"+
			"\3\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\1\2\2\uffff\3\2\3\uffff\12\2\1\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\4\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff\7\2\1\uffff\1\3\1\2"+
			"\1\uffff\3\2\4\uffff\1\2\1\uffff\4\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
			"\1\2\2\uffff\5\2\1\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\uffff\5\2\2\uffff"+
			"\1\2\2\uffff\5\2\4\uffff\1\4\70\uffff\1\2\44\uffff\1\2\57\uffff\1\2\3"+
			"\uffff\1\2\56\uffff\1\2\3\uffff\1\2\31\uffff\1\2\6\uffff\1\2\74\uffff"+
			"\1\2",
			"\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\3\5\1\uffff\2\5\5\uffff\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\4\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\uffff"+
			"\6\5\1\uffff\3\5\1\uffff\3\5\1\uffff\4\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\1\uffff\3\5\5\uffff\4\5\6\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\3\uffff\7\5\1\uffff"+
			"\1\5\3\uffff\13\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff\6\5\1\uffff"+
			"\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
			"\2\5\1\uffff\1\5\2\uffff\2\5\1\uffff\2\5\1\uffff\3\5\1\uffff\4\5\4\uffff"+
			"\1\5\1\uffff\4\5\1\uffff\1\5\2\uffff\4\5\2\uffff\12\5\1\uffff\2\5\1\uffff"+
			"\2\5\4\uffff\11\5\1\uffff\5\5\1\uffff\4\5\1\uffff\7\5\2\uffff\5\5\4\uffff"+
			"\1\5\1\uffff\4\5\4\uffff\1\5\1\uffff\3\5\2\uffff\5\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\5\5\4\uffff\1\6\14\uffff"+
			"\1\5\53\uffff\1\5\44\uffff\1\5\57\uffff\1\5\3\uffff\1\5\56\uffff\1\5"+
			"\3\uffff\1\5\31\uffff\1\5\6\uffff\1\5\74\uffff\1\5",
			"\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff\1\5\3\uffff"+
			"\1\5\1\uffff\3\5\1\uffff\2\5\5\uffff\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff"+
			"\5\5\1\uffff\2\5\1\uffff\4\5\2\uffff\1\5\1\uffff\1\5\5\uffff\1\5\1\uffff"+
			"\6\5\1\uffff\3\5\1\uffff\3\5\1\uffff\4\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\1\uffff\3\5\5\uffff\4\5\6\uffff"+
			"\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\3\uffff\7\5\1\uffff"+
			"\1\5\3\uffff\13\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff\6\5\1\uffff"+
			"\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
			"\2\5\1\uffff\1\5\2\uffff\2\5\1\uffff\2\5\1\uffff\3\5\1\uffff\4\5\4\uffff"+
			"\1\5\1\uffff\4\5\1\uffff\1\5\2\uffff\4\5\2\uffff\12\5\1\uffff\2\5\1\uffff"+
			"\2\5\4\uffff\11\5\1\uffff\5\5\1\uffff\4\5\1\uffff\7\5\2\uffff\5\5\4\uffff"+
			"\1\5\1\uffff\4\5\4\uffff\1\5\1\uffff\3\5\2\uffff\5\5\1\uffff\2\5\1\uffff"+
			"\4\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\5\5\4\uffff\1\51\14"+
			"\uffff\1\5\53\uffff\1\5\44\uffff\1\5\57\uffff\1\5\3\uffff\1\5\56\uffff"+
			"\1\5\3\uffff\1\5\31\uffff\1\5\6\uffff\1\5\74\uffff\1\5",
			"",
			"",
			"",
			"\1\113\u00aa\uffff\1\5",
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
			"",
			"\1\113\u00aa\uffff\1\5",
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
			"",
			"",
			"",
			""
	};

	static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
	static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
	static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
	static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
	static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
	static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
	static final short[][] DFA13_transition;

	static {
		int numStates = DFA13_transitionS.length;
		DFA13_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
		}
	}

	protected class DFA13 extends DFA {

		public DFA13(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 13;
			this.eot = DFA13_eot;
			this.eof = DFA13_eof;
			this.min = DFA13_min;
			this.max = DFA13_max;
			this.accept = DFA13_accept;
			this.special = DFA13_special;
			this.transition = DFA13_transition;
		}
		@Override
		public String getDescription() {
			return "121:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction )";
		}
	}

	static final String DFA20_eotS =
		"\152\uffff";
	static final String DFA20_eofS =
		"\1\1\151\uffff";
	static final String DFA20_minS =
		"\1\11\2\uffff\1\30\32\uffff\2\0\112\uffff";
	static final String DFA20_maxS =
		"\1\u017c\2\uffff\1\u0292\32\uffff\2\0\112\uffff";
	static final String DFA20_acceptS =
		"\1\uffff\1\2\104\uffff\1\1\43\uffff";
	static final String DFA20_specialS =
		"\36\uffff\1\0\1\1\112\uffff}>";
	static final String[] DFA20_transitionS = {
			"\1\3\64\uffff\1\1\17\uffff\1\1\33\uffff\1\1\13\uffff\1\1\30\uffff\1\1"+
			"\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff"+
			"\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff\1\1\16\uffff\1\1\4"+
			"\uffff\1\1\41\uffff\1\1\16\uffff\1\1\13\uffff\1\1\14\uffff\1\1\42\uffff"+
			"\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff\1\1\27\uffff\1\1",
			"",
			"",
			"\1\36\1\uffff\6\37\1\uffff\1\37\1\uffff\1\37\3\uffff\1\37\2\uffff\2"+
			"\37\1\uffff\2\37\5\uffff\2\37\1\uffff\2\37\2\uffff\1\37\1\uffff\5\37"+
			"\1\uffff\2\37\1\uffff\4\37\2\uffff\1\37\7\uffff\1\37\1\uffff\6\37\1\uffff"+
			"\3\37\1\uffff\3\37\1\uffff\4\37\1\uffff\2\37\1\uffff\1\37\1\uffff\2\37"+
			"\1\uffff\1\37\1\uffff\2\37\2\uffff\1\37\1\uffff\3\37\5\uffff\4\37\6\uffff"+
			"\2\37\3\uffff\1\37\1\uffff\1\37\2\uffff\2\37\3\uffff\2\37\1\uffff\3\37"+
			"\6\uffff\3\37\1\uffff\5\37\1\1\2\uffff\1\37\1\uffff\3\37\1\uffff\5\37"+
			"\1\uffff\1\37\1\uffff\4\37\1\uffff\1\37\1\uffff\2\37\1\uffff\2\37\1\uffff"+
			"\2\37\1\uffff\1\37\1\uffff\1\37\1\uffff\1\37\2\uffff\2\37\1\uffff\1\37"+
			"\2\uffff\2\37\1\uffff\2\37\1\uffff\3\37\1\uffff\4\37\4\uffff\1\37\1\uffff"+
			"\4\37\1\uffff\1\37\2\uffff\3\37\3\uffff\12\37\1\uffff\1\37\2\uffff\2"+
			"\37\4\uffff\4\37\1\uffff\4\37\1\uffff\5\37\1\uffff\4\37\1\uffff\7\37"+
			"\1\uffff\1\1\1\37\1\uffff\3\37\4\uffff\1\37\1\uffff\4\37\4\uffff\1\37"+
			"\1\uffff\1\37\1\uffff\1\37\2\uffff\5\37\1\uffff\2\37\2\uffff\3\37\1\uffff"+
			"\1\37\1\uffff\5\37\2\uffff\1\37\2\uffff\5\37\4\uffff\1\1\70\uffff\1\37"+
			"\44\uffff\1\37\57\uffff\1\37\3\uffff\1\37\56\uffff\1\37\3\uffff\1\37"+
			"\31\uffff\1\37\6\uffff\1\37\74\uffff\1\37",
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
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
	static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
	static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
	static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
	static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
	static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
	static final short[][] DFA20_transition;

	static {
		int numStates = DFA20_transitionS.length;
		DFA20_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
		}
	}

	protected class DFA20 extends DFA {

		public DFA20(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 20;
			this.eot = DFA20_eot;
			this.eof = DFA20_eof;
			this.min = DFA20_min;
			this.max = DFA20_max;
			this.accept = DFA20_accept;
			this.special = DFA20_special;
			this.transition = DFA20_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 159:108: ( ( COMMA )=> COMMA identifier )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA20_30 = input.LA(1);
						 
						int index20_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_FromClauseParser()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index20_30);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA20_31 = input.LA(1);
						 
						int index20_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred3_FromClauseParser()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index20_31);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 20, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA23_eotS =
		"\152\uffff";
	static final String DFA23_eofS =
		"\1\1\151\uffff";
	static final String DFA23_minS =
		"\1\11\2\uffff\1\30\32\uffff\2\0\112\uffff";
	static final String DFA23_maxS =
		"\1\u017c\2\uffff\1\u0292\32\uffff\2\0\112\uffff";
	static final String DFA23_acceptS =
		"\1\uffff\1\2\104\uffff\1\1\43\uffff";
	static final String DFA23_specialS =
		"\36\uffff\1\0\1\1\112\uffff}>";
	static final String[] DFA23_transitionS = {
			"\1\3\64\uffff\1\1\17\uffff\1\1\33\uffff\1\1\13\uffff\1\1\30\uffff\1\1"+
			"\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff"+
			"\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff\1\1\16\uffff\1\1\4"+
			"\uffff\1\1\41\uffff\1\1\16\uffff\1\1\13\uffff\1\1\14\uffff\1\1\42\uffff"+
			"\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff\1\1\27\uffff\1\1",
			"",
			"",
			"\1\36\1\uffff\6\37\1\uffff\1\37\1\uffff\1\37\3\uffff\1\37\2\uffff\2"+
			"\37\1\uffff\2\37\5\uffff\2\37\1\uffff\2\37\2\uffff\1\37\1\uffff\5\37"+
			"\1\uffff\2\37\1\uffff\4\37\2\uffff\1\37\7\uffff\1\37\1\uffff\6\37\1\uffff"+
			"\3\37\1\uffff\3\37\1\uffff\4\37\1\uffff\2\37\1\uffff\1\37\1\uffff\2\37"+
			"\1\uffff\1\37\1\uffff\2\37\2\uffff\1\37\1\uffff\3\37\5\uffff\4\37\6\uffff"+
			"\2\37\3\uffff\1\37\1\uffff\1\37\2\uffff\2\37\3\uffff\2\37\1\uffff\3\37"+
			"\6\uffff\3\37\1\uffff\5\37\1\1\2\uffff\1\37\1\uffff\3\37\1\uffff\5\37"+
			"\1\uffff\1\37\1\uffff\4\37\1\uffff\1\37\1\uffff\2\37\1\uffff\2\37\1\uffff"+
			"\2\37\1\uffff\1\37\1\uffff\1\37\1\uffff\1\37\2\uffff\2\37\1\uffff\1\37"+
			"\2\uffff\2\37\1\uffff\2\37\1\uffff\3\37\1\uffff\4\37\4\uffff\1\37\1\uffff"+
			"\4\37\1\uffff\1\37\2\uffff\3\37\3\uffff\12\37\1\uffff\1\37\2\uffff\2"+
			"\37\4\uffff\4\37\1\uffff\4\37\1\uffff\5\37\1\uffff\4\37\1\uffff\7\37"+
			"\1\uffff\1\1\1\37\1\uffff\3\37\4\uffff\1\37\1\uffff\4\37\4\uffff\1\37"+
			"\1\uffff\1\37\1\uffff\1\37\2\uffff\5\37\1\uffff\2\37\2\uffff\3\37\1\uffff"+
			"\1\37\1\uffff\5\37\2\uffff\1\37\2\uffff\5\37\4\uffff\1\1\70\uffff\1\37"+
			"\44\uffff\1\37\57\uffff\1\37\3\uffff\1\37\56\uffff\1\37\3\uffff\1\37"+
			"\31\uffff\1\37\6\uffff\1\37\74\uffff\1\37",
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
			"",
			"",
			"",
			"",
			"\1\uffff",
			"\1\uffff",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
	static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
	static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
	static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
	static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
	static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
	static final short[][] DFA23_transition;

	static {
		int numStates = DFA23_transitionS.length;
		DFA23_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
		}
	}

	protected class DFA23 extends DFA {

		public DFA23(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 23;
			this.eot = DFA23_eot;
			this.eof = DFA23_eof;
			this.min = DFA23_min;
			this.max = DFA23_max;
			this.accept = DFA23_accept;
			this.special = DFA23_special;
			this.transition = DFA23_transition;
		}
		@Override
		public String getDescription() {
			return "()* loopback of 162:66: ( ( COMMA )=> COMMA identifier )*";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA23_30 = input.LA(1);
						 
						int index23_30 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index23_30);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA23_31 = input.LA(1);
						 
						int index23_31 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred4_FromClauseParser()) ) {s = 70;}
						else if ( (true) ) {s = 1;}
						 
						input.seek(index23_31);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 23, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA38_eotS =
		"\u0102\uffff";
	static final String DFA38_eofS =
		"\1\4\1\uffff\2\1\16\uffff\1\1\6\uffff\4\1\u00e5\uffff";
	static final String DFA38_minS =
		"\1\11\1\uffff\2\11\16\uffff\1\11\6\uffff\4\11\u00e5\uffff";
	static final String DFA38_maxS =
		"\1\u0292\1\uffff\2\u017c\16\uffff\1\u017c\6\uffff\4\u017c\u00e5\uffff";
	static final String DFA38_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\u00fd\uffff";
	static final String DFA38_specialS =
		"\u0102\uffff}>";
	static final String[] DFA38_transitionS = {
			"\1\4\16\uffff\1\2\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\3\uffff\1\1\1\uffff"+
			"\3\1\1\uffff\2\1\5\uffff\2\1\1\uffff\2\1\2\uffff\1\1\1\uffff\1\1\1\31"+
			"\3\1\1\uffff\2\1\1\uffff\4\1\2\uffff\1\1\1\uffff\1\4\5\uffff\1\1\1\uffff"+
			"\6\1\1\uffff\3\1\1\uffff\3\1\1\uffff\4\1\1\uffff\1\32\1\1\1\uffff\1\1"+
			"\1\uffff\2\1\1\uffff\1\1\1\uffff\2\1\1\4\1\uffff\1\1\1\uffff\3\1\5\uffff"+
			"\4\1\6\uffff\2\1\1\uffff\1\4\1\uffff\1\1\1\uffff\1\3\1\uffff\1\4\2\1"+
			"\3\uffff\2\1\1\4\3\1\1\4\1\uffff\1\4\3\uffff\3\1\1\4\5\1\2\4\1\uffff"+
			"\1\1\1\uffff\1\34\2\1\1\uffff\5\1\1\uffff\1\1\1\4\4\1\1\uffff\1\1\1\4"+
			"\2\1\1\uffff\2\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\4"+
			"\1\uffff\2\1\1\uffff\1\22\2\uffff\2\1\1\uffff\2\1\1\4\3\1\1\uffff\4\1"+
			"\4\uffff\1\1\1\uffff\4\1\1\uffff\1\1\2\uffff\3\1\1\4\2\uffff\12\1\1\uffff"+
			"\1\1\1\4\1\uffff\2\1\4\uffff\4\1\1\4\4\1\1\uffff\5\1\1\uffff\1\1\1\33"+
			"\2\1\1\uffff\7\1\2\uffff\1\1\1\uffff\3\1\4\uffff\1\1\1\uffff\4\1\4\uffff"+
			"\1\1\1\uffff\1\1\1\4\1\1\2\uffff\5\1\1\uffff\2\1\1\uffff\1\4\3\1\1\uffff"+
			"\1\1\1\uffff\5\1\1\uffff\1\4\1\1\1\4\1\uffff\5\1\21\uffff\1\4\53\uffff"+
			"\1\1\44\uffff\1\1\57\uffff\1\1\3\uffff\1\1\56\uffff\1\1\3\uffff\1\1\31"+
			"\uffff\1\1\6\uffff\1\1\74\uffff\1\1",
			"",
			"\1\1\16\uffff\1\1\45\uffff\1\1\17\uffff\1\1\33\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff"+
			"\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff\1\1\16"+
			"\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13\uffff"+
			"\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff\1\1"+
			"\12\uffff\1\4\14\uffff\1\1",
			"\1\1\16\uffff\1\1\35\uffff\1\4\7\uffff\1\1\17\uffff\1\1\33\uffff\1\1"+
			"\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff"+
			"\1\1\16\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13"+
			"\uffff\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff"+
			"\1\1\27\uffff\1\1",
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
			"",
			"",
			"",
			"\1\1\16\uffff\1\1\35\uffff\1\4\7\uffff\1\1\17\uffff\1\1\33\uffff\1\1"+
			"\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff"+
			"\1\1\16\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13"+
			"\uffff\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff"+
			"\1\1\27\uffff\1\1",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\1\16\uffff\1\1\35\uffff\1\4\7\uffff\1\1\17\uffff\1\1\33\uffff\1\1"+
			"\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff"+
			"\1\1\16\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13"+
			"\uffff\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff"+
			"\1\1\27\uffff\1\1",
			"\1\1\16\uffff\1\1\35\uffff\1\4\7\uffff\1\1\17\uffff\1\1\33\uffff\1\1"+
			"\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff"+
			"\1\1\16\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13"+
			"\uffff\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff"+
			"\1\1\27\uffff\1\1",
			"\1\1\16\uffff\1\1\35\uffff\1\4\7\uffff\1\1\17\uffff\1\1\33\uffff\1\1"+
			"\13\uffff\1\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff"+
			"\1\1\1\uffff\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff"+
			"\1\1\16\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13"+
			"\uffff\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff"+
			"\1\1\27\uffff\1\1",
			"\1\1\16\uffff\1\1\45\uffff\1\1\17\uffff\1\1\33\uffff\1\1\13\uffff\1"+
			"\1\30\uffff\1\1\3\uffff\1\1\1\uffff\1\1\7\uffff\1\1\3\uffff\1\1\1\uffff"+
			"\1\1\6\uffff\1\1\5\uffff\2\1\3\uffff\1\1\12\uffff\1\1\6\uffff\1\1\16"+
			"\uffff\1\1\4\uffff\1\1\7\uffff\1\1\31\uffff\1\1\16\uffff\1\1\13\uffff"+
			"\1\1\14\uffff\1\1\42\uffff\1\1\14\uffff\1\1\14\uffff\1\1\1\uffff\1\1"+
			"\20\uffff\1\4\6\uffff\1\1",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
	static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
	static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
	static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
	static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
	static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
	static final short[][] DFA38_transition;

	static {
		int numStates = DFA38_transitionS.length;
		DFA38_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
		}
	}

	protected class DFA38 extends DFA {

		public DFA38(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 38;
			this.eot = DFA38_eot;
			this.eof = DFA38_eof;
			this.min = DFA38_min;
			this.max = DFA38_max;
			this.accept = DFA38_accept;
			this.special = DFA38_special;
			this.transition = DFA38_transition;
		}
		@Override
		public String getDescription() {
			return "206:64: ( ( KW_AS )? alias= identifier )?";
		}
	}

	static final String DFA42_eotS =
		"\u00a9\uffff";
	static final String DFA42_eofS =
		"\1\uffff\2\4\u00a6\uffff";
	static final String DFA42_minS =
		"\1\30\2\11\1\30\117\uffff\1\30\125\uffff";
	static final String DFA42_maxS =
		"\4\u0292\117\uffff\1\u0292\125\uffff";
	static final String DFA42_acceptS =
		"\4\uffff\1\2\u009f\uffff\1\1\4\uffff";
	static final String DFA42_specialS =
		"\u00a9\uffff}>";
	static final String[] DFA42_transitionS = {
			"\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\2\2\5\uffff\2\2\1\uffff\2\2\2\uffff\1\2\1\uffff\5\2\1\uffff\2\2\1\uffff"+
			"\4\2\2\uffff\1\2\7\uffff\1\2\1\uffff\6\2\1\uffff\3\2\1\uffff\3\2\1\uffff"+
			"\4\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\2\2\2\uffff"+
			"\1\2\1\uffff\3\2\5\uffff\4\2\6\uffff\2\2\3\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\3\uffff\2\2\1\uffff\3\2\6\uffff\3\2\1\uffff\5\2\3\uffff\1\2\1\uffff"+
			"\3\2\1\uffff\5\2\1\uffff\1\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff"+
			"\2\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\2\2\1\uffff"+
			"\1\2\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff"+
			"\4\2\1\uffff\1\2\2\uffff\3\2\3\uffff\12\2\1\uffff\1\2\2\uffff\2\2\4\uffff"+
			"\4\2\1\uffff\4\2\1\uffff\5\2\1\uffff\4\2\1\uffff\7\2\2\uffff\1\2\1\uffff"+
			"\3\2\4\uffff\1\2\1\uffff\4\2\4\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\5\2\1\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\uffff\5\2\2\uffff\1\2\2\uffff"+
			"\5\2\75\uffff\1\2\44\uffff\1\2\57\uffff\1\2\3\uffff\1\2\56\uffff\1\2"+
			"\3\uffff\1\2\31\uffff\1\2\6\uffff\1\2\74\uffff\1\2",
			"\1\4\6\uffff\1\3\7\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3\uffff"+
			"\1\4\1\uffff\3\4\1\uffff\2\4\5\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff"+
			"\5\4\1\uffff\2\4\1\uffff\4\4\2\uffff\1\4\1\uffff\1\4\5\uffff\1\4\1\uffff"+
			"\6\4\1\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff"+
			"\1\4\1\uffff\5\4\1\uffff\3\4\5\uffff\4\4\3\uffff\2\4\1\uffff\4\4\1\uffff"+
			"\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\10\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
			"\13\4\1\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\2\4\1\uffff\2\4\1\uffff\1\4\2\uffff\2\4\1\uffff"+
			"\6\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\2\uffff"+
			"\12\4\1\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\17\4\1\uffff\4\4\1"+
			"\uffff\10\4\1\uffff\5\4\4\uffff\6\4\4\uffff\1\4\1\uffff\3\4\2\uffff\10"+
			"\4\1\uffff\6\4\1\uffff\5\4\1\uffff\11\4\4\uffff\1\4\14\uffff\1\4\4\uffff"+
			"\1\4\46\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3\uffff\1\4\56\uffff\1\4"+
			"\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff\1\4",
			"\1\4\6\uffff\1\123\7\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\1\4\3"+
			"\uffff\1\4\1\uffff\3\4\1\uffff\2\4\5\uffff\2\4\1\uffff\2\4\2\uffff\1"+
			"\4\1\uffff\5\4\1\uffff\2\4\1\uffff\4\4\2\uffff\1\4\1\uffff\1\4\5\uffff"+
			"\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\5\4\1\uffff\3\4\5\uffff\4\4\3\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff\4\4\1\uffff\10\4\1\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\13\4\1\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff"+
			"\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff\2\4\1\uffff\2\4\1\uffff\1\4\2\uffff"+
			"\2\4\1\uffff\6\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff"+
			"\4\4\2\uffff\12\4\1\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\17\4\1"+
			"\uffff\4\4\1\uffff\10\4\1\uffff\5\4\4\uffff\6\4\4\uffff\1\4\1\uffff\3"+
			"\4\2\uffff\10\4\1\uffff\6\4\1\uffff\5\4\1\uffff\11\4\4\uffff\1\4\14\uffff"+
			"\1\4\4\uffff\1\4\46\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3\uffff\1\4\56"+
			"\uffff\1\4\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff\1\4",
			"\1\u00a4\1\uffff\6\u00a4\1\uffff\1\u00a4\1\uffff\1\u00a4\3\uffff\1\u00a4"+
			"\2\uffff\2\u00a4\1\uffff\2\u00a4\5\uffff\2\u00a4\1\uffff\2\u00a4\2\uffff"+
			"\1\u00a4\1\uffff\5\u00a4\1\uffff\2\u00a4\1\uffff\4\u00a4\2\uffff\1\u00a4"+
			"\7\uffff\1\u00a4\1\uffff\6\u00a4\1\uffff\3\u00a4\1\uffff\3\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4"+
			"\1\uffff\2\u00a4\2\uffff\1\u00a4\1\uffff\3\u00a4\5\uffff\4\u00a4\6\uffff"+
			"\2\u00a4\3\uffff\1\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4\3\uffff\2\u00a4"+
			"\1\uffff\3\u00a4\6\uffff\3\u00a4\1\uffff\5\u00a4\3\uffff\1\u00a4\1\uffff"+
			"\3\u00a4\1\uffff\5\u00a4\1\uffff\1\u00a4\1\uffff\4\u00a4\1\uffff\1\u00a4"+
			"\1\uffff\2\u00a4\1\uffff\2\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4\1\uffff"+
			"\1\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4"+
			"\1\uffff\2\u00a4\1\uffff\3\u00a4\1\uffff\4\u00a4\4\uffff\1\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\1\u00a4\2\uffff\3\u00a4\3\uffff\12\u00a4\1\uffff\1\u00a4"+
			"\2\uffff\2\u00a4\4\uffff\4\u00a4\1\uffff\4\u00a4\1\uffff\5\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\7\u00a4\2\uffff\1\u00a4\1\uffff\3\u00a4\4\uffff\1\u00a4"+
			"\1\uffff\4\u00a4\4\uffff\1\u00a4\1\uffff\1\u00a4\1\uffff\1\u00a4\2\uffff"+
			"\5\u00a4\1\uffff\2\u00a4\2\uffff\3\u00a4\1\uffff\1\u00a4\1\uffff\5\u00a4"+
			"\2\uffff\1\u00a4\2\uffff\5\u00a4\25\uffff\1\4\47\uffff\1\u00a4\44\uffff"+
			"\1\u00a4\57\uffff\1\u00a4\3\uffff\1\u00a4\56\uffff\1\u00a4\3\uffff\1"+
			"\u00a4\31\uffff\1\u00a4\6\uffff\1\u00a4\74\uffff\1\u00a4",
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
			"",
			"",
			"\1\u00a4\1\uffff\6\u00a4\1\uffff\1\u00a4\1\uffff\1\u00a4\3\uffff\1\u00a4"+
			"\2\uffff\2\u00a4\1\uffff\2\u00a4\5\uffff\2\u00a4\1\uffff\2\u00a4\2\uffff"+
			"\1\u00a4\1\uffff\5\u00a4\1\uffff\2\u00a4\1\uffff\4\u00a4\2\uffff\1\u00a4"+
			"\7\uffff\1\u00a4\1\uffff\6\u00a4\1\uffff\3\u00a4\1\uffff\3\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4"+
			"\1\uffff\2\u00a4\2\uffff\1\u00a4\1\uffff\3\u00a4\5\uffff\4\u00a4\6\uffff"+
			"\2\u00a4\3\uffff\1\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4\3\uffff\2\u00a4"+
			"\1\uffff\3\u00a4\6\uffff\3\u00a4\1\uffff\5\u00a4\3\uffff\1\u00a4\1\uffff"+
			"\3\u00a4\1\uffff\5\u00a4\1\uffff\1\u00a4\1\uffff\4\u00a4\1\uffff\1\u00a4"+
			"\1\uffff\2\u00a4\1\uffff\2\u00a4\1\uffff\2\u00a4\1\uffff\1\u00a4\1\uffff"+
			"\1\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4\1\uffff\1\u00a4\2\uffff\2\u00a4"+
			"\1\uffff\2\u00a4\1\uffff\3\u00a4\1\uffff\4\u00a4\4\uffff\1\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\1\u00a4\2\uffff\3\u00a4\3\uffff\12\u00a4\1\uffff\1\u00a4"+
			"\2\uffff\2\u00a4\4\uffff\4\u00a4\1\uffff\4\u00a4\1\uffff\5\u00a4\1\uffff"+
			"\4\u00a4\1\uffff\7\u00a4\2\uffff\1\u00a4\1\uffff\3\u00a4\4\uffff\1\u00a4"+
			"\1\uffff\4\u00a4\4\uffff\1\u00a4\1\uffff\1\u00a4\1\uffff\1\u00a4\2\uffff"+
			"\5\u00a4\1\uffff\2\u00a4\2\uffff\3\u00a4\1\uffff\1\u00a4\1\uffff\5\u00a4"+
			"\2\uffff\1\u00a4\2\uffff\5\u00a4\25\uffff\1\4\47\uffff\1\u00a4\44\uffff"+
			"\1\u00a4\57\uffff\1\u00a4\3\uffff\1\u00a4\56\uffff\1\u00a4\3\uffff\1"+
			"\u00a4\31\uffff\1\u00a4\6\uffff\1\u00a4\74\uffff\1\u00a4",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
	static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
	static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
	static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
	static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
	static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
	static final short[][] DFA42_transition;

	static {
		int numStates = DFA42_transitionS.length;
		DFA42_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
		}
	}

	protected class DFA42 extends DFA {

		public DFA42(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 42;
			this.eot = DFA42_eot;
			this.eof = DFA42_eof;
			this.min = DFA42_min;
			this.max = DFA42_max;
			this.accept = DFA42_accept;
			this.special = DFA42_special;
			this.transition = DFA42_transition;
		}
		@Override
		public String getDescription() {
			return "217:1: tableName : (db= identifier DOT tab= identifier -> ^( TOK_TABNAME $db $tab) |tab= identifier -> ^( TOK_TABNAME $tab) );";
		}
	}

	static final String DFA52_eotS =
		"\u0101\uffff";
	static final String DFA52_eofS =
		"\1\3\1\52\1\112\16\uffff\1\152\6\uffff\1\u008a\1\u00aa\1\u00ca\1\u00ea"+
		"\u00e5\uffff";
	static final String DFA52_minS =
		"\3\11\16\uffff\1\11\6\uffff\4\11\u00e5\uffff";
	static final String DFA52_maxS =
		"\1\u0292\2\u017c\16\uffff\1\u017c\6\uffff\4\u017c\u00e5\uffff";
	static final String DFA52_acceptS =
		"\3\uffff\1\2\30\uffff\1\1\5\uffff\37\1\1\uffff\37\1\1\uffff\37\1\1\uffff"+
		"\37\1\1\uffff\37\1\1\uffff\37\1\1\uffff\37\1";
	static final String DFA52_specialS =
		"\1\0\1\1\1\2\16\uffff\1\3\6\uffff\1\4\1\5\1\6\1\7\u00e5\uffff}>";
	static final String[] DFA52_transitionS = {
			"\1\3\16\uffff\1\1\1\uffff\6\34\1\uffff\1\34\1\uffff\1\34\3\uffff\1\34"+
			"\2\uffff\2\34\1\uffff\2\34\5\uffff\2\34\1\uffff\2\34\2\uffff\1\34\1\uffff"+
			"\1\34\1\30\3\34\1\uffff\2\34\1\uffff\4\34\2\uffff\1\34\1\uffff\1\3\5"+
			"\uffff\1\34\1\uffff\6\34\1\uffff\3\34\1\uffff\3\34\1\uffff\4\34\1\uffff"+
			"\1\31\1\34\1\uffff\1\34\1\uffff\2\34\1\uffff\1\34\1\uffff\2\34\1\3\1"+
			"\uffff\1\34\1\uffff\3\34\5\uffff\4\34\6\uffff\2\34\1\uffff\1\3\1\uffff"+
			"\1\34\1\uffff\1\2\1\uffff\1\3\2\34\3\uffff\2\34\1\3\3\34\1\3\1\uffff"+
			"\1\3\3\uffff\3\34\1\3\5\34\2\3\1\uffff\1\34\1\uffff\1\33\2\34\1\uffff"+
			"\5\34\1\uffff\1\34\1\3\4\34\1\uffff\1\34\1\3\2\34\1\uffff\2\34\1\uffff"+
			"\2\34\1\uffff\1\34\1\uffff\1\34\1\uffff\1\34\1\3\1\uffff\2\34\1\uffff"+
			"\1\21\2\uffff\2\34\1\uffff\2\34\1\3\3\34\1\uffff\4\34\4\uffff\1\34\1"+
			"\uffff\4\34\1\uffff\1\34\2\uffff\3\34\1\3\2\uffff\12\34\1\uffff\1\34"+
			"\1\3\1\uffff\2\34\4\uffff\4\34\1\3\4\34\1\uffff\5\34\1\uffff\1\34\1\32"+
			"\2\34\1\uffff\7\34\2\uffff\1\34\1\uffff\3\34\4\uffff\1\34\1\uffff\4\34"+
			"\4\uffff\1\34\1\uffff\1\34\1\3\1\34\2\uffff\5\34\1\uffff\2\34\1\uffff"+
			"\1\3\3\34\1\uffff\1\34\1\uffff\5\34\1\uffff\1\3\1\34\1\3\1\uffff\5\34"+
			"\21\uffff\1\3\53\uffff\1\34\44\uffff\1\34\57\uffff\1\34\3\uffff\1\34"+
			"\56\uffff\1\34\3\uffff\1\34\31\uffff\1\34\6\uffff\1\34\74\uffff\1\34",
			"\1\43\16\uffff\1\100\45\uffff\1\70\17\uffff\1\46\33\uffff\1\71\13\uffff"+
			"\1\65\30\uffff\1\51\3\uffff\1\60\1\uffff\1\61\7\uffff\1\45\3\uffff\1"+
			"\53\1\uffff\1\64\6\uffff\1\44\5\uffff\1\42\1\47\3\uffff\1\73\12\uffff"+
			"\1\55\6\uffff\1\66\16\uffff\1\75\4\uffff\1\67\7\uffff\1\77\31\uffff\1"+
			"\56\16\uffff\1\50\13\uffff\1\54\14\uffff\1\72\42\uffff\1\63\14\uffff"+
			"\1\76\14\uffff\1\57\1\uffff\1\62\12\uffff\1\3\14\uffff\1\74",
			"\1\103\16\uffff\1\140\35\uffff\1\3\7\uffff\1\130\17\uffff\1\106\33\uffff"+
			"\1\131\13\uffff\1\125\30\uffff\1\111\3\uffff\1\120\1\uffff\1\121\7\uffff"+
			"\1\105\3\uffff\1\113\1\uffff\1\124\6\uffff\1\104\5\uffff\1\102\1\107"+
			"\3\uffff\1\133\12\uffff\1\115\6\uffff\1\126\16\uffff\1\135\4\uffff\1"+
			"\127\7\uffff\1\137\31\uffff\1\116\16\uffff\1\110\13\uffff\1\114\14\uffff"+
			"\1\132\42\uffff\1\123\14\uffff\1\136\14\uffff\1\117\1\uffff\1\122\27"+
			"\uffff\1\134",
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
			"",
			"",
			"",
			"\1\143\16\uffff\1\u0080\35\uffff\1\3\7\uffff\1\170\17\uffff\1\146\33"+
			"\uffff\1\171\13\uffff\1\165\30\uffff\1\151\3\uffff\1\160\1\uffff\1\161"+
			"\7\uffff\1\145\3\uffff\1\153\1\uffff\1\164\6\uffff\1\144\5\uffff\1\142"+
			"\1\147\3\uffff\1\173\12\uffff\1\155\6\uffff\1\166\16\uffff\1\175\4\uffff"+
			"\1\167\7\uffff\1\177\31\uffff\1\156\16\uffff\1\150\13\uffff\1\154\14"+
			"\uffff\1\172\42\uffff\1\163\14\uffff\1\176\14\uffff\1\157\1\uffff\1\162"+
			"\27\uffff\1\174",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0083\16\uffff\1\u00a0\35\uffff\1\3\7\uffff\1\u0098\17\uffff\1\u0086"+
			"\33\uffff\1\u0099\13\uffff\1\u0095\30\uffff\1\u0089\3\uffff\1\u0090\1"+
			"\uffff\1\u0091\7\uffff\1\u0085\3\uffff\1\u008b\1\uffff\1\u0094\6\uffff"+
			"\1\u0084\5\uffff\1\u0082\1\u0087\3\uffff\1\u009b\12\uffff\1\u008d\6\uffff"+
			"\1\u0096\16\uffff\1\u009d\4\uffff\1\u0097\7\uffff\1\u009f\31\uffff\1"+
			"\u008e\16\uffff\1\u0088\13\uffff\1\u008c\14\uffff\1\u009a\42\uffff\1"+
			"\u0093\14\uffff\1\u009e\14\uffff\1\u008f\1\uffff\1\u0092\27\uffff\1\u009c",
			"\1\u00a3\16\uffff\1\u00c0\35\uffff\1\3\7\uffff\1\u00b8\17\uffff\1\u00a6"+
			"\33\uffff\1\u00b9\13\uffff\1\u00b5\30\uffff\1\u00a9\3\uffff\1\u00b0\1"+
			"\uffff\1\u00b1\7\uffff\1\u00a5\3\uffff\1\u00ab\1\uffff\1\u00b4\6\uffff"+
			"\1\u00a4\5\uffff\1\u00a2\1\u00a7\3\uffff\1\u00bb\12\uffff\1\u00ad\6\uffff"+
			"\1\u00b6\16\uffff\1\u00bd\4\uffff\1\u00b7\7\uffff\1\u00bf\31\uffff\1"+
			"\u00ae\16\uffff\1\u00a8\13\uffff\1\u00ac\14\uffff\1\u00ba\42\uffff\1"+
			"\u00b3\14\uffff\1\u00be\14\uffff\1\u00af\1\uffff\1\u00b2\27\uffff\1\u00bc",
			"\1\u00c3\16\uffff\1\u00e0\35\uffff\1\3\7\uffff\1\u00d8\17\uffff\1\u00c6"+
			"\33\uffff\1\u00d9\13\uffff\1\u00d5\30\uffff\1\u00c9\3\uffff\1\u00d0\1"+
			"\uffff\1\u00d1\7\uffff\1\u00c5\3\uffff\1\u00cb\1\uffff\1\u00d4\6\uffff"+
			"\1\u00c4\5\uffff\1\u00c2\1\u00c7\3\uffff\1\u00db\12\uffff\1\u00cd\6\uffff"+
			"\1\u00d6\16\uffff\1\u00dd\4\uffff\1\u00d7\7\uffff\1\u00df\31\uffff\1"+
			"\u00ce\16\uffff\1\u00c8\13\uffff\1\u00cc\14\uffff\1\u00da\42\uffff\1"+
			"\u00d3\14\uffff\1\u00de\14\uffff\1\u00cf\1\uffff\1\u00d2\27\uffff\1\u00dc",
			"\1\u00e3\16\uffff\1\u0100\45\uffff\1\u00f8\17\uffff\1\u00e6\33\uffff"+
			"\1\u00f9\13\uffff\1\u00f5\30\uffff\1\u00e9\3\uffff\1\u00f0\1\uffff\1"+
			"\u00f1\7\uffff\1\u00e5\3\uffff\1\u00eb\1\uffff\1\u00f4\6\uffff\1\u00e4"+
			"\5\uffff\1\u00e2\1\u00e7\3\uffff\1\u00fb\12\uffff\1\u00ed\6\uffff\1\u00f6"+
			"\16\uffff\1\u00fd\4\uffff\1\u00f7\7\uffff\1\u00ff\31\uffff\1\u00ee\16"+
			"\uffff\1\u00e8\13\uffff\1\u00ec\14\uffff\1\u00fa\42\uffff\1\u00f3\14"+
			"\uffff\1\u00fe\14\uffff\1\u00ef\1\uffff\1\u00f2\20\uffff\1\3\6\uffff"+
			"\1\u00fc",
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
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			""
	};

	static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
	static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
	static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
	static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
	static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
	static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
	static final short[][] DFA52_transition;

	static {
		int numStates = DFA52_transitionS.length;
		DFA52_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
		}
	}

	protected class DFA52 extends DFA {

		public DFA52(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 52;
			this.eot = DFA52_eot;
			this.eof = DFA52_eof;
			this.min = DFA52_min;
			this.max = DFA52_max;
			this.accept = DFA52_accept;
			this.special = DFA52_special;
			this.transition = DFA52_transition;
		}
		@Override
		public String getDescription() {
			return "271:27: ( ( Identifier )=>alias= identifier )?";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA52_0 = input.LA(1);
						 
						int index52_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_0==Identifier) ) {s = 1;}
						else if ( (LA52_0==KW_GROUP) ) {s = 2;}
						else if ( (LA52_0==EOF||LA52_0==COMMA||LA52_0==KW_CROSS||LA52_0==KW_EXCEPT||LA52_0==KW_FULL||LA52_0==KW_HAVING||LA52_0==KW_INNER||LA52_0==KW_INSERT||LA52_0==KW_INTERSECT||LA52_0==KW_JOIN||(LA52_0 >= KW_LATERAL && LA52_0 <= KW_LEFT)||LA52_0==KW_MAP||LA52_0==KW_MINUS||LA52_0==KW_ON||LA52_0==KW_PARTITION||LA52_0==KW_REDUCE||LA52_0==KW_RIGHT||LA52_0==KW_SELECT||LA52_0==KW_UNION||LA52_0==KW_USING||LA52_0==KW_WHERE||LA52_0==KW_WINDOW||LA52_0==RPAREN) ) {s = 3;}
						else if ( (LA52_0==KW_ORDER) ) {s = 17;}
						else if ( (LA52_0==KW_CLUSTER) ) {s = 24;}
						else if ( (LA52_0==KW_DISTRIBUTE) ) {s = 25;}
						else if ( (LA52_0==KW_SORT) ) {s = 26;}
						else if ( (LA52_0==KW_LIMIT) ) {s = 27;}
						else if ( ((LA52_0 >= KW_ABORT && LA52_0 <= KW_AFTER)||LA52_0==KW_ALLOC_FRACTION||LA52_0==KW_ANALYZE||LA52_0==KW_ARCHIVE||(LA52_0 >= KW_ASC && LA52_0 <= KW_AST)||(LA52_0 >= KW_AUTOCOMMIT && LA52_0 <= KW_BEFORE)||(LA52_0 >= KW_BUCKET && LA52_0 <= KW_BUCKETS)||(LA52_0 >= KW_CACHE && LA52_0 <= KW_CASCADE)||LA52_0==KW_CHANGE||LA52_0==KW_CHECK||(LA52_0 >= KW_CLUSTERED && LA52_0 <= KW_COLLECTION)||(LA52_0 >= KW_COLUMNS && LA52_0 <= KW_COMMENT)||(LA52_0 >= KW_COMPACT && LA52_0 <= KW_CONCATENATE)||LA52_0==KW_CONTINUE||LA52_0==KW_DATA||(LA52_0 >= KW_DATABASES && LA52_0 <= KW_DEBUG)||(LA52_0 >= KW_DEFAULT && LA52_0 <= KW_DEFINED)||(LA52_0 >= KW_DELIMITED && LA52_0 <= KW_DESC)||(LA52_0 >= KW_DETAIL && LA52_0 <= KW_DISABLE)||LA52_0==KW_DO||LA52_0==KW_DOW||(LA52_0 >= KW_DUMP && LA52_0 <= KW_ELEM_TYPE)||LA52_0==KW_ENABLE||(LA52_0 >= KW_ENFORCED && LA52_0 <= KW_ESCAPED)||LA52_0==KW_EXCLUSIVE||(LA52_0 >= KW_EXPLAIN && LA52_0 <= KW_EXPRESSION)||(LA52_0 >= KW_FIELDS && LA52_0 <= KW_FIRST)||(LA52_0 >= KW_FORMAT && LA52_0 <= KW_FORMATTED)||LA52_0==KW_FUNCTIONS||(LA52_0 >= KW_HOUR && LA52_0 <= KW_IDXPROPERTIES)||(LA52_0 >= KW_INDEX && LA52_0 <= KW_INDEXES)||(LA52_0 >= KW_INPATH && LA52_0 <= KW_INPUTFORMAT)||(LA52_0 >= KW_ISOLATION && LA52_0 <= KW_JAR)||(LA52_0 >= KW_KEY && LA52_0 <= KW_LAST)||LA52_0==KW_LEVEL||(LA52_0 >= KW_LINES && LA52_0 <= KW_LOAD)||(LA52_0 >= KW_LOCATION && LA52_0 <= KW_LONG)||LA52_0==KW_MANAGEMENT||(LA52_0 >= KW_MAPJOIN && LA52_0 <= KW_MATERIALIZED)||LA52_0==KW_METADATA||(LA52_0 >= KW_MINUTE && LA52_0 <= KW_MONTH)||(LA52_0 >= KW_MOVE && LA52_0 <= KW_MSCK)||(LA52_0 >= KW_NORELY && LA52_0 <= KW_NOSCAN)||LA52_0==KW_NOVALIDATE||LA52_0==KW_NULLS||LA52_0==KW_OFFSET||(LA52_0 >= KW_OPERATOR && LA52_0 <= KW_OPTION)||(LA52_0 >= KW_OUTPUTDRIVER && LA52_0 <= KW_OUTPUTFORMAT)||(LA52_0 >= KW_OVERWRITE && LA52_0 <= KW_OWNER)||(LA52_0 >= KW_PARTITIONED && LA52_0 <= KW_PATH)||(LA52_0 >= KW_PLAN && LA52_0 <= KW_POOL)||LA52_0==KW_PRINCIPALS||(LA52_0 >= KW_PURGE && LA52_0 <= KW_QUERY_PARALLELISM)||LA52_0==KW_READ||(LA52_0 >= KW_REBUILD && LA52_0 <= KW_RECORDWRITER)||(LA52_0 >= KW_RELOAD && LA52_0 <= KW_RESTRICT)||LA52_0==KW_REWRITE||(LA52_0 >= KW_ROLE && LA52_0 <= KW_ROLES)||(LA52_0 >= KW_SCHEDULING_POLICY && LA52_0 <= KW_SECOND)||(LA52_0 >= KW_SEMI && LA52_0 <= KW_SERVER)||(LA52_0 >= KW_SETS && LA52_0 <= KW_SKEWED)||LA52_0==KW_SNAPSHOT||(LA52_0 >= KW_SORTED && LA52_0 <= KW_SSL)||(LA52_0 >= KW_STATISTICS && LA52_0 <= KW_SUMMARY)||LA52_0==KW_TABLES||(LA52_0 >= KW_TBLPROPERTIES && LA52_0 <= KW_TERMINATED)||LA52_0==KW_TINYINT||(LA52_0 >= KW_TOUCH && LA52_0 <= KW_TRANSACTIONS)||LA52_0==KW_UNARCHIVE||LA52_0==KW_UNDO||LA52_0==KW_UNIONTYPE||(LA52_0 >= KW_UNKNOWN && LA52_0 <= KW_UNSIGNED)||(LA52_0 >= KW_URI && LA52_0 <= KW_USE)||(LA52_0 >= KW_UTC && LA52_0 <= KW_VALIDATE)||LA52_0==KW_VALUE_TYPE||(LA52_0 >= KW_VECTORIZATION && LA52_0 <= KW_WEEK)||LA52_0==KW_WHILE||(LA52_0 >= KW_WORK && LA52_0 <= KW_ZONE)||LA52_0==KW_BATCH||LA52_0==KW_DAYOFWEEK||LA52_0==KW_HOLD_DDLTIME||LA52_0==KW_IGNORE||LA52_0==KW_NO_DROP||LA52_0==KW_OFFLINE||LA52_0==KW_PROTECTION||LA52_0==KW_READONLY||LA52_0==KW_TIMESTAMPTZ) && (synpred8_FromClauseParser())) {s = 28;}
						 
						input.seek(index52_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA52_1 = input.LA(1);
						 
						int index52_1 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_1==LPAREN) ) {s = 3;}
						else if ( (LA52_1==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 34;}
						else if ( (LA52_1==COMMA) && (synpred8_FromClauseParser())) {s = 35;}
						else if ( (LA52_1==KW_JOIN) && (synpred8_FromClauseParser())) {s = 36;}
						else if ( (LA52_1==KW_INNER) && (synpred8_FromClauseParser())) {s = 37;}
						else if ( (LA52_1==KW_CROSS) && (synpred8_FromClauseParser())) {s = 38;}
						else if ( (LA52_1==KW_LEFT) && (synpred8_FromClauseParser())) {s = 39;}
						else if ( (LA52_1==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 40;}
						else if ( (LA52_1==KW_FULL) && (synpred8_FromClauseParser())) {s = 41;}
						else if ( (LA52_1==EOF) && (synpred8_FromClauseParser())) {s = 42;}
						else if ( (LA52_1==KW_INSERT) && (synpred8_FromClauseParser())) {s = 43;}
						else if ( (LA52_1==KW_SELECT) && (synpred8_FromClauseParser())) {s = 44;}
						else if ( (LA52_1==KW_MAP) && (synpred8_FromClauseParser())) {s = 45;}
						else if ( (LA52_1==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 46;}
						else if ( (LA52_1==KW_WHERE) && (synpred8_FromClauseParser())) {s = 47;}
						else if ( (LA52_1==KW_GROUP) && (synpred8_FromClauseParser())) {s = 48;}
						else if ( (LA52_1==KW_HAVING) && (synpred8_FromClauseParser())) {s = 49;}
						else if ( (LA52_1==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 50;}
						else if ( (LA52_1==KW_UNION) && (synpred8_FromClauseParser())) {s = 51;}
						else if ( (LA52_1==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 52;}
						else if ( (LA52_1==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 53;}
						else if ( (LA52_1==KW_MINUS) && (synpred8_FromClauseParser())) {s = 54;}
						else if ( (LA52_1==KW_ORDER) && (synpred8_FromClauseParser())) {s = 55;}
						else if ( (LA52_1==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 56;}
						else if ( (LA52_1==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 57;}
						else if ( (LA52_1==KW_SORT) && (synpred8_FromClauseParser())) {s = 58;}
						else if ( (LA52_1==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 59;}
						else if ( (LA52_1==RPAREN) && (synpred8_FromClauseParser())) {s = 60;}
						else if ( (LA52_1==KW_ON) && (synpred8_FromClauseParser())) {s = 61;}
						else if ( (LA52_1==KW_USING) && (synpred8_FromClauseParser())) {s = 62;}
						else if ( (LA52_1==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 63;}
						else if ( (LA52_1==Identifier) && (synpred8_FromClauseParser())) {s = 64;}
						 
						input.seek(index52_1);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA52_2 = input.LA(1);
						 
						int index52_2 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_2==KW_BY) ) {s = 3;}
						else if ( (LA52_2==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 66;}
						else if ( (LA52_2==COMMA) && (synpred8_FromClauseParser())) {s = 67;}
						else if ( (LA52_2==KW_JOIN) && (synpred8_FromClauseParser())) {s = 68;}
						else if ( (LA52_2==KW_INNER) && (synpred8_FromClauseParser())) {s = 69;}
						else if ( (LA52_2==KW_CROSS) && (synpred8_FromClauseParser())) {s = 70;}
						else if ( (LA52_2==KW_LEFT) && (synpred8_FromClauseParser())) {s = 71;}
						else if ( (LA52_2==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 72;}
						else if ( (LA52_2==KW_FULL) && (synpred8_FromClauseParser())) {s = 73;}
						else if ( (LA52_2==EOF) && (synpred8_FromClauseParser())) {s = 74;}
						else if ( (LA52_2==KW_INSERT) && (synpred8_FromClauseParser())) {s = 75;}
						else if ( (LA52_2==KW_SELECT) && (synpred8_FromClauseParser())) {s = 76;}
						else if ( (LA52_2==KW_MAP) && (synpred8_FromClauseParser())) {s = 77;}
						else if ( (LA52_2==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 78;}
						else if ( (LA52_2==KW_WHERE) && (synpred8_FromClauseParser())) {s = 79;}
						else if ( (LA52_2==KW_GROUP) && (synpred8_FromClauseParser())) {s = 80;}
						else if ( (LA52_2==KW_HAVING) && (synpred8_FromClauseParser())) {s = 81;}
						else if ( (LA52_2==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 82;}
						else if ( (LA52_2==KW_UNION) && (synpred8_FromClauseParser())) {s = 83;}
						else if ( (LA52_2==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 84;}
						else if ( (LA52_2==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 85;}
						else if ( (LA52_2==KW_MINUS) && (synpred8_FromClauseParser())) {s = 86;}
						else if ( (LA52_2==KW_ORDER) && (synpred8_FromClauseParser())) {s = 87;}
						else if ( (LA52_2==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 88;}
						else if ( (LA52_2==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 89;}
						else if ( (LA52_2==KW_SORT) && (synpred8_FromClauseParser())) {s = 90;}
						else if ( (LA52_2==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 91;}
						else if ( (LA52_2==RPAREN) && (synpred8_FromClauseParser())) {s = 92;}
						else if ( (LA52_2==KW_ON) && (synpred8_FromClauseParser())) {s = 93;}
						else if ( (LA52_2==KW_USING) && (synpred8_FromClauseParser())) {s = 94;}
						else if ( (LA52_2==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 95;}
						else if ( (LA52_2==Identifier) && (synpred8_FromClauseParser())) {s = 96;}
						 
						input.seek(index52_2);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA52_17 = input.LA(1);
						 
						int index52_17 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_17==KW_BY) ) {s = 3;}
						else if ( (LA52_17==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 98;}
						else if ( (LA52_17==COMMA) && (synpred8_FromClauseParser())) {s = 99;}
						else if ( (LA52_17==KW_JOIN) && (synpred8_FromClauseParser())) {s = 100;}
						else if ( (LA52_17==KW_INNER) && (synpred8_FromClauseParser())) {s = 101;}
						else if ( (LA52_17==KW_CROSS) && (synpred8_FromClauseParser())) {s = 102;}
						else if ( (LA52_17==KW_LEFT) && (synpred8_FromClauseParser())) {s = 103;}
						else if ( (LA52_17==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 104;}
						else if ( (LA52_17==KW_FULL) && (synpred8_FromClauseParser())) {s = 105;}
						else if ( (LA52_17==EOF) && (synpred8_FromClauseParser())) {s = 106;}
						else if ( (LA52_17==KW_INSERT) && (synpred8_FromClauseParser())) {s = 107;}
						else if ( (LA52_17==KW_SELECT) && (synpred8_FromClauseParser())) {s = 108;}
						else if ( (LA52_17==KW_MAP) && (synpred8_FromClauseParser())) {s = 109;}
						else if ( (LA52_17==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 110;}
						else if ( (LA52_17==KW_WHERE) && (synpred8_FromClauseParser())) {s = 111;}
						else if ( (LA52_17==KW_GROUP) && (synpred8_FromClauseParser())) {s = 112;}
						else if ( (LA52_17==KW_HAVING) && (synpred8_FromClauseParser())) {s = 113;}
						else if ( (LA52_17==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 114;}
						else if ( (LA52_17==KW_UNION) && (synpred8_FromClauseParser())) {s = 115;}
						else if ( (LA52_17==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 116;}
						else if ( (LA52_17==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 117;}
						else if ( (LA52_17==KW_MINUS) && (synpred8_FromClauseParser())) {s = 118;}
						else if ( (LA52_17==KW_ORDER) && (synpred8_FromClauseParser())) {s = 119;}
						else if ( (LA52_17==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 120;}
						else if ( (LA52_17==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 121;}
						else if ( (LA52_17==KW_SORT) && (synpred8_FromClauseParser())) {s = 122;}
						else if ( (LA52_17==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 123;}
						else if ( (LA52_17==RPAREN) && (synpred8_FromClauseParser())) {s = 124;}
						else if ( (LA52_17==KW_ON) && (synpred8_FromClauseParser())) {s = 125;}
						else if ( (LA52_17==KW_USING) && (synpred8_FromClauseParser())) {s = 126;}
						else if ( (LA52_17==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 127;}
						else if ( (LA52_17==Identifier) && (synpred8_FromClauseParser())) {s = 128;}
						 
						input.seek(index52_17);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA52_24 = input.LA(1);
						 
						int index52_24 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_24==KW_BY) ) {s = 3;}
						else if ( (LA52_24==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 130;}
						else if ( (LA52_24==COMMA) && (synpred8_FromClauseParser())) {s = 131;}
						else if ( (LA52_24==KW_JOIN) && (synpred8_FromClauseParser())) {s = 132;}
						else if ( (LA52_24==KW_INNER) && (synpred8_FromClauseParser())) {s = 133;}
						else if ( (LA52_24==KW_CROSS) && (synpred8_FromClauseParser())) {s = 134;}
						else if ( (LA52_24==KW_LEFT) && (synpred8_FromClauseParser())) {s = 135;}
						else if ( (LA52_24==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 136;}
						else if ( (LA52_24==KW_FULL) && (synpred8_FromClauseParser())) {s = 137;}
						else if ( (LA52_24==EOF) && (synpred8_FromClauseParser())) {s = 138;}
						else if ( (LA52_24==KW_INSERT) && (synpred8_FromClauseParser())) {s = 139;}
						else if ( (LA52_24==KW_SELECT) && (synpred8_FromClauseParser())) {s = 140;}
						else if ( (LA52_24==KW_MAP) && (synpred8_FromClauseParser())) {s = 141;}
						else if ( (LA52_24==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 142;}
						else if ( (LA52_24==KW_WHERE) && (synpred8_FromClauseParser())) {s = 143;}
						else if ( (LA52_24==KW_GROUP) && (synpred8_FromClauseParser())) {s = 144;}
						else if ( (LA52_24==KW_HAVING) && (synpred8_FromClauseParser())) {s = 145;}
						else if ( (LA52_24==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 146;}
						else if ( (LA52_24==KW_UNION) && (synpred8_FromClauseParser())) {s = 147;}
						else if ( (LA52_24==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 148;}
						else if ( (LA52_24==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 149;}
						else if ( (LA52_24==KW_MINUS) && (synpred8_FromClauseParser())) {s = 150;}
						else if ( (LA52_24==KW_ORDER) && (synpred8_FromClauseParser())) {s = 151;}
						else if ( (LA52_24==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 152;}
						else if ( (LA52_24==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 153;}
						else if ( (LA52_24==KW_SORT) && (synpred8_FromClauseParser())) {s = 154;}
						else if ( (LA52_24==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 155;}
						else if ( (LA52_24==RPAREN) && (synpred8_FromClauseParser())) {s = 156;}
						else if ( (LA52_24==KW_ON) && (synpred8_FromClauseParser())) {s = 157;}
						else if ( (LA52_24==KW_USING) && (synpred8_FromClauseParser())) {s = 158;}
						else if ( (LA52_24==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 159;}
						else if ( (LA52_24==Identifier) && (synpred8_FromClauseParser())) {s = 160;}
						 
						input.seek(index52_24);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA52_25 = input.LA(1);
						 
						int index52_25 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_25==KW_BY) ) {s = 3;}
						else if ( (LA52_25==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 162;}
						else if ( (LA52_25==COMMA) && (synpred8_FromClauseParser())) {s = 163;}
						else if ( (LA52_25==KW_JOIN) && (synpred8_FromClauseParser())) {s = 164;}
						else if ( (LA52_25==KW_INNER) && (synpred8_FromClauseParser())) {s = 165;}
						else if ( (LA52_25==KW_CROSS) && (synpred8_FromClauseParser())) {s = 166;}
						else if ( (LA52_25==KW_LEFT) && (synpred8_FromClauseParser())) {s = 167;}
						else if ( (LA52_25==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 168;}
						else if ( (LA52_25==KW_FULL) && (synpred8_FromClauseParser())) {s = 169;}
						else if ( (LA52_25==EOF) && (synpred8_FromClauseParser())) {s = 170;}
						else if ( (LA52_25==KW_INSERT) && (synpred8_FromClauseParser())) {s = 171;}
						else if ( (LA52_25==KW_SELECT) && (synpred8_FromClauseParser())) {s = 172;}
						else if ( (LA52_25==KW_MAP) && (synpred8_FromClauseParser())) {s = 173;}
						else if ( (LA52_25==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 174;}
						else if ( (LA52_25==KW_WHERE) && (synpred8_FromClauseParser())) {s = 175;}
						else if ( (LA52_25==KW_GROUP) && (synpred8_FromClauseParser())) {s = 176;}
						else if ( (LA52_25==KW_HAVING) && (synpred8_FromClauseParser())) {s = 177;}
						else if ( (LA52_25==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 178;}
						else if ( (LA52_25==KW_UNION) && (synpred8_FromClauseParser())) {s = 179;}
						else if ( (LA52_25==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 180;}
						else if ( (LA52_25==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 181;}
						else if ( (LA52_25==KW_MINUS) && (synpred8_FromClauseParser())) {s = 182;}
						else if ( (LA52_25==KW_ORDER) && (synpred8_FromClauseParser())) {s = 183;}
						else if ( (LA52_25==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 184;}
						else if ( (LA52_25==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 185;}
						else if ( (LA52_25==KW_SORT) && (synpred8_FromClauseParser())) {s = 186;}
						else if ( (LA52_25==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 187;}
						else if ( (LA52_25==RPAREN) && (synpred8_FromClauseParser())) {s = 188;}
						else if ( (LA52_25==KW_ON) && (synpred8_FromClauseParser())) {s = 189;}
						else if ( (LA52_25==KW_USING) && (synpred8_FromClauseParser())) {s = 190;}
						else if ( (LA52_25==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 191;}
						else if ( (LA52_25==Identifier) && (synpred8_FromClauseParser())) {s = 192;}
						 
						input.seek(index52_25);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA52_26 = input.LA(1);
						 
						int index52_26 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_26==KW_BY) ) {s = 3;}
						else if ( (LA52_26==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 194;}
						else if ( (LA52_26==COMMA) && (synpred8_FromClauseParser())) {s = 195;}
						else if ( (LA52_26==KW_JOIN) && (synpred8_FromClauseParser())) {s = 196;}
						else if ( (LA52_26==KW_INNER) && (synpred8_FromClauseParser())) {s = 197;}
						else if ( (LA52_26==KW_CROSS) && (synpred8_FromClauseParser())) {s = 198;}
						else if ( (LA52_26==KW_LEFT) && (synpred8_FromClauseParser())) {s = 199;}
						else if ( (LA52_26==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 200;}
						else if ( (LA52_26==KW_FULL) && (synpred8_FromClauseParser())) {s = 201;}
						else if ( (LA52_26==EOF) && (synpred8_FromClauseParser())) {s = 202;}
						else if ( (LA52_26==KW_INSERT) && (synpred8_FromClauseParser())) {s = 203;}
						else if ( (LA52_26==KW_SELECT) && (synpred8_FromClauseParser())) {s = 204;}
						else if ( (LA52_26==KW_MAP) && (synpred8_FromClauseParser())) {s = 205;}
						else if ( (LA52_26==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 206;}
						else if ( (LA52_26==KW_WHERE) && (synpred8_FromClauseParser())) {s = 207;}
						else if ( (LA52_26==KW_GROUP) && (synpred8_FromClauseParser())) {s = 208;}
						else if ( (LA52_26==KW_HAVING) && (synpred8_FromClauseParser())) {s = 209;}
						else if ( (LA52_26==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 210;}
						else if ( (LA52_26==KW_UNION) && (synpred8_FromClauseParser())) {s = 211;}
						else if ( (LA52_26==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 212;}
						else if ( (LA52_26==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 213;}
						else if ( (LA52_26==KW_MINUS) && (synpred8_FromClauseParser())) {s = 214;}
						else if ( (LA52_26==KW_ORDER) && (synpred8_FromClauseParser())) {s = 215;}
						else if ( (LA52_26==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 216;}
						else if ( (LA52_26==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 217;}
						else if ( (LA52_26==KW_SORT) && (synpred8_FromClauseParser())) {s = 218;}
						else if ( (LA52_26==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 219;}
						else if ( (LA52_26==RPAREN) && (synpred8_FromClauseParser())) {s = 220;}
						else if ( (LA52_26==KW_ON) && (synpred8_FromClauseParser())) {s = 221;}
						else if ( (LA52_26==KW_USING) && (synpred8_FromClauseParser())) {s = 222;}
						else if ( (LA52_26==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 223;}
						else if ( (LA52_26==Identifier) && (synpred8_FromClauseParser())) {s = 224;}
						 
						input.seek(index52_26);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA52_27 = input.LA(1);
						 
						int index52_27 = input.index();
						input.rewind();
						s = -1;
						if ( (LA52_27==Number) ) {s = 3;}
						else if ( (LA52_27==KW_LATERAL) && (synpred8_FromClauseParser())) {s = 226;}
						else if ( (LA52_27==COMMA) && (synpred8_FromClauseParser())) {s = 227;}
						else if ( (LA52_27==KW_JOIN) && (synpred8_FromClauseParser())) {s = 228;}
						else if ( (LA52_27==KW_INNER) && (synpred8_FromClauseParser())) {s = 229;}
						else if ( (LA52_27==KW_CROSS) && (synpred8_FromClauseParser())) {s = 230;}
						else if ( (LA52_27==KW_LEFT) && (synpred8_FromClauseParser())) {s = 231;}
						else if ( (LA52_27==KW_RIGHT) && (synpred8_FromClauseParser())) {s = 232;}
						else if ( (LA52_27==KW_FULL) && (synpred8_FromClauseParser())) {s = 233;}
						else if ( (LA52_27==EOF) && (synpred8_FromClauseParser())) {s = 234;}
						else if ( (LA52_27==KW_INSERT) && (synpred8_FromClauseParser())) {s = 235;}
						else if ( (LA52_27==KW_SELECT) && (synpred8_FromClauseParser())) {s = 236;}
						else if ( (LA52_27==KW_MAP) && (synpred8_FromClauseParser())) {s = 237;}
						else if ( (LA52_27==KW_REDUCE) && (synpred8_FromClauseParser())) {s = 238;}
						else if ( (LA52_27==KW_WHERE) && (synpred8_FromClauseParser())) {s = 239;}
						else if ( (LA52_27==KW_GROUP) && (synpred8_FromClauseParser())) {s = 240;}
						else if ( (LA52_27==KW_HAVING) && (synpred8_FromClauseParser())) {s = 241;}
						else if ( (LA52_27==KW_WINDOW) && (synpred8_FromClauseParser())) {s = 242;}
						else if ( (LA52_27==KW_UNION) && (synpred8_FromClauseParser())) {s = 243;}
						else if ( (LA52_27==KW_INTERSECT) && (synpred8_FromClauseParser())) {s = 244;}
						else if ( (LA52_27==KW_EXCEPT) && (synpred8_FromClauseParser())) {s = 245;}
						else if ( (LA52_27==KW_MINUS) && (synpred8_FromClauseParser())) {s = 246;}
						else if ( (LA52_27==KW_ORDER) && (synpred8_FromClauseParser())) {s = 247;}
						else if ( (LA52_27==KW_CLUSTER) && (synpred8_FromClauseParser())) {s = 248;}
						else if ( (LA52_27==KW_DISTRIBUTE) && (synpred8_FromClauseParser())) {s = 249;}
						else if ( (LA52_27==KW_SORT) && (synpred8_FromClauseParser())) {s = 250;}
						else if ( (LA52_27==KW_LIMIT) && (synpred8_FromClauseParser())) {s = 251;}
						else if ( (LA52_27==RPAREN) && (synpred8_FromClauseParser())) {s = 252;}
						else if ( (LA52_27==KW_ON) && (synpred8_FromClauseParser())) {s = 253;}
						else if ( (LA52_27==KW_USING) && (synpred8_FromClauseParser())) {s = 254;}
						else if ( (LA52_27==KW_PARTITION) && (synpred8_FromClauseParser())) {s = 255;}
						else if ( (LA52_27==Identifier) && (synpred8_FromClauseParser())) {s = 256;}
						 
						input.seek(index52_27);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 52, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_STAR_in_tableAllColumns58 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableAllColumns80 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_tableAllColumns82 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
	public static final BitSet FOLLOW_STAR_in_tableAllColumns84 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableOrColumn132 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList171 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_expressionList174 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_expressionList176 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_identifier_in_aliasList218 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_aliasList221 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_aliasList223 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_KW_FROM_in_fromClause267 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE876FEF7DEF0CBFFL,0x000087C9F5CDFAA1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_fromSource_in_fromClause269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_uniqueJoinToken_in_fromSource308 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD4F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource311 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_COMMA_in_fromSource314 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD4F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource317 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_joinSource_in_fromSource331 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSource_in_atomjoinSource363 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_lateralView_in_atomjoinSource366 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_virtualTableSource_in_atomjoinSource381 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_lateralView_in_atomjoinSource384 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_subQuerySource_in_atomjoinSource405 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_lateralView_in_atomjoinSource408 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_atomjoinSource423 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_lateralView_in_atomjoinSource426 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_LPAREN_in_atomjoinSource441 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE876FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_joinSource_in_atomjoinSource444 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_atomjoinSource446 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_atomjoinSource_in_joinSource468 = new BitSet(new long[]{0x0000000000000202L,0x0000000000004000L,0x0002040020008000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_joinToken_in_joinSource471 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE876FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_joinSourcePart_in_joinSource474 = new BitSet(new long[]{0x0000000000000202L,0x0000000000004000L,0x0002040020008000L,0x0000000000400000L,0x0000000000001000L,0x0000000000200000L});
	public static final BitSet FOLLOW_KW_ON_in_joinSource477 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_joinSource480 = new BitSet(new long[]{0x0000000000000202L,0x0000000000004000L,0x0002040020008000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_KW_USING_in_joinSource486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_columnParenthesesList_in_joinSource489 = new BitSet(new long[]{0x0000000000000202L,0x0000000000004000L,0x0002040020008000L,0x0000000000000000L,0x0000000000001000L});
	public static final BitSet FOLLOW_tableSource_in_joinSourcePart527 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_virtualTableSource_in_joinSourcePart531 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_subQuerySource_in_joinSourcePart535 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_joinSourcePart539 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_lateralView_in_joinSourcePart543 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource573 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource578 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr605 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expressionList_in_uniqueJoinExpr608 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr610 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken638 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken670 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_INNER_in_joinToken703 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken705 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_joinToken729 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CROSS_in_joinToken764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken766 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken798 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RIGHT_in_joinToken810 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken817 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FULL_in_joinToken829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_joinToken833 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken837 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LEFT_in_joinToken849 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_KW_SEMI_in_joinToken851 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
	public static final BitSet FOLLOW_KW_JOIN_in_joinToken853 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_lateralView904 = new BitSet(new long[]{0xE9B76D8AFD000000L,0x1D35BDEEEFD613DBL,0xBEE8FB85D9DA307CL,0x1EBD0F76CB2ADB5FL,0xEA74FEFFDEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_function_in_lateralView906 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView908 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView911 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView913 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_lateralView921 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView923 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_lateralView955 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_lateralView960 = new BitSet(new long[]{0xE9B76D8AFD000000L,0x1D35BDEEEFD613DBL,0xBEE8FB85D9DA307CL,0x1EBD0F76CB2ADB5FL,0xEA74FEFFDEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_function_in_lateralView962 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView964 = new BitSet(new long[]{0x0000020000000002L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView967 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView969 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_lateralView977 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView979 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_lateralView1017 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_KW_LATERAL_in_lateralView1020 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
	public static final BitSet FOLLOW_KW_TABLE_in_lateralView1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_lateralView1024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_valuesClause_in_lateralView1026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lateralView1028 = new BitSet(new long[]{0xE9B06E8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_lateralView1030 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableAlias_in_lateralView1033 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_lateralView1036 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView1038 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_lateralView1041 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_lateralView1043 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_lateralView1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableAlias1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_tableBucketSample1150 = new BitSet(new long[]{0x0010000000000000L});
	public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample1152 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample1157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
	public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample1160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_KW_OF_in_tableBucketSample1162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_tableBucketSample1167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_ON_in_tableBucketSample1171 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample1175 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_tableBucketSample1178 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_tableBucketSample1182 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_tableBucketSample1188 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample1237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_splitSample1243 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L,0x0000000000080000L});
	public static final BitSet FOLLOW_KW_PERCENT_in_splitSample1249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_ROWS_in_splitSample1251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample1254 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_splitSample1300 = new BitSet(new long[]{0x0000000000000080L});
	public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_splitSample1309 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableBucketSample_in_tableSample1355 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_splitSample_in_tableSample1363 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableSource1392 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE87CFEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableProperties_in_tableSource1396 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE87CFEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableSample_in_tableSource1401 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_tableSource1405 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_tableSource1410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_uniqueJoinTableSource1466 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE87CFEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableSample_in_uniqueJoinTableSource1470 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_uniqueJoinTableSource1474 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_uniqueJoinTableSource1479 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1535 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_tableName1537 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_tableName1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_tableName1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_viewName1618 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_viewName1620 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_viewName1626 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subQuerySource1674 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000200004000L,0x2000000000000001L,0x0000000001000000L,0x0000802000000000L});
	public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_subQuerySource1678 = new BitSet(new long[]{0xE9B06E8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_subQuerySource1680 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_subQuerySource1683 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1723 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1725 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1744 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1759 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1761 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1780 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec1795 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource1831 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource1838 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource1845 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_partitionedTableFunction1875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
	public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction1879 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction1894 = new BitSet(new long[]{0x4000000001000000L,0x0000040000000000L,0x0000000000000000L,0x0000000808000000L,0x0000002000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction1898 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1922 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1924 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1926 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction1930 = new BitSet(new long[]{0x0000000001000000L});
	public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction1932 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction1934 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_partitionedTableFunction1936 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1938 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction1955 = new BitSet(new long[]{0xE9B06C8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_partitionedTableFunction1968 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_WHERE_in_whereClause2030 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_searchCondition_in_whereClause2032 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_searchCondition2071 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_VALUES_in_valuesClause2110 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_valuesTableConstructor_in_valuesClause2112 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2154 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_valuesTableConstructor2157 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2160 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_expressionsInParenthesis_in_valueRowConstructor2193 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TABLE_in_virtualTableSource2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2229 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
	public static final BitSet FOLLOW_valuesClause_in_virtualTableSource2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2233 = new BitSet(new long[]{0xE9B06E8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_virtualTableSource2235 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_tableAlias_in_virtualTableSource2240 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2243 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_virtualTableSource2245 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_virtualTableSource2248 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_virtualTableSource2250 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subQuerySource_in_synpred1_FromClauseParser400 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred2_FromClauseParser888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
	public static final BitSet FOLLOW_KW_LATERAL_in_synpred2_FromClauseParser891 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_VIEW_in_synpred2_FromClauseParser893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_KW_OUTER_in_synpred2_FromClauseParser895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred3_FromClauseParser917 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred4_FromClauseParser973 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred6_FromClauseParser1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_synpred6_FromClauseParser1910 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000006L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_expression_in_synpred6_FromClauseParser1912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred6_FromClauseParser1914 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_synpred8_FromClauseParser1961 = new BitSet(new long[]{0x0000000000000002L});
}
