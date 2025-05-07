package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "jezici")
public class Jezici {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, precision = 3)
    private BigDecimal sifra;

    @Column(name = "naziv", nullable = false, length = 128)
    private String naziv;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getSifra() {
        return sifra;
    }

    public void setSifra(BigDecimal sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}