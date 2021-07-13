package com.xiao.dao;

import com.xiao.pojo.Blog;
import com.xiao.utils.IDutils;
import com.xiao.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class MyTest {
    @Test
    public void addBlogTest() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Blog blog = new Blog();
        blog.setId(IDutils.getID());
        blog.setTitle("Mybatis");
        blog.setAuthor("狂神说");
        blog.setCreateTime(new Date());
        blog.setViews(9999);

        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Java");
        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("Spring");
        mapper.addBlog(blog);

        blog.setId(IDutils.getID());
        blog.setTitle("微服务");
        mapper.addBlog(blog);

        sqlSession.close();
    }

    @Test
    public void selectBlogIF() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        map.put("title", "Spring");
        map.put("author", "肖志伟");

        List<Blog> blogs = mapper.selectBlogIF(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

    }

    @Test
    public void selectBlogChoose() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        // map.put("title","Spring");
        // map.put("author","肖志伟");
        // map.put("views",9999);

        List<Blog> blogs = mapper.selectBlogChoose(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

    }
    @Test
    public void setBlog() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        // map.put("title","Spring");
         map.put("author","肖志伟66");
         map.put("id","50fe365f 05ef 4550 8698 77a7f5aa0c62");
        int i = mapper.setBlog(map);
        System.out.println(i);
    }
    @Test
    public void selectBlogForeach() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        Map map = new HashMap();
        ArrayList<Integer> ids = new ArrayList<Integer>();
        ids.add(1);
        ids.add(2);
        map.put("ids", ids);
        List<Blog> blogs = mapper.selectBlogForeach(map);
        for (Blog blog : blogs) {
            System.out.println(blog);
        }

    }
}
