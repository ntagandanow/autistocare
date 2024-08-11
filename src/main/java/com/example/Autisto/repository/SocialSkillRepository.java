package com.example.Autisto.repository;


import com.example.Autisto.model.SocialSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SocialSkillRepository extends JpaRepository<SocialSkill, Long> {
    List<SocialSkill> findByEducatorId(Long educatorId);
}
