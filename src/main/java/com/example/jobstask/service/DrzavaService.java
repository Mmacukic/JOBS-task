package com.example.jobstask.service;

import com.example.jobstask.config.DrzaveApiClient;
import com.example.jobstask.dto.DrzaveDto;
import com.example.jobstask.model.Drzave;
import com.example.jobstask.repository.DrzaveRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class DrzavaService {
    private final DrzaveRepository drzaveRepository;
    private final DrzaveApiClient apiClient;

    public DrzavaService(DrzaveRepository drzaveRepository, DrzaveApiClient apiClient) {
        this.drzaveRepository = drzaveRepository;
        this.apiClient = apiClient;
    }
    public void syncDrzave() {
        List<DrzaveDto> dtos = apiClient.fetchDrzave();

        List<Drzave> drzave = dtos.stream().map(dto -> {
            Drzave d = new Drzave();
            d.setId(dto.getId());
            d.setNaziv(dto.getNaziv());
            d.setSifra(dto.getSifra());
            d.setOznaka2(dto.getOznaka2() != null ? dto.getOznaka2() : "??");
            d.setOznaka3(dto.getOznaka3() != null ? dto.getOznaka3() : "??");
            return d;
        }).toList();

        drzaveRepository.saveAll(drzave);
    }
}

