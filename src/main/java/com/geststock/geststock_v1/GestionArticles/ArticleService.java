package com.geststock.geststock_v1.GestionArticles;

import com.geststock.geststock_v1.GestionArticles.exception.ArticleNotFoundException;
import com.geststock.geststock_v1.beans.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ArticleService {

    private final ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository){
        this.articleRepository = articleRepository;
    }

    public List<Article> findAllArticle(){return articleRepository.findAll();}

    public Article saveArticle(Article a)  {
        Optional<Article> article = articleRepository.findArticleByCode(a.getCodeArticle());
        if (article.isPresent()) {
            throw new IllegalStateException("Cet article existe deja");
        }

        return articleRepository.save(a);
    }

    public Article updateArticle(Article a) {
        long id = a.getIdArticle();
        Article oldArticle = articleRepository.findArticleByIdArticle(a.getIdArticle()).orElseThrow(() -> new ArticleNotFoundException("L'article d'identifiant "+id+" n'existe pas"));
        if (articleRepository.findArticleByCode(oldArticle.getCodeArticle()).isPresent() && Objects.equals(a.getCodeArticle(), oldArticle.getCodeArticle()))
            a = articleRepository.save(oldArticle);
        else
            throw new ArticleNotFoundException("Vous ne pouvez pas changer le code de l'article");
        return a;
    }

    public void deleteArticle(Article a){
        Article oldArticle = articleRepository.findArticleByIdArticle(a.getIdArticle()).orElseThrow(() -> new IllegalStateException("L'article d'identifiant "+a.getIdArticle()+" n'existe pas"));
        articleRepository.delete(oldArticle);
    }

    public Article getArticleByCodeArticle(String codeArticle) {
        Article article = articleRepository.findArticleByCode(codeArticle).orElseThrow(() -> new IllegalStateException("L'article de code "+codeArticle+" n'existe pas"));
        return article;
    }

    public Article getArticleByIdArticle(String idArticle) {
        Article article = articleRepository.findArticleByCode(idArticle).orElseThrow(() -> new IllegalStateException("L'article d'identifiant "+idArticle+" n'existe pas"));
        return article;
    }

    public Article getArticleByNomArticle(String nomArticle) {
        Article article = articleRepository.findArticleByNomArticle(nomArticle).orElseThrow(() -> new IllegalStateException("L'article nommé "+nomArticle+" n'existe pas"));
        return article;
    }
}
