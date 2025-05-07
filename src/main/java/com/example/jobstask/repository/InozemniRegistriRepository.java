package com.example.jobstask.repository;

import com.example.jobstask.model.InozemniRegistri;
import com.example.jobstask.model.InozemniRegistriId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InozemniRegistriRepository extends JpaRepository<InozemniRegistri, InozemniRegistriId> {
  }