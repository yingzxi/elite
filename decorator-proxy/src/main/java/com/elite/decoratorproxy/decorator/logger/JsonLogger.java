package com.elite.decoratorproxy.decorator.logger;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;

/**
 * @author: liyang
 * @time: 2021/8/17 11:09
 */
public class JsonLogger extends LoggerDecorator{
    public JsonLogger(Logger logger) {
        super(logger);
    }

    @Override
    public void info(String s) {
        JSONObject result = newJson();
        result.put("msg",s);
        logger.info(result.toString());
    }

    @Override
    public void error(String s) {
        JSONObject result = newJson();
        result.put("exception",s);
        logger.info(result.toString());
    }

    private JSONObject newJson(){
        return new JSONObject();
    }
}
