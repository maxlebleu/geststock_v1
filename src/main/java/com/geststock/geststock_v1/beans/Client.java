package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @Column(name = "id_client")
    private Long idClient;

    @Column(name = "nom_client")
    private String nomClient;

    @Column(name = "telephone_client")
    private String telephoneClient;

    @Column(name = "id_payement")
    private Long idPayement;

    @Column(name = "type")
    private String type;

    @Column(name = "montant")
    private double montant;

    @Column(name = "date_payement")
    private java.sql.Date datePayement;

    public Client() {

    }

    public Long getIdClient() {
        return this.idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return this.nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getTelephoneClient() {
        return this.telephoneClient;
    }

    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }

    public Long getIdPayement() {
        return this.idPayement;
    }

    public void setIdPayement(Long idPayement) {
        this.idPayement = idPayement;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMontant() {
        return this.montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public java.sql.Date getDatePayement() {
        return this.datePayement;
    }

    public void setDatePayement(java.sql.Date datePayement) {
        this.datePayement = datePayement;
    }
}
