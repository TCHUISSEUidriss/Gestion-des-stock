package com.projet.gestion.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Embedded;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable

public class Adresse {

    @Column(name = "adresse1")
    private String  adresse1 ;

    @Column(name = "adresse2")
    private String adresse2;

    @Column(name = "codepostal")
    private String codePostal ;

    @Column(name = "ville")
    private  String ville ;

    @Column(name = "pays")
    private String pays ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

}
