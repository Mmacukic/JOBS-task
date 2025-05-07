package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "evidencijske_djelatnosti")
public class EvidencijskeDjelatnosti {
    @EmbeddedId
    private EvidencijskeDjelatnostiId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    public EvidencijskeDjelatnostiId getId() {
        return id;
    }

    public void setId(EvidencijskeDjelatnostiId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

}