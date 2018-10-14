package com.pandawork.mapper.project;

import com.pandawork.common.entity.project.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/7/31 23:26
 */
public interface ProjectMapper {

    /**
     * 查询所有project列表
     * @throws Exception
     */
    public List<Project> listAllProject() throws Exception;

    /**
     * 增加person
     * @param project
     * @throws Exception
     */
    public boolean addProject(@Param("project") Project project) throws Exception;

    /**
     *删除person
     * @param id
     * @throws Exception
     */
    public boolean delProject(@Param("id") int id) throws Exception;

    /**
     * 更新person
     * @param project
     * @throws Exception
     */
    public boolean updateProject(@Param("project") Project project) throws Exception;

    /**
     * 根据id查询信息
     * @param id
     * @returns
     * @throws Exception
     */
    public Project selectById(@Param("id") int id) throws Exception;

    /**
     * 模糊查询
     * @param keyword
     * @return
     * @throws Exception
     */
    public List<Project> select(@Param("keyword") String keyword) throws Exception;
}

