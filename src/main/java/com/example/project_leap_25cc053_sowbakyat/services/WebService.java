package com.example.project_leap_25cc053_sowbakyat.services;

import com.example.project_leap_25cc053_sowbakyat.model.Student;

import java.util.List;

public interface WebService {
    String writeDataFromController(String text);

    Student saveStudent(Student student);
    void deleteStudent(Long id);
    List<Student> readStudents();
    Student updateStudent(Student student);

    String writeData(String data);
}
