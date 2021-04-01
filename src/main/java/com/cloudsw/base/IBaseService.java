package com.cloudsw.base;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 * 通用接口
 * @param <T>
 */
@Service
public interface IBaseService<T> {
    //根据key,一般是id查询
    T selectByKey(Object key);

    //增加
    int save(T entity);

    //以实体Object条件删除
    int delete(T entity);

    //根据key删除
    int deleteByKey(Object key);

    //根据条件修改
    int updateAll(T entity);

    //如果修改后的值为null则不修改
    int updateNotNull(T entity);

    //条件查询，Object中包含了条件
    List<T> selectByExample(Object example);



}
