package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_HABILITACAO")
public class HabilitacaoModel {

    @Id
    @Column(name = "CO_HABILITACAO")
    private String coHabilitacao;

    @Column(name = "NO_HABILITACAO")
    private String noHabilitacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoHabilitacao() {
        return coHabilitacao;
    }

    public void setCoHabilitacao(String coHabilitacao) {
        this.coHabilitacao = coHabilitacao;
    }

    public String getNoHabilitacao() {
        return noHabilitacao;
    }

    public void setNoHabilitacao(String noHabilitacao) {
        this.noHabilitacao = noHabilitacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
