// $ANTLR 3.5.2 ResourcePlanParser.g 2019-08-18 22:38:06

package com.sql.antlr3.hive;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;


import com.sql.antlr3.hive.parse.ASTNode;
import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class HiveParser_ResourcePlanParser extends Parser {
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


	public HiveParser_ResourcePlanParser(TokenStream input, HiveParser gHiveParser) {
		this(input, new RecognizerSharedState(), gHiveParser);
	}
	public HiveParser_ResourcePlanParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
	@Override public String getGrammarFileName() { return "ResourcePlanParser.g"; }


	  @Override
	  public Object recoverFromMismatchedSet(IntStream input,
	      RecognitionException re, BitSet follow) throws RecognitionException {
	    return gParent.recoverFromMismatchedSet(input, re, follow);
	  }

	  @Override
	  public void displayRecognitionError(String[] tokenNames,
	      RecognitionException e) {
	    gParent.displayRecognitionError(tokenNames, e);
	  }


	public static class resourcePlanDdlStatements_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "resourcePlanDdlStatements"
	// ResourcePlanParser.g:48:1: resourcePlanDdlStatements : ( createResourcePlanStatement | alterResourcePlanStatement | dropResourcePlanStatement | globalWmStatement | replaceResourcePlanStatement | createTriggerStatement | alterTriggerStatement | dropTriggerStatement | createPoolStatement | alterPoolStatement | dropPoolStatement | createMappingStatement | alterMappingStatement | dropMappingStatement );
	public final HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return resourcePlanDdlStatements() throws RecognitionException {
		HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return retval = new HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope createResourcePlanStatement1 =null;
		ParserRuleReturnScope alterResourcePlanStatement2 =null;
		ParserRuleReturnScope dropResourcePlanStatement3 =null;
		ParserRuleReturnScope globalWmStatement4 =null;
		ParserRuleReturnScope replaceResourcePlanStatement5 =null;
		ParserRuleReturnScope createTriggerStatement6 =null;
		ParserRuleReturnScope alterTriggerStatement7 =null;
		ParserRuleReturnScope dropTriggerStatement8 =null;
		ParserRuleReturnScope createPoolStatement9 =null;
		ParserRuleReturnScope alterPoolStatement10 =null;
		ParserRuleReturnScope dropPoolStatement11 =null;
		ParserRuleReturnScope createMappingStatement12 =null;
		ParserRuleReturnScope alterMappingStatement13 =null;
		ParserRuleReturnScope dropMappingStatement14 =null;


		try {
			// ResourcePlanParser.g:49:5: ( createResourcePlanStatement | alterResourcePlanStatement | dropResourcePlanStatement | globalWmStatement | replaceResourcePlanStatement | createTriggerStatement | alterTriggerStatement | dropTriggerStatement | createPoolStatement | alterPoolStatement | dropPoolStatement | createMappingStatement | alterMappingStatement | dropMappingStatement )
			int alt1=14;
			switch ( input.LA(1) ) {
			case KW_CREATE:
				{
				switch ( input.LA(2) ) {
				case KW_RESOURCE:
					{
					alt1=1;
					}
					break;
				case KW_TRIGGER:
					{
					alt1=6;
					}
					break;
				case KW_POOL:
					{
					alt1=9;
					}
					break;
				case KW_APPLICATION:
				case KW_GROUP:
				case KW_USER:
					{
					alt1=12;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_ALTER:
				{
				switch ( input.LA(2) ) {
				case KW_RESOURCE:
					{
					alt1=2;
					}
					break;
				case KW_TRIGGER:
					{
					alt1=7;
					}
					break;
				case KW_POOL:
					{
					alt1=10;
					}
					break;
				case KW_APPLICATION:
				case KW_GROUP:
				case KW_USER:
					{
					alt1=13;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_DROP:
				{
				switch ( input.LA(2) ) {
				case KW_RESOURCE:
					{
					alt1=3;
					}
					break;
				case KW_TRIGGER:
					{
					alt1=8;
					}
					break;
				case KW_POOL:
					{
					alt1=11;
					}
					break;
				case KW_APPLICATION:
				case KW_GROUP:
				case KW_USER:
					{
					alt1=14;
					}
					break;
				default:
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 1, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}
				}
				break;
			case KW_DISABLE:
			case KW_ENABLE:
				{
				alt1=4;
				}
				break;
			case KW_REPLACE:
				{
				alt1=5;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}
			switch (alt1) {
				case 1 :
					// ResourcePlanParser.g:49:7: createResourcePlanStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_createResourcePlanStatement_in_resourcePlanDdlStatements65);
					createResourcePlanStatement1=createResourcePlanStatement();
					state._fsp--;

					adaptor.addChild(root_0, createResourcePlanStatement1.getTree());

					}
					break;
				case 2 :
					// ResourcePlanParser.g:50:7: alterResourcePlanStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterResourcePlanStatement_in_resourcePlanDdlStatements73);
					alterResourcePlanStatement2=alterResourcePlanStatement();
					state._fsp--;

					adaptor.addChild(root_0, alterResourcePlanStatement2.getTree());

					}
					break;
				case 3 :
					// ResourcePlanParser.g:51:7: dropResourcePlanStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_dropResourcePlanStatement_in_resourcePlanDdlStatements81);
					dropResourcePlanStatement3=dropResourcePlanStatement();
					state._fsp--;

					adaptor.addChild(root_0, dropResourcePlanStatement3.getTree());

					}
					break;
				case 4 :
					// ResourcePlanParser.g:52:7: globalWmStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_globalWmStatement_in_resourcePlanDdlStatements89);
					globalWmStatement4=globalWmStatement();
					state._fsp--;

					adaptor.addChild(root_0, globalWmStatement4.getTree());

					}
					break;
				case 5 :
					// ResourcePlanParser.g:53:7: replaceResourcePlanStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_replaceResourcePlanStatement_in_resourcePlanDdlStatements97);
					replaceResourcePlanStatement5=replaceResourcePlanStatement();
					state._fsp--;

					adaptor.addChild(root_0, replaceResourcePlanStatement5.getTree());

					}
					break;
				case 6 :
					// ResourcePlanParser.g:54:7: createTriggerStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_createTriggerStatement_in_resourcePlanDdlStatements105);
					createTriggerStatement6=createTriggerStatement();
					state._fsp--;

					adaptor.addChild(root_0, createTriggerStatement6.getTree());

					}
					break;
				case 7 :
					// ResourcePlanParser.g:55:7: alterTriggerStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterTriggerStatement_in_resourcePlanDdlStatements113);
					alterTriggerStatement7=alterTriggerStatement();
					state._fsp--;

					adaptor.addChild(root_0, alterTriggerStatement7.getTree());

					}
					break;
				case 8 :
					// ResourcePlanParser.g:56:7: dropTriggerStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_dropTriggerStatement_in_resourcePlanDdlStatements121);
					dropTriggerStatement8=dropTriggerStatement();
					state._fsp--;

					adaptor.addChild(root_0, dropTriggerStatement8.getTree());

					}
					break;
				case 9 :
					// ResourcePlanParser.g:57:7: createPoolStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_createPoolStatement_in_resourcePlanDdlStatements129);
					createPoolStatement9=createPoolStatement();
					state._fsp--;

					adaptor.addChild(root_0, createPoolStatement9.getTree());

					}
					break;
				case 10 :
					// ResourcePlanParser.g:58:7: alterPoolStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterPoolStatement_in_resourcePlanDdlStatements137);
					alterPoolStatement10=alterPoolStatement();
					state._fsp--;

					adaptor.addChild(root_0, alterPoolStatement10.getTree());

					}
					break;
				case 11 :
					// ResourcePlanParser.g:59:7: dropPoolStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_dropPoolStatement_in_resourcePlanDdlStatements145);
					dropPoolStatement11=dropPoolStatement();
					state._fsp--;

					adaptor.addChild(root_0, dropPoolStatement11.getTree());

					}
					break;
				case 12 :
					// ResourcePlanParser.g:60:7: createMappingStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_createMappingStatement_in_resourcePlanDdlStatements153);
					createMappingStatement12=createMappingStatement();
					state._fsp--;

					adaptor.addChild(root_0, createMappingStatement12.getTree());

					}
					break;
				case 13 :
					// ResourcePlanParser.g:61:7: alterMappingStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_alterMappingStatement_in_resourcePlanDdlStatements161);
					alterMappingStatement13=alterMappingStatement();
					state._fsp--;

					adaptor.addChild(root_0, alterMappingStatement13.getTree());

					}
					break;
				case 14 :
					// ResourcePlanParser.g:62:7: dropMappingStatement
					{
					root_0 = (ASTNode)adaptor.nil();


					pushFollow(FOLLOW_dropMappingStatement_in_resourcePlanDdlStatements169);
					dropMappingStatement14=dropMappingStatement();
					state._fsp--;

					adaptor.addChild(root_0, dropMappingStatement14.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "resourcePlanDdlStatements"


	public static class rpAssign_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "rpAssign"
	// ResourcePlanParser.g:65:1: rpAssign : ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) ) ;
	public final HiveParser_ResourcePlanParser.rpAssign_return rpAssign() throws RecognitionException {
		HiveParser_ResourcePlanParser.rpAssign_return retval = new HiveParser_ResourcePlanParser.rpAssign_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token parallelism=null;
		Token KW_QUERY_PARALLELISM15=null;
		Token EQUAL16=null;
		Token KW_DEFAULT17=null;
		Token KW_POOL18=null;
		Token EQUAL19=null;
		ParserRuleReturnScope poolPath20 =null;

		ASTNode parallelism_tree=null;
		ASTNode KW_QUERY_PARALLELISM15_tree=null;
		ASTNode EQUAL16_tree=null;
		ASTNode KW_DEFAULT17_tree=null;
		ASTNode KW_POOL18_tree=null;
		ASTNode EQUAL19_tree=null;
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_KW_DEFAULT=new RewriteRuleTokenStream(adaptor,"token KW_DEFAULT");
		RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"rpAssign", state); 
		try {
			// ResourcePlanParser.g:68:3: ( ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) ) )
			// ResourcePlanParser.g:68:5: ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) )
			{
			// ResourcePlanParser.g:68:5: ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0==KW_QUERY_PARALLELISM) ) {
				alt2=1;
			}
			else if ( (LA2_0==KW_DEFAULT) ) {
				alt2=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// ResourcePlanParser.g:69:7: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
					{
					// ResourcePlanParser.g:69:7: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
					// ResourcePlanParser.g:69:8: KW_QUERY_PARALLELISM EQUAL parallelism= Number
					{
					KW_QUERY_PARALLELISM15=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_rpAssign203);  
					stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM15);

					EQUAL16=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_rpAssign205);  
					stream_EQUAL.add(EQUAL16);

					parallelism=(Token)match(input,Number,FOLLOW_Number_in_rpAssign209);  
					stream_Number.add(parallelism);

					}

					// AST REWRITE
					// elements: parallelism
					// token labels: parallelism
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_parallelism=new RewriteRuleTokenStream(adaptor,"token parallelism",parallelism);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 69:55: -> ^( TOK_QUERY_PARALLELISM $parallelism)
					{
						// ResourcePlanParser.g:69:58: ^( TOK_QUERY_PARALLELISM $parallelism)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM"), root_1);
						adaptor.addChild(root_1, stream_parallelism.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ResourcePlanParser.g:70:7: ( KW_DEFAULT KW_POOL EQUAL poolPath )
					{
					// ResourcePlanParser.g:70:7: ( KW_DEFAULT KW_POOL EQUAL poolPath )
					// ResourcePlanParser.g:70:8: KW_DEFAULT KW_POOL EQUAL poolPath
					{
					KW_DEFAULT17=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_rpAssign228);  
					stream_KW_DEFAULT.add(KW_DEFAULT17);

					KW_POOL18=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_rpAssign230);  
					stream_KW_POOL.add(KW_POOL18);

					EQUAL19=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_rpAssign232);  
					stream_EQUAL.add(EQUAL19);

					pushFollow(FOLLOW_poolPath_in_rpAssign234);
					poolPath20=poolPath();
					state._fsp--;

					stream_poolPath.add(poolPath20.getTree());
					}

					// AST REWRITE
					// elements: poolPath
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 70:43: -> ^( TOK_DEFAULT_POOL poolPath )
					{
						// ResourcePlanParser.g:70:46: ^( TOK_DEFAULT_POOL poolPath )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DEFAULT_POOL, "TOK_DEFAULT_POOL"), root_1);
						adaptor.addChild(root_1, stream_poolPath.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rpAssign"


	public static class rpAssignList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "rpAssignList"
	// ResourcePlanParser.g:74:1: rpAssignList : rpAssign ( COMMA rpAssign )* -> ( rpAssign )+ ;
	public final HiveParser_ResourcePlanParser.rpAssignList_return rpAssignList() throws RecognitionException {
		HiveParser_ResourcePlanParser.rpAssignList_return retval = new HiveParser_ResourcePlanParser.rpAssignList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA22=null;
		ParserRuleReturnScope rpAssign21 =null;
		ParserRuleReturnScope rpAssign23 =null;

		ASTNode COMMA22_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_rpAssign=new RewriteRuleSubtreeStream(adaptor,"rule rpAssign");

		 gParent.pushMsg(retval.start,"rpAssignList", state); 
		try {
			// ResourcePlanParser.g:77:3: ( rpAssign ( COMMA rpAssign )* -> ( rpAssign )+ )
			// ResourcePlanParser.g:77:5: rpAssign ( COMMA rpAssign )*
			{
			pushFollow(FOLLOW_rpAssign_in_rpAssignList272);
			rpAssign21=rpAssign();
			state._fsp--;

			stream_rpAssign.add(rpAssign21.getTree());
			// ResourcePlanParser.g:77:14: ( COMMA rpAssign )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( (LA3_0==COMMA) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// ResourcePlanParser.g:77:15: COMMA rpAssign
					{
					COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_rpAssignList275);  
					stream_COMMA.add(COMMA22);

					pushFollow(FOLLOW_rpAssign_in_rpAssignList277);
					rpAssign23=rpAssign();
					state._fsp--;

					stream_rpAssign.add(rpAssign23.getTree());
					}
					break;

				default :
					break loop3;
				}
			}

			// AST REWRITE
			// elements: rpAssign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 77:32: -> ( rpAssign )+
			{
				if ( !(stream_rpAssign.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rpAssign.hasNext() ) {
					adaptor.addChild(root_0, stream_rpAssign.nextTree());
				}
				stream_rpAssign.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rpAssignList"


	public static class rpUnassign_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "rpUnassign"
	// ResourcePlanParser.g:80:1: rpUnassign : ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM TOK_NULL ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL TOK_NULL ) ) ;
	public final HiveParser_ResourcePlanParser.rpUnassign_return rpUnassign() throws RecognitionException {
		HiveParser_ResourcePlanParser.rpUnassign_return retval = new HiveParser_ResourcePlanParser.rpUnassign_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_QUERY_PARALLELISM24=null;
		Token KW_DEFAULT25=null;
		Token KW_POOL26=null;

		ASTNode KW_QUERY_PARALLELISM24_tree=null;
		ASTNode KW_DEFAULT25_tree=null;
		ASTNode KW_POOL26_tree=null;
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_KW_DEFAULT=new RewriteRuleTokenStream(adaptor,"token KW_DEFAULT");
		RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");

		 gParent.pushMsg(retval.start,"rpAssign", state); 
		try {
			// ResourcePlanParser.g:83:3: ( ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM TOK_NULL ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL TOK_NULL ) ) )
			// ResourcePlanParser.g:83:5: ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM TOK_NULL ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL TOK_NULL ) )
			{
			// ResourcePlanParser.g:83:5: ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM TOK_NULL ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL TOK_NULL ) )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0==KW_QUERY_PARALLELISM) ) {
				alt4=1;
			}
			else if ( (LA4_0==KW_DEFAULT) ) {
				alt4=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// ResourcePlanParser.g:84:7: ( KW_QUERY_PARALLELISM )
					{
					// ResourcePlanParser.g:84:7: ( KW_QUERY_PARALLELISM )
					// ResourcePlanParser.g:84:8: KW_QUERY_PARALLELISM
					{
					KW_QUERY_PARALLELISM24=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_rpUnassign316);  
					stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM24);

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 84:30: -> ^( TOK_QUERY_PARALLELISM TOK_NULL )
					{
						// ResourcePlanParser.g:84:33: ^( TOK_QUERY_PARALLELISM TOK_NULL )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_NULL, "TOK_NULL"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ResourcePlanParser.g:85:7: ( KW_DEFAULT KW_POOL )
					{
					// ResourcePlanParser.g:85:7: ( KW_DEFAULT KW_POOL )
					// ResourcePlanParser.g:85:8: KW_DEFAULT KW_POOL
					{
					KW_DEFAULT25=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_rpUnassign334);  
					stream_KW_DEFAULT.add(KW_DEFAULT25);

					KW_POOL26=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_rpUnassign336);  
					stream_KW_POOL.add(KW_POOL26);

					}

					// AST REWRITE
					// elements: 
					// token labels: 
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 85:28: -> ^( TOK_DEFAULT_POOL TOK_NULL )
					{
						// ResourcePlanParser.g:85:31: ^( TOK_DEFAULT_POOL TOK_NULL )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DEFAULT_POOL, "TOK_DEFAULT_POOL"), root_1);
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_NULL, "TOK_NULL"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rpUnassign"


	public static class rpUnassignList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "rpUnassignList"
	// ResourcePlanParser.g:89:1: rpUnassignList : rpUnassign ( COMMA rpUnassign )* -> ( rpUnassign )+ ;
	public final HiveParser_ResourcePlanParser.rpUnassignList_return rpUnassignList() throws RecognitionException {
		HiveParser_ResourcePlanParser.rpUnassignList_return retval = new HiveParser_ResourcePlanParser.rpUnassignList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA28=null;
		ParserRuleReturnScope rpUnassign27 =null;
		ParserRuleReturnScope rpUnassign29 =null;

		ASTNode COMMA28_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_rpUnassign=new RewriteRuleSubtreeStream(adaptor,"rule rpUnassign");

		 gParent.pushMsg(retval.start,"rpAssignList", state); 
		try {
			// ResourcePlanParser.g:92:3: ( rpUnassign ( COMMA rpUnassign )* -> ( rpUnassign )+ )
			// ResourcePlanParser.g:92:5: rpUnassign ( COMMA rpUnassign )*
			{
			pushFollow(FOLLOW_rpUnassign_in_rpUnassignList374);
			rpUnassign27=rpUnassign();
			state._fsp--;

			stream_rpUnassign.add(rpUnassign27.getTree());
			// ResourcePlanParser.g:92:16: ( COMMA rpUnassign )*
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( (LA5_0==COMMA) ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// ResourcePlanParser.g:92:17: COMMA rpUnassign
					{
					COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_rpUnassignList377);  
					stream_COMMA.add(COMMA28);

					pushFollow(FOLLOW_rpUnassign_in_rpUnassignList379);
					rpUnassign29=rpUnassign();
					state._fsp--;

					stream_rpUnassign.add(rpUnassign29.getTree());
					}
					break;

				default :
					break loop5;
				}
			}

			// AST REWRITE
			// elements: rpUnassign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 92:36: -> ( rpUnassign )+
			{
				if ( !(stream_rpUnassign.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_rpUnassign.hasNext() ) {
					adaptor.addChild(root_0, stream_rpUnassign.nextTree());
				}
				stream_rpUnassign.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "rpUnassignList"


	public static class createResourcePlanStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createResourcePlanStatement"
	// ResourcePlanParser.g:95:1: createResourcePlanStatement : KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) ) ;
	public final HiveParser_ResourcePlanParser.createResourcePlanStatement_return createResourcePlanStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.createResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.createResourcePlanStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_CREATE30=null;
		Token KW_RESOURCE31=null;
		Token KW_PLAN32=null;
		Token KW_LIKE34=null;
		Token KW_WITH35=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope likeName =null;
		ParserRuleReturnScope ifNotExists33 =null;
		ParserRuleReturnScope rpAssignList36 =null;

		ASTNode KW_CREATE30_tree=null;
		ASTNode KW_RESOURCE31_tree=null;
		ASTNode KW_PLAN32_tree=null;
		ASTNode KW_LIKE34_tree=null;
		ASTNode KW_WITH35_tree=null;
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
		RewriteRuleTokenStream stream_KW_LIKE=new RewriteRuleTokenStream(adaptor,"token KW_LIKE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_rpAssignList=new RewriteRuleSubtreeStream(adaptor,"rule rpAssignList");
		RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");

		 gParent.pushMsg(retval.start,"create resource plan statement", state); 
		try {
			// ResourcePlanParser.g:98:5: ( KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) ) )
			// ResourcePlanParser.g:98:7: KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) )
			{
			KW_CREATE30=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createResourcePlanStatement411);  
			stream_KW_CREATE.add(KW_CREATE30);

			KW_RESOURCE31=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_createResourcePlanStatement413);  
			stream_KW_RESOURCE.add(KW_RESOURCE31);

			KW_PLAN32=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_createResourcePlanStatement415);  
			stream_KW_PLAN.add(KW_PLAN32);

			// ResourcePlanParser.g:98:37: ( ifNotExists )?
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0==KW_IF) ) {
				alt6=1;
			}
			switch (alt6) {
				case 1 :
					// ResourcePlanParser.g:98:37: ifNotExists
					{
					pushFollow(FOLLOW_ifNotExists_in_createResourcePlanStatement417);
					ifNotExists33=gHiveParser.ifNotExists();
					state._fsp--;

					stream_ifNotExists.add(ifNotExists33.getTree());
					}
					break;

			}

			// ResourcePlanParser.g:98:50: ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==Identifier) ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1==KW_LIKE) ) {
					alt8=1;
				}
				else if ( (LA8_1==EOF||LA8_1==KW_WITH) ) {
					alt8=2;
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
			else if ( ((LA8_0 >= KW_ABORT && LA8_0 <= KW_AFTER)||LA8_0==KW_ALLOC_FRACTION||LA8_0==KW_ANALYZE||LA8_0==KW_ARCHIVE||(LA8_0 >= KW_ASC && LA8_0 <= KW_AST)||(LA8_0 >= KW_AUTOCOMMIT && LA8_0 <= KW_BEFORE)||(LA8_0 >= KW_BUCKET && LA8_0 <= KW_BUCKETS)||(LA8_0 >= KW_CACHE && LA8_0 <= KW_CASCADE)||LA8_0==KW_CHANGE||(LA8_0 >= KW_CHECK && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_COMMENT)||(LA8_0 >= KW_COMPACT && LA8_0 <= KW_CONCATENATE)||LA8_0==KW_CONTINUE||LA8_0==KW_DATA||(LA8_0 >= KW_DATABASES && LA8_0 <= KW_DEBUG)||(LA8_0 >= KW_DEFAULT && LA8_0 <= KW_DEFINED)||(LA8_0 >= KW_DELIMITED && LA8_0 <= KW_DESC)||(LA8_0 >= KW_DETAIL && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_DO)||LA8_0==KW_DOW||(LA8_0 >= KW_DUMP && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||(LA8_0 >= KW_ENFORCED && LA8_0 <= KW_ESCAPED)||LA8_0==KW_EXCLUSIVE||(LA8_0 >= KW_EXPLAIN && LA8_0 <= KW_EXPRESSION)||(LA8_0 >= KW_FIELDS && LA8_0 <= KW_FIRST)||(LA8_0 >= KW_FORMAT && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FUNCTIONS||LA8_0==KW_GROUP||(LA8_0 >= KW_HOUR && LA8_0 <= KW_IDXPROPERTIES)||(LA8_0 >= KW_INDEX && LA8_0 <= KW_INDEXES)||(LA8_0 >= KW_INPATH && LA8_0 <= KW_INPUTFORMAT)||(LA8_0 >= KW_ISOLATION && LA8_0 <= KW_JAR)||(LA8_0 >= KW_KEY && LA8_0 <= KW_LAST)||LA8_0==KW_LEVEL||(LA8_0 >= KW_LIMIT && LA8_0 <= KW_LOAD)||(LA8_0 >= KW_LOCATION && LA8_0 <= KW_LONG)||LA8_0==KW_MANAGEMENT||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MATERIALIZED)||LA8_0==KW_METADATA||(LA8_0 >= KW_MINUTE && LA8_0 <= KW_MONTH)||(LA8_0 >= KW_MOVE && LA8_0 <= KW_MSCK)||(LA8_0 >= KW_NORELY && LA8_0 <= KW_NOSCAN)||LA8_0==KW_NOVALIDATE||LA8_0==KW_NULLS||LA8_0==KW_OFFSET||(LA8_0 >= KW_OPERATOR && LA8_0 <= KW_OPTION)||LA8_0==KW_ORDER||(LA8_0 >= KW_OUTPUTDRIVER && LA8_0 <= KW_OUTPUTFORMAT)||(LA8_0 >= KW_OVERWRITE && LA8_0 <= KW_OWNER)||(LA8_0 >= KW_PARTITIONED && LA8_0 <= KW_PATH)||(LA8_0 >= KW_PLAN && LA8_0 <= KW_POOL)||LA8_0==KW_PRINCIPALS||(LA8_0 >= KW_PURGE && LA8_0 <= KW_QUERY_PARALLELISM)||LA8_0==KW_READ||(LA8_0 >= KW_REBUILD && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_RELOAD && LA8_0 <= KW_RESTRICT)||LA8_0==KW_REWRITE||(LA8_0 >= KW_ROLE && LA8_0 <= KW_ROLES)||(LA8_0 >= KW_SCHEDULING_POLICY && LA8_0 <= KW_SECOND)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_SERVER)||(LA8_0 >= KW_SETS && LA8_0 <= KW_SKEWED)||(LA8_0 >= KW_SNAPSHOT && LA8_0 <= KW_SSL)||(LA8_0 >= KW_STATISTICS && LA8_0 <= KW_SUMMARY)||LA8_0==KW_TABLES||(LA8_0 >= KW_TBLPROPERTIES && LA8_0 <= KW_TERMINATED)||LA8_0==KW_TINYINT||(LA8_0 >= KW_TOUCH && LA8_0 <= KW_TRANSACTIONS)||LA8_0==KW_UNARCHIVE||LA8_0==KW_UNDO||LA8_0==KW_UNIONTYPE||(LA8_0 >= KW_UNKNOWN && LA8_0 <= KW_UNSIGNED)||(LA8_0 >= KW_URI && LA8_0 <= KW_USE)||(LA8_0 >= KW_UTC && LA8_0 <= KW_VALIDATE)||LA8_0==KW_VALUE_TYPE||(LA8_0 >= KW_VECTORIZATION && LA8_0 <= KW_WEEK)||LA8_0==KW_WHILE||(LA8_0 >= KW_WORK && LA8_0 <= KW_ZONE)||LA8_0==KW_BATCH||LA8_0==KW_DAYOFWEEK||LA8_0==KW_HOLD_DDLTIME||LA8_0==KW_IGNORE||LA8_0==KW_NO_DROP||LA8_0==KW_OFFLINE||LA8_0==KW_PROTECTION||LA8_0==KW_READONLY||LA8_0==KW_TIMESTAMPTZ) ) {
				int LA8_2 = input.LA(2);
				if ( (LA8_2==KW_LIKE) ) {
					alt8=1;
				}
				else if ( (LA8_2==EOF||LA8_2==KW_WITH) ) {
					alt8=2;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 2, input);
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
					// ResourcePlanParser.g:99:11: (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) )
					{
					// ResourcePlanParser.g:99:11: (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) )
					// ResourcePlanParser.g:99:12: name= identifier KW_LIKE likeName= identifier
					{
					pushFollow(FOLLOW_identifier_in_createResourcePlanStatement435);
					name=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(name.getTree());
					KW_LIKE34=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_createResourcePlanStatement437);  
					stream_KW_LIKE.add(KW_LIKE34);

					pushFollow(FOLLOW_identifier_in_createResourcePlanStatement441);
					likeName=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(likeName.getTree());
					// AST REWRITE
					// elements: likeName, ifNotExists, name
					// token labels: 
					// rule labels: likeName, name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_likeName=new RewriteRuleSubtreeStream(adaptor,"rule likeName",likeName!=null?likeName.getTree():null);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 99:56: -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) )
					{
						// ResourcePlanParser.g:99:59: ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATE_RP, "TOK_CREATE_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// ResourcePlanParser.g:99:81: ( ifNotExists )?
						if ( stream_ifNotExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifNotExists.nextTree());
						}
						stream_ifNotExists.reset();

						// ResourcePlanParser.g:99:94: ^( TOK_LIKERP $likeName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_LIKERP, "TOK_LIKERP"), root_2);
						adaptor.addChild(root_2, stream_likeName.nextTree());
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
					// ResourcePlanParser.g:100:11: (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) )
					{
					// ResourcePlanParser.g:100:11: (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) )
					// ResourcePlanParser.g:100:12: name= identifier ( KW_WITH rpAssignList )?
					{
					pushFollow(FOLLOW_identifier_in_createResourcePlanStatement476);
					name=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(name.getTree());
					// ResourcePlanParser.g:100:28: ( KW_WITH rpAssignList )?
					int alt7=2;
					int LA7_0 = input.LA(1);
					if ( (LA7_0==KW_WITH) ) {
						alt7=1;
					}
					switch (alt7) {
						case 1 :
							// ResourcePlanParser.g:100:29: KW_WITH rpAssignList
							{
							KW_WITH35=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createResourcePlanStatement479);  
							stream_KW_WITH.add(KW_WITH35);

							pushFollow(FOLLOW_rpAssignList_in_createResourcePlanStatement481);
							rpAssignList36=rpAssignList();
							state._fsp--;

							stream_rpAssignList.add(rpAssignList36.getTree());
							}
							break;

					}

					// AST REWRITE
					// elements: rpAssignList, ifNotExists, name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 100:52: -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? )
					{
						// ResourcePlanParser.g:100:55: ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATE_RP, "TOK_CREATE_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// ResourcePlanParser.g:100:77: ( ifNotExists )?
						if ( stream_ifNotExists.hasNext() ) {
							adaptor.addChild(root_1, stream_ifNotExists.nextTree());
						}
						stream_ifNotExists.reset();

						// ResourcePlanParser.g:100:90: ( rpAssignList )?
						if ( stream_rpAssignList.hasNext() ) {
							adaptor.addChild(root_1, stream_rpAssignList.nextTree());
						}
						stream_rpAssignList.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "createResourcePlanStatement"


	public static class withReplace_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "withReplace"
	// ResourcePlanParser.g:105:1: withReplace : KW_WITH KW_REPLACE -> ^( TOK_REPLACE ) ;
	public final HiveParser_ResourcePlanParser.withReplace_return withReplace() throws RecognitionException {
		HiveParser_ResourcePlanParser.withReplace_return retval = new HiveParser_ResourcePlanParser.withReplace_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_WITH37=null;
		Token KW_REPLACE38=null;

		ASTNode KW_WITH37_tree=null;
		ASTNode KW_REPLACE38_tree=null;
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");

		try {
			// ResourcePlanParser.g:105:13: ( KW_WITH KW_REPLACE -> ^( TOK_REPLACE ) )
			// ResourcePlanParser.g:105:15: KW_WITH KW_REPLACE
			{
			KW_WITH37=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_withReplace521);  
			stream_KW_WITH.add(KW_WITH37);

			KW_REPLACE38=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_withReplace523);  
			stream_KW_REPLACE.add(KW_REPLACE38);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 105:34: -> ^( TOK_REPLACE )
			{
				// ResourcePlanParser.g:105:37: ^( TOK_REPLACE )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_REPLACE, "TOK_REPLACE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "withReplace"


	public static class activate_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "activate"
	// ResourcePlanParser.g:106:1: activate : KW_ACTIVATE ( withReplace )? -> ^( TOK_ACTIVATE ( withReplace )? ) ;
	public final HiveParser_ResourcePlanParser.activate_return activate() throws RecognitionException {
		HiveParser_ResourcePlanParser.activate_return retval = new HiveParser_ResourcePlanParser.activate_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ACTIVATE39=null;
		ParserRuleReturnScope withReplace40 =null;

		ASTNode KW_ACTIVATE39_tree=null;
		RewriteRuleTokenStream stream_KW_ACTIVATE=new RewriteRuleTokenStream(adaptor,"token KW_ACTIVATE");
		RewriteRuleSubtreeStream stream_withReplace=new RewriteRuleSubtreeStream(adaptor,"rule withReplace");

		try {
			// ResourcePlanParser.g:106:10: ( KW_ACTIVATE ( withReplace )? -> ^( TOK_ACTIVATE ( withReplace )? ) )
			// ResourcePlanParser.g:106:12: KW_ACTIVATE ( withReplace )?
			{
			KW_ACTIVATE39=(Token)match(input,KW_ACTIVATE,FOLLOW_KW_ACTIVATE_in_activate536);  
			stream_KW_ACTIVATE.add(KW_ACTIVATE39);

			// ResourcePlanParser.g:106:24: ( withReplace )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==KW_WITH) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// ResourcePlanParser.g:106:24: withReplace
					{
					pushFollow(FOLLOW_withReplace_in_activate538);
					withReplace40=withReplace();
					state._fsp--;

					stream_withReplace.add(withReplace40.getTree());
					}
					break;

			}

			// AST REWRITE
			// elements: withReplace
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 106:37: -> ^( TOK_ACTIVATE ( withReplace )? )
			{
				// ResourcePlanParser.g:106:40: ^( TOK_ACTIVATE ( withReplace )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ACTIVATE, "TOK_ACTIVATE"), root_1);
				// ResourcePlanParser.g:106:55: ( withReplace )?
				if ( stream_withReplace.hasNext() ) {
					adaptor.addChild(root_1, stream_withReplace.nextTree());
				}
				stream_withReplace.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "activate"


	public static class enable_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "enable"
	// ResourcePlanParser.g:107:1: enable : KW_ENABLE -> ^( TOK_ENABLE ) ;
	public final HiveParser_ResourcePlanParser.enable_return enable() throws RecognitionException {
		HiveParser_ResourcePlanParser.enable_return retval = new HiveParser_ResourcePlanParser.enable_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ENABLE41=null;

		ASTNode KW_ENABLE41_tree=null;
		RewriteRuleTokenStream stream_KW_ENABLE=new RewriteRuleTokenStream(adaptor,"token KW_ENABLE");

		try {
			// ResourcePlanParser.g:107:8: ( KW_ENABLE -> ^( TOK_ENABLE ) )
			// ResourcePlanParser.g:107:10: KW_ENABLE
			{
			KW_ENABLE41=(Token)match(input,KW_ENABLE,FOLLOW_KW_ENABLE_in_enable555);  
			stream_KW_ENABLE.add(KW_ENABLE41);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 107:20: -> ^( TOK_ENABLE )
			{
				// ResourcePlanParser.g:107:23: ^( TOK_ENABLE )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ENABLE, "TOK_ENABLE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "enable"


	public static class disable_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "disable"
	// ResourcePlanParser.g:108:1: disable : KW_DISABLE -> ^( TOK_DISABLE ) ;
	public final HiveParser_ResourcePlanParser.disable_return disable() throws RecognitionException {
		HiveParser_ResourcePlanParser.disable_return retval = new HiveParser_ResourcePlanParser.disable_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DISABLE42=null;

		ASTNode KW_DISABLE42_tree=null;
		RewriteRuleTokenStream stream_KW_DISABLE=new RewriteRuleTokenStream(adaptor,"token KW_DISABLE");

		try {
			// ResourcePlanParser.g:108:9: ( KW_DISABLE -> ^( TOK_DISABLE ) )
			// ResourcePlanParser.g:108:11: KW_DISABLE
			{
			KW_DISABLE42=(Token)match(input,KW_DISABLE,FOLLOW_KW_DISABLE_in_disable568);  
			stream_KW_DISABLE.add(KW_DISABLE42);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 108:22: -> ^( TOK_DISABLE )
			{
				// ResourcePlanParser.g:108:25: ^( TOK_DISABLE )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DISABLE, "TOK_DISABLE"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "disable"


	public static class unmanaged_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "unmanaged"
	// ResourcePlanParser.g:109:1: unmanaged : KW_UNMANAGED -> ^( TOK_UNMANAGED ) ;
	public final HiveParser_ResourcePlanParser.unmanaged_return unmanaged() throws RecognitionException {
		HiveParser_ResourcePlanParser.unmanaged_return retval = new HiveParser_ResourcePlanParser.unmanaged_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_UNMANAGED43=null;

		ASTNode KW_UNMANAGED43_tree=null;
		RewriteRuleTokenStream stream_KW_UNMANAGED=new RewriteRuleTokenStream(adaptor,"token KW_UNMANAGED");

		try {
			// ResourcePlanParser.g:109:11: ( KW_UNMANAGED -> ^( TOK_UNMANAGED ) )
			// ResourcePlanParser.g:109:13: KW_UNMANAGED
			{
			KW_UNMANAGED43=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_unmanaged581);  
			stream_KW_UNMANAGED.add(KW_UNMANAGED43);

			// AST REWRITE
			// elements: 
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 109:26: -> ^( TOK_UNMANAGED )
			{
				// ResourcePlanParser.g:109:29: ^( TOK_UNMANAGED )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED"), root_1);
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unmanaged"


	public static class alterResourcePlanStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterResourcePlanStatement"
	// ResourcePlanParser.g:112:1: alterResourcePlanStatement : KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) ) ) ;
	public final HiveParser_ResourcePlanParser.alterResourcePlanStatement_return alterResourcePlanStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.alterResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.alterResourcePlanStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ALTER44=null;
		Token KW_RESOURCE45=null;
		Token KW_PLAN46=null;
		Token KW_VALIDATE47=null;
		Token KW_DISABLE48=null;
		Token KW_SET49=null;
		Token KW_UNSET51=null;
		Token KW_RENAME53=null;
		Token KW_TO54=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope newName =null;
		ParserRuleReturnScope rpAssignList50 =null;
		ParserRuleReturnScope rpUnassignList52 =null;
		ParserRuleReturnScope activate55 =null;
		ParserRuleReturnScope enable56 =null;
		ParserRuleReturnScope enable57 =null;
		ParserRuleReturnScope activate58 =null;

		ASTNode KW_ALTER44_tree=null;
		ASTNode KW_RESOURCE45_tree=null;
		ASTNode KW_PLAN46_tree=null;
		ASTNode KW_VALIDATE47_tree=null;
		ASTNode KW_DISABLE48_tree=null;
		ASTNode KW_SET49_tree=null;
		ASTNode KW_UNSET51_tree=null;
		ASTNode KW_RENAME53_tree=null;
		ASTNode KW_TO54_tree=null;
		RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
		RewriteRuleTokenStream stream_KW_VALIDATE=new RewriteRuleTokenStream(adaptor,"token KW_VALIDATE");
		RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
		RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
		RewriteRuleTokenStream stream_KW_DISABLE=new RewriteRuleTokenStream(adaptor,"token KW_DISABLE");
		RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_rpAssignList=new RewriteRuleSubtreeStream(adaptor,"rule rpAssignList");
		RewriteRuleSubtreeStream stream_enable=new RewriteRuleSubtreeStream(adaptor,"rule enable");
		RewriteRuleSubtreeStream stream_rpUnassignList=new RewriteRuleSubtreeStream(adaptor,"rule rpUnassignList");
		RewriteRuleSubtreeStream stream_activate=new RewriteRuleSubtreeStream(adaptor,"rule activate");

		 gParent.pushMsg(retval.start,"alter resource plan statement", state); 
		try {
			// ResourcePlanParser.g:115:5: ( KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) ) ) )
			// ResourcePlanParser.g:115:7: KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) ) )
			{
			KW_ALTER44=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterResourcePlanStatement610);  
			stream_KW_ALTER.add(KW_ALTER44);

			KW_RESOURCE45=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_alterResourcePlanStatement612);  
			stream_KW_RESOURCE.add(KW_RESOURCE45);

			KW_PLAN46=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_alterResourcePlanStatement614);  
			stream_KW_PLAN.add(KW_PLAN46);

			pushFollow(FOLLOW_identifier_in_alterResourcePlanStatement618);
			name=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(name.getTree());
			// ResourcePlanParser.g:115:52: ( ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) ) )
			int alt13=6;
			switch ( input.LA(1) ) {
			case KW_VALIDATE:
				{
				alt13=1;
				}
				break;
			case KW_DISABLE:
				{
				alt13=2;
				}
				break;
			case KW_SET:
				{
				alt13=3;
				}
				break;
			case KW_UNSET:
				{
				alt13=4;
				}
				break;
			case KW_RENAME:
				{
				alt13=5;
				}
				break;
			case KW_ACTIVATE:
			case KW_ENABLE:
				{
				alt13=6;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}
			switch (alt13) {
				case 1 :
					// ResourcePlanParser.g:116:11: ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) )
					{
					// ResourcePlanParser.g:116:11: ( KW_VALIDATE -> ^( TOK_ALTER_RP $name TOK_VALIDATE ) )
					// ResourcePlanParser.g:116:12: KW_VALIDATE
					{
					KW_VALIDATE47=(Token)match(input,KW_VALIDATE,FOLLOW_KW_VALIDATE_in_alterResourcePlanStatement633);  
					stream_KW_VALIDATE.add(KW_VALIDATE47);

					// AST REWRITE
					// elements: name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 116:24: -> ^( TOK_ALTER_RP $name TOK_VALIDATE )
					{
						// ResourcePlanParser.g:116:27: ^( TOK_ALTER_RP $name TOK_VALIDATE )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_VALIDATE, "TOK_VALIDATE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:117:11: ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) )
					{
					// ResourcePlanParser.g:117:11: ( KW_DISABLE -> ^( TOK_ALTER_RP $name TOK_DISABLE ) )
					// ResourcePlanParser.g:117:12: KW_DISABLE
					{
					KW_DISABLE48=(Token)match(input,KW_DISABLE,FOLLOW_KW_DISABLE_in_alterResourcePlanStatement658);  
					stream_KW_DISABLE.add(KW_DISABLE48);

					// AST REWRITE
					// elements: name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 117:23: -> ^( TOK_ALTER_RP $name TOK_DISABLE )
					{
						// ResourcePlanParser.g:117:26: ^( TOK_ALTER_RP $name TOK_DISABLE )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_DISABLE, "TOK_DISABLE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 3 :
					// ResourcePlanParser.g:118:11: ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) )
					{
					// ResourcePlanParser.g:118:11: ( KW_SET rpAssignList -> ^( TOK_ALTER_RP $name rpAssignList ) )
					// ResourcePlanParser.g:118:12: KW_SET rpAssignList
					{
					KW_SET49=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterResourcePlanStatement683);  
					stream_KW_SET.add(KW_SET49);

					pushFollow(FOLLOW_rpAssignList_in_alterResourcePlanStatement685);
					rpAssignList50=rpAssignList();
					state._fsp--;

					stream_rpAssignList.add(rpAssignList50.getTree());
					// AST REWRITE
					// elements: rpAssignList, name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 118:32: -> ^( TOK_ALTER_RP $name rpAssignList )
					{
						// ResourcePlanParser.g:118:35: ^( TOK_ALTER_RP $name rpAssignList )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, stream_rpAssignList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 4 :
					// ResourcePlanParser.g:119:11: ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) )
					{
					// ResourcePlanParser.g:119:11: ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP $name rpUnassignList ) )
					// ResourcePlanParser.g:119:12: KW_UNSET rpUnassignList
					{
					KW_UNSET51=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterResourcePlanStatement710);  
					stream_KW_UNSET.add(KW_UNSET51);

					pushFollow(FOLLOW_rpUnassignList_in_alterResourcePlanStatement712);
					rpUnassignList52=rpUnassignList();
					state._fsp--;

					stream_rpUnassignList.add(rpUnassignList52.getTree());
					// AST REWRITE
					// elements: rpUnassignList, name
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 119:36: -> ^( TOK_ALTER_RP $name rpUnassignList )
					{
						// ResourcePlanParser.g:119:39: ^( TOK_ALTER_RP $name rpUnassignList )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						adaptor.addChild(root_1, stream_rpUnassignList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 5 :
					// ResourcePlanParser.g:120:11: ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) )
					{
					// ResourcePlanParser.g:120:11: ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) ) )
					// ResourcePlanParser.g:120:12: KW_RENAME KW_TO newName= identifier
					{
					KW_RENAME53=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterResourcePlanStatement737);  
					stream_KW_RENAME.add(KW_RENAME53);

					KW_TO54=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterResourcePlanStatement739);  
					stream_KW_TO.add(KW_TO54);

					pushFollow(FOLLOW_identifier_in_alterResourcePlanStatement743);
					newName=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(newName.getTree());
					// AST REWRITE
					// elements: name, newName
					// token labels: 
					// rule labels: newName, name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_newName=new RewriteRuleSubtreeStream(adaptor,"rule newName",newName!=null?newName.getTree():null);
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 120:47: -> ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) )
					{
						// ResourcePlanParser.g:120:50: ^( TOK_ALTER_RP $name ^( TOK_RENAME $newName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// ResourcePlanParser.g:120:71: ^( TOK_RENAME $newName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_RENAME, "TOK_RENAME"), root_2);
						adaptor.addChild(root_2, stream_newName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 6 :
					// ResourcePlanParser.g:121:11: ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) )
					{
					// ResourcePlanParser.g:121:11: ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? ) )
					// ResourcePlanParser.g:121:12: ( activate ( enable )? | enable ( activate )? )
					{
					// ResourcePlanParser.g:121:12: ( activate ( enable )? | enable ( activate )? )
					int alt12=2;
					int LA12_0 = input.LA(1);
					if ( (LA12_0==KW_ACTIVATE) ) {
						alt12=1;
					}
					else if ( (LA12_0==KW_ENABLE) ) {
						alt12=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 12, 0, input);
						throw nvae;
					}

					switch (alt12) {
						case 1 :
							// ResourcePlanParser.g:121:13: activate ( enable )?
							{
							pushFollow(FOLLOW_activate_in_alterResourcePlanStatement774);
							activate55=activate();
							state._fsp--;

							stream_activate.add(activate55.getTree());
							// ResourcePlanParser.g:121:22: ( enable )?
							int alt10=2;
							int LA10_0 = input.LA(1);
							if ( (LA10_0==KW_ENABLE) ) {
								alt10=1;
							}
							switch (alt10) {
								case 1 :
									// ResourcePlanParser.g:121:22: enable
									{
									pushFollow(FOLLOW_enable_in_alterResourcePlanStatement776);
									enable56=enable();
									state._fsp--;

									stream_enable.add(enable56.getTree());
									}
									break;

							}

							}
							break;
						case 2 :
							// ResourcePlanParser.g:121:32: enable ( activate )?
							{
							pushFollow(FOLLOW_enable_in_alterResourcePlanStatement781);
							enable57=enable();
							state._fsp--;

							stream_enable.add(enable57.getTree());
							// ResourcePlanParser.g:121:39: ( activate )?
							int alt11=2;
							int LA11_0 = input.LA(1);
							if ( (LA11_0==KW_ACTIVATE) ) {
								alt11=1;
							}
							switch (alt11) {
								case 1 :
									// ResourcePlanParser.g:121:39: activate
									{
									pushFollow(FOLLOW_activate_in_alterResourcePlanStatement783);
									activate58=activate();
									state._fsp--;

									stream_activate.add(activate58.getTree());
									}
									break;

							}

							}
							break;

					}

					// AST REWRITE
					// elements: enable, name, activate
					// token labels: 
					// rule labels: name, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 121:50: -> ^( TOK_ALTER_RP $name ( activate )? ( enable )? )
					{
						// ResourcePlanParser.g:121:53: ^( TOK_ALTER_RP $name ( activate )? ( enable )? )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_name.nextTree());
						// ResourcePlanParser.g:121:74: ( activate )?
						if ( stream_activate.hasNext() ) {
							adaptor.addChild(root_1, stream_activate.nextTree());
						}
						stream_activate.reset();

						// ResourcePlanParser.g:121:84: ( enable )?
						if ( stream_enable.hasNext() ) {
							adaptor.addChild(root_1, stream_enable.nextTree());
						}
						stream_enable.reset();

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterResourcePlanStatement"


	public static class globalWmStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "globalWmStatement"
	// ResourcePlanParser.g:127:1: globalWmStatement : ( enable | disable ) KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP ( enable )? ( disable )? ) ;
	public final HiveParser_ResourcePlanParser.globalWmStatement_return globalWmStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.globalWmStatement_return retval = new HiveParser_ResourcePlanParser.globalWmStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_WORKLOAD61=null;
		Token KW_MANAGEMENT62=null;
		ParserRuleReturnScope enable59 =null;
		ParserRuleReturnScope disable60 =null;

		ASTNode KW_WORKLOAD61_tree=null;
		ASTNode KW_MANAGEMENT62_tree=null;
		RewriteRuleTokenStream stream_KW_WORKLOAD=new RewriteRuleTokenStream(adaptor,"token KW_WORKLOAD");
		RewriteRuleTokenStream stream_KW_MANAGEMENT=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEMENT");
		RewriteRuleSubtreeStream stream_enable=new RewriteRuleSubtreeStream(adaptor,"rule enable");
		RewriteRuleSubtreeStream stream_disable=new RewriteRuleSubtreeStream(adaptor,"rule disable");

		 gParent.pushMsg(retval.start,"global WM statement", state); 
		try {
			// ResourcePlanParser.g:130:5: ( ( enable | disable ) KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP ( enable )? ( disable )? ) )
			// ResourcePlanParser.g:130:7: ( enable | disable ) KW_WORKLOAD KW_MANAGEMENT
			{
			// ResourcePlanParser.g:130:7: ( enable | disable )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==KW_ENABLE) ) {
				alt14=1;
			}
			else if ( (LA14_0==KW_DISABLE) ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// ResourcePlanParser.g:130:8: enable
					{
					pushFollow(FOLLOW_enable_in_globalWmStatement839);
					enable59=enable();
					state._fsp--;

					stream_enable.add(enable59.getTree());
					}
					break;
				case 2 :
					// ResourcePlanParser.g:130:17: disable
					{
					pushFollow(FOLLOW_disable_in_globalWmStatement843);
					disable60=disable();
					state._fsp--;

					stream_disable.add(disable60.getTree());
					}
					break;

			}

			KW_WORKLOAD61=(Token)match(input,KW_WORKLOAD,FOLLOW_KW_WORKLOAD_in_globalWmStatement846);  
			stream_KW_WORKLOAD.add(KW_WORKLOAD61);

			KW_MANAGEMENT62=(Token)match(input,KW_MANAGEMENT,FOLLOW_KW_MANAGEMENT_in_globalWmStatement848);  
			stream_KW_MANAGEMENT.add(KW_MANAGEMENT62);

			// AST REWRITE
			// elements: enable, disable
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 130:52: -> ^( TOK_ALTER_RP ( enable )? ( disable )? )
			{
				// ResourcePlanParser.g:130:55: ^( TOK_ALTER_RP ( enable )? ( disable )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
				// ResourcePlanParser.g:130:70: ( enable )?
				if ( stream_enable.hasNext() ) {
					adaptor.addChild(root_1, stream_enable.nextTree());
				}
				stream_enable.reset();

				// ResourcePlanParser.g:130:78: ( disable )?
				if ( stream_disable.hasNext() ) {
					adaptor.addChild(root_1, stream_disable.nextTree());
				}
				stream_disable.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "globalWmStatement"


	public static class replaceResourcePlanStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "replaceResourcePlanStatement"
	// ResourcePlanParser.g:133:1: replaceResourcePlanStatement : KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) ) ) ;
	public final HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return replaceResourcePlanStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_REPLACE63=null;
		Token KW_ACTIVE64=null;
		Token KW_RESOURCE65=null;
		Token KW_PLAN66=null;
		Token KW_WITH67=null;
		Token KW_RESOURCE68=null;
		Token KW_PLAN69=null;
		Token KW_WITH70=null;
		ParserRuleReturnScope src =null;
		ParserRuleReturnScope dest =null;

		ASTNode KW_REPLACE63_tree=null;
		ASTNode KW_ACTIVE64_tree=null;
		ASTNode KW_RESOURCE65_tree=null;
		ASTNode KW_PLAN66_tree=null;
		ASTNode KW_WITH67_tree=null;
		ASTNode KW_RESOURCE68_tree=null;
		ASTNode KW_PLAN69_tree=null;
		ASTNode KW_WITH70_tree=null;
		RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
		RewriteRuleTokenStream stream_KW_ACTIVE=new RewriteRuleTokenStream(adaptor,"token KW_ACTIVE");
		RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"replace resource plan statement", state); 
		try {
			// ResourcePlanParser.g:136:5: ( KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) ) ) )
			// ResourcePlanParser.g:136:7: KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) ) )
			{
			KW_REPLACE63=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_replaceResourcePlanStatement887);  
			stream_KW_REPLACE.add(KW_REPLACE63);

			// ResourcePlanParser.g:136:18: ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) ) )
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==KW_ACTIVE) ) {
				alt15=1;
			}
			else if ( (LA15_0==KW_RESOURCE) ) {
				alt15=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 15, 0, input);
				throw nvae;
			}

			switch (alt15) {
				case 1 :
					// ResourcePlanParser.g:137:11: ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) )
					{
					// ResourcePlanParser.g:137:11: ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP $src TOK_REPLACE ) )
					// ResourcePlanParser.g:137:12: KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier
					{
					KW_ACTIVE64=(Token)match(input,KW_ACTIVE,FOLLOW_KW_ACTIVE_in_replaceResourcePlanStatement902);  
					stream_KW_ACTIVE.add(KW_ACTIVE64);

					KW_RESOURCE65=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement904);  
					stream_KW_RESOURCE.add(KW_RESOURCE65);

					KW_PLAN66=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_replaceResourcePlanStatement906);  
					stream_KW_PLAN.add(KW_PLAN66);

					KW_WITH67=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_replaceResourcePlanStatement908);  
					stream_KW_WITH.add(KW_WITH67);

					pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement912);
					src=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(src.getTree());
					// AST REWRITE
					// elements: src
					// token labels: 
					// rule labels: src, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_src=new RewriteRuleSubtreeStream(adaptor,"rule src",src!=null?src.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 137:65: -> ^( TOK_ALTER_RP $src TOK_REPLACE )
					{
						// ResourcePlanParser.g:137:68: ^( TOK_ALTER_RP $src TOK_REPLACE )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_src.nextTree());
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_REPLACE, "TOK_REPLACE"));
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:138:11: ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) )
					{
					// ResourcePlanParser.g:138:11: ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) ) )
					// ResourcePlanParser.g:138:12: KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier
					{
					KW_RESOURCE68=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement937);  
					stream_KW_RESOURCE.add(KW_RESOURCE68);

					KW_PLAN69=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_replaceResourcePlanStatement939);  
					stream_KW_PLAN.add(KW_PLAN69);

					pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement943);
					dest=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(dest.getTree());
					KW_WITH70=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_replaceResourcePlanStatement945);  
					stream_KW_WITH.add(KW_WITH70);

					pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement949);
					src=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(src.getTree());
					// AST REWRITE
					// elements: dest, src
					// token labels: 
					// rule labels: src, dest, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_src=new RewriteRuleSubtreeStream(adaptor,"rule src",src!=null?src.getTree():null);
					RewriteRuleSubtreeStream stream_dest=new RewriteRuleSubtreeStream(adaptor,"rule dest",dest!=null?dest.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 138:71: -> ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) )
					{
						// ResourcePlanParser.g:138:74: ^( TOK_ALTER_RP $src ^( TOK_REPLACE $dest) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_RP, "TOK_ALTER_RP"), root_1);
						adaptor.addChild(root_1, stream_src.nextTree());
						// ResourcePlanParser.g:138:94: ^( TOK_REPLACE $dest)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_REPLACE, "TOK_REPLACE"), root_2);
						adaptor.addChild(root_2, stream_dest.nextTree());
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

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "replaceResourcePlanStatement"


	public static class dropResourcePlanStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dropResourcePlanStatement"
	// ResourcePlanParser.g:142:1: dropResourcePlanStatement : KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier -> ^( TOK_DROP_RP $name ( ifExists )? ) ;
	public final HiveParser_ResourcePlanParser.dropResourcePlanStatement_return dropResourcePlanStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.dropResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.dropResourcePlanStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP71=null;
		Token KW_RESOURCE72=null;
		Token KW_PLAN73=null;
		ParserRuleReturnScope name =null;
		ParserRuleReturnScope ifExists74 =null;

		ASTNode KW_DROP71_tree=null;
		ASTNode KW_RESOURCE72_tree=null;
		ASTNode KW_PLAN73_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
		RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");

		 gParent.pushMsg(retval.start,"drop resource plan statement", state); 
		try {
			// ResourcePlanParser.g:145:5: ( KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier -> ^( TOK_DROP_RP $name ( ifExists )? ) )
			// ResourcePlanParser.g:145:7: KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier
			{
			KW_DROP71=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropResourcePlanStatement1001);  
			stream_KW_DROP.add(KW_DROP71);

			KW_RESOURCE72=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_dropResourcePlanStatement1003);  
			stream_KW_RESOURCE.add(KW_RESOURCE72);

			KW_PLAN73=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_dropResourcePlanStatement1005);  
			stream_KW_PLAN.add(KW_PLAN73);

			// ResourcePlanParser.g:145:35: ( ifExists )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==KW_IF) ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// ResourcePlanParser.g:145:35: ifExists
					{
					pushFollow(FOLLOW_ifExists_in_dropResourcePlanStatement1007);
					ifExists74=gHiveParser.ifExists();
					state._fsp--;

					stream_ifExists.add(ifExists74.getTree());
					}
					break;

			}

			pushFollow(FOLLOW_identifier_in_dropResourcePlanStatement1012);
			name=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(name.getTree());
			// AST REWRITE
			// elements: name, ifExists
			// token labels: 
			// rule labels: name, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 145:61: -> ^( TOK_DROP_RP $name ( ifExists )? )
			{
				// ResourcePlanParser.g:145:64: ^( TOK_DROP_RP $name ( ifExists )? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_RP, "TOK_DROP_RP"), root_1);
				adaptor.addChild(root_1, stream_name.nextTree());
				// ResourcePlanParser.g:145:84: ( ifExists )?
				if ( stream_ifExists.hasNext() ) {
					adaptor.addChild(root_1, stream_ifExists.nextTree());
				}
				stream_ifExists.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropResourcePlanStatement"


	public static class poolPath_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "poolPath"
	// ResourcePlanParser.g:148:1: poolPath : identifier ^ ( DOT identifier )* ;
	public final HiveParser_ResourcePlanParser.poolPath_return poolPath() throws RecognitionException {
		HiveParser_ResourcePlanParser.poolPath_return retval = new HiveParser_ResourcePlanParser.poolPath_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token DOT76=null;
		ParserRuleReturnScope identifier75 =null;
		ParserRuleReturnScope identifier77 =null;

		ASTNode DOT76_tree=null;

		 gParent.pushMsg(retval.start,"poolPath", state); 
		try {
			// ResourcePlanParser.g:151:5: ( identifier ^ ( DOT identifier )* )
			// ResourcePlanParser.g:151:7: identifier ^ ( DOT identifier )*
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_poolPath1051);
			identifier75=gHiveParser.identifier();
			state._fsp--;

			root_0 = (ASTNode)adaptor.becomeRoot(identifier75.getTree(), root_0);
			// ResourcePlanParser.g:151:19: ( DOT identifier )*
			loop17:
			while (true) {
				int alt17=2;
				int LA17_0 = input.LA(1);
				if ( (LA17_0==DOT) ) {
					alt17=1;
				}

				switch (alt17) {
				case 1 :
					// ResourcePlanParser.g:151:20: DOT identifier
					{
					DOT76=(Token)match(input,DOT,FOLLOW_DOT_in_poolPath1055); 
					DOT76_tree = (ASTNode)adaptor.create(DOT76);
					adaptor.addChild(root_0, DOT76_tree);

					pushFollow(FOLLOW_identifier_in_poolPath1057);
					identifier77=gHiveParser.identifier();
					state._fsp--;

					adaptor.addChild(root_0, identifier77.getTree());

					}
					break;

				default :
					break loop17;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "poolPath"


	public static class triggerExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerExpression"
	// ResourcePlanParser.g:154:1: triggerExpression : triggerAtomExpression -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression ) ;
	public final HiveParser_ResourcePlanParser.triggerExpression_return triggerExpression() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerExpression_return retval = new HiveParser_ResourcePlanParser.triggerExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope triggerAtomExpression78 =null;

		RewriteRuleSubtreeStream stream_triggerAtomExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerAtomExpression");

		 gParent.pushMsg(retval.start,"triggerExpression", state); 
		try {
			// ResourcePlanParser.g:157:5: ( triggerAtomExpression -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression ) )
			// ResourcePlanParser.g:157:7: triggerAtomExpression
			{
			pushFollow(FOLLOW_triggerAtomExpression_in_triggerExpression1086);
			triggerAtomExpression78=triggerAtomExpression();
			state._fsp--;

			stream_triggerAtomExpression.add(triggerAtomExpression78.getTree());
			// AST REWRITE
			// elements: triggerAtomExpression
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 157:29: -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression )
			{
				// ResourcePlanParser.g:157:32: ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_TRIGGER_EXPRESSION, "TOK_TRIGGER_EXPRESSION"), root_1);
				adaptor.addChild(root_1, stream_triggerAtomExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerExpression"


	public static class triggerExpressionStandalone_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerExpressionStandalone"
	// ResourcePlanParser.g:160:1: triggerExpressionStandalone : triggerExpression EOF ;
	public final HiveParser_ResourcePlanParser.triggerExpressionStandalone_return triggerExpressionStandalone() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerExpressionStandalone_return retval = new HiveParser_ResourcePlanParser.triggerExpressionStandalone_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token EOF80=null;
		ParserRuleReturnScope triggerExpression79 =null;

		ASTNode EOF80_tree=null;

		try {
			// ResourcePlanParser.g:160:29: ( triggerExpression EOF )
			// ResourcePlanParser.g:160:31: triggerExpression EOF
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_triggerExpression_in_triggerExpressionStandalone1107);
			triggerExpression79=triggerExpression();
			state._fsp--;

			adaptor.addChild(root_0, triggerExpression79.getTree());

			EOF80=(Token)match(input,EOF,FOLLOW_EOF_in_triggerExpressionStandalone1109); 
			EOF80_tree = (ASTNode)adaptor.create(EOF80);
			adaptor.addChild(root_0, EOF80_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerExpressionStandalone"


	public static class triggerOrExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerOrExpression"
	// ResourcePlanParser.g:166:1: triggerOrExpression : triggerAndExpression ( KW_OR triggerAndExpression )* ;
	public final HiveParser_ResourcePlanParser.triggerOrExpression_return triggerOrExpression() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerOrExpression_return retval = new HiveParser_ResourcePlanParser.triggerOrExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_OR82=null;
		ParserRuleReturnScope triggerAndExpression81 =null;
		ParserRuleReturnScope triggerAndExpression83 =null;

		ASTNode KW_OR82_tree=null;

		 gParent.pushMsg(retval.start,"triggerOrExpression", state); 
		try {
			// ResourcePlanParser.g:169:5: ( triggerAndExpression ( KW_OR triggerAndExpression )* )
			// ResourcePlanParser.g:169:7: triggerAndExpression ( KW_OR triggerAndExpression )*
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_triggerAndExpression_in_triggerOrExpression1134);
			triggerAndExpression81=triggerAndExpression();
			state._fsp--;

			adaptor.addChild(root_0, triggerAndExpression81.getTree());

			// ResourcePlanParser.g:169:28: ( KW_OR triggerAndExpression )*
			loop18:
			while (true) {
				int alt18=2;
				int LA18_0 = input.LA(1);
				if ( (LA18_0==KW_OR) ) {
					alt18=1;
				}

				switch (alt18) {
				case 1 :
					// ResourcePlanParser.g:169:29: KW_OR triggerAndExpression
					{
					KW_OR82=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_triggerOrExpression1137); 
					KW_OR82_tree = (ASTNode)adaptor.create(KW_OR82);
					adaptor.addChild(root_0, KW_OR82_tree);

					pushFollow(FOLLOW_triggerAndExpression_in_triggerOrExpression1139);
					triggerAndExpression83=triggerAndExpression();
					state._fsp--;

					adaptor.addChild(root_0, triggerAndExpression83.getTree());

					}
					break;

				default :
					break loop18;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerOrExpression"


	public static class triggerAndExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerAndExpression"
	// ResourcePlanParser.g:172:1: triggerAndExpression : triggerAtomExpression ( KW_AND triggerAtomExpression )* ;
	public final HiveParser_ResourcePlanParser.triggerAndExpression_return triggerAndExpression() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerAndExpression_return retval = new HiveParser_ResourcePlanParser.triggerAndExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_AND85=null;
		ParserRuleReturnScope triggerAtomExpression84 =null;
		ParserRuleReturnScope triggerAtomExpression86 =null;

		ASTNode KW_AND85_tree=null;

		 gParent.pushMsg(retval.start,"triggerAndExpression", state); 
		try {
			// ResourcePlanParser.g:175:5: ( triggerAtomExpression ( KW_AND triggerAtomExpression )* )
			// ResourcePlanParser.g:175:7: triggerAtomExpression ( KW_AND triggerAtomExpression )*
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_triggerAtomExpression_in_triggerAndExpression1168);
			triggerAtomExpression84=triggerAtomExpression();
			state._fsp--;

			adaptor.addChild(root_0, triggerAtomExpression84.getTree());

			// ResourcePlanParser.g:175:29: ( KW_AND triggerAtomExpression )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==KW_AND) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// ResourcePlanParser.g:175:30: KW_AND triggerAtomExpression
					{
					KW_AND85=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_triggerAndExpression1171); 
					KW_AND85_tree = (ASTNode)adaptor.create(KW_AND85);
					adaptor.addChild(root_0, KW_AND85_tree);

					pushFollow(FOLLOW_triggerAtomExpression_in_triggerAndExpression1173);
					triggerAtomExpression86=triggerAtomExpression();
					state._fsp--;

					adaptor.addChild(root_0, triggerAtomExpression86.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerAndExpression"


	public static class triggerAtomExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerAtomExpression"
	// ResourcePlanParser.g:178:1: triggerAtomExpression : identifier comparisionOperator triggerLiteral ;
	public final HiveParser_ResourcePlanParser.triggerAtomExpression_return triggerAtomExpression() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerAtomExpression_return retval = new HiveParser_ResourcePlanParser.triggerAtomExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		ParserRuleReturnScope identifier87 =null;
		ParserRuleReturnScope comparisionOperator88 =null;
		ParserRuleReturnScope triggerLiteral89 =null;


		 gParent.pushMsg(retval.start,"triggerAtomExpression", state); 
		try {
			// ResourcePlanParser.g:181:5: ( identifier comparisionOperator triggerLiteral )
			// ResourcePlanParser.g:181:7: identifier comparisionOperator triggerLiteral
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_identifier_in_triggerAtomExpression1202);
			identifier87=gHiveParser.identifier();
			state._fsp--;

			adaptor.addChild(root_0, identifier87.getTree());

			pushFollow(FOLLOW_comparisionOperator_in_triggerAtomExpression1204);
			comparisionOperator88=comparisionOperator();
			state._fsp--;

			adaptor.addChild(root_0, comparisionOperator88.getTree());

			pushFollow(FOLLOW_triggerLiteral_in_triggerAtomExpression1206);
			triggerLiteral89=triggerLiteral();
			state._fsp--;

			adaptor.addChild(root_0, triggerLiteral89.getTree());

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerAtomExpression"


	public static class triggerLiteral_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerLiteral"
	// ResourcePlanParser.g:185:1: triggerLiteral : ( Number | StringLiteral );
	public final HiveParser_ResourcePlanParser.triggerLiteral_return triggerLiteral() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerLiteral_return retval = new HiveParser_ResourcePlanParser.triggerLiteral_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token set90=null;

		ASTNode set90_tree=null;

		 gParent.pushMsg(retval.start,"triggerLiteral", state); 
		try {
			// ResourcePlanParser.g:188:5: ( Number | StringLiteral )
			// ResourcePlanParser.g:
			{
			root_0 = (ASTNode)adaptor.nil();


			set90=input.LT(1);
			if ( input.LA(1)==Number||input.LA(1)==StringLiteral ) {
				input.consume();
				adaptor.addChild(root_0, (ASTNode)adaptor.create(set90));
				state.errorRecovery=false;
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerLiteral"


	public static class comparisionOperator_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "comparisionOperator"
	// ResourcePlanParser.g:192:1: comparisionOperator : GREATERTHAN ;
	public final HiveParser_ResourcePlanParser.comparisionOperator_return comparisionOperator() throws RecognitionException {
		HiveParser_ResourcePlanParser.comparisionOperator_return retval = new HiveParser_ResourcePlanParser.comparisionOperator_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token GREATERTHAN91=null;

		ASTNode GREATERTHAN91_tree=null;

		 gParent.pushMsg(retval.start,"comparisionOperator", state); 
		try {
			// ResourcePlanParser.g:195:5: ( GREATERTHAN )
			// ResourcePlanParser.g:195:7: GREATERTHAN
			{
			root_0 = (ASTNode)adaptor.nil();


			GREATERTHAN91=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_comparisionOperator1269); 
			GREATERTHAN91_tree = (ASTNode)adaptor.create(GREATERTHAN91);
			adaptor.addChild(root_0, GREATERTHAN91_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparisionOperator"


	public static class triggerActionExpression_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerActionExpression"
	// ResourcePlanParser.g:198:1: triggerActionExpression : ( KW_KILL | ( KW_MOVE ^ KW_TO ! poolPath ) );
	public final HiveParser_ResourcePlanParser.triggerActionExpression_return triggerActionExpression() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerActionExpression_return retval = new HiveParser_ResourcePlanParser.triggerActionExpression_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_KILL92=null;
		Token KW_MOVE93=null;
		Token KW_TO94=null;
		ParserRuleReturnScope poolPath95 =null;

		ASTNode KW_KILL92_tree=null;
		ASTNode KW_MOVE93_tree=null;
		ASTNode KW_TO94_tree=null;

		 gParent.pushMsg(retval.start,"triggerActionExpression", state); 
		try {
			// ResourcePlanParser.g:201:5: ( KW_KILL | ( KW_MOVE ^ KW_TO ! poolPath ) )
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==KW_KILL) ) {
				alt20=1;
			}
			else if ( (LA20_0==KW_MOVE) ) {
				alt20=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 20, 0, input);
				throw nvae;
			}

			switch (alt20) {
				case 1 :
					// ResourcePlanParser.g:201:7: KW_KILL
					{
					root_0 = (ASTNode)adaptor.nil();


					KW_KILL92=(Token)match(input,KW_KILL,FOLLOW_KW_KILL_in_triggerActionExpression1296); 
					KW_KILL92_tree = (ASTNode)adaptor.create(KW_KILL92);
					adaptor.addChild(root_0, KW_KILL92_tree);

					}
					break;
				case 2 :
					// ResourcePlanParser.g:202:7: ( KW_MOVE ^ KW_TO ! poolPath )
					{
					root_0 = (ASTNode)adaptor.nil();


					// ResourcePlanParser.g:202:7: ( KW_MOVE ^ KW_TO ! poolPath )
					// ResourcePlanParser.g:202:8: KW_MOVE ^ KW_TO ! poolPath
					{
					KW_MOVE93=(Token)match(input,KW_MOVE,FOLLOW_KW_MOVE_in_triggerActionExpression1305); 
					KW_MOVE93_tree = (ASTNode)adaptor.create(KW_MOVE93);
					root_0 = (ASTNode)adaptor.becomeRoot(KW_MOVE93_tree, root_0);

					KW_TO94=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_triggerActionExpression1308); 
					pushFollow(FOLLOW_poolPath_in_triggerActionExpression1311);
					poolPath95=poolPath();
					state._fsp--;

					adaptor.addChild(root_0, poolPath95.getTree());

					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerActionExpression"


	public static class triggerActionExpressionStandalone_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "triggerActionExpressionStandalone"
	// ResourcePlanParser.g:205:1: triggerActionExpressionStandalone : triggerActionExpression EOF ;
	public final HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return triggerActionExpressionStandalone() throws RecognitionException {
		HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return retval = new HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token EOF97=null;
		ParserRuleReturnScope triggerActionExpression96 =null;

		ASTNode EOF97_tree=null;

		try {
			// ResourcePlanParser.g:205:35: ( triggerActionExpression EOF )
			// ResourcePlanParser.g:205:37: triggerActionExpression EOF
			{
			root_0 = (ASTNode)adaptor.nil();


			pushFollow(FOLLOW_triggerActionExpression_in_triggerActionExpressionStandalone1325);
			triggerActionExpression96=triggerActionExpression();
			state._fsp--;

			adaptor.addChild(root_0, triggerActionExpression96.getTree());

			EOF97=(Token)match(input,EOF,FOLLOW_EOF_in_triggerActionExpressionStandalone1327); 
			EOF97_tree = (ASTNode)adaptor.create(EOF97);
			adaptor.addChild(root_0, EOF97_tree);

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "triggerActionExpressionStandalone"


	public static class createTriggerStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createTriggerStatement"
	// ResourcePlanParser.g:207:1: createTriggerStatement : KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ;
	public final HiveParser_ResourcePlanParser.createTriggerStatement_return createTriggerStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.createTriggerStatement_return retval = new HiveParser_ResourcePlanParser.createTriggerStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_CREATE98=null;
		Token KW_TRIGGER99=null;
		Token DOT100=null;
		Token KW_WHEN101=null;
		Token KW_DO103=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope triggerName =null;
		ParserRuleReturnScope triggerExpression102 =null;
		ParserRuleReturnScope triggerActionExpression104 =null;

		ASTNode KW_CREATE98_tree=null;
		ASTNode KW_TRIGGER99_tree=null;
		ASTNode DOT100_tree=null;
		ASTNode KW_WHEN101_tree=null;
		ASTNode KW_DO103_tree=null;
		RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
		RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_KW_DO=new RewriteRuleTokenStream(adaptor,"token KW_DO");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_triggerExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerExpression");
		RewriteRuleSubtreeStream stream_triggerActionExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerActionExpression");

		 gParent.pushMsg(retval.start,"create trigger statement", state); 
		try {
			// ResourcePlanParser.g:210:5: ( KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
			// ResourcePlanParser.g:210:7: KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression
			{
			KW_CREATE98=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTriggerStatement1350);  
			stream_KW_CREATE.add(KW_CREATE98);

			KW_TRIGGER99=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_createTriggerStatement1352);  
			stream_KW_TRIGGER.add(KW_TRIGGER99);

			pushFollow(FOLLOW_identifier_in_createTriggerStatement1356);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT100=(Token)match(input,DOT,FOLLOW_DOT_in_createTriggerStatement1358);  
			stream_DOT.add(DOT100);

			pushFollow(FOLLOW_identifier_in_createTriggerStatement1362);
			triggerName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(triggerName.getTree());
			KW_WHEN101=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_createTriggerStatement1370);  
			stream_KW_WHEN.add(KW_WHEN101);

			pushFollow(FOLLOW_triggerExpression_in_createTriggerStatement1372);
			triggerExpression102=triggerExpression();
			state._fsp--;

			stream_triggerExpression.add(triggerExpression102.getTree());
			KW_DO103=(Token)match(input,KW_DO,FOLLOW_KW_DO_in_createTriggerStatement1374);  
			stream_KW_DO.add(KW_DO103);

			pushFollow(FOLLOW_triggerActionExpression_in_createTriggerStatement1376);
			triggerActionExpression104=triggerActionExpression();
			state._fsp--;

			stream_triggerActionExpression.add(triggerActionExpression104.getTree());
			// AST REWRITE
			// elements: triggerExpression, rpName, triggerActionExpression, triggerName
			// token labels: 
			// rule labels: triggerName, rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 212:5: -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
			{
				// ResourcePlanParser.g:212:8: ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATE_TRIGGER, "TOK_CREATE_TRIGGER"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_triggerName.nextTree());
				adaptor.addChild(root_1, stream_triggerExpression.nextTree());
				adaptor.addChild(root_1, stream_triggerActionExpression.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "createTriggerStatement"


	public static class alterTriggerStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterTriggerStatement"
	// ResourcePlanParser.g:215:1: alterTriggerStatement : KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) ) ) ;
	public final HiveParser_ResourcePlanParser.alterTriggerStatement_return alterTriggerStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.alterTriggerStatement_return retval = new HiveParser_ResourcePlanParser.alterTriggerStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ALTER105=null;
		Token KW_TRIGGER106=null;
		Token DOT107=null;
		Token KW_WHEN108=null;
		Token KW_DO110=null;
		Token KW_ADD112=null;
		Token KW_TO113=null;
		Token KW_POOL114=null;
		Token KW_DROP115=null;
		Token KW_FROM116=null;
		Token KW_POOL117=null;
		Token KW_ADD118=null;
		Token KW_TO119=null;
		Token KW_UNMANAGED120=null;
		Token KW_DROP121=null;
		Token KW_FROM122=null;
		Token KW_UNMANAGED123=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope triggerName =null;
		ParserRuleReturnScope poolName =null;
		ParserRuleReturnScope triggerExpression109 =null;
		ParserRuleReturnScope triggerActionExpression111 =null;

		ASTNode KW_ALTER105_tree=null;
		ASTNode KW_TRIGGER106_tree=null;
		ASTNode DOT107_tree=null;
		ASTNode KW_WHEN108_tree=null;
		ASTNode KW_DO110_tree=null;
		ASTNode KW_ADD112_tree=null;
		ASTNode KW_TO113_tree=null;
		ASTNode KW_POOL114_tree=null;
		ASTNode KW_DROP115_tree=null;
		ASTNode KW_FROM116_tree=null;
		ASTNode KW_POOL117_tree=null;
		ASTNode KW_ADD118_tree=null;
		ASTNode KW_TO119_tree=null;
		ASTNode KW_UNMANAGED120_tree=null;
		ASTNode KW_DROP121_tree=null;
		ASTNode KW_FROM122_tree=null;
		ASTNode KW_UNMANAGED123_tree=null;
		RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
		RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_KW_DO=new RewriteRuleTokenStream(adaptor,"token KW_DO");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
		RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
		RewriteRuleTokenStream stream_KW_UNMANAGED=new RewriteRuleTokenStream(adaptor,"token KW_UNMANAGED");
		RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
		RewriteRuleSubtreeStream stream_triggerExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerExpression");
		RewriteRuleSubtreeStream stream_triggerActionExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerActionExpression");

		 gParent.pushMsg(retval.start,"alter trigger statement", state); 
		try {
			// ResourcePlanParser.g:218:5: ( KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) ) ) )
			// ResourcePlanParser.g:218:7: KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) ) )
			{
			KW_ALTER105=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterTriggerStatement1423);  
			stream_KW_ALTER.add(KW_ALTER105);

			KW_TRIGGER106=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterTriggerStatement1425);  
			stream_KW_TRIGGER.add(KW_TRIGGER106);

			pushFollow(FOLLOW_identifier_in_alterTriggerStatement1429);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT107=(Token)match(input,DOT,FOLLOW_DOT_in_alterTriggerStatement1431);  
			stream_DOT.add(DOT107);

			pushFollow(FOLLOW_identifier_in_alterTriggerStatement1435);
			triggerName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(triggerName.getTree());
			// ResourcePlanParser.g:218:72: ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) ) )
			int alt21=5;
			switch ( input.LA(1) ) {
			case KW_WHEN:
				{
				alt21=1;
				}
				break;
			case KW_ADD:
				{
				int LA21_2 = input.LA(2);
				if ( (LA21_2==KW_TO) ) {
					int LA21_4 = input.LA(3);
					if ( (LA21_4==KW_POOL) ) {
						alt21=2;
					}
					else if ( (LA21_4==KW_UNMANAGED) ) {
						alt21=4;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 4, input);
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
							new NoViableAltException("", 21, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case KW_DROP:
				{
				int LA21_3 = input.LA(2);
				if ( (LA21_3==KW_FROM) ) {
					int LA21_5 = input.LA(3);
					if ( (LA21_5==KW_POOL) ) {
						alt21=3;
					}
					else if ( (LA21_5==KW_UNMANAGED) ) {
						alt21=5;
					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 21, 5, input);
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
							new NoViableAltException("", 21, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}
			switch (alt21) {
				case 1 :
					// ResourcePlanParser.g:219:9: ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
					{
					// ResourcePlanParser.g:219:9: ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
					// ResourcePlanParser.g:219:10: KW_WHEN triggerExpression KW_DO triggerActionExpression
					{
					KW_WHEN108=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_alterTriggerStatement1448);  
					stream_KW_WHEN.add(KW_WHEN108);

					pushFollow(FOLLOW_triggerExpression_in_alterTriggerStatement1450);
					triggerExpression109=triggerExpression();
					state._fsp--;

					stream_triggerExpression.add(triggerExpression109.getTree());
					KW_DO110=(Token)match(input,KW_DO,FOLLOW_KW_DO_in_alterTriggerStatement1452);  
					stream_KW_DO.add(KW_DO110);

					pushFollow(FOLLOW_triggerActionExpression_in_alterTriggerStatement1454);
					triggerActionExpression111=triggerActionExpression();
					state._fsp--;

					stream_triggerActionExpression.add(triggerActionExpression111.getTree());
					// AST REWRITE
					// elements: triggerExpression, triggerName, triggerActionExpression, rpName
					// token labels: 
					// rule labels: triggerName, rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 220:11: -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
					{
						// ResourcePlanParser.g:220:14: ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_TRIGGER, "TOK_ALTER_TRIGGER"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_triggerName.nextTree());
						adaptor.addChild(root_1, stream_triggerExpression.nextTree());
						adaptor.addChild(root_1, stream_triggerActionExpression.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:221:9: ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:221:9: ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:221:10: KW_ADD KW_TO KW_POOL poolName= poolPath
					{
					KW_ADD112=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterTriggerStatement1492);  
					stream_KW_ADD.add(KW_ADD112);

					KW_TO113=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterTriggerStatement1494);  
					stream_KW_TO.add(KW_TO113);

					KW_POOL114=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterTriggerStatement1496);  
					stream_KW_POOL.add(KW_POOL114);

					pushFollow(FOLLOW_poolPath_in_alterTriggerStatement1500);
					poolName=poolPath();
					state._fsp--;

					stream_poolPath.add(poolName.getTree());
					// AST REWRITE
					// elements: triggerName, poolName, rpName
					// token labels: 
					// rule labels: triggerName, rpName, retval, poolName
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_poolName=new RewriteRuleSubtreeStream(adaptor,"rule poolName",poolName!=null?poolName.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 221:49: -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:221:52: ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_ADD_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolName.nextTree());
						// ResourcePlanParser.g:221:87: ^( TOK_ADD_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ADD_TRIGGER, "TOK_ADD_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
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
					// ResourcePlanParser.g:222:9: ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:222:9: ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:222:10: KW_DROP KW_FROM KW_POOL poolName= poolPath
					{
					KW_DROP115=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterTriggerStatement1531);  
					stream_KW_DROP.add(KW_DROP115);

					KW_FROM116=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_alterTriggerStatement1533);  
					stream_KW_FROM.add(KW_FROM116);

					KW_POOL117=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterTriggerStatement1535);  
					stream_KW_POOL.add(KW_POOL117);

					pushFollow(FOLLOW_poolPath_in_alterTriggerStatement1539);
					poolName=poolPath();
					state._fsp--;

					stream_poolPath.add(poolName.getTree());
					// AST REWRITE
					// elements: triggerName, poolName, rpName
					// token labels: 
					// rule labels: triggerName, rpName, retval, poolName
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);
					RewriteRuleSubtreeStream stream_poolName=new RewriteRuleSubtreeStream(adaptor,"rule poolName",poolName!=null?poolName.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 222:52: -> ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:222:55: ^( TOK_ALTER_POOL $rpName $poolName ^( TOK_DROP_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolName.nextTree());
						// ResourcePlanParser.g:222:90: ^( TOK_DROP_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_TRIGGER, "TOK_DROP_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 4 :
					// ResourcePlanParser.g:223:9: ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:223:9: ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:223:10: KW_ADD KW_TO KW_UNMANAGED
					{
					KW_ADD118=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterTriggerStatement1570);  
					stream_KW_ADD.add(KW_ADD118);

					KW_TO119=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterTriggerStatement1572);  
					stream_KW_TO.add(KW_TO119);

					KW_UNMANAGED120=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1574);  
					stream_KW_UNMANAGED.add(KW_UNMANAGED120);

					// AST REWRITE
					// elements: rpName, triggerName
					// token labels: 
					// rule labels: triggerName, rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 223:36: -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:223:39: ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_ADD_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED"));
						// ResourcePlanParser.g:223:78: ^( TOK_ADD_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ADD_TRIGGER, "TOK_ADD_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 5 :
					// ResourcePlanParser.g:224:9: ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:224:9: ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:224:10: KW_DROP KW_FROM KW_UNMANAGED
					{
					KW_DROP121=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterTriggerStatement1604);  
					stream_KW_DROP.add(KW_DROP121);

					KW_FROM122=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_alterTriggerStatement1606);  
					stream_KW_FROM.add(KW_FROM122);

					KW_UNMANAGED123=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1608);  
					stream_KW_UNMANAGED.add(KW_UNMANAGED123);

					// AST REWRITE
					// elements: triggerName, rpName
					// token labels: 
					// rule labels: triggerName, rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 224:39: -> ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:224:42: ^( TOK_ALTER_POOL $rpName TOK_UNMANAGED ^( TOK_DROP_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, (ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED"));
						// ResourcePlanParser.g:224:81: ^( TOK_DROP_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_TRIGGER, "TOK_DROP_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
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

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterTriggerStatement"


	public static class dropTriggerStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dropTriggerStatement"
	// ResourcePlanParser.g:229:1: dropTriggerStatement : KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier -> ^( TOK_DROP_TRIGGER $rpName $triggerName) ;
	public final HiveParser_ResourcePlanParser.dropTriggerStatement_return dropTriggerStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.dropTriggerStatement_return retval = new HiveParser_ResourcePlanParser.dropTriggerStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP124=null;
		Token KW_TRIGGER125=null;
		Token DOT126=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope triggerName =null;

		ASTNode KW_DROP124_tree=null;
		ASTNode KW_TRIGGER125_tree=null;
		ASTNode DOT126_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"drop trigger statement", state); 
		try {
			// ResourcePlanParser.g:232:5: ( KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier -> ^( TOK_DROP_TRIGGER $rpName $triggerName) )
			// ResourcePlanParser.g:232:7: KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier
			{
			KW_DROP124=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropTriggerStatement1661);  
			stream_KW_DROP.add(KW_DROP124);

			KW_TRIGGER125=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_dropTriggerStatement1663);  
			stream_KW_TRIGGER.add(KW_TRIGGER125);

			pushFollow(FOLLOW_identifier_in_dropTriggerStatement1667);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT126=(Token)match(input,DOT,FOLLOW_DOT_in_dropTriggerStatement1669);  
			stream_DOT.add(DOT126);

			pushFollow(FOLLOW_identifier_in_dropTriggerStatement1673);
			triggerName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(triggerName.getTree());
			// AST REWRITE
			// elements: rpName, triggerName
			// token labels: 
			// rule labels: triggerName, rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 233:5: -> ^( TOK_DROP_TRIGGER $rpName $triggerName)
			{
				// ResourcePlanParser.g:233:8: ^( TOK_DROP_TRIGGER $rpName $triggerName)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_TRIGGER, "TOK_DROP_TRIGGER"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_triggerName.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropTriggerStatement"


	public static class poolAssign_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "poolAssign"
	// ResourcePlanParser.g:236:1: poolAssign : ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) ) ;
	public final HiveParser_ResourcePlanParser.poolAssign_return poolAssign() throws RecognitionException {
		HiveParser_ResourcePlanParser.poolAssign_return retval = new HiveParser_ResourcePlanParser.poolAssign_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token allocFraction=null;
		Token parallelism=null;
		Token policy=null;
		Token KW_ALLOC_FRACTION127=null;
		Token EQUAL128=null;
		Token KW_QUERY_PARALLELISM129=null;
		Token EQUAL130=null;
		Token KW_SCHEDULING_POLICY131=null;
		Token EQUAL132=null;
		Token KW_PATH133=null;
		Token EQUAL134=null;
		ParserRuleReturnScope path =null;

		ASTNode allocFraction_tree=null;
		ASTNode parallelism_tree=null;
		ASTNode policy_tree=null;
		ASTNode KW_ALLOC_FRACTION127_tree=null;
		ASTNode EQUAL128_tree=null;
		ASTNode KW_QUERY_PARALLELISM129_tree=null;
		ASTNode EQUAL130_tree=null;
		ASTNode KW_SCHEDULING_POLICY131_tree=null;
		ASTNode EQUAL132_tree=null;
		ASTNode KW_PATH133_tree=null;
		ASTNode EQUAL134_tree=null;
		RewriteRuleTokenStream stream_KW_PATH=new RewriteRuleTokenStream(adaptor,"token KW_PATH");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_ALLOC_FRACTION=new RewriteRuleTokenStream(adaptor,"token KW_ALLOC_FRACTION");
		RewriteRuleTokenStream stream_KW_SCHEDULING_POLICY=new RewriteRuleTokenStream(adaptor,"token KW_SCHEDULING_POLICY");
		RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
		RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"poolAssign", state); 
		try {
			// ResourcePlanParser.g:239:5: ( ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) ) )
			// ResourcePlanParser.g:239:7: ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) )
			{
			// ResourcePlanParser.g:239:7: ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) )
			int alt22=4;
			switch ( input.LA(1) ) {
			case KW_ALLOC_FRACTION:
				{
				alt22=1;
				}
				break;
			case KW_QUERY_PARALLELISM:
				{
				alt22=2;
				}
				break;
			case KW_SCHEDULING_POLICY:
				{
				alt22=3;
				}
				break;
			case KW_PATH:
				{
				alt22=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}
			switch (alt22) {
				case 1 :
					// ResourcePlanParser.g:240:9: ( KW_ALLOC_FRACTION EQUAL allocFraction= Number )
					{
					// ResourcePlanParser.g:240:9: ( KW_ALLOC_FRACTION EQUAL allocFraction= Number )
					// ResourcePlanParser.g:240:10: KW_ALLOC_FRACTION EQUAL allocFraction= Number
					{
					KW_ALLOC_FRACTION127=(Token)match(input,KW_ALLOC_FRACTION,FOLLOW_KW_ALLOC_FRACTION_in_poolAssign1727);  
					stream_KW_ALLOC_FRACTION.add(KW_ALLOC_FRACTION127);

					EQUAL128=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1729);  
					stream_EQUAL.add(EQUAL128);

					allocFraction=(Token)match(input,Number,FOLLOW_Number_in_poolAssign1733);  
					stream_Number.add(allocFraction);

					}

					// AST REWRITE
					// elements: allocFraction
					// token labels: allocFraction
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_allocFraction=new RewriteRuleTokenStream(adaptor,"token allocFraction",allocFraction);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 240:56: -> ^( TOK_ALLOC_FRACTION $allocFraction)
					{
						// ResourcePlanParser.g:240:59: ^( TOK_ALLOC_FRACTION $allocFraction)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALLOC_FRACTION, "TOK_ALLOC_FRACTION"), root_1);
						adaptor.addChild(root_1, stream_allocFraction.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 2 :
					// ResourcePlanParser.g:241:9: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
					{
					// ResourcePlanParser.g:241:9: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
					// ResourcePlanParser.g:241:10: KW_QUERY_PARALLELISM EQUAL parallelism= Number
					{
					KW_QUERY_PARALLELISM129=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_poolAssign1754);  
					stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM129);

					EQUAL130=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1756);  
					stream_EQUAL.add(EQUAL130);

					parallelism=(Token)match(input,Number,FOLLOW_Number_in_poolAssign1760);  
					stream_Number.add(parallelism);

					}

					// AST REWRITE
					// elements: parallelism
					// token labels: parallelism
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_parallelism=new RewriteRuleTokenStream(adaptor,"token parallelism",parallelism);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 241:57: -> ^( TOK_QUERY_PARALLELISM $parallelism)
					{
						// ResourcePlanParser.g:241:60: ^( TOK_QUERY_PARALLELISM $parallelism)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM"), root_1);
						adaptor.addChild(root_1, stream_parallelism.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 3 :
					// ResourcePlanParser.g:242:9: ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral )
					{
					// ResourcePlanParser.g:242:9: ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral )
					// ResourcePlanParser.g:242:10: KW_SCHEDULING_POLICY EQUAL policy= StringLiteral
					{
					KW_SCHEDULING_POLICY131=(Token)match(input,KW_SCHEDULING_POLICY,FOLLOW_KW_SCHEDULING_POLICY_in_poolAssign1781);  
					stream_KW_SCHEDULING_POLICY.add(KW_SCHEDULING_POLICY131);

					EQUAL132=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1783);  
					stream_EQUAL.add(EQUAL132);

					policy=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_poolAssign1787);  
					stream_StringLiteral.add(policy);

					}

					// AST REWRITE
					// elements: policy
					// token labels: policy
					// rule labels: retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleTokenStream stream_policy=new RewriteRuleTokenStream(adaptor,"token policy",policy);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 242:59: -> ^( TOK_SCHEDULING_POLICY $policy)
					{
						// ResourcePlanParser.g:242:62: ^( TOK_SCHEDULING_POLICY $policy)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SCHEDULING_POLICY, "TOK_SCHEDULING_POLICY"), root_1);
						adaptor.addChild(root_1, stream_policy.nextNode());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;
				case 4 :
					// ResourcePlanParser.g:243:9: ( KW_PATH EQUAL path= poolPath )
					{
					// ResourcePlanParser.g:243:9: ( KW_PATH EQUAL path= poolPath )
					// ResourcePlanParser.g:243:10: KW_PATH EQUAL path= poolPath
					{
					KW_PATH133=(Token)match(input,KW_PATH,FOLLOW_KW_PATH_in_poolAssign1808);  
					stream_KW_PATH.add(KW_PATH133);

					EQUAL134=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1810);  
					stream_EQUAL.add(EQUAL134);

					pushFollow(FOLLOW_poolPath_in_poolAssign1814);
					path=poolPath();
					state._fsp--;

					stream_poolPath.add(path.getTree());
					}

					// AST REWRITE
					// elements: path
					// token labels: 
					// rule labels: path, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 243:39: -> ^( TOK_PATH $path)
					{
						// ResourcePlanParser.g:243:42: ^( TOK_PATH $path)
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_PATH, "TOK_PATH"), root_1);
						adaptor.addChild(root_1, stream_path.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "poolAssign"


	public static class poolAssignList_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "poolAssignList"
	// ResourcePlanParser.g:247:1: poolAssignList : poolAssign ( COMMA poolAssign )* -> ( poolAssign )+ ;
	public final HiveParser_ResourcePlanParser.poolAssignList_return poolAssignList() throws RecognitionException {
		HiveParser_ResourcePlanParser.poolAssignList_return retval = new HiveParser_ResourcePlanParser.poolAssignList_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token COMMA136=null;
		ParserRuleReturnScope poolAssign135 =null;
		ParserRuleReturnScope poolAssign137 =null;

		ASTNode COMMA136_tree=null;
		RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
		RewriteRuleSubtreeStream stream_poolAssign=new RewriteRuleSubtreeStream(adaptor,"rule poolAssign");

		 gParent.pushMsg(retval.start,"poolAssignList", state); 
		try {
			// ResourcePlanParser.g:250:5: ( poolAssign ( COMMA poolAssign )* -> ( poolAssign )+ )
			// ResourcePlanParser.g:250:7: poolAssign ( COMMA poolAssign )*
			{
			pushFollow(FOLLOW_poolAssign_in_poolAssignList1859);
			poolAssign135=poolAssign();
			state._fsp--;

			stream_poolAssign.add(poolAssign135.getTree());
			// ResourcePlanParser.g:250:18: ( COMMA poolAssign )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// ResourcePlanParser.g:250:19: COMMA poolAssign
					{
					COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_poolAssignList1862);  
					stream_COMMA.add(COMMA136);

					pushFollow(FOLLOW_poolAssign_in_poolAssignList1864);
					poolAssign137=poolAssign();
					state._fsp--;

					stream_poolAssign.add(poolAssign137.getTree());
					}
					break;

				default :
					break loop23;
				}
			}

			// AST REWRITE
			// elements: poolAssign
			// token labels: 
			// rule labels: retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 250:38: -> ( poolAssign )+
			{
				if ( !(stream_poolAssign.hasNext()) ) {
					throw new RewriteEarlyExitException();
				}
				while ( stream_poolAssign.hasNext() ) {
					adaptor.addChild(root_0, stream_poolAssign.nextTree());
				}
				stream_poolAssign.reset();

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "poolAssignList"


	public static class createPoolStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createPoolStatement"
	// ResourcePlanParser.g:253:1: createPoolStatement : KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList ) ;
	public final HiveParser_ResourcePlanParser.createPoolStatement_return createPoolStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.createPoolStatement_return retval = new HiveParser_ResourcePlanParser.createPoolStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_CREATE138=null;
		Token KW_POOL139=null;
		Token DOT140=null;
		Token KW_WITH142=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope poolPath141 =null;
		ParserRuleReturnScope poolAssignList143 =null;

		ASTNode KW_CREATE138_tree=null;
		ASTNode KW_POOL139_tree=null;
		ASTNode DOT140_tree=null;
		ASTNode KW_WITH142_tree=null;
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_poolAssignList=new RewriteRuleSubtreeStream(adaptor,"rule poolAssignList");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"create pool statement", state); 
		try {
			// ResourcePlanParser.g:256:5: ( KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList ) )
			// ResourcePlanParser.g:256:7: KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList
			{
			KW_CREATE138=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createPoolStatement1898);  
			stream_KW_CREATE.add(KW_CREATE138);

			KW_POOL139=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_createPoolStatement1900);  
			stream_KW_POOL.add(KW_POOL139);

			pushFollow(FOLLOW_identifier_in_createPoolStatement1904);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT140=(Token)match(input,DOT,FOLLOW_DOT_in_createPoolStatement1906);  
			stream_DOT.add(DOT140);

			pushFollow(FOLLOW_poolPath_in_createPoolStatement1908);
			poolPath141=poolPath();
			state._fsp--;

			stream_poolPath.add(poolPath141.getTree());
			KW_WITH142=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createPoolStatement1916);  
			stream_KW_WITH.add(KW_WITH142);

			pushFollow(FOLLOW_poolAssignList_in_createPoolStatement1918);
			poolAssignList143=poolAssignList();
			state._fsp--;

			stream_poolAssignList.add(poolAssignList143.getTree());
			// AST REWRITE
			// elements: rpName, poolPath, poolAssignList
			// token labels: 
			// rule labels: rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 258:5: -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList )
			{
				// ResourcePlanParser.g:258:8: ^( TOK_CREATE_POOL $rpName poolPath poolAssignList )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATE_POOL, "TOK_CREATE_POOL"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_poolPath.nextTree());
				adaptor.addChild(root_1, stream_poolAssignList.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "createPoolStatement"


	public static class alterPoolStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterPoolStatement"
	// ResourcePlanParser.g:261:1: alterPoolStatement : KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) ) ) ;
	public final HiveParser_ResourcePlanParser.alterPoolStatement_return alterPoolStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.alterPoolStatement_return retval = new HiveParser_ResourcePlanParser.alterPoolStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_ALTER144=null;
		Token KW_POOL145=null;
		Token DOT146=null;
		Token KW_SET148=null;
		Token KW_UNSET150=null;
		Token KW_SCHEDULING_POLICY151=null;
		Token KW_ADD152=null;
		Token KW_TRIGGER153=null;
		Token KW_DROP154=null;
		Token KW_TRIGGER155=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope triggerName =null;
		ParserRuleReturnScope poolPath147 =null;
		ParserRuleReturnScope poolAssignList149 =null;

		ASTNode KW_ALTER144_tree=null;
		ASTNode KW_POOL145_tree=null;
		ASTNode DOT146_tree=null;
		ASTNode KW_SET148_tree=null;
		ASTNode KW_UNSET150_tree=null;
		ASTNode KW_SCHEDULING_POLICY151_tree=null;
		ASTNode KW_ADD152_tree=null;
		ASTNode KW_TRIGGER153_tree=null;
		ASTNode KW_DROP154_tree=null;
		ASTNode KW_TRIGGER155_tree=null;
		RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
		RewriteRuleTokenStream stream_KW_SCHEDULING_POLICY=new RewriteRuleTokenStream(adaptor,"token KW_SCHEDULING_POLICY");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
		RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
		RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_poolAssignList=new RewriteRuleSubtreeStream(adaptor,"rule poolAssignList");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"alter pool statement", state); 
		try {
			// ResourcePlanParser.g:264:5: ( KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) ) ) )
			// ResourcePlanParser.g:264:7: KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) ) )
			{
			KW_ALTER144=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterPoolStatement1962);  
			stream_KW_ALTER.add(KW_ALTER144);

			KW_POOL145=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterPoolStatement1964);  
			stream_KW_POOL.add(KW_POOL145);

			pushFollow(FOLLOW_identifier_in_alterPoolStatement1968);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT146=(Token)match(input,DOT,FOLLOW_DOT_in_alterPoolStatement1970);  
			stream_DOT.add(DOT146);

			pushFollow(FOLLOW_poolPath_in_alterPoolStatement1972);
			poolPath147=poolPath();
			state._fsp--;

			stream_poolPath.add(poolPath147.getTree());
			// ResourcePlanParser.g:264:55: ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) ) )
			int alt24=4;
			switch ( input.LA(1) ) {
			case KW_SET:
				{
				alt24=1;
				}
				break;
			case KW_UNSET:
				{
				alt24=2;
				}
				break;
			case KW_ADD:
				{
				alt24=3;
				}
				break;
			case KW_DROP:
				{
				alt24=4;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 24, 0, input);
				throw nvae;
			}
			switch (alt24) {
				case 1 :
					// ResourcePlanParser.g:265:9: ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) )
					{
					// ResourcePlanParser.g:265:9: ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) )
					// ResourcePlanParser.g:265:10: KW_SET poolAssignList
					{
					KW_SET148=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterPoolStatement1985);  
					stream_KW_SET.add(KW_SET148);

					pushFollow(FOLLOW_poolAssignList_in_alterPoolStatement1987);
					poolAssignList149=poolAssignList();
					state._fsp--;

					stream_poolAssignList.add(poolAssignList149.getTree());
					// AST REWRITE
					// elements: poolAssignList, rpName, poolPath
					// token labels: 
					// rule labels: rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 265:32: -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList )
					{
						// ResourcePlanParser.g:265:35: ^( TOK_ALTER_POOL $rpName poolPath poolAssignList )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolPath.nextTree());
						adaptor.addChild(root_1, stream_poolAssignList.nextTree());
						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:266:11: ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) )
					{
					// ResourcePlanParser.g:266:11: ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) )
					// ResourcePlanParser.g:266:12: KW_UNSET KW_SCHEDULING_POLICY
					{
					KW_UNSET150=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterPoolStatement2014);  
					stream_KW_UNSET.add(KW_UNSET150);

					KW_SCHEDULING_POLICY151=(Token)match(input,KW_SCHEDULING_POLICY,FOLLOW_KW_SCHEDULING_POLICY_in_alterPoolStatement2016);  
					stream_KW_SCHEDULING_POLICY.add(KW_SCHEDULING_POLICY151);

					// AST REWRITE
					// elements: poolPath, rpName
					// token labels: 
					// rule labels: rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 266:42: -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) )
					{
						// ResourcePlanParser.g:266:45: ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolPath.nextTree());
						// ResourcePlanParser.g:266:79: ^( TOK_SCHEDULING_POLICY TOK_NULL )
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_SCHEDULING_POLICY, "TOK_SCHEDULING_POLICY"), root_2);
						adaptor.addChild(root_2, (ASTNode)adaptor.create(TOK_NULL, "TOK_NULL"));
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
					// ResourcePlanParser.g:267:11: ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:267:11: ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:267:12: KW_ADD KW_TRIGGER triggerName= identifier
					{
					KW_ADD152=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterPoolStatement2047);  
					stream_KW_ADD.add(KW_ADD152);

					KW_TRIGGER153=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterPoolStatement2049);  
					stream_KW_TRIGGER.add(KW_TRIGGER153);

					pushFollow(FOLLOW_identifier_in_alterPoolStatement2053);
					triggerName=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(triggerName.getTree());
					// AST REWRITE
					// elements: rpName, poolPath, triggerName
					// token labels: 
					// rule labels: triggerName, rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 268:13: -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:268:16: ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_ADD_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolPath.nextTree());
						// ResourcePlanParser.g:268:50: ^( TOK_ADD_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ADD_TRIGGER, "TOK_ADD_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
						adaptor.addChild(root_1, root_2);
						}

						adaptor.addChild(root_0, root_1);
						}

					}


					retval.tree = root_0;

					}

					}
					break;
				case 4 :
					// ResourcePlanParser.g:269:11: ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) )
					{
					// ResourcePlanParser.g:269:11: ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) ) )
					// ResourcePlanParser.g:269:12: KW_DROP KW_TRIGGER triggerName= identifier
					{
					KW_DROP154=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterPoolStatement2097);  
					stream_KW_DROP.add(KW_DROP154);

					KW_TRIGGER155=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterPoolStatement2099);  
					stream_KW_TRIGGER.add(KW_TRIGGER155);

					pushFollow(FOLLOW_identifier_in_alterPoolStatement2103);
					triggerName=gHiveParser.identifier();
					state._fsp--;

					stream_identifier.add(triggerName.getTree());
					// AST REWRITE
					// elements: triggerName, poolPath, rpName
					// token labels: 
					// rule labels: triggerName, rpName, retval
					// token list labels: 
					// rule list labels: 
					// wildcard labels: 
					retval.tree = root_0;
					RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.getTree():null);
					RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
					RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

					root_0 = (ASTNode)adaptor.nil();
					// 270:13: -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) )
					{
						// ResourcePlanParser.g:270:16: ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_DROP_TRIGGER $triggerName) )
						{
						ASTNode root_1 = (ASTNode)adaptor.nil();
						root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL"), root_1);
						adaptor.addChild(root_1, stream_rpName.nextTree());
						adaptor.addChild(root_1, stream_poolPath.nextTree());
						// ResourcePlanParser.g:270:50: ^( TOK_DROP_TRIGGER $triggerName)
						{
						ASTNode root_2 = (ASTNode)adaptor.nil();
						root_2 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_TRIGGER, "TOK_DROP_TRIGGER"), root_2);
						adaptor.addChild(root_2, stream_triggerName.nextTree());
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

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterPoolStatement"


	public static class dropPoolStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dropPoolStatement"
	// ResourcePlanParser.g:274:1: dropPoolStatement : KW_DROP KW_POOL rpName= identifier DOT poolPath -> ^( TOK_DROP_POOL $rpName poolPath ) ;
	public final HiveParser_ResourcePlanParser.dropPoolStatement_return dropPoolStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.dropPoolStatement_return retval = new HiveParser_ResourcePlanParser.dropPoolStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token KW_DROP156=null;
		Token KW_POOL157=null;
		Token DOT158=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope poolPath159 =null;

		ASTNode KW_DROP156_tree=null;
		ASTNode KW_POOL157_tree=null;
		ASTNode DOT158_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
		RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"drop pool statement", state); 
		try {
			// ResourcePlanParser.g:277:5: ( KW_DROP KW_POOL rpName= identifier DOT poolPath -> ^( TOK_DROP_POOL $rpName poolPath ) )
			// ResourcePlanParser.g:277:7: KW_DROP KW_POOL rpName= identifier DOT poolPath
			{
			KW_DROP156=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropPoolStatement2169);  
			stream_KW_DROP.add(KW_DROP156);

			KW_POOL157=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_dropPoolStatement2171);  
			stream_KW_POOL.add(KW_POOL157);

			pushFollow(FOLLOW_identifier_in_dropPoolStatement2175);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			DOT158=(Token)match(input,DOT,FOLLOW_DOT_in_dropPoolStatement2177);  
			stream_DOT.add(DOT158);

			pushFollow(FOLLOW_poolPath_in_dropPoolStatement2179);
			poolPath159=poolPath();
			state._fsp--;

			stream_poolPath.add(poolPath159.getTree());
			// AST REWRITE
			// elements: poolPath, rpName
			// token labels: 
			// rule labels: rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 278:5: -> ^( TOK_DROP_POOL $rpName poolPath )
			{
				// ResourcePlanParser.g:278:8: ^( TOK_DROP_POOL $rpName poolPath )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_POOL, "TOK_DROP_POOL"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_poolPath.nextTree());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropPoolStatement"


	public static class createMappingStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "createMappingStatement"
	// ResourcePlanParser.g:281:1: createMappingStatement : ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) ;
	public final HiveParser_ResourcePlanParser.createMappingStatement_return createMappingStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.createMappingStatement_return retval = new HiveParser_ResourcePlanParser.createMappingStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token mappingType=null;
		Token name=null;
		Token order=null;
		Token KW_CREATE160=null;
		Token KW_MAPPING161=null;
		Token KW_IN162=null;
		Token KW_TO163=null;
		Token KW_WITH165=null;
		Token KW_ORDER166=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope path =null;
		ParserRuleReturnScope unmanaged164 =null;

		ASTNode mappingType_tree=null;
		ASTNode name_tree=null;
		ASTNode order_tree=null;
		ASTNode KW_CREATE160_tree=null;
		ASTNode KW_MAPPING161_tree=null;
		ASTNode KW_IN162_tree=null;
		ASTNode KW_TO163_tree=null;
		ASTNode KW_WITH165_tree=null;
		ASTNode KW_ORDER166_tree=null;
		RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
		RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
		RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
		RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_unmanaged=new RewriteRuleSubtreeStream(adaptor,"rule unmanaged");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"create mapping statement", state); 
		try {
			// ResourcePlanParser.g:284:5: ( ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) )
			// ResourcePlanParser.g:284:7: ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
			{
			// ResourcePlanParser.g:284:7: ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
			// ResourcePlanParser.g:284:8: KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )?
			{
			KW_CREATE160=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createMappingStatement2222);  
			stream_KW_CREATE.add(KW_CREATE160);

			// ResourcePlanParser.g:284:30: ( KW_USER | KW_GROUP | KW_APPLICATION )
			int alt25=3;
			switch ( input.LA(1) ) {
			case KW_USER:
				{
				alt25=1;
				}
				break;
			case KW_GROUP:
				{
				alt25=2;
				}
				break;
			case KW_APPLICATION:
				{
				alt25=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}
			switch (alt25) {
				case 1 :
					// ResourcePlanParser.g:284:31: KW_USER
					{
					mappingType=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_createMappingStatement2227);  
					stream_KW_USER.add(mappingType);

					}
					break;
				case 2 :
					// ResourcePlanParser.g:284:41: KW_GROUP
					{
					mappingType=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_createMappingStatement2231);  
					stream_KW_GROUP.add(mappingType);

					}
					break;
				case 3 :
					// ResourcePlanParser.g:284:52: KW_APPLICATION
					{
					mappingType=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_createMappingStatement2235);  
					stream_KW_APPLICATION.add(mappingType);

					}
					break;

			}

			KW_MAPPING161=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_createMappingStatement2247);  
			stream_KW_MAPPING.add(KW_MAPPING161);

			name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_createMappingStatement2251);  
			stream_StringLiteral.add(name);

			KW_IN162=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_createMappingStatement2262);  
			stream_KW_IN.add(KW_IN162);

			pushFollow(FOLLOW_identifier_in_createMappingStatement2266);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			// ResourcePlanParser.g:286:34: ( ( KW_TO path= poolPath ) | unmanaged )
			int alt26=2;
			int LA26_0 = input.LA(1);
			if ( (LA26_0==KW_TO) ) {
				alt26=1;
			}
			else if ( (LA26_0==KW_UNMANAGED) ) {
				alt26=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 26, 0, input);
				throw nvae;
			}

			switch (alt26) {
				case 1 :
					// ResourcePlanParser.g:286:35: ( KW_TO path= poolPath )
					{
					// ResourcePlanParser.g:286:35: ( KW_TO path= poolPath )
					// ResourcePlanParser.g:286:36: KW_TO path= poolPath
					{
					KW_TO163=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_createMappingStatement2270);  
					stream_KW_TO.add(KW_TO163);

					pushFollow(FOLLOW_poolPath_in_createMappingStatement2274);
					path=poolPath();
					state._fsp--;

					stream_poolPath.add(path.getTree());
					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:286:59: unmanaged
					{
					pushFollow(FOLLOW_unmanaged_in_createMappingStatement2279);
					unmanaged164=unmanaged();
					state._fsp--;

					stream_unmanaged.add(unmanaged164.getTree());
					}
					break;

			}

			// ResourcePlanParser.g:287:10: ( KW_WITH KW_ORDER order= Number )?
			int alt27=2;
			int LA27_0 = input.LA(1);
			if ( (LA27_0==KW_WITH) ) {
				alt27=1;
			}
			switch (alt27) {
				case 1 :
					// ResourcePlanParser.g:287:11: KW_WITH KW_ORDER order= Number
					{
					KW_WITH165=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createMappingStatement2292);  
					stream_KW_WITH.add(KW_WITH165);

					KW_ORDER166=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_createMappingStatement2294);  
					stream_KW_ORDER.add(KW_ORDER166);

					order=(Token)match(input,Number,FOLLOW_Number_in_createMappingStatement2298);  
					stream_Number.add(order);

					}
					break;

			}

			}

			// AST REWRITE
			// elements: order, unmanaged, mappingType, name, path, rpName
			// token labels: mappingType, name, order
			// rule labels: path, rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_order=new RewriteRuleTokenStream(adaptor,"token order",order);
			RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 288:5: -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
			{
				// ResourcePlanParser.g:288:8: ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_CREATE_MAPPING, "TOK_CREATE_MAPPING"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_mappingType.nextNode());
				adaptor.addChild(root_1, stream_name.nextNode());
				// ResourcePlanParser.g:288:57: ( $path)?
				if ( stream_path.hasNext() ) {
					adaptor.addChild(root_1, stream_path.nextTree());
				}
				stream_path.reset();

				// ResourcePlanParser.g:288:63: ( unmanaged )?
				if ( stream_unmanaged.hasNext() ) {
					adaptor.addChild(root_1, stream_unmanaged.nextTree());
				}
				stream_unmanaged.reset();

				// ResourcePlanParser.g:288:75: ( $order)?
				if ( stream_order.hasNext() ) {
					adaptor.addChild(root_1, stream_order.nextNode());
				}
				stream_order.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "createMappingStatement"


	public static class alterMappingStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "alterMappingStatement"
	// ResourcePlanParser.g:291:1: alterMappingStatement : ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) ;
	public final HiveParser_ResourcePlanParser.alterMappingStatement_return alterMappingStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.alterMappingStatement_return retval = new HiveParser_ResourcePlanParser.alterMappingStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token mappingType=null;
		Token name=null;
		Token order=null;
		Token KW_ALTER167=null;
		Token KW_MAPPING168=null;
		Token KW_IN169=null;
		Token KW_TO170=null;
		Token KW_WITH172=null;
		Token KW_ORDER173=null;
		ParserRuleReturnScope rpName =null;
		ParserRuleReturnScope path =null;
		ParserRuleReturnScope unmanaged171 =null;

		ASTNode mappingType_tree=null;
		ASTNode name_tree=null;
		ASTNode order_tree=null;
		ASTNode KW_ALTER167_tree=null;
		ASTNode KW_MAPPING168_tree=null;
		ASTNode KW_IN169_tree=null;
		ASTNode KW_TO170_tree=null;
		ASTNode KW_WITH172_tree=null;
		ASTNode KW_ORDER173_tree=null;
		RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
		RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
		RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
		RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
		RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
		RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
		RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
		RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
		RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
		RewriteRuleSubtreeStream stream_unmanaged=new RewriteRuleSubtreeStream(adaptor,"rule unmanaged");
		RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");

		 gParent.pushMsg(retval.start,"alter mapping statement", state); 
		try {
			// ResourcePlanParser.g:294:5: ( ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) )
			// ResourcePlanParser.g:294:7: ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
			{
			// ResourcePlanParser.g:294:7: ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
			// ResourcePlanParser.g:294:8: KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )?
			{
			KW_ALTER167=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterMappingStatement2359);  
			stream_KW_ALTER.add(KW_ALTER167);

			// ResourcePlanParser.g:294:29: ( KW_USER | KW_GROUP | KW_APPLICATION )
			int alt28=3;
			switch ( input.LA(1) ) {
			case KW_USER:
				{
				alt28=1;
				}
				break;
			case KW_GROUP:
				{
				alt28=2;
				}
				break;
			case KW_APPLICATION:
				{
				alt28=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// ResourcePlanParser.g:294:30: KW_USER
					{
					mappingType=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_alterMappingStatement2364);  
					stream_KW_USER.add(mappingType);

					}
					break;
				case 2 :
					// ResourcePlanParser.g:294:40: KW_GROUP
					{
					mappingType=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_alterMappingStatement2368);  
					stream_KW_GROUP.add(mappingType);

					}
					break;
				case 3 :
					// ResourcePlanParser.g:294:51: KW_APPLICATION
					{
					mappingType=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_alterMappingStatement2372);  
					stream_KW_APPLICATION.add(mappingType);

					}
					break;

			}

			KW_MAPPING168=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_alterMappingStatement2384);  
			stream_KW_MAPPING.add(KW_MAPPING168);

			name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterMappingStatement2388);  
			stream_StringLiteral.add(name);

			KW_IN169=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_alterMappingStatement2399);  
			stream_KW_IN.add(KW_IN169);

			pushFollow(FOLLOW_identifier_in_alterMappingStatement2403);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			// ResourcePlanParser.g:296:34: ( ( KW_TO path= poolPath ) | unmanaged )
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==KW_TO) ) {
				alt29=1;
			}
			else if ( (LA29_0==KW_UNMANAGED) ) {
				alt29=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 29, 0, input);
				throw nvae;
			}

			switch (alt29) {
				case 1 :
					// ResourcePlanParser.g:296:35: ( KW_TO path= poolPath )
					{
					// ResourcePlanParser.g:296:35: ( KW_TO path= poolPath )
					// ResourcePlanParser.g:296:36: KW_TO path= poolPath
					{
					KW_TO170=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterMappingStatement2407);  
					stream_KW_TO.add(KW_TO170);

					pushFollow(FOLLOW_poolPath_in_alterMappingStatement2411);
					path=poolPath();
					state._fsp--;

					stream_poolPath.add(path.getTree());
					}

					}
					break;
				case 2 :
					// ResourcePlanParser.g:296:59: unmanaged
					{
					pushFollow(FOLLOW_unmanaged_in_alterMappingStatement2416);
					unmanaged171=unmanaged();
					state._fsp--;

					stream_unmanaged.add(unmanaged171.getTree());
					}
					break;

			}

			// ResourcePlanParser.g:297:10: ( KW_WITH KW_ORDER order= Number )?
			int alt30=2;
			int LA30_0 = input.LA(1);
			if ( (LA30_0==KW_WITH) ) {
				alt30=1;
			}
			switch (alt30) {
				case 1 :
					// ResourcePlanParser.g:297:11: KW_WITH KW_ORDER order= Number
					{
					KW_WITH172=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterMappingStatement2429);  
					stream_KW_WITH.add(KW_WITH172);

					KW_ORDER173=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_alterMappingStatement2431);  
					stream_KW_ORDER.add(KW_ORDER173);

					order=(Token)match(input,Number,FOLLOW_Number_in_alterMappingStatement2435);  
					stream_Number.add(order);

					}
					break;

			}

			}

			// AST REWRITE
			// elements: order, unmanaged, name, rpName, path, mappingType
			// token labels: mappingType, name, order
			// rule labels: path, rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleTokenStream stream_order=new RewriteRuleTokenStream(adaptor,"token order",order);
			RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.getTree():null);
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 298:5: -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
			{
				// ResourcePlanParser.g:298:8: ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_ALTER_MAPPING, "TOK_ALTER_MAPPING"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_mappingType.nextNode());
				adaptor.addChild(root_1, stream_name.nextNode());
				// ResourcePlanParser.g:298:56: ( $path)?
				if ( stream_path.hasNext() ) {
					adaptor.addChild(root_1, stream_path.nextTree());
				}
				stream_path.reset();

				// ResourcePlanParser.g:298:62: ( unmanaged )?
				if ( stream_unmanaged.hasNext() ) {
					adaptor.addChild(root_1, stream_unmanaged.nextTree());
				}
				stream_unmanaged.reset();

				// ResourcePlanParser.g:298:74: ( $order)?
				if ( stream_order.hasNext() ) {
					adaptor.addChild(root_1, stream_order.nextNode());
				}
				stream_order.reset();

				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alterMappingStatement"


	public static class dropMappingStatement_return extends ParserRuleReturnScope {
		ASTNode tree;
		@Override
		public ASTNode getTree() { return tree; }
	};


	// $ANTLR start "dropMappingStatement"
	// ResourcePlanParser.g:301:1: dropMappingStatement : KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier -> ^( TOK_DROP_MAPPING $rpName $mappingType $name) ;
	public final HiveParser_ResourcePlanParser.dropMappingStatement_return dropMappingStatement() throws RecognitionException {
		HiveParser_ResourcePlanParser.dropMappingStatement_return retval = new HiveParser_ResourcePlanParser.dropMappingStatement_return();
		retval.start = input.LT(1);

		ASTNode root_0 = null;

		Token mappingType=null;
		Token name=null;
		Token KW_DROP174=null;
		Token KW_MAPPING175=null;
		Token KW_IN176=null;
		ParserRuleReturnScope rpName =null;

		ASTNode mappingType_tree=null;
		ASTNode name_tree=null;
		ASTNode KW_DROP174_tree=null;
		ASTNode KW_MAPPING175_tree=null;
		ASTNode KW_IN176_tree=null;
		RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
		RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
		RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
		RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
		RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
		RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
		RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
		RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");

		 gParent.pushMsg(retval.start,"drop mapping statement", state); 
		try {
			// ResourcePlanParser.g:304:5: ( KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier -> ^( TOK_DROP_MAPPING $rpName $mappingType $name) )
			// ResourcePlanParser.g:304:7: KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier
			{
			KW_DROP174=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropMappingStatement2495);  
			stream_KW_DROP.add(KW_DROP174);

			// ResourcePlanParser.g:304:27: ( KW_USER | KW_GROUP | KW_APPLICATION )
			int alt31=3;
			switch ( input.LA(1) ) {
			case KW_USER:
				{
				alt31=1;
				}
				break;
			case KW_GROUP:
				{
				alt31=2;
				}
				break;
			case KW_APPLICATION:
				{
				alt31=3;
				}
				break;
			default:
				NoViableAltException nvae =
					new NoViableAltException("", 31, 0, input);
				throw nvae;
			}
			switch (alt31) {
				case 1 :
					// ResourcePlanParser.g:304:28: KW_USER
					{
					mappingType=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_dropMappingStatement2500);  
					stream_KW_USER.add(mappingType);

					}
					break;
				case 2 :
					// ResourcePlanParser.g:304:38: KW_GROUP
					{
					mappingType=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_dropMappingStatement2504);  
					stream_KW_GROUP.add(mappingType);

					}
					break;
				case 3 :
					// ResourcePlanParser.g:304:49: KW_APPLICATION
					{
					mappingType=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_dropMappingStatement2508);  
					stream_KW_APPLICATION.add(mappingType);

					}
					break;

			}

			KW_MAPPING175=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_dropMappingStatement2511);  
			stream_KW_MAPPING.add(KW_MAPPING175);

			name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dropMappingStatement2524);  
			stream_StringLiteral.add(name);

			KW_IN176=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_dropMappingStatement2526);  
			stream_KW_IN.add(KW_IN176);

			pushFollow(FOLLOW_identifier_in_dropMappingStatement2530);
			rpName=gHiveParser.identifier();
			state._fsp--;

			stream_identifier.add(rpName.getTree());
			// AST REWRITE
			// elements: name, mappingType, rpName
			// token labels: mappingType, name
			// rule labels: rpName, retval
			// token list labels: 
			// rule list labels: 
			// wildcard labels: 
			retval.tree = root_0;
			RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
			RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
			RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.getTree():null);
			RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.getTree():null);

			root_0 = (ASTNode)adaptor.nil();
			// 306:5: -> ^( TOK_DROP_MAPPING $rpName $mappingType $name)
			{
				// ResourcePlanParser.g:306:8: ^( TOK_DROP_MAPPING $rpName $mappingType $name)
				{
				ASTNode root_1 = (ASTNode)adaptor.nil();
				root_1 = (ASTNode)adaptor.becomeRoot((ASTNode)adaptor.create(TOK_DROP_MAPPING, "TOK_DROP_MAPPING"), root_1);
				adaptor.addChild(root_1, stream_rpName.nextTree());
				adaptor.addChild(root_1, stream_mappingType.nextNode());
				adaptor.addChild(root_1, stream_name.nextNode());
				adaptor.addChild(root_0, root_1);
				}

			}


			retval.tree = root_0;

			}

			retval.stop = input.LT(-1);

			retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

			 gParent.popMsg(state); 
		}

		  catch (RecognitionException e) {
		    throw e;
		  }

		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "dropMappingStatement"

	// Delegated rules



	public static final BitSet FOLLOW_createResourcePlanStatement_in_resourcePlanDdlStatements65 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterResourcePlanStatement_in_resourcePlanDdlStatements73 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropResourcePlanStatement_in_resourcePlanDdlStatements81 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_globalWmStatement_in_resourcePlanDdlStatements89 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_replaceResourcePlanStatement_in_resourcePlanDdlStatements97 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createTriggerStatement_in_resourcePlanDdlStatements105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterTriggerStatement_in_resourcePlanDdlStatements113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropTriggerStatement_in_resourcePlanDdlStatements121 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createPoolStatement_in_resourcePlanDdlStatements129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterPoolStatement_in_resourcePlanDdlStatements137 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropPoolStatement_in_resourcePlanDdlStatements145 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_createMappingStatement_in_resourcePlanDdlStatements153 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_alterMappingStatement_in_resourcePlanDdlStatements161 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_dropMappingStatement_in_resourcePlanDdlStatements169 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_rpAssign203 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_rpAssign205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_rpAssign209 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DEFAULT_in_rpAssign228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_rpAssign230 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_rpAssign232 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_rpAssign234 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rpAssign_in_rpAssignList272 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_rpAssignList275 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_rpAssign_in_rpAssignList277 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_rpUnassign316 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DEFAULT_in_rpUnassign334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_rpUnassign336 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_rpUnassign_in_rpUnassignList374 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_rpUnassignList377 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_rpUnassign_in_rpUnassignList379 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_KW_CREATE_in_createResourcePlanStatement411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_RESOURCE_in_createResourcePlanStatement413 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_PLAN_in_createResourcePlanStatement415 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D9CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ifNotExists_in_createResourcePlanStatement417 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_KW_LIKE_in_createResourcePlanStatement437 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement441 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement476 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_createResourcePlanStatement479 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_rpAssignList_in_createResourcePlanStatement481 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_WITH_in_withReplace521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
	public static final BitSet FOLLOW_KW_REPLACE_in_withReplace523 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ACTIVATE_in_activate536 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_withReplace_in_activate538 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ENABLE_in_enable555 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DISABLE_in_disable568 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNMANAGED_in_unmanaged581 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterResourcePlanStatement610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_RESOURCE_in_alterResourcePlanStatement612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_PLAN_in_alterResourcePlanStatement614 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterResourcePlanStatement618 = new BitSet(new long[]{0x0000000008000000L,0x0004010000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000004L,0x0000000001008000L});
	public static final BitSet FOLLOW_KW_VALIDATE_in_alterResourcePlanStatement633 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DISABLE_in_alterResourcePlanStatement658 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SET_in_alterResourcePlanStatement683 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_rpAssignList_in_alterResourcePlanStatement685 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNSET_in_alterResourcePlanStatement710 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_rpUnassignList_in_alterResourcePlanStatement712 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RENAME_in_alterResourcePlanStatement737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_TO_in_alterResourcePlanStatement739 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterResourcePlanStatement743 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_activate_in_alterResourcePlanStatement774 = new BitSet(new long[]{0x0000000000000002L,0x0004000000000000L});
	public static final BitSet FOLLOW_enable_in_alterResourcePlanStatement776 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enable_in_alterResourcePlanStatement781 = new BitSet(new long[]{0x0000000008000002L});
	public static final BitSet FOLLOW_activate_in_alterResourcePlanStatement783 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_enable_in_globalWmStatement839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_disable_in_globalWmStatement843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_KW_WORKLOAD_in_globalWmStatement846 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
	public static final BitSet FOLLOW_KW_MANAGEMENT_in_globalWmStatement848 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_REPLACE_in_replaceResourcePlanStatement887 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_ACTIVE_in_replaceResourcePlanStatement902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement904 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_PLAN_in_replaceResourcePlanStatement906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_replaceResourcePlanStatement908 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement912 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_PLAN_in_replaceResourcePlanStatement939 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement943 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_replaceResourcePlanStatement945 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement949 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_dropResourcePlanStatement1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
	public static final BitSet FOLLOW_KW_RESOURCE_in_dropResourcePlanStatement1003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
	public static final BitSet FOLLOW_KW_PLAN_in_dropResourcePlanStatement1005 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D9CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_ifExists_in_dropResourcePlanStatement1007 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_dropResourcePlanStatement1012 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_identifier_in_poolPath1051 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_DOT_in_poolPath1055 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_poolPath1057 = new BitSet(new long[]{0x0000000000010002L});
	public static final BitSet FOLLOW_triggerAtomExpression_in_triggerExpression1086 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triggerExpression_in_triggerExpressionStandalone1107 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_triggerExpressionStandalone1109 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triggerAndExpression_in_triggerOrExpression1134 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_KW_OR_in_triggerOrExpression1137 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_triggerAndExpression_in_triggerOrExpression1139 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_triggerAtomExpression_in_triggerAndExpression1168 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_KW_AND_in_triggerAndExpression1171 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_triggerAtomExpression_in_triggerAndExpression1173 = new BitSet(new long[]{0x0000001000000002L});
	public static final BitSet FOLLOW_identifier_in_triggerAtomExpression1202 = new BitSet(new long[]{0x0000000000200000L});
	public static final BitSet FOLLOW_comparisionOperator_in_triggerAtomExpression1204 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_triggerLiteral_in_triggerAtomExpression1206 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GREATERTHAN_in_comparisionOperator1269 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_KILL_in_triggerActionExpression1296 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_MOVE_in_triggerActionExpression1305 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_TO_in_triggerActionExpression1308 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_triggerActionExpression1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_triggerActionExpression_in_triggerActionExpressionStandalone1325 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_triggerActionExpressionStandalone1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CREATE_in_createTriggerStatement1350 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_TRIGGER_in_createTriggerStatement1352 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createTriggerStatement1356 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_createTriggerStatement1358 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createTriggerStatement1362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_KW_WHEN_in_createTriggerStatement1370 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_triggerExpression_in_createTriggerStatement1372 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_DO_in_createTriggerStatement1374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_triggerActionExpression_in_createTriggerStatement1376 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterTriggerStatement1423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_TRIGGER_in_alterTriggerStatement1425 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterTriggerStatement1429 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_alterTriggerStatement1431 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterTriggerStatement1435 = new BitSet(new long[]{0x0000000020000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_KW_WHEN_in_alterTriggerStatement1448 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_triggerExpression_in_alterTriggerStatement1450 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_DO_in_alterTriggerStatement1452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000800L});
	public static final BitSet FOLLOW_triggerActionExpression_in_alterTriggerStatement1454 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterTriggerStatement1492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_TO_in_alterTriggerStatement1494 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_alterTriggerStatement1496 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_alterTriggerStatement1500 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_alterTriggerStatement1531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_FROM_in_alterTriggerStatement1533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_alterTriggerStatement1535 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_alterTriggerStatement1539 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterTriggerStatement1570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
	public static final BitSet FOLLOW_KW_TO_in_alterTriggerStatement1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1574 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_alterTriggerStatement1604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_FROM_in_alterTriggerStatement1606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1608 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_dropTriggerStatement1661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_TRIGGER_in_dropTriggerStatement1663 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_dropTriggerStatement1667 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_dropTriggerStatement1669 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_dropTriggerStatement1673 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALLOC_FRACTION_in_poolAssign1727 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_poolAssign1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_poolAssign1733 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_poolAssign1754 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_poolAssign1756 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_poolAssign1760 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_SCHEDULING_POLICY_in_poolAssign1781 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_poolAssign1783 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_poolAssign1787 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_PATH_in_poolAssign1808 = new BitSet(new long[]{0x0000000000040000L});
	public static final BitSet FOLLOW_EQUAL_in_poolAssign1810 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_poolAssign1814 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_poolAssign_in_poolAssignList1859 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_COMMA_in_poolAssignList1862 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0020004000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_poolAssign_in_poolAssignList1864 = new BitSet(new long[]{0x0000000000000202L});
	public static final BitSet FOLLOW_KW_CREATE_in_createPoolStatement1898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_createPoolStatement1900 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createPoolStatement1904 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_createPoolStatement1906 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_createPoolStatement1908 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_createPoolStatement1916 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0020004000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_poolAssignList_in_createPoolStatement1918 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterPoolStatement1962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_alterPoolStatement1964 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterPoolStatement1968 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_alterPoolStatement1970 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_alterPoolStatement1972 = new BitSet(new long[]{0x0000000020000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L,0x0000000000008000L});
	public static final BitSet FOLLOW_KW_SET_in_alterPoolStatement1985 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0020004000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_poolAssignList_in_alterPoolStatement1987 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_UNSET_in_alterPoolStatement2014 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_KW_SCHEDULING_POLICY_in_alterPoolStatement2016 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ADD_in_alterPoolStatement2047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_TRIGGER_in_alterPoolStatement2049 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterPoolStatement2053 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_alterPoolStatement2097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_TRIGGER_in_alterPoolStatement2099 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterPoolStatement2103 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_dropPoolStatement2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
	public static final BitSet FOLLOW_KW_POOL_in_dropPoolStatement2171 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_dropPoolStatement2175 = new BitSet(new long[]{0x0000000000010000L});
	public static final BitSet FOLLOW_DOT_in_dropPoolStatement2177 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_dropPoolStatement2179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_CREATE_in_createMappingStatement2222 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_KW_USER_in_createMappingStatement2227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_GROUP_in_createMappingStatement2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_APPLICATION_in_createMappingStatement2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_MAPPING_in_createMappingStatement2247 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_createMappingStatement2251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_KW_IN_in_createMappingStatement2262 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_createMappingStatement2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TO_in_createMappingStatement2270 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_createMappingStatement2274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_unmanaged_in_createMappingStatement2279 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_createMappingStatement2292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_ORDER_in_createMappingStatement2294 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_createMappingStatement2298 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_ALTER_in_alterMappingStatement2359 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_KW_USER_in_alterMappingStatement2364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_GROUP_in_alterMappingStatement2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_APPLICATION_in_alterMappingStatement2372 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_MAPPING_in_alterMappingStatement2384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_alterMappingStatement2388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_KW_IN_in_alterMappingStatement2399 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_alterMappingStatement2403 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L,0x0000000000004000L});
	public static final BitSet FOLLOW_KW_TO_in_alterMappingStatement2407 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_poolPath_in_alterMappingStatement2411 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_unmanaged_in_alterMappingStatement2416 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_KW_WITH_in_alterMappingStatement2429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
	public static final BitSet FOLLOW_KW_ORDER_in_alterMappingStatement2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
	public static final BitSet FOLLOW_Number_in_alterMappingStatement2435 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_KW_DROP_in_dropMappingStatement2495 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000000000080000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
	public static final BitSet FOLLOW_KW_USER_in_dropMappingStatement2500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_GROUP_in_dropMappingStatement2504 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_APPLICATION_in_dropMappingStatement2508 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_KW_MAPPING_in_dropMappingStatement2511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_StringLiteral_in_dropMappingStatement2524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
	public static final BitSet FOLLOW_KW_IN_in_dropMappingStatement2526 = new BitSet(new long[]{0xE9B06C8AFD000000L,0x1D35ADEEEFD013DBL,0xBEE8FB81D8CA303CL,0x1CBD0F76CB2ADB5EL,0xE874FEF7DEF0CBFFL,0x000007C9F5CDF2A1L,0x0000010000000000L,0x2000000000002000L,0x0011000000000002L,0x0000000000204000L,0x0000000000040000L});
	public static final BitSet FOLLOW_identifier_in_dropMappingStatement2530 = new BitSet(new long[]{0x0000000000000002L});
}
