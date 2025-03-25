package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_OCUPACAO")
public class OcupacaoModel {

    @Id
    @Column(name = "CO_OCUPACAO")
    private String coOcupacao;

    @Column(name = "NO_OCUPACAO")
    private String noOcupacao;

    public String getCoOcupacao() {
        return coOcupacao;
    }

    public void setCoOcupacao(String coOcupacao) {
        this.coOcupacao = coOcupacao;
    }

    public String getNoOcupacao() {
        return noOcupacao;
    }

    public void setNoOcupacao(String noOcupacao) {
        this.noOcupacao = noOcupacao;
    }
}
