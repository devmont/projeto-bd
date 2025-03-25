package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_cid")
public class ProcedimentoCidModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_CID")
    private String coCid;

    @Column(name = "ST_PRINCIPAL")
    private String stPrincipal;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoCid() {
        return coCid;
    }

    public void setCoCid(String coCid) {
        this.coCid = coCid;
    }

    public String getStPrincipal() {
        return stPrincipal;
    }

    public void setStPrincipal(String stPrincipal) {
        this.stPrincipal = stPrincipal;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
