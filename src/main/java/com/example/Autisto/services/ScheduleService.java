package com.example.Autisto.services;

import com.example.Autisto.model.Schedule;

import java.util.List;

public interface ScheduleService {
    Schedule saveSchedule(Schedule schedule);
    List<Schedule> findAllSchedules();
    Schedule findById(Long id);
}

