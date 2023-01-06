package com.oumuanode.mapper;

import com.oumuanode.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

    //根据分页获取分页数据
    List<User> selectUserPage(
            @Param("userName")
            String userName,
            @Param("userSex")
                    String userSex,
            @Param("startRow")
                    int startRow
     );


    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(
            @Param("userName")
                    String userName,
            @Param("userSex")
                    String userSex
    );
}
