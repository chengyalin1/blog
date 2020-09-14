package com.example.demo.dao;

import com.example.demo.po.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


/**
 * 创作： 承亚林
 * 时间: 2020-09-11-20:52
 */
public interface TagRepository extends JpaRepository<Tag,Long> {
     

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

     Tag findByName(String name);
}
