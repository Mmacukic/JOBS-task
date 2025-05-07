package com.example.jobstask.repository;

import com.example.jobstask.model.Valute;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface ValuteRepository extends JpaRepository<Valute, BigDecimal> {
}