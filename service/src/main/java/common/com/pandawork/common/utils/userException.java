package com.pandawork.common.utils;

import com.pandawork.core.common.exception.IBizExceptionMes;

/**
 * 登陆注册异常情况
 * @author 梁佳悦
 */
public enum userException implements IBizExceptionMes {
    SystemException("系统错误",0),
    UserNameIsWrong("用户名错误", 000),
    PasswordIsWrong("密码错误", 001),
    ListUserAll("获取用户列表失败",002),
    UserNameNotNull("用户名不能为空",003),
    PasswordNotNull("密码不能为空",004),
    DelUserFail("删除用户失败",005),
    UpdateUserFail("修改用户失败",006),
    SerUserFail("根据用户名查询用户失败",007),
//    AddImagesFail("上传头像失败",009),
    ;

    private String msg;

    private Integer code;

    userException(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    @Override
    public String getMes() {
        return null;
    }

    @Override
    public int getCode() {
        return 0;
    }

}
