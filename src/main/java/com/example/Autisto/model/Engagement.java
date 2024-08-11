package com.example.Autisto.model;



import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Engagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User parent;

    @ManyToOne
    private User educator;

    private String message;
    private LocalDateTime createdAt;

    public Engagement() {
    }

    public Engagement(Long id) {
        this.id = id;
    }

    public Engagement(Long id, User parent, User educator, String message, LocalDateTime createdAt) {
        this.id = id;
        this.parent = parent;
        this.educator = educator;
        this.message = message;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public User getEducator() {
        return educator;
    }

    public void setEducator(User educator) {
        this.educator = educator;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

