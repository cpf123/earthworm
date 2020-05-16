package com.sql.antlr3.hive.parse;

import com.sql.antlr3.hive.properties.DimTables;
import com.sql.antlr3.hive.properties.FactTables;
import com.sql.antlr3.hive.properties.Param;

import java.util.ArrayList;
import java.util.Arrays;

public class FactDim {
    /**
     * Fact---Fact
     */

    public int DoubleFact(StringBuilder sb) {
        int flag = 0;
        String[] strings = sb.toString().split("\\s");
        for (String s : strings) {
            if (!s.isEmpty()) {
                String substring = s.substring(s.indexOf(':') + 1);
                String s1 = substring.substring(0, substring.indexOf("|=|"));
                String s2 = substring.substring(substring.indexOf("|=|") + 3);
                String[] facttables = new FactTables().value();

                if (s1.contains(".") && s1.substring(0, 3).equals(Param.FACT.value()) && s2.contains(".") && s2.substring(0, 3).equals(Param.FACT.value())) {
                    flag += 1;
                } else if (!s1.contains(".") && s2.contains(".") && s2.substring(0, 3).equals(Param.FACT.value())) {
                    for (String facttable : facttables) {
                        if (s1.equals(facttable)) {
                            flag += 1;
                            break;
                        }
                    }
                } else if (!s2.contains(".") && s1.contains(".") && s1.substring(0, 3).equals(Param.FACT.value())) {
                    for (String facttable : facttables) {
                        if (s2.equals(facttable)) {
                            flag += 1;
                            break;
                        }
                    }
                } else if (s1.contains(".") && s2.contains(".")) {
                    for (String one : facttables) {
                        for (String two : facttables) {
                            if (s1.substring(s1.indexOf('.') + 1).equals(one) && s2.substring(s2.indexOf('.') + 1).equals(two)) {

                                flag += 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        return flag;
    }

    /**
     * Fact---Dim
     * Dim---Fact
     */
//    public int FactDim(StringBuilder sb) {
//
//        int flag = 0;
//        String[] strings = sb.toString().split(" ");
//        for (String s : strings) {
//            if (s != null) {
//                String substring = s.substring(s.charAt(':'));
//                String[] split = substring.split("|=|");
//                ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(split));
//                String s1 = arrayList.get(0);
//                String s2 = arrayList.get(1);
//                String[] dimtables = new DimTables().value();
//
//                if (s1.contains(".") && s1.substring(0, 2).equals(Param.FACT.value()) && s2.contains(".") && s2.substring(0, 2).equals(Param.DIM.value())) {
//                    flag = 1;
//                    break;
//
//                }else if(s1.contains(".") && s1.substring(0, 2).equals(Param.DIM.value()) && s2.contains(".") && s2.substring(0, 2).equals(Param.FACT.value())) {
//                    flag = 1;
//                    break;
//                }
//                else if (!s1.contains(".") && s2.contains(".") && s2.substring(0, 2).equals(Param.FACT.value())) {
//                    for (String facttable : dimtables) {
//                        if (s1.equals(facttable)) {
//                            flag = 1;
//                            break;
//                        }
//                    }
//                } else if (!s2.contains(".") && s1.contains(".") && s1.substring(0, 2).equals(Param.FACT.value())) {
//                    for (String facttable : dimtables) {
//                        if (s2.equals(facttable)) {
//                            flag = 1;
//                            break;
//                        }
//                    }
//                }
//            }
//        }
//
//        return flag;
//    }

    /**
     * Dim---Dim
     *
     * @param sb
     * @return
     */
//    public int DoubleDim(StringBuilder sb) {
//
//        int flag = 0;
//        if (s1.equals(Param.FACT) && s2.equals(Param.DIM)) {
//            flag = 1;
//        } else if (s1.equals(Param.DIM) && s2.equals(Param.FACT)) {
//            flag = 1;
//        }
//        return flag;
//    }
}
