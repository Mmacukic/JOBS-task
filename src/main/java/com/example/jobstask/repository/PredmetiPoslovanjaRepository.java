package com.example.jobstask.repository;

import com.example.jobstask.model.PredmetiPoslovanja;
import com.example.jobstask.model.PredmetiPoslovanjaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PredmetiPoslovanjaRepository extends JpaRepository<PredmetiPoslovanja, PredmetiPoslovanjaId> {
}