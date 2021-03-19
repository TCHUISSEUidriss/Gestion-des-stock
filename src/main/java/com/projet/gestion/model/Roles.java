package com.projet.gestion.model;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "Roles")
public class Roles extends AbstractEntity {

    @Column(name ="rolename")
    private  String roleName ;

    @Column(name = "identreprise")
    private Integer IdEntreprise ;

    @ManyToOne
    @JoinColumn(name = "idutilisateur")
    private Utilisateur utilisateur ;

}
