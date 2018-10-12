package com.pandawork.service.lunbo.impl;

import com.pandawork.common.entity.lunbo.Lunbo;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.lunbo.LunboMapper;
import com.pandawork.service.LunboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author:liangll
 * @Description:
 * @Date: 16:11 2018/8/3
 */
@Service("lunboService")
public class LunboServiceImpl implements LunboService {

    @Autowired
    LunboMapper lunboMapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public List<Lunbo> listAllLunbo() throws SSException {
        List<Lunbo> lunboList = Collections.emptyList();
        try {
            lunboList = lunboMapper.listAllLunbo();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
        return lunboList;
    }

    @Override
    public boolean addLunbo(Lunbo lunbo) throws SSException {
        try {
            return lunboMapper.addLunbo(lunbo);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean delLunbo(int id) throws SSException {
        try {
            return lunboMapper.delLunbo(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean updateLunbo(Lunbo lunbo) throws SSException {
        try {
            return lunboMapper.updateLunbo(lunbo);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public Lunbo selectById(int id) throws SSException {
        try {
            return lunboMapper.selectById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }
}
