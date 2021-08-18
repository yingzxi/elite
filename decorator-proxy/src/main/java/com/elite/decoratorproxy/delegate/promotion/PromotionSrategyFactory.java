package com.elite.decoratorproxy.delegate.promotion;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author: liyang
 * @time: 2021/8/17 16:50
 */
public class PromotionSrategyFactory {


    private static Map<String,IPromotionStrategy> map = new HashMap<String,IPromotionStrategy>();

    public PromotionSrategyFactory() {
    }

    static {
        map.put(PromotionKey.CASHBACK,new CashbackStrategy());
        map.put(PromotionKey.COUPON,new CouPonStrategy());
        map.put(PromotionKey.GROUP,new GroupStrategy());
    }

    private static final IPromotionStrategy EMPTY = new CouPonStrategy();

    public static IPromotionStrategy getPromotionStratogy(String promotionKey){
        IPromotionStrategy strategy = map.get(promotionKey);
        return strategy == null ? EMPTY : strategy;
    }

    private interface PromotionKey{
        String COUPON = "COUPON";
        String CASHBACK = "CASHBACK";
        String GROUP = "GROUP";
    }

    public static Set<String> getPromotionKeys(){
        return map.keySet();
    }
}
