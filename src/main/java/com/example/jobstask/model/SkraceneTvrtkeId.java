package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class SkraceneTvrtkeId implements Serializable {
    private static final long serialVersionUID = 8650944770908610913L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "skracena_tvrtka", nullable = false, length = 512)
    private String skracenaTvrtka;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public String getSkracenaTvrtka() {
        return skracenaTvrtka;
    }

    public void setSkracenaTvrtka(String skracenaTvrtka) {
        this.skracenaTvrtka = skracenaTvrtka;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SkraceneTvrtkeId entity = (SkraceneTvrtkeId) o;
        return Objects.equals(this.skracenaTvrtka, entity.skracenaTvrtka) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(skracenaTvrtka, mbs);
    }

}