package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "type_mp")
public class TypeMp {
    @Id
    @Column(name = "id_type")
    private Long idType;

    @Column(name = "nom_mp")
    private String nomMp;

    public Long getIdType() {
        return this.idType;
    }

    public void setIdType(Long idType) {
        this.idType = idType;
    }

    public String getNomMp() {
        return this.nomMp;
    }

    public void setNomMp(String nomMp) {
        this.nomMp = nomMp;
    }
}
