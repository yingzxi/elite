package com.gupao.elite.design.simple.interfaced;

/**
 * @author: liyang
 * @time: 2021/8/16 11:31
 */
public class CourseImpl implements ICourseInfo,ICourseManager{
    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }

    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }
}
