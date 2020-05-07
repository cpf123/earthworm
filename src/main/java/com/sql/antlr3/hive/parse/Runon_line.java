package com.sql.antlr3.hive.parse;

import java.io.*;

public class Runon_line {

    public void runon_hive(String sqlstring) {
        String hivesql = "hive -e \"\n"
                + sqlstring
                + "\"";
        exec(hivesql);
    }

    public void runon_spark(String sqlstring) {
        String sparksql = "spark-sql -e \"\n"
                + sqlstring
                + "\"";
        exec(sparksql);
    }

    //    impala-shell -i 100.106.35.7:21000 -u impala_ploan -B -q "invalidate metadata dw_ads.ads_fox_org_daily_detail;"
    public void runon_impala(String sqlstring) {
        String impalasql = "impala-shell -q \"\n"
                + sqlstring
                + "\"";
        exec(impalasql);
    }

    public void exec(String exec) {
        try {
            ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", exec);

            pb.redirectErrorStream(true);
            /**
             * 方法告诉此进程生成器是否合并标准错误和标准输出。如果此属性为true，则通过子进程所产生的任何错误输出随后由该对象的start()方法启动将与标准输出合并，
             * 这样既可以用Process.getInputStream()方法来读取。此使得更容易与对应的输出相关的错误消息。
             * 初始值是false
             */
            Process ps = pb.start();

            InputStream is = ps.getErrorStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            String line;
            while ((line = br.readLine()) != null) {
                System.err.println(line);
            }

            InputStream is1 = ps.getInputStream();
            BufferedReader br1 = new BufferedReader(new InputStreamReader(is1));

            String line1;
            while ((line1 = br1.readLine()) != null) {
                System.out.println(line1);
            }
           //等待子进程完成再往下执行
            ps.waitFor();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

