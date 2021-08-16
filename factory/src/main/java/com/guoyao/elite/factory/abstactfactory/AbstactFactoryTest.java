package com.guoyao.elite.factory.abstactfactory;

/**
 * 抽象工厂
 * 抽象工厂定义了需要创建的产品
 * 在子类创建之前就已经确定需要创建的类
 * @author: liyang
 * @time: 2021/8/16 15:38
 */
public class AbstactFactoryTest {
    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.createCourse().record();
        factory.createNote();
        factory.createVideo();
    }
}
