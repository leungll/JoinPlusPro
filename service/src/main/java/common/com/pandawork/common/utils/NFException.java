package com.pandawork.common.utils;

import com.pandawork.core.common.exception.IBizExceptionMes;

/**
 * NFException
 *
 * @author: zhangteng
 * @time: 2015/3/24 16:55
 */
public enum  NFException implements IBizExceptionMes {
    SystemException("系统内部异常", 1),

    UserNameNotNull("用户名不能为空", 10001),
    PasswordNotNull("密码不能为空", 10002),
//    ListStudentAll("获取学生列表失败",10003),
//    CountAll("获取学生信息数目失败",10004 ),
//    StudentNameNotNull("获取学生姓名为空",10005 ),
//    StudentNumLessOrEqualZero("学生学号小于零",10006 ),
//    SexNotNull( "获取学生性别为空",10007),
//    GradeLessOrEqualZero("获取学生年级小于零",10008),
//    ClassNumLessOrEqualZero("获取学生年级小于零",10009),
//    CollegeNotNull("获取学生学院为空",10010),
//    BirthdayNotNull("获取学生生日为空",10011),
//    GoodStudentNotNull("获取是否为好学生为空",10012),
//    DelStudentNull("删除学生信息失败",10013),
//    UpdateStudentFailed("更新学生信息失败",10014),
//    UpdateStudentByIdFailed("按照id查询学生信息失败",10016),
//    QueryByNameFailed("按照姓名查询学生信息失败",10017 ),

    ListPersonAll("获取人物列表失败",2000),
    PersonNameNotNull("获取人物姓名为空",2001),
    PersonBirthdayNotNull("获取人物生日为空",2002),
    PersonDepartmentNotNull("获取人物司职为空",2003),
    PersonTeamNotNull("获取人物球队为空",2004),
    PersonCommentNotNull("获取人物评价为空",2005),
    DelPersonNull("删除人物信息失败",2006),
    UpdatePersonFailed("修改人物失败",2007),
    SelectPersonFailed("查询人物失败",2008),
    ListUserAll("获取用户列表失败",3000),
    UserNameFailed("用户名错误",3001),
    PasswordFailed("用户密码错误",3002),
    ;

    private String msg;

    private Integer code;

    NFException(String msg, Integer code) {
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
