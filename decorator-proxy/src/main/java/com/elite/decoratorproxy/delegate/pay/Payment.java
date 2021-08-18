package com.elite.decoratorproxy.delegate.pay;

/**
 * @author: liyang
 * @time: 2021/8/17 16:59
 */
public abstract class Payment {

    //通用逻辑放到抽象类里 模板方法
    public MsgResult pay(String uid,double amount){
        //余额是否足够
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }
        return new MsgResult(200,"支付成功","支付" + amount);
    }

    protected abstract double queryBalance(String uid);

    protected abstract String getName();
}
