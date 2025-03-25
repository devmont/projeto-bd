package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_REDE_ATENCAO")
public class RedeAtencaoModel {

    @Id
    @Column(name = "CO_REDE_ATENCAO")
    private String codRedeAtencao;

    @Column(name = "NO_REDE_ATENCAO")
    private String noRedeAtencao;


    public String getCodRedeAtencao() {
        return codRedeAtencao;
    }

    public void setCodRedeAtencao(String codRedeAtencao) {
        this.codRedeAtencao = codRedeAtencao;
    }

    public String getNoRedeAtencao() {
        return noRedeAtencao;
    }

    public void setNoRedeAtencao(String noRedeAtencao) {
        this.noRedeAtencao = noRedeAtencao;
    }
}




