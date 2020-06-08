package com.springboot.logback.controller;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/vip")
public class IndexController {
    @GetMapping(value = "/say")
    public String hello(){
        return "hello";
    }

    @GetMapping(value = "/index")
    public String index(){
        return "index";
    }

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @Test
    public void testLogback(){
        logger.info("info");
        logger.debug("debug");
        logger.error("error");
        logger.trace("trace");
        logger.warn("warn");
    }
}
