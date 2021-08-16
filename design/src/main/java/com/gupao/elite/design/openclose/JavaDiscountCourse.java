package com.gupao.elite.design.openclose;

/**
 * @author: liyang
 * @time: 2021/8/16 11:06
 */
public class JavaDiscountCourse extends JavaCourse{

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscount(){
        return super.getPrice() * 0.9;
    }
}
