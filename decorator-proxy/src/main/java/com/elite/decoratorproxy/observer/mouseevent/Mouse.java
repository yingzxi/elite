package com.elite.decoratorproxy.observer.mouseevent;

/**
 * 被观察者
 * @author: liyang
 * @time: 2021/8/18 13:46
 */
public class Mouse extends EventLisenter{

    //触发
    public void click(){
        System.out.println("调用单机方法");
        this.trigger(MouseEventType.ON_CLICK);
    }
}
