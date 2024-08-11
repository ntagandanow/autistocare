package com.example.Autisto.repository;


import com.example.Autisto.model.Engagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EngagementRepository extends JpaRepository<Engagement, Long> {
    List<Engagement> findByParentId(Long parentId);
    List<Engagement> findByEducatorId(Long educatorId);
}
