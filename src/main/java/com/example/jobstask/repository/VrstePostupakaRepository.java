package com.example.jobstask.repository;

import com.example.jobstask.model.VrstePostupaka;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface VrstePostupakaRepository extends JpaRepository<VrstePostupaka, BigDecimal> {
  }