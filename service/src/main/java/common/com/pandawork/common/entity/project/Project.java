package com.pandawork.common.entity.project;

import com.pandawork.core.common.entity.AbstractEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : kongyy
 * @time : 2018/7/31 20:47
 */

@Table(name = "t_project_in")
@Entity
public class Project extends AbstractEntity{


    @Id
    private Integer id;

    @Column(name = "project_name")
    private String project_name;

    @Column(name = "project_date")
    private String project_date;

    @Column(name = "project_finish")
    private String project_finish;

    @Column(name = "project_content")
    private String project_content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getProject_date() {
        return project_date;
    }

    public void setProject_date(String project_date) {
        this.project_date = project_date;
    }

    public String getProject_finish() {
        return project_finish;
    }

    public void setProject_finish(String project_finish) {
        this.project_finish = project_finish;
    }

    public String getProject_content() {
        return project_content;
    }

    public void setProject_content(String project_content) {
        this.project_content = project_content;
    }


    @Override
    public String toString() {
        return "project{" +
                "id=" + id +
                ", project_name='" + project_name + '\'' +
                ", project_date='" + project_date + '\'' +
                ", project_finish='" + project_finish + '\'' +
                ", project_content='" + project_content + '\'' +
                '}';
    }
}
