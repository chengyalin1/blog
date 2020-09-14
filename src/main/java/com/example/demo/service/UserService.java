package com.example.demo.service;

import com.example.demo.po.User;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-14:31
 */
public interface UserService {
    User checkUser(String username,String password);
}
