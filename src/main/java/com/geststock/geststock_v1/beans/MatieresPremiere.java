package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "matieres_premiere")
public class MatieresPremiere {
    @Id
    @Column(name = "id_mp")
    private Long idMp;

    @Column(name = "id_type")
    private Long idType;

    @Column(name = "code_mp")
    private String codeMp;

    @Column(name = "nom_mp")
    private String nomMp;

    @Column(name = "quantite_mp")
    private Long quantiteMp;

    @Column(name = "type")
    private String type;

    @Column(name = "prix")
    private double prix;

    @Column(name = "seuil_mp")
    private Long seuilMp;

    public MatieresPremiere() {

    }

    public Long getIdMp() {
        return this.idMp;
    }

    public void setIdMp(Long idMp) {
        this.idMp = idMp;
    }

    public Long getIdType() {
        return this.idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getCodeMp() {
        return this.codeMp;
    }

    public void setCodeMp(String codeMp) {
        this.codeMp = codeMp;
    }

    public String getNomMp() {
        return this.nomMp;
    }

    public void setNomMp(String nomMp) {
        this.nomMp = nomMp;
    }

    public Long getQuantiteMp() {
        return this.quantiteMp;
    }

    public void setQuantiteMp(Long quantiteMp) {
        this.quantiteMp = quantiteMp;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrix() {
        return this.prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public Long getSeuilMp() {
        return this.seuilMp;
    }

    public void setSeuilMp(Long seuilMp) {
        this.seuilMp = seuilMp;
    }
}
