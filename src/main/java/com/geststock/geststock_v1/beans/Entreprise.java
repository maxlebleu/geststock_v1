package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "entreprise")
public class Entreprise {
    @Id
    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @Column(name = "nom_entreprise")
    private String nomEntreprise;

    @Column(name = "description")
    private String description;

    @Column(name = "logo")
    private String logo;

    @Column(name = "localisation")
    private String localisation;

    public Long getIdEntreprise() {
        return this.idEntreprise;
    }

    public void setIdEntreprise(Long idEntreprise) {
        this.idEntreprise = idEntreprise;
    }

    public String getNomEntreprise() {
        return this.nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLogo() {
        return this.logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLocalisation() {
        return this.localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }
}
