package com.elite.decoratorproxy.delegate.promotion;

/**
 * @author: liyang
 * @time: 2021/8/17 16:47
 */
public class CashbackStrategy implements IPromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("返现");
    }
}
