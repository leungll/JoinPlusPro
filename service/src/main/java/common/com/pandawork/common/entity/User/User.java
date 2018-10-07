package com.pandawork.common.entity.User;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * user实体类
 * Created by 梁佳悦 on 2018/7/31
 */

@Table(name = "t_member_out")
@Entity
public class User extends AbstractEntity {
    @Id
    public Integer id;

    //成员姓名
    @Column(name = "member_name")
    private String userName;

    //成员密码
    @Column(name = "member_password")
    private String userPassword;

    //成员部门
    @Column(name = "member_department")
    private String userDepartment;

    //成员学号
    @Column(name = "member_number")
    private int userNumber;

    //成员年级
    @Column(name = "member_grade")
    private String userGrade;

    //成员职务
    @Column(name = "member_job")
    private String userJob;

    //成员介绍
    @Column(name = "member_introduction")
    private String userIntroduction;

    //成员头像
    @Column(name = "member_image")
    private String userImage;

    //成员权限
    @Column(name = "member_power")
    private int userPower;


    //get set 方法


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(String userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserJob() {
        return userJob;
    }

    public void setUserJob(String userJob) {
        this.userJob = userJob;
    }

    public String getUserIntroduction() {
        return userIntroduction;
    }

    public void setUserIntroduction(String userIntroduction) {
        this.userIntroduction = userIntroduction;
    }

    public String getUserImage() {
        return userImage;
    }

    public void setUserImage(String userImage) {
        this.userImage = userImage;
    }

    public int getUserPower() {
        return userPower;
    }

    public void setUserPower(int userPower) {
        this.userPower = userPower;
    }

    //toString方法


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userDepartment='" + userDepartment + '\'' +
                ", userNumber=" + userNumber +
                ", userGrade='" + userGrade + '\'' +
                ", userJob='" + userJob + '\'' +
                ", userIntroduction='" + userIntroduction + '\'' +
                ", userImage='" + userImage + '\'' +
                ", userPower=" + userPower +
                '}';
    }
}