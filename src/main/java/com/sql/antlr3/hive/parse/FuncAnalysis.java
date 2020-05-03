package com.sql.antlr3.hive.parse;

import com.sql.antlr3.hive.properties.Param;

import java.util.HashMap;

public class FuncAnalysis {

    public float funcanalysis(HashMap<String, Integer> hashMap) {

        Integer DoubleFact = hashMap.getOrDefault(Param.DoubleFact.value(), 0);
        Integer TABNAME_COUNT = hashMap.getOrDefault(Param.TABNAME_COUNT.value(), 0);
        Integer Aggregate_COUNT = hashMap.getOrDefault(Param.Aggregate_COUNT.value(), 0);
        Integer SUBQUERY_COUNT = hashMap.getOrDefault(Param.SUBQUERY_COUNT.value(), 0);

        // 权重 s 1-10
        float IODense = 10 * DoubleFact + 2 * TABNAME_COUNT;
        IODense = IODense / (10 + 2);
        float CPUDense = 10 * Aggregate_COUNT + 3 * SUBQUERY_COUNT;
        CPUDense = CPUDense / (10 + 3);
        float func = IODense / (IODense + CPUDense);
        return func;

    }

}
