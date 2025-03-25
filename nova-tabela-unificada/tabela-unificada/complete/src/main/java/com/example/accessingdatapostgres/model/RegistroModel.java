package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "TB_REGISTRO")
public class RegistroModel {

    @Id
    @Column(name = "CO_REGISTRO")
    private String coRegistro;

    @Column(name = "NO_REGISTRO")
    private String noRegistro;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;


    public String getCoRegistro() {
        return coRegistro;
    }

    public void setCoRegistro(String coRegistro) {
        this.coRegistro = coRegistro;
    }

    public String getNoRegistro() {
        return noRegistro;
    }

    public void setNoRegistro(String noRegistro) {
        this.noRegistro = noRegistro;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}





