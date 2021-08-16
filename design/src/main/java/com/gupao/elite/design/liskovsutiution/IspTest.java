package com.gupao.elite.design.liskovsutiution;




/**
 * 里氏替换原则
 * 保证使用子类也执行原逻辑
 * @author: liyang
 * @time: 2021/8/16 13:22
 */
public class IspTest {

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
        Square square = new Square();
        square.setLength(10);
//        resize(square);
    }
}
