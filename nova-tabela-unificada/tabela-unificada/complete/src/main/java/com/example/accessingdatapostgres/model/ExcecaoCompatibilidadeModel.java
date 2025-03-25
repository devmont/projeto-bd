package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_excecao_compatibilidade")
public class ExcecaoCompatibilidadeModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO_RESTRICAO")
    private String coProcedimentoRestricao;

    @Column(name = "CO_PROCEDIMENTO_PRINCIPAL")
    private String coProcedimentoPrincipal;

    @Column(name = "CO_REGISTRO_PRINCIPAL")
    private String coRegistroPrincipal;

    @Column(name = "CO_PROCEDIMENTO_COMPATIVEL")
    private String coProcedimentoCompativel;

    @Column(name = "CO_REGISTRO_COMPATIVEL")
    private String coRegistroCompativel;

    @Column(name = "TP_COMPATIBILIDADE")
    private String tpCompatitividade;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimentoRestricao() {
        return coProcedimentoRestricao;
    }

    public void setCoProcedimentoRestricao(String coProcedimentoRestricao) {
        this.coProcedimentoRestricao = coProcedimentoRestricao;
    }

    public String getCoProcedimentoPrincipal() {
        return coProcedimentoPrincipal;
    }

    public void setCoProcedimentoPrincipal(String coProcedimentoPrincipal) {
        this.coProcedimentoPrincipal = coProcedimentoPrincipal;
    }

    public String getCoRegistroPrincipal() {
        return coRegistroPrincipal;
    }

    public void setCoRegistroPrincipal(String coRegistroPrincipal) {
        this.coRegistroPrincipal = coRegistroPrincipal;
    }

    public String getCoProcedimentoCompativel() {
        return coProcedimentoCompativel;
    }

    public void setCoProcedimentoCompativel(String coProcedimentoCompativel) {
        this.coProcedimentoCompativel = coProcedimentoCompativel;
    }

    public String getCoRegistroCompativel() {
        return coRegistroCompativel;
    }

    public void setCoRegistroCompativel(String coRegistroCompativel) {
        this.coRegistroCompativel = coRegistroCompativel;
    }

    public String getTpCompatitividade() {
        return tpCompatitividade;
    }

    public void setTpCompatitividade(String tpCompatitividade) {
        this.tpCompatitividade = tpCompatitividade;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}