package com.projet.gestion.dto;

import com.projet.gestion.model.Adresse;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AdresseDto {

    private Integer id ;

    private String  adresse1 ;

    private String adresse2;

    private String codePostal ;

    private  String ville ;

    private String pays ;

    public static AdresseDto fromEntity(Adresse adresse){

        if (adresse == null){
            return null ;
        }
         return AdresseDto.builder()
                 .adresse1(adresse.getAdresse1())
                 .adresse2(adresse.getAdresse2())
                 .codePostal(adresse.getCodePostal())
                 .ville(adresse.getVille())
                 .pays(adresse.getPays())
                 .build() ;
    }

    public static Adresse toEntity(AdresseDto adresseDto){
        Adresse adresse = new Adresse() ;

        adresse.setAdresse1(adresseDto.getAdresse1());
        adresse.setAdresse2(adresseDto.getAdresse2());
        adresse.setVille(adresseDto.getVille());
        adresse.setCodePostal(adresse.getCodePostal());
        adresse.setPays(adresse.getPays());

        return  adresse ;
    }


}
