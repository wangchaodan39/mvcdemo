package com.entity;

import com.jdbc.util.annotation.Column;
import com.jdbc.util.annotation.PK;

import java.util.Date;

public class Student {
    /*
    stuId;
	private String stuName;
	private String stuSex;
	private int stuAge;
	private Date stuBirth;
     */


    private  Integer stuId;

    private  String stuName;
    private String stuSex;
    private  int stuAge;
    private Date stiuBirth;

    public Student() {
    }

    public Student(String stuName, String stuSex, int stuAge, Date stiuBirth) {
        this.stuName = stuName;
        this.stuSex = stuSex;
        this.stuAge = stuAge;
        this.stiuBirth = stiuBirth;
    }
    @PK(auto = true)
    @Column(value = "stu_id")
    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }
     @Column(value = "stu_name")
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
   @Column(value = "stu_sex")
    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }
    @Column(value = "stu+age")
    public int getStuAge() {
        return stuAge;
    }

    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }
   @Column(value = "stu_birth")
    public Date getStiuBirth() {
        return stiuBirth;
    }

    public void setStiuBirth(Date stiuBirth) {
        this.stiuBirth = stiuBirth;
    }
}
