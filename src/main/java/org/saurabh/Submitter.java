package org.saurabh;

import java.io.IOException;

/**
 * Created by saurabh on 4/15/2017.
 */
public class Submitter {
    public static void main(String[] args) {
        StringBuilder stringbuilder  = new StringBuilder();
        stringbuilder.append("spark-submit")
                .append(" --class com.locationguru.smartgeo.job.Job")
                .append(" --master spark://127.0.1.1:7077")
                .append(" --deploy-mode cluster")
//                .append(" --files 100")
                .append(" /path/to/examples.jar <file-path> ");
        ProcessBuilder processBuilder = new ProcessBuilder(stringbuilder.toString());
        try {
            Process p = processBuilder.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
