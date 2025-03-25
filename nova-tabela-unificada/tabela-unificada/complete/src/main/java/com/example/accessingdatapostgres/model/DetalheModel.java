package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_DETALHE")
public class DetalheModel {

    @Id
    @Column(name = "CO_DETALHE")
    private String coDetalhe;

    @Column(name = "NO_DETALHE")
    private String noDetalhe;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoDetalhe() {
        return coDetalhe;
    }

    public void setCoDetalhe(String coDetalhe) {
        this.coDetalhe = coDetalhe;
    }

    public String getNoDetalhe() {
        return noDetalhe;
    }

    public void setNoDetalhe(String noDetalhe) {
        this.noDetalhe = noDetalhe;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
