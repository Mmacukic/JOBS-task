package com.example.jobstask.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "subjekti")
public class Subjekt {

    @Id
    private Long mbs;

    private Integer status;
    private Long sudIdNadlezan;
    private Long sudIdSluzba;
    private Integer postupak;
    private Long oib;
    private Integer mb;
    private Integer inoPodruznica;
    private Integer stecajnaMasa;
    private Integer likvidacijskaMasa;
    private LocalDate datumOsnivanja;

    public Long getMbs() {
        return mbs;
    }

    public void setMbs(Long mbs) {
        this.mbs = mbs;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getSudIdNadlezan() {
        return sudIdNadlezan;
    }

    public void setSudIdNadlezan(Long sudIdNadlezan) {
        this.sudIdNadlezan = sudIdNadlezan;
    }

    public Long getSudIdSluzba() {
        return sudIdSluzba;
    }

    public void setSudIdSluzba(Long sudIdSluzba) {
        this.sudIdSluzba = sudIdSluzba;
    }

    public Integer getPostupak() {
        return postupak;
    }

    public void setPostupak(Integer postupak) {
        this.postupak = postupak;
    }

    public Long getOib() {
        return oib;
    }

    public void setOib(Long oib) {
        this.oib = oib;
    }

    public Integer getMb() {
        return mb;
    }

    public void setMb(Integer mb) {
        this.mb = mb;
    }

    public Integer getStecajnaMasa() {
        return stecajnaMasa;
    }

    public void setStecajnaMasa(Integer stecajnaMasa) {
        this.stecajnaMasa = stecajnaMasa;
    }

    public Integer getInoPodruznica() {
        return inoPodruznica;
    }

    public void setInoPodruznica(Integer inoPodruznica) {
        this.inoPodruznica = inoPodruznica;
    }

    public Integer getLikvidacijskaMasa() {
        return likvidacijskaMasa;
    }

    public void setLikvidacijskaMasa(Integer likvidacijskaMasa) {
        this.likvidacijskaMasa = likvidacijskaMasa;
    }

    public LocalDate getDatumOsnivanja() {
        return datumOsnivanja;
    }

    public void setDatumOsnivanja(LocalDate datumOsnivanja) {
        this.datumOsnivanja = datumOsnivanja;
    }
}
