package com.elite.decoratorproxy.observer.mouseevent;

/**
 * 观察者
 * @author: liyang
 * @time: 2021/8/18 13:46
 */
public class MouseEventCallback {

    //回调
    public void onClick(Event e){
        System.out.println("触发鼠标单击事件");
    }
}
