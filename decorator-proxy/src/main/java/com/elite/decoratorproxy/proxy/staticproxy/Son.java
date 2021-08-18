package com.elite.decoratorproxy.proxy.staticproxy;

/**
 * @author: liyang
 * @time: 2021/8/17 13:52
 */
public class Son implements Person{
    @Override
    public void findLove() {
        System.out.println("儿子");
    }
}
