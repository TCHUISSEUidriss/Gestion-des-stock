package com.projet.gestion.services.impl;

import com.projet.gestion.dto.ArticlesDto;
import com.projet.gestion.exception.EntityNotFoundException;
import com.projet.gestion.exception.ErrorCodes;
import com.projet.gestion.exception.InvalidEntityException;
import com.projet.gestion.model.Articles;
import com.projet.gestion.repository.ArticlesRepository;
import com.projet.gestion.services.ArticleService;
import com.projet.gestion.validator.ArticlesValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class ArticleServiceImpl implements ArticleService {

    private final ArticlesRepository articlesRepository;

    public  ArticleServiceImpl(ArticlesRepository articlesRepository){
        this.articlesRepository = articlesRepository ;
    }

    @Override
    public ArticlesDto save(ArticlesDto articlesDto) {
        List<String> errors = ArticlesValidator.validate(articlesDto);
        if (!errors.isEmpty()){
            log.error("Article is not valide {}",articlesDto);
            throw new InvalidEntityException("l'article n'est pas valide ", ErrorCodes.ARTICLE_NOT_VALIDE,errors);
        }

        return  ArticlesDto.fromEntity(
                articlesRepository.save(
                ArticlesDto.toEntity(articlesDto)
        )) ;
    }

    @Override
    public ArticlesDto findByIDto(Integer id) {
        // verification si l'Id exsiste
        if (id == null){
            log.error("l'article ID est null");
            return null ;
        }

        Optional<Articles> articles = articlesRepository.findById(id);

        return  Optional.of(ArticlesDto.fromEntity(articles.get())).orElseThrow(() ->
                new EntityNotFoundException(
                        "Aucun article avec l'ID =" + " n ' a ete retrouvé dans la BDD",
                        ErrorCodes.ARTICLE_NOT_FOUND)
                ) ;
    }

    @Override
    public ArticlesDto findByCodeArticle(String codeArticle) {
        if (codeArticle == null){
            log.error("l'article codeArticle est null");
            return  null ;
        }
        return  Optional.of()

        return null;
    }

    @Override
    public List<ArticlesDto> findAll() {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
