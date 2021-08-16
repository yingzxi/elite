package com.guoyao.elite.factory.simplefactory;

import com.guoyao.elite.factory.ICourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:02
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
//        ICourse course = new JavaCourse();
//        course.record();

//        ICourse course = CourseFactory.create("java");
//        course.record();

//        ICourse course = CourseFactory.create("com.guoyao.elite.factory.simplefactory.JavaCourse");
//        course.record();
        ICourse course = CourseFactory.create(JavaCourse.class);
        course.record();
    }
}
