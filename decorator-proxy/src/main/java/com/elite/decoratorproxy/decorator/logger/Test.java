package com.elite.decoratorproxy.decorator.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

/**
 * @author: liyang
 * @time: 2021/8/17 11:08
 */
public class Test {

    private static final Logger logger = JsonLoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
        logger.info("logger日志");
    }
}
