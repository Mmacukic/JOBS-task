package com.example.jobstask.config;

import com.example.jobstask.dto.DrzaveDto;
import com.example.jobstask.dto.SubjektDto;
import com.example.jobstask.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Component
public class SubjektApiClient {
    private final WebClient webClient;
    private final TokenService tokenService;

    public SubjektApiClient(WebClient.Builder builder,
                           TokenService tokenService,
                           @Value("${api.base-url}") String baseUrl) {
        this.webClient = builder.baseUrl(baseUrl).build();
        this.tokenService = tokenService;
    }

    public List<SubjektDto> fetchSubjekt() {
        String token = tokenService.fetchAccessToken().block();
        SubjektDto[] subjekt = webClient.get()
                .uri("/subjekti")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(SubjektDto[].class)
                .block();

        return Arrays.asList(subjekt);
    }
}


