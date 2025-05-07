package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class EmailAdreseId implements Serializable {
    private static final long serialVersionUID = 7949576898182912424L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "rbr", nullable = false, precision = 3)
    private BigDecimal rbr;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public BigDecimal getRbr() {
        return rbr;
    }

    public void setRbr(BigDecimal rbr) {
        this.rbr = rbr;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EmailAdreseId entity = (EmailAdreseId) o;
        return Objects.equals(this.rbr, entity.rbr) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rbr, mbs);
    }

}