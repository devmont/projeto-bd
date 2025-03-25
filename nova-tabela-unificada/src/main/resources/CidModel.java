package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_CID")
public class CidModel {

    @Id
    @Column(name = "CO_CID")
    private String coCid;

    @Column(name = "NO_CID")
    private String noCid;

    @Column(name = "TP_AGRAVO")
    private String tpAgravo;

    @Column(name = "TP_SEXO")
    private String tpSexo;

    @Column(name = "TP_ESTADIO")
    private String tpEstadio;

    @Column(name = "VL_CAMPOS_IRRADIADOS")
    private Integer vlCamposIrradiados;




}
