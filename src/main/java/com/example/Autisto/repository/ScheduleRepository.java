package com.example.Autisto.repository;




import com.example.Autisto.model.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    List<Schedule> findByLearnerId(Long learnerId);
}
