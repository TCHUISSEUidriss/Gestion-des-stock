package com.projet.gestion.repository;

import com.projet.gestion.model.Articles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticlesRepository extends JpaRepository<Articles , Integer> {

    Articles findArticlesByCodeArticle(String codeArticle) ;
}
