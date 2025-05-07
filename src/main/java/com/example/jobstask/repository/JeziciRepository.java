package com.example.jobstask.repository;

import com.example.jobstask.model.Jezici;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface JeziciRepository extends JpaRepository<Jezici, BigDecimal> {
}