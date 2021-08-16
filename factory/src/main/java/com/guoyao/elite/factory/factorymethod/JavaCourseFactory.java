package com.guoyao.elite.factory.factorymethod;

import com.guoyao.elite.factory.ICourse;
import com.guoyao.elite.factory.simplefactory.JavaCourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:16
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
