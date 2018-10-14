package com.pandawork.service.project.impl;


import com.pandawork.common.entity.project.Project;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.project.ProjectMapper;
import com.pandawork.service.project.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 15:00
 */

@Service("projectService")
public class ProjectServiceImpl implements ProjectService{

    @Autowired
    ProjectMapper projectMapper;

    @Autowired
    protected CommonDao commonDao;


    @Override
    public List<Project> listAllProject() throws SSException {
        List<Project> projectlist = Collections.emptyList();
        try {
            projectlist = projectMapper.listAllProject();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SexNotNull, e);
        }
        return projectlist;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean addProject(Project project) throws SSException {
        if (Assert.isNull(project)) {
            return false;
        }
        Assert.isNotNull(project.getProject_name(), NFException.SexNotNull);
        Assert.isNotNull(project.getProject_date(), NFException.SexNotNull);
        Assert.isNotNull(project.getProject_content(), NFException.SexNotNull);
        Assert.isNotNull(project.getProject_finish(), NFException.SexNotNull);
        try {
            return projectMapper.addProject(project);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean delProject(int id) throws SSException {
        if (Assert.lessOrEqualZero(id)) {
            return false;
        }
        try {
            return projectMapper.delProject(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SexNotNull, e);
        }
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean updateProject(Project project) throws SSException {
        if (Assert.isNull(project)) {
            return false;
        }
        try {
            return projectMapper.updateProject(project);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SexNotNull, e);
        }
    }

    @Override
    public Project selectById(int id) throws SSException {
        if (Assert.lessOrEqualZero(id)) {
            return null;
        }
        try {
            return projectMapper.selectById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SexNotNull, e);
        }
    }


    @Override
    public List<Project> select(String keyword) throws SSException {
        if (Assert.isNull(keyword)) {
            return null;
        }
        try {
            return projectMapper.select(keyword);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SexNotNull, e);
        }
    }
}

