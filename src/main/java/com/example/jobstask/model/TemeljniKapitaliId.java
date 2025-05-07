package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Embeddable
public class TemeljniKapitaliId implements Serializable {
    private static final long serialVersionUID = -7171087888007363167L;
    @Column(name = "mbs", nullable = false, precision = 9)
    private BigDecimal mbs;

    @Column(name = "valuta_id", nullable = false, precision = 12)
    private BigDecimal valutaId;

    @Column(name = "datum", nullable = false)
    private LocalDate datum;

    public BigDecimal getMbs() {
        return mbs;
    }

    public void setMbs(BigDecimal mbs) {
        this.mbs = mbs;
    }

    public BigDecimal getValutaId() {
        return valutaId;
    }

    public void setValutaId(BigDecimal valutaId) {
        this.valutaId = valutaId;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TemeljniKapitaliId entity = (TemeljniKapitaliId) o;
        return Objects.equals(this.datum, entity.datum) &&
                Objects.equals(this.valutaId, entity.valutaId) &&
                Objects.equals(this.mbs, entity.mbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(datum, valutaId, mbs);
    }

}