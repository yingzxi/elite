package com.elite.decoratorproxy.observer.mouseevent;

/**
 * @author: liyang
 * @time: 2021/8/18 14:01
 */
public class Test {

    public static void main(String[] args) {
        MouseEventCallback callback = new MouseEventCallback();
        Mouse mouse = new Mouse();
        mouse.addLisenter(MouseEventType.ON_CLICK,callback);
        mouse.click();
    }
}
