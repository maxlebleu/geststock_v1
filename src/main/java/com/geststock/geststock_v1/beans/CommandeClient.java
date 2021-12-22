package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "commande_client")
public class CommandeClient {
    @Column(name = "id_personne")
    private Long idPersonne;

    @Id
    @Column(name = "id_cmd")
    private Long idCmd;

    @Column(name = "date_cmd")
    private java.sql.Date dateCmd;

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdCmd() {
        return this.idCmd;
    }

    public void setIdCmd(Long idCmd) {
        this.idCmd = idCmd;
    }

    public java.sql.Date getDateCmd() {
        return this.dateCmd;
    }

    public void setDateCmd(java.sql.Date dateCmd) {
        this.dateCmd = dateCmd;
    }
}
