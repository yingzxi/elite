package com.elite.decoratorproxy.proxy.staticproxy;

/**
 * @author: liyang
 * @time: 2021/8/17 13:55
 */
public class FatherProxyTest {

    public static void main(String[] args) {
        //静态代理, 将特定的值传进去
        //典型的是三层架构
        Father father = new Father(new Son());
        father.findLove();
    }
}
