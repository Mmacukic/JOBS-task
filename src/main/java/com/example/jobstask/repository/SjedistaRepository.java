package com.example.jobstask.repository;

import com.example.jobstask.model.Sjedista;
import com.example.jobstask.model.SjedistaId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SjedistaRepository extends JpaRepository<Sjedista, SjedistaId> {
}