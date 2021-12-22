package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "article")
public class Article {
    @Id
    @Column(name = "id_article")
    private Long idArticle;

    @Column(name = "id_categorie")
    private Long idCategorie;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @Column(name = "id_reduction")
    private Long idReduction;

    @Column(name = "code_article")
    private String codeArticle;

    @Column(name = "nom_article")
    private String nomArticle;

    @Column(name = "description")
    private String description;

    @Column(name = "quantite")
    private Long quantite;

    @Column(name = "prix_vente")
    private double prixVente;

    @Column(name = "image")
    private String image;

    @Column(name = "marge")
    private Long marge;

    @Column(name = "seuil_article")
    private Long seuilArticle;

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Long getIdCategorie() {
        return this.idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public Long getIdEntreprise() {
        return this.idEntreprise;
    }

    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public Long getIdReduction() {
        return this.idReduction;
    }

    public void setIdReduction(Long idReduction) {
        this.idReduction = idReduction;
    }

    public String getCodeArticle() {
        return this.codeArticle;
    }

    public void setCodeArticle(String codeArticle) {
        this.codeArticle = codeArticle;
    }

    public String getNomArticle() {
        return this.nomArticle;
    }

    public void setNomArticle(String nomArticle) {
        this.nomArticle = nomArticle;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }

    public double getPrixVente() {
        return this.prixVente;
    }

    public void setPrixVente(double prixVente) {
        this.prixVente = prixVente;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getMarge() {
        return this.marge;
    }

    public void setMarge(Long marge) {
        this.marge = marge;
    }

    public Long getSeuilArticle() {
        return this.seuilArticle;
    }

    public void setSeuilArticle(Long seuilArticle) {
        this.seuilArticle = seuilArticle;
    }
}
