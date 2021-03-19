package com.projet.gestion.dto;

import com.projet.gestion.model.MouvementDeStock;
import com.projet.gestion.model.TypeMvtStock;
import lombok.Builder;
import lombok.Data;
import sun.security.mscapi.CPublicKey;

import java.math.BigDecimal;
import java.time.Instant;

@Data
@Builder
public class MouvementDeStockDto {

    private Integer id ;

    private Instant datemvt;

    private BigDecimal quantite ;

    private ArticlesDto articles;

    private TypeMvtStockDto typeMvtStock ;

    // mappin de la classe MouvementDeStock vers MouvementDeStoctDto
    public  MouvementDeStockDto fromEntity(MouvementDeStock mouvementDeStock){
        if (mouvementDeStock==null){
            //TODO Throw on exception
            return null ;
        }

        return MouvementDeStockDto.builder()
                .id(mouvementDeStock.getId())
                .datemvt(mouvementDeStock.getDatemvt())
                .quantite(mouvementDeStock.getQuantite())
                .articles(ArticlesDto.fromEntity(mouvementDeStock.getArticles()))
                .typeMvtStock()
                .build() ;

    }

    // mappin de la classe  MouvementDeStoctDto vers MouvementDeStock
    public  MouvementDeStock toEnity(MouvementDeStockDto  mouvementDeStockDto){

        MouvementDeStock mouvementDeStock = new MouvementDeStock() ;

        mouvementDeStock.setId(mouvementDeStockDto.getId());
        mouvementDeStock.setDatemvt(mouvementDeStockDto.getDatemvt());
        mouvementDeStock.setQuantite(mouvementDeStockDto.getQuantite());
        mouvementDeStock.setArticles(ArticlesDto.toEntity(mouvementDeStockDto.getArticles()));
        mouvementDeStock.setTypeMvtStock();

        return mouvementDeStock ;
    }


}
