package com.j11a.mongojpa.controller;

import com.j11a.mongojpa.entity.Student;
import com.j11a.mongojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody final Student student) {
        return studentService.createStudent(student);
    }
}
