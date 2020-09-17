package com.xincl.dao;

import com.xincl.pojo.Blog;
import com.xincl.utils.IDUtils;
import com.xincl.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * 单元测试
 */
public class testBlogMapper {
    @Test
    public void testInsertBlog(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        mapper.insertBlog(new Blog(IDUtils.getID(),"hello mybatis","xincl",new Date(),1000));
        mapper.insertBlog(new Blog(IDUtils.getID(),"hello spring","xincl",new Date(),13300));
        mapper.insertBlog(new Blog(IDUtils.getID(),"hello springMVC","xincl",new Date(),1200));
        sqlSession.close();
    }

    @Test
    public void testQueryBlog(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","hello spring");
        map.put("author","xincl");
        List<Blog> blogs = mapper.queryBlog(map);
        for (Blog blog:blogs){
            System.out.println(blog);
        }
        sqlSession.close();
    }
    @Test
    public void testQueryBlog2(){
        SqlSession sqlSession = MyBatisUtils.getsqlSession();
        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
        HashMap map = new HashMap();
        map.put("title","hello spring");
        map.put("author","xincl");
        List<Blog> blogs = mapper.queryBlog2(map);
        for (Blog blog:blogs){
            System.out.println(blog);
        }
        sqlSession.close();
    }


}
