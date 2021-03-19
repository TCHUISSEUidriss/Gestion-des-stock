package com.projet.gestion.model;

import com.sun.javaws.jnl.IconDesc;
import lombok.*;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "CommandeFournisseur")
public class CommandeFournisseur extends AbstractEntity{

    @Column(name = "code")
    private String code ;

    @Column(name = "datecommandefounisseur")
    private Instant dateCommandeFounisseur ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idFournisseur")
    private Fournisseur fournisseur ;

    @OneToMany(mappedBy = "commandeFournisseur")
    private List<LigneCommandeFournisseur> ligneCommandeFournisseurs ;

}
