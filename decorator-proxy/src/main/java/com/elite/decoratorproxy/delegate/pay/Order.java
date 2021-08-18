package com.elite.decoratorproxy.delegate.pay;

/**
 * @author: liyang
 * @time: 2021/8/17 17:05
 */
public class Order {

    private String uid;
    private String orderId;
    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(){
        return pay(PayStrategy.ALI_PAY);
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        return payment.pay(uid,amount);
    }
}
