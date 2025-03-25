package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_servico")
public class ProcedimentoServicoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_SERVICO")
    private String coServico;

    @Column(name = "CO_CLASSIFICACAO")
    private String coClassificacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoServico() {
        return coServico;
    }

    public void setCoServico(String coServico) {
        this.coServico = coServico;
    }

    public String getCoClassificacao() {
        return coClassificacao;
    }

    public void setCoClassificacao(String coClassificacao) {
        this.coClassificacao = coClassificacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
