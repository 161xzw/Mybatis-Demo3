package com.xiao.dao;

import com.xiao.pojo.User;
import com.xiao.pojo.User1;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        try {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> userList = userMapper.getUserList();
            for (User user:userList) {
                System.out.println(user);
            }
        }catch ( Exception e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }
    }
    @Test
    public  void  getUserByID(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(1);
        System.out.println(user);
        sqlSession.close();
    }
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
         mapper.addUser(new User(4, "zx", "da"));
         sqlSession.commit();
         sqlSession.close();
    }
    @Test
    public  void getUserByNP(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByNP = mapper.getUserByNP("zx", "da");
        System.out.println(userByNP);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(4);
        user.setName("zxcv");
        int i = mapper.updateUser(user);
        System.out.println(i);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUserById(4);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void updateUser1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("name","mcfd");
        map.put("id", 2);
        int i = mapper.updateUser1(map);
        System.out.println(i);
        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public  void getUserLike(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userLike = mapper.getUserLike("%w2%");
        for (User user:userLike) {
            System.out.println(user);
        }
        sqlSession.close();
    }
    @Test
    public void getUserList1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User1 userList1 = mapper.getUserList1(1);
        System.out.println(userList1);
        sqlSession.close();
    }
    @Test
    public void selectUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String,Object> map=new HashMap<String,Object>();
        int startIndex=4;
        int endIndex=6;
        map.put("startIndex",startIndex);
        map.put("endIndex",endIndex);
        List<User> users = mapper.selectUser(map);
        for (User user:users) {
            System.out.println(user);
        }

        sqlSession.close();
    }

}
