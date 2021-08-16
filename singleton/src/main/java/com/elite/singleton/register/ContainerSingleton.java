package com.elite.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/*
 * 注册式单例
 * 使用的时候创建
 * @author: liyang
 * @time: 2021/8/16 17:40
 */
public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getInstance(String className){
        Object instance = null;
        if (ioc.containsKey(className)){
            try {
                instance = Class.forName(className).newInstance();
                ioc.put(className,instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return instance;
        }else{
            return ioc.get(className);
        }
    }
}
