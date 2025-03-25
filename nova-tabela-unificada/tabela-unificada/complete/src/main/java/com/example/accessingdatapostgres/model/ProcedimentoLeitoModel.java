package com.example.accessingdatapostgres.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "rl_procedimento_leito")
public class ProcedimentoLeitoModel {

    @Id
    @Column(name = "CO_PROCEDIMENTO")
    private String coProcedimento;

    @Column(name = "CO_TIPO_LEITO")
    private String coTipoLeito;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getCoProcedimento() {
        return coProcedimento;
    }

    public void setCoProcedimento(String coProcedimento) {
        this.coProcedimento = coProcedimento;
    }

    public String getCoTipoLeito() {
        return coTipoLeito;
    }

    public void setCoTipoLeito(String coTipoLeito) {
        this.coTipoLeito = coTipoLeito;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}