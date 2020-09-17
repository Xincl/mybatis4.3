package com.xincl.dao;

import com.xincl.pojo.Blog;

import java.util.HashMap;
import java.util.List;

public interface BlogMapper {

    //插入数据
    int insertBlog(Blog blog);

    //获取数据 IF 动态SQL
    List<Blog> queryBlog(HashMap map);

    //获取数据 choose，when,otherwise
    List<Blog> queryBlog2(HashMap map);
}
