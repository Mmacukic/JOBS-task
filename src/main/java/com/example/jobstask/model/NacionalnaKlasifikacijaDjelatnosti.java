package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "nacionalna_klasifikacija_djelatnosti")
public class NacionalnaKlasifikacijaDjelatnosti {
    @Id
    @Column(name = "id", nullable = false, precision = 12)
    private BigDecimal id;

    @Column(name = "sifra", nullable = false, length = 7)
    private String sifra;

    @Column(name = "puni_naziv", nullable = false, length = 512)
    private String puniNaziv;

    @Column(name = "verzija", nullable = false, length = 64)
    private String verzija;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getPuniNaziv() {
        return puniNaziv;
    }

    public void setPuniNaziv(String puniNaziv) {
        this.puniNaziv = puniNaziv;
    }

    public String getVerzija() {
        return verzija;
    }

    public void setVerzija(String verzija) {
        this.verzija = verzija;
    }

}