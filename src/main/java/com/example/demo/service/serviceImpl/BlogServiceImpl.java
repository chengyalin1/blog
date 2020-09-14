package com.example.demo.service.serviceImpl;

import com.example.demo.dao.BlogReposity;
import com.example.demo.po.Blog;
import com.example.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * 创作： 承亚林
 * 时间: 2020-09-12-15:58
 */
@Transactional
@Service
public class BlogServiceImpl implements BlogService {
   @Autowired
    private BlogReposity blogReposity;

    @Override
    public Blog getBlog(Long id) {
        return blogReposity.getOne(id);
    }

    @Override
    public Page<Blog> listBlog(Pageable pageable, Blog blog) {
        return null;
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return null;
    }

    @Override
    public Blog updateBlog(Long id, Blog blog) {
        return null;
    }

    @Override
    public void deleteBlog(Long id) {

    }
}
