package com.guoyao.elite.factory.factorymethod;

/**
 * @author: liyang
 * @time: 2021/8/16 15:17
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();
    }
}
