package com.j11a.mongojpa.controller;

import com.j11a.mongojpa.entity.Student;
import com.j11a.mongojpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    public StudentService studentService;

    @PostMapping
    public Student createStudent(@RequestBody final Student student) {
        return studentService.createStudent(student);
    }

    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable final String id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/allPagination")
    public List<Student> getAllStudentsPaginated(@RequestParam final int pageNo, @RequestParam final int pageSize) {
        return studentService.getAllStudentsPaginated(pageNo, pageSize);
    }

    @GetMapping("/allSorted")
    public List<Student> getAllStudentsSorted() {
        return studentService.getAllStudentsSorted();
    }

    @PutMapping
    public Student updateStudent(@RequestBody final Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudentById(@PathVariable final String id) {
        return studentService.deleteById(id);
    }

    @GetMapping("/name/{name}")
    public List<Student> studentsByName(@PathVariable final String name) {
        return studentService.studentsByName(name);
    }

    @GetMapping("/search")
    public List<Student> getStudentsByNameAndEmail(@RequestBody final String name,
                                                   @RequestBody final String email) {
        return studentService.getStudentsByNameAndEmail(name, email);
    }

    @GetMapping("/department/location")
    public List<Student> getStudentByDepartmentLocation(@RequestParam final String location) {
        return studentService.getStudentByDepartmentLocation(location);
    }
}
