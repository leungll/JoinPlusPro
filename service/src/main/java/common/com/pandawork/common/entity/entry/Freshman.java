package com.pandawork.common.entity.entry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_entry_out")
@Entity
public class Freshman {
    //报名者id
    @Id
    int id;

    //报名者姓名
    @Column(name = "entry_name")
    String name;

    //报名者性别
    @Column(name = "entry_sex")
    String sex;

    //报名者学号
    @Column(name = "entry_number")
    int number;

    //报名者照片
    @Column(name = "entry_photo")
    String photo;

    //报名者民族
    @Column(name = "entry_nation")
    String nation;

    //报名者生源地
    @Column(name = "entry_nativePlace")
    String nativePlace;

    //报名者排名
    @Column(name = "entry_rank")
    int rank;

    //报名者年级总人数
    @Column(name = "entry_rankAll")
    int rankAll;

    //报名者专业
    @Column(name = "entry_major")
    String major;

    //报名者第一志愿
    @Column(name = "entry_volunteer_1")
    String volunteer1;

    //报名者第二志愿
    @Column(name = "entry_volunteer_2")
    String volunteer2;

    //报名者qq
    @Column(name = "entry_qq")
    int qq;

    //报名者电话号
    @Column(name = "entry_phone")
    String phone;

    //报名者自我介绍
    @Column(name = "entry_introduction")
    String introduction;

    //报名者报名原因
    @Column(name = "entry_reason")
    String reason;

    //报名者是否服从调剂
    @Column(name = "entry_yon")
    int yon;

    //报名者审核状态 审核未通过0 审核通过1 未审核2
    @Column(name = "entry_pass")
    String pass;

    /**
     * get和set方法
     * @return
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRankAll() {
        return rankAll;
    }

    public void setRankAll(int rankAll) {
        this.rankAll = rankAll;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getVolunteer1() {
        return volunteer1;
    }

    public void setVolunteer1(String volunteer1) {
        this.volunteer1 = volunteer1;
    }

    public String getVolunteer2() {
        return volunteer2;
    }

    public void setVolunteer2(String volunteer2) {
        this.volunteer2 = volunteer2;
    }

    public int getQq() {
        return qq;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getYon() {
        return yon;
    }

    public void setYon(int yon) {
        this.yon = yon;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 需要将toString()方法重写
     * @return
     */
    @Override
    public String toString() {
        return "Freshman{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", number=" + number +
                ", photo='" + photo + '\'' +
                ", nation='" + nation + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", rank=" + rank +
                ", rankAll=" + rankAll +
                ", major='" + major + '\'' +
                ", volunteer1='" + volunteer1 + '\'' +
                ", volunteer2='" + volunteer2 + '\'' +
                ", qq=" + qq +
                ", phone=" + phone +
                ", introduction='" + introduction + '\'' +
                ", reason='" + reason + '\'' +
                ", yon=" + yon +
                ", pass=" + pass +
                '}';
    }
}
