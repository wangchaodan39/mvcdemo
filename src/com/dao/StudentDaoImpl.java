package com.dao;

import com.entity.Student;
import com.jdbc.util.BeanUtils;

import java.util.List;

public class StudentDaoImpl implements StudentDao{

    //用框架封装的方法查询数据库信息
    @Override
    public List<Student> getStudent() {
        return BeanUtils.query(Student.class);
    }
}
