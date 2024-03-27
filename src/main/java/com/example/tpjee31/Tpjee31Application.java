package com.example.tpjee31;

import com.example.tpjee31.dao.entities.Professor;
import com.example.tpjee31.dao.entities.Student;
import com.example.tpjee31.dao.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tpjee31Application implements CommandLineRunner {
    @Autowired
    private PersonneRepository personneRepository;
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
        Student student = new Student();
        student.setName("Ayoub");
        student.setDateofbirth(new Date(1999,02,15));
        student.setMatricule("IC1234");
        personneRepository.save(student);
        

    }
}
