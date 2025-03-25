package com.example.accessingdatapostgres.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "TB_RENASES")
public class RenasesModel {

    @Id
    @Column(name = "CO_RENASES")
    private String coRenases;

    @Column(name = "NO_RENASES")
    private String noRenases;


    public String getCoRenases() {
        return coRenases;
    }

    public void setCoRenases(String coRenases) {
        this.coRenases = coRenases;
    }

    public String getNoRenases() {
        return noRenases;
    }

    public void setNoRenases(String noRenases) {
        this.noRenases = noRenases;
    }
}






