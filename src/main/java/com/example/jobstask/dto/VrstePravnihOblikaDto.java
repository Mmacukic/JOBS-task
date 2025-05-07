package com.example.jobstask.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * DTO for {@link com.example.jobstask.model.VrstePravnihOblika}
 */
public class VrstePravnihOblikaDto implements Serializable {
    private final BigDecimal id;
    private final BigDecimal sifra;
    private final String naziv;
    private final String kratica;

    public VrstePravnihOblikaDto(BigDecimal id, BigDecimal sifra, String naziv, String kratica) {
        this.id = id;
        this.sifra = sifra;
        this.naziv = naziv;
        this.kratica = kratica;
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

    public String getKratica() {
        return kratica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VrstePravnihOblikaDto entity = (VrstePravnihOblikaDto) o;
        return Objects.equals(this.id, entity.id) &&
                Objects.equals(this.sifra, entity.sifra) &&
                Objects.equals(this.naziv, entity.naziv) &&
                Objects.equals(this.kratica, entity.kratica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sifra, naziv, kratica);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "id = " + id + ", " +
                "sifra = " + sifra + ", " +
                "naziv = " + naziv + ", " +
                "kratica = " + kratica + ")";
    }
}