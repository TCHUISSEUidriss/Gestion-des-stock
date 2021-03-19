package com.projet.gestion.dto;

import com.projet.gestion.model.Vente;
import lombok.Builder;
import lombok.Data;

import java.time.Instant;

@Data
@Builder
public class VenteDto {

    private Integer id ;

    private  String code ;

    private Instant datevente;

    private String commentaire ;

    // mappin de la classe Vente vers la classe VenteDto
    public static  VenteDto fromEntity(Vente vente){
        if (vente == null){
            // TODO throw on exception
            return null ;
        }
        return VenteDto.builder()
                .id(vente.getId())
                .code(vente.getCode())
                .datevente(vente.getDatevente())
                .commentaire(vente.getCommentaire())
                .build();
    }

    public static Vente toEntity(VenteDto venteDto){
        if (venteDto == null){
            // TODO throw on exception
            return null ;
        }

        Vente vente = new Vente();

        vente.setId(venteDto.getId());
        vente.setCode(venteDto.getCode());
        vente.setDatevente(venteDto.getDatevente());
        vente.setCommentaire(venteDto.getCommentaire());

        return vente;
    }
}
