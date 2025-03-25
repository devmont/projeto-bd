package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_SERVICO")
public class ServicoModel {

    @Id
    @Column(name = "CO_SERVICO")
    private String coServico;

    @Column(name = "NO_SERVICO")
    private String noServico;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoServico() {
        return coServico;
    }

    public void setCoServico(String coServico) {
        this.coServico = coServico;
    }

    public String getNoServico() {
        return noServico;
    }

    public void setNoServico(String noServico) {
        this.noServico = noServico;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
