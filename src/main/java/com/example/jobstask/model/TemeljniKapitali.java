package com.example.jobstask.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "temeljni_kapitali")
public class TemeljniKapitali {
    @EmbeddedId
    private TemeljniKapitaliId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @Column(name = "iznos", nullable = false, precision = 20, scale = 2)
    private BigDecimal iznos;

    public TemeljniKapitaliId getId() {
        return id;
    }

    public void setId(TemeljniKapitaliId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public BigDecimal getIznos() {
        return iznos;
    }

    public void setIznos(BigDecimal iznos) {
        this.iznos = iznos;
    }

}