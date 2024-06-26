package com.example.tpjee31.dao.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Collection;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor


public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private Date date;
    private Date h_debut;
    private Date h_fin;
    @ManyToOne
    private Course course;
    @ManyToMany(mappedBy = "sessions")
    private Collection<Personne> students;

    @Override
    public String toString() {
        return "Session{" +
                "id=" + id +
                ", date=" + date +
                ", h_debut=" + h_debut +
                ", h_fin=" + h_fin +
                ", students=" + students +
                '}';
    }
}
