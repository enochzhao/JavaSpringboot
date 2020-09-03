package com.imooc.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
//    下面这个注解代表 out方法和"/out"路由绑定在一起
    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        return "success";
    }
}
