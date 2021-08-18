package com.elite.decoratorproxy.observer.guava;

import com.google.common.eventbus.EventBus;

/**
 * @author: liyang
 * @time: 2021/8/18 13:36
 */
public class Test {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        PojoEvent guavaEvent = new PojoEvent();
        eventBus.register(guavaEvent);
        VoEvent voEvent = new VoEvent();
        eventBus.register(voEvent);
        eventBus.post(new Pojo("pojo"));
        eventBus.post(new Vo("vo"));
    }
}
