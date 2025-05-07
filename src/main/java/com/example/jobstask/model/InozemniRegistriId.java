package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class InozemniRegistriId implements Serializable {
    private static final long serialVersionUID = 6601091616463053618L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "registar", nullable = false, length = 256)
    private String registar;

    @Column(name = "broj", nullable = false, length = 64)
    private String broj;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public String getRegistar() {
        return registar;
    }

    public void setRegistar(String registar) {
        this.registar = registar;
    }

    public String getBroj() {
        return broj;
    }

    public void setBroj(String broj) {
        this.broj = broj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        InozemniRegistriId entity = (InozemniRegistriId) o;
        return Objects.equals(this.broj, entity.broj) &&
                Objects.equals(this.registar, entity.registar) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(broj, registar, mbs);
    }

}