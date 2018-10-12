package com.pandawork.service;

import com.pandawork.common.entity.beauty.Beauty;
import com.pandawork.core.common.exception.SSException;

import java.util.List;
/**
 * @Author:liangll
 * @Description:
 * @Date: 0:29 2018/8/4
 */
public interface BeautyService {
    /**
     * beauty信息列表
     * @return
     * @throws SSException
     */
    public List<Beauty> listAllBeauty() throws SSException;

    /**
     * 增加beauty信息
     * @throws SSException
     */
    public boolean addBeauty(Beauty beauty)throws SSException;

    /**
     * 删除lunbo信息
     * @throws SSException
     */
    public boolean delBeauty(int id) throws SSException;

    /**
     * 修改beauty信息
     * @throws SSException
     */
    public boolean updateBeauty(Beauty beauty) throws SSException;

    /**
     * 查找（根据id）
     * @throws SSException
     */
    public Beauty selectById(int id) throws SSException;
}
