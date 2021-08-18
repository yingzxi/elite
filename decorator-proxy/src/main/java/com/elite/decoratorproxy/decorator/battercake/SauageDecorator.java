package com.elite.decoratorproxy.decorator.battercake;

/**
 * @author: liyang
 * @time: 2021/8/17 10:59
 */
public class SauageDecorator extends BattercakeDecorator{

    private Battercake battercake;

    public SauageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个香肠";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 2;
    }

}
