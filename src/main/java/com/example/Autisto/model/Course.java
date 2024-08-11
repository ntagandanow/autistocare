package com.example.Autisto.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private String videoUrl;
    private LocalDateTime createdAt;

    @ManyToOne
    private User educator;

    public Course() {
    }

    public Course(Long id) {
        this.id = id;
    }

    public Course(Long id, String title, String description, String videoUrl, LocalDateTime createdAt, User educator) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.videoUrl = videoUrl;
        this.createdAt = createdAt;
        this.educator = educator;
    }
}
