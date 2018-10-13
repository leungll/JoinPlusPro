package com.pandawork.mapper.activity;

import com.pandawork.common.entity.activity.Activity;
import org.apache.ibatis.annotations.Param;
import java.util.List;
public interface ActivityMapper {
    /**
     * 列出所有的活动
     */
    public List<Activity> listAll() throws Exception;
    /**
     * 增加活动
     */
    public void newActivity(@Param("activity")Activity activity) throws Exception;
    /**
     *删除活动
     */
    public boolean delById(@Param("id")int id) throws Exception;
    /**
     * 修改活动
     */
    public void update(@Param("activity")Activity activity)throws Exception;
    /**
     * 通过id查找活动
     */
    public Activity queryById(@Param("id")int id)throws Exception;
    /**
     * 通过活动名列出活动
     */
    public  List<Activity> queryByTitle(@Param("title")String title)throws  Exception;
}
