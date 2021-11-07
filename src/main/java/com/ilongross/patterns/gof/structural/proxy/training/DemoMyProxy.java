package com.ilongross.patterns.gof.structural.proxy.training;

public class DemoMyProxy {
    public static void main(String[] args) {
        var access = new StandardAccess();
        var proxyAccess = new AccessProxyCache(access);

        for (int i = 0; i < 10; i++) {
            System.out.println(proxyAccess.getActualToken());
        }


    }
}
