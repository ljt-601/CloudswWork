package com.cloudsw.controller;

import com.cloudsw.dto.MsgTodo;
import com.cloudsw.service.IMsgTodoService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MsgTodoController {
    @Autowired
    private IMsgTodoService iMsgTodoService;
    @PostMapping(value = "/msg/insert")
    public int insert( @RequestBody MsgTodo msgTodo) {
        return iMsgTodoService.save(msgTodo);
    }


    @DeleteMapping(value = "/msg/deleteByPrimaryKey")
    public int deleteByPrimaryKey(@RequestParam(value = "id", required = true) Integer id) {
        int row = iMsgTodoService.deleteByKey(id);
        return row;
    }


    @PostMapping(value = "/manager/updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody MsgTodo msgTodo) {
        return iMsgTodoService.updateAll(msgTodo);
    }


    @PostMapping(value = "/msg/selectByPrimaryKey")
    public MsgTodo selectByPrimaryKey(@RequestParam(value = "id", required = true) Integer id) {
        return iMsgTodoService.selectByKey(id);
    }


    @GetMapping(value = "/msg/selectAll")
    public List<MsgTodo> selectAll() {
        List<MsgTodo> managerList = iMsgTodoService.selectByExample(null);
        return managerList;
    }
    @PostMapping (value = "/msg/selectAllByPage")
    public PageInfo<MsgTodo> selectAllByPage( @RequestParam(required = false, defaultValue = "1") int page,
                                          @RequestParam(required = false, defaultValue = "10") int rows,
                                          @RequestBody MsgTodo msgTodo) {
        PageInfo<MsgTodo> pageInfo = iMsgTodoService.selectByMsgTodo(msgTodo, page, rows);
        return pageInfo;
    }
}
