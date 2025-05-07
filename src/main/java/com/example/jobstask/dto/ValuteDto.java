package com.example.jobstask.dto;

import com.example.jobstask.model.Drzave;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * DTO for {@link com.example.jobstask.model.Valute}
 */
public class ValuteDto implements Serializable {
    private final BigDecimal id;
    @Id
    private final BigDecimal sifra;
    private final String naziv;
    private final Drzave drzava;

    public ValuteDto(BigDecimal id, BigDecimal sifra, String naziv, Drzave drzava) {
        this.id = id;
        this.sifra = sifra;
        this.naziv = naziv;
        this.drzava = drzava;
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

    public Drzave getDrzava() {
        return drzava;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValuteDto entity = (ValuteDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sifra, entity.sifra) &&
                Objects.equals(this.naziv, entity.naziv) &&
                Objects.equals(this.drzava, entity.drzava);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sifra, naziv, drzava);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sifra = " + sifra + ", " +
                "naziv = " + naziv + ", " +
                "drzava = " + drzava + ")";
    }
}