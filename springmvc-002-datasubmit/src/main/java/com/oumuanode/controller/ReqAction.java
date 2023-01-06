package com.oumuanode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReqAction {
    @RequestMapping(value = "/req",method = RequestMethod.GET)
    public String req(){
        System.out.println("我是处理GET请求的....");
        return "main";
    }

    @RequestMapping(value = "/req",method = RequestMethod.POST)
    public String reql(){
        System.out.println("我是处理POST请求的....");
        return "main";
    }


}
