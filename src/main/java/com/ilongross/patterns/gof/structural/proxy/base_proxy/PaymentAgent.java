package com.ilongross.patterns.gof.structural.proxy.base_proxy;

public interface PaymentAgent {
    float makePayment(float sum) throws Exception;
}
