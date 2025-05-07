package com.example.jobstask.controller;

import com.example.jobstask.model.Subjekt;
import com.example.jobstask.repository.SubjektRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/subjekti")
@CrossOrigin(origins = "http://localhost:4200")
public class frontendApi {

    private final SubjektRepository subjektRepository;

    public frontendApi(SubjektRepository subjektRepository) {
        this.subjektRepository = subjektRepository;
    }

    @GetMapping
    public List<Subjekt> getAll() {
        return subjektRepository.findAll();
    }
}
