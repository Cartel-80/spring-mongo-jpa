package com.j11a.mongojpa.repo;

import com.j11a.mongojpa.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

    List<Student> findByName(final String name);
    List<Student> findByNameAndEmail(final String name, final String email);
    List<Student> findByDepartmentLocation(String location);
    List<Student> findBySubjectsMarksObtained();
}
