package com.example.relationsJpa.repository;

import com.example.relationsJpa.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivreRepository extends JpaRepository<Auteur,Long> {
}
