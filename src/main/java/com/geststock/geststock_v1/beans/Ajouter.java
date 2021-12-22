package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "ajouter")
public class Ajouter {
    @Id
    @Column(name = "id_ajout")
    private Long idAjout;

    @Column(name = "id_article")
    private Long idArticle;

    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "date_ajout")
    private java.sql.Date dateAjout;

    @Column(name = "quantite_cmd")
    private Long quantiteCmd;

    public Long getIdAjout() {
        return this.idAjout;
    }

    public void setIdAjout(Long idAjout) {
        this.idAjout = idAjout;
    }

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public java.sql.Date getDateAjout() {
        return this.dateAjout;
    }

    public void setDateAjout(java.sql.Date dateAjout) {
        this.dateAjout = dateAjout;
    }

    public Long getQuantiteCmd() {
        return this.quantiteCmd;
    }

    public void setQuantiteCmd(Long quantiteCmd) {
        this.quantiteCmd = quantiteCmd;
    }
}
