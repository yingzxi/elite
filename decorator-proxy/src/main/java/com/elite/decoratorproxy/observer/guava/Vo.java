package com.elite.decoratorproxy.observer.guava;

/**
 * @author: liyang
 * @time: 2021/8/18 13:38
 */
public class Vo {

    private String name;

    public Vo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vo{" +
                "name='" + name + '\'' +
                '}';
    }
}
