package com.projet.gestion.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Articles")
public class Articles extends  AbstractEntity {

    @Column(name = "codearticle")
    private String codeArticle ;

    @Column(name = "designation")
    private String designation ;

    @Column(name = "prixunitaireht")
    private BigDecimal prixUnitaireHt ;

    @Column(name = "tva")
    private BigDecimal TauxTva ;

    @Column(name = "prixunitairettc")
    private BigDecimal prixUnitaireTtc ;

    @Column(name = "photo")
    private String photo ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idCategory")
    private Category category;




}
