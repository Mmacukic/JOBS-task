package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bris_registri")
public class BrisRegistri {
    @Id
    @Column(name = "identifikator", nullable = false, length = 15)
    private String identifikator;

    @Column(name = "naziv", nullable = false, length = 256)
    private String naziv;

    public String getIdentifikator() {
        return identifikator;
    }

    public void setIdentifikator(String identifikator) {
        this.identifikator = identifikator;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}