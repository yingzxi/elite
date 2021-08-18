package com.elite.decoratorproxy.observer.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @author: liyang
 * @time: 2021/8/18 13:35
 */
public class VoEvent {

    @Subscribe
    public void observer(Object arg){
        if (arg instanceof Vo)
            System.out.println("执行observere,参数为:" + arg.toString());
    }
}
