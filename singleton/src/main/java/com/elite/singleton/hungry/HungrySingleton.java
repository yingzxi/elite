package com.elite.singleton.hungry;

/**
 * 饿汉式单例
 * @author: liyang
 * @time: 2021/8/16 15:53
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){return hungrySingleton;}
}
