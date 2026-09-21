package com.example.project_leap_25cc053_sowbakyat.controller;


import com.example.project_leap_25cc053_sowbakyat.model.Student;
import com.example.project_leap_25cc053_sowbakyat.services.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    WebService webService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return webService.saveStudent(student);

    }
}