package com.elite.decoratorproxy.proxy.dbroute.db;

/**
 * @author: liyang
 * @time: 2021/8/17 13:58
 */
public class DynamicDataSourceEntity {

    public final static String DEFAULE_SOURCE = null;

    private final static ThreadLocal<String> local = new ThreadLocal<>();

    private DynamicDataSourceEntity(){}

    public static String get(){return local.get();}

    public static void restore(){
        local.set(DEFAULE_SOURCE);
    }

    public static void set(String source){local.set(source);}

    public static void set(int year){local.set("DB_" + year);}
}
