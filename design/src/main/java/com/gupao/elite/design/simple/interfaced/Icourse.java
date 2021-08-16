package com.gupao.elite.design.simple.interfaced;

/**
 * @author: liyang
 * @time: 2021/8/16 11:29
 */
public interface Icourse {
    //获取基本信息
    String getCourseName();
    //获取视频流
    byte[] getCourseVideo();
    //学习课程
    void studyCourse();
    //退款
    void refundCourse();
}
