package com.example.jobstask.config;

import com.example.jobstask.dto.ValuteDto;
import com.example.jobstask.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Component
public class ValuteApiClient {

    private final WebClient webClient;
    private final TokenService tokenService;

    public ValuteApiClient(WebClient.Builder builder,
                           TokenService tokenService,
                           @Value("${api.base-url}") String baseUrl) {
        this.webClient = builder.baseUrl(baseUrl).build();
        this.tokenService = tokenService;
    }

    public List<ValuteDto> fetchValute() {
        String token = tokenService.fetchAccessToken().block();
        ValuteDto[] valute = webClient.get()
                .uri("/valute")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(ValuteDto[].class)
                .block();

        return Arrays.asList(valute);
    }
}


