package com.gupao.elite.design.dependenvyinversion;

/**
 * @author: liyang
 * @time: 2021/8/16 11:15
 */
public class Ly implements ICourse{

    public void study(ICourse courses){
        courses.study();
    }

    private ICourse course;

    public Ly(ICourse course) {
        this.course = course;
    }

    public Ly() {
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }

    public void study(){
        course.study();
    }
}
