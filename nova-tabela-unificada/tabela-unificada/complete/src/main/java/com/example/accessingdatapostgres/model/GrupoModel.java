package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_GRUPO")
public class GrupoModel {

    @Id
    @Column(name = "CO_GRUPO")
    private String coGrupo;

    @Column(name = "NO_GRUPO")
    private String noGrupo;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoGrupo() {
        return coGrupo;
    }

    public void setCoGrupo(String coGrupo) {
        this.coGrupo = coGrupo;
    }

    public String getNoGrupo() {
        return noGrupo;
    }

    public void setNoGrupo(String noGrupo) {
        this.noGrupo = noGrupo;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
