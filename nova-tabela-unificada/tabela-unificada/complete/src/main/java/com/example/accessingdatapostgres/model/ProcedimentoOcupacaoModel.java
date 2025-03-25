package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_ocupacao")
public class ProcedimentoOcupacaoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;


    @Column(name = "CO_OCUPACAO")
    private String coOcupacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoOcupacao() {
        return coOcupacao;
    }

    public void setCoOcupacao(String coOcupacao) {
        this.coOcupacao = coOcupacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}