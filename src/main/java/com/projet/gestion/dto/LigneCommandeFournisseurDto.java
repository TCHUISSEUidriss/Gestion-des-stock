package com.projet.gestion.dto;

import com.projet.gestion.model.LigneCommandeClient;
import com.projet.gestion.model.LigneCommandeFournisseur;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class LigneCommandeFournisseurDto {

    private Integer id ;

    private ArticlesDto articles;

    private CommandeFournisseurDto commandeFournisseur ;

    private BigDecimal quantite ;

    private BigDecimal prixUnitaire;

    // mappin de la classe LigneCommandeFournisseur vers  LigneCommandeFournisseurDto

    public LigneCommandeFournisseurDto fromEntity(LigneCommandeFournisseur ligneCommandeFournisseur){
        if (ligneCommandeFournisseur == null){
            // TODO throw on exception
        }
        return LigneCommandeFournisseurDto.builder()
                .id(ligneCommandeFournisseur.getId())
                .articles(ArticlesDto.fromEntity(ligneCommandeFournisseur.getArticles()))
                .commandeFournisseur(CommandeFournisseurDto.fromEntity(ligneCommandeFournisseur.getCommandeFournisseur()))
                .quantite(ligneCommandeFournisseur.getQuantite())
                .prixUnitaire(ligneCommandeFournisseur.getPrixUnitaire())
                .build() ;
    }

    // mappin LigneCommandeFournisseurDto vers LigneCommandeFournisseur
    public LigneCommandeFournisseur toEntity(LigneCommandeFournisseurDto ligneCommandeFournisseurDto){
        if (ligneCommandeFournisseurDto == null){
            // TODO throw on exception
        }

        LigneCommandeFournisseur ligneCommandeFournisseur = new LigneCommandeFournisseur() ;

        ligneCommandeFournisseur.setId(ligneCommandeFournisseurDto.getId());
        ligneCommandeFournisseur.setArticles(ArticlesDto.toEntity(ligneCommandeFournisseurDto.getArticles()));
        ligneCommandeFournisseur.setCommandeFournisseur(CommandeFournisseurDto.toEntity(ligneCommandeFournisseurDto.getCommandeFournisseur()));
        ligneCommandeFournisseur.setQuantite(ligneCommandeFournisseurDto.getQuantite());
        ligneCommandeFournisseur.setPrixUnitaire(ligneCommandeFournisseurDto.getPrixUnitaire());

        return ligneCommandeFournisseur ;

    }
}
