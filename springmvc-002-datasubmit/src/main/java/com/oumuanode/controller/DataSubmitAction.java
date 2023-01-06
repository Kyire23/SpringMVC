package com.oumuanode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DataSubmitAction {
    @RequestMapping(value = "one")
    public String one(String myname, int age) {
        System.out.println("myname=" + myname + ",age=" + (age + 100));
        return "main";
    }


    @RequestMapping(value = "tow")
    public String tow(Users users) {
        System.out.println(users);
        return "main";
    }

    @RequestMapping("/three/{name}/{age}")
    public String three(
            @PathVariable
                    String name,
            @PathVariable
                    int age) {
        System.out.println("name=" + name + ",age=" + (age + 100));
        return "main";
    }


    @RequestMapping(value = "four")
    public String four(@RequestParam("name")
                               String uname,
                       @RequestParam("age")
                               int uage) {
        System.out.println("name=" + uname + ",age=" + (uage + 100));
        return "main";
    }

    @RequestMapping(value = "five")
    public String five(HttpServletRequest request) {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        System.out.println("name=" + name + ",age=" + (age + 100));
        return "main";
    }

}
