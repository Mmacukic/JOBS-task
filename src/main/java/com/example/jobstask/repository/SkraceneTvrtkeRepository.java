package com.example.jobstask.repository;

import com.example.jobstask.model.SkraceneTvrtke;
import com.example.jobstask.model.SkraceneTvrtkeId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkraceneTvrtkeRepository extends JpaRepository<SkraceneTvrtke, SkraceneTvrtkeId> {
}