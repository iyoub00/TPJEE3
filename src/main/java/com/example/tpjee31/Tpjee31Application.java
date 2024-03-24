package com.example.tpjee31;

import com.example.tpjee31.dao.entities.Professor;
import com.example.tpjee31.dao.repositories.CourseRepository;
import com.example.tpjee31.dao.repositories.ProfessorRepository;
import com.example.tpjee31.dao.repositories.SessionRepository;
import com.example.tpjee31.dao.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tpjee31Application implements CommandLineRunner {
    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private SessionRepository sessionRepository;
    @Autowired
    private StudentRepository studentRepository;

    public static void main(String[] args) {
        SpringApplication.run(Tpjee31Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
