package com.example.jobstask.model;

import jakarta.persistence.*;

@Entity
@Table(name = "email_adrese")
public class EmailAdrese {
    @EmbeddedId
    private EmailAdreseId id;

    @MapsId("mbs")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "mbs", nullable = false)
    private Subjekt mbs;

    @Column(name = "email", nullable = false, length = 256)
    private String email;

    public EmailAdreseId getId() {
        return id;
    }

    public void setId(EmailAdreseId id) {
        this.id = id;
    }

    public Subjekt getMbs() {
        return mbs;
    }

    public void setMbs(Subjekt mbs) {
        this.mbs = mbs;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}