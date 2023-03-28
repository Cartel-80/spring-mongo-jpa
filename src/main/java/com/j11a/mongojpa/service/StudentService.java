package com.j11a.mongojpa.service;

import com.j11a.mongojpa.entity.Student;
import com.j11a.mongojpa.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student createStudent(final Student student) {
        return repo.save(student);
    }
}
