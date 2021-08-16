package com.guoyao.elite.factory.simplefactory;

import com.guoyao.elite.factory.ICourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:02
 */
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("java");
    }
}
