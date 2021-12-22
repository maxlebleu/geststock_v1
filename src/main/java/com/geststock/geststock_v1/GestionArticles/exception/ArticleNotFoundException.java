package com.geststock.geststock_v1.GestionArticles.exception;

public class ArticleNotFoundException extends RuntimeException{
    public ArticleNotFoundException(String msg) {
        super(msg);
    }
}
