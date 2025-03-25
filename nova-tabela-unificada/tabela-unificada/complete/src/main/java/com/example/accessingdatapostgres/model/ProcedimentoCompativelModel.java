package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_compativel")
public class ProcedimentoCompativelModel {


    @Id
    @Column(name = "CO_PROCEDIMENTO_PRINCIPAL")
    private String coProcedimentPrincipal;

    @Column(name = "CO_REGISTRO_PRINCIPAL")
    private String coRegistroPrincipal;

    @Column(name = "CO_PROCEDIMENTO_COMPATIVEL")
    private String coProcedimentCompativel;

    @Column(name = "CO_REGISTRO_COMPATIVEL")
    private String coRegistroCompativel;

    @Column(name = "TP_COMPATIBILIDADE")
    private String tpCompatibilidade;

    @Column(name = "QT_PERMITIDA")
    private String qtPermitida;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoProcedimentPrincipal() {
        return coProcedimentPrincipal;
    }

    public void setCoProcedimentPrincipal(String coProcedimentPrincipal) {
        this.coProcedimentPrincipal = coProcedimentPrincipal;
    }

    public String getCoRegistroPrincipal() {
        return coRegistroPrincipal;
    }

    public void setCoRegistroPrincipal(String coRegistroPrincipal) {
        this.coRegistroPrincipal = coRegistroPrincipal;
    }

    public String getCoProcedimentCompativel() {
        return coProcedimentCompativel;
    }

    public void setCoProcedimentCompativel(String coProcedimentCompativel) {
        this.coProcedimentCompativel = coProcedimentCompativel;
    }

    public String getCoRegistroCompativel() {
        return coRegistroCompativel;
    }

    public void setCoRegistroCompativel(String coRegistroCompativel) {
        this.coRegistroCompativel = coRegistroCompativel;
    }

    public String getTpCompatibilidade() {
        return tpCompatibilidade;
    }

    public void setTpCompatibilidade(String tpCompatibilidade) {
        this.tpCompatibilidade = tpCompatibilidade;
    }

    public String getQtPermitida() {
        return qtPermitida;
    }

    public void setQtPermitida(String qtPermitida) {
        this.qtPermitida = qtPermitida;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
