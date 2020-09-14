package com.example.demo.web;

import javassist.NotFoundException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 创作： 承亚林
 * 时间: 2020-09-07-18:35
 */

/**
 * 首页控制器
 */
@Controller
public class IndexController {
    @GetMapping("/")
    public String index() throws NotFoundException {
//        int i=9/0;
//        String blog=null;
//        if (blog==null){
//            throw  new NotFoundException("博客不存在");
//        }
        return "index";
    }
}
