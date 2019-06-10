package com.sunline.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {

    private static Logger logger = LoggerFactory.getLogger(AppController.class);

    public static String tt = "123";

    @RequestMapping("hello")
    public String hello() {
        logger.info(AppController.tt);
        AppController.tt = "456";
        logger.info("update=======>"+AppController.tt);
        return "hello world!";
    }
}
