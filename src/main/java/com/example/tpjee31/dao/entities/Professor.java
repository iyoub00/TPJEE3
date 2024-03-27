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

    @Override
    public String toString() {
        return "Professor{" +
                "Date_affectation=" + Date_affectation +
                ", course=" + course +
                "} " + super.toString();
    }
}
