package com.gupao.elite.design.openclose;

/**
 * 开闭原则
 * 对扩展开放,对修改关闭
 * @author: liyang
 * @time: 2021/8/16 11:04
 */
public class OpenCloseTest {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(1,"java",99.9);
        System.out.println(javaCourse.toString());
    }
}
