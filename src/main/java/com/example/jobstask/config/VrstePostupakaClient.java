package com.example.jobstask.config;

import com.example.jobstask.dto.StatusDto;
import com.example.jobstask.dto.VrstePostupakaDto;
import com.example.jobstask.model.VrstePostupaka;
import com.example.jobstask.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Component
public class VrstePostupakaClient {
    private final WebClient webClient;
    private final TokenService tokenService;

    public VrstePostupakaClient(WebClient.Builder builder,
                           TokenService tokenService,
                           @Value("${api.base-url}") String baseUrl) {
        this.webClient = builder.baseUrl(baseUrl).build();
        this.tokenService = tokenService;
    }

    public List<VrstePostupakaDto> fetchVrstePostupaka() {
        String token = tokenService.fetchAccessToken().block();

        VrstePostupakaDto[] response = webClient.get()
                .uri("/vrste_postupaka")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(VrstePostupakaDto[].class)
                .block();

        return response != null ? Arrays.asList(response) : List.of();
    }

}


