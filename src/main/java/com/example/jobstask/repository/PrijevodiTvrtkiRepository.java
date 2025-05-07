package com.example.jobstask.repository;

import com.example.jobstask.model.PrijevodiTvrtki;
import com.example.jobstask.model.PrijevodiTvrtkiId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrijevodiTvrtkiRepository extends JpaRepository<PrijevodiTvrtki, PrijevodiTvrtkiId> {
}