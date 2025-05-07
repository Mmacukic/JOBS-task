package com.example.jobstask.repository;

import com.example.jobstask.model.TemeljniKapitali;
import com.example.jobstask.model.TemeljniKapitaliId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemeljniKapitaliRepository extends JpaRepository<TemeljniKapitali, TemeljniKapitaliId> {
}