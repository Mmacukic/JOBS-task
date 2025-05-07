package com.example.jobstask.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "valute")
public class Valute {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, precision = 3)
    private BigDecimal sifra;

    @Column(name = "naziv", nullable = false, length = 128)
    private String naziv;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "drzava_id")
    private Drzave drzava;

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

    public Drzave getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzave drzava) {
        this.drzava = drzava;
    }

}