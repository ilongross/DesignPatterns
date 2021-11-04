package com.ilongross.patterns.gof.generative.singleton;

public class DemoSingle {
    public static void main(String[] args) {

        var myHolder1 = MyUseHolder.getInstance();
        var myHolder2 = MyUseHolder.getInstance();

        System.out.println(myHolder1);
        System.out.println(myHolder2);

    }
}
