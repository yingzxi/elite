package com.elite.decoratorproxy.proxy.dynamicproxy;

import com.elite.decoratorproxy.proxy.staticproxy.Person;

/**
 * @author: liyang
 * @time: 2021/8/17 14:17
 */
public class JDKProxyTest {

    public static void main(String[] args) {
        try {
            Person person = (Person) new JDKMeipo().getInstance(new Girl());
            person.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
