package com.example.jobstask.service;

import com.example.jobstask.config.ValuteApiClient;
import com.example.jobstask.dto.ValuteDto;
import com.example.jobstask.model.Valute;
import com.example.jobstask.repository.ValuteRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RestController
public class ValuteService {
    private final ValuteRepository valuteRepository;
    private final ValuteApiClient apiClient;

    public ValuteService(ValuteRepository valuteRepository, ValuteApiClient apiClient) {
        this.valuteRepository = valuteRepository;
        this.apiClient = apiClient;
    }
    @GetMapping("/")
    public void syncValute() {
        List<ValuteDto> dtos = apiClient.fetchValute();

        List<Valute> valute = dtos.stream().map(dto -> {
            Valute v = new Valute();
            v.setId(dto.getId());
            v.setSifra(dto.getSifra());
            v.setNaziv(dto.getNaziv());
            return v;
        }).toList();

        valuteRepository.saveAll(valute);
    }
}

