package com.elite.decoratorproxy.decorator.general;

/**
 * @author: liyang
 * @time: 2021/8/17 10:48
 */
public class ConcreteComponent extends Componet{
    @Override
    public void operation() {
        System.out.println("处理业务逻辑");
    }
}
