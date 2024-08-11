package com.example.Autisto.services;

import com.example.Autisto.model.SocialSkill;

import java.util.List;

public interface SocialSkillService {
    SocialSkill saveSocialSkill(SocialSkill socialSkill);
    List<SocialSkill> findAllSocialSkills();
    SocialSkill findById(Long id);
}
