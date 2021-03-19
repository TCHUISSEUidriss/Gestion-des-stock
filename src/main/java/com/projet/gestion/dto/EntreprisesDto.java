package com.projet.gestion.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.projet.gestion.model.Entreprises;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EntreprisesDto {

    private Integer id ;

    private String nom ;

    private String description;

    private AdresseDto adresse ;

    private String codeFiscale;

    private String photo ;

    private String email;

    private String numeroTelephone;

    private String sitewep ;

    @JsonIgnore
    private List<UtilisateurDto> utilisateurs ;

    public static EntreprisesDto fromEntity(Entreprises entreprises){
        if (entreprises == null){
            //TODO throw an exception

            return null ;
        }
        return  EntreprisesDto.builder()
                .id(entreprises.getId())
                .nom(entreprises.getNom())
                .description(entreprises.getDescription())
                .adresse(AdresseDto.fromEntity(entreprises.getAdresse()))
                .codeFiscale(entreprises.getCodeFiscale())
                .photo(entreprises.getPhoto())
                .numeroTelephone(entreprises.getNumeroTelephone())
                .sitewep(entreprises.getSitewep())
                .build() ;
    }

    public static Entreprises toEntity(EntreprisesDto entreprisesDto){

        if (entreprisesDto==null){
            //TODO throw exception
            return null ;
        }

        Entreprises entreprises = new Entreprises() ;

        entreprises.setId(entreprisesDto.getId());
        entreprises.setNom(entreprisesDto.getNom());
        entreprises.setDescription(entreprisesDto.getDescription());
        entreprises.setAdresse(AdresseDto.toEntity(entreprisesDto.getAdresse()));
        entreprises.setCodeFiscale(entreprisesDto.getCodeFiscale());
        entreprises.setPhoto(entreprisesDto.getPhoto());
        entreprises.setNumeroTelephone(entreprisesDto.getNumeroTelephone());
        entreprises.setSitewep(entreprisesDto.getSitewep());

        return  entreprises ;
    }
}
