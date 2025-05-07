package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pravni_oblici")
public class PravniOblici {
    @EmbeddedId
    private PravniObliciId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @MapsId("brisKod")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "bris_kod", nullable = false)
    private BrisPravniOblici brisKod;

    public PravniObliciId getId() {
        return id;
    }

    public void setId(PravniObliciId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public BrisPravniOblici getBrisKod() {
        return brisKod;
    }

    public void setBrisKod(BrisPravniOblici brisKod) {
        this.brisKod = brisKod;
    }

}