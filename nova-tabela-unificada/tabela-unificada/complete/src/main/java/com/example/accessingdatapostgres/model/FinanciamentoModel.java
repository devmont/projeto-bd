package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_FINANCIAMENTO")
public class FinanciamentoModel {

    @Id
    @Column(name = "CO_FINANCIAMENTO")
    private String coFinanciamento;

    @Column(name = "NO_FINANCIAMENTO")
    private String noFinanciamento;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoFinanciamento() {
        return coFinanciamento;
    }

    public void setCoFinanciamento(String coFinanciamento) {
        this.coFinanciamento = coFinanciamento;
    }

    public String getNoFinanciamento() {
        return noFinanciamento;
    }

    public void setNoFinanciamento(String noFinanciamento) {
        this.noFinanciamento = noFinanciamento;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}