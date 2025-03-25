package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_DESCRICAO_DETALHE")
public class DescricaoDetalheModel {

    @Id
    @Column(name = "CO_DETALHE")
    private String coDetalhe;

    @Column(name = "DS_DETALHE")
    private String dsDetalhe;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoDetalhe() {
        return coDetalhe;
    }

    public void setCoDetalhe(String coDetalhe) {
        this.coDetalhe = coDetalhe;
    }

    public String getDsDetalhe() {
        return dsDetalhe;
    }

    public void setDsDetalhe(String dsDetalhe) {
        this.dsDetalhe = dsDetalhe;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}

