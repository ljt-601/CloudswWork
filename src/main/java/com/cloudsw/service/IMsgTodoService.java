package com.cloudsw.service;

import com.cloudsw.base.IBaseService;
import com.cloudsw.dto.MsgTodo;
import com.github.pagehelper.PageInfo;

public interface IMsgTodoService extends IBaseService<MsgTodo> {



/*    int deleteByPrimaryKey(Integer id);

    int insert(MsgTodo msgTodo);

    MsgTodo selectByPrimaryKey(Integer id);

    List<MsgTodo> selectAll();

    int updateByPrimaryKey(MsgTodo msgTodo);*/
    /**
     * 根据条件分页查询
     *
     * @param country
     * @param page
     * @param rows
     * @return
     */
    PageInfo<MsgTodo> selectByMsgTodo(MsgTodo country, int page, int rows);


}
