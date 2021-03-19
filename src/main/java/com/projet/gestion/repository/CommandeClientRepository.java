package com.projet.gestion.repository;

import com.projet.gestion.model.CommandeClient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommandeClientRepository extends JpaRepository<CommandeClient , Integer> {
}
