package com.projet.gestion.dto;

import com.projet.gestion.model.Roles;
import com.projet.gestion.model.Utilisateur;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RolesDto {

    private Integer id ;

    private  String roleName ;

    private UtilisateurDto utilisateur ;

    //mappin de la classe Role vers RoleDto

    public static RolesDto fromEntity(Roles roles){
        if (roles==null){
             // TODO throw on exception
            return null ;
        }
        return RolesDto.builder()
                .id(roles.getId())
                .roleName(roles.getRoleName())
                .utilisateur(UtilisateurDto.fromEntity(roles.getUtilisateur()))
                .build() ;

    }

    // mappin de la classe RolesDto vers la classe Roles

    public static Roles toEntity(RolesDto rolesDto){
        Roles roles = new Roles() ;
        roles.setId(rolesDto.getId());
        roles.setRoleName(rolesDto.getRoleName());
        roles.setUtilisateur(UtilisateurDto.toEntity(rolesDto.getUtilisateur()));

        return roles ;
    }

}
