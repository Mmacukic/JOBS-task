package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pretezite_djelatnosti")
public class PreteziteDjelatnosti {
    @EmbeddedId
    private PreteziteDjelatnostiId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @MapsId("nacdRbr")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "nacd_rbr", nullable = false)
    private NacionalnaKlasifikacijaDjelatnosti nacdRbr;

    public PreteziteDjelatnostiId getId() {
        return id;
    }

    public void setId(PreteziteDjelatnostiId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public NacionalnaKlasifikacijaDjelatnosti getNacdRbr() {
        return nacdRbr;
    }

    public void setNacdRbr(NacionalnaKlasifikacijaDjelatnosti nacdRbr) {
        this.nacdRbr = nacdRbr;
    }

}