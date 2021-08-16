package com.gupao.elite.design.dependenvyinversion;

/**
 * @author: liyang
 * @time: 2021/8/16 11:14
 */
public class PythonCourse implements ICourse {
    @Override
    public void study() {
        System.out.println("python");
    }
}
