package com.elite.decoratorproxy.proxy.staticproxy;

/**
 * @author: liyang
 * @time: 2021/8/17 13:52
 */
public class Father{

    private Person person;

    public Father(Person person) {
        this.person = person;
    }

    public void findLove() {
        System.out.println("父亲物色");
        this.person.findLove();
        System.out.println("确定关系");
    }
}
