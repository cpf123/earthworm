# earthworm
借助earthworm 中间件 实现语法预解析和初步sql性能分析，最后执行sql组件选型。
(图片需要翻墙才能显示)

<img src="https://github.com/cpf123/earthworm/blob/master/img/WX20200501-221607%402x.png" width = "400" height = "400" alt="" align=center />
复用apache-hive-1.2.2-src sql源代码中解析模块org.apache.hadoop.hive.ql.parse 

通过antlr3插件 解析相应配置文件 XX.g 生成HiveLexer、HiveParser、XX.tokens、XX*Parser

<img src="https://github.com/cpf123/earthworm/blob/master/img/WX20200430-214912%402x.png" width = "300" height = "300" alt="" align=center />
