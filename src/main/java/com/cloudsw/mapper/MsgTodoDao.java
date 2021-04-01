package com.cloudsw.mapper;

import com.cloudsw.base.IBaseMapper;
import com.cloudsw.dto.MsgTodo;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 待阅信息表 Mapper 接口
 * </p>
 *
 * @author zhenlong.qu@cloudsw.cn
 * @since 2020-08-10
 */
@Mapper
public interface MsgTodoDao extends IBaseMapper<MsgTodo> {

}
