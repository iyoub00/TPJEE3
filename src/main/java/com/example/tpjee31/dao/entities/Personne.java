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

public class Personne {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "nom")
    private String name;
    @Column(name = "Date de naissance")
    private Date dateofbirth;

}
