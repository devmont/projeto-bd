package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TB_PROCEDIMENTO")
public class ProcedimentoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "NO_PROCEDIMENTO")
    private String noProcedimento;

    @Column(name = "TP_COMPLEXIDADE")
    private String tpComplexIdade;

    @Column(name = "TP_SEXO")
    private String tpSexo;

    @Column(name = "QT_MAXIMA_EXECUCAO")
    private Integer qtMaximaExecuao;

    @Column(name = "QT_DIAS_PERMANENCIA")
    private Integer qtDiasPermanencia;

    @Column(name = "QT_PONTOS")
    private Integer qtPontos;

    @Column(name = "VL_IDADE_MINIMA")
    private Integer vlIdadeMinima;

    @Column(name = "VL_IDADE_MAXIMA")
    private Integer vlIdadeMaxima;

    @Column(name = "VL_SH")
    private Integer vlSh;

    @Column(name = "VL_SA")
    private Integer vlSa;

    @Column(name = "VL_SP")
    private Integer vlSp;

    @Column(name = "CO_FINANCIAMENTO")
    private String coFinanciamento;

    @Column(name = "CO_RUBRICA")
    private String coRubrica;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getNoProcedimento() {
        return noProcedimento;
    }

    public void setNoProcedimento(String noProcedimento) {
        this.noProcedimento = noProcedimento;
    }

    public String getTpComplexIdade() {
        return tpComplexIdade;
    }

    public void setTpComplexIdade(String tpComplexIdade) {
        this.tpComplexIdade = tpComplexIdade;
    }

    public String getTpSexo() {
        return tpSexo;
    }

    public void setTpSexo(String tpSexo) {
        this.tpSexo = tpSexo;
    }

    public Integer getQtMaximaExecuao() {
        return qtMaximaExecuao;
    }

    public void setQtMaximaExecuao(Integer qtMaximaExecuao) {
        this.qtMaximaExecuao = qtMaximaExecuao;
    }

    public Integer getQtDiasPermanencia() {
        return qtDiasPermanencia;
    }

    public void setQtDiasPermanencia(Integer qtDiasPermanencia) {
        this.qtDiasPermanencia = qtDiasPermanencia;
    }

    public Integer getQtPontos() {
        return qtPontos;
    }

    public void setQtPontos(Integer qtPontos) {
        this.qtPontos = qtPontos;
    }

    public Integer getVlIdadeMinima() {
        return vlIdadeMinima;
    }

    public void setVlIdadeMinima(Integer vlIdadeMinima) {
        this.vlIdadeMinima = vlIdadeMinima;
    }

    public Integer getVlIdadeMaxima() {
        return vlIdadeMaxima;
    }

    public void setVlIdadeMaxima(Integer vlIdadeMaxima) {
        this.vlIdadeMaxima = vlIdadeMaxima;
    }

    public Integer getVlSh() {
        return vlSh;
    }

    public void setVlSh(Integer vlSh) {
        this.vlSh = vlSh;
    }

    public Integer getVlSa() {
        return vlSa;
    }

    public void setVlSa(Integer vlSa) {
        this.vlSa = vlSa;
    }

    public Integer getVlSp() {
        return vlSp;
    }

    public void setVlSp(Integer vlSp) {
        this.vlSp = vlSp;
    }

    public String getCoFinanciamento() {
        return coFinanciamento;
    }

    public void setCoFinanciamento(String coFinanciamento) {
        this.coFinanciamento = coFinanciamento;
    }

    public String getCoRubrica() {
        return coRubrica;
    }

    public void setCoRubrica(String coRubrica) {
        this.coRubrica = coRubrica;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}