package com.example.jobstask.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "sudovi")
public class Sudovi {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, precision = 2)
    private BigDecimal sifra;

    @Column(name = "naziv", nullable = false, length = 128)
    private String naziv;

    @Column(name = "sifra_zupanije", nullable = false, precision = 3)
    private BigDecimal sifraZupanije;

    @Column(name = "naziv_zupanije", nullable = false, length = 128)
    private String nazivZupanije;

    @Column(name = "sifra_opcine", nullable = false, precision = 5)
    private BigDecimal sifraOpcine;

    @Column(name = "naziv_opcine", nullable = false, length = 128)
    private String nazivOpcine;

    @Column(name = "sifra_naselja", nullable = false, precision = 10)
    private BigDecimal sifraNaselja;

    @Column(name = "naziv_naselja", nullable = false, length = 128)
    private String nazivNaselja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sud_id_nadlezan")
    private Sudovi sudIdNadlezan;

    @Column(name = "izdaje_izvatke", nullable = false, precision = 1)
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

    public Sudovi getSudIdNadlezan() {
        return sudIdNadlezan;
    }

    public void setSudIdNadlezan(Sudovi sudIdNadlezan) {
        this.sudIdNadlezan = sudIdNadlezan;
    }

    public BigDecimal getIzdajeIzvatke() {
        return izdajeIzvatke;
    }

    public void setIzdajeIzvatke(BigDecimal izdajeIzvatke) {
        this.izdajeIzvatke = izdajeIzvatke;
    }

}