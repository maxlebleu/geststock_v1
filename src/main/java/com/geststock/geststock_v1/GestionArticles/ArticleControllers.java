package com.geststock.geststock_v1.GestionArticles;

import com.geststock.geststock_v1.beans.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("GestStock/Products")
public class ArticleControllers {

    private final ArticleService articleService;

    @Autowired
    public ArticleControllers(ArticleService articleService){this.articleService = articleService;}


    public List<Article> getArticles(){
        return articleService.findAllArticle();
    }

    @PostMapping("/addArticle")
    public ResponseEntity<Article> addArticle(@RequestBody Article article) {
        Article p = articleService.saveArticle(article);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @PutMapping("/updateArticle")
    public ResponseEntity<Article> modifyArticle(@RequestBody Article article){
        Article p = articleService.updateArticle(article);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/findArticle/{codeArticle}")
    public ResponseEntity<Article> getArticleByCode(@PathVariable("codeArticle") String codeArticle){
        Article p = articleService.getArticleByCodeArticle(codeArticle);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/findArticle/{nomArticle}")
    public ResponseEntity<Article> getArticleByNom(@PathVariable("nomArticle") String nomArticle){
        Article p = articleService.getArticleByNomArticle(nomArticle);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @GetMapping("/findArticle/{idArticle}")
    public ResponseEntity<Article> getArticleById(@PathVariable("idArticle") String idArticle){
        Article p = articleService.getArticleByIdArticle(idArticle);
        return new ResponseEntity<>(p, HttpStatus.OK);
    }

    @DeleteMapping("/deleteArticle")
    public ResponseEntity<Article> deleteArticle(@RequestBody Article a){
        articleService.deleteArticle(a);
        return new ResponseEntity<>(HttpStatus.OK);
    }



}
