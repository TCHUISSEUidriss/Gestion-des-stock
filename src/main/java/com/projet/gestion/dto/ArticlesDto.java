package com.projet.gestion.dto;

import com.projet.gestion.model.Articles;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ArticlesDto {

    private Integer id ;

    private String codeArticle ;

    private String designation ;

    private BigDecimal prixUnitaireHt ;

    private BigDecimal TauxTva ;

    private BigDecimal prixUnitaireTtc ;

    private String photo ;

    private CategoryDto category;

    public static ArticlesDto fromEntity(Articles articles){
        if (articles == null){
            return null ;
        }
        return ArticlesDto.builder()
                .id(articles.getId())
                .codeArticle(articles.getCodeArticle())
                .designation(articles.getDesignation())
                .prixUnitaireHt(articles.getPrixUnitaireHt())
                .TauxTva(articles.getTauxTva())
                .prixUnitaireTtc(articles.getPrixUnitaireTtc())
                .photo(articles.getPhoto())
                .build();
    }

    public static Articles toEntity(ArticlesDto articlesDto){
        Articles articles = new Articles() ;

        articles.setId(articlesDto.getId());
        articles.setCodeArticle(articlesDto.getCodeArticle());
        articles.setDesignation(articlesDto.getDesignation());
        articles.setPrixUnitaireHt(articlesDto.getPrixUnitaireHt());
        articles.setTauxTva(articlesDto.getTauxTva());
        articles.setPrixUnitaireTtc(articlesDto.getPrixUnitaireTtc());
        articles.setPhoto(articlesDto.getPhoto());

        return  articles;
    }

}
