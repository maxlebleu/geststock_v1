package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "payement")
public class Payement {
    @Id
    @Column(name = "id_payement")
    private Long idPayement;

    @Column(name = "id_type_payement")
    private Long idTypePayement;

    @Column(name = "id_client")
    private Long idClient;

    @Column(name = "id_livraison")
    private Long idLivraison;

    @Column(name = "date_payement")
    private java.sql.Date datePayement;

    public Payement() {

    }

    @Column(name = "montant")
    private double montant;

    public Long getIdPayement() {
        return this.idPayement;
    }

    public void setIdPayement(Long idPayement) {
        this.idPayement = idPayement;
    }

    public Long getIdTypePayement() {
        return this.idTypePayement;
    }

    public void setIdTypePayement(Long idTypePayement) {
        this.idTypePayement = idTypePayement;
    }

    public Long getIdClient() {
        return this.idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public Long getIdLivraison() {
        return this.idLivraison;
    }

    public void setIdLivraison(Long idLivraison) {
        this.idLivraison = idLivraison;
    }

    public java.sql.Date getDatePayement() {
        return this.datePayement;
    }

    public void setDatePayement(java.sql.Date datePayement) {
        this.datePayement = datePayement;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
