package com.projet.gestion.repository;

import com.projet.gestion.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client , Integer> {
}
