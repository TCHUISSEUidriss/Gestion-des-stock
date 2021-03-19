package com.projet.gestion.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "MouvementDeStock")
public class MouvementDeStock extends AbstractEntity {

    @Column(name = "datemvt")
    private Instant datemvt;

    @Column(name = "quantite")
    private BigDecimal quantite ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idarticles")
    private Articles articles;

    @Column(name = "typeMvtStock")
    private TypeMvtStock typeMvtStock ;
}
