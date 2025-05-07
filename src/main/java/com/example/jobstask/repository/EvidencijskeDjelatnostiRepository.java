package com.example.jobstask.repository;

import com.example.jobstask.model.EvidencijskeDjelatnosti;
import com.example.jobstask.model.EvidencijskeDjelatnostiId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvidencijskeDjelatnostiRepository extends JpaRepository<EvidencijskeDjelatnosti, EvidencijskeDjelatnostiId> {
}