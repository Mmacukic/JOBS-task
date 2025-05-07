package com.example.jobstask.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * DTO for {@link com.example.jobstask.model.Drzave}
 */
public class DrzaveDto implements Serializable {
    private final BigDecimal id;
    private final BigDecimal sifra;
    private final String naziv;
    private final String oznaka2;
    private final String oznaka3;

    public DrzaveDto(BigDecimal id, BigDecimal sifra, String naziv, String oznaka2, String oznaka3) {
        this.id = id;
        this.sifra = sifra;
        this.naziv = naziv;
        this.oznaka2 = oznaka2;
        this.oznaka3 = oznaka3;
    }

    public BigDecimal getId() {
        return id;
    }

    public BigDecimal getSifra() {
        return sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public String getOznaka2() {
        return oznaka2;
    }

    public String getOznaka3() {
        return oznaka3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DrzaveDto entity = (DrzaveDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sifra, entity.sifra) &&
                Objects.equals(this.naziv, entity.naziv) &&
                Objects.equals(this.oznaka2, entity.oznaka2) &&
                Objects.equals(this.oznaka3, entity.oznaka3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sifra, naziv, oznaka2, oznaka3);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sifra = " + sifra + ", " +
                "naziv = " + naziv + ", " +
                "oznaka2 = " + oznaka2 + ", " +
                "oznaka3 = " + oznaka3 + ")";
    }
}