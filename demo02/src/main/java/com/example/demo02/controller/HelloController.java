package com.example.demo02.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    Logger logger = LoggerFactory.getLogger(getClass());

    @ResponseBody
    @RequestMapping("/hello")
    public String hello() {
        return "Jenkins测试成功！！！---zhangkai";
    }
}
