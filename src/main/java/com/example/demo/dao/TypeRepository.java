package com.example.demo.dao;

import com.example.demo.po.Type;
import com.sun.xml.internal.ws.developer.JAXWSProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-21:28
 */

public interface TypeRepository  extends JpaRepository<Type,Long> {
    Type findByName(String name);
}
