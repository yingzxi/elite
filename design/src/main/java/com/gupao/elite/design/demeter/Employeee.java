package com.gupao.elite.design.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liyang
 * @time: 2021/8/16 11:47
 */
public class Employeee {
    public void checkNumberOfCourses(){
        List<Course> courseList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("目前已发布的课程数量为:" + courseList.size());
    }
}
