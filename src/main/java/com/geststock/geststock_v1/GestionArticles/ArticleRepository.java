package com.geststock.geststock_v1.GestionArticles;

import com.geststock.geststock_v1.beans.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    @Query("select a from Article a where a.codeArticle = ?1 ")
   Optional<Article> findArticleByCode(String code);

    @Query("select a from Article a where a.idArticle = ?1")
    Optional<Article> findArticleByIdArticle(Long id);

    @Query("select a from Article a where a.nomArticle = ?1")
    Optional<Article> findArticleByNomArticle(String nomArticle);
}
