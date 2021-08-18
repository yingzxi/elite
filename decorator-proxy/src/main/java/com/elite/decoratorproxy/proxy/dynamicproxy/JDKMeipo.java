package com.elite.decoratorproxy.proxy.dynamicproxy;

import com.elite.decoratorproxy.proxy.staticproxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: liyang
 * @time: 2021/8/17 14:14
 */
public class JDKMeipo implements InvocationHandler {

    private Person target;

    public Object getInstance(Person target){
        this.target = target;
        Class clazz = target.getClass();
        //使用接口代理
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        Object obj = method.invoke(this.target,args);
        after();
        return obj;
    }


    private void before(){
        System.out.println("之前");
    }

    private void after(){
        System.out.println("之后");
    }
}
