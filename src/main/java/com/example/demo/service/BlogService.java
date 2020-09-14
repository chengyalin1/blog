package com.example.demo.service;

import com.example.demo.po.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 创作： 承亚林
 * 时间: 2020-09-12-15:53
 */
@Service
public interface BlogService {
    //查询
    Blog getBlog(Long id);
    //分页查询
    Page<Blog> listBlog(Pageable pageable,Blog blog);
    //新增
    Blog saveBlog(Blog blog);
    //修改
    Blog updateBlog(Long id,Blog blog);
    //删除
    void deleteBlog( Long id);
}
