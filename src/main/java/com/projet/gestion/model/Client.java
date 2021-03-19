package com.projet.gestion.model;


import com.sun.nio.sctp.PeerAddressChangeNotification;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Client")
public class Client extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom ;

    @Column(name = "photo")
    private String photo ;

    @Embedded // ce champ est un champ composé ; il va etre definir dans plusieurs classes
    private Adresse adresse ;

    @Column(name = "mail")
    private String mail;

    @Column(name = "numerotelephone")
    private String numeroTelephone ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @OneToMany(mappedBy = "client")
    List<CommandeClient> commandeClients ;
}
