package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "TB_TIPO_LEITO")
public class TipoLeitoModel {

    @Id
    @Column(name = "CO_TIPO_LEITO")
    private String tipoLeito;

    @Column(name = "NO_TIPO_LEITO")
    private String noTipoLeito;

    @Column(name = "DT_COMPETENCIA")
    private LocalDate dtCompetencia;

    public String getTipoLeito() {
        return tipoLeito;
    }

    public void setTipoLeito(String tipoLeito) {
        this.tipoLeito = tipoLeito;
    }

    public String getNoTipoLeito() {
        return noTipoLeito;
    }

    public void setNoTipoLeito(String noTipoLeito) {
        this.noTipoLeito = noTipoLeito;
    }

    public LocalDate getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(LocalDate dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }
}
