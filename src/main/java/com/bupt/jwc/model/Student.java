package com.bupt.jwc.model;

public class Student {
    private int sid;

    private String sname;

    private Sex sex;

    private int sclass;

    public Student(){}

    public Student(int sid, String sname, Sex sex,int sclass) {
        this.sid = sid;
        this.sname = sname;
        this.sex = sex;
        this.sclass = sclass;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getSclass() {
        return sclass;
    }

    public void setSclass(int sclass) {
        this.sclass = sclass;
    }
}
