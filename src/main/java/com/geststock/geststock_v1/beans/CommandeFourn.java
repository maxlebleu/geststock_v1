package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "commande_fourn")
public class CommandeFourn {
    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "id_fournisseur")
    private Long idFournisseur;

    @Column(name = "id_mp")
    private Long idMp;

    @Id
    @Column(name = "id_cmd_four")
    private Long idCmdFour;

    @Column(name = "date_cmd")
    private java.sql.Date dateCmd;

    @Column(name = "qte_cmd")
    private java.sql.Date qteCmd;

    public CommandeFourn() {

    }

    @Column(name = "prix")
    private double prix;

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdFournisseur() {
        return this.idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public Long getIdMp() {
        return this.idMp;
    }

    public void setIdMp(Long idMp) {
        this.idMp = idMp;
    }

    public Long getIdCmdFour() {
        return this.idCmdFour;
    }

    public void setIdCmdFour(Long idCmdFour) {
        this.idCmdFour = idCmdFour;
    }

    public java.sql.Date getDateCmd() {
        return this.dateCmd;
    }

    public void setDateCmd(java.sql.Date dateCmd) {
        this.dateCmd = dateCmd;
    }

    public java.sql.Date getQteCmd() {
        return this.qteCmd;
    }

    public void setQteCmd(java.sql.Date qteCmd) {
        this.qteCmd = qteCmd;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
}
