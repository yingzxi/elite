package com.elite.singleton.lazy;

/**
 * 懒汉式
 * 优点:节省了内存
 * 缺点:线程安全问题
 *
 * 双重校验锁
 * 优点:性能高,线程安全
 * 缺点:代码可读性差
 * @author: liyang
 * @time: 2021/8/16 16:34
 */
public class LazySimplesingletion {

    //使用volatile解决指令重排序的问题
    private volatile static LazySimplesingletion instance;

    private LazySimplesingletion(){}

    public static LazySimplesingletion getInstance(){
        if (instance == null){
            instance = new LazySimplesingletion();
        }
        return instance;
    }

    /**
     * 双重校验锁
     * @return
     */
    public static LazySimplesingletion getDoubleLockInstance(){
        if (instance == null){
            synchronized (LazySimplesingletion.class) {
                if (instance == null) {
                    instance = new LazySimplesingletion();
                    //指令重排序的问题
                }
            }
        }

        return instance;
    }
}
