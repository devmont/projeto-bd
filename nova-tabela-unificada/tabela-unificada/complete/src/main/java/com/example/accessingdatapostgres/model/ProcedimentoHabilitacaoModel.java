package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_habilitacao")
public class ProcedimentoHabilitacaoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_HABILITACAO")
    private String coHabilitacao;

    @Column(name = "NU_GRUPO_HABILITACAO")
    private String nuGrupoHabilitacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoHabilitacao() {
        return coHabilitacao;
    }

    public void setCoHabilitacao(String coHabilitacao) {
        this.coHabilitacao = coHabilitacao;
    }

    public String getNuGrupoHabilitacao() {
        return nuGrupoHabilitacao;
    }

    public void setNuGrupoHabilitacao(String nuGrupoHabilitacao) {
        this.nuGrupoHabilitacao = nuGrupoHabilitacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
