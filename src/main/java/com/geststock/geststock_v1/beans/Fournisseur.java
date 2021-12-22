package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "fournisseur")
public class Fournisseur {
    @Id
    @Column(name = "id_fournisseur")
    private Long idFournisseur;

    @Column(name = "nom")
    private String nom;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "liste_produits")
    private String listeProduits;

    public Long getIdFournisseur() {
        return this.idFournisseur;
    }

    public void setIdFournisseur(Long idFournisseur) {
        this.idFournisseur = idFournisseur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getListeProduits() {
        return this.listeProduits;
    }

    public void setListeProduits(String listeProduits) {
        this.listeProduits = listeProduits;
    }
}
