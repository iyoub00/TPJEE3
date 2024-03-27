package com.example.tpjee31.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Collection;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Student extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricule;
    @ManyToMany
    private Collection<Session> sessions;

    @Override
    public String toString() {
        return "Student{" +
                "matricule='" + matricule + '\'' +
                ", sessions=" + sessions +
                "} " + super.toString();
    }
}
