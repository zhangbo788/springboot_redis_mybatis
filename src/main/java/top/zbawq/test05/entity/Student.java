package top.zbawq.test05.entity;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer id;
    private String name;
    private String des;

    public Student(Integer id, String name, String des) {
        this.id = id;
        this.name = name;
        this.des = des;
    }
    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", des='" + des + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
