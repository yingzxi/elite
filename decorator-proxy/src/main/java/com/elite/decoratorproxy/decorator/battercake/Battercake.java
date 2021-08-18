package com.elite.decoratorproxy.decorator.battercake;

import com.sun.org.apache.bcel.internal.generic.ARETURN;
import com.sun.org.apache.bcel.internal.generic.RETURN;

/**
 * @author: liyang
 * @time: 2021/8/17 10:54
 */
public abstract class Battercake {

    protected abstract String getMsg();

    protected abstract int getPrice();
}
