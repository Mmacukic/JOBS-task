package com.example.jobstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.util.Map;
import java.util.Base64;

@Service
public class TokenService {

    @Value("${api.token-url}")
    private String tokenUrl;

    @Value("${api.client-id}")
    private String clientId;

    @Value("${api.client-secret}")
    private String clientSecret;

    private final WebClient webClient;

    @Autowired
    public TokenService(WebClient webClient) {
        this.webClient = webClient;
    }

    public Mono<String> fetchAccessToken() {
        String basicAuth = Base64.getEncoder().encodeToString((clientId + ":" + clientSecret).getBytes());

        return webClient.post()
                .uri(tokenUrl)
                .header(HttpHeaders.AUTHORIZATION, "Basic " + basicAuth)
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_FORM_URLENCODED_VALUE)
                .body(BodyInserters.fromFormData("grant_type", "client_credentials"))
                .retrieve()
                .bodyToMono(Map.class)
                .map(body -> (String) body.get("access_token"));
    }
}
