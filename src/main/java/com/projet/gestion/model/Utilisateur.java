package com.projet.gestion.model;

import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Utilisateur")
public class Utilisateur extends AbstractEntity {

    @Column(name = "nom")
    private  String nom ;

    @Column(name = "prenom")
    private  String prenom ;

    @Column(name = "email")
    private String email ;

    @Column(name = "datenaissance")
    private Instant dateNaissance;

    @Embedded
    private Adresse adresse ;

    @Column(name = "photo")
    private String photo ;

    @Column(name = "motdepasse")
    private String motDePasse ;

    @ManyToOne
    @JoinColumn(name = "identreprises")
    private Entreprises entreprises ;

    @OneToMany(mappedBy = "utilisateur")
    private List<Roles> roles ;


}
