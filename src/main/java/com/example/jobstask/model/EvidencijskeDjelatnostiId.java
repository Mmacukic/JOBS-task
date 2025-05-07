package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class EvidencijskeDjelatnostiId implements Serializable {
    private static final long serialVersionUID = 1531001598331975646L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "nacd_rbr", nullable = false, precision = 3)
    private BigDecimal nacdRbr;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public BigDecimal getNacdRbr() {
        return nacdRbr;
    }

    public void setNacdRbr(BigDecimal nacdRbr) {
        this.nacdRbr = nacdRbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EvidencijskeDjelatnostiId entity = (EvidencijskeDjelatnostiId) o;
        return Objects.equals(this.nacdRbr, entity.nacdRbr) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nacdRbr, mbs);
    }

}