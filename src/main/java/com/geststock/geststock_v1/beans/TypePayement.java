package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "type_payement")
public class TypePayement {
    @Id
    @Column(name = "id_type_payement")
    private Long idTypePayement;

    @Column(name = "nom_type_payement")
    private String nomTypePayement;

    public Long getIdTypePayement() {
        return this.idTypePayement;
    }

    public void setIdTypePayement(Long idTypePayement) {
        this.idTypePayement = idTypePayement;
    }

    public String getNomTypePayement() {
        return this.nomTypePayement;
    }

    public void setNomTypePayement(String nomTypePayement) {
        this.nomTypePayement = nomTypePayement;
    }
}
