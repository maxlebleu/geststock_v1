package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "utiliser")
public class Utiliser {
    @Id
    @Column(name = "id_utiliser")
    private Long idUtiliser;

    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "id_mp")
    private Long idMp;

    @Column(name = "id_article")
    private Long idArticle;

    @Column(name = "qte_utiliser")
    private Long qteUtiliser;

    @Column(name = "date_utilisation")
    private java.sql.Date dateUtilisation;

    @Column(name = "qte_previsionel")
    private Long qtePrevisionel;

    @Column(name = "qte_produit")
    private Long qteProduit;

    public Utiliser() {

    }

    public Long getIdUtiliser() {
        return this.idUtiliser;
    }

    public void setIdUtiliser(Long idUtiliser) {
        this.idUtiliser = idUtiliser;
    }

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdMp() {
        return this.idMp;
    }

    public void setIdMp(Long idMp) {
        this.idMp = idMp;
    }

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Long getQteUtiliser() {
        return this.qteUtiliser;
    }

    public void setQteUtiliser(Long qteUtiliser) {
        this.qteUtiliser = qteUtiliser;
    }

    public java.sql.Date getDateUtilisation() {
        return this.dateUtilisation;
    }

    public void setDateUtilisation(java.sql.Date dateUtilisation) {
        this.dateUtilisation = dateUtilisation;
    }

    public Long getQtePrevisionel() {
        return this.qtePrevisionel;
    }

    public void setQtePrevisionel(Long qtePrevisionel) {
        this.qtePrevisionel = qtePrevisionel;
    }

    public Long getQteProduit() {
        return this.qteProduit;
    }

    public void setQteProduit(Long qteProduit) {
        this.qteProduit = qteProduit;
    }
}
