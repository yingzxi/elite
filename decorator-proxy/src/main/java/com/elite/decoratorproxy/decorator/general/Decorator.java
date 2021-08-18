package com.elite.decoratorproxy.decorator.general;

/**
 * @author: liyang
 * @time: 2021/8/17 10:48
 */
public abstract class Decorator extends Componet{
    /**
     * 组建对象
     */
    protected Componet componet;

    public Decorator(Componet componet) {
        this.componet = componet;
    }

    public void operation(){
        //转发请求给组建对象,可以再转发啊前后执行一些附件动作.
        //类似代理,可以在代理前后新增功能
        //增强功能
        componet.operation();
    }
}
