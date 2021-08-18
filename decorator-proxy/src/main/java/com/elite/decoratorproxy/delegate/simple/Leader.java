package com.elite.decoratorproxy.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: liyang
 * @time: 2021/8/17 15:53
 */
public class Leader implements IEmployee{

    private Map<String,IEmployee> map = new HashMap<String,IEmployee>();

    public Leader() {
        map.put("java",new EmployeeA());
        map.put("python",new EmployeeB());
    }

    @Override
    public void doing(String task) {
        if(map.containsKey(task)){
            map.get(task).doing(task);
        }else{
            System.out.println("nothing");
        }
    }
}
