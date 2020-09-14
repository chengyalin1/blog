package com.example.demo.service.serviceImpl;


import com.example.demo.dao.UserRepository;
import com.example.demo.po.User;
import com.example.demo.service.UserService;
import com.example.demo.utils.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * 创作： 承亚林
 * 时间: 2020-09-08-14:32
 */
@Service
public class UserServiceImpl implements UserService {
    //依赖注入
    @Autowired
    private UserRepository userRepository;

    //验证用户名和密码
    @Override
    public User checkUser(String username, String password) {

        return userRepository.findByUsernameAndPassword(username, MD5Utils.code(password));
    }
}
