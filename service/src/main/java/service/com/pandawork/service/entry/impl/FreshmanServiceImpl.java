package com.pandawork.service.entry.impl;

import com.pandawork.common.entity.entry.Freshman;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.entry.FreshmanMapper;
import com.pandawork.service.entry.FreshmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service("freshmanService")
public class FreshmanServiceImpl implements FreshmanService {
    @Autowired
    FreshmanMapper freshmanMapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public List<Freshman> listAllFreshman() throws SSException {
        List<Freshman> freshmanList = Collections.emptyList();
        try {
            freshmanList = freshmanMapper.listAllFreshman();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
        return freshmanList;
    }

    @Override
    public void addFreshman(Freshman freshman) throws SSException{
        try {
            freshmanMapper.addFreshman(freshman);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean addPhoto(String photo) throws SSException{
        try{
            return freshmanMapper.addPhoto(photo);
        }catch(Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean deleteFreshman(int id) throws SSException{
        try {
            return freshmanMapper.deleteFreshman(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.DelStudentNull, e);
        }
    }

    @Override
    public void updateFreshman(Freshman freshman) throws SSException{
        try {
            freshmanMapper.updateFreshman(freshman);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.UpdateStudentFailed, e);
        }
    }

    @Override
    public List<Freshman> searchVolunteer1(String key1) throws SSException{
        List<Freshman> freshmanList = Collections.emptyList();
        try {
            freshmanList = freshmanMapper.searchVolunteer1(key1);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
        return freshmanList;
    }

    @Override
    public List<Freshman> searchVolunteer2(String key2) throws SSException{
        List<Freshman> freshmanList = Collections.emptyList();
        try {
            freshmanList = freshmanMapper.searchVolunteer2(key2);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
        return freshmanList;
    }

    @Override
    public List<Freshman> searchPass(String pass) throws SSException{
        List<Freshman> freshmanList = Collections.emptyList();
        try {
            freshmanList = freshmanMapper.searchPass(pass);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.ListStudentAll, e);
        }
        return freshmanList;
    }

    @Override
    public Freshman getFreshman(int id) throws SSException{
        try {
            return freshmanMapper.getFreshman(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.queryStudentByIdFailed, e);
        }
    }

    @Override
    public Freshman getIdByNumber(int number) throws SSException {
        try {
            return freshmanMapper.getIdByNumber(number);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.QueryByNameFailed, e);
        }
    }
}
