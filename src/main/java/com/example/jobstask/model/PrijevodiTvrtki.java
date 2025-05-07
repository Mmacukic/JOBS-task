package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prijevodi_tvrtki")
public class PrijevodiTvrtki {
    @EmbeddedId
    private PrijevodiTvrtkiId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "jezik_id", nullable = false)
    private Jezici jezik;

    public PrijevodiTvrtkiId getId() {
        return id;
    }

    public void setId(PrijevodiTvrtkiId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public Jezici getJezik() {
        return jezik;
    }

    public void setJezik(Jezici jezik) {
        this.jezik = jezik;
    }

}