package com.example.Autisto.service.impl;



import com.example.Autisto.model.SocialSkill;
import com.example.Autisto.repository.SocialSkillRepository;
import com.example.Autisto.services.SocialSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SocialSkillServiceImpl implements SocialSkillService {

    @Autowired
    private SocialSkillRepository socialSkillRepository;

    @Override
    public SocialSkill saveSocialSkill(SocialSkill socialSkill) {
        return socialSkillRepository.save(socialSkill);
    }

    @Override
    public List<SocialSkill> findAllSocialSkills() {
        return socialSkillRepository.findAll();
    }

    @Override
    public SocialSkill findById(Long id) {
        return socialSkillRepository.findById(id).orElse(null);
    }
}
