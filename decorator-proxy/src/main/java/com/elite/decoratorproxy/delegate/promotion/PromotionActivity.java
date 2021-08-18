package com.elite.decoratorproxy.delegate.promotion;

/**
 * @author: liyang
 * @time: 2021/8/17 16:48
 */
public class PromotionActivity {
    private IPromotionStrategy strategy;

    public PromotionActivity(IPromotionStrategy strategy) {
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }
}
