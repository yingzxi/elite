package com.gupao.elite.design.demeter;

/**
 * 迪米特法则
 * 最少知道原则
 * 不相关的类尽量不要出现
 * @author: liyang
 * @time: 2021/8/16 11:49
 */
public class LodTest {
    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Employeee employeee = new Employeee();
        teamLeader.commandCheckNumber(employeee);
    }
}
