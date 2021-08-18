package com.elite.decoratorproxy.decorator.battercake;

/**
 * @author: liyang
 * @time: 2021/8/17 10:55
 */
public class Test {
    public static void main(String[] args) {
        Battercake battercake;
        battercake = new BaseBattercake();
        System.out.println(battercake.getMsg() + " " + battercake.getPrice());
        battercake = new EggDecorator(battercake);
        System.out.println(battercake.getMsg() + " " + battercake.getPrice());
        battercake = new SauageDecorator(battercake);
        System.out.println(battercake.getMsg() + " " + battercake.getPrice());
    }
}
