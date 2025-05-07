package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Embeddable
public class PostupciId implements Serializable {
    private static final long serialVersionUID = -3769511755082742773L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "postupak", nullable = false, precision = 1)
    private BigDecimal postupak;

    @Column(name = "rbr", nullable = false, precision = 3)
    private BigDecimal rbr;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public BigDecimal getPostupak() {
        return postupak;
    }

    public void setPostupak(BigDecimal postupak) {
        this.postupak = postupak;
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
        PostupciId entity = (PostupciId) o;
        return Objects.equals(this.rbr, entity.rbr) &&
                Objects.equals(this.postupak, entity.postupak) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rbr, postupak, mbs);
    }

}