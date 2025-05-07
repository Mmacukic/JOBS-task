package com.example.jobstask.repository;

import com.example.jobstask.model.VrstePravnihOblika;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;

public interface VrstePravnihOblikaRepository extends JpaRepository<VrstePravnihOblika, BigDecimal> {
}