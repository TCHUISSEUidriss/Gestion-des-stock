package com.projet.gestion.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Vente")
public class Vente extends AbstractEntity {

    @Column(name = "code")
    private  String code ;

    @Column(name = "datevente")
    private Instant datevente;

    @Column(name = "commentaire")
    private String commentaire ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;
}
