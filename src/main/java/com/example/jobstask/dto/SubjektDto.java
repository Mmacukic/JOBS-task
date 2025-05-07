package com.example.jobstask.dto;

import java.time.LocalDate;

public class SubjektDto {
    private Long mbs;
    private Integer status;
    private Long sud_id_nadlezan;
    private Long sud_id_sluzba;
    private Integer postupak;
    private Long oib;
    private Integer mb;
    private Integer ino_podruznica;
    private Integer stecajna_masa;
    private Integer likvidacijska_masa;
    private LocalDate datum_osnivanja;

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

    public Long getSud_id_nadlezan() {
        return sud_id_nadlezan;
    }

    public void setSud_id_nadlezan(Long sud_id_nadlezan) {
        this.sud_id_nadlezan = sud_id_nadlezan;
    }

    public Long getSud_id_sluzba() {
        return sud_id_sluzba;
    }

    public void setSud_id_sluzba(Long sud_id_sluzba) {
        this.sud_id_sluzba = sud_id_sluzba;
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

    public Integer getIno_podruznica() {
        return ino_podruznica;
    }

    public void setIno_podruznica(Integer ino_podruznica) {
        this.ino_podruznica = ino_podruznica;
    }

    public Integer getStecajna_masa() {
        return stecajna_masa;
    }

    public void setStecajna_masa(Integer stecajna_masa) {
        this.stecajna_masa = stecajna_masa;
    }

    public Integer getLikvidacijska_masa() {
        return likvidacijska_masa;
    }

    public void setLikvidacijska_masa(Integer likvidacijska_masa) {
        this.likvidacijska_masa = likvidacijska_masa;
    }

    public LocalDate getDatum_osnivanja() {
        return datum_osnivanja;
    }

    public void setDatum_osnivanja(LocalDate datum_osnivanja) {
        this.datum_osnivanja = datum_osnivanja;
    }
}

