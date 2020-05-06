package com.sql.antlr3.hive.parse;

import com.sql.antlr3.hive.properties.Param;

import java.io.IOException;
import java.util.HashMap;

public class FuncAnalysis {

    /**
     * io 密集型
     * 事实表 join  DoubleFact
     * 表数量多     TABNAME_COUNT
     * <p>
     * cpu 密集型
     * 聚合算子多     Aggregate_COUNT
     * 子查询多--mr多 SUBQUERY_COUNT
     *
     * @param hashMap
     * @param sqlstring
     * @return
     */
    public void funcanalysis(HashMap<String, Integer> hashMap, String sqlstring) throws IOException, InterruptedException {
//        sqlstring = sqlstring + ";";
        Integer DoubleFact = hashMap.getOrDefault(Param.DoubleFact.value(), 0);
        Integer TABNAME_COUNT = hashMap.getOrDefault(Param.TABNAME_COUNT.value(), 0);
        Integer Aggregate_COUNT = hashMap.getOrDefault(Param.Aggregate_COUNT.value(), 0);
        Integer SUBQUERY_COUNT = hashMap.getOrDefault(Param.SUBQUERY_COUNT.value(), 0);

        // 权重 s 1-10
        float IODense = 10 * DoubleFact + 2 * TABNAME_COUNT;
        IODense = IODense / (10 + 2);
        float CPUDense = 10 * Aggregate_COUNT + 3 * SUBQUERY_COUNT;
        CPUDense = CPUDense / (10 + 3);

        float funcanalysis = IODense / (IODense + CPUDense);

        if (funcanalysis > 0.5 && DoubleFact > 2 && TABNAME_COUNT > 5) {
            new Runon_line().runon_hive(sqlstring);
            System.out.println(funcanalysis);
        } else if (funcanalysis < 0.5 && Aggregate_COUNT > 5 && SUBQUERY_COUNT > 8) {
            new Runon_line().runon_spark(sqlstring);
            System.out.println(funcanalysis);
        } else {
            new Runon_line().runon_impala(sqlstring);
        }

// test
//        if (funcanalysis > 0.5) {
//            System.out.println(sqlstring);
//            System.out.println(funcanalysis);
//            new Runon_line().runon_hive(sqlstring);
//        } else {
//            System.out.println(sqlstring);
//            System.out.println(funcanalysis);
//            new Runon_line().runon_spark(sqlstring);
//        }


    }


}
