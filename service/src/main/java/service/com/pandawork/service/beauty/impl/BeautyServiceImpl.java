package com.pandawork.service.beauty.impl;

import com.pandawork.common.entity.beauty.Beauty;
import com.pandawork.common.utils.NFException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.beauty.BeautyMapper;
import com.pandawork.service.BeautyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

/**
 * @Author:liangll
 * @Description:
 * @Date: 0:31 2018/8/4
 */
@Service("beautyService")
public class BeautyServiceImpl implements BeautyService{

    @Autowired
    BeautyMapper beautyMapper;

    @Autowired
    protected CommonDao commonDao;

    @Override
    public List<Beauty> listAllBeauty() throws SSException {
        List<Beauty> lunboList = Collections.emptyList();
        try {
            lunboList = beautyMapper.listAllBeauty();
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
        return lunboList;
    }

    @Override
    public boolean addBeauty(Beauty lunbo) throws SSException {
        try {
            return beautyMapper.addBeauty(lunbo);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean delBeauty(int id) throws SSException {
        try {
            return beautyMapper.delBeauty(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public boolean updateBeauty(Beauty beauty) throws SSException {
        try {
            return beautyMapper.updateBeauty(beauty);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }

    @Override
    public Beauty selectById(int id) throws SSException {
        try {
            return beautyMapper.selectById(id);
        } catch (Exception e) {
            LogClerk.errLog.error(e);
            throw SSException.get(NFException.SystemException, e);
        }
    }
}
