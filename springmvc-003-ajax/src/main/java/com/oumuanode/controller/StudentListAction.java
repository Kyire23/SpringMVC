package com.oumuanode.controller;

import com.oumuanode.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentListAction {
    @RequestMapping("/list")
    @ResponseBody //解析ajax请求 必须要在springmvc.xml添加注解驱动
    public List<Student> list(){
        List<Student> list = new ArrayList<>();
        Student stu1 = new Student("张三",23);
        Student stu2 = new Student("李四",24);
        Student stu3 = new Student("王五",25);
        Student stu4 = new Student("赵六",21);
        Student stu5 = new Student("钱七",28);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);
        list.add(stu5);
        return list;//SpringMVC框架负责将集合转为json数组
    }
}
