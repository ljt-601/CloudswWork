package com.cloudsw.base;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Description: 公用Mapper接口
 * @Date: 2021/3/29
 * @Author lijintao
 */
public interface IBaseMapper<T>  extends Mapper<T>,MySqlMapper<T> {

}
