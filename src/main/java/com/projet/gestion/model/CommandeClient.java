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
@Table(name = "CommandeClient")
public class CommandeClient extends AbstractEntity {

    @Column(name = "code")
    private String code ;

    @Column(name = "dateCommande")
    private Instant dateCommande ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idClient")
    private Client client ;

    @OneToMany(mappedBy = "commandeClient")
    private List<LigneCommandeClient> ligneCommandeClients ;
}
