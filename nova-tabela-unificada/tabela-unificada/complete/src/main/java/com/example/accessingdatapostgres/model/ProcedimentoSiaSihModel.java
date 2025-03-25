package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_sia_sih")
public class ProcedimentoSiaSihModel {


    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_PROCEDIMENTO_SIA_SIH")
    private String coProcedimentoSiaSih;

    @Column(name = "TP_PROCEDIMENTO")
    private String tpProcedimento;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoProcedimentoSiaSih() {
        return coProcedimentoSiaSih;
    }

    public void setCoProcedimentoSiaSih(String coProcedimentoSiaSih) {
        this.coProcedimentoSiaSih = coProcedimentoSiaSih;
    }

    public String getTpProcedimento() {
        return tpProcedimento;
    }

    public void setTpProcedimento(String tpProcedimento) {
        this.tpProcedimento = tpProcedimento;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
