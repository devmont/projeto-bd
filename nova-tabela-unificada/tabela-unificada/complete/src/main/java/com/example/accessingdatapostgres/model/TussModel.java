package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_tuss")
public class TussModel {

    @Id
    @Column(name = "CO_TUSS")
    private String coTuss;

    @Column(name = "NO_TUSS")
    private String noTuss;

    public String getCoTuss() {
        return coTuss;
    }

    public void setCoTuss(String coTuss) {
        this.coTuss = coTuss;
    }

    public String getNoTuss() {
        return noTuss;
    }

    public void setNoTuss(String noTuss) {
        this.noTuss = noTuss;
    }
}







