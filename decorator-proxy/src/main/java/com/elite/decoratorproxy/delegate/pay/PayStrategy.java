package com.elite.decoratorproxy.delegate.pay;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liyang
 * @time: 2021/8/17 17:05
 */
public class PayStrategy {
    public static final  String ALI_PAY = "ali";
    public static final  String JD_PAY = "jd";

    private static Map<String,Payment> strategy = new HashMap<>();

    static {
        strategy.put(ALI_PAY,new AliPay());
        strategy.put(JD_PAY,new JDPay());
    }

    public static Payment get(String payKey){
        if (!strategy.containsKey(payKey)){
            return strategy.get(ALI_PAY);
        }
        return strategy.get(payKey);
    }
}
