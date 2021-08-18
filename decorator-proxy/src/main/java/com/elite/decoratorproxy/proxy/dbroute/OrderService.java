package com.elite.decoratorproxy.proxy.dbroute;

/**
 * @author: liyang
 * @time: 2021/8/17 14:09
 */
public class OrderService implements IOrderService{
    @Override
    public int createOrder(Order order) {
        System.out.println("原功能");
        return 0;
    }
}
