package com.projet.gestion.repository;

import com.projet.gestion.model.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FournisseurRepository extends JpaRepository<Fournisseur , Integer> {
}
