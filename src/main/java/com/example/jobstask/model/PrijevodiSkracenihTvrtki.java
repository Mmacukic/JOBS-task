package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prijevodi_skracenih_tvrtki")
public class PrijevodiSkracenihTvrtki {
    @EmbeddedId
    private PrijevodiSkracenihTvrtkiId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @Column(name = "ime", length = 512)
    private String ime;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jezik_id", nullable = false)
    private Jezici jezik;

    public PrijevodiSkracenihTvrtkiId getId() {
        return id;
    }

    public void setId(PrijevodiSkracenihTvrtkiId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public Jezici getJezik() {
        return jezik;
    }

    public void setJezik(Jezici jezik) {
        this.jezik = jezik;
    }

}