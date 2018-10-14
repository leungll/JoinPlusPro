package com.pandawork.service.project;


import com.pandawork.common.entity.project.Project;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 14:51
 */
public interface ProjectService {

    /**
     * prpject信息列表
     * @return
     * @throws SSException
     */
    public List<Project> listAllProject() throws SSException;

    /**
     * 增加project信息
     * @throws SSException
     */
    public boolean addProject(Project project)throws SSException;

    /**
     * 删除person信息
     * @throws SSException
     */
    public boolean delProject(int id) throws SSException;

    /**
     * 修改person信息
     * @throws SSException
     */
    public boolean updateProject(Project project) throws SSException;

    /**
     * 查找（根据id）
     * @throws SSException
     */
    public Project selectById(int id) throws SSException;

    /**
     * 模糊查询
     * @throws SSException
     */
    public List<Project> select(String keyword) throws SSException;
}

