package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "drzave")
public class Drzave {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, precision = 3)
    private BigDecimal sifra;

    @Column(name = "naziv", nullable = false, length = 128)
    private String naziv;

    @Column(name = "oznaka_2", nullable = false, length = 2)
    private String oznaka2;

    @Column(name = "oznaka_3", nullable = false, length = 3)
    private String oznaka3;

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

    public String getOznaka2() {
        return oznaka2;
    }

    public void setOznaka2(String oznaka2) {
        this.oznaka2 = oznaka2;
    }

    public String getOznaka3() {
        return oznaka3;
    }

    public void setOznaka3(String oznaka3) {
        this.oznaka3 = oznaka3;
    }

}