package com.pandawork.mapper.lunbo;

import com.pandawork.common.entity.lunbo.Lunbo;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * @Author:liangll
 * @Description:
 * @Date: 15:51 2018/8/3
 */
public interface LunboMapper {

    /**
     * 查询所有lunbo列表
     * @throws Exception
     */
    public List<Lunbo> listAllLunbo() throws Exception;

    /**
     * 增加lunbo
     * @param lunbo
     * @throws Exception
     */
    public boolean addLunbo(@Param("lunbo") Lunbo lunbo) throws Exception;

    /**
     *删除lunbo
     * @param id
     * @throws Exception
     */
    public boolean delLunbo(@Param("id") int id) throws Exception;

    /**
     * 修改lunbo
     * @param lunbo
     * @throws Exception
     */
    public boolean updateLunbo(@Param("lunbo") Lunbo lunbo) throws Exception;

    /**
     * 根据id查询信息
     * @param id
     * @returns
     * @throws Exception
     */
    public Lunbo selectById(@Param("id") int id) throws Exception;

}
