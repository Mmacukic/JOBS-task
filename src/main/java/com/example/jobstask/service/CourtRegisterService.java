package com.example.jobstask.service;


import org.springframework.stereotype.Service;

@Service
public class CourtRegisterService {

    private final ValuteService valuteService;
    private final DrzavaService drzaveService;
    private final SubjektService subjektService;
    private final StatusService statusService;
    private final SudoviService sudoviService;
    private final VrstePostupakaService vrstePostupakaService;


    public CourtRegisterService(ValuteService valuteService,
                                DrzavaService drzavaService,
                                SubjektService subjektService,
                                StatusService statusService,
                                SudoviService sudoviService,
                                VrstePostupakaService vrstePostupakaService) {
        this.valuteService = valuteService;
        this.drzaveService = drzavaService;
        this.subjektService = subjektService;
        this.statusService = statusService;
        this.sudoviService = sudoviService;
        this.vrstePostupakaService = vrstePostupakaService;
    }
    public void syncAll() {
        valuteService.syncValute();
        drzaveService.syncDrzave();
        statusService.syncStatus();
        subjektService.syncSubjekt();
        sudoviService.syncSudovi();
        vrstePostupakaService.syncVrstePostupaka();
    }
}

