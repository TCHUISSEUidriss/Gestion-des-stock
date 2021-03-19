package com.projet.gestion.repository;

import com.projet.gestion.model.Entreprises;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntreprisesRepository extends JpaRepository<Entreprises , Integer> {
}
