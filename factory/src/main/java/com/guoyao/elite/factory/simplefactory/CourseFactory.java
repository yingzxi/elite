package com.guoyao.elite.factory.simplefactory;

import com.guoyao.elite.factory.ICourse;

/**
 * @author: liyang
 * @time: 2021/8/16 15:03
 */
public class CourseFactory {

    /*public static ICourse create(String name){
        if ("java".equals(name)){
            return new JavaCourse();
        }
        return null;
    }*/

    /*public static ICourse create(String className){
        try {
            if (null != className && !"".equals(className)){
                return (ICourse) Class.forName(className).newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }*/

    public static ICourse create(Class clazz){
        try {
            if (null != clazz){
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
