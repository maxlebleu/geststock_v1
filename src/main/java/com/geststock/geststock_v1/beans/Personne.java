package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "personne")
public class Personne {
    @Id
    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "id_role")
    private Long idRole;

    @Column(name = "nom")
    private String nom;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email")
    private String email;

    @Column(name = "localisation")
    private String localisation;

    @Column(name = "id_paye")
    private Long idPaye;

    @Column(name = "montant_paye")
    private double montantPaye;

    @Column(name = "date_paye")
    private java.sql.Date datePaye;

    public Personne() {

    }

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdRole() {
        return this.idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return this.telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public Long getIdPaye() {
        return this.idPaye;
    }

    public void setIdPaye(Long idPaye) {
        this.idPaye = idPaye;
    }

    public double getMontantPaye() {
        return this.montantPaye;
    }

    public void setMontantPaye(double montantPaye) {
        this.montantPaye = montantPaye;
    }

    public java.sql.Date getDatePaye() {
        return this.datePaye;
    }

    public void setDatePaye(java.sql.Date datePaye) {
        this.datePaye = datePaye;
    }
}
