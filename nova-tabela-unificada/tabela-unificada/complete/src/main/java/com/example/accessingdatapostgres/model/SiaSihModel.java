package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_SIA_SIH")
public class SiaSihModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO_SIA_SIH")
    private String coProcedimentoSiaSih;

    @Column(name = "NO_PROCEDIMENTO_SIA_SIH")
    private String noProcedimentoSiaSih;

    @Column(name = "TP_PROCEDIMENTO")
    private String tpProcedimento;


    public String getCoProcedimentoSiaSih() {
        return coProcedimentoSiaSih;
    }

    public void setCoProcedimentoSiaSih(String coProcedimentoSiaSih) {
        this.coProcedimentoSiaSih = coProcedimentoSiaSih;
    }

    public String getNoProcedimentoSiaSih() {
        return noProcedimentoSiaSih;
    }

    public void setNoProcedimentoSiaSih(String noProcedimentoSiaSih) {
        this.noProcedimentoSiaSih = noProcedimentoSiaSih;
    }

    public String getTpProcedimento() {
        return tpProcedimento;
    }

    public void setTpProcedimento(String tpProcedimento) {
        this.tpProcedimento = tpProcedimento;
    }
}

