package com.gupao.elite.design.simple;

/**
 * 单一职责
 * @author: liyang
 * @time: 2021/8/16 11:26
 */
public class SrpTest {
    public static void main(String[] args) {
        Course course = new Course();
        course.study("直播课");
        course.study("录播课");
    }
}
