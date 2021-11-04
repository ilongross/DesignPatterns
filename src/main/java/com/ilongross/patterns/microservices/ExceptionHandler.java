package com.ilongross.patterns.microservices;

import java.util.HashMap;
import java.util.Map;

public class ExceptionHandler {

    private static Map<String, String> errorStacktraceMap = new HashMap<>();

    public static String makeProblemRequest(ReportService service, String data) {
        try {
            return service.makeReport(data);
        } catch (Exception e) {
            String errorKey = System.currentTimeMillis() + ":"  + e.getMessage();

            var stacktraceBuilder = new StringBuilder();
            for (StackTraceElement element: e.getStackTrace()) {
                stacktraceBuilder.append(element.toString());
            }

            errorStacktraceMap.put(errorKey, stacktraceBuilder.toString());

            if(errorStacktraceMap.size() % 20 == 0) {
                printErrorMap();
            }

            return "problem answer (something went wrong)";
        }
    }

    private static void printErrorMap() {
        for (String key : errorStacktraceMap.keySet()) {
            System.out.print(key);
            System.out.println(":");
            System.out.println(errorStacktraceMap.get(key));
        }
    }

}
