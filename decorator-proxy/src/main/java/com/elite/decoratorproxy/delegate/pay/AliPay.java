package com.elite.decoratorproxy.delegate.pay;

/**
 * @author: liyang
 * @time: 2021/8/17 17:03
 */
public class AliPay extends Payment{

    public String getName(){
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
