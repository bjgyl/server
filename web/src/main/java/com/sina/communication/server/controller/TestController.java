package com.sina.communication.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * test
 *
 * @author gyl
 * @create 2018-04-09 10:04
 **/
@Controller
public class TestController {

    @RequestMapping("test/index.do")
    public String test(){
        System.out.println("进入server的controller的test……");
        return "index";
    }
}
