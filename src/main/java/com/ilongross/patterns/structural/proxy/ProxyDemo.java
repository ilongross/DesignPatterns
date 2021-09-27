package com.ilongross.patterns.structural.proxy;

import com.ilongross.patterns.structural.proxy.base_proxy.Cash;
import com.ilongross.patterns.structural.proxy.base_proxy.CreditCardAsProxy;

public class ProxyDemo {
    public static void main(String[] args) throws Exception {

        var cash1 = new Cash(1000F);
        var cash2 = new Cash(2000F);

        var creditCard = new CreditCardAsProxy();
        creditCard.setCash(cash1);
        creditCard.makePayment(1000F);
        System.out.println(cash1);
        System.out.println(cash2);

        creditCard.setCash(cash2);
        creditCard.makePayment(1000F);
        System.out.println(cash1);
        System.out.println(cash2);

    }
}
