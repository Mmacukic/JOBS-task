package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "vrste_pravnih_oblika")
public class VrstePravnihOblika {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, precision = 2)
    private BigDecimal sifra;

    @Column(name = "naziv", nullable = false, length = 128)
    private String naziv;

    @Column(name = "kratica", nullable = false, length = 15)
    private String kratica;

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

    public String getKratica() {
        return kratica;
    }

    public void setKratica(String kratica) {
        this.kratica = kratica;
    }

}