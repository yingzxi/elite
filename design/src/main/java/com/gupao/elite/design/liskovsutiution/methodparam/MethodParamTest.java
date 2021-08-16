package com.gupao.elite.design.liskovsutiution.methodparam;

import java.util.HashMap;

/**
 * @author: liyang
 * @time: 2021/8/16 13:42
 */
public class MethodParamTest {
    public static void main(String[] args) {
        Child child = new Child();
        HashMap hashMap = new HashMap();
        child.method(hashMap);

    }
}
