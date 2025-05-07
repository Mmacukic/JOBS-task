package com.example.jobstask.dto;

import java.math.BigDecimal;

public class SudoviDto {
    private BigDecimal id;
    private BigDecimal sifra;
    private String naziv;
    private BigDecimal sifraZupanije;
    private String nazivZupanije;
    private BigDecimal sifraOpcine;
    private String nazivOpcine;
    private BigDecimal sifraNaselja;
    private String nazivNaselja;
    private BigDecimal sudIdNadlezan;
    private BigDecimal izdajeIzvatke;

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

    public BigDecimal getSifraZupanije() {
        return sifraZupanije;
    }

    public void setSifraZupanije(BigDecimal sifraZupanije) {
        this.sifraZupanije = sifraZupanije;
    }

    public String getNazivZupanije() {
        return nazivZupanije;
    }

    public void setNazivZupanije(String nazivZupanije) {
        this.nazivZupanije = nazivZupanije;
    }

    public BigDecimal getSifraOpcine() {
        return sifraOpcine;
    }

    public void setSifraOpcine(BigDecimal sifraOpcine) {
        this.sifraOpcine = sifraOpcine;
    }

    public String getNazivOpcine() {
        return nazivOpcine;
    }

    public void setNazivOpcine(String nazivOpcine) {
        this.nazivOpcine = nazivOpcine;
    }

    public BigDecimal getSifraNaselja() {
        return sifraNaselja;
    }

    public void setSifraNaselja(BigDecimal sifraNaselja) {
        this.sifraNaselja = sifraNaselja;
    }

    public String getNazivNaselja() {
        return nazivNaselja;
    }

    public void setNazivNaselja(String nazivNaselja) {
        this.nazivNaselja = nazivNaselja;
    }

    public BigDecimal getSudIdNadlezan() {
        return sudIdNadlezan;
    }

    public void setSudIdNadlezan(BigDecimal sudIdNadlezan) {
        this.sudIdNadlezan = sudIdNadlezan;
    }

    public BigDecimal getIzdajeIzvatke() {
        return izdajeIzvatke;
    }

    public void setIzdajeIzvatke(BigDecimal izdajeIzvatke) {
        this.izdajeIzvatke = izdajeIzvatke;
    }
}

