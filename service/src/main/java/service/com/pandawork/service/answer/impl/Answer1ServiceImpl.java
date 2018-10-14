package com.pandawork.service.answer.impl;

import com.pandawork.common.entity.answer.Answer1;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.answer.Answer1Mapper;
import com.pandawork.service.answer.Answer1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 19:55
 */

@Service("answer1Service")
public class Answer1ServiceImpl implements Answer1Service {

    @Autowired
    Answer1Mapper answer1Mapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public List<Answer1> listAllAnswer1() throws SSException {
        List<Answer1> answer1list = Collections.emptyList();
        try {
            answer1list = answer1Mapper.listAllAnswer1();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
        return answer1list;
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean addAnswer1(Answer1 answer1) throws SSException {
        if (Assert.isNull(answer1)) {
            return false;
        }
        Assert.isNotNull(answer1.getInquiry_answer1(), NFException.ListStudentAll);
        try {
            return answer1Mapper.addAnswer1(answer1);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean delAnswer1(int id) throws SSException {
        if (Assert.lessOrEqualZero(id)) {
            return false;
        }
        try {
            return answer1Mapper.delAnswer1(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
    }


    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean updateAnswer1(Answer1 answer1) throws SSException {
        if (Assert.isNull(answer1)) {
            return false;
        }
        try {
            return answer1Mapper.updateAnswer1(answer1);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
    }

    @Override
    public Answer1 selectById(int id) throws SSException {
        if (Assert.lessOrEqualZero(id)) {
            return null;
        }
        try {
            return answer1Mapper.selectById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
    }


    @Override
    public List<Answer1> select(String keyword) throws SSException {
        if (Assert.isNull(keyword)) {
            return null;
        }
        try {
            return answer1Mapper.select(keyword);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
    }


}
