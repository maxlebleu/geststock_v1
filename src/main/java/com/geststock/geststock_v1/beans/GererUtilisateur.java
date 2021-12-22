package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "gerer_utilisateur")
public class GererUtilisateur {
    @Id
    @Column(name = "id_gestion")
    private Long idGestion;

    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "per_id_personne")
    private Long perIdPersonne;

    @Column(name = "action")
    private String action;

    @Column(name = "date_cmd")
    private java.sql.Date dateCmd;

    public Long getIdGestion() {
        return this.idGestion;
    }

    public void setIdGestion(Long idGestion) {
        this.idGestion = idGestion;
    }

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getPerIdPersonne() {
        return this.perIdPersonne;
    }

    public void setPerIdPersonne(Long perIdPersonne) {
        this.perIdPersonne = perIdPersonne;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public java.sql.Date getDateCmd() {
        return this.dateCmd;
    }

    public void setDateCmd(java.sql.Date dateCmd) {
        this.dateCmd = dateCmd;
    }
}
