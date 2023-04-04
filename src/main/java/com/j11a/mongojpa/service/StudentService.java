package com.j11a.mongojpa.service;

import com.j11a.mongojpa.entity.Student;
import com.j11a.mongojpa.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository repo;

    public Student createStudent(final Student student) {
        return repo.save(student);
    }

    public Student getStudentById(final String id) {
        return repo.findById(id).get();
    }

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student updateStudent(Student student) {
        return repo.save(student);
    }

    public String deleteById(String id) {
        repo.deleteById(id);
        return "SUCCESS";
    }

    public List<Student> studentsByName(String name) {
        return repo.findByName(name);
    }

    public List<Student> getStudentsByNameAndEmail(String name, String email) {
        return repo.findByNameAndEmail(name, email);
    }

    public List<Student> getAllStudentsPaginated(int pageNo, int pageSize) {
        Pageable pageable = PageRequest.of(pageNo, pageSize);
//        Pageable pageable = PageRequest.of(pageNo, pageSize, Sort.by(Sort.Direction.ASC, "name"));
        Page<Student> all = repo.findAll(pageable);
        return all.getContent();
    }

    public List<Student> getAllStudentsSorted() {
        Sort sort = Sort.by(Sort.Direction.ASC, "name");

        return repo.findAll(sort);
    }

    public List<Student> getStudentByDepartmentLocation(String location) {
        return repo.findByDepartmentLocation(location);
    }
}
