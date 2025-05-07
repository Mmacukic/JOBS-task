package com.example.jobstask.repository;

import com.example.jobstask.model.Postupci;
import com.example.jobstask.model.PostupciId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostupciRepository extends JpaRepository<Postupci, PostupciId> {
  }