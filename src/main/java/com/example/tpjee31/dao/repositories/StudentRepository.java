package com.example.tpjee31.dao.repositories;

import com.example.tpjee31.dao.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
