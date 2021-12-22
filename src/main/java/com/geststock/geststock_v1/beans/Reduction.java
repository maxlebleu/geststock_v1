package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "reduction")
public class Reduction {
    @Id
    @Column(name = "id_reduction")
    private Long idReduction;

    public Reduction() {

    }

    @Column(name = "pourcentage")
    private double pourcentage;

    @Column(name = "prix_min")
    private double prixMin;

    public Long getIdReduction() {
        return this.idReduction;
    }

    public void setIdReduction(Long idReduction) {
        this.idReduction = idReduction;
    }

    public double getPourcentage() {
        return this.pourcentage;
    }

    public void setPourcentage(double pourcentage) {
        this.pourcentage = pourcentage;
    }

    public double getPrixMin() {
        return this.prixMin;
    }

    public void setPrixMin(double prixMin) {
        this.prixMin = prixMin;
    }
}
