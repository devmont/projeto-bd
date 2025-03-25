package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_comp_rede")
public class ProcedimentoCompRedeModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_COMPONENTE_REDE")
    private String coComponentRede;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoComponentRede() {
        return coComponentRede;
    }

    public void setCoComponentRede(String coComponentRede) {
        this.coComponentRede = coComponentRede;
    }
}
