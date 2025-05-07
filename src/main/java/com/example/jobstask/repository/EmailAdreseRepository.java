package com.example.jobstask.repository;

import com.example.jobstask.model.EmailAdrese;
import com.example.jobstask.model.EmailAdreseId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailAdreseRepository extends JpaRepository<EmailAdrese, EmailAdreseId> {
}