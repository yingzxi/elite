package com.gupao.elite.design.liskovsutiution.methodreturn;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liyang
 * @time: 2021/8/16 13:48
 */
public class Child extends Base{
    @Override
    public HashMap method() {
        System.out.println("执行子类的method");
        HashMap hashMap = new HashMap();
        hashMap.put("msg","子类");
        return hashMap;
    }
}
