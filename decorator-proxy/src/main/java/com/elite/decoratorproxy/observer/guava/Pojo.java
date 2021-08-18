package com.elite.decoratorproxy.observer.guava;

/**
 * @author: liyang
 * @time: 2021/8/18 13:38
 */
public class Pojo {

    private String name;

    public Pojo(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                '}';
    }
}
