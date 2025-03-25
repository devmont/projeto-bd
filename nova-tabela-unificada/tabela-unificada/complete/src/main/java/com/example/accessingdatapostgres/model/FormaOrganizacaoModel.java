package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_FORMA_ORGANIZACAO")
public class FormaOrganizacaoModel {


    @Column(name = "CO_GRUPO")
    private String grupo;

    @Column(name = "CO_SUB_GRUPO")
    private String subGrupo;

    @Id
    @Column(name = "CO_FORMA_ORGANIZACAO")
    private String formaOrganizacao;

    @Column(name = "NO_FORMA_ORGANIZACAO")
    private String noFormaOrganizacao;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getSubGrupo() {
        return subGrupo;
    }

    public void setSubGrupo(String subGrupo) {
        this.subGrupo = subGrupo;
    }

    public String getFormaOrganizacao() {
        return formaOrganizacao;
    }

    public void setFormaOrganizacao(String formaOrganizacao) {
        this.formaOrganizacao = formaOrganizacao;
    }

    public String getNoFormaOrganizacao() {
        return noFormaOrganizacao;
    }

    public void setNoFormaOrganizacao(String noFormaOrganizacao) {
        this.noFormaOrganizacao = noFormaOrganizacao;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
