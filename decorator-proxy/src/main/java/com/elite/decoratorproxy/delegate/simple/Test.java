package com.elite.decoratorproxy.delegate.simple;

/**
 * @author: liyang
 * @time: 2021/8/17 15:56
 */
public class Test {

    public static void main(String[] args) {
        new Boss().command("java",new Leader());
    }
}
