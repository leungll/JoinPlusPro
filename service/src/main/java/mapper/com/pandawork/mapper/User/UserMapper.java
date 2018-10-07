package com.pandawork.mapper.User;

import com.pandawork.common.entity.User.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户登录Mapper层
 * Created by 梁佳悦 on 2018/7/31
 */
public interface UserMapper {

    /**
     * 查询所有用户列表
     * @throws Exception
     * @return
     */
    public List<User>listAllUser() throws Exception;

//    /**
//     * 展示各部门成员
//     * @throws Exception
//     * @return
//     */
//    public List<User>showAllMember() throws Exception;

    /**
     * 展示产品部成员
     * @throws Exception
     * @return
     */
    public List<User>showAllMember1() throws Exception;

    /**
     * 展示前端部成员
     * @throws Exception
     * @return
     */
    public List<User>showAllMember2() throws Exception;

    /**
     * 展示后端部成员
     * @throws Exception
     * @return
     */
    public List<User>showAllMember3() throws Exception;

    /**
     * 增加用户（即注册）
     * @param user
     * @throws Exception
     */
    public void addUser(@Param("user") User user) throws Exception;

    /**
     * 删除用户（超管可能用到的方法）
     * @param id
     * @throws Exception
     */
    public void delUser(@Param("id") int id) throws Exception;

    /**
     * 修改用户（超管可能用到的方法）
     * @param user
     * @throws Exception
     */
    public void updateUser(@Param("user") User user) throws Exception;

    /**
     * 查询用户（根据用户名）
     * @param userName
     * @throws Exception
     */
    public List<User>serUser(@Param("userName") String userName) throws Exception;


    /**
     * 判断密码是否正确
     * @param password
     * @throws Exception
     */
    public List<User>pswIsTrue(@Param("userName") String userName, @Param("userPassword") String password) throws Exception;

    /**
     * 上传头像
     */
    public void addImages(@Param("images") String userImages, @Param("userName") String userName)throws Exception;

}