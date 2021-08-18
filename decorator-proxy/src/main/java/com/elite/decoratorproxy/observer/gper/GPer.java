package com.elite.decoratorproxy.observer.gper;

import java.util.Observable;

/**
 * @author: liyang
 * @time: 2021/8/18 13:27
 */
public class GPer extends Observable {
    private String name = "GP生态圈";

    private static final GPer gper = new GPer();

    private GPer(){}

    public static GPer getInstance(){
        return gper;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + " " + question.getConter());
        setChanged();
        notifyObservers(question);
    }
}
