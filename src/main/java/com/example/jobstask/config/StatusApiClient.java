package com.example.jobstask.config;

import com.example.jobstask.dto.StatusDto;
import com.example.jobstask.service.TokenService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Arrays;
import java.util.List;

@Component
public class StatusApiClient {
    private final WebClient webClient;
    private final TokenService tokenService;

    public StatusApiClient(WebClient.Builder builder,
                            TokenService tokenService,
                            @Value("${api.base-url}") String baseUrl) {
        this.webClient = builder.baseUrl(baseUrl).build();
        this.tokenService = tokenService;
    }

    public List<StatusDto> fetchStatus() {
        String token = tokenService.fetchAccessToken().block();
        StatusDto[] status = webClient.get()
                .uri("/statusi")
                .header(HttpHeaders.AUTHORIZATION, "Bearer " + token)
                .retrieve()
                .bodyToMono(StatusDto[].class)
                .block();

        return Arrays.asList(status);
    }
}


