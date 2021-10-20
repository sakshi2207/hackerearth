package com.example.demo.service;
import java.util.List;
import com.example.demo.model.Student;

public interface Service {

    public boolean saveStudent(Student student);
    public List<Student> getStudents();
    public boolean deleteStudent(Student student);
    public List<Student> getStudentByID(Student student);
    public boolean updateStudent(Student student);
}
