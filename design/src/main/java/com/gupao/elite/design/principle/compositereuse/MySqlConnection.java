package com.gupao.elite.design.principle.compositereuse;

/**
 * @author: liyang
 * @time: 2021/8/16 14:05
 */
public class MySqlConnection extends DBConnection{
    @Override
    public String getConnection() {
        return "获取mysql数据库连接";
    }
}
