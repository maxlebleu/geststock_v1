package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "livraison_entreprise")
public class LivraisonEntreprise {
    @Id
    @Column(name = "id_livraison")
    private Long idLivraison;

    @Column(name = "id_cmd")
    private Long idCmd;

    @Column(name = "type_livraison")
    private String typeLivraison;

    @Column(name = "date_livraison")
    private java.sql.Date dateLivraison;

    @Column(name = "qte_livraison")
    private Long qteLivraison;

    public Long getIdLivraison() {
        return this.idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public Long getIdCmd() {
        return this.idCmd;
    }

    public void setIdCmd(Long idCmd) {
        this.idCmd = idCmd;
    }

    public String getTypeLivraison() {
        return this.typeLivraison;
    }

    public void setTypeLivraison(String typeLivraison) {
        this.typeLivraison = typeLivraison;
    }

    public java.sql.Date getDateLivraison() {
        return this.dateLivraison;
    }

    public void setDateLivraison(java.sql.Date dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    public Long getQteLivraison() {
        return this.qteLivraison;
    }

    public void setQteLivraison(Long qteLivraison) {
        this.qteLivraison = qteLivraison;
    }
}
