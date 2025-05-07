package com.example.jobstask.repository;

import com.example.jobstask.model.Drzave;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface DrzaveRepository extends JpaRepository<Drzave, BigDecimal> {
}