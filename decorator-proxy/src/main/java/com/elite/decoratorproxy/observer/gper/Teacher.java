package com.elite.decoratorproxy.observer.gper;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: liyang
 * @time: 2021/8/18 13:30
 */
public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question) arg;
        System.out.println("-------------");
        System.out.println(name + " 老师,您收到" + question.getUserName()
                + "的一个问题");
    }
}
