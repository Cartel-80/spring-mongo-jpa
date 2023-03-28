package com.j11a.mongojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories("com.j11a.mongojpa.repo")
@ComponentScan("com.j11a.mongojpa.*")
public class MongoJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoJpaApplication.class, args);
    }

}
