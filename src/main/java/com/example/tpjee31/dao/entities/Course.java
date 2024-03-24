package com.example.tpjee31.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String Title;
    private String description;
    @OneToOne(mappedBy = "course")
    private Professor professor;
    @OneToMany(mappedBy = "Course",fetch = FetchType.EAGER)
    private Collection<Session>sessions;

}
