package com.service;

import com.dao.StudentDao;
import com.dao.StudentDaoImpl;
import com.entity.Student;

import java.util.List;

public class StudentServiceImpl implements StudentService {

     private StudentDao studentDao=new StudentDaoImpl();

    @Override
    public List<Student> getStudent() {

        return  studentDao.getStudent();

    }
}
