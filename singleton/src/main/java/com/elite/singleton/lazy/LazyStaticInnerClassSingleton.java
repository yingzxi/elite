package com.elite.singleton.lazy;

/**
 * 内部类方式
 * 最开始加载LazyStaticInnerClassSingleton的时候,不会加载LazyHolder
 * 只有在调用的使用才会加载LazyHolder初始化
 * 优点:写法优雅,利用java本身语法特点,性能高,避免内存浪费
 * 缺点:能够被反射破坏
 * @author: liyang
 * @time: 2021/8/16 16:47
 */
public class LazyStaticInnerClassSingleton {

    private LazyStaticInnerClassSingleton(){
        if (LazyHolder.INSTANCE != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    private static LazyStaticInnerClassSingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    private static class LazyHolder{
        private static final LazyStaticInnerClassSingleton INSTANCE = new LazyStaticInnerClassSingleton();
    }
}
