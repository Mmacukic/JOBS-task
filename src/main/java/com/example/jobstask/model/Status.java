package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "statusi")
public class Status {

    @Id
    @Column(name = "vrsta", nullable = false, precision = 1)
    private Integer vrsta;

    @Column(name = "znacenje", length = 250, nullable = false)
    private String znacenje;

    public Integer getVrsta() {
        return vrsta;
    }

    public void setVrsta(Integer vrsta) {
        this.vrsta = vrsta;
    }

    public String getZnacenje() {
        return znacenje;
    }

    public void setZnacenje(String znacenje) {
        this.znacenje = znacenje;
    }
}
