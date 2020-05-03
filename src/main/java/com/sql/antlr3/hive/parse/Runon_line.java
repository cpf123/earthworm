package com.sql.antlr3.hive.parse;

import jodd.io.StreamGobbler;

import java.io.IOException;
import java.util.concurrent.Executors;

public class Runon_line {
    public void runon_line_hive(String sqlstring) throws IOException, InterruptedException {
        String hivesql = "hive -e \"" + sqlstring + "\"";
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("sh", "-c", hivesql);
        Process process = processBuilder.start();
        StreamGobbler streamGobbler =
                new StreamGobbler(process.getInputStream(), "STDOUT");
        Executors.newSingleThreadExecutor().submit(streamGobbler);
        int exitCode = process.waitFor();
        assert exitCode == 0;
    }

    public void runon_line_spark(String sqlstring) throws IOException, InterruptedException {
        String hivesql = "spark-sql -e \"" + sqlstring + "\"";
        ProcessBuilder processBuilder = new ProcessBuilder();
        processBuilder.command("sh", "-c", hivesql);
        Process process = processBuilder.start();
        StreamGobbler streamGobbler =
                new StreamGobbler(process.getInputStream(), "STDOUT");
        Executors.newSingleThreadExecutor().submit(streamGobbler);
        int exitCode = process.waitFor();
        assert exitCode == 0;
    }

}

