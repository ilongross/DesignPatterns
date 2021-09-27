package com.ilongross.patterns.structural.composite;

public class DemoComposite {
    public static void main(String[] args) {
        var corps = new Corps(2);
        var division1 = new Division(10);
        var division2 = new Division(15);
        var regiment1 = new Regiment(1000);
        var regiment2 = new Regiment(900);
        var regiment3 = new Regiment(1200);
        var regiment4 = new Regiment(1100);

        division1.addRegiment(regiment1);
        division1.addRegiment(regiment2);
        division2.addRegiment(regiment3);
        division2.addRegiment(regiment4);

        corps.addDivision(division1);
        corps.addDivision(division2);

        System.out.println(corps.countSoldiers());

    }
}
