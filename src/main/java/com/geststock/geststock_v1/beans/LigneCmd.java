package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "ligne_cmd")
public class LigneCmd {
    @Id
    @Column(name = "id_ligne_cmd")
    private Long idLigneCmd;

    @Column(name = "id_cmd")
    private Long idCmd;

    @Column(name = "id_article")
    private Long idArticle;

    @Column(name = "quantite")
    private Long quantite;

    public Long getIdLigneCmd() {
        return this.idLigneCmd;
    }

    public void setIdLigneCmd(Long idLigneCmd) {
        this.idLigneCmd = idLigneCmd;
    }

    public Long getIdCmd() {
        return this.idCmd;
    }

    public void setIdCmd(Long idCmd) {
        this.idCmd = idCmd;
    }

    public Long getIdArticle() {
        return this.idArticle;
    }

    public void setIdArticle(Long idArticle) {
        this.idArticle = idArticle;
    }

    public Long getQuantite() {
        return this.quantite;
    }

    public void setQuantite(Long quantite) {
        this.quantite = quantite;
    }
}
