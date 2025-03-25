package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_SERVICO_CLASSIFICACAO")
public class ServicoClassificacaoModel {

    @Id
    @Column(name = "CO_SERVICO")
    private String coServico;

    @Column(name = "CO_CLASSIFICACAO")
    private String coClassificacao;

    @Column(name = "NO_CLASSIFICACAO")
    private String noClassificacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


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

    public String getNoClassificacao() {
        return noClassificacao;
    }

    public void setNoClassificacao(String noClassificacao) {
        this.noClassificacao = noClassificacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
