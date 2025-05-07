package com.example.jobstask.repository;

import com.example.jobstask.model.NacionalnaKlasifikacijaDjelatnosti;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface NacionalnaKlasifikacijaDjelatnostiRepository extends JpaRepository<NacionalnaKlasifikacijaDjelatnosti, BigDecimal> {
  }