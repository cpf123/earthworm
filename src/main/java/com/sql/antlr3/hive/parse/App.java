package com.sql.antlr3.hive.parse;

import java.util.Scanner;


public class App {

    public static void main(String[] args) {

        String sqlstring = "";
        try {
//				hsql = new String(Files.readAllBytes(Paths.get(args[0])));
            Scanner in = null;
            try {
//            BufferedReader br = new BufferedReader(new InputStreamReader( System.in ) );
//            String s = br.toString();
                in = new Scanner(System.in);
                System.out.println("Hivesql:");
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
//                System.out.println(sqlstring);

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
//                    System.out.println(s.trim() + ";\n");
                } else {
                    System.out.println(pd.Format(s, new StringBuilder()).toString() + ";\n");
                }
            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }


}
