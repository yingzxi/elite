package com.gupao.elite.design.dependenvyinversion;

/**
 * 依赖倒置原则
 * @author: liyang
 * @time: 2021/8/16 11:16
 */
public class DipTest {

    public static void main(String[] args) {
        //----依赖注入的原型,依赖抽象
//        Ly ly = new Ly();
//        ly.study(new JavaCourse());
//        ly.study(new PythonCourse());

        //依赖注入
//        Ly ly = new Ly(new JavaCourse());
//        ly.study();

        //使用set方式
        Ly ly = new Ly();
        ly.setCourse(new JavaCourse());
        ly.study();
    }
}
