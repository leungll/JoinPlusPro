package com.pandawork.service.activity;

import com.pandawork.common.entity.activity.Activity;
import com.pandawork.core.common.exception.SSException;
import java.util.List;
public interface ActivityService {
    /**
     * 活动信息列表
     * @return
     * @throws SSException
     */
    public List<Activity> listAll( ) throws SSException;
    /**
     * 增加活动信息
     * @throws SSException
     */
    public void newActivity(Activity activity) throws SSException;

    /**
     * 删除活动信息
     * @throws SSException
     */
    public boolean delById(int id) throws SSException;

    /**
     * 更新活动信息
     * @throws SSException
     */
    public void update(Activity activity) throws SSException;

    /**
     * 根据ID查询活动
     * @param id
     * @return
     * @throws Exception
     */
    public Activity queryById(int id) throws SSException;

}
