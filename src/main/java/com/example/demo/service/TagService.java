package com.example.demo.service;


import com.example.demo.NotFoundException;
import com.example.demo.po.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * 创作： 承亚林
 * 时间: 2020-09-11-20:32
 */
public interface TagService {
    //保存
    Tag saveTag(Tag type);
    //通过id获取
    Tag getTag(Long id);
    //通过名字获取

    //分页
    Page<Tag> listTag(Pageable pageable);
    //列表
    List<Tag> listTag();
    //获取标签大小
    List<Tag> listTagTop(Integer size);
    //根据id获取列表
    List<Tag> listTag(String ids);
    //更新操作
    Tag updateTag(Long id,Tag type) throws NotFoundException;
    //删除操作
    void deleteTag(Long id);

    Tag getTagByName(String name);
}
