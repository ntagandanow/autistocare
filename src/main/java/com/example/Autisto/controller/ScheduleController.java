package com.example.Autisto.controller;


import com.example.Autisto.model.Schedule;
import com.example.Autisto.services.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ScheduleController {

    @Autowired
    private ScheduleService scheduleService;

    @GetMapping("/schedules")
    public String listSchedules(Model model) {
        List<Schedule> schedules = scheduleService.findAllSchedules();
        model.addAttribute("schedules", schedules);
        return "schedules";
    }

    @GetMapping("/addSchedule")
    public String addSchedule(Model model) {
        model.addAttribute("schedule", new Schedule());
        return "addSchedule";
    }

    @PostMapping("/addSchedule")
    public String saveSchedule(Schedule schedule) {
        scheduleService.saveSchedule(schedule);
        return "redirect:/schedules";
    }
}
