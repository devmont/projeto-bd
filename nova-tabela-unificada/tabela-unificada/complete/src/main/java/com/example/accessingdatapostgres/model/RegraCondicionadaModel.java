
package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_REGRA_CONDICIONADA")
public class RegraCondicionadaModel {

    @Id
    @Column(name = "CO_REGRA_CONDICIONADA")
    private String coRegraCondicionada;

    @Column(name = "NO_REGRA_CONDICIONADA")
    private String noRegraCondicionada;

    @Column(name = "DS_REGRA_CONDICIONADA")
    private String dsRegraCondicionada;

    public String getCoRegraCondicionada() {
        return coRegraCondicionada;
    }

    public void setCoRegraCondicionada(String coRegraCondicionada) {
        this.coRegraCondicionada = coRegraCondicionada;
    }

    public String getNoRegraCondicionada() {
        return noRegraCondicionada;
    }

    public void setNoRegraCondicionada(String noRegraCondicionada) {
        this.noRegraCondicionada = noRegraCondicionada;
    }

    public String getDsRegraCondicionada() {
        return dsRegraCondicionada;
    }

    public void setDsRegraCondicionada(String dsRegraCondicionada) {
        this.dsRegraCondicionada = dsRegraCondicionada;
    }
}


