package com.example.jobstask.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.math.BigDecimal;

@Entity
@Table(name = "vrste_postupaka")
public class VrstePostupaka {
    @Id
    @Column(name = "postupak", nullable = false, precision = 1)
    private BigDecimal id;

    @Column(name = "naziv", nullable = false, length = 256)
    private String naziv;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

}