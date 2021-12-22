package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @Column(name = "id_categorie")
    private Long idCategorie;

    @Column(name = "description")
    private String description;

    @Column(name = "nom_categorie")
    private String nomCategorie;

    public Long getIdCategorie() {
        return this.idCategorie;
    }

    public void setIdCategorie(Long idCategorie) {
        this.idCategorie = idCategorie;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getNomCategorie() {
        return this.nomCategorie;
    }

    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
}
