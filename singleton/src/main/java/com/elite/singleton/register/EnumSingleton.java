package com.elite.singleton.register;

import java.lang.reflect.Constructor;

/**
 * 注册式单例
 * @author: liyang
 * @time: 2021/8/16 17:27
 */
public enum EnumSingleton {

    INSTANCE;

    public Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
//        EnumSingleton instsance = EnumSingleton.getInstance();
//        instsance.setData(new Object());
        try {
            Class clazz = EnumSingleton.class;
            Constructor c = clazz.getDeclaredConstructor();
            c.setAccessible(true);
            Object o = c.newInstance();
            System.out.println(o);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
