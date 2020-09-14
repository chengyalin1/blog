package com.example.demo.dao;

import com.example.demo.po.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 创作： 承亚林
 * 时间: 2020-09-12-15:58
 */
public interface BlogReposity extends JpaRepository<Blog ,Long> {

}
