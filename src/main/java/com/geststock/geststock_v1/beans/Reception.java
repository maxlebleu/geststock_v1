package com.geststock.geststock_v1.beans;

import javax.persistence.*;

@Entity
@Table(name = "reception")
public class Reception {
    @Id
    @Column(name = "id_reception")
    private Long idReception;

    @Column(name = "id_personne")
    private Long idPersonne;

    @Column(name = "id_mp")
    private Long idMp;

    @Column(name = "id_cmd_four")
    private Long idCmdFour;

    @Column(name = "qte_recue")
    private Long qteRecue;

    @Column(name = "date_reception")
    private java.sql.Date dateReception;

    public Long getIdReception() {
        return this.idReception;
    }

    public void setIdReception(Long idReception) {
        this.idReception = idReception;
    }

    public Long getIdPersonne() {
        return this.idPersonne;
    }

    public void setIdPersonne(Long idPersonne) {
        this.idPersonne = idPersonne;
    }

    public Long getIdMp() {
        return this.idMp;
    }

    public void setIdMp(Long idMp) {
        this.idMp = idMp;
    }

    public Long getIdCmdFour() {
        return this.idCmdFour;
    }

    public void setIdCmdFour(Long idCmdFour) {
        this.idCmdFour = idCmdFour;
    }

    public Long getQteRecue() {
        return this.qteRecue;
    }

    public void setQteRecue(Long qteRecue) {
        this.qteRecue = qteRecue;
    }

    public java.sql.Date getDateReception() {
        return this.dateReception;
    }

    public void setDateReception(java.sql.Date dateReception) {
        this.dateReception = dateReception;
    }
}
