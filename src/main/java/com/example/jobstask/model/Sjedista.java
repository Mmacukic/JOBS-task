package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sjedista")
public class Sjedista {
    @EmbeddedId
    private SjedistaId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @Column(name = "adresa", nullable = false, length = 512)
    private String adresa;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jezik_id", nullable = false)
    private Jezici jezik;

    public SjedistaId getId() {
        return id;
    }

    public void setId(SjedistaId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Jezici getJezik() {
        return jezik;
    }

    public void setJezik(Jezici jezik) {
        this.jezik = jezik;
    }

}