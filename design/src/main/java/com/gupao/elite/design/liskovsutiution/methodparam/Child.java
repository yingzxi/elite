package com.gupao.elite.design.liskovsutiution.methodparam;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liyang
 * @time: 2021/8/16 13:40
 */
public class Child extends Base{
//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类HashMap入参方法");
//    }

    public void method(Map map){
        System.out.println("子类重载方法入參要更宽松");
    }
}
