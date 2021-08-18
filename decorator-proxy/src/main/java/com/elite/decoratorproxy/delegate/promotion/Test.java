package com.elite.decoratorproxy.delegate.promotion;

/**
 * @author: liyang
 * @time: 2021/8/17 16:48
 */
public class Test {

    public static void main(String[] args) {
        String promotionKey = "COUPON";
        IPromotionStrategy strategy = PromotionSrategyFactory.getPromotionStratogy(promotionKey);
        strategy.doPromotion();
    }
}
