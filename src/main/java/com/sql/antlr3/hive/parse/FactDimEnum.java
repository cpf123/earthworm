package com.sql.antlr3.hive.parse;

import com.sql.antlr3.hive.properties.Param;

public class FactDimEnum {
    /**
     * Fact---Fact
     */

    public boolean DoubleFact(String s1, String s2) {
        boolean flag = false;
        if (s1.equals(Param.FACT) && s2.equals(Param.FACT)) {
            flag = true;
        }
        return flag;
    }

    /**
     * Fact---Dim
     * Dim---Fact
     */
    public boolean FactDim(String s1, String s2) {
        boolean flag = false;
        if (s1.equals(Param.FACT) && s2.equals(Param.DIM)) {
            flag = true;
        } else if (s1.equals(Param.DIM) && s2.equals(Param.FACT)) {
            flag = true;
        }
        return flag;
    }
}
