package com.example.demo.service.serviceImpl;

import com.example.demo.NotFoundException;
import com.example.demo.dao.TagRepository;
import com.example.demo.po.Tag;

import com.example.demo.service.TagService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

/**
 * 创作： 承亚林
 * 时间: 2020-09-11-20:50
 */
@Service
public class TagServiceImpl implements TagService {
    @Autowired
    private TagRepository tagRepository;

    @Transactional
    @Override
    public Tag saveTag(Tag type) {
        return tagRepository.save(type);
    }

    @Transactional
    @Override
    public Tag getTag(Long id) {
        return tagRepository.getOne(id);
    }




    @Transactional
    @Override
    public Page<Tag> listTag(Pageable pageable) {
        return tagRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public List<Tag> listTag() {
        return tagRepository.findAll();
    }

    @Transactional
    @Override
    public List<Tag> listTagTop(Integer size) {


        return null;
    }

    @Override
    public List<Tag> listTag(String ids) {
        return null;
    }

    @Transactional
    @Override
    public Tag updateTag(Long id, Tag type)  {
        Tag tag = tagRepository.findById(id).orElse(null);
        Assert.isNull(tag,"不存在该标签");
        BeanUtils.copyProperties(tag, type);
        return tagRepository.save(tag);
    }

    @Transactional
    @Override
    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }

    @Override
    public Tag getTagByName(String name) {
        return tagRepository.findByName(name);
    }
}
