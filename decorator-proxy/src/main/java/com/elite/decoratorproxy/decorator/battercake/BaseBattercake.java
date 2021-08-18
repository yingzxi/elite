package com.elite.decoratorproxy.decorator.battercake;

/**
 * @author: liyang
 * @time: 2021/8/17 10:59
 */
public class BaseBattercake extends Battercake{

    @Override
    protected String getMsg() {
        return "煎饼";
    }

    @Override
    protected int getPrice() {
        return 5;
    }

}
