package com.elite.singleton.serlabel;

import org.omg.CORBA.PRIVATE_MEMBER;

import java.io.Serializable;

/**
 * @author: liyang
 * @time: 2021/8/16 18:09
 */
public class SeriableeSingleton implements Serializable {

    //序列化

    public final static SeriableeSingleton INSTANCE = new SeriableeSingleton();
    private SeriableeSingleton(){}

    public static SeriableeSingleton getInstance(){return INSTANCE;}

    //防止序列化
    private Object readResolve(){return INSTANCE;}
}
