package com.guoyao.elite.factory.abstactfactory;

import com.guoyao.elite.factory.ICourse;
import com.guoyao.elite.factory.simplefactory.JavaCourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:37
 */
public class JavaCourseFactory implements ICourseFactory{
    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
