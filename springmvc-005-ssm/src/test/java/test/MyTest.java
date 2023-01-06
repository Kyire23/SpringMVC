package test;

import com.oumuanode.pojo.User;
import com.oumuanode.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class) //启动spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml",
        "classpath:applicationContext_service.xml"})
public class MyTest {
    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage(){
        //不加条件 起始页0 前5条数据
        List<User> list = userService.selectUserPage(null,null,0);
        list.forEach(user -> System.out.println(user));

//        //加条件 性别男
//        List<User> list1 = userService.selectUserPage(null,"男",0);
//        list1.forEach(user -> System.out.println(user));
    }

    @Test
    public void testDeleteUserById(){
        int num = userService.deleteUserById("15968162087363060");
        System.out.println(num);
    }

    @Test
    public void testGetRowCount(){
        //没有任何条件 查总行数
        int num = userService.getRowCount(null,null);
        System.out.println(num);

        //有几个用户是男性
        int num1 = userService.getRowCount(null,"男");
        System.out.println(num1);
    }

    @Test
    public void testCreateUser(){
        User user = new User("3423423432","身份证","123456345678324567","哈哈",
                "男","23","工人");
        int num = userService.createUser(user);
        System.out.println(num);
    }

}

