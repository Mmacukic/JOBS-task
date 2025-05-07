package com.example.jobstask.service;

import com.example.jobstask.config.DrzaveApiClient;
import com.example.jobstask.config.SubjektApiClient;
import com.example.jobstask.dto.DrzaveDto;
import com.example.jobstask.dto.SubjektDto;
import com.example.jobstask.model.Drzave;
import com.example.jobstask.model.Subjekt;
import com.example.jobstask.repository.DrzaveRepository;
import com.example.jobstask.repository.SubjektRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjektService {
    private final SubjektRepository subjektRepository;
    private final SubjektApiClient apiClient;

    public SubjektService(SubjektRepository subjektRepository, SubjektApiClient apiClient) {
        this.subjektRepository = subjektRepository;
        this.apiClient = apiClient;
    }
    public void syncSubjekt() {
        List<SubjektDto> dtos = apiClient.fetchSubjekt();

        List<Subjekt> valute = dtos.stream().map(dto -> {
            Subjekt s = new Subjekt();
            s.setMbs(dto.getMbs());
            s.setStatus(dto.getStatus());
            s.setSudIdNadlezan(dto.getSud_id_nadlezan());
            s.setSudIdSluzba(dto.getSud_id_sluzba());
            s.setPostupak(dto.getPostupak());
            s.setOib(dto.getOib());
            s.setMb(dto.getMb());
            s.setInoPodruznica(dto.getIno_podruznica());
            s.setStecajnaMasa(dto.getStecajna_masa());
            s.setLikvidacijskaMasa(dto.getLikvidacijska_masa());
            s.setDatumOsnivanja(dto.getDatum_osnivanja());
            return s;
        }).toList();

        subjektRepository.saveAll(valute);
    }
}

