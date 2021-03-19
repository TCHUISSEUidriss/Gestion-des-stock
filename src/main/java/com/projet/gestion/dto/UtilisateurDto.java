package com.projet.gestion.dto;

import com.projet.gestion.model.*;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
public class UtilisateurDto {

    private Integer id ;

    private  String nom ;

    private  String prenom ;

    private String email ;

    private Instant dateNaissance;

    private AdresseDto adresse ;

    private String photo ;

    private String motDePasse ;

    private EntreprisesDto entreprises ;

    private List<RolesDto> roles ;

    public static UtilisateurDto fromEntity(Utilisateur utilisateur){
        if (utilisateur == null) {
            return null ;
        }
        // mappin de category vers ategoryDto
        return UtilisateurDto.builder()
                .id(utilisateur.getId())
                .nom(utilisateur.getNom())
                .prenom(utilisateur.getPrenom())
                .email(utilisateur.getEmail())
                .dateNaissance(utilisateur.getDateNaissance())
                .photo(utilisateur.getPhoto())
                .adresse(AdresseDto.fromEntity(utilisateur.getAdresse()))
                .entreprises(EntreprisesDto.fromEntity(utilisateur.getEntreprises()))
                .roles(
                      utilisateur.getRoles() != null ?
                              utilisateur.getRoles().stream()
                                      .map(RolesDto::fromEntity)
                           .collect(Collectors.toList()) : null
                )
                .build() ;

    }

    public static Utilisateur toEntity(UtilisateurDto utilisateurDto){
        if (utilisateurDto == null) {
            return null ;
        }
         Utilisateur utilisateur = new Utilisateur() ;

        utilisateur.setId(utilisateurDto.getId());
        utilisateur.setNom(utilisateurDto.getNom());
        utilisateur.setPrenom(utilisateurDto.getPrenom());
        utilisateur.setPhoto(utilisateurDto.getPhoto());
        utilisateur.setAdresse(AdresseDto.toEntity(utilisateurDto.getAdresse()));
        utilisateur.setDateNaissance(utilisateurDto.getDateNaissance());
        utilisateur.setEmail(utilisateurDto.getEmail());
        utilisateur.setEntreprises(EntreprisesDto.toEntity(utilisateurDto.getEntreprises()));
        utilisateur.setRoles(
               utilisateurDto.getRoles() != null ?
                           utilisateurDto.getRoles().stream()
                        .map(RolesDto::toEntity)
                          .collect(Collectors.toList()) : null
       );

        return utilisateur ;

    }
}
