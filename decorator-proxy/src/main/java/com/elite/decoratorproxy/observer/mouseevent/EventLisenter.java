package com.elite.decoratorproxy.observer.mouseevent;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * 被观察者的抽象
 * @author: liyang
 * @time: 2021/8/18 13:45
 */
public class EventLisenter {

    private Map<String,Event> eventMap = new HashMap<>();

    //注册事件
    public void addLisenter(String eventType, Object target, Method callback){
        eventMap.put(eventType,new Event(target,callback));
    }
    //不传回调使用约定的方法
    public void addLisenter(String eventType, Object target){
        try {
            this.addLisenter(eventType,target,target.getClass().getMethod("on" + toUpperFirstCase(eventType),Event.class));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Object toUpperFirstCase(String eventType) {
        char[] chars = eventType.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

    //执行回调方法
    private void trigger(Event event) {
        event.setSource(this);
        event.setTime(System.currentTimeMillis());
        if (event.getCallback() != null){
            try {
                event.getCallback().invoke(event.getTarget(),event);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    protected void trigger(String trigger){
        //判断是否有回调
        if (!eventMap.containsKey(trigger)){return;}
        trigger(eventMap.get(trigger).setTrigger(trigger));
    }
}
