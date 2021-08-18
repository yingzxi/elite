package com.elite.decoratorproxy.delegate.pay;

/**
 * @author: liyang
 * @time: 2021/8/17 17:04
 */
public class JDPay extends Payment{
    @Override
    protected double queryBalance(String uid) {
        return 0;
    }

    @Override
    protected String getName() {
        return "京东白条";
    }
}
