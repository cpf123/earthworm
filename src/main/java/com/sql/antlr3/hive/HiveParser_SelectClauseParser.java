// $ANTLR 3.5.2 SelectClauseParser.g 2019-08-18 22:38:04

package com.sql.antlr3.hive;


import com.sql.antlr3.hive.parse.ASTNode;
import com.sql.antlr3.hive.parse.ParseError;
import org.antlr.runtime.*;

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
public class HiveParser_SelectClauseParser extends Parser {
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


	public HiveParser_SelectClauseParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_SelectClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "SelectClauseParser.g"; }


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


	public static class selectClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectClause"
	// SelectClauseParser.g:48:1: selectClause : ( KW_SELECT ( QUERY_HINT )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( QUERY_HINT )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( QUERY_HINT )? selectList ) -> ^( TOK_SELECT ( QUERY_HINT )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) );
	public final HiveParser_SelectClauseParser.selectClause_return selectClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectClause_return retval = new HiveParser_SelectClauseParser.selectClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token dist=null;
		Token transform=null;
		Token KW_SELECT1=null;
		Token QUERY_HINT2=null;
		Token KW_ALL3=null;
		ParserRuleReturnScope selectList4 =null;
		ParserRuleReturnScope selectTrfmClause5 =null;
		ParserRuleReturnScope trfmClause6 =null;

		ASTNode dist_tree=null;
		ASTNode transform_tree=null;
		ASTNode KW_SELECT1_tree=null;
		ASTNode QUERY_HINT2_tree=null;
		ASTNode KW_ALL3_tree=null;
		RewriteRuleTokenStream stream_KW_TRANSFORM=new RewriteRuleTokenStream(adaptor,"token KW_TRANSFORM");
		RewriteRuleTokenStream stream_KW_DISTINCT=new RewriteRuleTokenStream(adaptor,"token KW_DISTINCT");
		RewriteRuleTokenStream stream_KW_SELECT=new RewriteRuleTokenStream(adaptor,"token KW_SELECT");
		RewriteRuleTokenStream stream_QUERY_HINT=new RewriteRuleTokenStream(adaptor,"token QUERY_HINT");
		RewriteRuleTokenStream stream_KW_ALL=new RewriteRuleTokenStream(adaptor,"token KW_ALL");
		RewriteRuleSubtreeStream stream_trfmClause=new RewriteRuleSubtreeStream(adaptor,"rule trfmClause");
		RewriteRuleSubtreeStream stream_selectList=new RewriteRuleSubtreeStream(adaptor,"rule selectList");
		RewriteRuleSubtreeStream stream_selectTrfmClause=new RewriteRuleSubtreeStream(adaptor,"rule selectTrfmClause");

		 gParent.pushMsg(retval.start,"select clause", state); 
		try {
			// SelectClauseParser.g:51:5: ( KW_SELECT ( QUERY_HINT )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) ) -> {$transform == null && $dist == null}? ^( TOK_SELECT ( QUERY_HINT )? selectList ) -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( QUERY_HINT )? selectList ) -> ^( TOK_SELECT ( QUERY_HINT )? ^( TOK_SELEXPR selectTrfmClause ) ) | trfmClause -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==KW_SELECT) ) {
				alt4=1;
			}
			else if ( (LA4_0==KW_MAP||LA4_0==KW_REDUCE) ) {
				alt4=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// SelectClauseParser.g:52:5: KW_SELECT ( QUERY_HINT )? ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					{
					KW_SELECT1=(Token)match(input,KW_SELECT,FOLLOW_KW_SELECT_in_selectClause71); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_SELECT.add(KW_SELECT1);

					// SelectClauseParser.g:52:15: ( QUERY_HINT )?
					int alt1=2;
					int LA1_0 = input.LA(1);
					if ( (LA1_0==QUERY_HINT) ) {
						alt1=1;
					}
					switch (alt1) {
						case 1 :
							// SelectClauseParser.g:52:15: QUERY_HINT
							{
							QUERY_HINT2=(Token)match(input,QUERY_HINT,FOLLOW_QUERY_HINT_in_selectClause73); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_QUERY_HINT.add(QUERY_HINT2);

							}
							break;

					}

					// SelectClauseParser.g:52:27: ( ( ( KW_ALL |dist= KW_DISTINCT )? selectList ) | (transform= KW_TRANSFORM selectTrfmClause ) )
					int alt3=2;
					int LA3_0 = input.LA(1);
					if ( (LA3_0==CharSetName||(LA3_0 >= Identifier && LA3_0 <= KW_ALLOC_FRACTION)||LA3_0==KW_ANALYZE||(LA3_0 >= KW_ARCHIVE && LA3_0 <= KW_ARRAY)||(LA3_0 >= KW_ASC && LA3_0 <= KW_AST)||(LA3_0 >= KW_AUTOCOMMIT && LA3_0 <= KW_BEFORE)||(LA3_0 >= KW_BIGINT && LA3_0 <= KW_BOOLEAN)||(LA3_0 >= KW_BUCKET && LA3_0 <= KW_BUCKETS)||(LA3_0 >= KW_CACHE && LA3_0 <= KW_CHANGE)||(LA3_0 >= KW_CHECK && LA3_0 <= KW_COLLECTION)||(LA3_0 >= KW_COLUMNS && LA3_0 <= KW_COMMENT)||(LA3_0 >= KW_COMPACT && LA3_0 <= KW_CONCATENATE)||LA3_0==KW_CONTINUE||(LA3_0 >= KW_CURRENT_DATE && LA3_0 <= KW_CURRENT_TIMESTAMP)||LA3_0==KW_DATA||(LA3_0 >= KW_DATABASES && LA3_0 <= KW_DEBUG)||(LA3_0 >= KW_DEFAULT && LA3_0 <= KW_DEFINED)||(LA3_0 >= KW_DELIMITED && LA3_0 <= KW_DESC)||(LA3_0 >= KW_DETAIL && LA3_0 <= KW_DOW)||(LA3_0 >= KW_DUMP && LA3_0 <= KW_ELEM_TYPE)||LA3_0==KW_ENABLE||(LA3_0 >= KW_ENFORCED && LA3_0 <= KW_ESCAPED)||(LA3_0 >= KW_EXCLUSIVE && LA3_0 <= KW_EXPRESSION)||(LA3_0 >= KW_EXTRACT && LA3_0 <= KW_FALSE)||(LA3_0 >= KW_FIELDS && LA3_0 <= KW_FLOOR)||(LA3_0 >= KW_FORMAT && LA3_0 <= KW_FORMATTED)||LA3_0==KW_FUNCTIONS||(LA3_0 >= KW_GROUP && LA3_0 <= KW_GROUPING)||(LA3_0 >= KW_HOUR && LA3_0 <= KW_IF)||(LA3_0 >= KW_INDEX && LA3_0 <= KW_INDEXES)||(LA3_0 >= KW_INPATH && LA3_0 <= KW_INPUTFORMAT)||LA3_0==KW_INT||LA3_0==KW_INTERVAL||(LA3_0 >= KW_ISOLATION && LA3_0 <= KW_JAR)||(LA3_0 >= KW_KEY && LA3_0 <= KW_LAST)||LA3_0==KW_LEVEL||(LA3_0 >= KW_LIMIT && LA3_0 <= KW_LOAD)||(LA3_0 >= KW_LOCATION && LA3_0 <= KW_LONG)||(LA3_0 >= KW_MANAGEMENT && LA3_0 <= KW_MATERIALIZED)||LA3_0==KW_METADATA||(LA3_0 >= KW_MINUTE && LA3_0 <= KW_MONTH)||(LA3_0 >= KW_MOVE && LA3_0 <= KW_MSCK)||(LA3_0 >= KW_NORELY && LA3_0 <= KW_NULLS)||LA3_0==KW_OFFSET||(LA3_0 >= KW_OPERATOR && LA3_0 <= KW_OPTION)||LA3_0==KW_ORDER||(LA3_0 >= KW_OUTPUTDRIVER && LA3_0 <= KW_OUTPUTFORMAT)||(LA3_0 >= KW_OVERWRITE && LA3_0 <= KW_OWNER)||(LA3_0 >= KW_PARTITIONED && LA3_0 <= KW_PATH)||(LA3_0 >= KW_PLAN && LA3_0 <= KW_POOL)||LA3_0==KW_PRINCIPALS||(LA3_0 >= KW_PURGE && LA3_0 <= KW_QUERY_PARALLELISM)||LA3_0==KW_READ||(LA3_0 >= KW_REAL && LA3_0 <= KW_RECORDWRITER)||(LA3_0 >= KW_RELOAD && LA3_0 <= KW_RESTRICT)||LA3_0==KW_REWRITE||(LA3_0 >= KW_ROLE && LA3_0 <= KW_ROLES)||(LA3_0 >= KW_SCHEDULING_POLICY && LA3_0 <= KW_SECOND)||(LA3_0 >= KW_SEMI && LA3_0 <= KW_SERVER)||(LA3_0 >= KW_SETS && LA3_0 <= KW_SSL)||(LA3_0 >= KW_STATISTICS && LA3_0 <= KW_SUMMARY)||LA3_0==KW_TABLES||(LA3_0 >= KW_TBLPROPERTIES && LA3_0 <= KW_TERMINATED)||(LA3_0 >= KW_TIMESTAMP && LA3_0 <= KW_TINYINT)||(LA3_0 >= KW_TOUCH && LA3_0 <= KW_TRANSACTIONS)||LA3_0==KW_TRUE||LA3_0==KW_UNARCHIVE||LA3_0==KW_UNDO||LA3_0==KW_UNIONTYPE||(LA3_0 >= KW_UNKNOWN && LA3_0 <= KW_UNSIGNED)||(LA3_0 >= KW_URI && LA3_0 <= KW_USE)||(LA3_0 >= KW_UTC && LA3_0 <= KW_VALIDATE)||LA3_0==KW_VALUE_TYPE||(LA3_0 >= KW_VECTORIZATION && LA3_0 <= KW_WEEK)||LA3_0==KW_WHILE||(LA3_0 >= KW_WORK && LA3_0 <= KW_ZONE)||LA3_0==LPAREN||LA3_0==MINUS||(LA3_0 >= Number && LA3_0 <= PLUS)||(LA3_0 >= STAR && LA3_0 <= TILDE)||LA3_0==KW_BATCH||LA3_0==KW_DAYOFWEEK||LA3_0==KW_HOLD_DDLTIME||LA3_0==KW_IGNORE||LA3_0==KW_NO_DROP||LA3_0==KW_OFFLINE||LA3_0==KW_PROTECTION||LA3_0==KW_READONLY||LA3_0==KW_TIMESTAMPTZ) ) {
						alt3=1;
					}
					else if ( (LA3_0==KW_TRANSFORM) ) {
						alt3=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						throw nvae;
					}

					switch (alt3) {
						case 1 :
							// SelectClauseParser.g:52:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							{
							// SelectClauseParser.g:52:28: ( ( KW_ALL |dist= KW_DISTINCT )? selectList )
							// SelectClauseParser.g:52:29: ( KW_ALL |dist= KW_DISTINCT )? selectList
							{
							// SelectClauseParser.g:52:29: ( KW_ALL |dist= KW_DISTINCT )?
							int alt2=3;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==KW_ALL) ) {
								alt2=1;
							}
							else if ( (LA2_0==KW_DISTINCT) ) {
								alt2=2;
							}
							switch (alt2) {
								case 1 :
									// SelectClauseParser.g:52:30: KW_ALL
									{
									KW_ALL3=(Token)match(input,KW_ALL,FOLLOW_KW_ALL_in_selectClause79); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_ALL.add(KW_ALL3);

									}
									break;
								case 2 :
									// SelectClauseParser.g:52:39: dist= KW_DISTINCT
									{
									dist=(Token)match(input,KW_DISTINCT,FOLLOW_KW_DISTINCT_in_selectClause85); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_DISTINCT.add(dist);

									}
									break;

							}

							pushFollow(FOLLOW_selectList_in_selectClause89);
							selectList4=selectList();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_selectList.add(selectList4.getTree());
							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:53:29: (transform= KW_TRANSFORM selectTrfmClause )
							{
							// SelectClauseParser.g:53:29: (transform= KW_TRANSFORM selectTrfmClause )
							// SelectClauseParser.g:53:30: transform= KW_TRANSFORM selectTrfmClause
							{
							transform=(Token)match(input,KW_TRANSFORM,FOLLOW_KW_TRANSFORM_in_selectClause123); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_TRANSFORM.add(transform);

							pushFollow(FOLLOW_selectTrfmClause_in_selectClause125);
							selectTrfmClause5=selectTrfmClause();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_selectTrfmClause.add(selectTrfmClause5.getTree());
							}

							}
							break;

					}

					// AST REWRITE
					// elements: selectTrfmClause, selectList, QUERY_HINT, selectList, QUERY_HINT, QUERY_HINT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 54:6: -> {$transform == null && $dist == null}? ^( TOK_SELECT ( QUERY_HINT )? selectList )
					if (transform == null && dist == null) {
						// SelectClauseParser.g:54:48: ^( TOK_SELECT ( QUERY_HINT )? selectList )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:54:61: ( QUERY_HINT )?
						if ( stream_QUERY_HINT.hasNext() ) {
							adaptor.addChild(root_1, stream_QUERY_HINT.nextNode());
						}
						stream_QUERY_HINT.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 55:6: -> {$transform == null && $dist != null}? ^( TOK_SELECTDI ( QUERY_HINT )? selectList )
					if (transform == null && dist != null) {
						// SelectClauseParser.g:55:48: ^( TOK_SELECTDI ( QUERY_HINT )? selectList )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECTDI, "TOK_SELECTDI"), root_1);
						// SelectClauseParser.g:55:63: ( QUERY_HINT )?
						if ( stream_QUERY_HINT.hasNext() ) {
							adaptor.addChild(root_1, stream_QUERY_HINT.nextNode());
						}
						stream_QUERY_HINT.reset();

						adaptor.addChild(root_1, stream_selectList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}

					else // 56:6: -> ^( TOK_SELECT ( QUERY_HINT )? ^( TOK_SELEXPR selectTrfmClause ) )
					{
						// SelectClauseParser.g:56:9: ^( TOK_SELECT ( QUERY_HINT )? ^( TOK_SELEXPR selectTrfmClause ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:56:22: ( QUERY_HINT )?
						if ( stream_QUERY_HINT.hasNext() ) {
							adaptor.addChild(root_1, stream_QUERY_HINT.nextNode());
						}
						stream_QUERY_HINT.reset();

						// SelectClauseParser.g:56:34: ^( TOK_SELEXPR selectTrfmClause )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_selectTrfmClause.nextTree());
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
					// SelectClauseParser.g:58:5: trfmClause
					{
					pushFollow(FOLLOW_trfmClause_in_selectClause196);
					trfmClause6=trfmClause();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_trfmClause.add(trfmClause6.getTree());
					// AST REWRITE
					// elements: trfmClause
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 58:17: -> ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
					{
						// SelectClauseParser.g:58:19: ^( TOK_SELECT ^( TOK_SELEXPR trfmClause ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT"), root_1);
						// SelectClauseParser.g:58:32: ^( TOK_SELEXPR trfmClause )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_2);
						adaptor.addChild(root_2, stream_trfmClause.nextTree());
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
	// $ANTLR end "selectClause"


	public static class selectList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectList"
	// SelectClauseParser.g:61:1: selectList : selectItem ( COMMA selectItem )* -> ( selectItem )+ ;
	public final HiveParser_SelectClauseParser.selectList_return selectList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectList_return retval = new HiveParser_SelectClauseParser.selectList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA8=null;
		ParserRuleReturnScope selectItem7 =null;
		ParserRuleReturnScope selectItem9 =null;

		ASTNode COMMA8_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectItem=new RewriteRuleSubtreeStream(adaptor,"rule selectItem");

		 gParent.pushMsg(retval.start,"select list", state); 
		try {
			// SelectClauseParser.g:64:5: ( selectItem ( COMMA selectItem )* -> ( selectItem )+ )
			// SelectClauseParser.g:65:5: selectItem ( COMMA selectItem )*
			{
			pushFollow(FOLLOW_selectItem_in_selectList239);
			selectItem7=selectItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectItem.add(selectItem7.getTree());
			// SelectClauseParser.g:65:16: ( COMMA selectItem )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					int LA5_18 = input.LA(2);
					if ( (LA5_18==CharSetName||(LA5_18 >= Identifier && LA5_18 <= KW_AFTER)||LA5_18==KW_ALLOC_FRACTION||LA5_18==KW_ANALYZE||(LA5_18 >= KW_ARCHIVE && LA5_18 <= KW_ARRAY)||(LA5_18 >= KW_ASC && LA5_18 <= KW_AST)||(LA5_18 >= KW_AUTOCOMMIT && LA5_18 <= KW_BEFORE)||(LA5_18 >= KW_BIGINT && LA5_18 <= KW_BOOLEAN)||(LA5_18 >= KW_BUCKET && LA5_18 <= KW_BUCKETS)||(LA5_18 >= KW_CACHE && LA5_18 <= KW_CHANGE)||(LA5_18 >= KW_CHECK && LA5_18 <= KW_COLLECTION)||(LA5_18 >= KW_COLUMNS && LA5_18 <= KW_COMMENT)||(LA5_18 >= KW_COMPACT && LA5_18 <= KW_CONCATENATE)||LA5_18==KW_CONTINUE||(LA5_18 >= KW_CURRENT_DATE && LA5_18 <= KW_CURRENT_TIMESTAMP)||LA5_18==KW_DATA||(LA5_18 >= KW_DATABASES && LA5_18 <= KW_DEBUG)||(LA5_18 >= KW_DEFAULT && LA5_18 <= KW_DEFINED)||(LA5_18 >= KW_DELIMITED && LA5_18 <= KW_DESC)||(LA5_18 >= KW_DETAIL && LA5_18 <= KW_DISABLE)||(LA5_18 >= KW_DISTRIBUTE && LA5_18 <= KW_DOW)||(LA5_18 >= KW_DUMP && LA5_18 <= KW_ELEM_TYPE)||LA5_18==KW_ENABLE||(LA5_18 >= KW_ENFORCED && LA5_18 <= KW_ESCAPED)||(LA5_18 >= KW_EXCLUSIVE && LA5_18 <= KW_EXPRESSION)||(LA5_18 >= KW_EXTRACT && LA5_18 <= KW_FALSE)||(LA5_18 >= KW_FIELDS && LA5_18 <= KW_FLOOR)||(LA5_18 >= KW_FORMAT && LA5_18 <= KW_FORMATTED)||LA5_18==KW_FUNCTIONS||(LA5_18 >= KW_GROUP && LA5_18 <= KW_GROUPING)||(LA5_18 >= KW_HOUR && LA5_18 <= KW_IF)||(LA5_18 >= KW_INDEX && LA5_18 <= KW_INDEXES)||(LA5_18 >= KW_INPATH && LA5_18 <= KW_INPUTFORMAT)||LA5_18==KW_INT||LA5_18==KW_INTERVAL||(LA5_18 >= KW_ISOLATION && LA5_18 <= KW_JAR)||(LA5_18 >= KW_KEY && LA5_18 <= KW_LAST)||LA5_18==KW_LEVEL||(LA5_18 >= KW_LIMIT && LA5_18 <= KW_LOAD)||(LA5_18 >= KW_LOCATION && LA5_18 <= KW_LONG)||(LA5_18 >= KW_MANAGEMENT && LA5_18 <= KW_MATERIALIZED)||LA5_18==KW_METADATA||(LA5_18 >= KW_MINUTE && LA5_18 <= KW_MONTH)||(LA5_18 >= KW_MOVE && LA5_18 <= KW_MSCK)||(LA5_18 >= KW_NORELY && LA5_18 <= KW_NULLS)||LA5_18==KW_OFFSET||(LA5_18 >= KW_OPERATOR && LA5_18 <= KW_OPTION)||LA5_18==KW_ORDER||(LA5_18 >= KW_OUTPUTDRIVER && LA5_18 <= KW_OUTPUTFORMAT)||(LA5_18 >= KW_OVERWRITE && LA5_18 <= KW_OWNER)||(LA5_18 >= KW_PARTITIONED && LA5_18 <= KW_PATH)||(LA5_18 >= KW_PLAN && LA5_18 <= KW_POOL)||LA5_18==KW_PRINCIPALS||(LA5_18 >= KW_PURGE && LA5_18 <= KW_QUERY_PARALLELISM)||LA5_18==KW_READ||(LA5_18 >= KW_REAL && LA5_18 <= KW_RECORDWRITER)||(LA5_18 >= KW_RELOAD && LA5_18 <= KW_RESTRICT)||LA5_18==KW_REWRITE||(LA5_18 >= KW_ROLE && LA5_18 <= KW_ROLES)||(LA5_18 >= KW_SCHEDULING_POLICY && LA5_18 <= KW_SECOND)||(LA5_18 >= KW_SEMI && LA5_18 <= KW_SERVER)||(LA5_18 >= KW_SETS && LA5_18 <= KW_SSL)||(LA5_18 >= KW_STATISTICS && LA5_18 <= KW_SUMMARY)||LA5_18==KW_TABLES||(LA5_18 >= KW_TBLPROPERTIES && LA5_18 <= KW_TERMINATED)||(LA5_18 >= KW_TIMESTAMP && LA5_18 <= KW_TINYINT)||(LA5_18 >= KW_TOUCH && LA5_18 <= KW_TRANSACTIONS)||LA5_18==KW_TRUE||LA5_18==KW_UNARCHIVE||LA5_18==KW_UNDO||LA5_18==KW_UNIONTYPE||(LA5_18 >= KW_UNKNOWN && LA5_18 <= KW_UNSIGNED)||(LA5_18 >= KW_URI && LA5_18 <= KW_USE)||(LA5_18 >= KW_UTC && LA5_18 <= KW_VALIDATE)||LA5_18==KW_VALUE_TYPE||(LA5_18 >= KW_VECTORIZATION && LA5_18 <= KW_WEEK)||LA5_18==KW_WHILE||(LA5_18 >= KW_WORK && LA5_18 <= KW_ZONE)||LA5_18==LPAREN||LA5_18==MINUS||(LA5_18 >= Number && LA5_18 <= PLUS)||(LA5_18 >= STAR && LA5_18 <= TILDE)||LA5_18==KW_BATCH||LA5_18==KW_DAYOFWEEK||LA5_18==KW_HOLD_DDLTIME||LA5_18==KW_IGNORE||LA5_18==KW_NO_DROP||LA5_18==KW_OFFLINE||LA5_18==KW_PROTECTION||LA5_18==KW_READONLY||LA5_18==KW_TIMESTAMPTZ) ) {
						alt5=1;
					}

				}

				switch (alt5) {
				case 1 :
					// SelectClauseParser.g:65:18: COMMA selectItem
					{
					COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectList243); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);

					pushFollow(FOLLOW_selectItem_in_selectList246);
					selectItem9=selectItem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectItem.add(selectItem9.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: selectItem
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 65:39: -> ( selectItem )+
			{
				if ( !(stream_selectItem.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectItem.hasNext() ) {
					adaptor.addChild(root_0, stream_selectItem.nextTree());
				}
				stream_selectItem.reset();

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
	// $ANTLR end "selectList"


	public static class selectTrfmClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectTrfmClause"
	// SelectClauseParser.g:68:1: selectTrfmClause : LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.selectTrfmClause_return selectTrfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.selectTrfmClause_return retval = new HiveParser_SelectClauseParser.selectTrfmClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN10=null;
		Token RPAREN12=null;
		Token KW_USING13=null;
		Token StringLiteral14=null;
		Token KW_AS15=null;
		Token LPAREN16=null;
		Token RPAREN19=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList11 =null;
		ParserRuleReturnScope aliasList17 =null;
		ParserRuleReturnScope columnNameTypeList18 =null;
		ParserRuleReturnScope aliasList20 =null;
		ParserRuleReturnScope columnNameTypeList21 =null;

		ASTNode LPAREN10_tree=null;
		ASTNode RPAREN12_tree=null;
		ASTNode KW_USING13_tree=null;
		ASTNode StringLiteral14_tree=null;
		ASTNode KW_AS15_tree=null;
		ASTNode LPAREN16_tree=null;
		ASTNode RPAREN19_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.pushMsg(retval.start,"transform clause", state); 
		try {
			// SelectClauseParser.g:71:5: ( LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:72:5: LPAREN selectExpressionList RPAREN inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			LPAREN10=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause285); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN10);

			pushFollow(FOLLOW_selectExpressionList_in_selectTrfmClause287);
			selectExpressionList11=selectExpressionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList11.getTree());
			RPAREN12=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause289); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN12);

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause297);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_selectTrfmClause301);
			inRec=gHiveParser.recordWriter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());
			KW_USING13=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_selectTrfmClause307); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING13);

			StringLiteral14=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_selectTrfmClause309); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral14);

			// SelectClauseParser.g:75:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KW_AS) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// SelectClauseParser.g:75:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS15=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectTrfmClause317); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS15);

					// SelectClauseParser.g:75:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0==LPAREN) ) {
						alt8=1;
					}
					else if ( (LA8_0==Identifier||(LA8_0 >= KW_ABORT && LA8_0 <= KW_AFTER)||LA8_0==KW_ALLOC_FRACTION||LA8_0==KW_ANALYZE||LA8_0==KW_ARCHIVE||(LA8_0 >= KW_ASC && LA8_0 <= KW_AST)||(LA8_0 >= KW_AUTOCOMMIT && LA8_0 <= KW_BEFORE)||(LA8_0 >= KW_BUCKET && LA8_0 <= KW_BUCKETS)||(LA8_0 >= KW_CACHE && LA8_0 <= KW_CASCADE)||LA8_0==KW_CHANGE||(LA8_0 >= KW_CHECK && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_COMMENT)||(LA8_0 >= KW_COMPACT && LA8_0 <= KW_CONCATENATE)||LA8_0==KW_CONTINUE||LA8_0==KW_DATA||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DEBUG)||(LA8_0 >= KW_DEFAULT && LA8_0 <= KW_DEFINED)||(LA8_0 >= KW_DELIMITED && LA8_0 <= KW_DESC)||(LA8_0 >= KW_DETAIL && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_DO)||LA8_0==KW_DOW||(LA8_0 >= KW_DUMP && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||(LA8_0 >= KW_ENFORCED && LA8_0 <= KW_ESCAPED)||LA8_0==KW_EXCLUSIVE||(LA8_0 >= KW_EXPLAIN && LA8_0 <= KW_EXPRESSION)||(LA8_0 >= KW_FIELDS && LA8_0 <= KW_FIRST)||(LA8_0 >= KW_FORMAT && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FUNCTIONS||LA8_0==KW_GROUP||(LA8_0 >= KW_HOUR && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_INDEX && LA8_0 <= KW_INDEXES)||(LA8_0 >= KW_INPATH && LA8_0 <= KW_INPUTFORMAT)||(LA8_0 >= KW_ISOLATION && LA8_0 <= KW_JAR)||(LA8_0 >= KW_KEY && LA8_0 <= KW_LAST)||LA8_0==KW_LEVEL||(LA8_0 >= KW_LIMIT && LA8_0 <= KW_LOAD)||(LA8_0 >= KW_LOCATION && LA8_0 <= KW_LONG)||LA8_0==KW_MANAGEMENT||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MATERIALIZED)||LA8_0==KW_METADATA||(LA8_0 >= KW_MINUTE && LA8_0 <= KW_MONTH)||(LA8_0 >= KW_MOVE && LA8_0 <= KW_MSCK)||(LA8_0 >= KW_NORELY && LA8_0 <= KW_NOSCAN)||LA8_0==KW_NOVALIDATE||LA8_0==KW_NULLS||LA8_0==KW_OFFSET||(LA8_0 >= KW_OPERATOR && LA8_0 <= KW_OPTION)||LA8_0==KW_ORDER||(LA8_0 >= KW_OUTPUTDRIVER && LA8_0 <= KW_OUTPUTFORMAT)||(LA8_0 >= KW_OVERWRITE && LA8_0 <= KW_OWNER)||(LA8_0 >= KW_PARTITIONED && LA8_0 <= KW_PATH)||(LA8_0 >= KW_PLAN && LA8_0 <= KW_POOL)||LA8_0==KW_PRINCIPALS||(LA8_0 >= KW_PURGE && LA8_0 <= KW_QUERY_PARALLELISM)||LA8_0==KW_READ||(LA8_0 >= KW_REBUILD && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_RELOAD && LA8_0 <= KW_RESTRICT)||LA8_0==KW_REWRITE||(LA8_0 >= KW_ROLE && LA8_0 <= KW_ROLES)||(LA8_0 >= KW_SCHEDULING_POLICY && LA8_0 <= KW_SECOND)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_SERVER)||(LA8_0 >= KW_SETS && LA8_0 <= KW_SKEWED)||(LA8_0 >= KW_SNAPSHOT && LA8_0 <= KW_SSL)||(LA8_0 >= KW_STATISTICS && LA8_0 <= KW_SUMMARY)||LA8_0==KW_TABLES||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TERMINATED)||LA8_0==KW_TINYINT||(LA8_0 >= KW_TOUCH && LA8_0 <= KW_TRANSACTIONS)||LA8_0==KW_UNARCHIVE||LA8_0==KW_UNDO||LA8_0==KW_UNIONTYPE||(LA8_0 >= KW_UNKNOWN && LA8_0 <= KW_UNSIGNED)||(LA8_0 >= KW_URI && LA8_0 <= KW_USE)||(LA8_0 >= KW_UTC && LA8_0 <= KW_VALIDATE)||LA8_0==KW_VALUE_TYPE||(LA8_0 >= KW_VECTORIZATION && LA8_0 <= KW_WEEK)||LA8_0==KW_WHILE||(LA8_0 >= KW_WORK && LA8_0 <= KW_ZONE)||LA8_0==KW_BATCH||LA8_0==KW_DAYOFWEEK||LA8_0==KW_HOLD_DDLTIME||LA8_0==KW_IGNORE||LA8_0==KW_NO_DROP||LA8_0==KW_OFFLINE||LA8_0==KW_PROTECTION||LA8_0==KW_READONLY||LA8_0==KW_TIMESTAMPTZ) ) {
						alt8=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 8, 0, input);
						throw nvae;
					}

					switch (alt8) {
						case 1 :
							// SelectClauseParser.g:75:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:75:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:75:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN16=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectTrfmClause321); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN16);

							// SelectClauseParser.g:75:22: ( aliasList | columnNameTypeList )
							int alt6=2;
							int LA6_0 = input.LA(1);
							if ( (LA6_0==Identifier) ) {
								int LA6_1 = input.LA(2);
								if ( (LA6_1==COMMA||LA6_1==RPAREN) ) {
									alt6=1;
								}
								else if ( (LA6_1==KW_ARRAY||(LA6_1 >= KW_BIGINT && LA6_1 <= KW_BOOLEAN)||LA6_1==KW_CHAR||(LA6_1 >= KW_DATE && LA6_1 <= KW_DATETIME)||LA6_1==KW_DECIMAL||LA6_1==KW_DOUBLE||LA6_1==KW_FLOAT||LA6_1==KW_INT||LA6_1==KW_MAP||LA6_1==KW_REAL||LA6_1==KW_SMALLINT||(LA6_1 >= KW_STRING && LA6_1 <= KW_STRUCT)||(LA6_1 >= KW_TIMESTAMP && LA6_1 <= KW_TINYINT)||LA6_1==KW_UNIONTYPE||LA6_1==KW_VARCHAR) ) {
									alt6=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
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
							else if ( ((LA6_0 >= KW_ABORT && LA6_0 <= KW_AFTER)||LA6_0==KW_ALLOC_FRACTION||LA6_0==KW_ANALYZE||LA6_0==KW_ARCHIVE||(LA6_0 >= KW_ASC && LA6_0 <= KW_AST)||(LA6_0 >= KW_AUTOCOMMIT && LA6_0 <= KW_BEFORE)||(LA6_0 >= KW_BUCKET && LA6_0 <= KW_BUCKETS)||(LA6_0 >= KW_CACHE && LA6_0 <= KW_CASCADE)||LA6_0==KW_CHANGE||(LA6_0 >= KW_CHECK && LA6_0 <= KW_COLLECTION)||(LA6_0 >= KW_COLUMNS && LA6_0 <= KW_COMMENT)||(LA6_0 >= KW_COMPACT && LA6_0 <= KW_CONCATENATE)||LA6_0==KW_CONTINUE||LA6_0==KW_DATA||(LA6_0 >= KW_DATABASES && LA6_0 <= KW_DEBUG)||(LA6_0 >= KW_DEFAULT && LA6_0 <= KW_DEFINED)||(LA6_0 >= KW_DELIMITED && LA6_0 <= KW_DESC)||(LA6_0 >= KW_DETAIL && LA6_0 <= KW_DISABLE)||(LA6_0 >= KW_DISTRIBUTE && LA6_0 <= KW_DO)||LA6_0==KW_DOW||(LA6_0 >= KW_DUMP && LA6_0 <= KW_ELEM_TYPE)||LA6_0==KW_ENABLE||(LA6_0 >= KW_ENFORCED && LA6_0 <= KW_ESCAPED)||LA6_0==KW_EXCLUSIVE||(LA6_0 >= KW_EXPLAIN && LA6_0 <= KW_EXPRESSION)||(LA6_0 >= KW_FIELDS && LA6_0 <= KW_FIRST)||(LA6_0 >= KW_FORMAT && LA6_0 <= KW_FORMATTED)||LA6_0==KW_FUNCTIONS||LA6_0==KW_GROUP||(LA6_0 >= KW_HOUR && LA6_0 <= KW_IDXPROPERTIES)||(LA6_0 >= KW_INDEX && LA6_0 <= KW_INDEXES)||(LA6_0 >= KW_INPATH && LA6_0 <= KW_INPUTFORMAT)||(LA6_0 >= KW_ISOLATION && LA6_0 <= KW_JAR)||(LA6_0 >= KW_KEY && LA6_0 <= KW_LAST)||LA6_0==KW_LEVEL||(LA6_0 >= KW_LIMIT && LA6_0 <= KW_LOAD)||(LA6_0 >= KW_LOCATION && LA6_0 <= KW_LONG)||LA6_0==KW_MANAGEMENT||(LA6_0 >= KW_MAPJOIN && LA6_0 <= KW_MATERIALIZED)||LA6_0==KW_METADATA||(LA6_0 >= KW_MINUTE && LA6_0 <= KW_MONTH)||(LA6_0 >= KW_MOVE && LA6_0 <= KW_MSCK)||(LA6_0 >= KW_NORELY && LA6_0 <= KW_NOSCAN)||LA6_0==KW_NOVALIDATE||LA6_0==KW_NULLS||LA6_0==KW_OFFSET||(LA6_0 >= KW_OPERATOR && LA6_0 <= KW_OPTION)||LA6_0==KW_ORDER||(LA6_0 >= KW_OUTPUTDRIVER && LA6_0 <= KW_OUTPUTFORMAT)||(LA6_0 >= KW_OVERWRITE && LA6_0 <= KW_OWNER)||(LA6_0 >= KW_PARTITIONED && LA6_0 <= KW_PATH)||(LA6_0 >= KW_PLAN && LA6_0 <= KW_POOL)||LA6_0==KW_PRINCIPALS||(LA6_0 >= KW_PURGE && LA6_0 <= KW_QUERY_PARALLELISM)||LA6_0==KW_READ||(LA6_0 >= KW_REBUILD && LA6_0 <= KW_RECORDWRITER)||(LA6_0 >= KW_RELOAD && LA6_0 <= KW_RESTRICT)||LA6_0==KW_REWRITE||(LA6_0 >= KW_ROLE && LA6_0 <= KW_ROLES)||(LA6_0 >= KW_SCHEDULING_POLICY && LA6_0 <= KW_SECOND)||(LA6_0 >= KW_SEMI && LA6_0 <= KW_SERVER)||(LA6_0 >= KW_SETS && LA6_0 <= KW_SKEWED)||(LA6_0 >= KW_SNAPSHOT && LA6_0 <= KW_SSL)||(LA6_0 >= KW_STATISTICS && LA6_0 <= KW_SUMMARY)||LA6_0==KW_TABLES||(LA6_0 >= KW_TBLPROPERTIES && LA6_0 <= KW_TERMINATED)||LA6_0==KW_TINYINT||(LA6_0 >= KW_TOUCH && LA6_0 <= KW_TRANSACTIONS)||LA6_0==KW_UNARCHIVE||LA6_0==KW_UNDO||LA6_0==KW_UNIONTYPE||(LA6_0 >= KW_UNKNOWN && LA6_0 <= KW_UNSIGNED)||(LA6_0 >= KW_URI && LA6_0 <= KW_USE)||(LA6_0 >= KW_UTC && LA6_0 <= KW_VALIDATE)||LA6_0==KW_VALUE_TYPE||(LA6_0 >= KW_VECTORIZATION && LA6_0 <= KW_WEEK)||LA6_0==KW_WHILE||(LA6_0 >= KW_WORK && LA6_0 <= KW_ZONE)||LA6_0==KW_BATCH||LA6_0==KW_DAYOFWEEK||LA6_0==KW_HOLD_DDLTIME||LA6_0==KW_IGNORE||LA6_0==KW_NO_DROP||LA6_0==KW_OFFLINE||LA6_0==KW_PROTECTION||LA6_0==KW_READONLY||LA6_0==KW_TIMESTAMPTZ) ) {
								int LA6_2 = input.LA(2);
								if ( (LA6_2==COMMA||LA6_2==RPAREN) ) {
									alt6=1;
								}
								else if ( (LA6_2==KW_ARRAY||(LA6_2 >= KW_BIGINT && LA6_2 <= KW_BOOLEAN)||LA6_2==KW_CHAR||(LA6_2 >= KW_DATE && LA6_2 <= KW_DATETIME)||LA6_2==KW_DECIMAL||LA6_2==KW_DOUBLE||LA6_2==KW_FLOAT||LA6_2==KW_INT||LA6_2==KW_MAP||LA6_2==KW_REAL||LA6_2==KW_SMALLINT||(LA6_2 >= KW_STRING && LA6_2 <= KW_STRUCT)||(LA6_2 >= KW_TIMESTAMP && LA6_2 <= KW_TINYINT)||LA6_2==KW_UNIONTYPE||LA6_2==KW_VARCHAR) ) {
									alt6=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 6, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 0, input);
								throw nvae;
							}

							switch (alt6) {
								case 1 :
									// SelectClauseParser.g:75:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause324);
									aliasList17=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList17.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:75:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause328);
									columnNameTypeList18=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList18.getTree());
									}
									break;

							}

							RPAREN19=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectTrfmClause331); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN19);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:75:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:75:65: ( aliasList | columnNameTypeList )
							int alt7=2;
							alt7 = dfa7.predict(input);
							switch (alt7) {
								case 1 :
									// SelectClauseParser.g:75:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_selectTrfmClause337);
									aliasList20=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList20.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:75:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_selectTrfmClause341);
									columnNameTypeList21=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList21.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_selectTrfmClause353);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_selectTrfmClause357);
			outRec=gHiveParser.recordReader();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: inSerde, inRec, outRec, StringLiteral, outSerde, aliasList, selectExpressionList, columnNameTypeList
			// token labels: 
			// rule labels: inRec, outRec, inSerde, outSerde, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 77:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:77:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:77:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:77:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

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
	// $ANTLR end "selectTrfmClause"


	public static class selectItem_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectItem"
	// SelectClauseParser.g:80:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );
	public final HiveParser_SelectClauseParser.selectItem_return selectItem() throws RecognitionException {
		HiveParser_SelectClauseParser.selectItem_return retval = new HiveParser_SelectClauseParser.selectItem_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AS24=null;
		Token KW_AS26=null;
		Token LPAREN27=null;
		Token COMMA29=null;
		Token RPAREN31=null;
		ParserRuleReturnScope tableAllColumns22 =null;
		ParserRuleReturnScope expression23 =null;
		ParserRuleReturnScope identifier25 =null;
		ParserRuleReturnScope identifier28 =null;
		ParserRuleReturnScope identifier30 =null;

		ASTNode KW_AS24_tree=null;
		ASTNode KW_AS26_tree=null;
		ASTNode LPAREN27_tree=null;
		ASTNode COMMA29_tree=null;
		ASTNode RPAREN31_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
		RewriteRuleSubtreeStream stream_tableAllColumns=new RewriteRuleSubtreeStream(adaptor,"rule tableAllColumns");

		 gParent.pushMsg(retval.start,"selection target", state); 
		try {
			// SelectClauseParser.g:83:5: ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) )
			int alt13=2;
			alt13 = dfa13.predict(input);
			switch (alt13) {
				case 1 :
					// SelectClauseParser.g:84:5: ( tableAllColumns )=> tableAllColumns
					{
					pushFollow(FOLLOW_tableAllColumns_in_selectItem426);
					tableAllColumns22=gHiveParser.tableAllColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_tableAllColumns.add(tableAllColumns22.getTree());
					// AST REWRITE
					// elements: tableAllColumns
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 84:42: -> ^( TOK_SELEXPR tableAllColumns )
					{
						// SelectClauseParser.g:84:45: ^( TOK_SELEXPR tableAllColumns )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
						adaptor.addChild(root_1, stream_tableAllColumns.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:86:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
					{
					// SelectClauseParser.g:86:5: ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? )
					// SelectClauseParser.g:86:7: expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
					{
					pushFollow(FOLLOW_expression_in_selectItem448);
					expression23=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_expression.add(expression23.getTree());
					// SelectClauseParser.g:87:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?
					int alt12=3;
					alt12 = dfa12.predict(input);
					switch (alt12) {
						case 1 :
							// SelectClauseParser.g:87:8: ( ( KW_AS )? identifier )
							{
							// SelectClauseParser.g:87:8: ( ( KW_AS )? identifier )
							// SelectClauseParser.g:87:9: ( KW_AS )? identifier
							{
							// SelectClauseParser.g:87:9: ( KW_AS )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==KW_AS) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// SelectClauseParser.g:87:9: KW_AS
									{
									KW_AS24=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem458); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS24);

									}
									break;

							}

							pushFollow(FOLLOW_identifier_in_selectItem461);
							identifier25=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier25.getTree());
							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:87:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
							{
							// SelectClauseParser.g:87:30: ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN )
							// SelectClauseParser.g:87:31: KW_AS LPAREN identifier ( COMMA identifier )* RPAREN
							{
							KW_AS26=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_selectItem467); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS26);

							LPAREN27=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_selectItem469); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN27);

							pushFollow(FOLLOW_identifier_in_selectItem471);
							identifier28=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier28.getTree());
							// SelectClauseParser.g:87:55: ( COMMA identifier )*
							loop11:
							while (true) {
								int alt11=2;
								int LA11_0 = input.LA(1);
								if ( (LA11_0==COMMA) ) {
									alt11=1;
								}

								switch (alt11) {
								case 1 :
									// SelectClauseParser.g:87:56: COMMA identifier
									{
									COMMA29=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectItem474); if (state.failed) return retval; 
									if ( state.backtracking==0 ) stream_COMMA.add(COMMA29);

									pushFollow(FOLLOW_identifier_in_selectItem476);
									identifier30=gHiveParser.identifier();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_identifier.add(identifier30.getTree());
									}
									break;

								default :
									break loop11;
								}
							}

							RPAREN31=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_selectItem480); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN31);

							}

							}
							break;

					}

					}

					// AST REWRITE
					// elements: identifier, expression
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 88:7: -> ^( TOK_SELEXPR expression ( identifier )* )
					{
						// SelectClauseParser.g:88:10: ^( TOK_SELEXPR expression ( identifier )* )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR"), root_1);
						adaptor.addChild(root_1, stream_expression.nextTree());
						// SelectClauseParser.g:88:35: ( identifier )*
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
	// $ANTLR end "selectItem"


	public static class trfmClause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "trfmClause"
	// SelectClauseParser.g:91:1: trfmClause : ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) ;
	public final HiveParser_SelectClauseParser.trfmClause_return trfmClause() throws RecognitionException {
		HiveParser_SelectClauseParser.trfmClause_return retval = new HiveParser_SelectClauseParser.trfmClause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_MAP32=null;
		Token KW_REDUCE34=null;
		Token KW_USING36=null;
		Token StringLiteral37=null;
		Token KW_AS38=null;
		Token LPAREN39=null;
		Token RPAREN42=null;
		ParserRuleReturnScope inSerde =null;
		ParserRuleReturnScope inRec =null;
		ParserRuleReturnScope outSerde =null;
		ParserRuleReturnScope outRec =null;
		ParserRuleReturnScope selectExpressionList33 =null;
		ParserRuleReturnScope selectExpressionList35 =null;
		ParserRuleReturnScope aliasList40 =null;
		ParserRuleReturnScope columnNameTypeList41 =null;
		ParserRuleReturnScope aliasList43 =null;
		ParserRuleReturnScope columnNameTypeList44 =null;

		ASTNode KW_MAP32_tree=null;
		ASTNode KW_REDUCE34_tree=null;
		ASTNode KW_USING36_tree=null;
		ASTNode StringLiteral37_tree=null;
		ASTNode KW_AS38_tree=null;
		ASTNode LPAREN39_tree=null;
		ASTNode RPAREN42_tree=null;
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_REDUCE=new RewriteRuleTokenStream(adaptor,"token KW_REDUCE");
		RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
		RewriteRuleTokenStream stream_KW_MAP=new RewriteRuleTokenStream(adaptor,"token KW_MAP");
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_aliasList=new RewriteRuleSubtreeStream(adaptor,"rule aliasList");
		RewriteRuleSubtreeStream stream_rowFormat=new RewriteRuleSubtreeStream(adaptor,"rule rowFormat");
		RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
		RewriteRuleSubtreeStream stream_recordReader=new RewriteRuleSubtreeStream(adaptor,"rule recordReader");
		RewriteRuleSubtreeStream stream_selectExpressionList=new RewriteRuleSubtreeStream(adaptor,"rule selectExpressionList");
		RewriteRuleSubtreeStream stream_recordWriter=new RewriteRuleSubtreeStream(adaptor,"rule recordWriter");

		 gParent.pushMsg(retval.start,"transform clause", state); 
		try {
			// SelectClauseParser.g:94:5: ( ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? ) )
			// SelectClauseParser.g:95:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList ) inSerde= rowFormat inRec= recordWriter KW_USING StringLiteral ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )? outSerde= rowFormat outRec= recordReader
			{
			// SelectClauseParser.g:95:5: ( KW_MAP selectExpressionList | KW_REDUCE selectExpressionList )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==KW_MAP) ) {
				alt14=1;
			}
			else if ( (LA14_0==KW_REDUCE) ) {
				alt14=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// SelectClauseParser.g:95:9: KW_MAP selectExpressionList
					{
					KW_MAP32=(Token)match(input,KW_MAP,FOLLOW_KW_MAP_in_trfmClause535); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_MAP.add(KW_MAP32);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause540);
					selectExpressionList33=selectExpressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList33.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:96:9: KW_REDUCE selectExpressionList
					{
					KW_REDUCE34=(Token)match(input,KW_REDUCE,FOLLOW_KW_REDUCE_in_trfmClause550); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_REDUCE.add(KW_REDUCE34);

					pushFollow(FOLLOW_selectExpressionList_in_trfmClause552);
					selectExpressionList35=selectExpressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpressionList.add(selectExpressionList35.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause562);
			inSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(inSerde.getTree());
			pushFollow(FOLLOW_recordWriter_in_trfmClause566);
			inRec=gHiveParser.recordWriter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordWriter.add(inRec.getTree());
			KW_USING36=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_trfmClause572); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_USING.add(KW_USING36);

			StringLiteral37=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_trfmClause574); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral37);

			// SelectClauseParser.g:99:5: ( KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) ) )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==KW_AS) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// SelectClauseParser.g:99:7: KW_AS ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					{
					KW_AS38=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_trfmClause582); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS38);

					// SelectClauseParser.g:99:13: ( ( LPAREN ( aliasList | columnNameTypeList ) RPAREN ) | ( aliasList | columnNameTypeList ) )
					int alt17=2;
					int LA17_0 = input.LA(1);
					if ( (LA17_0==LPAREN) ) {
						alt17=1;
					}
					else if ( (LA17_0==Identifier||(LA17_0 >= KW_ABORT && LA17_0 <= KW_AFTER)||LA17_0==KW_ALLOC_FRACTION||LA17_0==KW_ANALYZE||LA17_0==KW_ARCHIVE||(LA17_0 >= KW_ASC && LA17_0 <= KW_AST)||(LA17_0 >= KW_AUTOCOMMIT && LA17_0 <= KW_BEFORE)||(LA17_0 >= KW_BUCKET && LA17_0 <= KW_BUCKETS)||(LA17_0 >= KW_CACHE && LA17_0 <= KW_CASCADE)||LA17_0==KW_CHANGE||(LA17_0 >= KW_CHECK && LA17_0 <= KW_COLLECTION)||(LA17_0 >= KW_COLUMNS && LA17_0 <= KW_COMMENT)||(LA17_0 >= KW_COMPACT && LA17_0 <= KW_CONCATENATE)||LA17_0==KW_CONTINUE||LA17_0==KW_DATA||(LA17_0 >= KW_DATABASES && LA17_0 <= KW_DEBUG)||(LA17_0 >= KW_DEFAULT && LA17_0 <= KW_DEFINED)||(LA17_0 >= KW_DELIMITED && LA17_0 <= KW_DESC)||(LA17_0 >= KW_DETAIL && LA17_0 <= KW_DISABLE)||(LA17_0 >= KW_DISTRIBUTE && LA17_0 <= KW_DO)||LA17_0==KW_DOW||(LA17_0 >= KW_DUMP && LA17_0 <= KW_ELEM_TYPE)||LA17_0==KW_ENABLE||(LA17_0 >= KW_ENFORCED && LA17_0 <= KW_ESCAPED)||LA17_0==KW_EXCLUSIVE||(LA17_0 >= KW_EXPLAIN && LA17_0 <= KW_EXPRESSION)||(LA17_0 >= KW_FIELDS && LA17_0 <= KW_FIRST)||(LA17_0 >= KW_FORMAT && LA17_0 <= KW_FORMATTED)||LA17_0==KW_FUNCTIONS||LA17_0==KW_GROUP||(LA17_0 >= KW_HOUR && LA17_0 <= KW_IDXPROPERTIES)||(LA17_0 >= KW_INDEX && LA17_0 <= KW_INDEXES)||(LA17_0 >= KW_INPATH && LA17_0 <= KW_INPUTFORMAT)||(LA17_0 >= KW_ISOLATION && LA17_0 <= KW_JAR)||(LA17_0 >= KW_KEY && LA17_0 <= KW_LAST)||LA17_0==KW_LEVEL||(LA17_0 >= KW_LIMIT && LA17_0 <= KW_LOAD)||(LA17_0 >= KW_LOCATION && LA17_0 <= KW_LONG)||LA17_0==KW_MANAGEMENT||(LA17_0 >= KW_MAPJOIN && LA17_0 <= KW_MATERIALIZED)||LA17_0==KW_METADATA||(LA17_0 >= KW_MINUTE && LA17_0 <= KW_MONTH)||(LA17_0 >= KW_MOVE && LA17_0 <= KW_MSCK)||(LA17_0 >= KW_NORELY && LA17_0 <= KW_NOSCAN)||LA17_0==KW_NOVALIDATE||LA17_0==KW_NULLS||LA17_0==KW_OFFSET||(LA17_0 >= KW_OPERATOR && LA17_0 <= KW_OPTION)||LA17_0==KW_ORDER||(LA17_0 >= KW_OUTPUTDRIVER && LA17_0 <= KW_OUTPUTFORMAT)||(LA17_0 >= KW_OVERWRITE && LA17_0 <= KW_OWNER)||(LA17_0 >= KW_PARTITIONED && LA17_0 <= KW_PATH)||(LA17_0 >= KW_PLAN && LA17_0 <= KW_POOL)||LA17_0==KW_PRINCIPALS||(LA17_0 >= KW_PURGE && LA17_0 <= KW_QUERY_PARALLELISM)||LA17_0==KW_READ||(LA17_0 >= KW_REBUILD && LA17_0 <= KW_RECORDWRITER)||(LA17_0 >= KW_RELOAD && LA17_0 <= KW_RESTRICT)||LA17_0==KW_REWRITE||(LA17_0 >= KW_ROLE && LA17_0 <= KW_ROLES)||(LA17_0 >= KW_SCHEDULING_POLICY && LA17_0 <= KW_SECOND)||(LA17_0 >= KW_SEMI && LA17_0 <= KW_SERVER)||(LA17_0 >= KW_SETS && LA17_0 <= KW_SKEWED)||(LA17_0 >= KW_SNAPSHOT && LA17_0 <= KW_SSL)||(LA17_0 >= KW_STATISTICS && LA17_0 <= KW_SUMMARY)||LA17_0==KW_TABLES||(LA17_0 >= KW_TBLPROPERTIES && LA17_0 <= KW_TERMINATED)||LA17_0==KW_TINYINT||(LA17_0 >= KW_TOUCH && LA17_0 <= KW_TRANSACTIONS)||LA17_0==KW_UNARCHIVE||LA17_0==KW_UNDO||LA17_0==KW_UNIONTYPE||(LA17_0 >= KW_UNKNOWN && LA17_0 <= KW_UNSIGNED)||(LA17_0 >= KW_URI && LA17_0 <= KW_USE)||(LA17_0 >= KW_UTC && LA17_0 <= KW_VALIDATE)||LA17_0==KW_VALUE_TYPE||(LA17_0 >= KW_VECTORIZATION && LA17_0 <= KW_WEEK)||LA17_0==KW_WHILE||(LA17_0 >= KW_WORK && LA17_0 <= KW_ZONE)||LA17_0==KW_BATCH||LA17_0==KW_DAYOFWEEK||LA17_0==KW_HOLD_DDLTIME||LA17_0==KW_IGNORE||LA17_0==KW_NO_DROP||LA17_0==KW_OFFLINE||LA17_0==KW_PROTECTION||LA17_0==KW_READONLY||LA17_0==KW_TIMESTAMPTZ) ) {
						alt17=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 17, 0, input);
						throw nvae;
					}

					switch (alt17) {
						case 1 :
							// SelectClauseParser.g:99:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							{
							// SelectClauseParser.g:99:14: ( LPAREN ( aliasList | columnNameTypeList ) RPAREN )
							// SelectClauseParser.g:99:15: LPAREN ( aliasList | columnNameTypeList ) RPAREN
							{
							LPAREN39=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_trfmClause586); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN39);

							// SelectClauseParser.g:99:22: ( aliasList | columnNameTypeList )
							int alt15=2;
							int LA15_0 = input.LA(1);
							if ( (LA15_0==Identifier) ) {
								int LA15_1 = input.LA(2);
								if ( (LA15_1==COMMA||LA15_1==RPAREN) ) {
									alt15=1;
								}
								else if ( (LA15_1==KW_ARRAY||(LA15_1 >= KW_BIGINT && LA15_1 <= KW_BOOLEAN)||LA15_1==KW_CHAR||(LA15_1 >= KW_DATE && LA15_1 <= KW_DATETIME)||LA15_1==KW_DECIMAL||LA15_1==KW_DOUBLE||LA15_1==KW_FLOAT||LA15_1==KW_INT||LA15_1==KW_MAP||LA15_1==KW_REAL||LA15_1==KW_SMALLINT||(LA15_1 >= KW_STRING && LA15_1 <= KW_STRUCT)||(LA15_1 >= KW_TIMESTAMP && LA15_1 <= KW_TINYINT)||LA15_1==KW_UNIONTYPE||LA15_1==KW_VARCHAR) ) {
									alt15=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 15, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}
							else if ( ((LA15_0 >= KW_ABORT && LA15_0 <= KW_AFTER)||LA15_0==KW_ALLOC_FRACTION||LA15_0==KW_ANALYZE||LA15_0==KW_ARCHIVE||(LA15_0 >= KW_ASC && LA15_0 <= KW_AST)||(LA15_0 >= KW_AUTOCOMMIT && LA15_0 <= KW_BEFORE)||(LA15_0 >= KW_BUCKET && LA15_0 <= KW_BUCKETS)||(LA15_0 >= KW_CACHE && LA15_0 <= KW_CASCADE)||LA15_0==KW_CHANGE||(LA15_0 >= KW_CHECK && LA15_0 <= KW_COLLECTION)||(LA15_0 >= KW_COLUMNS && LA15_0 <= KW_COMMENT)||(LA15_0 >= KW_COMPACT && LA15_0 <= KW_CONCATENATE)||LA15_0==KW_CONTINUE||LA15_0==KW_DATA||(LA15_0 >= KW_DATABASES && LA15_0 <= KW_DEBUG)||(LA15_0 >= KW_DEFAULT && LA15_0 <= KW_DEFINED)||(LA15_0 >= KW_DELIMITED && LA15_0 <= KW_DESC)||(LA15_0 >= KW_DETAIL && LA15_0 <= KW_DISABLE)||(LA15_0 >= KW_DISTRIBUTE && LA15_0 <= KW_DO)||LA15_0==KW_DOW||(LA15_0 >= KW_DUMP && LA15_0 <= KW_ELEM_TYPE)||LA15_0==KW_ENABLE||(LA15_0 >= KW_ENFORCED && LA15_0 <= KW_ESCAPED)||LA15_0==KW_EXCLUSIVE||(LA15_0 >= KW_EXPLAIN && LA15_0 <= KW_EXPRESSION)||(LA15_0 >= KW_FIELDS && LA15_0 <= KW_FIRST)||(LA15_0 >= KW_FORMAT && LA15_0 <= KW_FORMATTED)||LA15_0==KW_FUNCTIONS||LA15_0==KW_GROUP||(LA15_0 >= KW_HOUR && LA15_0 <= KW_IDXPROPERTIES)||(LA15_0 >= KW_INDEX && LA15_0 <= KW_INDEXES)||(LA15_0 >= KW_INPATH && LA15_0 <= KW_INPUTFORMAT)||(LA15_0 >= KW_ISOLATION && LA15_0 <= KW_JAR)||(LA15_0 >= KW_KEY && LA15_0 <= KW_LAST)||LA15_0==KW_LEVEL||(LA15_0 >= KW_LIMIT && LA15_0 <= KW_LOAD)||(LA15_0 >= KW_LOCATION && LA15_0 <= KW_LONG)||LA15_0==KW_MANAGEMENT||(LA15_0 >= KW_MAPJOIN && LA15_0 <= KW_MATERIALIZED)||LA15_0==KW_METADATA||(LA15_0 >= KW_MINUTE && LA15_0 <= KW_MONTH)||(LA15_0 >= KW_MOVE && LA15_0 <= KW_MSCK)||(LA15_0 >= KW_NORELY && LA15_0 <= KW_NOSCAN)||LA15_0==KW_NOVALIDATE||LA15_0==KW_NULLS||LA15_0==KW_OFFSET||(LA15_0 >= KW_OPERATOR && LA15_0 <= KW_OPTION)||LA15_0==KW_ORDER||(LA15_0 >= KW_OUTPUTDRIVER && LA15_0 <= KW_OUTPUTFORMAT)||(LA15_0 >= KW_OVERWRITE && LA15_0 <= KW_OWNER)||(LA15_0 >= KW_PARTITIONED && LA15_0 <= KW_PATH)||(LA15_0 >= KW_PLAN && LA15_0 <= KW_POOL)||LA15_0==KW_PRINCIPALS||(LA15_0 >= KW_PURGE && LA15_0 <= KW_QUERY_PARALLELISM)||LA15_0==KW_READ||(LA15_0 >= KW_REBUILD && LA15_0 <= KW_RECORDWRITER)||(LA15_0 >= KW_RELOAD && LA15_0 <= KW_RESTRICT)||LA15_0==KW_REWRITE||(LA15_0 >= KW_ROLE && LA15_0 <= KW_ROLES)||(LA15_0 >= KW_SCHEDULING_POLICY && LA15_0 <= KW_SECOND)||(LA15_0 >= KW_SEMI && LA15_0 <= KW_SERVER)||(LA15_0 >= KW_SETS && LA15_0 <= KW_SKEWED)||(LA15_0 >= KW_SNAPSHOT && LA15_0 <= KW_SSL)||(LA15_0 >= KW_STATISTICS && LA15_0 <= KW_SUMMARY)||LA15_0==KW_TABLES||(LA15_0 >= KW_TBLPROPERTIES && LA15_0 <= KW_TERMINATED)||LA15_0==KW_TINYINT||(LA15_0 >= KW_TOUCH && LA15_0 <= KW_TRANSACTIONS)||LA15_0==KW_UNARCHIVE||LA15_0==KW_UNDO||LA15_0==KW_UNIONTYPE||(LA15_0 >= KW_UNKNOWN && LA15_0 <= KW_UNSIGNED)||(LA15_0 >= KW_URI && LA15_0 <= KW_USE)||(LA15_0 >= KW_UTC && LA15_0 <= KW_VALIDATE)||LA15_0==KW_VALUE_TYPE||(LA15_0 >= KW_VECTORIZATION && LA15_0 <= KW_WEEK)||LA15_0==KW_WHILE||(LA15_0 >= KW_WORK && LA15_0 <= KW_ZONE)||LA15_0==KW_BATCH||LA15_0==KW_DAYOFWEEK||LA15_0==KW_HOLD_DDLTIME||LA15_0==KW_IGNORE||LA15_0==KW_NO_DROP||LA15_0==KW_OFFLINE||LA15_0==KW_PROTECTION||LA15_0==KW_READONLY||LA15_0==KW_TIMESTAMPTZ) ) {
								int LA15_2 = input.LA(2);
								if ( (LA15_2==COMMA||LA15_2==RPAREN) ) {
									alt15=1;
								}
								else if ( (LA15_2==KW_ARRAY||(LA15_2 >= KW_BIGINT && LA15_2 <= KW_BOOLEAN)||LA15_2==KW_CHAR||(LA15_2 >= KW_DATE && LA15_2 <= KW_DATETIME)||LA15_2==KW_DECIMAL||LA15_2==KW_DOUBLE||LA15_2==KW_FLOAT||LA15_2==KW_INT||LA15_2==KW_MAP||LA15_2==KW_REAL||LA15_2==KW_SMALLINT||(LA15_2 >= KW_STRING && LA15_2 <= KW_STRUCT)||(LA15_2 >= KW_TIMESTAMP && LA15_2 <= KW_TINYINT)||LA15_2==KW_UNIONTYPE||LA15_2==KW_VARCHAR) ) {
									alt15=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 15, 2, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 15, 0, input);
								throw nvae;
							}

							switch (alt15) {
								case 1 :
									// SelectClauseParser.g:99:23: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause589);
									aliasList40=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList40.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:99:35: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause593);
									columnNameTypeList41=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList41.getTree());
									}
									break;

							}

							RPAREN42=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_trfmClause596); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN42);

							}

							}
							break;
						case 2 :
							// SelectClauseParser.g:99:65: ( aliasList | columnNameTypeList )
							{
							// SelectClauseParser.g:99:65: ( aliasList | columnNameTypeList )
							int alt16=2;
							alt16 = dfa16.predict(input);
							switch (alt16) {
								case 1 :
									// SelectClauseParser.g:99:66: aliasList
									{
									pushFollow(FOLLOW_aliasList_in_trfmClause602);
									aliasList43=gHiveParser.aliasList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_aliasList.add(aliasList43.getTree());
									}
									break;
								case 2 :
									// SelectClauseParser.g:99:78: columnNameTypeList
									{
									pushFollow(FOLLOW_columnNameTypeList_in_trfmClause606);
									columnNameTypeList44=gHiveParser.columnNameTypeList();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList44.getTree());
									}
									break;

							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_rowFormat_in_trfmClause618);
			outSerde=gHiveParser.rowFormat();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_rowFormat.add(outSerde.getTree());
			pushFollow(FOLLOW_recordReader_in_trfmClause622);
			outRec=gHiveParser.recordReader();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_recordReader.add(outRec.getTree());
			// AST REWRITE
			// elements: columnNameTypeList, inSerde, inRec, outRec, outSerde, selectExpressionList, aliasList, StringLiteral
			// token labels: 
			// rule labels: inRec, outRec, inSerde, outSerde, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_inRec=new RewriteRuleSubtreeStream(adaptor,"rule inRec",inRec!=null?inRec.getTree():null);
			RewriteRuleSubtreeStream stream_outRec=new RewriteRuleSubtreeStream(adaptor,"rule outRec",outRec!=null?outRec.getTree():null);
			RewriteRuleSubtreeStream stream_inSerde=new RewriteRuleSubtreeStream(adaptor,"rule inSerde",inSerde!=null?inSerde.getTree():null);
			RewriteRuleSubtreeStream stream_outSerde=new RewriteRuleSubtreeStream(adaptor,"rule outSerde",outSerde!=null?outSerde.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 101:5: -> ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
			{
				// SelectClauseParser.g:101:8: ^( TOK_TRANSFORM selectExpressionList $inSerde $inRec StringLiteral $outSerde $outRec ( aliasList )? ( columnNameTypeList )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TRANSFORM, "TOK_TRANSFORM"), root_1);
				adaptor.addChild(root_1, stream_selectExpressionList.nextTree());
				adaptor.addChild(root_1, stream_inSerde.nextTree());
				adaptor.addChild(root_1, stream_inRec.nextTree());
				adaptor.addChild(root_1, stream_StringLiteral.nextNode());
				adaptor.addChild(root_1, stream_outSerde.nextTree());
				adaptor.addChild(root_1, stream_outRec.nextTree());
				// SelectClauseParser.g:101:93: ( aliasList )?
				if ( stream_aliasList.hasNext() ) {
					adaptor.addChild(root_1, stream_aliasList.nextTree());
				}
				stream_aliasList.reset();

				// SelectClauseParser.g:101:104: ( columnNameTypeList )?
				if ( stream_columnNameTypeList.hasNext() ) {
					adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());
				}
				stream_columnNameTypeList.reset();

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
	// $ANTLR end "trfmClause"


	public static class selectExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectExpression"
	// SelectClauseParser.g:104:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );
	public final HiveParser_SelectClauseParser.selectExpression_return selectExpression() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpression_return retval = new HiveParser_SelectClauseParser.selectExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope tableAllColumns45 =null;
		ParserRuleReturnScope expression46 =null;


		 gParent.pushMsg(retval.start,"select expression", state); 
		try {
			// SelectClauseParser.g:107:5: ( ( tableAllColumns )=> tableAllColumns | expression )
			int alt19=2;
			alt19 = dfa19.predict(input);
			switch (alt19) {
				case 1 :
					// SelectClauseParser.g:108:5: ( tableAllColumns )=> tableAllColumns
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_tableAllColumns_in_selectExpression691);
					tableAllColumns45=gHiveParser.tableAllColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableAllColumns45.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:110:5: expression
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_expression_in_selectExpression703);
					expression46=gHiveParser.expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression46.getTree());

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
	// $ANTLR end "selectExpression"


	public static class selectExpressionList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "selectExpressionList"
	// SelectClauseParser.g:113:1: selectExpressionList : selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) ;
	public final HiveParser_SelectClauseParser.selectExpressionList_return selectExpressionList() throws RecognitionException {
		HiveParser_SelectClauseParser.selectExpressionList_return retval = new HiveParser_SelectClauseParser.selectExpressionList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA48=null;
		ParserRuleReturnScope selectExpression47 =null;
		ParserRuleReturnScope selectExpression49 =null;

		ASTNode COMMA48_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_selectExpression=new RewriteRuleSubtreeStream(adaptor,"rule selectExpression");

		 gParent.pushMsg(retval.start,"select expression list", state); 
		try {
			// SelectClauseParser.g:116:5: ( selectExpression ( COMMA selectExpression )* -> ^( TOK_EXPLIST ( selectExpression )+ ) )
			// SelectClauseParser.g:117:5: selectExpression ( COMMA selectExpression )*
			{
			pushFollow(FOLLOW_selectExpression_in_selectExpressionList734);
			selectExpression47=selectExpression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression47.getTree());
			// SelectClauseParser.g:117:22: ( COMMA selectExpression )*
			loop20:
			while (true) {
				int alt20=2;
				int LA20_0 = input.LA(1);
				if ( (LA20_0==COMMA) ) {
					alt20=1;
				}

				switch (alt20) {
				case 1 :
					// SelectClauseParser.g:117:23: COMMA selectExpression
					{
					COMMA48=(Token)match(input,COMMA,FOLLOW_COMMA_in_selectExpressionList737); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA48);

					pushFollow(FOLLOW_selectExpression_in_selectExpressionList739);
					selectExpression49=selectExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_selectExpression.add(selectExpression49.getTree());
					}
					break;

				default :
					break loop20;
				}
			}

			// AST REWRITE
			// elements: selectExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 117:48: -> ^( TOK_EXPLIST ( selectExpression )+ )
			{
				// SelectClauseParser.g:117:51: ^( TOK_EXPLIST ( selectExpression )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST"), root_1);
				if ( !(stream_selectExpression.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_selectExpression.hasNext() ) {
					adaptor.addChild(root_1, stream_selectExpression.nextTree());
				}
				stream_selectExpression.reset();

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
	// $ANTLR end "selectExpressionList"


	public static class window_clause_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_clause"
	// SelectClauseParser.g:121:1: window_clause : KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) ;
	public final HiveParser_SelectClauseParser.window_clause_return window_clause() throws RecognitionException {
		HiveParser_SelectClauseParser.window_clause_return retval = new HiveParser_SelectClauseParser.window_clause_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_WINDOW50=null;
		Token COMMA52=null;
		ParserRuleReturnScope window_defn51 =null;
		ParserRuleReturnScope window_defn53 =null;

		ASTNode KW_WINDOW50_tree=null;
		ASTNode COMMA52_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleTokenStream stream_KW_WINDOW=new RewriteRuleTokenStream(adaptor,"token KW_WINDOW");
		RewriteRuleSubtreeStream stream_window_defn=new RewriteRuleSubtreeStream(adaptor,"rule window_defn");

		 gParent.pushMsg(retval.start,"window_clause", state); 
		try {
			// SelectClauseParser.g:124:3: ( KW_WINDOW window_defn ( COMMA window_defn )* -> ^( KW_WINDOW ( window_defn )+ ) )
			// SelectClauseParser.g:125:3: KW_WINDOW window_defn ( COMMA window_defn )*
			{
			KW_WINDOW50=(Token)match(input,KW_WINDOW,FOLLOW_KW_WINDOW_in_window_clause776); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_WINDOW.add(KW_WINDOW50);

			pushFollow(FOLLOW_window_defn_in_window_clause778);
			window_defn51=window_defn();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_window_defn.add(window_defn51.getTree());
			// SelectClauseParser.g:125:25: ( COMMA window_defn )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// SelectClauseParser.g:125:26: COMMA window_defn
					{
					COMMA52=(Token)match(input,COMMA,FOLLOW_COMMA_in_window_clause781); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_COMMA.add(COMMA52);

					pushFollow(FOLLOW_window_defn_in_window_clause783);
					window_defn53=window_defn();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_defn.add(window_defn53.getTree());
					}
					break;

				default :
					break loop21;
				}
			}

			// AST REWRITE
			// elements: KW_WINDOW, window_defn
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 125:46: -> ^( KW_WINDOW ( window_defn )+ )
			{
				// SelectClauseParser.g:125:49: ^( KW_WINDOW ( window_defn )+ )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot(stream_KW_WINDOW.nextNode(), root_1);
				if ( !(stream_window_defn.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_window_defn.hasNext() ) {
					adaptor.addChild(root_1, stream_window_defn.nextTree());
				}
				stream_window_defn.reset();

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
	// $ANTLR end "window_clause"


	public static class window_defn_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_defn"
	// SelectClauseParser.g:128:1: window_defn : identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) ;
	public final HiveParser_SelectClauseParser.window_defn_return window_defn() throws RecognitionException {
		HiveParser_SelectClauseParser.window_defn_return retval = new HiveParser_SelectClauseParser.window_defn_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AS55=null;
		ParserRuleReturnScope identifier54 =null;
		ParserRuleReturnScope window_specification56 =null;

		ASTNode KW_AS55_tree=null;
		RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_window_specification=new RewriteRuleSubtreeStream(adaptor,"rule window_specification");

		 gParent.pushMsg(retval.start,"window_defn", state); 
		try {
			// SelectClauseParser.g:131:3: ( identifier KW_AS window_specification -> ^( TOK_WINDOWDEF identifier window_specification ) )
			// SelectClauseParser.g:132:3: identifier KW_AS window_specification
			{
			pushFollow(FOLLOW_identifier_in_window_defn815);
			identifier54=gHiveParser.identifier();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_identifier.add(identifier54.getTree());
			KW_AS55=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_window_defn817); if (state.failed) return retval; 
			if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS55);

			pushFollow(FOLLOW_window_specification_in_window_defn819);
			window_specification56=window_specification();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) stream_window_specification.add(window_specification56.getTree());
			// AST REWRITE
			// elements: identifier, window_specification
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 132:41: -> ^( TOK_WINDOWDEF identifier window_specification )
			{
				// SelectClauseParser.g:132:44: ^( TOK_WINDOWDEF identifier window_specification )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWDEF, "TOK_WINDOWDEF"), root_1);
				adaptor.addChild(root_1, stream_identifier.nextTree());
				adaptor.addChild(root_1, stream_window_specification.nextTree());
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
	// $ANTLR end "window_defn"


	public static class window_specification_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_specification"
	// SelectClauseParser.g:135:1: window_specification : ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) ;
	public final HiveParser_SelectClauseParser.window_specification_return window_specification() throws RecognitionException {
		HiveParser_SelectClauseParser.window_specification_return retval = new HiveParser_SelectClauseParser.window_specification_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token LPAREN58=null;
		Token RPAREN62=null;
		ParserRuleReturnScope identifier57 =null;
		ParserRuleReturnScope identifier59 =null;
		ParserRuleReturnScope partitioningSpec60 =null;
		ParserRuleReturnScope window_frame61 =null;

		ASTNode LPAREN58_tree=null;
		ASTNode RPAREN62_tree=null;
		RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
		RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
		RewriteRuleSubtreeStream stream_window_frame=new RewriteRuleSubtreeStream(adaptor,"rule window_frame");

		 gParent.pushMsg(retval.start,"window_specification", state); 
		try {
			// SelectClauseParser.g:138:3: ( ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) ) -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? ) )
			// SelectClauseParser.g:139:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			{
			// SelectClauseParser.g:139:3: ( identifier | ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN ) )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==Identifier||(LA25_0 >= KW_ABORT && LA25_0 <= KW_AFTER)||LA25_0==KW_ALLOC_FRACTION||LA25_0==KW_ANALYZE||LA25_0==KW_ARCHIVE||(LA25_0 >= KW_ASC && LA25_0 <= KW_AST)||(LA25_0 >= KW_AUTOCOMMIT && LA25_0 <= KW_BEFORE)||(LA25_0 >= KW_BUCKET && LA25_0 <= KW_BUCKETS)||(LA25_0 >= KW_CACHE && LA25_0 <= KW_CASCADE)||LA25_0==KW_CHANGE||(LA25_0 >= KW_CHECK && LA25_0 <= KW_COLLECTION)||(LA25_0 >= KW_COLUMNS && LA25_0 <= KW_COMMENT)||(LA25_0 >= KW_COMPACT && LA25_0 <= KW_CONCATENATE)||LA25_0==KW_CONTINUE||LA25_0==KW_DATA||(LA25_0 >= KW_DATABASES && LA25_0 <= KW_DEBUG)||(LA25_0 >= KW_DEFAULT && LA25_0 <= KW_DEFINED)||(LA25_0 >= KW_DELIMITED && LA25_0 <= KW_DESC)||(LA25_0 >= KW_DETAIL && LA25_0 <= KW_DISABLE)||(LA25_0 >= KW_DISTRIBUTE && LA25_0 <= KW_DO)||LA25_0==KW_DOW||(LA25_0 >= KW_DUMP && LA25_0 <= KW_ELEM_TYPE)||LA25_0==KW_ENABLE||(LA25_0 >= KW_ENFORCED && LA25_0 <= KW_ESCAPED)||LA25_0==KW_EXCLUSIVE||(LA25_0 >= KW_EXPLAIN && LA25_0 <= KW_EXPRESSION)||(LA25_0 >= KW_FIELDS && LA25_0 <= KW_FIRST)||(LA25_0 >= KW_FORMAT && LA25_0 <= KW_FORMATTED)||LA25_0==KW_FUNCTIONS||LA25_0==KW_GROUP||(LA25_0 >= KW_HOUR && LA25_0 <= KW_IDXPROPERTIES)||(LA25_0 >= KW_INDEX && LA25_0 <= KW_INDEXES)||(LA25_0 >= KW_INPATH && LA25_0 <= KW_INPUTFORMAT)||(LA25_0 >= KW_ISOLATION && LA25_0 <= KW_JAR)||(LA25_0 >= KW_KEY && LA25_0 <= KW_LAST)||LA25_0==KW_LEVEL||(LA25_0 >= KW_LIMIT && LA25_0 <= KW_LOAD)||(LA25_0 >= KW_LOCATION && LA25_0 <= KW_LONG)||LA25_0==KW_MANAGEMENT||(LA25_0 >= KW_MAPJOIN && LA25_0 <= KW_MATERIALIZED)||LA25_0==KW_METADATA||(LA25_0 >= KW_MINUTE && LA25_0 <= KW_MONTH)||(LA25_0 >= KW_MOVE && LA25_0 <= KW_MSCK)||(LA25_0 >= KW_NORELY && LA25_0 <= KW_NOSCAN)||LA25_0==KW_NOVALIDATE||LA25_0==KW_NULLS||LA25_0==KW_OFFSET||(LA25_0 >= KW_OPERATOR && LA25_0 <= KW_OPTION)||LA25_0==KW_ORDER||(LA25_0 >= KW_OUTPUTDRIVER && LA25_0 <= KW_OUTPUTFORMAT)||(LA25_0 >= KW_OVERWRITE && LA25_0 <= KW_OWNER)||(LA25_0 >= KW_PARTITIONED && LA25_0 <= KW_PATH)||(LA25_0 >= KW_PLAN && LA25_0 <= KW_POOL)||LA25_0==KW_PRINCIPALS||(LA25_0 >= KW_PURGE && LA25_0 <= KW_QUERY_PARALLELISM)||LA25_0==KW_READ||(LA25_0 >= KW_REBUILD && LA25_0 <= KW_RECORDWRITER)||(LA25_0 >= KW_RELOAD && LA25_0 <= KW_RESTRICT)||LA25_0==KW_REWRITE||(LA25_0 >= KW_ROLE && LA25_0 <= KW_ROLES)||(LA25_0 >= KW_SCHEDULING_POLICY && LA25_0 <= KW_SECOND)||(LA25_0 >= KW_SEMI && LA25_0 <= KW_SERVER)||(LA25_0 >= KW_SETS && LA25_0 <= KW_SKEWED)||(LA25_0 >= KW_SNAPSHOT && LA25_0 <= KW_SSL)||(LA25_0 >= KW_STATISTICS && LA25_0 <= KW_SUMMARY)||LA25_0==KW_TABLES||(LA25_0 >= KW_TBLPROPERTIES && LA25_0 <= KW_TERMINATED)||LA25_0==KW_TINYINT||(LA25_0 >= KW_TOUCH && LA25_0 <= KW_TRANSACTIONS)||LA25_0==KW_UNARCHIVE||LA25_0==KW_UNDO||LA25_0==KW_UNIONTYPE||(LA25_0 >= KW_UNKNOWN && LA25_0 <= KW_UNSIGNED)||(LA25_0 >= KW_URI && LA25_0 <= KW_USE)||(LA25_0 >= KW_UTC && LA25_0 <= KW_VALIDATE)||LA25_0==KW_VALUE_TYPE||(LA25_0 >= KW_VECTORIZATION && LA25_0 <= KW_WEEK)||LA25_0==KW_WHILE||(LA25_0 >= KW_WORK && LA25_0 <= KW_ZONE)||LA25_0==KW_BATCH||LA25_0==KW_DAYOFWEEK||LA25_0==KW_HOLD_DDLTIME||LA25_0==KW_IGNORE||LA25_0==KW_NO_DROP||LA25_0==KW_OFFLINE||LA25_0==KW_PROTECTION||LA25_0==KW_READONLY||LA25_0==KW_TIMESTAMPTZ) ) {
				alt25=1;
			}
			else if ( (LA25_0==LPAREN) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// SelectClauseParser.g:139:4: identifier
					{
					pushFollow(FOLLOW_identifier_in_window_specification851);
					identifier57=gHiveParser.identifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_identifier.add(identifier57.getTree());
					}
					break;
				case 2 :
					// SelectClauseParser.g:139:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					{
					// SelectClauseParser.g:139:17: ( LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN )
					// SelectClauseParser.g:139:19: LPAREN ( identifier )? ( partitioningSpec )? ( window_frame )? RPAREN
					{
					LPAREN58=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_window_specification857); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN58);

					// SelectClauseParser.g:139:26: ( identifier )?
					int alt22=2;
					switch ( input.LA(1) ) {
						case Identifier:
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
							alt22=1;
							}
							break;
						case KW_ORDER:
							{
							int LA22_2 = input.LA(2);
							if ( (LA22_2==KW_CLUSTER||LA22_2==KW_DISTRIBUTE||LA22_2==KW_ORDER||LA22_2==KW_PARTITION||LA22_2==KW_RANGE||LA22_2==KW_ROWS||LA22_2==KW_SORT||LA22_2==RPAREN) ) {
								alt22=1;
							}
							}
							break;
						case KW_DISTRIBUTE:
							{
							int LA22_4 = input.LA(2);
							if ( (LA22_4==KW_CLUSTER||LA22_4==KW_DISTRIBUTE||LA22_4==KW_ORDER||LA22_4==KW_PARTITION||LA22_4==KW_RANGE||LA22_4==KW_ROWS||LA22_4==KW_SORT||LA22_4==RPAREN) ) {
								alt22=1;
							}
							}
							break;
						case KW_SORT:
							{
							int LA22_5 = input.LA(2);
							if ( (LA22_5==KW_CLUSTER||LA22_5==KW_DISTRIBUTE||LA22_5==KW_ORDER||LA22_5==KW_PARTITION||LA22_5==KW_RANGE||LA22_5==KW_ROWS||LA22_5==KW_SORT||LA22_5==RPAREN) ) {
								alt22=1;
							}
							}
							break;
						case KW_CLUSTER:
							{
							int LA22_6 = input.LA(2);
							if ( (LA22_6==KW_CLUSTER||LA22_6==KW_DISTRIBUTE||LA22_6==KW_ORDER||LA22_6==KW_PARTITION||LA22_6==KW_RANGE||LA22_6==KW_ROWS||LA22_6==KW_SORT||LA22_6==RPAREN) ) {
								alt22=1;
							}
							}
							break;
					}
					switch (alt22) {
						case 1 :
							// SelectClauseParser.g:139:26: identifier
							{
							pushFollow(FOLLOW_identifier_in_window_specification859);
							identifier59=gHiveParser.identifier();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_identifier.add(identifier59.getTree());
							}
							break;

					}

					// SelectClauseParser.g:139:38: ( partitioningSpec )?
					int alt23=2;
					int LA23_0 = input.LA(1);
					if ( (LA23_0==KW_CLUSTER||LA23_0==KW_DISTRIBUTE||LA23_0==KW_ORDER||LA23_0==KW_PARTITION||LA23_0==KW_SORT) ) {
						alt23=1;
					}
					switch (alt23) {
						case 1 :
							// SelectClauseParser.g:139:38: partitioningSpec
							{
							pushFollow(FOLLOW_partitioningSpec_in_window_specification862);
							partitioningSpec60=gHiveParser.partitioningSpec();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_partitioningSpec.add(partitioningSpec60.getTree());
							}
							break;

					}

					// SelectClauseParser.g:139:56: ( window_frame )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0==KW_RANGE||LA24_0==KW_ROWS) ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// SelectClauseParser.g:139:56: window_frame
							{
							pushFollow(FOLLOW_window_frame_in_window_specification865);
							window_frame61=window_frame();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) stream_window_frame.add(window_frame61.getTree());
							}
							break;

					}

					RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_window_specification868); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN62);

					}

					}
					break;

			}

			// AST REWRITE
			// elements: identifier, partitioningSpec, window_frame
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			if ( state.backtracking==0 ) {
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 139:79: -> ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
			{
				// SelectClauseParser.g:139:82: ^( TOK_WINDOWSPEC ( identifier )? ( partitioningSpec )? ( window_frame )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWSPEC, "TOK_WINDOWSPEC"), root_1);
				// SelectClauseParser.g:139:99: ( identifier )?
				if ( stream_identifier.hasNext() ) {
					adaptor.addChild(root_1, stream_identifier.nextTree());
				}
				stream_identifier.reset();

				// SelectClauseParser.g:139:111: ( partitioningSpec )?
				if ( stream_partitioningSpec.hasNext() ) {
					adaptor.addChild(root_1, stream_partitioningSpec.nextTree());
				}
				stream_partitioningSpec.reset();

				// SelectClauseParser.g:139:129: ( window_frame )?
				if ( stream_window_frame.hasNext() ) {
					adaptor.addChild(root_1, stream_window_frame.nextTree());
				}
				stream_window_frame.reset();

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
	// $ANTLR end "window_specification"


	public static class window_frame_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_frame"
	// SelectClauseParser.g:142:1: window_frame : ( window_range_expression | window_value_expression );
	public final HiveParser_SelectClauseParser.window_frame_return window_frame() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_return retval = new HiveParser_SelectClauseParser.window_frame_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope window_range_expression63 =null;
		ParserRuleReturnScope window_value_expression64 =null;


		try {
			// SelectClauseParser.g:142:14: ( window_range_expression | window_value_expression )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==KW_ROWS) ) {
				alt26=1;
			}
			else if ( (LA26_0==KW_RANGE) ) {
				alt26=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// SelectClauseParser.g:143:2: window_range_expression
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_window_range_expression_in_window_frame895);
					window_range_expression63=window_range_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, window_range_expression63.getTree());

					}
					break;
				case 2 :
					// SelectClauseParser.g:144:2: window_value_expression
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_window_value_expression_in_window_frame900);
					window_value_expression64=window_value_expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, window_value_expression64.getTree());

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
	// $ANTLR end "window_frame"


	public static class window_range_expression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_range_expression"
	// SelectClauseParser.g:147:1: window_range_expression : ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) );
	public final HiveParser_SelectClauseParser.window_range_expression_return window_range_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_range_expression_return retval = new HiveParser_SelectClauseParser.window_range_expression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ROWS65=null;
		Token KW_ROWS66=null;
		Token KW_BETWEEN67=null;
		Token KW_AND68=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		ASTNode KW_ROWS65_tree=null;
		ASTNode KW_ROWS66_tree=null;
		ASTNode KW_BETWEEN67_tree=null;
		ASTNode KW_AND68_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");

		 gParent.pushMsg(retval.start,"window_range_expression", state); 
		try {
			// SelectClauseParser.g:150:2: ( KW_ROWS sb= window_frame_start_boundary -> ^( TOK_WINDOWRANGE $sb) | KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWRANGE $s $end) )
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==KW_ROWS) ) {
				int LA27_1 = input.LA(2);
				if ( (LA27_1==KW_BETWEEN) ) {
					alt27=2;
				}
				else if ( (LA27_1==KW_CURRENT||LA27_1==KW_UNBOUNDED||LA27_1==Number) ) {
					alt27=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 27, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 27, 0, input);
				throw nvae;
			}

			switch (alt27) {
				case 1 :
					// SelectClauseParser.g:151:2: KW_ROWS sb= window_frame_start_boundary
					{
					KW_ROWS65=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression920); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS65);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_range_expression924);
					sb=window_frame_start_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 151:41: -> ^( TOK_WINDOWRANGE $sb)
					{
						// SelectClauseParser.g:151:44: ^( TOK_WINDOWRANGE $sb)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:152:2: KW_ROWS KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_ROWS66=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_window_range_expression938); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS66);

					KW_BETWEEN67=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_range_expression940); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN67);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression944);
					s=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());
					KW_AND68=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_range_expression946); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND68);

					pushFollow(FOLLOW_window_frame_boundary_in_window_range_expression950);
					end=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: end, s
					// token labels: 
					// rule labels: s, end, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 152:78: -> ^( TOK_WINDOWRANGE $s $end)
					{
						// SelectClauseParser.g:152:81: ^( TOK_WINDOWRANGE $s $end)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWRANGE, "TOK_WINDOWRANGE"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
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
	// $ANTLR end "window_range_expression"


	public static class window_value_expression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_value_expression"
	// SelectClauseParser.g:155:1: window_value_expression : ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) );
	public final HiveParser_SelectClauseParser.window_value_expression_return window_value_expression() throws RecognitionException {
		HiveParser_SelectClauseParser.window_value_expression_return retval = new HiveParser_SelectClauseParser.window_value_expression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_RANGE69=null;
		Token KW_RANGE70=null;
		Token KW_BETWEEN71=null;
		Token KW_AND72=null;
		ParserRuleReturnScope sb =null;
		ParserRuleReturnScope s =null;
		ParserRuleReturnScope end =null;

		ASTNode KW_RANGE69_tree=null;
		ASTNode KW_RANGE70_tree=null;
		ASTNode KW_BETWEEN71_tree=null;
		ASTNode KW_AND72_tree=null;
		RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
		RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
		RewriteRuleTokenStream stream_KW_RANGE=new RewriteRuleTokenStream(adaptor,"token KW_RANGE");
		RewriteRuleSubtreeStream stream_window_frame_start_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_start_boundary");
		RewriteRuleSubtreeStream stream_window_frame_boundary=new RewriteRuleSubtreeStream(adaptor,"rule window_frame_boundary");

		 gParent.pushMsg(retval.start,"window_value_expression", state); 
		try {
			// SelectClauseParser.g:158:2: ( KW_RANGE sb= window_frame_start_boundary -> ^( TOK_WINDOWVALUES $sb) | KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary -> ^( TOK_WINDOWVALUES $s $end) )
			int alt28=2;
			int LA28_0 = input.LA(1);
			if ( (LA28_0==KW_RANGE) ) {
				int LA28_1 = input.LA(2);
				if ( (LA28_1==KW_BETWEEN) ) {
					alt28=2;
				}
				else if ( (LA28_1==KW_CURRENT||LA28_1==KW_UNBOUNDED||LA28_1==Number) ) {
					alt28=1;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// SelectClauseParser.g:159:2: KW_RANGE sb= window_frame_start_boundary
					{
					KW_RANGE69=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression982); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE69);

					pushFollow(FOLLOW_window_frame_start_boundary_in_window_value_expression986);
					sb=window_frame_start_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_start_boundary.add(sb.getTree());
					// AST REWRITE
					// elements: sb
					// token labels: 
					// rule labels: retval, sb
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_sb=new RewriteRuleSubtreeStream(adaptor,"rule sb",sb!=null?sb.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 159:42: -> ^( TOK_WINDOWVALUES $sb)
					{
						// SelectClauseParser.g:159:45: ^( TOK_WINDOWVALUES $sb)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_sb.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:160:2: KW_RANGE KW_BETWEEN s= window_frame_boundary KW_AND end= window_frame_boundary
					{
					KW_RANGE70=(Token)match(input,KW_RANGE,FOLLOW_KW_RANGE_in_window_value_expression1000); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_RANGE.add(KW_RANGE70);

					KW_BETWEEN71=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_window_value_expression1002); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN71);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1006);
					s=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(s.getTree());
					KW_AND72=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_window_value_expression1008); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND72);

					pushFollow(FOLLOW_window_frame_boundary_in_window_value_expression1012);
					end=window_frame_boundary();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) stream_window_frame_boundary.add(end.getTree());
					// AST REWRITE
					// elements: end, s
					// token labels: 
					// rule labels: s, end, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_s=new RewriteRuleSubtreeStream(adaptor,"rule s",s!=null?s.getTree():null);
					RewriteRuleSubtreeStream stream_end=new RewriteRuleSubtreeStream(adaptor,"rule end",end!=null?end.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 160:79: -> ^( TOK_WINDOWVALUES $s $end)
					{
						// SelectClauseParser.g:160:82: ^( TOK_WINDOWVALUES $s $end)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_WINDOWVALUES, "TOK_WINDOWVALUES"), root_1);
						adaptor.addChild(root_1, stream_s.nextTree());
						adaptor.addChild(root_1, stream_end.nextTree());
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
	// $ANTLR end "window_value_expression"


	public static class window_frame_start_boundary_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_frame_start_boundary"
	// SelectClauseParser.g:163:1: window_frame_start_boundary : ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) );
	public final HiveParser_SelectClauseParser.window_frame_start_boundary_return window_frame_start_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_start_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_start_boundary_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UNBOUNDED73=null;
		Token KW_PRECEDING74=null;
		Token KW_CURRENT75=null;
		Token KW_ROW76=null;
		Token Number77=null;
		Token KW_PRECEDING78=null;

		ASTNode KW_UNBOUNDED73_tree=null;
		ASTNode KW_PRECEDING74_tree=null;
		ASTNode KW_CURRENT75_tree=null;
		ASTNode KW_ROW76_tree=null;
		ASTNode Number77_tree=null;
		ASTNode KW_PRECEDING78_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

		 gParent.pushMsg(retval.start,"windowframestartboundary", state); 
		try {
			// SelectClauseParser.g:166:3: ( KW_UNBOUNDED KW_PRECEDING -> ^( KW_PRECEDING KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number KW_PRECEDING -> ^( KW_PRECEDING Number ) )
			int alt29=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt29=1;
				}
				break;
			case KW_CURRENT:
				{
				alt29=2;
				}
				break;
			case Number:
				{
				alt29=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}
			switch (alt29) {
				case 1 :
					// SelectClauseParser.g:167:3: KW_UNBOUNDED KW_PRECEDING
					{
					KW_UNBOUNDED73=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1045); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED73);

					KW_PRECEDING74=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1047); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING74);

					// AST REWRITE
					// elements: KW_UNBOUNDED, KW_PRECEDING
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 167:30: -> ^( KW_PRECEDING KW_UNBOUNDED )
					{
						// SelectClauseParser.g:167:33: ^( KW_PRECEDING KW_UNBOUNDED )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:168:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT75=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_start_boundary1062); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT75);

					KW_ROW76=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_start_boundary1064); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW76);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 168:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:168:25: ^( KW_CURRENT )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// SelectClauseParser.g:169:3: Number KW_PRECEDING
					{
					Number77=(Token)match(input,Number,FOLLOW_Number_in_window_frame_start_boundary1077); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(Number77);

					KW_PRECEDING78=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1079); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_PRECEDING.add(KW_PRECEDING78);

					// AST REWRITE
					// elements: KW_PRECEDING, Number
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 169:23: -> ^( KW_PRECEDING Number )
					{
						// SelectClauseParser.g:169:26: ^( KW_PRECEDING Number )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_KW_PRECEDING.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
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
	// $ANTLR end "window_frame_start_boundary"


	public static class window_frame_boundary_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "window_frame_boundary"
	// SelectClauseParser.g:172:1: window_frame_boundary : ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) );
	public final HiveParser_SelectClauseParser.window_frame_boundary_return window_frame_boundary() throws RecognitionException {
		HiveParser_SelectClauseParser.window_frame_boundary_return retval = new HiveParser_SelectClauseParser.window_frame_boundary_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token r=null;
		Token d=null;
		Token KW_UNBOUNDED79=null;
		Token KW_CURRENT80=null;
		Token KW_ROW81=null;
		Token Number82=null;

		ASTNode r_tree=null;
		ASTNode d_tree=null;
		ASTNode KW_UNBOUNDED79_tree=null;
		ASTNode KW_CURRENT80_tree=null;
		ASTNode KW_ROW81_tree=null;
		ASTNode Number82_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_ROW=new RewriteRuleTokenStream(adaptor,"token KW_ROW");
		RewriteRuleTokenStream stream_KW_UNBOUNDED=new RewriteRuleTokenStream(adaptor,"token KW_UNBOUNDED");
		RewriteRuleTokenStream stream_KW_PRECEDING=new RewriteRuleTokenStream(adaptor,"token KW_PRECEDING");
		RewriteRuleTokenStream stream_KW_FOLLOWING=new RewriteRuleTokenStream(adaptor,"token KW_FOLLOWING");
		RewriteRuleTokenStream stream_KW_CURRENT=new RewriteRuleTokenStream(adaptor,"token KW_CURRENT");

		 gParent.pushMsg(retval.start,"windowframeboundary", state); 
		try {
			// SelectClauseParser.g:175:3: ( KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING ) -> ^( $r KW_UNBOUNDED ) | KW_CURRENT KW_ROW -> ^( KW_CURRENT ) | Number (d= KW_PRECEDING |d= KW_FOLLOWING ) -> ^( $d Number ) )
			int alt32=3;
			switch ( input.LA(1) ) {
			case KW_UNBOUNDED:
				{
				alt32=1;
				}
				break;
			case KW_CURRENT:
				{
				alt32=2;
				}
				break;
			case Number:
				{
				alt32=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 32, 0, input);
				throw nvae;
			}
			switch (alt32) {
				case 1 :
					// SelectClauseParser.g:176:3: KW_UNBOUNDED (r= KW_PRECEDING |r= KW_FOLLOWING )
					{
					KW_UNBOUNDED79=(Token)match(input,KW_UNBOUNDED,FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1108); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_UNBOUNDED.add(KW_UNBOUNDED79);

					// SelectClauseParser.g:176:16: (r= KW_PRECEDING |r= KW_FOLLOWING )
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==KW_PRECEDING) ) {
						alt30=1;
					}
					else if ( (LA30_0==KW_FOLLOWING) ) {
						alt30=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 30, 0, input);
						throw nvae;
					}

					switch (alt30) {
						case 1 :
							// SelectClauseParser.g:176:17: r= KW_PRECEDING
							{
							r=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1113); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PRECEDING.add(r);

							}
							break;
						case 2 :
							// SelectClauseParser.g:176:32: r= KW_FOLLOWING
							{
							r=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1117); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(r);

							}
							break;

					}

					// AST REWRITE
					// elements: KW_UNBOUNDED, r
					// token labels: r
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_r=new RewriteRuleTokenStream(adaptor,"token r",r);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 176:49: -> ^( $r KW_UNBOUNDED )
					{
						// SelectClauseParser.g:176:52: ^( $r KW_UNBOUNDED )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_r.nextNode(), root_1);
						adaptor.addChild(root_1, stream_KW_UNBOUNDED.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 2 :
					// SelectClauseParser.g:177:3: KW_CURRENT KW_ROW
					{
					KW_CURRENT80=(Token)match(input,KW_CURRENT,FOLLOW_KW_CURRENT_in_window_frame_boundary1134); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_CURRENT.add(KW_CURRENT80);

					KW_ROW81=(Token)match(input,KW_ROW,FOLLOW_KW_ROW_in_window_frame_boundary1136); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_KW_ROW.add(KW_ROW81);

					// AST REWRITE
					// elements: KW_CURRENT
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 177:22: -> ^( KW_CURRENT )
					{
						// SelectClauseParser.g:177:25: ^( KW_CURRENT )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_KW_CURRENT.nextNode(), root_1);
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;
					}

					}
					break;
				case 3 :
					// SelectClauseParser.g:178:3: Number (d= KW_PRECEDING |d= KW_FOLLOWING )
					{
					Number82=(Token)match(input,Number,FOLLOW_Number_in_window_frame_boundary1149); if (state.failed) return retval; 
					if ( state.backtracking==0 ) stream_Number.add(Number82);

					// SelectClauseParser.g:178:10: (d= KW_PRECEDING |d= KW_FOLLOWING )
					int alt31=2;
					int LA31_0 = input.LA(1);
					if ( (LA31_0==KW_PRECEDING) ) {
						alt31=1;
					}
					else if ( (LA31_0==KW_FOLLOWING) ) {
						alt31=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}

					switch (alt31) {
						case 1 :
							// SelectClauseParser.g:178:11: d= KW_PRECEDING
							{
							d=(Token)match(input,KW_PRECEDING,FOLLOW_KW_PRECEDING_in_window_frame_boundary1154); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_PRECEDING.add(d);

							}
							break;
						case 2 :
							// SelectClauseParser.g:178:28: d= KW_FOLLOWING
							{
							d=(Token)match(input,KW_FOLLOWING,FOLLOW_KW_FOLLOWING_in_window_frame_boundary1160); if (state.failed) return retval; 
							if ( state.backtracking==0 ) stream_KW_FOLLOWING.add(d);

							}
							break;

					}

					// AST REWRITE
					// elements: Number, d
					// token labels: d
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					if ( state.backtracking==0 ) {
					retval.tree = root_0;
					RewriteRuleTokenStream stream_d=new RewriteRuleTokenStream(adaptor,"token d",d);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 178:45: -> ^( $d Number )
					{
						// SelectClauseParser.g:178:48: ^( $d Number )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot(stream_d.nextNode(), root_1);
						adaptor.addChild(root_1, stream_Number.nextNode());
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
	// $ANTLR end "window_frame_boundary"

	// $ANTLR start synpred1_SelectClauseParser
	public final void synpred1_SelectClauseParser_fragment() throws RecognitionException {
		// SelectClauseParser.g:84:5: ( tableAllColumns )
		// SelectClauseParser.g:84:6: tableAllColumns
		{
		pushFollow(FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser421);
		gHiveParser.tableAllColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred1_SelectClauseParser

	// $ANTLR start synpred2_SelectClauseParser
	public final void synpred2_SelectClauseParser_fragment() throws RecognitionException {
		// SelectClauseParser.g:108:5: ( tableAllColumns )
		// SelectClauseParser.g:108:6: tableAllColumns
		{
		pushFollow(FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser686);
		gHiveParser.tableAllColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred2_SelectClauseParser

	// Delegated rules

	public final boolean synpred2_SelectClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred2_SelectClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred1_SelectClauseParser() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred1_SelectClauseParser_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}


	protected DFA7 dfa7 = new DFA7(this);
	protected DFA13 dfa13 = new DFA13(this);
	protected DFA12 dfa12 = new DFA12(this);
	protected DFA16 dfa16 = new DFA16(this);
	protected DFA19 dfa19 = new DFA19(this);
	static final String DFA7_eotS =
		"\u0093\uffff";
	static final String DFA7_eofS =
		"\1\uffff\2\3\u0090\uffff";
	static final String DFA7_minS =
		"\1\30\2\11\26\uffff\1\14\53\uffff\1\14\115\uffff";
	static final String DFA7_maxS =
		"\1\u0292\2\u017c\26\uffff\1\u0292\53\uffff\1\u0292\115\uffff";
	static final String DFA7_acceptS =
		"\3\uffff\1\1\27\uffff\1\2\167\uffff";
	static final String DFA7_specialS =
		"\u0093\uffff}>";
	static final String[] DFA7_transitionS = {
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
			"\1\3\36\uffff\1\33\7\uffff\3\33\11\uffff\1\33\1\uffff\1\3\30\uffff\2"+
			"\33\3\uffff\1\33\15\uffff\1\3\1\uffff\1\33\11\uffff\1\3\17\uffff\1\33"+
			"\7\uffff\1\3\4\uffff\1\3\1\uffff\1\3\13\uffff\1\3\1\33\1\3\14\uffff\1"+
			"\3\4\uffff\1\3\12\uffff\1\31\6\uffff\1\3\23\uffff\1\3\35\uffff\1\33\1"+
			"\uffff\1\3\1\uffff\1\3\24\uffff\1\3\5\uffff\1\3\12\uffff\1\33\1\uffff"+
			"\1\3\7\uffff\2\33\12\uffff\3\33\14\uffff\1\3\1\33\21\uffff\1\33\6\uffff"+
			"\1\3\1\uffff\1\3\27\uffff\1\3",
			"\1\3\36\uffff\1\33\7\uffff\3\33\11\uffff\1\33\1\uffff\1\3\30\uffff\2"+
			"\33\3\uffff\1\33\15\uffff\1\3\1\uffff\1\33\11\uffff\1\3\17\uffff\1\33"+
			"\7\uffff\1\3\4\uffff\1\3\1\uffff\1\3\13\uffff\1\3\1\33\1\3\14\uffff\1"+
			"\3\4\uffff\1\3\12\uffff\1\105\6\uffff\1\3\23\uffff\1\3\35\uffff\1\33"+
			"\1\uffff\1\3\1\uffff\1\3\24\uffff\1\3\5\uffff\1\3\12\uffff\1\33\1\uffff"+
			"\1\3\7\uffff\2\33\12\uffff\3\33\14\uffff\1\3\1\33\21\uffff\1\33\6\uffff"+
			"\1\3\1\uffff\1\3\27\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\13\uffff\10\3\1\uffff\1\3\1\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\2\3\1\uffff\3\3\1\uffff\2\3\1\uffff\5\3\1\uffff\5\3\1\uffff\2"+
			"\3\1\uffff\4\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\1\uffff\6\3\1\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\4\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\5\3\2\uffff\2\3\1\uffff\6\3\4\uffff\2\3\3\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\3\3\2\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\3\3\1\uffff\5\3\3\uffff\1\3\1\uffff\3\3\1\uffff\5\3\1\uffff\6\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\1\3\1\uffff\4\3\3\uffff\12\3\1\uffff\1\3\2\uffff\2\3\4\uffff"+
			"\4\3\1\uffff\4\3\1\uffff\12\3\1\uffff\7\3\2\uffff\1\3\1\uffff\3\3\2\uffff"+
			"\3\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\3\3\1\uffff\1\3\1\uffff\5\3\2\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\1\33\2\uffff\1\3\2\uffff\1\3\2\uffff\3\3\10\uffff\3\3\45"+
			"\uffff\1\3\44\uffff\1\3\57\uffff\1\3\3\uffff\1\3\56\uffff\1\3\3\uffff"+
			"\1\3\31\uffff\1\3\6\uffff\1\3\74\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\13\uffff\10\3\1\uffff\1\3\1\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\2\3\1\uffff\3\3\1\uffff\2\3\1\uffff\5\3\1\uffff\5\3\1\uffff\2"+
			"\3\1\uffff\4\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\1\uffff\6\3\1\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\4\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\5\3\2\uffff\2\3\1\uffff\6\3\4\uffff\2\3\3\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\3\3\2\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\3\3\1\uffff\5\3\3\uffff\1\3\1\uffff\3\3\1\uffff\5\3\1\uffff\6\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\1\3\1\uffff\4\3\3\uffff\12\3\1\uffff\1\3\2\uffff\2\3\4\uffff"+
			"\4\3\1\uffff\4\3\1\uffff\12\3\1\uffff\7\3\2\uffff\1\3\1\uffff\3\3\2\uffff"+
			"\3\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\3\3\1\uffff\1\3\1\uffff\5\3\2\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\1\33\2\uffff\1\3\2\uffff\1\3\2\uffff\3\3\10\uffff\3\3\45"+
			"\uffff\1\3\44\uffff\1\3\57\uffff\1\3\3\uffff\1\3\56\uffff\1\3\3\uffff"+
			"\1\3\31\uffff\1\3\6\uffff\1\3\74\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
	static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
	static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
	static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
	static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
	static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
	static final short[][] DFA7_transition;

	static {
		int numStates = DFA7_transitionS.length;
		DFA7_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
		}
	}

	protected class DFA7 extends DFA {

		public DFA7(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 7;
			this.eot = DFA7_eot;
			this.eof = DFA7_eof;
			this.min = DFA7_min;
			this.max = DFA7_max;
			this.accept = DFA7_accept;
			this.special = DFA7_special;
			this.transition = DFA7_transition;
		}
		@Override
		public String getDescription() {
			return "75:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA13_eotS =
		"\u00ed\uffff";
	static final String DFA13_eofS =
		"\2\uffff\2\4\4\uffff\1\4\11\uffff\1\4\u00da\uffff";
	static final String DFA13_minS =
		"\1\14\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\11\uffff\1\30\61\uffff\1\30"+
		"\60\uffff\1\30\60\uffff\1\30\61\uffff\2\0\1\uffff\2\0\1\uffff\2\0\1\uffff"+
		"\2\0";
	static final String DFA13_maxS =
		"\1\u0292\1\uffff\2\u0292\4\uffff\1\u0292\11\uffff\1\u0292\11\uffff\1\u0292"+
		"\61\uffff\1\u0292\60\uffff\1\u0292\60\uffff\1\u0292\61\uffff\2\0\1\uffff"+
		"\2\0\1\uffff\2\0\1\uffff\2\0";
	static final String DFA13_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\u00dc\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff"+
		"\1\1\2\uffff";
	static final String DFA13_specialS =
		"\1\0\33\uffff\1\1\61\uffff\1\2\60\uffff\1\3\60\uffff\1\4\61\uffff\1\5"+
		"\1\6\1\uffff\1\7\1\10\1\uffff\1\11\1\12\1\uffff\1\13\1\14}>";
	static final String[] DFA13_transitionS = {
			"\1\4\13\uffff\1\2\1\4\6\22\1\uffff\1\22\1\uffff\1\22\3\uffff\1\22\1\4"+
			"\1\uffff\2\22\1\uffff\2\22\1\uffff\3\4\1\uffff\2\22\1\uffff\2\22\2\4"+
			"\1\22\1\uffff\5\22\1\uffff\2\22\1\uffff\4\22\2\uffff\1\22\4\uffff\2\4"+
			"\1\uffff\1\22\1\uffff\1\22\1\3\4\22\1\uffff\3\22\1\uffff\3\22\1\uffff"+
			"\4\22\1\uffff\2\22\1\4\1\22\1\uffff\2\22\1\uffff\1\22\1\uffff\2\22\2"+
			"\uffff\1\22\1\4\3\22\2\uffff\2\4\1\uffff\4\22\2\4\4\uffff\2\22\3\uffff"+
			"\1\22\1\uffff\1\22\1\4\1\uffff\2\22\1\4\2\uffff\2\22\1\uffff\3\22\1\uffff"+
			"\1\4\1\uffff\1\4\2\uffff\3\22\1\uffff\5\22\3\uffff\1\22\1\uffff\3\22"+
			"\1\uffff\5\22\1\uffff\1\22\1\4\4\22\1\uffff\1\22\1\uffff\2\22\1\uffff"+
			"\2\22\1\uffff\2\22\1\4\1\22\1\4\1\22\1\uffff\1\22\2\uffff\2\22\1\uffff"+
			"\1\22\2\uffff\2\22\1\uffff\2\22\1\uffff\3\22\1\uffff\4\22\4\uffff\1\22"+
			"\1\uffff\4\22\1\uffff\1\22\1\uffff\1\4\3\22\3\uffff\12\22\1\uffff\1\22"+
			"\2\uffff\2\22\4\uffff\4\22\1\uffff\4\22\1\uffff\5\22\1\4\4\22\1\uffff"+
			"\7\22\2\uffff\1\22\1\uffff\3\22\2\uffff\2\4\1\22\1\uffff\4\22\2\uffff"+
			"\1\4\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\10\4\22\1\uffff"+
			"\2\22\2\uffff\3\22\1\uffff\1\22\1\uffff\5\22\2\uffff\1\22\2\uffff\5\22"+
			"\4\uffff\1\4\2\uffff\1\4\2\uffff\3\4\10\uffff\1\1\2\4\45\uffff\1\22\44"+
			"\uffff\1\22\57\uffff\1\22\3\uffff\1\22\56\uffff\1\22\3\uffff\1\22\31"+
			"\uffff\1\22\6\uffff\1\22\74\uffff\1\22",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\34\1\uffff\2\4\1\uffff\2\4\1"+
			"\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\uffff\3"+
			"\4\1\uffff\3\4\4\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\4\4\2\uffff\1\4\7\uffff\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\3\4\1\uffff\1\4\1\uffff\3\4\5\uffff\4\4\6\uffff\3\4\2\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\3\4\2\uffff\3\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\6\4\2\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff\4\4\2\uffff\2\4\1\uffff\2\4\1\uffff"+
			"\3\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\13\4\1\uffff\1\4\1\uffff\3\4\4\uffff\11\4\1\uffff\5\4\1\uffff\4\4\1"+
			"\uffff\7\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\4\4\4\uffff\1"+
			"\4\1\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\1\uffff\1\4\1\uffff"+
			"\5\4\1\uffff\3\4\1\uffff\5\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
			"\1\4\4\uffff\1\4\3\uffff\1\4\47\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3"+
			"\uffff\1\4\56\uffff\1\4\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff"+
			"\1\4",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\116\1\uffff\2\4\1\uffff\2\4\1"+
			"\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\uffff\3"+
			"\4\1\uffff\3\4\4\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\4\4\2\uffff\1\4\7\uffff\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\3\4\1\uffff\1\4\1\uffff\3\4\5\uffff\4\4\6\uffff\3\4\2\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\3\4\2\uffff\3\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\6\4\2\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff\4\4\2\uffff\2\4\1\uffff\2\4\1\uffff"+
			"\3\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\13\4\1\uffff\1\4\1\uffff\3\4\4\uffff\11\4\1\uffff\5\4\1\uffff\4\4\1"+
			"\uffff\7\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\4\4\4\uffff\1"+
			"\4\1\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\1\uffff\1\4\1\uffff"+
			"\5\4\1\uffff\3\4\1\uffff\5\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
			"\1\4\4\uffff\1\4\3\uffff\2\4\46\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3"+
			"\uffff\1\4\56\uffff\1\4\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff"+
			"\1\4",
			"",
			"",
			"",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\177\1\uffff\2\4\1\uffff\2\4\1"+
			"\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\uffff\3"+
			"\4\1\uffff\3\4\4\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\4\4\2\uffff\1\4\7\uffff\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\3\4\1\uffff\1\4\1\uffff\3\4\5\uffff\4\4\6\uffff\3\4\2\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\3\4\2\uffff\3\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\6\4\2\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff\4\4\2\uffff\2\4\1\uffff\2\4\1\uffff"+
			"\3\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\13\4\1\uffff\1\4\1\uffff\3\4\4\uffff\11\4\1\uffff\5\4\1\uffff\4\4\1"+
			"\uffff\7\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\4\4\4\uffff\1"+
			"\4\1\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\1\uffff\1\4\1\uffff"+
			"\5\4\1\uffff\3\4\1\uffff\5\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
			"\1\4\4\uffff\1\4\3\uffff\1\4\47\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3"+
			"\uffff\1\4\56\uffff\1\4\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff"+
			"\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\u00b0\1\uffff\2\4\1\uffff\2\4"+
			"\1\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff\2\4\2\uffff\1\4\1\uffff"+
			"\3\4\1\uffff\3\4\4\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\5\4\1\uffff"+
			"\2\4\1\uffff\4\4\2\uffff\1\4\7\uffff\1\4\1\uffff\6\4\1\uffff\3\4\1\uffff"+
			"\3\4\1\uffff\4\4\1\uffff\2\4\1\uffff\1\4\1\uffff\2\4\1\uffff\1\4\1\uffff"+
			"\3\4\1\uffff\1\4\1\uffff\3\4\5\uffff\4\4\6\uffff\3\4\2\uffff\1\4\1\uffff"+
			"\1\4\1\uffff\3\4\2\uffff\3\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\6\4\2\uffff\5\4\1\uffff\5\4\1\uffff\6\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
			"\4\4\1\uffff\1\4\1\uffff\1\4\2\uffff\4\4\2\uffff\2\4\1\uffff\2\4\1\uffff"+
			"\3\4\1\uffff\4\4\4\uffff\1\4\1\uffff\4\4\1\uffff\1\4\2\uffff\4\4\1\uffff"+
			"\13\4\1\uffff\1\4\1\uffff\3\4\4\uffff\11\4\1\uffff\5\4\1\uffff\4\4\1"+
			"\uffff\7\4\2\uffff\1\4\1\uffff\3\4\4\uffff\1\4\1\uffff\4\4\4\uffff\1"+
			"\4\1\uffff\3\4\2\uffff\5\4\1\uffff\2\4\2\uffff\3\4\1\uffff\1\4\1\uffff"+
			"\5\4\1\uffff\3\4\1\uffff\5\4\1\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff"+
			"\1\4\4\uffff\1\4\3\uffff\1\4\47\uffff\1\4\44\uffff\1\4\57\uffff\1\4\3"+
			"\uffff\1\4\56\uffff\1\4\3\uffff\1\4\31\uffff\1\4\6\uffff\1\4\74\uffff"+
			"\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e2\1\uffff\6\u00e3\1\uffff\1\u00e3\1\uffff\1\u00e3\3\uffff\1\u00e3"+
			"\2\uffff\2\u00e3\1\uffff\2\u00e3\5\uffff\2\u00e3\1\uffff\2\u00e3\2\uffff"+
			"\1\u00e3\1\uffff\5\u00e3\1\uffff\2\u00e3\1\uffff\4\u00e3\2\uffff\1\u00e3"+
			"\7\uffff\1\u00e3\1\uffff\6\u00e3\1\uffff\3\u00e3\1\uffff\3\u00e3\1\uffff"+
			"\4\u00e3\1\uffff\2\u00e3\1\uffff\1\u00e3\1\uffff\2\u00e3\1\uffff\1\u00e3"+
			"\1\uffff\2\u00e3\2\uffff\1\u00e3\1\uffff\3\u00e3\5\uffff\4\u00e3\6\uffff"+
			"\2\u00e3\3\uffff\1\u00e3\1\uffff\1\u00e3\2\uffff\2\u00e3\3\uffff\2\u00e3"+
			"\1\uffff\3\u00e3\6\uffff\3\u00e3\1\uffff\5\u00e3\3\uffff\1\u00e3\1\uffff"+
			"\3\u00e3\1\uffff\5\u00e3\1\uffff\1\u00e3\1\uffff\4\u00e3\1\uffff\1\u00e3"+
			"\1\uffff\2\u00e3\1\uffff\2\u00e3\1\uffff\2\u00e3\1\uffff\1\u00e3\1\uffff"+
			"\1\u00e3\1\uffff\1\u00e3\2\uffff\2\u00e3\1\uffff\1\u00e3\2\uffff\2\u00e3"+
			"\1\uffff\2\u00e3\1\uffff\3\u00e3\1\uffff\4\u00e3\4\uffff\1\u00e3\1\uffff"+
			"\4\u00e3\1\uffff\1\u00e3\2\uffff\3\u00e3\3\uffff\12\u00e3\1\uffff\1\u00e3"+
			"\2\uffff\2\u00e3\4\uffff\4\u00e3\1\uffff\4\u00e3\1\uffff\5\u00e3\1\uffff"+
			"\4\u00e3\1\uffff\7\u00e3\2\uffff\1\u00e3\1\uffff\3\u00e3\4\uffff\1\u00e3"+
			"\1\uffff\4\u00e3\4\uffff\1\u00e3\1\uffff\1\u00e3\1\uffff\1\u00e3\2\uffff"+
			"\5\u00e3\1\uffff\2\u00e3\2\uffff\3\u00e3\1\uffff\1\u00e3\1\uffff\5\u00e3"+
			"\2\uffff\1\u00e3\2\uffff\5\u00e3\25\uffff\1\u00e1\47\uffff\1\u00e3\44"+
			"\uffff\1\u00e3\57\uffff\1\u00e3\3\uffff\1\u00e3\56\uffff\1\u00e3\3\uffff"+
			"\1\u00e3\31\uffff\1\u00e3\6\uffff\1\u00e3\74\uffff\1\u00e3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e5\1\uffff\6\u00e6\1\uffff\1\u00e6\1\uffff\1\u00e6\3\uffff\1\u00e6"+
			"\2\uffff\2\u00e6\1\uffff\2\u00e6\5\uffff\2\u00e6\1\uffff\2\u00e6\2\uffff"+
			"\1\u00e6\1\uffff\5\u00e6\1\uffff\2\u00e6\1\uffff\4\u00e6\2\uffff\1\u00e6"+
			"\7\uffff\1\u00e6\1\uffff\6\u00e6\1\uffff\3\u00e6\1\uffff\3\u00e6\1\uffff"+
			"\4\u00e6\1\uffff\2\u00e6\1\uffff\1\u00e6\1\uffff\2\u00e6\1\uffff\1\u00e6"+
			"\1\uffff\2\u00e6\2\uffff\1\u00e6\1\uffff\3\u00e6\5\uffff\4\u00e6\6\uffff"+
			"\2\u00e6\3\uffff\1\u00e6\1\uffff\1\u00e6\2\uffff\2\u00e6\3\uffff\2\u00e6"+
			"\1\uffff\3\u00e6\6\uffff\3\u00e6\1\uffff\5\u00e6\3\uffff\1\u00e6\1\uffff"+
			"\3\u00e6\1\uffff\5\u00e6\1\uffff\1\u00e6\1\uffff\4\u00e6\1\uffff\1\u00e6"+
			"\1\uffff\2\u00e6\1\uffff\2\u00e6\1\uffff\2\u00e6\1\uffff\1\u00e6\1\uffff"+
			"\1\u00e6\1\uffff\1\u00e6\2\uffff\2\u00e6\1\uffff\1\u00e6\2\uffff\2\u00e6"+
			"\1\uffff\2\u00e6\1\uffff\3\u00e6\1\uffff\4\u00e6\4\uffff\1\u00e6\1\uffff"+
			"\4\u00e6\1\uffff\1\u00e6\2\uffff\3\u00e6\3\uffff\12\u00e6\1\uffff\1\u00e6"+
			"\2\uffff\2\u00e6\4\uffff\4\u00e6\1\uffff\4\u00e6\1\uffff\5\u00e6\1\uffff"+
			"\4\u00e6\1\uffff\7\u00e6\2\uffff\1\u00e6\1\uffff\3\u00e6\4\uffff\1\u00e6"+
			"\1\uffff\4\u00e6\4\uffff\1\u00e6\1\uffff\1\u00e6\1\uffff\1\u00e6\2\uffff"+
			"\5\u00e6\1\uffff\2\u00e6\2\uffff\3\u00e6\1\uffff\1\u00e6\1\uffff\5\u00e6"+
			"\2\uffff\1\u00e6\2\uffff\5\u00e6\25\uffff\1\u00e4\47\uffff\1\u00e6\44"+
			"\uffff\1\u00e6\57\uffff\1\u00e6\3\uffff\1\u00e6\56\uffff\1\u00e6\3\uffff"+
			"\1\u00e6\31\uffff\1\u00e6\6\uffff\1\u00e6\74\uffff\1\u00e6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00e8\1\uffff\6\u00e9\1\uffff\1\u00e9\1\uffff\1\u00e9\3\uffff\1\u00e9"+
			"\2\uffff\2\u00e9\1\uffff\2\u00e9\5\uffff\2\u00e9\1\uffff\2\u00e9\2\uffff"+
			"\1\u00e9\1\uffff\5\u00e9\1\uffff\2\u00e9\1\uffff\4\u00e9\2\uffff\1\u00e9"+
			"\7\uffff\1\u00e9\1\uffff\6\u00e9\1\uffff\3\u00e9\1\uffff\3\u00e9\1\uffff"+
			"\4\u00e9\1\uffff\2\u00e9\1\uffff\1\u00e9\1\uffff\2\u00e9\1\uffff\1\u00e9"+
			"\1\uffff\2\u00e9\2\uffff\1\u00e9\1\uffff\3\u00e9\5\uffff\4\u00e9\6\uffff"+
			"\2\u00e9\3\uffff\1\u00e9\1\uffff\1\u00e9\2\uffff\2\u00e9\3\uffff\2\u00e9"+
			"\1\uffff\3\u00e9\6\uffff\3\u00e9\1\uffff\5\u00e9\3\uffff\1\u00e9\1\uffff"+
			"\3\u00e9\1\uffff\5\u00e9\1\uffff\1\u00e9\1\uffff\4\u00e9\1\uffff\1\u00e9"+
			"\1\uffff\2\u00e9\1\uffff\2\u00e9\1\uffff\2\u00e9\1\uffff\1\u00e9\1\uffff"+
			"\1\u00e9\1\uffff\1\u00e9\2\uffff\2\u00e9\1\uffff\1\u00e9\2\uffff\2\u00e9"+
			"\1\uffff\2\u00e9\1\uffff\3\u00e9\1\uffff\4\u00e9\4\uffff\1\u00e9\1\uffff"+
			"\4\u00e9\1\uffff\1\u00e9\2\uffff\3\u00e9\3\uffff\12\u00e9\1\uffff\1\u00e9"+
			"\2\uffff\2\u00e9\4\uffff\4\u00e9\1\uffff\4\u00e9\1\uffff\5\u00e9\1\uffff"+
			"\4\u00e9\1\uffff\7\u00e9\2\uffff\1\u00e9\1\uffff\3\u00e9\4\uffff\1\u00e9"+
			"\1\uffff\4\u00e9\4\uffff\1\u00e9\1\uffff\1\u00e9\1\uffff\1\u00e9\2\uffff"+
			"\5\u00e9\1\uffff\2\u00e9\2\uffff\3\u00e9\1\uffff\1\u00e9\1\uffff\5\u00e9"+
			"\2\uffff\1\u00e9\2\uffff\5\u00e9\25\uffff\1\u00e7\47\uffff\1\u00e9\44"+
			"\uffff\1\u00e9\57\uffff\1\u00e9\3\uffff\1\u00e9\56\uffff\1\u00e9\3\uffff"+
			"\1\u00e9\31\uffff\1\u00e9\6\uffff\1\u00e9\74\uffff\1\u00e9",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00eb\1\uffff\6\u00ec\1\uffff\1\u00ec\1\uffff\1\u00ec\3\uffff\1\u00ec"+
			"\2\uffff\2\u00ec\1\uffff\2\u00ec\5\uffff\2\u00ec\1\uffff\2\u00ec\2\uffff"+
			"\1\u00ec\1\uffff\5\u00ec\1\uffff\2\u00ec\1\uffff\4\u00ec\2\uffff\1\u00ec"+
			"\7\uffff\1\u00ec\1\uffff\6\u00ec\1\uffff\3\u00ec\1\uffff\3\u00ec\1\uffff"+
			"\4\u00ec\1\uffff\2\u00ec\1\uffff\1\u00ec\1\uffff\2\u00ec\1\uffff\1\u00ec"+
			"\1\uffff\2\u00ec\2\uffff\1\u00ec\1\uffff\3\u00ec\5\uffff\4\u00ec\6\uffff"+
			"\2\u00ec\3\uffff\1\u00ec\1\uffff\1\u00ec\2\uffff\2\u00ec\3\uffff\2\u00ec"+
			"\1\uffff\3\u00ec\6\uffff\3\u00ec\1\uffff\5\u00ec\3\uffff\1\u00ec\1\uffff"+
			"\3\u00ec\1\uffff\5\u00ec\1\uffff\1\u00ec\1\uffff\4\u00ec\1\uffff\1\u00ec"+
			"\1\uffff\2\u00ec\1\uffff\2\u00ec\1\uffff\2\u00ec\1\uffff\1\u00ec\1\uffff"+
			"\1\u00ec\1\uffff\1\u00ec\2\uffff\2\u00ec\1\uffff\1\u00ec\2\uffff\2\u00ec"+
			"\1\uffff\2\u00ec\1\uffff\3\u00ec\1\uffff\4\u00ec\4\uffff\1\u00ec\1\uffff"+
			"\4\u00ec\1\uffff\1\u00ec\2\uffff\3\u00ec\3\uffff\12\u00ec\1\uffff\1\u00ec"+
			"\2\uffff\2\u00ec\4\uffff\4\u00ec\1\uffff\4\u00ec\1\uffff\5\u00ec\1\uffff"+
			"\4\u00ec\1\uffff\7\u00ec\2\uffff\1\u00ec\1\uffff\3\u00ec\4\uffff\1\u00ec"+
			"\1\uffff\4\u00ec\4\uffff\1\u00ec\1\uffff\1\u00ec\1\uffff\1\u00ec\2\uffff"+
			"\5\u00ec\1\uffff\2\u00ec\2\uffff\3\u00ec\1\uffff\1\u00ec\1\uffff\5\u00ec"+
			"\2\uffff\1\u00ec\2\uffff\5\u00ec\25\uffff\1\u00ea\47\uffff\1\u00ec\44"+
			"\uffff\1\u00ec\57\uffff\1\u00ec\3\uffff\1\u00ec\56\uffff\1\u00ec\3\uffff"+
			"\1\u00ec\31\uffff\1\u00ec\6\uffff\1\u00ec\74\uffff\1\u00ec",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff"
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
			return "80:1: selectItem : ( ( tableAllColumns )=> tableAllColumns -> ^( TOK_SELEXPR tableAllColumns ) | ( expression ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )? ) -> ^( TOK_SELEXPR expression ( identifier )* ) );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA13_0 = input.LA(1);
						 
						int index13_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_0==STAR) && (synpred1_SelectClauseParser())) {s = 1;}
						else if ( (LA13_0==Identifier) ) {s = 2;}
						else if ( (LA13_0==KW_DATE) ) {s = 3;}
						else if ( (LA13_0==CharSetName||LA13_0==IntegralLiteral||LA13_0==KW_ARRAY||(LA13_0 >= KW_BIGINT && LA13_0 <= KW_BOOLEAN)||(LA13_0 >= KW_CASE && LA13_0 <= KW_CAST)||(LA13_0 >= KW_CURRENT_DATE && LA13_0 <= KW_CURRENT_TIMESTAMP)||LA13_0==KW_DOUBLE||LA13_0==KW_EXISTS||(LA13_0 >= KW_EXTRACT && LA13_0 <= KW_FALSE)||(LA13_0 >= KW_FLOAT && LA13_0 <= KW_FLOOR)||LA13_0==KW_GROUPING||LA13_0==KW_IF||LA13_0==KW_INT||LA13_0==KW_INTERVAL||LA13_0==KW_MAP||LA13_0==KW_NOT||LA13_0==KW_NULL||LA13_0==KW_REAL||LA13_0==KW_SMALLINT||(LA13_0 >= KW_TIMESTAMP && LA13_0 <= KW_TIMESTAMPLOCALTZ)||LA13_0==KW_TRUE||LA13_0==LPAREN||LA13_0==MINUS||(LA13_0 >= Number && LA13_0 <= PLUS)||(LA13_0 >= StringLiteral && LA13_0 <= TILDE)) ) {s = 4;}
						else if ( (LA13_0==KW_UNKNOWN) ) {s = 8;}
						else if ( ((LA13_0 >= KW_ABORT && LA13_0 <= KW_AFTER)||LA13_0==KW_ALLOC_FRACTION||LA13_0==KW_ANALYZE||LA13_0==KW_ARCHIVE||(LA13_0 >= KW_ASC && LA13_0 <= KW_AST)||(LA13_0 >= KW_AUTOCOMMIT && LA13_0 <= KW_BEFORE)||(LA13_0 >= KW_BUCKET && LA13_0 <= KW_BUCKETS)||(LA13_0 >= KW_CACHE && LA13_0 <= KW_CASCADE)||LA13_0==KW_CHANGE||(LA13_0 >= KW_CHECK && LA13_0 <= KW_COLLECTION)||(LA13_0 >= KW_COLUMNS && LA13_0 <= KW_COMMENT)||(LA13_0 >= KW_COMPACT && LA13_0 <= KW_CONCATENATE)||LA13_0==KW_CONTINUE||LA13_0==KW_DATA||LA13_0==KW_DATABASES||(LA13_0 >= KW_DATETIME && LA13_0 <= KW_DEBUG)||(LA13_0 >= KW_DEFAULT && LA13_0 <= KW_DEFINED)||(LA13_0 >= KW_DELIMITED && LA13_0 <= KW_DESC)||(LA13_0 >= KW_DETAIL && LA13_0 <= KW_DISABLE)||(LA13_0 >= KW_DISTRIBUTE && LA13_0 <= KW_DO)||LA13_0==KW_DOW||(LA13_0 >= KW_DUMP && LA13_0 <= KW_ELEM_TYPE)||LA13_0==KW_ENABLE||(LA13_0 >= KW_ENFORCED && LA13_0 <= KW_ESCAPED)||LA13_0==KW_EXCLUSIVE||(LA13_0 >= KW_EXPLAIN && LA13_0 <= KW_EXPRESSION)||(LA13_0 >= KW_FIELDS && LA13_0 <= KW_FIRST)||(LA13_0 >= KW_FORMAT && LA13_0 <= KW_FORMATTED)||LA13_0==KW_FUNCTIONS||LA13_0==KW_GROUP||(LA13_0 >= KW_HOUR && LA13_0 <= KW_IDXPROPERTIES)||(LA13_0 >= KW_INDEX && LA13_0 <= KW_INDEXES)||(LA13_0 >= KW_INPATH && LA13_0 <= KW_INPUTFORMAT)||(LA13_0 >= KW_ISOLATION && LA13_0 <= KW_JAR)||(LA13_0 >= KW_KEY && LA13_0 <= KW_LAST)||LA13_0==KW_LEVEL||(LA13_0 >= KW_LIMIT && LA13_0 <= KW_LOAD)||(LA13_0 >= KW_LOCATION && LA13_0 <= KW_LONG)||LA13_0==KW_MANAGEMENT||(LA13_0 >= KW_MAPJOIN && LA13_0 <= KW_MATERIALIZED)||LA13_0==KW_METADATA||(LA13_0 >= KW_MINUTE && LA13_0 <= KW_MONTH)||(LA13_0 >= KW_MOVE && LA13_0 <= KW_MSCK)||(LA13_0 >= KW_NORELY && LA13_0 <= KW_NOSCAN)||LA13_0==KW_NOVALIDATE||LA13_0==KW_NULLS||LA13_0==KW_OFFSET||(LA13_0 >= KW_OPERATOR && LA13_0 <= KW_OPTION)||LA13_0==KW_ORDER||(LA13_0 >= KW_OUTPUTDRIVER && LA13_0 <= KW_OUTPUTFORMAT)||(LA13_0 >= KW_OVERWRITE && LA13_0 <= KW_OWNER)||(LA13_0 >= KW_PARTITIONED && LA13_0 <= KW_PATH)||(LA13_0 >= KW_PLAN && LA13_0 <= KW_POOL)||LA13_0==KW_PRINCIPALS||(LA13_0 >= KW_PURGE && LA13_0 <= KW_QUERY_PARALLELISM)||LA13_0==KW_READ||(LA13_0 >= KW_REBUILD && LA13_0 <= KW_RECORDWRITER)||(LA13_0 >= KW_RELOAD && LA13_0 <= KW_RESTRICT)||LA13_0==KW_REWRITE||(LA13_0 >= KW_ROLE && LA13_0 <= KW_ROLES)||(LA13_0 >= KW_SCHEDULING_POLICY && LA13_0 <= KW_SECOND)||(LA13_0 >= KW_SEMI && LA13_0 <= KW_SERVER)||(LA13_0 >= KW_SETS && LA13_0 <= KW_SKEWED)||(LA13_0 >= KW_SNAPSHOT && LA13_0 <= KW_SSL)||(LA13_0 >= KW_STATISTICS && LA13_0 <= KW_SUMMARY)||LA13_0==KW_TABLES||(LA13_0 >= KW_TBLPROPERTIES && LA13_0 <= KW_TERMINATED)||LA13_0==KW_TINYINT||(LA13_0 >= KW_TOUCH && LA13_0 <= KW_TRANSACTIONS)||LA13_0==KW_UNARCHIVE||LA13_0==KW_UNDO||LA13_0==KW_UNIONTYPE||(LA13_0 >= KW_UNLOCK && LA13_0 <= KW_UNSIGNED)||(LA13_0 >= KW_URI && LA13_0 <= KW_USE)||(LA13_0 >= KW_UTC && LA13_0 <= KW_VALIDATE)||LA13_0==KW_VALUE_TYPE||(LA13_0 >= KW_VECTORIZATION && LA13_0 <= KW_WEEK)||LA13_0==KW_WHILE||(LA13_0 >= KW_WORK && LA13_0 <= KW_ZONE)||LA13_0==KW_BATCH||LA13_0==KW_DAYOFWEEK||LA13_0==KW_HOLD_DDLTIME||LA13_0==KW_IGNORE||LA13_0==KW_NO_DROP||LA13_0==KW_OFFLINE||LA13_0==KW_PROTECTION||LA13_0==KW_READONLY||LA13_0==KW_TIMESTAMPTZ) ) {s = 18;}
						 
						input.seek(index13_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA13_28 = input.LA(1);
						 
						int index13_28 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_28==STAR) && (synpred1_SelectClauseParser())) {s = 225;}
						else if ( (LA13_28==Identifier) ) {s = 226;}
						else if ( ((LA13_28 >= KW_ABORT && LA13_28 <= KW_AFTER)||LA13_28==KW_ALLOC_FRACTION||LA13_28==KW_ANALYZE||LA13_28==KW_ARCHIVE||(LA13_28 >= KW_ASC && LA13_28 <= KW_AST)||(LA13_28 >= KW_AUTOCOMMIT && LA13_28 <= KW_BEFORE)||(LA13_28 >= KW_BUCKET && LA13_28 <= KW_BUCKETS)||(LA13_28 >= KW_CACHE && LA13_28 <= KW_CASCADE)||LA13_28==KW_CHANGE||(LA13_28 >= KW_CHECK && LA13_28 <= KW_COLLECTION)||(LA13_28 >= KW_COLUMNS && LA13_28 <= KW_COMMENT)||(LA13_28 >= KW_COMPACT && LA13_28 <= KW_CONCATENATE)||LA13_28==KW_CONTINUE||LA13_28==KW_DATA||(LA13_28 >= KW_DATABASES && LA13_28 <= KW_DEBUG)||(LA13_28 >= KW_DEFAULT && LA13_28 <= KW_DEFINED)||(LA13_28 >= KW_DELIMITED && LA13_28 <= KW_DESC)||(LA13_28 >= KW_DETAIL && LA13_28 <= KW_DISABLE)||(LA13_28 >= KW_DISTRIBUTE && LA13_28 <= KW_DO)||LA13_28==KW_DOW||(LA13_28 >= KW_DUMP && LA13_28 <= KW_ELEM_TYPE)||LA13_28==KW_ENABLE||(LA13_28 >= KW_ENFORCED && LA13_28 <= KW_ESCAPED)||LA13_28==KW_EXCLUSIVE||(LA13_28 >= KW_EXPLAIN && LA13_28 <= KW_EXPRESSION)||(LA13_28 >= KW_FIELDS && LA13_28 <= KW_FIRST)||(LA13_28 >= KW_FORMAT && LA13_28 <= KW_FORMATTED)||LA13_28==KW_FUNCTIONS||LA13_28==KW_GROUP||(LA13_28 >= KW_HOUR && LA13_28 <= KW_IDXPROPERTIES)||(LA13_28 >= KW_INDEX && LA13_28 <= KW_INDEXES)||(LA13_28 >= KW_INPATH && LA13_28 <= KW_INPUTFORMAT)||(LA13_28 >= KW_ISOLATION && LA13_28 <= KW_JAR)||(LA13_28 >= KW_KEY && LA13_28 <= KW_LAST)||LA13_28==KW_LEVEL||(LA13_28 >= KW_LIMIT && LA13_28 <= KW_LOAD)||(LA13_28 >= KW_LOCATION && LA13_28 <= KW_LONG)||LA13_28==KW_MANAGEMENT||(LA13_28 >= KW_MAPJOIN && LA13_28 <= KW_MATERIALIZED)||LA13_28==KW_METADATA||(LA13_28 >= KW_MINUTE && LA13_28 <= KW_MONTH)||(LA13_28 >= KW_MOVE && LA13_28 <= KW_MSCK)||(LA13_28 >= KW_NORELY && LA13_28 <= KW_NOSCAN)||LA13_28==KW_NOVALIDATE||LA13_28==KW_NULLS||LA13_28==KW_OFFSET||(LA13_28 >= KW_OPERATOR && LA13_28 <= KW_OPTION)||LA13_28==KW_ORDER||(LA13_28 >= KW_OUTPUTDRIVER && LA13_28 <= KW_OUTPUTFORMAT)||(LA13_28 >= KW_OVERWRITE && LA13_28 <= KW_OWNER)||(LA13_28 >= KW_PARTITIONED && LA13_28 <= KW_PATH)||(LA13_28 >= KW_PLAN && LA13_28 <= KW_POOL)||LA13_28==KW_PRINCIPALS||(LA13_28 >= KW_PURGE && LA13_28 <= KW_QUERY_PARALLELISM)||LA13_28==KW_READ||(LA13_28 >= KW_REBUILD && LA13_28 <= KW_RECORDWRITER)||(LA13_28 >= KW_RELOAD && LA13_28 <= KW_RESTRICT)||LA13_28==KW_REWRITE||(LA13_28 >= KW_ROLE && LA13_28 <= KW_ROLES)||(LA13_28 >= KW_SCHEDULING_POLICY && LA13_28 <= KW_SECOND)||(LA13_28 >= KW_SEMI && LA13_28 <= KW_SERVER)||(LA13_28 >= KW_SETS && LA13_28 <= KW_SKEWED)||(LA13_28 >= KW_SNAPSHOT && LA13_28 <= KW_SSL)||(LA13_28 >= KW_STATISTICS && LA13_28 <= KW_SUMMARY)||LA13_28==KW_TABLES||(LA13_28 >= KW_TBLPROPERTIES && LA13_28 <= KW_TERMINATED)||LA13_28==KW_TINYINT||(LA13_28 >= KW_TOUCH && LA13_28 <= KW_TRANSACTIONS)||LA13_28==KW_UNARCHIVE||LA13_28==KW_UNDO||LA13_28==KW_UNIONTYPE||(LA13_28 >= KW_UNKNOWN && LA13_28 <= KW_UNSIGNED)||(LA13_28 >= KW_URI && LA13_28 <= KW_USE)||(LA13_28 >= KW_UTC && LA13_28 <= KW_VALIDATE)||LA13_28==KW_VALUE_TYPE||(LA13_28 >= KW_VECTORIZATION && LA13_28 <= KW_WEEK)||LA13_28==KW_WHILE||(LA13_28 >= KW_WORK && LA13_28 <= KW_ZONE)||LA13_28==KW_BATCH||LA13_28==KW_DAYOFWEEK||LA13_28==KW_HOLD_DDLTIME||LA13_28==KW_IGNORE||LA13_28==KW_NO_DROP||LA13_28==KW_OFFLINE||LA13_28==KW_PROTECTION||LA13_28==KW_READONLY||LA13_28==KW_TIMESTAMPTZ) ) {s = 227;}
						 
						input.seek(index13_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA13_78 = input.LA(1);
						 
						int index13_78 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_78==STAR) && (synpred1_SelectClauseParser())) {s = 228;}
						else if ( (LA13_78==Identifier) ) {s = 229;}
						else if ( ((LA13_78 >= KW_ABORT && LA13_78 <= KW_AFTER)||LA13_78==KW_ALLOC_FRACTION||LA13_78==KW_ANALYZE||LA13_78==KW_ARCHIVE||(LA13_78 >= KW_ASC && LA13_78 <= KW_AST)||(LA13_78 >= KW_AUTOCOMMIT && LA13_78 <= KW_BEFORE)||(LA13_78 >= KW_BUCKET && LA13_78 <= KW_BUCKETS)||(LA13_78 >= KW_CACHE && LA13_78 <= KW_CASCADE)||LA13_78==KW_CHANGE||(LA13_78 >= KW_CHECK && LA13_78 <= KW_COLLECTION)||(LA13_78 >= KW_COLUMNS && LA13_78 <= KW_COMMENT)||(LA13_78 >= KW_COMPACT && LA13_78 <= KW_CONCATENATE)||LA13_78==KW_CONTINUE||LA13_78==KW_DATA||(LA13_78 >= KW_DATABASES && LA13_78 <= KW_DEBUG)||(LA13_78 >= KW_DEFAULT && LA13_78 <= KW_DEFINED)||(LA13_78 >= KW_DELIMITED && LA13_78 <= KW_DESC)||(LA13_78 >= KW_DETAIL && LA13_78 <= KW_DISABLE)||(LA13_78 >= KW_DISTRIBUTE && LA13_78 <= KW_DO)||LA13_78==KW_DOW||(LA13_78 >= KW_DUMP && LA13_78 <= KW_ELEM_TYPE)||LA13_78==KW_ENABLE||(LA13_78 >= KW_ENFORCED && LA13_78 <= KW_ESCAPED)||LA13_78==KW_EXCLUSIVE||(LA13_78 >= KW_EXPLAIN && LA13_78 <= KW_EXPRESSION)||(LA13_78 >= KW_FIELDS && LA13_78 <= KW_FIRST)||(LA13_78 >= KW_FORMAT && LA13_78 <= KW_FORMATTED)||LA13_78==KW_FUNCTIONS||LA13_78==KW_GROUP||(LA13_78 >= KW_HOUR && LA13_78 <= KW_IDXPROPERTIES)||(LA13_78 >= KW_INDEX && LA13_78 <= KW_INDEXES)||(LA13_78 >= KW_INPATH && LA13_78 <= KW_INPUTFORMAT)||(LA13_78 >= KW_ISOLATION && LA13_78 <= KW_JAR)||(LA13_78 >= KW_KEY && LA13_78 <= KW_LAST)||LA13_78==KW_LEVEL||(LA13_78 >= KW_LIMIT && LA13_78 <= KW_LOAD)||(LA13_78 >= KW_LOCATION && LA13_78 <= KW_LONG)||LA13_78==KW_MANAGEMENT||(LA13_78 >= KW_MAPJOIN && LA13_78 <= KW_MATERIALIZED)||LA13_78==KW_METADATA||(LA13_78 >= KW_MINUTE && LA13_78 <= KW_MONTH)||(LA13_78 >= KW_MOVE && LA13_78 <= KW_MSCK)||(LA13_78 >= KW_NORELY && LA13_78 <= KW_NOSCAN)||LA13_78==KW_NOVALIDATE||LA13_78==KW_NULLS||LA13_78==KW_OFFSET||(LA13_78 >= KW_OPERATOR && LA13_78 <= KW_OPTION)||LA13_78==KW_ORDER||(LA13_78 >= KW_OUTPUTDRIVER && LA13_78 <= KW_OUTPUTFORMAT)||(LA13_78 >= KW_OVERWRITE && LA13_78 <= KW_OWNER)||(LA13_78 >= KW_PARTITIONED && LA13_78 <= KW_PATH)||(LA13_78 >= KW_PLAN && LA13_78 <= KW_POOL)||LA13_78==KW_PRINCIPALS||(LA13_78 >= KW_PURGE && LA13_78 <= KW_QUERY_PARALLELISM)||LA13_78==KW_READ||(LA13_78 >= KW_REBUILD && LA13_78 <= KW_RECORDWRITER)||(LA13_78 >= KW_RELOAD && LA13_78 <= KW_RESTRICT)||LA13_78==KW_REWRITE||(LA13_78 >= KW_ROLE && LA13_78 <= KW_ROLES)||(LA13_78 >= KW_SCHEDULING_POLICY && LA13_78 <= KW_SECOND)||(LA13_78 >= KW_SEMI && LA13_78 <= KW_SERVER)||(LA13_78 >= KW_SETS && LA13_78 <= KW_SKEWED)||(LA13_78 >= KW_SNAPSHOT && LA13_78 <= KW_SSL)||(LA13_78 >= KW_STATISTICS && LA13_78 <= KW_SUMMARY)||LA13_78==KW_TABLES||(LA13_78 >= KW_TBLPROPERTIES && LA13_78 <= KW_TERMINATED)||LA13_78==KW_TINYINT||(LA13_78 >= KW_TOUCH && LA13_78 <= KW_TRANSACTIONS)||LA13_78==KW_UNARCHIVE||LA13_78==KW_UNDO||LA13_78==KW_UNIONTYPE||(LA13_78 >= KW_UNKNOWN && LA13_78 <= KW_UNSIGNED)||(LA13_78 >= KW_URI && LA13_78 <= KW_USE)||(LA13_78 >= KW_UTC && LA13_78 <= KW_VALIDATE)||LA13_78==KW_VALUE_TYPE||(LA13_78 >= KW_VECTORIZATION && LA13_78 <= KW_WEEK)||LA13_78==KW_WHILE||(LA13_78 >= KW_WORK && LA13_78 <= KW_ZONE)||LA13_78==KW_BATCH||LA13_78==KW_DAYOFWEEK||LA13_78==KW_HOLD_DDLTIME||LA13_78==KW_IGNORE||LA13_78==KW_NO_DROP||LA13_78==KW_OFFLINE||LA13_78==KW_PROTECTION||LA13_78==KW_READONLY||LA13_78==KW_TIMESTAMPTZ) ) {s = 230;}
						 
						input.seek(index13_78);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA13_127 = input.LA(1);
						 
						int index13_127 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_127==STAR) && (synpred1_SelectClauseParser())) {s = 231;}
						else if ( (LA13_127==Identifier) ) {s = 232;}
						else if ( ((LA13_127 >= KW_ABORT && LA13_127 <= KW_AFTER)||LA13_127==KW_ALLOC_FRACTION||LA13_127==KW_ANALYZE||LA13_127==KW_ARCHIVE||(LA13_127 >= KW_ASC && LA13_127 <= KW_AST)||(LA13_127 >= KW_AUTOCOMMIT && LA13_127 <= KW_BEFORE)||(LA13_127 >= KW_BUCKET && LA13_127 <= KW_BUCKETS)||(LA13_127 >= KW_CACHE && LA13_127 <= KW_CASCADE)||LA13_127==KW_CHANGE||(LA13_127 >= KW_CHECK && LA13_127 <= KW_COLLECTION)||(LA13_127 >= KW_COLUMNS && LA13_127 <= KW_COMMENT)||(LA13_127 >= KW_COMPACT && LA13_127 <= KW_CONCATENATE)||LA13_127==KW_CONTINUE||LA13_127==KW_DATA||(LA13_127 >= KW_DATABASES && LA13_127 <= KW_DEBUG)||(LA13_127 >= KW_DEFAULT && LA13_127 <= KW_DEFINED)||(LA13_127 >= KW_DELIMITED && LA13_127 <= KW_DESC)||(LA13_127 >= KW_DETAIL && LA13_127 <= KW_DISABLE)||(LA13_127 >= KW_DISTRIBUTE && LA13_127 <= KW_DO)||LA13_127==KW_DOW||(LA13_127 >= KW_DUMP && LA13_127 <= KW_ELEM_TYPE)||LA13_127==KW_ENABLE||(LA13_127 >= KW_ENFORCED && LA13_127 <= KW_ESCAPED)||LA13_127==KW_EXCLUSIVE||(LA13_127 >= KW_EXPLAIN && LA13_127 <= KW_EXPRESSION)||(LA13_127 >= KW_FIELDS && LA13_127 <= KW_FIRST)||(LA13_127 >= KW_FORMAT && LA13_127 <= KW_FORMATTED)||LA13_127==KW_FUNCTIONS||LA13_127==KW_GROUP||(LA13_127 >= KW_HOUR && LA13_127 <= KW_IDXPROPERTIES)||(LA13_127 >= KW_INDEX && LA13_127 <= KW_INDEXES)||(LA13_127 >= KW_INPATH && LA13_127 <= KW_INPUTFORMAT)||(LA13_127 >= KW_ISOLATION && LA13_127 <= KW_JAR)||(LA13_127 >= KW_KEY && LA13_127 <= KW_LAST)||LA13_127==KW_LEVEL||(LA13_127 >= KW_LIMIT && LA13_127 <= KW_LOAD)||(LA13_127 >= KW_LOCATION && LA13_127 <= KW_LONG)||LA13_127==KW_MANAGEMENT||(LA13_127 >= KW_MAPJOIN && LA13_127 <= KW_MATERIALIZED)||LA13_127==KW_METADATA||(LA13_127 >= KW_MINUTE && LA13_127 <= KW_MONTH)||(LA13_127 >= KW_MOVE && LA13_127 <= KW_MSCK)||(LA13_127 >= KW_NORELY && LA13_127 <= KW_NOSCAN)||LA13_127==KW_NOVALIDATE||LA13_127==KW_NULLS||LA13_127==KW_OFFSET||(LA13_127 >= KW_OPERATOR && LA13_127 <= KW_OPTION)||LA13_127==KW_ORDER||(LA13_127 >= KW_OUTPUTDRIVER && LA13_127 <= KW_OUTPUTFORMAT)||(LA13_127 >= KW_OVERWRITE && LA13_127 <= KW_OWNER)||(LA13_127 >= KW_PARTITIONED && LA13_127 <= KW_PATH)||(LA13_127 >= KW_PLAN && LA13_127 <= KW_POOL)||LA13_127==KW_PRINCIPALS||(LA13_127 >= KW_PURGE && LA13_127 <= KW_QUERY_PARALLELISM)||LA13_127==KW_READ||(LA13_127 >= KW_REBUILD && LA13_127 <= KW_RECORDWRITER)||(LA13_127 >= KW_RELOAD && LA13_127 <= KW_RESTRICT)||LA13_127==KW_REWRITE||(LA13_127 >= KW_ROLE && LA13_127 <= KW_ROLES)||(LA13_127 >= KW_SCHEDULING_POLICY && LA13_127 <= KW_SECOND)||(LA13_127 >= KW_SEMI && LA13_127 <= KW_SERVER)||(LA13_127 >= KW_SETS && LA13_127 <= KW_SKEWED)||(LA13_127 >= KW_SNAPSHOT && LA13_127 <= KW_SSL)||(LA13_127 >= KW_STATISTICS && LA13_127 <= KW_SUMMARY)||LA13_127==KW_TABLES||(LA13_127 >= KW_TBLPROPERTIES && LA13_127 <= KW_TERMINATED)||LA13_127==KW_TINYINT||(LA13_127 >= KW_TOUCH && LA13_127 <= KW_TRANSACTIONS)||LA13_127==KW_UNARCHIVE||LA13_127==KW_UNDO||LA13_127==KW_UNIONTYPE||(LA13_127 >= KW_UNKNOWN && LA13_127 <= KW_UNSIGNED)||(LA13_127 >= KW_URI && LA13_127 <= KW_USE)||(LA13_127 >= KW_UTC && LA13_127 <= KW_VALIDATE)||LA13_127==KW_VALUE_TYPE||(LA13_127 >= KW_VECTORIZATION && LA13_127 <= KW_WEEK)||LA13_127==KW_WHILE||(LA13_127 >= KW_WORK && LA13_127 <= KW_ZONE)||LA13_127==KW_BATCH||LA13_127==KW_DAYOFWEEK||LA13_127==KW_HOLD_DDLTIME||LA13_127==KW_IGNORE||LA13_127==KW_NO_DROP||LA13_127==KW_OFFLINE||LA13_127==KW_PROTECTION||LA13_127==KW_READONLY||LA13_127==KW_TIMESTAMPTZ) ) {s = 233;}
						 
						input.seek(index13_127);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA13_176 = input.LA(1);
						 
						int index13_176 = input.index();
						input.rewind();
						s = -1;
						if ( (LA13_176==STAR) && (synpred1_SelectClauseParser())) {s = 234;}
						else if ( (LA13_176==Identifier) ) {s = 235;}
						else if ( ((LA13_176 >= KW_ABORT && LA13_176 <= KW_AFTER)||LA13_176==KW_ALLOC_FRACTION||LA13_176==KW_ANALYZE||LA13_176==KW_ARCHIVE||(LA13_176 >= KW_ASC && LA13_176 <= KW_AST)||(LA13_176 >= KW_AUTOCOMMIT && LA13_176 <= KW_BEFORE)||(LA13_176 >= KW_BUCKET && LA13_176 <= KW_BUCKETS)||(LA13_176 >= KW_CACHE && LA13_176 <= KW_CASCADE)||LA13_176==KW_CHANGE||(LA13_176 >= KW_CHECK && LA13_176 <= KW_COLLECTION)||(LA13_176 >= KW_COLUMNS && LA13_176 <= KW_COMMENT)||(LA13_176 >= KW_COMPACT && LA13_176 <= KW_CONCATENATE)||LA13_176==KW_CONTINUE||LA13_176==KW_DATA||(LA13_176 >= KW_DATABASES && LA13_176 <= KW_DEBUG)||(LA13_176 >= KW_DEFAULT && LA13_176 <= KW_DEFINED)||(LA13_176 >= KW_DELIMITED && LA13_176 <= KW_DESC)||(LA13_176 >= KW_DETAIL && LA13_176 <= KW_DISABLE)||(LA13_176 >= KW_DISTRIBUTE && LA13_176 <= KW_DO)||LA13_176==KW_DOW||(LA13_176 >= KW_DUMP && LA13_176 <= KW_ELEM_TYPE)||LA13_176==KW_ENABLE||(LA13_176 >= KW_ENFORCED && LA13_176 <= KW_ESCAPED)||LA13_176==KW_EXCLUSIVE||(LA13_176 >= KW_EXPLAIN && LA13_176 <= KW_EXPRESSION)||(LA13_176 >= KW_FIELDS && LA13_176 <= KW_FIRST)||(LA13_176 >= KW_FORMAT && LA13_176 <= KW_FORMATTED)||LA13_176==KW_FUNCTIONS||LA13_176==KW_GROUP||(LA13_176 >= KW_HOUR && LA13_176 <= KW_IDXPROPERTIES)||(LA13_176 >= KW_INDEX && LA13_176 <= KW_INDEXES)||(LA13_176 >= KW_INPATH && LA13_176 <= KW_INPUTFORMAT)||(LA13_176 >= KW_ISOLATION && LA13_176 <= KW_JAR)||(LA13_176 >= KW_KEY && LA13_176 <= KW_LAST)||LA13_176==KW_LEVEL||(LA13_176 >= KW_LIMIT && LA13_176 <= KW_LOAD)||(LA13_176 >= KW_LOCATION && LA13_176 <= KW_LONG)||LA13_176==KW_MANAGEMENT||(LA13_176 >= KW_MAPJOIN && LA13_176 <= KW_MATERIALIZED)||LA13_176==KW_METADATA||(LA13_176 >= KW_MINUTE && LA13_176 <= KW_MONTH)||(LA13_176 >= KW_MOVE && LA13_176 <= KW_MSCK)||(LA13_176 >= KW_NORELY && LA13_176 <= KW_NOSCAN)||LA13_176==KW_NOVALIDATE||LA13_176==KW_NULLS||LA13_176==KW_OFFSET||(LA13_176 >= KW_OPERATOR && LA13_176 <= KW_OPTION)||LA13_176==KW_ORDER||(LA13_176 >= KW_OUTPUTDRIVER && LA13_176 <= KW_OUTPUTFORMAT)||(LA13_176 >= KW_OVERWRITE && LA13_176 <= KW_OWNER)||(LA13_176 >= KW_PARTITIONED && LA13_176 <= KW_PATH)||(LA13_176 >= KW_PLAN && LA13_176 <= KW_POOL)||LA13_176==KW_PRINCIPALS||(LA13_176 >= KW_PURGE && LA13_176 <= KW_QUERY_PARALLELISM)||LA13_176==KW_READ||(LA13_176 >= KW_REBUILD && LA13_176 <= KW_RECORDWRITER)||(LA13_176 >= KW_RELOAD && LA13_176 <= KW_RESTRICT)||LA13_176==KW_REWRITE||(LA13_176 >= KW_ROLE && LA13_176 <= KW_ROLES)||(LA13_176 >= KW_SCHEDULING_POLICY && LA13_176 <= KW_SECOND)||(LA13_176 >= KW_SEMI && LA13_176 <= KW_SERVER)||(LA13_176 >= KW_SETS && LA13_176 <= KW_SKEWED)||(LA13_176 >= KW_SNAPSHOT && LA13_176 <= KW_SSL)||(LA13_176 >= KW_STATISTICS && LA13_176 <= KW_SUMMARY)||LA13_176==KW_TABLES||(LA13_176 >= KW_TBLPROPERTIES && LA13_176 <= KW_TERMINATED)||LA13_176==KW_TINYINT||(LA13_176 >= KW_TOUCH && LA13_176 <= KW_TRANSACTIONS)||LA13_176==KW_UNARCHIVE||LA13_176==KW_UNDO||LA13_176==KW_UNIONTYPE||(LA13_176 >= KW_UNKNOWN && LA13_176 <= KW_UNSIGNED)||(LA13_176 >= KW_URI && LA13_176 <= KW_USE)||(LA13_176 >= KW_UTC && LA13_176 <= KW_VALIDATE)||LA13_176==KW_VALUE_TYPE||(LA13_176 >= KW_VECTORIZATION && LA13_176 <= KW_WEEK)||LA13_176==KW_WHILE||(LA13_176 >= KW_WORK && LA13_176 <= KW_ZONE)||LA13_176==KW_BATCH||LA13_176==KW_DAYOFWEEK||LA13_176==KW_HOLD_DDLTIME||LA13_176==KW_IGNORE||LA13_176==KW_NO_DROP||LA13_176==KW_OFFLINE||LA13_176==KW_PROTECTION||LA13_176==KW_READONLY||LA13_176==KW_TIMESTAMPTZ) ) {s = 236;}
						 
						input.seek(index13_176);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA13_226 = input.LA(1);
						 
						int index13_226 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_226);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA13_227 = input.LA(1);
						 
						int index13_227 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_227);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA13_229 = input.LA(1);
						 
						int index13_229 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_229);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA13_230 = input.LA(1);
						 
						int index13_230 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_230);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA13_232 = input.LA(1);
						 
						int index13_232 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_232);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA13_233 = input.LA(1);
						 
						int index13_233 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_233);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA13_235 = input.LA(1);
						 
						int index13_235 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_235);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA13_236 = input.LA(1);
						 
						int index13_236 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred1_SelectClauseParser()) ) {s = 234;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index13_236);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 13, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA12_eotS =
		"\u00a7\uffff";
	static final String DFA12_eofS =
		"\1\4\2\uffff\1\2\4\uffff\1\2\6\uffff\4\2\u0094\uffff";
	static final String DFA12_minS =
		"\1\11\1\30\1\uffff\1\11\4\uffff\1\11\6\uffff\4\11\u0094\uffff";
	static final String DFA12_maxS =
		"\2\u0292\1\uffff\1\u017c\4\uffff\1\u017c\6\uffff\4\u017c\u0094\uffff";
	static final String DFA12_acceptS =
		"\2\uffff\1\1\1\uffff\1\3\25\uffff\1\2\u008c\uffff";
	static final String DFA12_specialS =
		"\u00a7\uffff}>";
	static final String[] DFA12_transitionS = {
			"\1\4\16\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\1\uffff"+
			"\1\1\2\2\1\uffff\2\2\5\uffff\2\2\1\uffff\2\2\2\uffff\1\2\1\uffff\1\2"+
			"\1\17\3\2\1\uffff\2\2\1\uffff\4\2\2\uffff\1\2\7\uffff\1\2\1\uffff\6\2"+
			"\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff\1\20\1\2\1\uffff\1\2\1\uffff"+
			"\2\2\1\uffff\1\2\1\uffff\2\2\1\4\1\uffff\1\2\1\uffff\3\2\5\uffff\4\2"+
			"\6\uffff\2\2\1\4\2\uffff\1\2\1\uffff\1\3\1\uffff\1\4\2\2\3\uffff\2\2"+
			"\1\uffff\3\2\1\4\1\uffff\1\4\3\uffff\3\2\1\uffff\5\2\1\4\2\uffff\1\2"+
			"\1\uffff\1\22\2\2\1\uffff\5\2\1\uffff\1\2\1\4\4\2\1\uffff\1\2\1\4\2\2"+
			"\1\uffff\2\2\1\uffff\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff"+
			"\2\2\1\uffff\1\10\2\uffff\2\2\1\uffff\2\2\1\uffff\3\2\1\uffff\4\2\4\uffff"+
			"\1\2\1\uffff\4\2\1\uffff\1\2\2\uffff\3\2\1\4\2\uffff\12\2\1\uffff\1\2"+
			"\2\uffff\2\2\4\uffff\4\2\1\4\4\2\1\uffff\5\2\1\uffff\1\2\1\21\2\2\1\uffff"+
			"\7\2\2\uffff\1\2\1\uffff\3\2\4\uffff\1\2\1\uffff\4\2\4\uffff\1\2\1\uffff"+
			"\1\2\1\4\1\2\2\uffff\5\2\1\uffff\2\2\2\uffff\3\2\1\uffff\1\2\1\uffff"+
			"\5\2\1\uffff\1\4\1\2\1\4\1\uffff\5\2\21\uffff\1\4\53\uffff\1\2\44\uffff"+
			"\1\2\57\uffff\1\2\3\uffff\1\2\56\uffff\1\2\3\uffff\1\2\31\uffff\1\2\6"+
			"\uffff\1\2\74\uffff\1\2",
			"\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff\2\2\1\uffff"+
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
			"\5\2\4\uffff\1\32\70\uffff\1\2\44\uffff\1\2\57\uffff\1\2\3\uffff\1\2"+
			"\56\uffff\1\2\3\uffff\1\2\31\uffff\1\2\6\uffff\1\2\74\uffff\1\2",
			"",
			"\1\2\54\uffff\1\4\7\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2"+
			"\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff"+
			"\1\2\12\uffff\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2"+
			"\14\uffff\1\2\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\27\uffff\1\2",
			"",
			"",
			"",
			"",
			"\1\2\54\uffff\1\4\7\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2"+
			"\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff"+
			"\1\2\12\uffff\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2"+
			"\14\uffff\1\2\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\27\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\2\54\uffff\1\4\7\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2"+
			"\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff"+
			"\1\2\12\uffff\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2"+
			"\14\uffff\1\2\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\27\uffff\1\2",
			"\1\2\54\uffff\1\4\7\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2"+
			"\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff"+
			"\1\2\12\uffff\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2"+
			"\14\uffff\1\2\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\27\uffff\1\2",
			"\1\2\54\uffff\1\4\7\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2"+
			"\4\uffff\1\2\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff"+
			"\1\2\12\uffff\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2"+
			"\14\uffff\1\2\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\27\uffff\1\2",
			"\1\2\64\uffff\1\2\53\uffff\1\2\13\uffff\1\2\27\uffff\1\2\4\uffff\1\2"+
			"\1\uffff\1\2\13\uffff\1\2\1\uffff\1\2\14\uffff\1\2\4\uffff\1\2\12\uffff"+
			"\1\2\6\uffff\1\2\23\uffff\1\2\41\uffff\1\2\32\uffff\1\2\14\uffff\1\2"+
			"\42\uffff\1\2\31\uffff\1\2\1\uffff\1\2\20\uffff\1\4\6\uffff\1\2",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
	static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
	static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
	static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
	static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
	static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
	static final short[][] DFA12_transition;

	static {
		int numStates = DFA12_transitionS.length;
		DFA12_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
		}
	}

	protected class DFA12 extends DFA {

		public DFA12(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 12;
			this.eot = DFA12_eot;
			this.eof = DFA12_eof;
			this.min = DFA12_min;
			this.max = DFA12_max;
			this.accept = DFA12_accept;
			this.special = DFA12_special;
			this.transition = DFA12_transition;
		}
		@Override
		public String getDescription() {
			return "87:7: ( ( ( KW_AS )? identifier ) | ( KW_AS LPAREN identifier ( COMMA identifier )* RPAREN ) )?";
		}
	}

	static final String DFA16_eotS =
		"\u0093\uffff";
	static final String DFA16_eofS =
		"\1\uffff\2\3\u0090\uffff";
	static final String DFA16_minS =
		"\1\30\2\11\26\uffff\1\14\53\uffff\1\14\115\uffff";
	static final String DFA16_maxS =
		"\1\u0292\2\u017c\26\uffff\1\u0292\53\uffff\1\u0292\115\uffff";
	static final String DFA16_acceptS =
		"\3\uffff\1\1\27\uffff\1\2\167\uffff";
	static final String DFA16_specialS =
		"\u0093\uffff}>";
	static final String[] DFA16_transitionS = {
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
			"\1\3\36\uffff\1\33\7\uffff\3\33\11\uffff\1\33\1\uffff\1\3\30\uffff\2"+
			"\33\3\uffff\1\33\15\uffff\1\3\1\uffff\1\33\11\uffff\1\3\17\uffff\1\33"+
			"\7\uffff\1\3\4\uffff\1\3\1\uffff\1\3\13\uffff\1\3\1\33\1\3\14\uffff\1"+
			"\3\4\uffff\1\3\12\uffff\1\31\6\uffff\1\3\23\uffff\1\3\35\uffff\1\33\1"+
			"\uffff\1\3\1\uffff\1\3\24\uffff\1\3\5\uffff\1\3\12\uffff\1\33\1\uffff"+
			"\1\3\7\uffff\2\33\12\uffff\3\33\14\uffff\1\3\1\33\21\uffff\1\33\6\uffff"+
			"\1\3\1\uffff\1\3\27\uffff\1\3",
			"\1\3\36\uffff\1\33\7\uffff\3\33\11\uffff\1\33\1\uffff\1\3\30\uffff\2"+
			"\33\3\uffff\1\33\15\uffff\1\3\1\uffff\1\33\11\uffff\1\3\17\uffff\1\33"+
			"\7\uffff\1\3\4\uffff\1\3\1\uffff\1\3\13\uffff\1\3\1\33\1\3\14\uffff\1"+
			"\3\4\uffff\1\3\12\uffff\1\105\6\uffff\1\3\23\uffff\1\3\35\uffff\1\33"+
			"\1\uffff\1\3\1\uffff\1\3\24\uffff\1\3\5\uffff\1\3\12\uffff\1\33\1\uffff"+
			"\1\3\7\uffff\2\33\12\uffff\3\33\14\uffff\1\3\1\33\21\uffff\1\33\6\uffff"+
			"\1\3\1\uffff\1\3\27\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\13\uffff\10\3\1\uffff\1\3\1\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\2\3\1\uffff\3\3\1\uffff\2\3\1\uffff\5\3\1\uffff\5\3\1\uffff\2"+
			"\3\1\uffff\4\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\1\uffff\6\3\1\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\4\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\5\3\2\uffff\2\3\1\uffff\6\3\4\uffff\2\3\3\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\3\3\2\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\3\3\1\uffff\5\3\3\uffff\1\3\1\uffff\3\3\1\uffff\5\3\1\uffff\6\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\1\3\1\uffff\4\3\3\uffff\12\3\1\uffff\1\3\2\uffff\2\3\4\uffff"+
			"\4\3\1\uffff\4\3\1\uffff\12\3\1\uffff\7\3\2\uffff\1\3\1\uffff\3\3\2\uffff"+
			"\3\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\3\3\1\uffff\1\3\1\uffff\5\3\2\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\1\33\2\uffff\1\3\2\uffff\1\3\2\uffff\3\3\10\uffff\3\3\45"+
			"\uffff\1\3\44\uffff\1\3\57\uffff\1\3\3\uffff\1\3\56\uffff\1\3\3\uffff"+
			"\1\3\31\uffff\1\3\6\uffff\1\3\74\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\3\13\uffff\10\3\1\uffff\1\3\1\uffff\1\3\3\uffff\2\3\1\uffff\2\3\1"+
			"\uffff\2\3\1\uffff\3\3\1\uffff\2\3\1\uffff\5\3\1\uffff\5\3\1\uffff\2"+
			"\3\1\uffff\4\3\2\uffff\1\3\4\uffff\2\3\1\uffff\1\3\1\uffff\6\3\1\uffff"+
			"\3\3\1\uffff\3\3\1\uffff\4\3\1\uffff\4\3\1\uffff\2\3\1\uffff\1\3\1\uffff"+
			"\2\3\2\uffff\5\3\2\uffff\2\3\1\uffff\6\3\4\uffff\2\3\3\uffff\1\3\1\uffff"+
			"\2\3\1\uffff\3\3\2\uffff\2\3\1\uffff\3\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\3\3\1\uffff\5\3\3\uffff\1\3\1\uffff\3\3\1\uffff\5\3\1\uffff\6\3\1\uffff"+
			"\1\3\1\uffff\2\3\1\uffff\2\3\1\uffff\6\3\1\uffff\1\3\2\uffff\2\3\1\uffff"+
			"\1\3\2\uffff\2\3\1\uffff\2\3\1\uffff\3\3\1\uffff\4\3\4\uffff\1\3\1\uffff"+
			"\4\3\1\uffff\1\3\1\uffff\4\3\3\uffff\12\3\1\uffff\1\3\2\uffff\2\3\4\uffff"+
			"\4\3\1\uffff\4\3\1\uffff\12\3\1\uffff\7\3\2\uffff\1\3\1\uffff\3\3\2\uffff"+
			"\3\3\1\uffff\4\3\2\uffff\1\3\1\uffff\1\3\1\uffff\1\3\1\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\2\3\2\uffff\3\3\1\uffff\1\3\1\uffff\5\3\2\uffff\1\3\2\uffff"+
			"\5\3\1\uffff\1\33\2\uffff\1\3\2\uffff\1\3\2\uffff\3\3\10\uffff\3\3\45"+
			"\uffff\1\3\44\uffff\1\3\57\uffff\1\3\3\uffff\1\3\56\uffff\1\3\3\uffff"+
			"\1\3\31\uffff\1\3\6\uffff\1\3\74\uffff\1\3",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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

	static final short[] DFA16_eot = DFA.unpackEncodedString(DFA16_eotS);
	static final short[] DFA16_eof = DFA.unpackEncodedString(DFA16_eofS);
	static final char[] DFA16_min = DFA.unpackEncodedStringToUnsignedChars(DFA16_minS);
	static final char[] DFA16_max = DFA.unpackEncodedStringToUnsignedChars(DFA16_maxS);
	static final short[] DFA16_accept = DFA.unpackEncodedString(DFA16_acceptS);
	static final short[] DFA16_special = DFA.unpackEncodedString(DFA16_specialS);
	static final short[][] DFA16_transition;

	static {
		int numStates = DFA16_transitionS.length;
		DFA16_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA16_transition[i] = DFA.unpackEncodedString(DFA16_transitionS[i]);
		}
	}

	protected class DFA16 extends DFA {

		public DFA16(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 16;
			this.eot = DFA16_eot;
			this.eof = DFA16_eof;
			this.min = DFA16_min;
			this.max = DFA16_max;
			this.accept = DFA16_accept;
			this.special = DFA16_special;
			this.transition = DFA16_transition;
		}
		@Override
		public String getDescription() {
			return "99:65: ( aliasList | columnNameTypeList )";
		}
	}

	static final String DFA19_eotS =
		"\u00a1\uffff";
	static final String DFA19_eofS =
		"\u00a1\uffff";
	static final String DFA19_minS =
		"\1\14\1\uffff\2\4\4\uffff\1\4\11\uffff\1\4\11\uffff\1\30\36\uffff\1\30"+
		"\35\uffff\1\30\35\uffff\1\30\36\uffff\2\0\1\uffff\2\0\1\uffff\2\0\1\uffff"+
		"\2\0";
	static final String DFA19_maxS =
		"\1\u0292\1\uffff\1\u0180\1\u0181\4\uffff\1\u0180\11\uffff\1\u0180\11\uffff"+
		"\1\u0292\36\uffff\1\u0292\35\uffff\1\u0292\35\uffff\1\u0292\36\uffff\2"+
		"\0\1\uffff\2\0\1\uffff\2\0\1\uffff\2\0";
	static final String DFA19_acceptS =
		"\1\uffff\1\1\2\uffff\1\2\u0090\uffff\1\1\2\uffff\1\1\2\uffff\1\1\2\uffff"+
		"\1\1\2\uffff";
	static final String DFA19_specialS =
		"\1\0\33\uffff\1\1\36\uffff\1\2\35\uffff\1\3\35\uffff\1\4\36\uffff\1\5"+
		"\1\6\1\uffff\1\7\1\10\1\uffff\1\11\1\12\1\uffff\1\13\1\14}>";
	static final String[] DFA19_transitionS = {
			"\1\4\13\uffff\1\2\1\4\6\22\1\uffff\1\22\1\uffff\1\22\3\uffff\1\22\1\4"+
			"\1\uffff\2\22\1\uffff\2\22\1\uffff\3\4\1\uffff\2\22\1\uffff\2\22\2\4"+
			"\1\22\1\uffff\5\22\1\uffff\2\22\1\uffff\4\22\2\uffff\1\22\4\uffff\2\4"+
			"\1\uffff\1\22\1\uffff\1\22\1\3\4\22\1\uffff\3\22\1\uffff\3\22\1\uffff"+
			"\4\22\1\uffff\2\22\1\4\1\22\1\uffff\2\22\1\uffff\1\22\1\uffff\2\22\2"+
			"\uffff\1\22\1\4\3\22\2\uffff\2\4\1\uffff\4\22\2\4\4\uffff\2\22\3\uffff"+
			"\1\22\1\uffff\1\22\1\4\1\uffff\2\22\1\4\2\uffff\2\22\1\uffff\3\22\1\uffff"+
			"\1\4\1\uffff\1\4\2\uffff\3\22\1\uffff\5\22\3\uffff\1\22\1\uffff\3\22"+
			"\1\uffff\5\22\1\uffff\1\22\1\4\4\22\1\uffff\1\22\1\uffff\2\22\1\uffff"+
			"\2\22\1\uffff\2\22\1\4\1\22\1\4\1\22\1\uffff\1\22\2\uffff\2\22\1\uffff"+
			"\1\22\2\uffff\2\22\1\uffff\2\22\1\uffff\3\22\1\uffff\4\22\4\uffff\1\22"+
			"\1\uffff\4\22\1\uffff\1\22\1\uffff\1\4\3\22\3\uffff\12\22\1\uffff\1\22"+
			"\2\uffff\2\22\4\uffff\4\22\1\uffff\4\22\1\uffff\5\22\1\4\4\22\1\uffff"+
			"\7\22\2\uffff\1\22\1\uffff\3\22\2\uffff\2\4\1\22\1\uffff\4\22\2\uffff"+
			"\1\4\1\uffff\1\22\1\uffff\1\22\1\uffff\1\22\2\uffff\1\10\4\22\1\uffff"+
			"\2\22\2\uffff\3\22\1\uffff\1\22\1\uffff\5\22\2\uffff\1\22\2\uffff\5\22"+
			"\4\uffff\1\4\2\uffff\1\4\2\uffff\3\4\10\uffff\1\1\2\4\45\uffff\1\22\44"+
			"\uffff\1\22\57\uffff\1\22\3\uffff\1\22\56\uffff\1\22\3\uffff\1\22\31"+
			"\uffff\1\22\6\uffff\1\22\74\uffff\1\22",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\34\1\uffff\2\4\1\uffff\2\4\15"+
			"\uffff\1\4\12\uffff\1\4\152\uffff\1\4\13\uffff\1\4\15\uffff\1\4\33\uffff"+
			"\1\4\11\uffff\1\4\41\uffff\1\4\2\uffff\1\4\15\uffff\1\4\4\uffff\1\4\102"+
			"\uffff\1\4\26\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff\1\4\4\uffff\1"+
			"\4\3\uffff\1\4",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\73\1\uffff\2\4\1\uffff\2\4\15"+
			"\uffff\1\4\12\uffff\1\4\152\uffff\1\4\13\uffff\1\4\15\uffff\1\4\33\uffff"+
			"\1\4\11\uffff\1\4\41\uffff\1\4\2\uffff\1\4\15\uffff\1\4\4\uffff\1\4\102"+
			"\uffff\1\4\26\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff\1\4\4\uffff\1"+
			"\4\3\uffff\2\4",
			"",
			"",
			"",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\131\1\uffff\2\4\1\uffff\2\4\15"+
			"\uffff\1\4\12\uffff\1\4\152\uffff\1\4\13\uffff\1\4\15\uffff\1\4\33\uffff"+
			"\1\4\11\uffff\1\4\41\uffff\1\4\2\uffff\1\4\15\uffff\1\4\4\uffff\1\4\102"+
			"\uffff\1\4\26\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff\1\4\4\uffff\1"+
			"\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\3\4\2\uffff\2\4\2\uffff\2\4\1\uffff\1\167\1\uffff\2\4\1\uffff\2\4\15"+
			"\uffff\1\4\12\uffff\1\4\152\uffff\1\4\13\uffff\1\4\15\uffff\1\4\33\uffff"+
			"\1\4\11\uffff\1\4\41\uffff\1\4\2\uffff\1\4\15\uffff\1\4\4\uffff\1\4\102"+
			"\uffff\1\4\26\uffff\2\4\1\uffff\2\4\1\uffff\3\4\2\uffff\1\4\4\uffff\1"+
			"\4\3\uffff\1\4",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0096\1\uffff\6\u0097\1\uffff\1\u0097\1\uffff\1\u0097\3\uffff\1\u0097"+
			"\2\uffff\2\u0097\1\uffff\2\u0097\5\uffff\2\u0097\1\uffff\2\u0097\2\uffff"+
			"\1\u0097\1\uffff\5\u0097\1\uffff\2\u0097\1\uffff\4\u0097\2\uffff\1\u0097"+
			"\7\uffff\1\u0097\1\uffff\6\u0097\1\uffff\3\u0097\1\uffff\3\u0097\1\uffff"+
			"\4\u0097\1\uffff\2\u0097\1\uffff\1\u0097\1\uffff\2\u0097\1\uffff\1\u0097"+
			"\1\uffff\2\u0097\2\uffff\1\u0097\1\uffff\3\u0097\5\uffff\4\u0097\6\uffff"+
			"\2\u0097\3\uffff\1\u0097\1\uffff\1\u0097\2\uffff\2\u0097\3\uffff\2\u0097"+
			"\1\uffff\3\u0097\6\uffff\3\u0097\1\uffff\5\u0097\3\uffff\1\u0097\1\uffff"+
			"\3\u0097\1\uffff\5\u0097\1\uffff\1\u0097\1\uffff\4\u0097\1\uffff\1\u0097"+
			"\1\uffff\2\u0097\1\uffff\2\u0097\1\uffff\2\u0097\1\uffff\1\u0097\1\uffff"+
			"\1\u0097\1\uffff\1\u0097\2\uffff\2\u0097\1\uffff\1\u0097\2\uffff\2\u0097"+
			"\1\uffff\2\u0097\1\uffff\3\u0097\1\uffff\4\u0097\4\uffff\1\u0097\1\uffff"+
			"\4\u0097\1\uffff\1\u0097\2\uffff\3\u0097\3\uffff\12\u0097\1\uffff\1\u0097"+
			"\2\uffff\2\u0097\4\uffff\4\u0097\1\uffff\4\u0097\1\uffff\5\u0097\1\uffff"+
			"\4\u0097\1\uffff\7\u0097\2\uffff\1\u0097\1\uffff\3\u0097\4\uffff\1\u0097"+
			"\1\uffff\4\u0097\4\uffff\1\u0097\1\uffff\1\u0097\1\uffff\1\u0097\2\uffff"+
			"\5\u0097\1\uffff\2\u0097\2\uffff\3\u0097\1\uffff\1\u0097\1\uffff\5\u0097"+
			"\2\uffff\1\u0097\2\uffff\5\u0097\25\uffff\1\u0095\47\uffff\1\u0097\44"+
			"\uffff\1\u0097\57\uffff\1\u0097\3\uffff\1\u0097\56\uffff\1\u0097\3\uffff"+
			"\1\u0097\31\uffff\1\u0097\6\uffff\1\u0097\74\uffff\1\u0097",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u0099\1\uffff\6\u009a\1\uffff\1\u009a\1\uffff\1\u009a\3\uffff\1\u009a"+
			"\2\uffff\2\u009a\1\uffff\2\u009a\5\uffff\2\u009a\1\uffff\2\u009a\2\uffff"+
			"\1\u009a\1\uffff\5\u009a\1\uffff\2\u009a\1\uffff\4\u009a\2\uffff\1\u009a"+
			"\7\uffff\1\u009a\1\uffff\6\u009a\1\uffff\3\u009a\1\uffff\3\u009a\1\uffff"+
			"\4\u009a\1\uffff\2\u009a\1\uffff\1\u009a\1\uffff\2\u009a\1\uffff\1\u009a"+
			"\1\uffff\2\u009a\2\uffff\1\u009a\1\uffff\3\u009a\5\uffff\4\u009a\6\uffff"+
			"\2\u009a\3\uffff\1\u009a\1\uffff\1\u009a\2\uffff\2\u009a\3\uffff\2\u009a"+
			"\1\uffff\3\u009a\6\uffff\3\u009a\1\uffff\5\u009a\3\uffff\1\u009a\1\uffff"+
			"\3\u009a\1\uffff\5\u009a\1\uffff\1\u009a\1\uffff\4\u009a\1\uffff\1\u009a"+
			"\1\uffff\2\u009a\1\uffff\2\u009a\1\uffff\2\u009a\1\uffff\1\u009a\1\uffff"+
			"\1\u009a\1\uffff\1\u009a\2\uffff\2\u009a\1\uffff\1\u009a\2\uffff\2\u009a"+
			"\1\uffff\2\u009a\1\uffff\3\u009a\1\uffff\4\u009a\4\uffff\1\u009a\1\uffff"+
			"\4\u009a\1\uffff\1\u009a\2\uffff\3\u009a\3\uffff\12\u009a\1\uffff\1\u009a"+
			"\2\uffff\2\u009a\4\uffff\4\u009a\1\uffff\4\u009a\1\uffff\5\u009a\1\uffff"+
			"\4\u009a\1\uffff\7\u009a\2\uffff\1\u009a\1\uffff\3\u009a\4\uffff\1\u009a"+
			"\1\uffff\4\u009a\4\uffff\1\u009a\1\uffff\1\u009a\1\uffff\1\u009a\2\uffff"+
			"\5\u009a\1\uffff\2\u009a\2\uffff\3\u009a\1\uffff\1\u009a\1\uffff\5\u009a"+
			"\2\uffff\1\u009a\2\uffff\5\u009a\25\uffff\1\u0098\47\uffff\1\u009a\44"+
			"\uffff\1\u009a\57\uffff\1\u009a\3\uffff\1\u009a\56\uffff\1\u009a\3\uffff"+
			"\1\u009a\31\uffff\1\u009a\6\uffff\1\u009a\74\uffff\1\u009a",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009c\1\uffff\6\u009d\1\uffff\1\u009d\1\uffff\1\u009d\3\uffff\1\u009d"+
			"\2\uffff\2\u009d\1\uffff\2\u009d\5\uffff\2\u009d\1\uffff\2\u009d\2\uffff"+
			"\1\u009d\1\uffff\5\u009d\1\uffff\2\u009d\1\uffff\4\u009d\2\uffff\1\u009d"+
			"\7\uffff\1\u009d\1\uffff\6\u009d\1\uffff\3\u009d\1\uffff\3\u009d\1\uffff"+
			"\4\u009d\1\uffff\2\u009d\1\uffff\1\u009d\1\uffff\2\u009d\1\uffff\1\u009d"+
			"\1\uffff\2\u009d\2\uffff\1\u009d\1\uffff\3\u009d\5\uffff\4\u009d\6\uffff"+
			"\2\u009d\3\uffff\1\u009d\1\uffff\1\u009d\2\uffff\2\u009d\3\uffff\2\u009d"+
			"\1\uffff\3\u009d\6\uffff\3\u009d\1\uffff\5\u009d\3\uffff\1\u009d\1\uffff"+
			"\3\u009d\1\uffff\5\u009d\1\uffff\1\u009d\1\uffff\4\u009d\1\uffff\1\u009d"+
			"\1\uffff\2\u009d\1\uffff\2\u009d\1\uffff\2\u009d\1\uffff\1\u009d\1\uffff"+
			"\1\u009d\1\uffff\1\u009d\2\uffff\2\u009d\1\uffff\1\u009d\2\uffff\2\u009d"+
			"\1\uffff\2\u009d\1\uffff\3\u009d\1\uffff\4\u009d\4\uffff\1\u009d\1\uffff"+
			"\4\u009d\1\uffff\1\u009d\2\uffff\3\u009d\3\uffff\12\u009d\1\uffff\1\u009d"+
			"\2\uffff\2\u009d\4\uffff\4\u009d\1\uffff\4\u009d\1\uffff\5\u009d\1\uffff"+
			"\4\u009d\1\uffff\7\u009d\2\uffff\1\u009d\1\uffff\3\u009d\4\uffff\1\u009d"+
			"\1\uffff\4\u009d\4\uffff\1\u009d\1\uffff\1\u009d\1\uffff\1\u009d\2\uffff"+
			"\5\u009d\1\uffff\2\u009d\2\uffff\3\u009d\1\uffff\1\u009d\1\uffff\5\u009d"+
			"\2\uffff\1\u009d\2\uffff\5\u009d\25\uffff\1\u009b\47\uffff\1\u009d\44"+
			"\uffff\1\u009d\57\uffff\1\u009d\3\uffff\1\u009d\56\uffff\1\u009d\3\uffff"+
			"\1\u009d\31\uffff\1\u009d\6\uffff\1\u009d\74\uffff\1\u009d",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u009f\1\uffff\6\u00a0\1\uffff\1\u00a0\1\uffff\1\u00a0\3\uffff\1\u00a0"+
			"\2\uffff\2\u00a0\1\uffff\2\u00a0\5\uffff\2\u00a0\1\uffff\2\u00a0\2\uffff"+
			"\1\u00a0\1\uffff\5\u00a0\1\uffff\2\u00a0\1\uffff\4\u00a0\2\uffff\1\u00a0"+
			"\7\uffff\1\u00a0\1\uffff\6\u00a0\1\uffff\3\u00a0\1\uffff\3\u00a0\1\uffff"+
			"\4\u00a0\1\uffff\2\u00a0\1\uffff\1\u00a0\1\uffff\2\u00a0\1\uffff\1\u00a0"+
			"\1\uffff\2\u00a0\2\uffff\1\u00a0\1\uffff\3\u00a0\5\uffff\4\u00a0\6\uffff"+
			"\2\u00a0\3\uffff\1\u00a0\1\uffff\1\u00a0\2\uffff\2\u00a0\3\uffff\2\u00a0"+
			"\1\uffff\3\u00a0\6\uffff\3\u00a0\1\uffff\5\u00a0\3\uffff\1\u00a0\1\uffff"+
			"\3\u00a0\1\uffff\5\u00a0\1\uffff\1\u00a0\1\uffff\4\u00a0\1\uffff\1\u00a0"+
			"\1\uffff\2\u00a0\1\uffff\2\u00a0\1\uffff\2\u00a0\1\uffff\1\u00a0\1\uffff"+
			"\1\u00a0\1\uffff\1\u00a0\2\uffff\2\u00a0\1\uffff\1\u00a0\2\uffff\2\u00a0"+
			"\1\uffff\2\u00a0\1\uffff\3\u00a0\1\uffff\4\u00a0\4\uffff\1\u00a0\1\uffff"+
			"\4\u00a0\1\uffff\1\u00a0\2\uffff\3\u00a0\3\uffff\12\u00a0\1\uffff\1\u00a0"+
			"\2\uffff\2\u00a0\4\uffff\4\u00a0\1\uffff\4\u00a0\1\uffff\5\u00a0\1\uffff"+
			"\4\u00a0\1\uffff\7\u00a0\2\uffff\1\u00a0\1\uffff\3\u00a0\4\uffff\1\u00a0"+
			"\1\uffff\4\u00a0\4\uffff\1\u00a0\1\uffff\1\u00a0\1\uffff\1\u00a0\2\uffff"+
			"\5\u00a0\1\uffff\2\u00a0\2\uffff\3\u00a0\1\uffff\1\u00a0\1\uffff\5\u00a0"+
			"\2\uffff\1\u00a0\2\uffff\5\u00a0\25\uffff\1\u009e\47\uffff\1\u00a0\44"+
			"\uffff\1\u00a0\57\uffff\1\u00a0\3\uffff\1\u00a0\56\uffff\1\u00a0\3\uffff"+
			"\1\u00a0\31\uffff\1\u00a0\6\uffff\1\u00a0\74\uffff\1\u00a0",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
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
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff",
			"",
			"\1\uffff",
			"\1\uffff"
	};

	static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
	static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
	static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
	static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
	static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
	static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
	static final short[][] DFA19_transition;

	static {
		int numStates = DFA19_transitionS.length;
		DFA19_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
		}
	}

	protected class DFA19 extends DFA {

		public DFA19(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 19;
			this.eot = DFA19_eot;
			this.eof = DFA19_eof;
			this.min = DFA19_min;
			this.max = DFA19_max;
			this.accept = DFA19_accept;
			this.special = DFA19_special;
			this.transition = DFA19_transition;
		}
		@Override
		public String getDescription() {
			return "104:1: selectExpression : ( ( tableAllColumns )=> tableAllColumns | expression );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			TokenStream input = (TokenStream)_input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA19_0 = input.LA(1);
						 
						int index19_0 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_0==STAR) && (synpred2_SelectClauseParser())) {s = 1;}
						else if ( (LA19_0==Identifier) ) {s = 2;}
						else if ( (LA19_0==KW_DATE) ) {s = 3;}
						else if ( (LA19_0==CharSetName||LA19_0==IntegralLiteral||LA19_0==KW_ARRAY||(LA19_0 >= KW_BIGINT && LA19_0 <= KW_BOOLEAN)||(LA19_0 >= KW_CASE && LA19_0 <= KW_CAST)||(LA19_0 >= KW_CURRENT_DATE && LA19_0 <= KW_CURRENT_TIMESTAMP)||LA19_0==KW_DOUBLE||LA19_0==KW_EXISTS||(LA19_0 >= KW_EXTRACT && LA19_0 <= KW_FALSE)||(LA19_0 >= KW_FLOAT && LA19_0 <= KW_FLOOR)||LA19_0==KW_GROUPING||LA19_0==KW_IF||LA19_0==KW_INT||LA19_0==KW_INTERVAL||LA19_0==KW_MAP||LA19_0==KW_NOT||LA19_0==KW_NULL||LA19_0==KW_REAL||LA19_0==KW_SMALLINT||(LA19_0 >= KW_TIMESTAMP && LA19_0 <= KW_TIMESTAMPLOCALTZ)||LA19_0==KW_TRUE||LA19_0==LPAREN||LA19_0==MINUS||(LA19_0 >= Number && LA19_0 <= PLUS)||(LA19_0 >= StringLiteral && LA19_0 <= TILDE)) ) {s = 4;}
						else if ( (LA19_0==KW_UNKNOWN) ) {s = 8;}
						else if ( ((LA19_0 >= KW_ABORT && LA19_0 <= KW_AFTER)||LA19_0==KW_ALLOC_FRACTION||LA19_0==KW_ANALYZE||LA19_0==KW_ARCHIVE||(LA19_0 >= KW_ASC && LA19_0 <= KW_AST)||(LA19_0 >= KW_AUTOCOMMIT && LA19_0 <= KW_BEFORE)||(LA19_0 >= KW_BUCKET && LA19_0 <= KW_BUCKETS)||(LA19_0 >= KW_CACHE && LA19_0 <= KW_CASCADE)||LA19_0==KW_CHANGE||(LA19_0 >= KW_CHECK && LA19_0 <= KW_COLLECTION)||(LA19_0 >= KW_COLUMNS && LA19_0 <= KW_COMMENT)||(LA19_0 >= KW_COMPACT && LA19_0 <= KW_CONCATENATE)||LA19_0==KW_CONTINUE||LA19_0==KW_DATA||LA19_0==KW_DATABASES||(LA19_0 >= KW_DATETIME && LA19_0 <= KW_DEBUG)||(LA19_0 >= KW_DEFAULT && LA19_0 <= KW_DEFINED)||(LA19_0 >= KW_DELIMITED && LA19_0 <= KW_DESC)||(LA19_0 >= KW_DETAIL && LA19_0 <= KW_DISABLE)||(LA19_0 >= KW_DISTRIBUTE && LA19_0 <= KW_DO)||LA19_0==KW_DOW||(LA19_0 >= KW_DUMP && LA19_0 <= KW_ELEM_TYPE)||LA19_0==KW_ENABLE||(LA19_0 >= KW_ENFORCED && LA19_0 <= KW_ESCAPED)||LA19_0==KW_EXCLUSIVE||(LA19_0 >= KW_EXPLAIN && LA19_0 <= KW_EXPRESSION)||(LA19_0 >= KW_FIELDS && LA19_0 <= KW_FIRST)||(LA19_0 >= KW_FORMAT && LA19_0 <= KW_FORMATTED)||LA19_0==KW_FUNCTIONS||LA19_0==KW_GROUP||(LA19_0 >= KW_HOUR && LA19_0 <= KW_IDXPROPERTIES)||(LA19_0 >= KW_INDEX && LA19_0 <= KW_INDEXES)||(LA19_0 >= KW_INPATH && LA19_0 <= KW_INPUTFORMAT)||(LA19_0 >= KW_ISOLATION && LA19_0 <= KW_JAR)||(LA19_0 >= KW_KEY && LA19_0 <= KW_LAST)||LA19_0==KW_LEVEL||(LA19_0 >= KW_LIMIT && LA19_0 <= KW_LOAD)||(LA19_0 >= KW_LOCATION && LA19_0 <= KW_LONG)||LA19_0==KW_MANAGEMENT||(LA19_0 >= KW_MAPJOIN && LA19_0 <= KW_MATERIALIZED)||LA19_0==KW_METADATA||(LA19_0 >= KW_MINUTE && LA19_0 <= KW_MONTH)||(LA19_0 >= KW_MOVE && LA19_0 <= KW_MSCK)||(LA19_0 >= KW_NORELY && LA19_0 <= KW_NOSCAN)||LA19_0==KW_NOVALIDATE||LA19_0==KW_NULLS||LA19_0==KW_OFFSET||(LA19_0 >= KW_OPERATOR && LA19_0 <= KW_OPTION)||LA19_0==KW_ORDER||(LA19_0 >= KW_OUTPUTDRIVER && LA19_0 <= KW_OUTPUTFORMAT)||(LA19_0 >= KW_OVERWRITE && LA19_0 <= KW_OWNER)||(LA19_0 >= KW_PARTITIONED && LA19_0 <= KW_PATH)||(LA19_0 >= KW_PLAN && LA19_0 <= KW_POOL)||LA19_0==KW_PRINCIPALS||(LA19_0 >= KW_PURGE && LA19_0 <= KW_QUERY_PARALLELISM)||LA19_0==KW_READ||(LA19_0 >= KW_REBUILD && LA19_0 <= KW_RECORDWRITER)||(LA19_0 >= KW_RELOAD && LA19_0 <= KW_RESTRICT)||LA19_0==KW_REWRITE||(LA19_0 >= KW_ROLE && LA19_0 <= KW_ROLES)||(LA19_0 >= KW_SCHEDULING_POLICY && LA19_0 <= KW_SECOND)||(LA19_0 >= KW_SEMI && LA19_0 <= KW_SERVER)||(LA19_0 >= KW_SETS && LA19_0 <= KW_SKEWED)||(LA19_0 >= KW_SNAPSHOT && LA19_0 <= KW_SSL)||(LA19_0 >= KW_STATISTICS && LA19_0 <= KW_SUMMARY)||LA19_0==KW_TABLES||(LA19_0 >= KW_TBLPROPERTIES && LA19_0 <= KW_TERMINATED)||LA19_0==KW_TINYINT||(LA19_0 >= KW_TOUCH && LA19_0 <= KW_TRANSACTIONS)||LA19_0==KW_UNARCHIVE||LA19_0==KW_UNDO||LA19_0==KW_UNIONTYPE||(LA19_0 >= KW_UNLOCK && LA19_0 <= KW_UNSIGNED)||(LA19_0 >= KW_URI && LA19_0 <= KW_USE)||(LA19_0 >= KW_UTC && LA19_0 <= KW_VALIDATE)||LA19_0==KW_VALUE_TYPE||(LA19_0 >= KW_VECTORIZATION && LA19_0 <= KW_WEEK)||LA19_0==KW_WHILE||(LA19_0 >= KW_WORK && LA19_0 <= KW_ZONE)||LA19_0==KW_BATCH||LA19_0==KW_DAYOFWEEK||LA19_0==KW_HOLD_DDLTIME||LA19_0==KW_IGNORE||LA19_0==KW_NO_DROP||LA19_0==KW_OFFLINE||LA19_0==KW_PROTECTION||LA19_0==KW_READONLY||LA19_0==KW_TIMESTAMPTZ) ) {s = 18;}
						 
						input.seek(index19_0);
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA19_28 = input.LA(1);
						 
						int index19_28 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_28==STAR) && (synpred2_SelectClauseParser())) {s = 149;}
						else if ( (LA19_28==Identifier) ) {s = 150;}
						else if ( ((LA19_28 >= KW_ABORT && LA19_28 <= KW_AFTER)||LA19_28==KW_ALLOC_FRACTION||LA19_28==KW_ANALYZE||LA19_28==KW_ARCHIVE||(LA19_28 >= KW_ASC && LA19_28 <= KW_AST)||(LA19_28 >= KW_AUTOCOMMIT && LA19_28 <= KW_BEFORE)||(LA19_28 >= KW_BUCKET && LA19_28 <= KW_BUCKETS)||(LA19_28 >= KW_CACHE && LA19_28 <= KW_CASCADE)||LA19_28==KW_CHANGE||(LA19_28 >= KW_CHECK && LA19_28 <= KW_COLLECTION)||(LA19_28 >= KW_COLUMNS && LA19_28 <= KW_COMMENT)||(LA19_28 >= KW_COMPACT && LA19_28 <= KW_CONCATENATE)||LA19_28==KW_CONTINUE||LA19_28==KW_DATA||(LA19_28 >= KW_DATABASES && LA19_28 <= KW_DEBUG)||(LA19_28 >= KW_DEFAULT && LA19_28 <= KW_DEFINED)||(LA19_28 >= KW_DELIMITED && LA19_28 <= KW_DESC)||(LA19_28 >= KW_DETAIL && LA19_28 <= KW_DISABLE)||(LA19_28 >= KW_DISTRIBUTE && LA19_28 <= KW_DO)||LA19_28==KW_DOW||(LA19_28 >= KW_DUMP && LA19_28 <= KW_ELEM_TYPE)||LA19_28==KW_ENABLE||(LA19_28 >= KW_ENFORCED && LA19_28 <= KW_ESCAPED)||LA19_28==KW_EXCLUSIVE||(LA19_28 >= KW_EXPLAIN && LA19_28 <= KW_EXPRESSION)||(LA19_28 >= KW_FIELDS && LA19_28 <= KW_FIRST)||(LA19_28 >= KW_FORMAT && LA19_28 <= KW_FORMATTED)||LA19_28==KW_FUNCTIONS||LA19_28==KW_GROUP||(LA19_28 >= KW_HOUR && LA19_28 <= KW_IDXPROPERTIES)||(LA19_28 >= KW_INDEX && LA19_28 <= KW_INDEXES)||(LA19_28 >= KW_INPATH && LA19_28 <= KW_INPUTFORMAT)||(LA19_28 >= KW_ISOLATION && LA19_28 <= KW_JAR)||(LA19_28 >= KW_KEY && LA19_28 <= KW_LAST)||LA19_28==KW_LEVEL||(LA19_28 >= KW_LIMIT && LA19_28 <= KW_LOAD)||(LA19_28 >= KW_LOCATION && LA19_28 <= KW_LONG)||LA19_28==KW_MANAGEMENT||(LA19_28 >= KW_MAPJOIN && LA19_28 <= KW_MATERIALIZED)||LA19_28==KW_METADATA||(LA19_28 >= KW_MINUTE && LA19_28 <= KW_MONTH)||(LA19_28 >= KW_MOVE && LA19_28 <= KW_MSCK)||(LA19_28 >= KW_NORELY && LA19_28 <= KW_NOSCAN)||LA19_28==KW_NOVALIDATE||LA19_28==KW_NULLS||LA19_28==KW_OFFSET||(LA19_28 >= KW_OPERATOR && LA19_28 <= KW_OPTION)||LA19_28==KW_ORDER||(LA19_28 >= KW_OUTPUTDRIVER && LA19_28 <= KW_OUTPUTFORMAT)||(LA19_28 >= KW_OVERWRITE && LA19_28 <= KW_OWNER)||(LA19_28 >= KW_PARTITIONED && LA19_28 <= KW_PATH)||(LA19_28 >= KW_PLAN && LA19_28 <= KW_POOL)||LA19_28==KW_PRINCIPALS||(LA19_28 >= KW_PURGE && LA19_28 <= KW_QUERY_PARALLELISM)||LA19_28==KW_READ||(LA19_28 >= KW_REBUILD && LA19_28 <= KW_RECORDWRITER)||(LA19_28 >= KW_RELOAD && LA19_28 <= KW_RESTRICT)||LA19_28==KW_REWRITE||(LA19_28 >= KW_ROLE && LA19_28 <= KW_ROLES)||(LA19_28 >= KW_SCHEDULING_POLICY && LA19_28 <= KW_SECOND)||(LA19_28 >= KW_SEMI && LA19_28 <= KW_SERVER)||(LA19_28 >= KW_SETS && LA19_28 <= KW_SKEWED)||(LA19_28 >= KW_SNAPSHOT && LA19_28 <= KW_SSL)||(LA19_28 >= KW_STATISTICS && LA19_28 <= KW_SUMMARY)||LA19_28==KW_TABLES||(LA19_28 >= KW_TBLPROPERTIES && LA19_28 <= KW_TERMINATED)||LA19_28==KW_TINYINT||(LA19_28 >= KW_TOUCH && LA19_28 <= KW_TRANSACTIONS)||LA19_28==KW_UNARCHIVE||LA19_28==KW_UNDO||LA19_28==KW_UNIONTYPE||(LA19_28 >= KW_UNKNOWN && LA19_28 <= KW_UNSIGNED)||(LA19_28 >= KW_URI && LA19_28 <= KW_USE)||(LA19_28 >= KW_UTC && LA19_28 <= KW_VALIDATE)||LA19_28==KW_VALUE_TYPE||(LA19_28 >= KW_VECTORIZATION && LA19_28 <= KW_WEEK)||LA19_28==KW_WHILE||(LA19_28 >= KW_WORK && LA19_28 <= KW_ZONE)||LA19_28==KW_BATCH||LA19_28==KW_DAYOFWEEK||LA19_28==KW_HOLD_DDLTIME||LA19_28==KW_IGNORE||LA19_28==KW_NO_DROP||LA19_28==KW_OFFLINE||LA19_28==KW_PROTECTION||LA19_28==KW_READONLY||LA19_28==KW_TIMESTAMPTZ) ) {s = 151;}
						 
						input.seek(index19_28);
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA19_59 = input.LA(1);
						 
						int index19_59 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_59==STAR) && (synpred2_SelectClauseParser())) {s = 152;}
						else if ( (LA19_59==Identifier) ) {s = 153;}
						else if ( ((LA19_59 >= KW_ABORT && LA19_59 <= KW_AFTER)||LA19_59==KW_ALLOC_FRACTION||LA19_59==KW_ANALYZE||LA19_59==KW_ARCHIVE||(LA19_59 >= KW_ASC && LA19_59 <= KW_AST)||(LA19_59 >= KW_AUTOCOMMIT && LA19_59 <= KW_BEFORE)||(LA19_59 >= KW_BUCKET && LA19_59 <= KW_BUCKETS)||(LA19_59 >= KW_CACHE && LA19_59 <= KW_CASCADE)||LA19_59==KW_CHANGE||(LA19_59 >= KW_CHECK && LA19_59 <= KW_COLLECTION)||(LA19_59 >= KW_COLUMNS && LA19_59 <= KW_COMMENT)||(LA19_59 >= KW_COMPACT && LA19_59 <= KW_CONCATENATE)||LA19_59==KW_CONTINUE||LA19_59==KW_DATA||(LA19_59 >= KW_DATABASES && LA19_59 <= KW_DEBUG)||(LA19_59 >= KW_DEFAULT && LA19_59 <= KW_DEFINED)||(LA19_59 >= KW_DELIMITED && LA19_59 <= KW_DESC)||(LA19_59 >= KW_DETAIL && LA19_59 <= KW_DISABLE)||(LA19_59 >= KW_DISTRIBUTE && LA19_59 <= KW_DO)||LA19_59==KW_DOW||(LA19_59 >= KW_DUMP && LA19_59 <= KW_ELEM_TYPE)||LA19_59==KW_ENABLE||(LA19_59 >= KW_ENFORCED && LA19_59 <= KW_ESCAPED)||LA19_59==KW_EXCLUSIVE||(LA19_59 >= KW_EXPLAIN && LA19_59 <= KW_EXPRESSION)||(LA19_59 >= KW_FIELDS && LA19_59 <= KW_FIRST)||(LA19_59 >= KW_FORMAT && LA19_59 <= KW_FORMATTED)||LA19_59==KW_FUNCTIONS||LA19_59==KW_GROUP||(LA19_59 >= KW_HOUR && LA19_59 <= KW_IDXPROPERTIES)||(LA19_59 >= KW_INDEX && LA19_59 <= KW_INDEXES)||(LA19_59 >= KW_INPATH && LA19_59 <= KW_INPUTFORMAT)||(LA19_59 >= KW_ISOLATION && LA19_59 <= KW_JAR)||(LA19_59 >= KW_KEY && LA19_59 <= KW_LAST)||LA19_59==KW_LEVEL||(LA19_59 >= KW_LIMIT && LA19_59 <= KW_LOAD)||(LA19_59 >= KW_LOCATION && LA19_59 <= KW_LONG)||LA19_59==KW_MANAGEMENT||(LA19_59 >= KW_MAPJOIN && LA19_59 <= KW_MATERIALIZED)||LA19_59==KW_METADATA||(LA19_59 >= KW_MINUTE && LA19_59 <= KW_MONTH)||(LA19_59 >= KW_MOVE && LA19_59 <= KW_MSCK)||(LA19_59 >= KW_NORELY && LA19_59 <= KW_NOSCAN)||LA19_59==KW_NOVALIDATE||LA19_59==KW_NULLS||LA19_59==KW_OFFSET||(LA19_59 >= KW_OPERATOR && LA19_59 <= KW_OPTION)||LA19_59==KW_ORDER||(LA19_59 >= KW_OUTPUTDRIVER && LA19_59 <= KW_OUTPUTFORMAT)||(LA19_59 >= KW_OVERWRITE && LA19_59 <= KW_OWNER)||(LA19_59 >= KW_PARTITIONED && LA19_59 <= KW_PATH)||(LA19_59 >= KW_PLAN && LA19_59 <= KW_POOL)||LA19_59==KW_PRINCIPALS||(LA19_59 >= KW_PURGE && LA19_59 <= KW_QUERY_PARALLELISM)||LA19_59==KW_READ||(LA19_59 >= KW_REBUILD && LA19_59 <= KW_RECORDWRITER)||(LA19_59 >= KW_RELOAD && LA19_59 <= KW_RESTRICT)||LA19_59==KW_REWRITE||(LA19_59 >= KW_ROLE && LA19_59 <= KW_ROLES)||(LA19_59 >= KW_SCHEDULING_POLICY && LA19_59 <= KW_SECOND)||(LA19_59 >= KW_SEMI && LA19_59 <= KW_SERVER)||(LA19_59 >= KW_SETS && LA19_59 <= KW_SKEWED)||(LA19_59 >= KW_SNAPSHOT && LA19_59 <= KW_SSL)||(LA19_59 >= KW_STATISTICS && LA19_59 <= KW_SUMMARY)||LA19_59==KW_TABLES||(LA19_59 >= KW_TBLPROPERTIES && LA19_59 <= KW_TERMINATED)||LA19_59==KW_TINYINT||(LA19_59 >= KW_TOUCH && LA19_59 <= KW_TRANSACTIONS)||LA19_59==KW_UNARCHIVE||LA19_59==KW_UNDO||LA19_59==KW_UNIONTYPE||(LA19_59 >= KW_UNKNOWN && LA19_59 <= KW_UNSIGNED)||(LA19_59 >= KW_URI && LA19_59 <= KW_USE)||(LA19_59 >= KW_UTC && LA19_59 <= KW_VALIDATE)||LA19_59==KW_VALUE_TYPE||(LA19_59 >= KW_VECTORIZATION && LA19_59 <= KW_WEEK)||LA19_59==KW_WHILE||(LA19_59 >= KW_WORK && LA19_59 <= KW_ZONE)||LA19_59==KW_BATCH||LA19_59==KW_DAYOFWEEK||LA19_59==KW_HOLD_DDLTIME||LA19_59==KW_IGNORE||LA19_59==KW_NO_DROP||LA19_59==KW_OFFLINE||LA19_59==KW_PROTECTION||LA19_59==KW_READONLY||LA19_59==KW_TIMESTAMPTZ) ) {s = 154;}
						 
						input.seek(index19_59);
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA19_89 = input.LA(1);
						 
						int index19_89 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_89==STAR) && (synpred2_SelectClauseParser())) {s = 155;}
						else if ( (LA19_89==Identifier) ) {s = 156;}
						else if ( ((LA19_89 >= KW_ABORT && LA19_89 <= KW_AFTER)||LA19_89==KW_ALLOC_FRACTION||LA19_89==KW_ANALYZE||LA19_89==KW_ARCHIVE||(LA19_89 >= KW_ASC && LA19_89 <= KW_AST)||(LA19_89 >= KW_AUTOCOMMIT && LA19_89 <= KW_BEFORE)||(LA19_89 >= KW_BUCKET && LA19_89 <= KW_BUCKETS)||(LA19_89 >= KW_CACHE && LA19_89 <= KW_CASCADE)||LA19_89==KW_CHANGE||(LA19_89 >= KW_CHECK && LA19_89 <= KW_COLLECTION)||(LA19_89 >= KW_COLUMNS && LA19_89 <= KW_COMMENT)||(LA19_89 >= KW_COMPACT && LA19_89 <= KW_CONCATENATE)||LA19_89==KW_CONTINUE||LA19_89==KW_DATA||(LA19_89 >= KW_DATABASES && LA19_89 <= KW_DEBUG)||(LA19_89 >= KW_DEFAULT && LA19_89 <= KW_DEFINED)||(LA19_89 >= KW_DELIMITED && LA19_89 <= KW_DESC)||(LA19_89 >= KW_DETAIL && LA19_89 <= KW_DISABLE)||(LA19_89 >= KW_DISTRIBUTE && LA19_89 <= KW_DO)||LA19_89==KW_DOW||(LA19_89 >= KW_DUMP && LA19_89 <= KW_ELEM_TYPE)||LA19_89==KW_ENABLE||(LA19_89 >= KW_ENFORCED && LA19_89 <= KW_ESCAPED)||LA19_89==KW_EXCLUSIVE||(LA19_89 >= KW_EXPLAIN && LA19_89 <= KW_EXPRESSION)||(LA19_89 >= KW_FIELDS && LA19_89 <= KW_FIRST)||(LA19_89 >= KW_FORMAT && LA19_89 <= KW_FORMATTED)||LA19_89==KW_FUNCTIONS||LA19_89==KW_GROUP||(LA19_89 >= KW_HOUR && LA19_89 <= KW_IDXPROPERTIES)||(LA19_89 >= KW_INDEX && LA19_89 <= KW_INDEXES)||(LA19_89 >= KW_INPATH && LA19_89 <= KW_INPUTFORMAT)||(LA19_89 >= KW_ISOLATION && LA19_89 <= KW_JAR)||(LA19_89 >= KW_KEY && LA19_89 <= KW_LAST)||LA19_89==KW_LEVEL||(LA19_89 >= KW_LIMIT && LA19_89 <= KW_LOAD)||(LA19_89 >= KW_LOCATION && LA19_89 <= KW_LONG)||LA19_89==KW_MANAGEMENT||(LA19_89 >= KW_MAPJOIN && LA19_89 <= KW_MATERIALIZED)||LA19_89==KW_METADATA||(LA19_89 >= KW_MINUTE && LA19_89 <= KW_MONTH)||(LA19_89 >= KW_MOVE && LA19_89 <= KW_MSCK)||(LA19_89 >= KW_NORELY && LA19_89 <= KW_NOSCAN)||LA19_89==KW_NOVALIDATE||LA19_89==KW_NULLS||LA19_89==KW_OFFSET||(LA19_89 >= KW_OPERATOR && LA19_89 <= KW_OPTION)||LA19_89==KW_ORDER||(LA19_89 >= KW_OUTPUTDRIVER && LA19_89 <= KW_OUTPUTFORMAT)||(LA19_89 >= KW_OVERWRITE && LA19_89 <= KW_OWNER)||(LA19_89 >= KW_PARTITIONED && LA19_89 <= KW_PATH)||(LA19_89 >= KW_PLAN && LA19_89 <= KW_POOL)||LA19_89==KW_PRINCIPALS||(LA19_89 >= KW_PURGE && LA19_89 <= KW_QUERY_PARALLELISM)||LA19_89==KW_READ||(LA19_89 >= KW_REBUILD && LA19_89 <= KW_RECORDWRITER)||(LA19_89 >= KW_RELOAD && LA19_89 <= KW_RESTRICT)||LA19_89==KW_REWRITE||(LA19_89 >= KW_ROLE && LA19_89 <= KW_ROLES)||(LA19_89 >= KW_SCHEDULING_POLICY && LA19_89 <= KW_SECOND)||(LA19_89 >= KW_SEMI && LA19_89 <= KW_SERVER)||(LA19_89 >= KW_SETS && LA19_89 <= KW_SKEWED)||(LA19_89 >= KW_SNAPSHOT && LA19_89 <= KW_SSL)||(LA19_89 >= KW_STATISTICS && LA19_89 <= KW_SUMMARY)||LA19_89==KW_TABLES||(LA19_89 >= KW_TBLPROPERTIES && LA19_89 <= KW_TERMINATED)||LA19_89==KW_TINYINT||(LA19_89 >= KW_TOUCH && LA19_89 <= KW_TRANSACTIONS)||LA19_89==KW_UNARCHIVE||LA19_89==KW_UNDO||LA19_89==KW_UNIONTYPE||(LA19_89 >= KW_UNKNOWN && LA19_89 <= KW_UNSIGNED)||(LA19_89 >= KW_URI && LA19_89 <= KW_USE)||(LA19_89 >= KW_UTC && LA19_89 <= KW_VALIDATE)||LA19_89==KW_VALUE_TYPE||(LA19_89 >= KW_VECTORIZATION && LA19_89 <= KW_WEEK)||LA19_89==KW_WHILE||(LA19_89 >= KW_WORK && LA19_89 <= KW_ZONE)||LA19_89==KW_BATCH||LA19_89==KW_DAYOFWEEK||LA19_89==KW_HOLD_DDLTIME||LA19_89==KW_IGNORE||LA19_89==KW_NO_DROP||LA19_89==KW_OFFLINE||LA19_89==KW_PROTECTION||LA19_89==KW_READONLY||LA19_89==KW_TIMESTAMPTZ) ) {s = 157;}
						 
						input.seek(index19_89);
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA19_119 = input.LA(1);
						 
						int index19_119 = input.index();
						input.rewind();
						s = -1;
						if ( (LA19_119==STAR) && (synpred2_SelectClauseParser())) {s = 158;}
						else if ( (LA19_119==Identifier) ) {s = 159;}
						else if ( ((LA19_119 >= KW_ABORT && LA19_119 <= KW_AFTER)||LA19_119==KW_ALLOC_FRACTION||LA19_119==KW_ANALYZE||LA19_119==KW_ARCHIVE||(LA19_119 >= KW_ASC && LA19_119 <= KW_AST)||(LA19_119 >= KW_AUTOCOMMIT && LA19_119 <= KW_BEFORE)||(LA19_119 >= KW_BUCKET && LA19_119 <= KW_BUCKETS)||(LA19_119 >= KW_CACHE && LA19_119 <= KW_CASCADE)||LA19_119==KW_CHANGE||(LA19_119 >= KW_CHECK && LA19_119 <= KW_COLLECTION)||(LA19_119 >= KW_COLUMNS && LA19_119 <= KW_COMMENT)||(LA19_119 >= KW_COMPACT && LA19_119 <= KW_CONCATENATE)||LA19_119==KW_CONTINUE||LA19_119==KW_DATA||(LA19_119 >= KW_DATABASES && LA19_119 <= KW_DEBUG)||(LA19_119 >= KW_DEFAULT && LA19_119 <= KW_DEFINED)||(LA19_119 >= KW_DELIMITED && LA19_119 <= KW_DESC)||(LA19_119 >= KW_DETAIL && LA19_119 <= KW_DISABLE)||(LA19_119 >= KW_DISTRIBUTE && LA19_119 <= KW_DO)||LA19_119==KW_DOW||(LA19_119 >= KW_DUMP && LA19_119 <= KW_ELEM_TYPE)||LA19_119==KW_ENABLE||(LA19_119 >= KW_ENFORCED && LA19_119 <= KW_ESCAPED)||LA19_119==KW_EXCLUSIVE||(LA19_119 >= KW_EXPLAIN && LA19_119 <= KW_EXPRESSION)||(LA19_119 >= KW_FIELDS && LA19_119 <= KW_FIRST)||(LA19_119 >= KW_FORMAT && LA19_119 <= KW_FORMATTED)||LA19_119==KW_FUNCTIONS||LA19_119==KW_GROUP||(LA19_119 >= KW_HOUR && LA19_119 <= KW_IDXPROPERTIES)||(LA19_119 >= KW_INDEX && LA19_119 <= KW_INDEXES)||(LA19_119 >= KW_INPATH && LA19_119 <= KW_INPUTFORMAT)||(LA19_119 >= KW_ISOLATION && LA19_119 <= KW_JAR)||(LA19_119 >= KW_KEY && LA19_119 <= KW_LAST)||LA19_119==KW_LEVEL||(LA19_119 >= KW_LIMIT && LA19_119 <= KW_LOAD)||(LA19_119 >= KW_LOCATION && LA19_119 <= KW_LONG)||LA19_119==KW_MANAGEMENT||(LA19_119 >= KW_MAPJOIN && LA19_119 <= KW_MATERIALIZED)||LA19_119==KW_METADATA||(LA19_119 >= KW_MINUTE && LA19_119 <= KW_MONTH)||(LA19_119 >= KW_MOVE && LA19_119 <= KW_MSCK)||(LA19_119 >= KW_NORELY && LA19_119 <= KW_NOSCAN)||LA19_119==KW_NOVALIDATE||LA19_119==KW_NULLS||LA19_119==KW_OFFSET||(LA19_119 >= KW_OPERATOR && LA19_119 <= KW_OPTION)||LA19_119==KW_ORDER||(LA19_119 >= KW_OUTPUTDRIVER && LA19_119 <= KW_OUTPUTFORMAT)||(LA19_119 >= KW_OVERWRITE && LA19_119 <= KW_OWNER)||(LA19_119 >= KW_PARTITIONED && LA19_119 <= KW_PATH)||(LA19_119 >= KW_PLAN && LA19_119 <= KW_POOL)||LA19_119==KW_PRINCIPALS||(LA19_119 >= KW_PURGE && LA19_119 <= KW_QUERY_PARALLELISM)||LA19_119==KW_READ||(LA19_119 >= KW_REBUILD && LA19_119 <= KW_RECORDWRITER)||(LA19_119 >= KW_RELOAD && LA19_119 <= KW_RESTRICT)||LA19_119==KW_REWRITE||(LA19_119 >= KW_ROLE && LA19_119 <= KW_ROLES)||(LA19_119 >= KW_SCHEDULING_POLICY && LA19_119 <= KW_SECOND)||(LA19_119 >= KW_SEMI && LA19_119 <= KW_SERVER)||(LA19_119 >= KW_SETS && LA19_119 <= KW_SKEWED)||(LA19_119 >= KW_SNAPSHOT && LA19_119 <= KW_SSL)||(LA19_119 >= KW_STATISTICS && LA19_119 <= KW_SUMMARY)||LA19_119==KW_TABLES||(LA19_119 >= KW_TBLPROPERTIES && LA19_119 <= KW_TERMINATED)||LA19_119==KW_TINYINT||(LA19_119 >= KW_TOUCH && LA19_119 <= KW_TRANSACTIONS)||LA19_119==KW_UNARCHIVE||LA19_119==KW_UNDO||LA19_119==KW_UNIONTYPE||(LA19_119 >= KW_UNKNOWN && LA19_119 <= KW_UNSIGNED)||(LA19_119 >= KW_URI && LA19_119 <= KW_USE)||(LA19_119 >= KW_UTC && LA19_119 <= KW_VALIDATE)||LA19_119==KW_VALUE_TYPE||(LA19_119 >= KW_VECTORIZATION && LA19_119 <= KW_WEEK)||LA19_119==KW_WHILE||(LA19_119 >= KW_WORK && LA19_119 <= KW_ZONE)||LA19_119==KW_BATCH||LA19_119==KW_DAYOFWEEK||LA19_119==KW_HOLD_DDLTIME||LA19_119==KW_IGNORE||LA19_119==KW_NO_DROP||LA19_119==KW_OFFLINE||LA19_119==KW_PROTECTION||LA19_119==KW_READONLY||LA19_119==KW_TIMESTAMPTZ) ) {s = 160;}
						 
						input.seek(index19_119);
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA19_150 = input.LA(1);
						 
						int index19_150 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_150);
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA19_151 = input.LA(1);
						 
						int index19_151 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_151);
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA19_153 = input.LA(1);
						 
						int index19_153 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_153);
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA19_154 = input.LA(1);
						 
						int index19_154 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_154);
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA19_156 = input.LA(1);
						 
						int index19_156 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_156);
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA19_157 = input.LA(1);
						 
						int index19_157 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_157);
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA19_159 = input.LA(1);
						 
						int index19_159 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_159);
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA19_160 = input.LA(1);
						 
						int index19_160 = input.index();
						input.rewind();
						s = -1;
						if ( (synpred2_SelectClauseParser()) ) {s = 158;}
						else if ( (true) ) {s = 4;}
						 
						input.seek(index19_160);
						if ( s>=0 ) return s;
						break;
			}
			if (state.backtracking>0) {state.failed=true; return -1;}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 19, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	public static final BitSet FOLLOW_KW_SELECT_in_selectClause71 = new BitSet(new long[]{0xEFB76D8BFF001000L,0x9F35BFEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x01E487C9F5CDF2ABL,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_QUERY_HINT_in_selectClause73 = new BitSet(new long[]{0xEFB76D8BFF001000L,0x9F35BFEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2ABL,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_ALL_in_selectClause79 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_DISTINCT_in_selectClause85 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectList_in_selectClause89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_TRANSFORM_in_selectClause123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_selectTrfmClause_in_selectClause125 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_trfmClause_in_selectClause196 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectItem_in_selectList239 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_selectList243 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectItem_in_selectList246 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause285 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectExpressionList_in_selectTrfmClause287 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause289 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000040000L,0x0000000000200000L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause297 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_recordWriter_in_selectTrfmClause301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_KW_USING_in_selectTrfmClause307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_selectTrfmClause309 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_selectTrfmClause317 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_selectTrfmClause321 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause324 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause328 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectTrfmClause331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_aliasList_in_selectTrfmClause337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_selectTrfmClause341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_rowFormat_in_selectTrfmClause353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_recordReader_in_selectTrfmClause357 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectItem426 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectItem448 = new BitSet(new long[]{0xE9B06E8AFD000002L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem458 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_selectItem461 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_AS_in_selectItem467 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
	public static final BitSet FOLLOW_LPAREN_in_selectItem469 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_selectItem471 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_selectItem474 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_selectItem476 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_selectItem480 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MAP_in_trfmClause535 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000040000L,0x0000000000200000L});
	public static final BitSet FOLLOW_KW_REDUCE_in_trfmClause550 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectExpressionList_in_trfmClause552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000040000L,0x0000000000200000L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_recordWriter_in_trfmClause566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
	public static final BitSet FOLLOW_KW_USING_in_trfmClause572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_trfmClause574 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_AS_in_trfmClause582 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_LPAREN_in_trfmClause586 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause589 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_trfmClause596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_aliasList_in_trfmClause602 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_columnNameTypeList_in_trfmClause606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_rowFormat_in_trfmClause618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_recordReader_in_trfmClause622 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_selectExpression691 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_selectExpression703 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList734 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_selectExpressionList737 = new BitSet(new long[]{0xEFB76D8AFF001000L,0x9F35BDEEEFD613DBL,0xBEE8FB95D9DA30FDL,0x1EBD0F76CB2FDB5FL,0xEE74FEFFDEF0CBFFL,0x00E487C9F5CDF2A9L,0x0000010000000007L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_selectExpression_in_selectExpressionList739 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_KW_WINDOW_in_window_clause776 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause778 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_window_clause781 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_window_defn_in_window_clause783 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_identifier_in_window_defn815 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_KW_AS_in_window_defn817 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000087C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_window_specification_in_window_defn819 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_window_specification851 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_window_specification857 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CFD0F7ECB2ADB5EL,0xE874FEF7DEF8CBFFL,0x100007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_window_specification859 = new BitSet(new long[]{0x4000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0040000808000000L,0x0000002000080000L,0x1000000000000000L});
	public static final BitSet FOLLOW_partitioningSpec_in_window_specification862 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L,0x0000000000080000L,0x1000000000000000L});
	public static final BitSet FOLLOW_window_frame_in_window_specification865 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_RPAREN_in_window_specification868 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_range_expression_in_window_frame895 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_window_value_expression_in_window_frame900 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression920 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_range_expression924 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ROWS_in_window_range_expression938 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_range_expression940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression944 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_range_expression946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_range_expression950 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression982 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_start_boundary_in_window_value_expression986 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RANGE_in_window_value_expression1000 = new BitSet(new long[]{0x0000800000000000L});
	public static final BitSet FOLLOW_KW_BETWEEN_in_window_value_expression1002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1006 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_KW_AND_in_window_value_expression1008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000040L});
	public static final BitSet FOLLOW_window_frame_boundary_in_window_value_expression1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_start_boundary1045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1047 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_start_boundary1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_start_boundary1064 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_start_boundary1077 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_start_boundary1079 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNBOUNDED_in_window_frame_boundary1108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1117 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CURRENT_in_window_frame_boundary1134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
	public static final BitSet FOLLOW_KW_ROW_in_window_frame_boundary1136 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Number_in_window_frame_boundary1149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000100L,0x0000100000000000L});
	public static final BitSet FOLLOW_KW_PRECEDING_in_window_frame_boundary1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_FOLLOWING_in_window_frame_boundary1160 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_synpred1_SelectClauseParser421 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAllColumns_in_synpred2_SelectClauseParser686 = new BitSet(new long[]{0x0000000000000002L});
}
