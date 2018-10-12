package com.pandawork.service.entry;

import com.pandawork.common.entity.entry.Freshman;
import com.pandawork.core.common.exception.SSException;

import java.util.List;

public interface FreshmanService {
    /**
     * 列出所有报名者
     * @return
     * @throws SSException
     */
    public List<Freshman> listAllFreshman() throws SSException;

    /**
     * 增加报名者
     * @param freshman
     * @throws SSException
     */
    public void addFreshman(Freshman freshman) throws SSException;

    /**
     * 增加图片
     * @param photo
     * @return
     * @throws SSException
     */
    public boolean addPhoto(String photo) throws SSException;

    /**
     * 删除报名者
     * @param id
     * @return
     * @throws SSException
     */
    public boolean deleteFreshman(int id) throws SSException;

    /**
     * 修改报名者信息
     * @param freshman
     * @throws Exception
     */
    public void updateFreshman(Freshman freshman) throws SSException;

    /**
     * 搜索报名者第一志愿
     * @param key1
     * @return
     * @throws Exception
     */
    public List<Freshman> searchVolunteer1(String key1) throws SSException;

    /**
     * 搜索报名者第二志愿
     * @param key2
     * @return
     * @throws Exception
     */
    public List<Freshman> searchVolunteer2(String key2) throws SSException;

    /**
     * 搜索报名者审核情况
     * @param pass
     * @return
     * @throws SSException
     */
    public List<Freshman> searchPass(String pass) throws SSException;

    /**
     * 得到报名者信息
     * @param id
     * @return
     * @throws Exception
     */
    public Freshman getFreshman(int id) throws SSException;

    /**
     * 根据电脑得到id
     * @param number
     * @return
     * @throws SSException
     */
    public Freshman getIdByNumber(int number) throws SSException;
}
