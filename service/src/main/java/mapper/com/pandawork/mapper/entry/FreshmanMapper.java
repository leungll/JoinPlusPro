package com.pandawork.mapper.entry;

import com.pandawork.common.entity.entry.Freshman;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FreshmanMapper {
    /**
     * 列出所有报名者
     * @return
     * @throws Exception
     */
    public List<Freshman> listAllFreshman() throws Exception;

    /**
     * 增加报名者
     * @param freshman
     * @throws Exception
     */
    public void addFreshman(@Param("Freshman") Freshman freshman) throws Exception;

    /**
     * 增加照片
     * @param photo
     * @return
     * @throws Exception
     */
    public boolean addPhoto(@Param("photo") String photo) throws Exception;

    /**
     * 删除报名者
     * @param id
     * @return
     * @throws Exception
     */
    public boolean deleteFreshman(@Param("id") int id) throws Exception;

    /**
     * 修改报名者
     * @param freshman
     * @throws Exception
     */
    public void updateFreshman(@Param("Freshman") Freshman freshman) throws Exception;

    /**
     * 搜索报名者的第一志愿
     * @param key1
     * @return
     * @throws Exception
     */
    public List<Freshman> searchVolunteer1(@Param("key1") String key1) throws Exception;

    /**
     * 搜索报名者的第二志愿
     * @param key2
     * @return
     * @throws Exception
     */
    public List<Freshman> searchVolunteer2(@Param("key2") String key2) throws Exception;

    /**
     * 搜索报名者的审核情况
     * @param pass
     * @return
     * @throws Exception
     */
    public List<Freshman> searchPass(@Param("pass") String pass) throws Exception;

    /**
     * 得到报名者信息
     * @param id
     * @return
     * @throws Exception
     */
    public Freshman getFreshman(@Param("id") int id) throws Exception;

    /**
     * 根据姓名得到id
     * @param number
     * @return
     * @throws Exception
     */
    public Freshman getIdByNumber(@Param("number") int number) throws Exception;
}

