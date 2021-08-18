package com.elite.decoratorproxy.proxy.dynamicproxy.cglib;

/**
 * @author: liyang
 * @time: 2021/8/17 15:02
 */
public class CglibTest {

    public static void main(String[] args) {
        Customer obj = (Customer) new CGLibMeipo().getInstance(Customer.class);
        obj.findLove();
    }
}
