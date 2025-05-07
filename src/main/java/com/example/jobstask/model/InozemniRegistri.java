package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "inozemni_registri")
public class InozemniRegistri {
    @EmbeddedId
    private InozemniRegistriId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "drzava_id", nullable = false)
    private Drzave drzava;

    public InozemniRegistriId getId() {
        return id;
    }

    public void setId(InozemniRegistriId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public Drzave getDrzava() {
        return drzava;
    }

    public void setDrzava(Drzave drzava) {
        this.drzava = drzava;
    }

}