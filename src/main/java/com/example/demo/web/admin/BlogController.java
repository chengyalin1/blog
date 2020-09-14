package com.example.demo.web.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-20:14
 */
@Controller
@RequestMapping("/admin")
public class BlogController {
    @GetMapping("/blogs")
    public String list(){
        return "admin/blogs";
    }
}
