package com.projet.gestion.dto;


import com.projet.gestion.model.LigneCommandeClient;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeClientDto {

    private Integer id ;

    private ArticlesDto articles ;

    private CommandeClientDto commandeClient ;

    private BigDecimal quantite ;

    private BigDecimal prixUnitaire;

    // mappin de la classe LigneCommandeClient vers  LigneCommandeClientDto

    public LigneCommandeClientDto fromEntity(LigneCommandeClient ligneCommandeClient){
        if (ligneCommandeClient == null){
            // TODO throw on exception
        }
        return LigneCommandeClientDto.builder()
                .id(ligneCommandeClient.getId())
                .articles(ArticlesDto.fromEntity(ligneCommandeClient.getArticles()))
                .commandeClient(CommandeClientDto.fromEntity(ligneCommandeClient.getCommandeClient()))
                .quantite(ligneCommandeClient.getQuantite())
                .prixUnitaire(ligneCommandeClient.getPrixUnitaire())
                .build() ;
    }

    // mappin LigneCommandeClientDto vers LigneCommandeClient
    public LigneCommandeClient toEntity(LigneCommandeClientDto ligneCommandeClientDto){
        if (ligneCommandeClientDto == null){
            // TODO throw on exception
        }

        LigneCommandeClient ligneCommandeClient = new LigneCommandeClient() ;

        ligneCommandeClient.setId(ligneCommandeClientDto.getId());
        ligneCommandeClient.setArticles(ArticlesDto.toEntity(ligneCommandeClientDto.getArticles()));
        ligneCommandeClient.setCommandeClient(CommandeClientDto.toEntity(ligneCommandeClientDto.getCommandeClient()));
        ligneCommandeClient.setQuantite(ligneCommandeClientDto.getQuantite());
        ligneCommandeClient.setPrixUnitaire(ligneCommandeClientDto.getPrixUnitaire());

        return ligneCommandeClient ;

    }
}
