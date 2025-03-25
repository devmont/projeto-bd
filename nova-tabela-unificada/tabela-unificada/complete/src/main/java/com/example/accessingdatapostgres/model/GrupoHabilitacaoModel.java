package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_GRUPO_HABILITACAO")
public class GrupoHabilitacaoModel {

    @Id
    @Column(name = "NU_GRUPO_HABILITACAO")
    private String nuGrupoHabilitacao;

    @Column(name = "NO_GRUPO_HABILITACAO")
    private String noGrupoHabilitacao;

    @Column(name = "DS_GRUPO_HABILITACAO")
    private String dsGrupoHabilitacao;


    public String getNuGrupoHabilitacao() {
        return nuGrupoHabilitacao;
    }

    public void setNuGrupoHabilitacao(String nuGrupoHabilitacao) {
        this.nuGrupoHabilitacao = nuGrupoHabilitacao;
    }

    public String getNoGrupoHabilitacao() {
        return noGrupoHabilitacao;
    }

    public void setNoGrupoHabilitacao(String noGrupoHabilitacao) {
        this.noGrupoHabilitacao = noGrupoHabilitacao;
    }

    public String getDsGrupoHabilitacao() {
        return dsGrupoHabilitacao;
    }

    public void setDsGrupoHabilitacao(String dsGrupoHabilitacao) {
        this.dsGrupoHabilitacao = dsGrupoHabilitacao;
    }
}
