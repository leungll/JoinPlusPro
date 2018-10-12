package com.pandawork.mapper.beauty;

import com.pandawork.common.entity.beauty.Beauty;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Author:liangll
 * @Description:
 * @Date: 0:25 2018/8/4
 */
public interface BeautyMapper {

    /**
     * 查询所有beauty列表
     * @throws Exception
     */
    public List<Beauty> listAllBeauty() throws Exception;

    /**
     * 增加beauty
     * @param beauty
     * @throws Exception
     */
    public boolean addBeauty(@Param("beauty") Beauty beauty) throws Exception;

    /**
     *删除beauty
     * @param id
     * @throws Exception
     */
    public boolean delBeauty(@Param("id") int id) throws Exception;

    /**
     * 修改beauty
     * @param beauty
     * @throws Exception
     */
    public boolean updateBeauty(@Param("beauty") Beauty beauty) throws Exception;

    /**
     * 根据id查询信息
     * @param id
     * @returns
     * @throws Exception
     */
    public Beauty selectById(@Param("id") int id) throws Exception;
}
