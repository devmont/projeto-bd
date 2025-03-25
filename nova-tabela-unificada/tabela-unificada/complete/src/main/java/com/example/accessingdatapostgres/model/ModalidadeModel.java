package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_MODALIDADE")
public class ModalidadeModel {


    @Id
    @Column(name = "CO_MODALIDADE")
    private String coModalidade;

    @Column(name = "NO_MODALIDADE")
    private String noModalidade;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoModalidade() {
        return coModalidade;
    }

    public void setCoModalidade(String coModalidade) {
        this.coModalidade = coModalidade;
    }

    public String getNoModalidade() {
        return noModalidade;
    }

    public void setNoModalidade(String noModalidade) {
        this.noModalidade = noModalidade;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
