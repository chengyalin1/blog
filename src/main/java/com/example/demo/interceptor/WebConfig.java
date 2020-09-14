package com.example.demo.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-20:28
 */
@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterCeptor()).
                addPathPatterns("/admin/**").
                excludePathPatterns("/admin")
                .excludePathPatterns("/admin/login");
    }
}
