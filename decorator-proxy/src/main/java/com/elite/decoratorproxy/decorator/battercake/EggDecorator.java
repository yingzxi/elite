package com.elite.decoratorproxy.decorator.battercake;

/**
 * @author: liyang
 * @time: 2021/8/17 10:59
 */
public class EggDecorator extends BattercakeDecorator{

    private Battercake battercake;

    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "1个鸡蛋";
    }

    @Override
    protected int getPrice() {
        return super.getPrice() + 1;
    }

}
