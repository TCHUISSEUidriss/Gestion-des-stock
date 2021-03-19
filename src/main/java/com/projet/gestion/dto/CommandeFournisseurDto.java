package com.projet.gestion.dto;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projet.gestion.model.CommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;
import java.util.List;

@Data
@Builder
public class CommandeFournisseurDto {

    private Integer id ;

    private String code ;

    private Instant dateCommandeFounisseur ;

    private FournisseurDto fournisseur ;

    @JsonIgnore
    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs ;

    public static CommandeFournisseurDto fromEntity(CommandeFournisseur commandeFournisseur){

        // condition si l'objet commandeFournisseur est null
        if (commandeFournisseur == null){
            // TODO throw on exception
            return null ;
        }
         // mapping de CommmandeFournisseur => CommandeFournisseurDto
        return CommandeFournisseurDto.builder()
                .id(commandeFournisseur.getId())
                .code(commandeFournisseur.getCode())
                .dateCommandeFounisseur(commandeFournisseur.getDateCommandeFounisseur())
                .fournisseur(FournisseurDto.fromEntity(commandeFournisseur.getFournisseur()))
                .build() ;

    }

    public static CommandeFournisseur toEntity(CommandeFournisseurDto commandeFournisseurDto){

        // mapping de CommmandeFournisseur => CommandeFournisseurDto
        if (commandeFournisseurDto==null){
            //TODO throw on exception
            return  null ;
        }

        // mapping de CommandeFournisseurDto  => CommmandeFournisseur
        CommandeFournisseur commandeFournisseur = new CommandeFournisseur() ;

        commandeFournisseur.setId(commandeFournisseurDto.getId());
        commandeFournisseur.setCode(commandeFournisseurDto.getCode());
        commandeFournisseur.setDateCommandeFounisseur(commandeFournisseurDto.getDateCommandeFounisseur());
        commandeFournisseur.setFournisseur(FournisseurDto.toEntity(commandeFournisseurDto.getFournisseur()));

        return  commandeFournisseur ;

    }

}
