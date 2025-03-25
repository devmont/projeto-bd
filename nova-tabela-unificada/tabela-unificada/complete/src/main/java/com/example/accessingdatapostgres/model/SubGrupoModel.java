package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_SUB_GRUPO")
public class SubGrupoModel {

    @Id
    @Column(name = "CO_SUB_GRUPO")
    private String subGrupo;

    @Column(name = "CO_GRUPO")
    private String coGrupo;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(String subGrupo) {
        this.subGrupo = subGrupo;
    }

    public String getCoGrupo() {
        return coGrupo;
    }

    public void setCoGrupo(String coGrupo) {
        this.coGrupo = coGrupo;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
