package com.example.jobstask.config;

import com.example.jobstask.dto.SudoviDto;
import com.example.jobstask.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Component
public class SudoviApiClient {
    private final WebClient webClient;
    private final TokenService tokenService;

    public SudoviApiClient(WebClient.Builder builder,
                           TokenService tokenService,
                           @Value("${api.base-url}") String baseUrl) {
        this.webClient = builder.baseUrl(baseUrl).build();
        this.tokenService = tokenService;
    }

    public List<SudoviDto> fetchSudovi() {
        String token = tokenService.fetchAccessToken().block();
        SudoviDto[] sudovi = webClient.get()
                .uri("/sudovi")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(SudoviDto[].class)
                .block();

        return Arrays.asList(sudovi);
    }
}


