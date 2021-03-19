package com.projet.gestion.model;


import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Entreprises")
public class Entreprises extends AbstractEntity {

    @Column(name = "nom")
    private String nom ;

    @Column(name = "description")
    private String description;

    @Column(name = "adresse")
    private Adresse adresse ;

    @Column(name = "codefiscale")
    private String codeFiscale;

    @Column(name = "photo")
    private String photo ;

    @Column(name = "email")
    private String email;

    @Column(name = "numerotelephone")
    private String numeroTelephone;

    @Column(name = "sitewep")
    private String sitewep ;

    @OneToMany(mappedBy = "entreprises")
    private List<Utilisateur> utilisateurs ;
}
