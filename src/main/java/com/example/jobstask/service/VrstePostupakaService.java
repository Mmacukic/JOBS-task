package com.example.jobstask.service;

import com.example.jobstask.config.VrstePostupakaClient;
import com.example.jobstask.dto.VrstePostupakaDto;
import com.example.jobstask.model.VrstePostupaka;
import com.example.jobstask.repository.VrstePostupakaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class VrstePostupakaService {
    private final VrstePostupakaRepository vrstePostupakaRepository;
    private final VrstePostupakaClient apiClient;

    public VrstePostupakaService(VrstePostupakaRepository vrstePostupakaRepository, VrstePostupakaClient apiClient) {
        this.vrstePostupakaRepository = vrstePostupakaRepository;
        this.apiClient = apiClient;
    }

    public void syncVrstePostupaka() {
        List<VrstePostupakaDto> dtos = apiClient.fetchVrstePostupaka();


        List<VrstePostupaka> vrstePostupaka = dtos.stream().map(dto -> {
            VrstePostupaka v = new VrstePostupaka();
            v.setId(dto.getPostupak());
            v.setNaziv(dto.getZnacenje());
            return v;
        }).toList();

        vrstePostupakaRepository.saveAll(vrstePostupaka);
    }

}
