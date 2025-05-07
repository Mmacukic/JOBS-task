package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class PravniObliciId implements Serializable {
    private static final long serialVersionUID = 9130938083478711306L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "bris_kod", nullable = false, length = 9)
    private String brisKod;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public String getBrisKod() {
        return brisKod;
    }

    public void setBrisKod(String brisKod) {
        this.brisKod = brisKod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PravniObliciId entity = (PravniObliciId) o;
        return Objects.equals(this.brisKod, entity.brisKod) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brisKod, mbs);
    }

}