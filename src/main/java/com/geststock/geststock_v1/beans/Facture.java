package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "facture")
public class Facture {
    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "id_cmd")
    private Long idCmd;

    @Id
    @Column(name = "id_facture")
    private Long idFacture;

    @Column(name = "id_livraison")
    private Long idLivraison;

    @Column(name = "num_facture")
    private String numFacture;

    @Column(name = "date_facture")
    private java.sql.Date dateFacture;

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdCmd() {
        return this.idCmd;
    }

    public void setIdCmd(Long idCmd) {
        this.idCmd = idCmd;
    }

    public Long getIdFacture() {
        return this.idFacture;
    }

    public void setIdFacture(Long idFacture) {
        this.idFacture = idFacture;
    }

    public Long getIdLivraison() {
        return this.idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public String getNumFacture() {
        return this.numFacture;
    }

    public void setNumFacture(String numFacture) {
        this.numFacture = numFacture;
    }

    public java.sql.Date getDateFacture() {
        return this.dateFacture;
    }

    public void setDateFacture(java.sql.Date dateFacture) {
        this.dateFacture = dateFacture;
    }
}
