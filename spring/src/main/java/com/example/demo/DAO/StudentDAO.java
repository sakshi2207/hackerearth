package com.example.demo.DAO;

import com.example.demo.model.Student;

import java.util.List;


public interface StudentDAO {
        public boolean saveStudent(Student student);
        public List<Student> getStudents();
        public boolean deleteStudent(Student student);
        public List<Student> getStudentByID(Student student);
        public boolean updateStudent(Student student);

}
