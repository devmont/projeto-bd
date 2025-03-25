
package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_DESCRICAO")
public class DescricaoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "DS_PROCEDIMENTO")
    private String dsProcedimento;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getDsProcedimento() {
        return dsProcedimento;
    }

    public void setDsProcedimento(String dsProcedimento) {
        this.dsProcedimento = dsProcedimento;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}

