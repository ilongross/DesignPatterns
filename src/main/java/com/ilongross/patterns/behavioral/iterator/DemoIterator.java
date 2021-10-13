package com.ilongross.patterns.behavioral.iterator;

import java.util.*;

public class DemoIterator {
    public static void main(String[] args) {

        var strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        strings.forEach(System.out::println);

        var remarks = new HashSet<String>();
        remarks.add("First");
        remarks.add("Second");
        var report = new Report("Header", "Important", "Ilon",
                Arrays.asList("One", "Two", "Three"), "All good", remarks);

        var reportIterator = new ReportIterator(report);
        while(reportIterator.hasNext()) {
            System.out.println(reportIterator.next());
        }

    }
}
