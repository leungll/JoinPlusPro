package com.pandawork.service;

import com.pandawork.common.entity.lunbo.Lunbo;
import com.pandawork.core.common.exception.SSException;

import java.util.List;
/**
 * @Author:liangll
 * @Description:
 * @Date: 16:36 2018/8/3
 */
public interface LunboService {

    /**
     * lunbo信息列表
     * @return
     * @throws SSException
     */
    public List<Lunbo> listAllLunbo() throws SSException;

    /**
     * 增加lunbo信息
     * @throws SSException
     */
    public boolean addLunbo(Lunbo lunbo)throws SSException;

    /**
     * 删除lunbo信息
     * @throws SSException
     */
    public boolean delLunbo(int id) throws SSException;

    /**
     * 修改lunbo信息
     * @throws SSException
     */
    public boolean updateLunbo(Lunbo lunbo) throws SSException;

    /**
     * 查找（根据id）
     * @throws SSException
     */
    public Lunbo selectById(int id) throws SSException;
}
