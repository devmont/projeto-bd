package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_habilitacao")
public class ProcedimentoIncrementoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_HABILITACAO")
    private String coHabilitacao;

    @Column(name = "VL_PERCENTUAL_SH")
    private String vlPercentualSh;

    @Column(name = "VL_PERCENTUAL_SA")
    private String vlPercentualSa;

    @Column(name = "VL_PERCENTUAL_SP")
    private String vlPercentualSp;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoHabilitacao() {
        return coHabilitacao;
    }

    public void setCoHabilitacao(String coHabilitacao) {
        this.coHabilitacao = coHabilitacao;
    }

    public String getVlPercentualSh() {
        return vlPercentualSh;
    }

    public void setVlPercentualSh(String vlPercentualSh) {
        this.vlPercentualSh = vlPercentualSh;
    }

    public String getVlPercentualSa() {
        return vlPercentualSa;
    }

    public void setVlPercentualSa(String vlPercentualSa) {
        this.vlPercentualSa = vlPercentualSa;
    }

    public String getVlPercentualSp() {
        return vlPercentualSp;
    }

    public void setVlPercentualSp(String vlPercentualSp) {
        this.vlPercentualSp = vlPercentualSp;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
