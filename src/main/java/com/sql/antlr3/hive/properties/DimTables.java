package com.sql.antlr3.hive.properties;

public class DimTables {
    String[] dimtables={
            "bdl_qiye_jdb_company_info",
            "bdl_qiyefriend_staff_change_relation_log"
    };
    public String[] value() {
        return this.dimtables;
    }
}
