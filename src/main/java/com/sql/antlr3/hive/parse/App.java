package com.sql.antlr3.hive.parse;

/**
 * Hello world!
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
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
                System.out.println("DDL");
                StringBuilder stringBuilder = new StringBuilder();
                while (!in.hasNext(";")) {
                    String str = in.nextLine();
                    stringBuilder.append(str + "\n");
                }
                sqlstring = stringBuilder.toString();
                System.out.println(sqlstring);

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                in.close();
            }

            String[] hsqls = sqlstring.split(";");
            for (String s : hsqls) {
                FormatDriver pd = new FormatDriver();
                if (s.trim().equals("")) {
                } else if (s.trim().toLowerCase().startsWith("set ")) {
                    System.out.println(s.trim() + ";\n");
                } else {
                    System.out.println(pd.Format(s, new StringBuilder()).toString() + ";\n");
                }

            }

        } catch (ParseException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }

    }


	/*
	public static void main(String[] args) {

		try {




			String hsql = "";
			try {
				hsql = new String(Files.readAllBytes(Paths.get("./f.sql")));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			String[] hsqls = hsql.split(";");
			for (String s : hsqls) {

				FormatDriver pd = new FormatDriver();
				if (s.trim().equals("")) {

				}
				else if(s.trim().toLowerCase().startsWith("set ")) {
					System.out.println(s.trim() + ";\n");
				} else {
					System.out.println(pd.Format(s, new StringBuilder()).toString() + ";\n");
				}

			}

		} catch (whomm.hsqlformat.hive.parse.ParseException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			System.exit(1);
		}


	}*/


}
