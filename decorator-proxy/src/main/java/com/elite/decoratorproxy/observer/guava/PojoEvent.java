package com.elite.decoratorproxy.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: liyang
 * @time: 2021/8/18 13:35
 */
public class PojoEvent {

    @Subscribe
    public void observer(Pojo pojo) {
        System.out.println("执行observere,参数为:" + pojo.toString());
    }
}
