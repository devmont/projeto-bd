package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_RUBRICA")
public class RubricaModel {

    @Id
    @Column(name = "CO_RUBRICA")
    private String codRubrica;

    @Column(name = "NO_RUBRICA")
    private String noRubrica;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCodRubrica() {
        return codRubrica;
    }

    public void setCodRubrica(String codRubrica) {
        this.codRubrica = codRubrica;
    }

    public String getNoRubrica() {
        return noRubrica;
    }

    public void setNoRubrica(String noRubrica) {
        this.noRubrica = noRubrica;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
