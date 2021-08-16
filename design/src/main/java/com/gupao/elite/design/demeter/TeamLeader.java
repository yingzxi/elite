package com.gupao.elite.design.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: liyang
 * @time: 2021/8/16 11:47
 */
public class TeamLeader {
    public void commandCheckNumber(Employeee employeee){
        employeee.checkNumberOfCourses();
    }
}
