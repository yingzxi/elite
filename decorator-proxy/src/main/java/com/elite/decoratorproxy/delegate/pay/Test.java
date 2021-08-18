package com.elite.decoratorproxy.delegate.pay;

import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author: liyang
 * @time: 2021/8/17 17:10
 */
public class Test {

    public static void main(String[] args) {
        Order order = new Order("1","206465",200);
        System.out.println(order.pay());
    }
}
