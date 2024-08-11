package com.example.Autisto.services;


import com.example.Autisto.model.Engagement;

import java.util.List;

public interface EngagementService {
    Engagement saveEngagement(Engagement engagement);
    List<Engagement> findAllEngagements();
    Engagement findById(Long id);
}

