package com.cloudsw.service.impl;

import com.cloudsw.base.impl.IBaseServiceImpl;
import com.cloudsw.dto.MsgTodo;
import com.cloudsw.mapper.MsgTodoDao;
import com.cloudsw.service.IMsgTodoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ManagerServiceImpl extends IBaseServiceImpl<MsgTodo> implements IMsgTodoService {

    @Resource
   private MsgTodoDao msgTodoDao;

    @Override
    public PageInfo<MsgTodo> selectByMsgTodo(MsgTodo msgTodo, int page, int rows) {
        Example example = new Example(MsgTodo.class);
//        Example.Criteria criteria = example.createCriteria();
//        if (msgTodo.getId() != null) {
//            criteria.andEqualTo("id", msgTodo.getId());
//        }
        //分页查询
        PageHelper.startPage(page, rows);
        List<MsgTodo> msgTodoList = msgTodoDao.selectAll();
        PageInfo<MsgTodo> pageInfo = new PageInfo(msgTodoList);
        return pageInfo;
    }

   /* @Autowired
    private MsgTodoDao msgTodoDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        int row = msgTodoDao.deleteByPrimaryKey(id);
        return row;
    }

    @Override
    public int insert(MsgTodo msgTodo) {
        return msgTodoDao.insert(msgTodo);
    }

    @Override
    public MsgTodo selectByPrimaryKey(Integer id) {
        return msgTodoDao.selectByPrimaryKey(id);
    }

    @Override
    public List<MsgTodo> selectAll() {
        return msgTodoDao.selectAll();
    }

    @Override
    public int updateByPrimaryKey(MsgTodo msgTodo) {
        return msgTodoDao.updateByPrimaryKey(msgTodo);
    }*/
}
