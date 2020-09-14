package com.example.demo.dao;

import com.example.demo.po.User;
import org.springframework.data.jpa.repository.JpaRepository;


/**
 * 创作： 承亚林
 * 时间: 2020-09-08-14:34
 */
public interface  UserRepository extends JpaRepository<User,Long> {

    User findByUsernameAndPassword(String username, String password);
}
