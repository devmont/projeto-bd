package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_regra_cond")
public class ProcedimentoRegraCondModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_REGRA_CONDICIONADA")
    private String coRegraCondicionada;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoRegraCondicionada() {
        return coRegraCondicionada;
    }

    public void setCoRegraCondicionada(String coRegraCondicionada) {
        this.coRegraCondicionada = coRegraCondicionada;
    }
}
