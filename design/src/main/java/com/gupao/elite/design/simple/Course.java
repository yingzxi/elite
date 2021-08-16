package com.gupao.elite.design.simple;

/**
 * @author: liyang
 * @time: 2021/8/16 11:25
 */
public class Course {

    public void study(String name){
        if("直播课".equals(name)){
            System.out.println("不能快进");
        }else{
            System.out.println("可以反复观看");
        }
    }
}
