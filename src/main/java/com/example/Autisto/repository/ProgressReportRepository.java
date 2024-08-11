package com.example.Autisto.repository;




import com.example.Autisto.model.ProgressReport;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProgressReportRepository extends JpaRepository<ProgressReport, Long> {
    List<ProgressReport> findByLearnerId(Long learnerId);
}
