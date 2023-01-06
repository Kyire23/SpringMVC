package com.oumuanode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebInfAction {
    @RequestMapping("/showIndex")
    public String showIndex(){
        System.out.println("访问index.jsp");
        return "index";
    }

    @RequestMapping("/showMain")
    public String showMain(){
        System.out.println("访问main.jsp");
        return "main";
    }

    @RequestMapping("/showLogin")
    public String showLogin(){
        System.out.println("访问login.jsp");
        return "login";
    }

    //登录业务的判断
    @RequestMapping("/login")
    public String login(String name, String pwd, HttpServletRequest request){
      if ("yang".equalsIgnoreCase(name) && "123".equalsIgnoreCase(pwd)) {
          request.getSession().setAttribute("users",name);
          return "main";
      }else {
          request.setAttribute("msg","用户名或密码不正确");
          return "login";
      }
    }
}
