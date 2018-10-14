package com.pandawork.mapper.answer;

import com.pandawork.common.entity.answer.Answer2;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 20:34
 */
public interface Answer2Mapper {

    /**
     * 查询所有answer列表
     * @throws Exception
     */
    public List<Answer2> listAllAnswer2() throws Exception;

    /**
     * 增加person
     * @param answer2
     * @throws Exception
     */
    public boolean addAnswer2(@Param("answer2") Answer2 answer2) throws Exception;

    /**
     *删除person
     * @param id
     * @throws Exception
     */
    public boolean delAnswer2(@Param("id") int id) throws Exception;

    /**
     * 更新person
     * @param answer2
     * @throws Exception
     */
    public boolean updateAnswer2(@Param("answer2") Answer2 answer2) throws Exception;

    /**
     * 根据id查询信息
     * @param id
     * @returns
     * @throws Exception
     */
    public Answer2 selectById(@Param("id") int id) throws Exception;

    /**
     * 模糊查询
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Answer2> select(@Param("keyword") String keyword) throws Exception;

}
