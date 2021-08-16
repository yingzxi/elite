package com.gupao.elite.design.liskovsutiution.methodreturn;

import java.util.HashMap;

/**
 * @author: liyang
 * @time: 2021/8/16 13:49
 */
public class MethodReturnTest {
    public static void main(String[] args) {
        Base child = new Child();
        child.method();
    }
}
