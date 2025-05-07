package com.example.jobstask.repository;

import com.example.jobstask.model.PravniOblici;
import com.example.jobstask.model.PravniObliciId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PravniObliciRepository extends JpaRepository<PravniOblici, PravniObliciId> {
}