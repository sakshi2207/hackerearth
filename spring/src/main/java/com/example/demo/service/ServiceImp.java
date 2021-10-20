package com.example.demo.service;


import java.lang.annotation.Annotation;
import java.util.List;

import com.example.demo.DAO.StudentDAO;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class ServiceImp implements Service{
    @Autowired
    private StudentDAO studentdao;


    public boolean saveStudent(Student student) {
        return studentdao.saveStudent(student);
    }

    public List<Student> getStudents() {
        return studentdao.getStudents();
    }

    public boolean deleteStudent(Student student) {
        return studentdao.deleteStudent(student);
    }

    public List<Student> getStudentByID(Student student) {
        return studentdao.getStudentByID(student);
    }

    public boolean updateStudent(Student student) {
        return studentdao.updateStudent(student);
    }

    @Override
    public String value() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
