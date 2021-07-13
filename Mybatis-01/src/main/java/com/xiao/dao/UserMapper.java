package com.xiao.dao;

import com.sun.xml.internal.bind.v2.model.core.ID;
import com.xiao.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserLike(String value);
    User getUserById(int id);
    User getUserByNP(@Param("name") String name, @Param("pwd") String pwd);
    int updateUser(User user);
    int addUser(User user);
    void deleteUserById(int id);
    int updateUser1(Map<String,Object> map);

}
