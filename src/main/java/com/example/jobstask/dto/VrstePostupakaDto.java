package com.example.jobstask.dto;

import java.math.BigDecimal;

public class VrstePostupakaDto {
    private BigDecimal postupak;
    private String znacenje;

    public BigDecimal getPostupak() {
        return postupak;
    }

    public void setPostupak(BigDecimal postupak) {
        this.postupak = postupak;
    }

    public String getZnacenje() {
        return znacenje;
    }

    public void setZnacenje(String znacenje) {
        this.znacenje = znacenje;
    }
}
