package com.elite.decoratorproxy.proxy.dynamicproxy;

import com.elite.decoratorproxy.proxy.staticproxy.Person;

/**
 * @author: liyang
 * @time: 2021/8/17 14:14
 */
public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("女生");
    }
}
