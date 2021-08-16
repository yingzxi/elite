package com.gupao.elite.design.principle.compositereuse;

/**
 * 合成/聚合 复用原则
 * @author: liyang
 * @time: 2021/8/16 14:05
 */
public class CopTest {
    public static void main(String[] args) {
        ProductDao productDao = new ProductDao();
        productDao.setConnection(new MySqlConnection());
        productDao.addProduct();
    }
}
