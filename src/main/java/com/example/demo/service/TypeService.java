package com.example.demo.service;

import com.example.demo.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-21:21
 */

public interface TypeService {
    //新增
    Type saveType(Type type);

    //查询
    Type getType(Long id);
    Type getTypeByName(String name);

    //分页查询
    Page<Type> listType(Pageable pageable);

    //修改
    Type updateType(Long id, Type type);

    //删除
    void deleteType(Long id);
}
