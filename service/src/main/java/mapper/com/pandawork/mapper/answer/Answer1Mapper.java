package com.pandawork.mapper.answer;

import com.pandawork.common.entity.answer.Answer1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 19:48
 */
public interface Answer1Mapper {

    /**
     * 查询所有answer1列表
     * @throws Exception
     */
    public List<Answer1> listAllAnswer1() throws Exception;

    /**
     * 增加person
     * @param answer1
     * @throws Exception
     */
    public boolean addAnswer1(@Param("answer1") Answer1 answer1) throws Exception;

    /**
     *删除person
     * @param id
     * @throws Exception
     */
    public boolean delAnswer1(@Param("id") int id) throws Exception;

    /**
     * 更新person
     * @param answer1
     * @throws Exception
     */
    public boolean updateAnswer1(@Param("answer1") Answer1 answer1) throws Exception;

    /**
     * 根据id查询信息
     * @param id
     * @returns
     * @throws Exception
     */
    public Answer1 selectById(@Param("id") int id) throws Exception;

    /**
     * 模糊查询
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Answer1> select(@Param("keyword") String keyword) throws Exception;

}
