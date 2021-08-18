package com.elite.decoratorproxy.observer.mouseevent;

import java.lang.reflect.Method;

/**
 * @author: liyang
 * @time: 2021/8/18 13:46
 */
public class Event {
    //事件源,动作是谁触发的
    private Object source;
    //事件触发后通知谁
    private Object target;
    //回调
    private Method callback;
    //事件名称
    private String trigger;
    //触发事件
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event(Object source, Object target, Method callback, String trigger, long time) {
        this.source = source;
        this.target = target;
        this.callback = callback;
        this.trigger = trigger;
        this.time = time;
    }

    public Object getSource() {
        return source;
    }

    public Event setSource(Object source) {
        this.source = source;
        return this;
    }

    public Object getTarget() {
        return target;
    }

    public Event setTarget(Object target) {
        this.target = target;
        return this;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public Event setTrigger(String trigger) {
        this.trigger = trigger;
        return this;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Event{" +
                "source=" + source +
                ", target=" + target +
                ", callback=" + callback +
                ", trigger='" + trigger + '\'' +
                ", time=" + time +
                '}';
    }
}
