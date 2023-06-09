package com.j11a.mongojpa.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

@Data
@Document(collection = "student")
public class Student {

    @Id
    private String id;

    private String name;

    private String email;

    private Department department;

    private List<Subject> subjects;

}
