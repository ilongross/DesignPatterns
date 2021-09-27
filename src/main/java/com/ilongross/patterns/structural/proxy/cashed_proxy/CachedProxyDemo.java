package com.ilongross.patterns.structural.proxy.cashed_proxy;

import com.ilongross.patterns.structural.proxy.logged.Reporter;

public class CachedProxyDemo {

    private static Reporter reporter;

    public static void main(String[] args) throws InterruptedException {

        var search1 = new SearchImpl("Abracadabra");
        var search2 = new SearchWithCache(search1);

        System.out.println("1.1");
        System.out.println(search1.find("Abra"));
        System.out.println("1.2");
        System.out.println(search1.find("Abra"));

        System.out.println("2.1");
        System.out.println(search2.find("Abra"));
        System.out.println("2.1");
        System.out.println(search2.find("Abra"));


    }
}
