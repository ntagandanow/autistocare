package com.example.Autisto.service.impl;



import com.example.Autisto.model.Engagement;
import com.example.Autisto.repository.EngagementRepository;
import com.example.Autisto.services.EngagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EngagementServiceImpl implements EngagementService {

    @Autowired
    private EngagementRepository engagementRepository;

    @Override
    public Engagement saveEngagement(Engagement engagement) {
        return engagementRepository.save(engagement);
    }

    @Override
    public List<Engagement> findAllEngagements() {
        return engagementRepository.findAll();
    }

    @Override
    public Engagement findById(Long id) {
        return engagementRepository.findById(id).orElse(null);
    }
}
