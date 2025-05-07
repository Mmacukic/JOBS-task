package com.example.jobstask.service;

import com.example.jobstask.config.DrzaveApiClient;
import com.example.jobstask.config.StatusApiClient;
import com.example.jobstask.config.SubjektApiClient;
import com.example.jobstask.dto.DrzaveDto;
import com.example.jobstask.dto.StatusDto;
import com.example.jobstask.dto.SubjektDto;
import com.example.jobstask.model.Drzave;
import com.example.jobstask.model.Status;
import com.example.jobstask.model.Subjekt;
import com.example.jobstask.repository.DrzaveRepository;
import com.example.jobstask.repository.StatusRepository;
import com.example.jobstask.repository.SubjektRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatusService {
    private final StatusRepository statusRepository;
    private final StatusApiClient apiClient;

        public StatusService(StatusRepository statusRepository, StatusApiClient apiClient) {
        this.statusRepository = statusRepository;
        this.apiClient = apiClient;
    }
    public void syncStatus() {
        List<StatusDto> dtos = apiClient.fetchStatus();

        List<Status> statusi = dtos.stream().map(dto -> {
            Status s = new Status();
            s.setVrsta(dto.getVrsta());
            s.setZnacenje(dto.getZnacenje());
            return s;
        }).toList();

        statusRepository.saveAll(statusi);

    }
}

