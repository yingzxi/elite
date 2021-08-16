package com.gupao.elite.design.principle.compositereuse;

/**
 * @author: liyang
 * @time: 2021/8/16 14:02
 */
public class ProductDao {
    private DBConnection dbConnection;
    public  void setConnection(DBConnection dbConnection){
        this.dbConnection = dbConnection;
    }
    public void addProduct(){
        String conn = dbConnection.getConnection();
        System.out.println("获取数据库链接");
    }
}
