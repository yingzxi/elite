package com.elite.decoratorproxy.observer.gper;

/**
 * @author: liyang
 * @time: 2021/8/18 13:32
 */
public class Test {

    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("tom");
        Teacher jack = new Teacher("jack");
        gper.addObserver(tom);
        gper.addObserver(jack);

        Question question = new Question("张三","观察者模式");
        gper.publishQuestion(question);
    }
}
