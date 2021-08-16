package com.gupao.elite.design.liskovsutiution.simple;

import com.gupao.elite.design.liskovsutiution.simple.Rectangle;
import com.gupao.elite.design.liskovsutiution.simple.Square;

/**
 * @author: liyang
 * @time: 2021/8/16 13:22
 */
public class SimpleTest {

    public static void resize(Rectangle rectangle){
        while (rectangle.getWidth() >= rectangle.getHeight()){
            rectangle.setHeight(rectangle.getHeight() + 1);
            System.out.println("width:" + rectangle.getWidth() + ",height:" + rectangle.getHeight());
        }
    }

//    public static void main(String[] args) {
//        Rectangle rectangle = new Rectangle();
//        rectangle.setWidth(20);
//        rectangle.setHeight(10);
//        resize(rectangle);
//    }

    public static void main(String[] args) {
        com.gupao.elite.design.liskovsutiution.simple.Square square = new Square();
        square.setLength(10);
        resize(square);
    }
}
