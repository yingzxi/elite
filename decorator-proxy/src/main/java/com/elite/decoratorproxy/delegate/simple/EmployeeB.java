package com.elite.decoratorproxy.delegate.simple;

/**
 * @author: liyang
 * @time: 2021/8/17 15:53
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String task) {
        System.out.println("python");
    }
}
