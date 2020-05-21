package com.sql.antlr3.hive.properties;



public class FactTables {
    String[] facttables={
            "bdl_qiye_product",
            "bdl_rrxdebt_debt"
    };
    // 优化：调取hive metastore 同步线上表校验
    public String[] value() {
        return this.facttables;
    }
}
