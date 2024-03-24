package com.example.tpjee31.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Professor extends Personne{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Date Date_affectation;
    @OneToOne
    private Course course;
}
