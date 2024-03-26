package com.example.tpjee31.dao.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.ArrayList;
import java.util.Collection;

public class Student extends Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String matricule;
    @ManyToMany
    private Collection<Session> sessions;

}
