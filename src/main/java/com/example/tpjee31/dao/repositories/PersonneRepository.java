package com.example.tpjee31.dao.repositories;

import com.example.tpjee31.dao.entities.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
}
