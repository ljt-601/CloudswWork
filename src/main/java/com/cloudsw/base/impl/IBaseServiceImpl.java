package com.cloudsw.base.impl;

import com.cloudsw.base.IBaseMapper;
import com.cloudsw.base.IBaseService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IBaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    private IBaseMapper mapper;
    @Override
    public T selectByKey(Object key) {
        return (T) mapper.selectByPrimaryKey(key);
    }

    @Override
    public int save(T entity) {
        return mapper.insert(entity);
    }

    @Override
    public int deleteByKey(Object key) {
        return  mapper.deleteByPrimaryKey(key);
    }

    @Override
    public int delete(T entity) {
        return mapper.delete(entity);
    }

    @Override
    public int updateAll(T entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public int updateNotNull(T entity) {
        return mapper.updateByPrimaryKeySelective(entity);
    }

    @Override
    public List<T> selectByExample(Object example) {
        return mapper.selectByExample(example);
    }

}
