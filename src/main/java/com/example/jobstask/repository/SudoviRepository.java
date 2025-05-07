package com.example.jobstask.repository;

import com.example.jobstask.model.Sudovi;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface SudoviRepository extends JpaRepository<Sudovi, BigDecimal> {
  }