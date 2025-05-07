package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "bris_pravni_oblici")
public class BrisPravniOblici {
    @Id
    @Column(name = "bris_kod", nullable = false, length = 9)
    private String brisKod;

    @Column(name = "kratica", length = 130)
    private String kratica;

    @Column(name = "naziv", nullable = false, length = 1024)
    private String naziv;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "status", nullable = false)
    private Status status;

    public String getBrisKod() {
        return brisKod;
    }

    public void setBrisKod(String brisKod) {
        this.brisKod = brisKod;
    }

    public String getKratica() {
        return kratica;
    }

    public void setKratica(String kratica) {
        this.kratica = kratica;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}