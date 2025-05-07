package com.example.jobstask.jobs;

import com.example.jobstask.service.CourtRegisterService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class CourtRegisterJob {

    private final CourtRegisterService service;

    public CourtRegisterJob(CourtRegisterService service) {
        this.service = service;
    }


    @Scheduled(cron = "0 0 6 * * *")
    public void fetchAllData() {
        service.syncAll();
    }
}

