package com.xiao.dao;

import com.xiao.pojo.Blog;

import java.util.List;
import java.util.Map;

public interface BlogMapper {
    int addBlog(Blog blog);

    List<Blog> selectBlogIF(Map map);

    List<Blog> selectBlogChoose(Map map);

    int setBlog(Map map);

    List<Blog> selectBlogForeach(Map map);
}
