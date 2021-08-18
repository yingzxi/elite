package com.elite.decoratorproxy.decorator.battercake;

/**
 * @author: liyang
 * @time: 2021/8/17 10:59
 */
public class BattercakeDecorator extends Battercake{

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    @Override
    protected String getMsg() {
        return this.battercake.getMsg();
    }

    @Override
    protected int getPrice() {
        return this.battercake.getPrice();
    }

}
