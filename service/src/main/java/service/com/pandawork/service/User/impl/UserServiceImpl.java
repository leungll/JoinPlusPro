package com.pandawork.service.User.impl;

import com.pandawork.common.entity.User.User;
import com.pandawork.common.utils.userException;
import com.pandawork.core.common.exception.SSException;
import com.pandawork.core.common.log.LogClerk;
import com.pandawork.core.common.util.Assert;
import com.pandawork.core.framework.dao.CommonDao;
import com.pandawork.mapper.User.UserMapper;
import com.pandawork.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collections;
import java.util.List;

/**
 * 用户登陆管理service层的实现类
 * Created by 梁佳悦 on 2018/7/31.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Autowired
    CommonDao commonDao;

    /**
     * 用户列表
     */
    @Override
    public List<User>listAllUser()throws SSException{
        List<User>listAllUser = Collections.emptyList();
        try {
            listAllUser = userMapper.listAllUser();
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.ListUserAll, e);
        }
        return listAllUser;
    }

//    /**
//     * 展示各部门成员
//     */
//    @Override
//    public List<User>showAllMember()throws Exception{
//        List<User>showAllMember = Collections.emptyList();
//        try {
//            showAllMember = userMapper.showAllMember();
//        }catch (Exception e){
//            LogClerk.errLog.error(e);
//        }
//        return showAllMember;
//    }

    /**
     * 展示产品部成员
     */
    @Override
    public List<User>showAllMember1()throws Exception{
        List<User>showAllMember1 = Collections.emptyList();
        try {
            showAllMember1 = userMapper.showAllMember1();
        }catch (Exception e){
            LogClerk.errLog.error(e);
        }
        return showAllMember1;
    }

    /**
     * 展示前端部成员
     */
    @Override
    public List<User>showAllMember2()throws Exception{
        List<User>showAllMember2 = Collections.emptyList();
        try {
            showAllMember2 = userMapper.showAllMember2();
        }catch (Exception e){
            LogClerk.errLog.error(e);
        }
        return showAllMember2;
    }

    /**
     * 展示后端部成员
     */
    @Override
    public List<User>showAllMember3()throws Exception{
        List<User>showAllMember3 = Collections.emptyList();
        try {
            showAllMember3 = userMapper.showAllMember3();
        }catch (Exception e){
            LogClerk.errLog.error(e);
        }
        return showAllMember3;
    }

    /**
     * 增加用户
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void addUser(User user)throws SSException{
        //判空 查重
        if (Assert.isNull(user)) {
            return;
        }
//        Assert.isNotNull(user.getUserName(),userException.UserNameNotNull);
//        Assert.isNotNull(user.getUserPassword(), userException.PasswordNotNull);
        try {
            userMapper.addUser(user);
            System.out.println(",,,");
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.SystemException, e);
        }
    }

    /**
     * 删除用户
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void delUser(int id) throws SSException{
        try {
            userMapper.delUser(id);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.DelUserFail,e);
        }
    }

    /**
     * 修改用户
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void updateUser(User user)throws SSException{
        try{
            userMapper.updateUser(user);
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.UpdateUserFail,e);
        }
        System.out.println("...");
    }

    /**
     * 查询用户（根据用户名）
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean serUser(String userName)throws SSException{
        boolean flag = false;
        try {
            if(userMapper.serUser(userName)!=null)
                flag = true;
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.SerUserFail,e);
        }
        return flag;
    }

    /**
     * 通过用户名查询用户信息
     **/
    public User findUser(String username)throws Exception{
        List<User> list = userMapper.serUser(username);
        User user = new User();
        user = list.get(0);
        return user;
    }


    /**
     * 判断密码是否正确
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public boolean pswIsTrue(String userName,String userPassword)throws SSException{
        boolean flag = false;
        try {
            List<User> list = userMapper.pswIsTrue(userName,userPassword);
            if(list.size()!=0)
                flag = true;
        }catch (Exception e){
            LogClerk.errLog.error(e);
            throw SSException.get(userException.PasswordIsWrong,e);
        }
        return flag;
    }


    /**
     * 上传头像
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {SSException.class, Exception.class, RuntimeException.class})
    public void addImages(String userImages,String userName)throws Exception{
        try {
            userMapper.addImages(userImages,userName);
        }catch (Exception e){
            LogClerk.errLog.error(e);
        }
    }
}