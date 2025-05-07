package com.example.jobstask.repository;

import com.example.jobstask.model.PreteziteDjelatnosti;
import com.example.jobstask.model.PreteziteDjelatnostiId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreteziteDjelatnostiRepository extends JpaRepository<PreteziteDjelatnosti, PreteziteDjelatnostiId> {
  }