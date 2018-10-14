package com.pandawork.common.entity.answer;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : kongyy
 * @time : 2018/7/31 20:48
 */

@Table(name = "t_inquiry_in")
@Entity
public class Answer1 extends AbstractEntity{

    @Id
    private Integer id;

    @Column(name = "inquiry_answer1")
    private String inquiry_answer1;


    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public String getInquiry_answer1() {
        return inquiry_answer1;
    }

    public void setInquiry_answer1(String inquiry_answer1) {
        this.inquiry_answer1 = inquiry_answer1;
    }


    @Override
    public String toString() {
        return "Answer1{" +
                "id=" + id +
                ", inquiry_answer1='" + inquiry_answer1 + '\'' +
                '}';
    }
}

