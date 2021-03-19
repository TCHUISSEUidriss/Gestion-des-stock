package com.projet.gestion.validator;

import com.projet.gestion.dto.ArticlesDto;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class ArticlesValidator {

    public static List<String> validate(ArticlesDto articlesDto){
        List<String> errors = new ArrayList<>();
        if (articlesDto == null){
            errors.add("veuillez renseigner le code de l'article ");
            errors.add("veuillez renseigner la designation de l'article ");
            errors.add("veuillez renseigner le prix unitaire de l'article ");
            errors.add("veuillez renseigner la category l'article ");

          return errors ;
        }

        if (!StringUtils.hasLength(articlesDto.getCodeArticle())){
            errors.add("veuillez renseigner le code de l'article ");
        }
        if (!StringUtils.hasLength(articlesDto.getDesignation())){
            errors.add("veuillez renseigner la designation de l'article ");
        }
        if (articlesDto.getPrixUnitaireHt()==null){
            errors.add("veuillez renseigner le prix unitaire de l'article ");
        }
        if (articlesDto.getCategory() == null){
            errors.add("veuillez renseigner la category l'article ");
        }

        return  errors ;

    }

}
