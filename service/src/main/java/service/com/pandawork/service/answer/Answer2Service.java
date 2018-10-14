package com.pandawork.service.answer;

import com.pandawork.common.entity.answer.Answer2;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 20:41
 */
public interface Answer2Service {
    /**
     * prpject信息列表
     * @return
     * @throws SSException
     */
    public List<Answer2> listAllAnswer2() throws SSException;

    /**
     * 增加project信息
     * @throws SSException
     */
    public boolean addAnswer2(Answer2 answer2)throws SSException;

    /**
     * 删除person信息
     * @throws SSException
     */
    public boolean delAnswer2(int id) throws SSException;

    /**
     * 修改person信息
     * @throws SSException
     */
    public boolean updateAnswer2(Answer2 answer2) throws SSException;

    /**
     * 查找（根据id）
     * @throws SSException
     */
    public Answer2 selectById(int id) throws SSException;

    /**
     * 模糊查询
     * @throws SSException
     */
    public List<Answer2> select(String keyword) throws SSException;
}
