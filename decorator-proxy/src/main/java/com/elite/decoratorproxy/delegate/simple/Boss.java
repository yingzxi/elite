package com.elite.decoratorproxy.delegate.simple;

/**
 * @author: liyang
 * @time: 2021/8/17 15:54
 */
public class Boss {
    public void command(String task,Leader leader){
        leader.doing(task);
    }
}
