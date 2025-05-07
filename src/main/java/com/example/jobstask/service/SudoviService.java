package com.example.jobstask.service;

import com.example.jobstask.config.SudoviApiClient;
import com.example.jobstask.dto.SudoviDto;
import com.example.jobstask.model.Sudovi;
import com.example.jobstask.repository.SudoviRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class SudoviService {
    private final SudoviRepository sudoviRepository;
    private final SudoviApiClient apiClient;

    public SudoviService(SudoviRepository sudRepository, SudoviApiClient apiClient) {
        this.sudoviRepository = sudRepository;
        this.apiClient = apiClient;
    }

    public void syncSudovi() {
        List<SudoviDto> dtos = apiClient.fetchSudovi();

        Map<BigDecimal, Sudovi> existingSudovi = sudoviRepository.findAll().stream()
                .collect(Collectors.toMap(Sudovi::getId, Function.identity()));

        List<Sudovi> sudovi = dtos.stream().map(dto -> {
            Sudovi s = new Sudovi();
            s.setId(dto.getId());
            s.setSifra(dto.getSifra());
            s.setNaziv(dto.getNaziv());
            s.setSifraZupanije(dto.getSifraZupanije() != null ? dto.getSifraZupanije() : BigDecimal.ZERO);
            s.setNazivZupanije(dto.getNazivZupanije() != null ? dto.getNazivZupanije() : "");
            s.setSifraOpcine(dto.getSifraOpcine() != null ? dto.getSifraOpcine() : BigDecimal.ZERO);
            s.setNazivOpcine(dto.getNazivOpcine() != null ? dto.getNazivOpcine() : "");
            s.setNazivNaselja(dto.getNazivNaselja() != null ? dto.getNazivNaselja() : "");
            s.setSifraNaselja(dto.getSifraNaselja() != null ? dto.getSifraNaselja() : BigDecimal.ZERO);
            s.setIzdajeIzvatke(dto.getIzdajeIzvatke() != null ? dto.getIzdajeIzvatke() : BigDecimal.ZERO);
            if (dto.getSudIdNadlezan() != null) {
                s.setSudIdNadlezan(existingSudovi.get(dto.getSudIdNadlezan()));
            }

            return s;
        }).toList();

        sudoviRepository.saveAll(sudovi);
    }

}
