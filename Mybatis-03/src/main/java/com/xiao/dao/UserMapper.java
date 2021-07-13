package com.xiao.dao;

import com.xiao.pojo.User;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserLike(String value);
    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);
    User getUserByNP(@Param("name") String name, @Param("pwd") String pwd);
    @Update("update user set name=#{name},pwd=#{pwd} where id=#{id}")
    int updateUser(User user);
    @Insert("insert into user(id,name,pwd) value (#{id},#{name},#{pwd})")
    int addUser(User user);
    @Delete("delete  from user where id=#{id}")
    void deleteUserById(int id);
    int updateUser1(Map<String,Object> map);
    @Select("select *from user")
    List<User> selectUsers();
    List<User> selectUser(Map<String,Object> map);

}
