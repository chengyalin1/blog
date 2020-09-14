package com.example.demo.service.serviceImpl;

import com.example.demo.NotFoundException;
import com.example.demo.dao.TypeRepository;
import com.example.demo.po.Type;
import com.example.demo.service.TypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * 创作： 承亚林
 * 时间: 2020-09-08-21:27
 */
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Transactional
    @Override
    public Type saveType(Type type) {
        return typeRepository.save(type);
    }

    @Transactional
    @Override
    public Type getType(Long id) {
        return typeRepository.getOne(id);
    }

    @Override
    public Type getTypeByName(String name) {
        return typeRepository.findByName(name);
    }

    @Transactional
    @Override
    public Page<Type> listType(Pageable pageable) {
        return typeRepository.findAll(pageable);
    }

    @Transactional
    @Override
    public Type updateType(Long id, Type type) {
        Type one = typeRepository.findById(id).get();
        if (one == null) {
            throw new NotFoundException("不存在该类型");
        }
        BeanUtils.copyProperties(type, one);
        return typeRepository.save(one);
    }

    @Transactional
    @Override
    public void deleteType(Long id) {
        Type type = typeRepository.findById(id).get();
        typeRepository.delete(type);
    }
}
