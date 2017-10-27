package com.controller;

import com.entity.Student;
import com.service.StudentService;
import com.service.StudentServiceImpl;

import java.io.IOException;
import java.util.List;

public class InitIndexServlet extends javax.servlet.http.HttpServlet {


    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        StudentService service=new StudentServiceImpl();
         request.setCharacterEncoding("UTF-8");
         response.setContentType("text/html;charset=UTF-8");
        List<Student> students = service.getStudent();
        request.setAttribute("stuList",students);
        request.getRequestDispatcher("student/list.jsp").forward(request,response);
    }
}
