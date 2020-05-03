# earthworm
场景分析：常规调取数据框架有spark hive impala 针对spark内存计算快 资源有限，hive 计算稳定时间长等特点；以及sql写错繁复启动yarn资源的浪费问题构建earthworm中间件。

借助earthworm 中间件 实现语法预解析和初步sql性能分析，最后执行sql组件选型。
(图片需要翻墙才能显示)

<img src="https://github.com/cpf123/earthworm/blob/master/img/WX20200501-221607%402x.png" width = "400" height = "400" alt="" align=center />
复用apache-hive-1.2.2-src sql源代码中解析模块org.apache.hadoop.hive.ql.parse，重写driver等代码。

通过antlr3插件 解析相应配置文件 XX.g 生成HiveLexer、HiveParser、XX.tokens、XX*Parser

<img src="https://github.com/cpf123/earthworm/blob/master/img/WX20200430-214912%402x.png" width = "300" height = "300" alt="" align=center />
