package com.elite.decoratorproxy.observer.gper;

/**
 * @author: liyang
 * @time: 2021/8/18 13:29
 */
public class Question {

    private String userName;
    private String conter;

    public Question(String userName, String conter) {
        this.userName = userName;
        this.conter = conter;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getConter() {
        return conter;
    }

    public void setConter(String conter) {
        this.conter = conter;
    }
}
