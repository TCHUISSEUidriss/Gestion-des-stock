package com.projet.gestion.services;

import com.projet.gestion.dto.ArticlesDto;

import java.util.List;

public interface ArticleService {

    ArticlesDto save(ArticlesDto articlesDto) ;

    ArticlesDto findByIDto(Integer Id);

    ArticlesDto findByCodeArticle(String codeArticle);

    List<ArticlesDto> findAll();

    void delete(Integer id);
}
