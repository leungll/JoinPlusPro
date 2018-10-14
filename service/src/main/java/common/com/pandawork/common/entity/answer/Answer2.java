package com.pandawork.common.entity.answer;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author : kongyy
 * @time : 2018/8/2 20:29
 */
public class Answer2 {

    @Id
    private Integer id;

    @Column(name = "inquiry_answer2")
    private String inquiry_answer2;

    public Integer getId() {
        return id;
    }

    @Column(name = "inquiry_answer1")
    private String inquiry_answer1;

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInquiry_answer2() {
        return inquiry_answer2;
    }

    public String getInquiry_answer1() {
        return inquiry_answer1;
    }


    public void setInquiry_answer2(String inquiry_answer2) {
        this.inquiry_answer2 = inquiry_answer2;
    }

    public void setInquiry_answer1(String inquiry_answer1) {
        this.inquiry_answer1 = inquiry_answer1;
    }


    @Override
    public String toString() {
        return "Answer2{" +
                "id=" + id +
                ", inquiry_answer2='" + inquiry_answer2 + '\'' +
                ", inquiry_answer1='" + inquiry_answer1 + '\'' +
                '}';
    }
}
