package com.sql.antlr3.hive.properties;

public enum Param {
    FACT("DWD"),
    DIM("DIM");

    private final String param;
    Param(String param) {
        this.param=param;
    }
}


