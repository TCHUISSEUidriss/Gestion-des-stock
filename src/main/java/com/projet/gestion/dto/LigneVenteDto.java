package com.projet.gestion.dto;

import com.projet.gestion.model.LigneVente;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneVenteDto {

    private Integer id ;

    private VenteDto vente ;

    private BigDecimal quantite ;

    public LigneVenteDto fromEntity(LigneVente ligneVente){
        if (ligneVente==null){
            //TODO throw on exception
            return  null ;
        }

        return LigneVenteDto.builder()
                .id(ligneVente.getId())
                .vente(VenteDto.fromEntity(ligneVente.getVente()))
                .quantite(ligneVente.getQuantite())
                .build();

    }

    public LigneVente toEntity(LigneVenteDto ligneVenteDto){
        if (ligneVenteDto==null){
            //TODO throw on exception
            return  null ;
        }

        LigneVente ligneVente =new LigneVente();

        ligneVente.setId(ligneVenteDto.getId());
        ligneVente.setVente(VenteDto.toEntity(ligneVenteDto.getVente()));
        ligneVente.setQuantite(ligneVenteDto.getQuantite());

        return ligneVente ;
    }
}
