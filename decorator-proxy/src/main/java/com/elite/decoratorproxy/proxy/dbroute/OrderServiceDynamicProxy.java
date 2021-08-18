package com.elite.decoratorproxy.proxy.dbroute;

import com.elite.decoratorproxy.proxy.dbroute.db.DynamicDataSourceEntity;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: liyang
 * @time: 2021/8/17 14:05
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private SimpleDateFormat simple = new SimpleDateFormat("yyyy");

    Object proxyObj;

    public Object getInstance(Object proxyObj) {
        this.proxyObj = proxyObj;
        Class clazz = proxyObj.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(args[0]);
        Object obj = method.invoke(proxyObj,args);
        after();
        return obj;
    }

    private void after() {
        //还原
        System.out.println("proxy restore");
        DynamicDataSourceEntity.restore();
    }

    private void before(Object target) {
        //切换
        try {
            System.out.println("proxy before method");
            Long time = (Long) target.getClass().getMethod("getCreateTime").invoke(target);
            Integer dbRouter = Integer.valueOf(simple.format(new Date(time)));
            System.out.println("动态代理类自动分配到DB_" + dbRouter + "数据源");
            DynamicDataSourceEntity.set(dbRouter);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
