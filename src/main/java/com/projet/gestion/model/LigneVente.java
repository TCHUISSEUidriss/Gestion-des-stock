package com.projet.gestion.model;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "LigneVente")
public class LigneVente extends  AbstractEntity {



    @ManyToOne
    @JoinColumn(name = "idvente")
    private Vente vente ;

    @Column(name = "quantite")
    private BigDecimal quantite ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;
}
