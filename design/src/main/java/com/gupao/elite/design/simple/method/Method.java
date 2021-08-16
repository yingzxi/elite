package com.gupao.elite.design.simple.method;

/**
 * @author: liyang
 * @time: 2021/8/16 11:33
 */
public class Method {
    private void modifyUserInfo(String userName,String address){
        userName = "ly";
        address = "BeiJing";
    }

    private void modifyUserInfo(String userName,String ... fileds){

    }

    private void modifyUserInfo(String userName,String address,boolean bool){
        if (bool){

        }else{

        }
    }

    //应该这么处理
    //方法和类的职责尽量清楚
    private void modifyUserName(String userName){

    }

    private void modifyAddress(String address){

    }
}
