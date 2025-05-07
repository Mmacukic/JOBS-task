package com.example.jobstask.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * DTO for {@link com.example.jobstask.model.Status}
 */
public class StatusDto {
    private final Integer vrsta;
    private final String znacenje;

    public StatusDto(Integer vrsta, String znacenje) {
        this.vrsta = vrsta;
        this.znacenje = znacenje;
    }

    public Integer getVrsta() {
        return vrsta;
    }

    public String getZnacenje() {
        return znacenje;
    }
}
