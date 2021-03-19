package com.projet.gestion.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projet.gestion.model.Fournisseur;
import lombok.Builder;
import lombok.Data;


import java.util.List;

@Data
@Builder
public class FournisseurDto {

    private Integer id ;

    private String nom;

    private String prenom ;

    private String photo ;

    // ce champ est un champ composé ; il va etre definir dans plusieurs classes
    private AdresseDto adresse ;

    private String mail;

    private String numeroTelephone ;

    @JsonIgnore
    private List<CommandeFournisseurDto> commandeFournisseurs ;

    public static FournisseurDto fromEntity(Fournisseur fournisseur){
        if (fournisseur == null){
            // TODO throw on exception
            return null;
        }
        // mappin de la classe fournisseur => la classe fournisseurDto
        return FournisseurDto.builder()
                .id(fournisseur.getId())
                .nom(fournisseur.getNom())
                .prenom(fournisseur.getPrenom())
                .photo(fournisseur.getPhoto())
                .adresse(AdresseDto.fromEntity(fournisseur.getAdresse()))
                .mail(fournisseur.getMail())
                .numeroTelephone(fournisseur.getNumeroTelephone())
                .build() ;
    }

    public static Fournisseur toEntity(FournisseurDto  fournisseurDto){
        if(fournisseurDto==null){
            //TODO throw on exception
            return null ;
        }
        // mappin de la classe FournisseurDto => fournisseur
        Fournisseur fournisseur = new Fournisseur() ;

        fournisseur.setId(fournisseurDto.getId());
        fournisseur.setNom(fournisseurDto.getNom());
        fournisseur.setPrenom(fournisseurDto.getPrenom());
        fournisseur.setPhoto(fournisseurDto.getPhoto());
        fournisseur.setAdresse(AdresseDto.toEntity(fournisseurDto.getAdresse()));
        fournisseur.setMail(fournisseurDto.getMail());
        fournisseur.setNumeroTelephone(fournisseurDto.getNumeroTelephone());

        return fournisseur ;
    }

}
