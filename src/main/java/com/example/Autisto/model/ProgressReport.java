package com.example.Autisto.model;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ProgressReport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User learner;

    private String report;
    private LocalDateTime createdAt;

    public ProgressReport() {
    }

    public ProgressReport(Long id) {
        this.id = id;
    }

    public ProgressReport(Long id, User learner, String report, LocalDateTime createdAt) {
        this.id = id;
        this.learner = learner;
        this.report = report;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getLearner() {
        return learner;
    }

    public void setLearner(User learner) {
        this.learner = learner;
    }

    public String getReport() {
        return report;
    }

    public void setReport(String report) {
        this.report = report;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
