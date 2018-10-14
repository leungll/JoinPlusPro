package com.pandawork.service.answer.impl;

import com.pandawork.common.entity.answer.Answer2;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.answer.Answer2Mapper;
import com.pandawork.service.answer.Answer2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * @author : kongyy
 * @time : 2018/8/2 20:41
 */

@Service("answer2Service")
public class Answer2ServiceImpl implements Answer2Service{

        @Autowired
        Answer2Mapper answer2Mapper;

        @Autowired
        protected CommonDao commonDao;

        @Override
        public List<Answer2> listAllAnswer2() throws SSException {
            List<Answer2> answer2list = Collections.emptyList();
            try {
                answer2list = answer2Mapper.listAllAnswer2();
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.ListStudentAll, e);
            }
            return answer2list;
        }

        @Override
        @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
        public boolean addAnswer2(Answer2 answer2) throws SSException {
            if (Assert.isNull(answer2)) {
                return false;
            }
//            Assert.isNotNull(answer2.getInquiry_answer2(), NFException.ListStudentAll);
//            Assert.isNotNull(answer2.getInquiry_answer1(), NFException.ListStudentAll);
            try {
                return answer2Mapper.addAnswer2(answer2);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.SystemException, e);
            }
        }

        @Override
        @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
        public boolean delAnswer2(int id) throws SSException {
            if (Assert.lessOrEqualZero(id)) {
                return false;
            }
            try {
                return answer2Mapper.delAnswer2(id);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.ListStudentAll, e);
            }
        }

        @Override
        @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
        public boolean updateAnswer2(Answer2 answer2) throws SSException {
            if (Assert.isNull(answer2)) {
                return false;
            }
            try {
                return answer2Mapper.updateAnswer2(answer2);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.ListStudentAll, e);
            }
        }

        @Override
        public Answer2 selectById(int id) throws SSException {
            if (Assert.lessOrEqualZero(id)) {
                return null;
            }
            try {
                return answer2Mapper.selectById(id);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.ListStudentAll, e);
            }
        }

        @Override
        public List<Answer2> select(String keyword) throws SSException {
            if (Assert.isNull(keyword)) {
                return null;
            }
            try {
                return answer2Mapper.select(keyword);
            } catch (Exception e) {
                LogClerk.errLog.error(e);
                throw SSException.get(NFException.ListStudentAll, e);
            }
        }
}

