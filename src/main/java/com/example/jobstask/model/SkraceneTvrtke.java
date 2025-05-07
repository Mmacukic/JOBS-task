package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "skracene_tvrtke")
public class SkraceneTvrtke {
    @EmbeddedId
    private SkraceneTvrtkeId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    public SkraceneTvrtkeId getId() {
        return id;
    }

    public void setId(SkraceneTvrtkeId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

}