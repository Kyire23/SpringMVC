package com.oumuanode.controller;


import com.oumuanode.pojo.User;
import com.oumuanode.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
//@RestController 如果本类中全部是ajax请求 则下面的@ResponseBody注解可以省略
@Controller
@RequestMapping("/user")
public class UserController {

    //切记：一定要有业务逻辑层对象
    @Autowired
    UserService userService;

    //这里写这个其实没用 因为UserMapping.xml中的sql语句被写死了
    public static final int PAGE_SIZE = 5;

    // /user/selectUserPage?userName=z&userSex=男&page=null
    @RequestMapping("/selectUserPage")
    @ResponseBody //使用ajax请求 要用这个将返回的数据放在响应体中
    public List<User> selectUserPage(String userName, String userSex, Integer page) {
        //根据页码计算起始行
        int startRow = 0;
        if (page != null) {
            startRow = (page - 1) * PAGE_SIZE;
        }
        return userService.selectUserPage(userName, userSex, startRow);
    }

    // /user/getRowCount?userName=z&userSex=男
    @RequestMapping("/getRowCount")
    @ResponseBody
    public int getRowCount(String userName, String userSex) {
        return userService.getRowCount(userName, userSex);
    }

    // /user/deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")
    @ResponseBody
    public int deleteUserById(String userId) {
        return userService.deleteUserById(userId);
    }

    // /user/createUser(参数见下面 没有userId)
    @RequestMapping("/createUser")
    @ResponseBody
    public int createUser(User user) {
        String userId = System.currentTimeMillis() + ""; //随机生成userId
        user.setUserId(userId);
        return userService.createUser(user);
    }
}

