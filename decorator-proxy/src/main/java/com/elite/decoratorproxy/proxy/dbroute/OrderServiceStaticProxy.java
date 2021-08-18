package com.elite.decoratorproxy.proxy.dbroute;

import com.elite.decoratorproxy.proxy.dbroute.db.DynamicDataSourceEntity;

import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author: liyang
 * @time: 2021/8/17 14:05
 */
public class OrderServiceStaticProxy implements IOrderService{

    private SimpleDateFormat simple = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public OrderServiceStaticProxy(IOrderService orderService) {
        this.orderService = orderService;
    }


    @Override
    public int createOrder(Order order) {
        Long time = order.getCreateTime();
        Integer dbRouter = Integer.valueOf(simple.format(new Date(time)));
        System.out.println("静态代理类自动分配到DB_" + dbRouter + "数据源");
        DynamicDataSourceEntity.set(dbRouter);
        this.orderService.createOrder(order);
        DynamicDataSourceEntity.restore();
        return 0;
    }
}
