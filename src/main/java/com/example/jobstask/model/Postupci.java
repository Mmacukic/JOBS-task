package com.example.jobstask.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "postupci")
public class Postupci {
    @EmbeddedId
    private PostupciId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @Column(name = "mjesto", length = 128)
    private String mjesto;

    @Column(name = "datum")
    private LocalDate datum;

    public PostupciId getId() {
        return id;
    }

    public void setId(PostupciId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public String getMjesto() {
        return mjesto;
    }

    public void setMjesto(String mjesto) {
        this.mjesto = mjesto;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

}