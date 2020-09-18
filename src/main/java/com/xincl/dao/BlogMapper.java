package com.xincl.dao;

import com.xincl.pojo.Blog;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BlogMapper {

    //插入数据
    int insertBlog(Blog blog);

    //获取数据 IF 动态SQL
    List<Blog> queryBlog(HashMap map);

    //获取数据 choose，when,otherwise
    List<Blog> queryBlog2(HashMap map);

    //获取数据：foreach
    List<Blog> queryBlog3(Map map);
}
