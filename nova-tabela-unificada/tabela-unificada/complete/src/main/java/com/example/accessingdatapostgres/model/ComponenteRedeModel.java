package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_COMPONENTE_REDE")
public class ComponenteRedeModel {

    @Id
    @Column(name = "CO_COMPONENTE_REDE")
    private String coComponentRede;

    @Column(name = "NO_COMPONENTE_REDE")
    private String noComponentRede;

    @Column(name = "CO_REDE_ATENCAO")
    private String coRedeAtencao;


    public String getCoComponentRede() {
        return coComponentRede;
    }

    public void setCoComponentRede(String coComponentRede) {
        this.coComponentRede = coComponentRede;
    }

    public String getNoComponentRede() {
        return noComponentRede;
    }

    public void setNoComponentRede(String noComponentRede) {
        this.noComponentRede = noComponentRede;
    }

    public String getCoRedeAtencao() {
        return coRedeAtencao;
    }

    public void setCoRedeAtencao(String coRedeAtencao) {
        this.coRedeAtencao = coRedeAtencao;
    }
}



