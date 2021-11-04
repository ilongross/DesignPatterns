package com.ilongross.patterns.microservices;

public class ReportService {

    private int errorChance = 0;

    public String makeReport(String data) throws Exception {
        var sb = new StringBuilder("Report from data ");
        sb.append(data);

        errorChance++;
        if(errorChance > 10) {
            throw new Exception("Some error");
        }

        return sb.toString();
    }

    public int getErrorChance() {
        return errorChance;
    }
}
