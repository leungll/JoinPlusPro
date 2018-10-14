package com.pandawork.common.entity.tonggao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_tonggao_beta")
@Entity
public class TongGao {

    @Id
    private int id;

    @Column(name = "tg_dateshow")
    private String dateshow;

    @Column(name = "tg_file")
    private String file;

    @Column(name = "tg_title")
    private String title;

    @Column(name = "tg_date")
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDateshow() {
        return dateshow;
    }

    public void setDateshow(String dateshow) {
        this.dateshow = dateshow;
    }

    @Override
    public String toString() {
        return "TongGao{" +
                "id=" + id +
                ", dateshow='" + dateshow + '\'' +
                ", file='" + file + '\'' +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
