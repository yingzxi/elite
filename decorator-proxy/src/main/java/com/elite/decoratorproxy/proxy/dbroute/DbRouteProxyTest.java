package com.elite.decoratorproxy.proxy.dbroute;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;

/**
 * @author: liyang
 * @time: 2021/8/17 14:08
 */
public class DbRouteProxyTest {

    public static void main(String[] args) {
        Order order = new Order();
        order.setCreateTime(new Date().getTime());
        //使用代理类,功能增强(自动切换数据源)
//        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        IOrderService orderService = (IOrderService) new OrderServiceDynamicProxy().getInstance(new OrderService());
        orderService.createOrder(order);
    }
}
