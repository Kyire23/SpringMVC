package com.oumuanode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * action所有功能实现都是由方法来完成
 * action 方法规范
 * 访问权限public 方法返回值任意 方法名称任意 方法可以没有参数 如果有任意类型都行
 * 要使用@RequestMapping注解来声明一个访问路径(名称)
 */
@Controller
public class DemoAction {
    @RequestMapping("/demo")
    public String demo() {
        System.out.println("服务器被访问到");
        return "main"; // 可以直接跳到/admin/main.jsp
    }
}
