package com.sql.antlr3.hive.parse;

import com.sql.antlr3.hive.properties.Param;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        String sqlstring = "";
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, String> tmpmap = new HashMap<>();
        try {
//				hsql = new String(Files.readAllBytes(Paths.get(args[0])));
            Scanner in = null;
            try {
//            BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//            String s = br.toString();
                in = new Scanner(System.in);
                System.out.println("SQL:");
                StringBuilder stringBuilder = new StringBuilder();

                while (in.hasNext()) {
                    String str = in.nextLine();
                    if (str.endsWith(";")) {
                        stringBuilder.append(str).append("\n");
                        break;
                    } else {
                        stringBuilder.append(str).append("\n");
                    }
                }
                sqlstring = stringBuilder.toString();
                System.out.println(sqlstring);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                assert in != null;
                in.close();
            }

            String[] hsqls = sqlstring.split(";");
            for (String s : hsqls) {
                ParseDriver pd = new ParseDriver();
                if (s.trim().equals("")) {
                } else if (s.trim().toLowerCase().startsWith("set ")) {
                    // to do
                } else {
                    HashMap<String, Integer> hashMap = pd.parse(s, map, tmpmap, new StringBuilder());

                    for (String a : hashMap.keySet()) {
                        System.out.println(a + " " + hashMap.get(a));
                    }

                    float funcanalysis = new FuncAnalysis().funcanalysis(hashMap);
                    if (funcanalysis > 0.5) {
                        new Runon_line().runon_line_hive(sqlstring);
                    } else {
                        new Runon_line().runon_line_spark(sqlstring);
                    }

                }
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }


}
