package com.elite.decoratorproxy.decorator.general;

/**
 * @author: liyang
 * @time: 2021/8/17 10:51
 */
public class ConcreteDecoratorB extends Decorator{

    public ConcreteDecoratorB(Componet componet) {
        super(componet);
    }

    private void operationFirst(){}//调用之前的方法
    private void operationLast(){}//调用之后的方法

    @Override
    public void operation() {
        operationFirst();
        super.operation();
        operationLast();
    }
}
