package com.xiao.dao;

import com.xiao.pojo.User;
import com.xiao.pojo.User1;
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
    User1 getUserList1(int id);
    List<User> selectUser(Map<String,Object> map);

}
