package com.gupao.elite.design.simple.interfaced;

/**
 * 付费课程
 * @author: liyang
 * @time: 2021/8/16 11:31
 */
public interface ICourseManager {
    //获取视频流
    byte[] getCourseVideo();
    //学习课程
    void studyCourse();
    //退款
    void refundCourse();
}
