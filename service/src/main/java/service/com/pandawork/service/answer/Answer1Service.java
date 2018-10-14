package com.pandawork.service.answer;

import com.pandawork.common.entity.answer.Answer1;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 19:56
 */
public interface Answer1Service {
    /**
     * prpject信息列表
     * @return
     * @throws SSException
     */
    public List<Answer1> listAllAnswer1() throws SSException;

    /**
     * 增加project信息
     * @throws SSException
     */
    public boolean addAnswer1(Answer1 answer1)throws SSException;

    /**
     * 删除person信息
     * @throws SSException
     */
    public boolean delAnswer1(int id) throws SSException;

    /**
     * 修改person信息
     * @throws SSException
     */
    public boolean updateAnswer1(Answer1 answer1) throws SSException;

    /**
     * 查找（根据id）
     * @throws SSException
     */
    public Answer1 selectById(int id) throws SSException;

    /**
     * 模糊查询
     * @throws SSException
     */
    public List<Answer1> select(String keyword) throws SSException;
}
