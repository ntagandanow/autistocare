package com.example.Autisto.controller;


import com.example.Autisto.model.Engagement;
import com.example.Autisto.services.EngagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EngagementController {

    @Autowired
    private EngagementService engagementService;

    @GetMapping("/engagements")
    public String listEngagements(Model model) {
        List<Engagement> engagements = engagementService.findAllEngagements();
        model.addAttribute("engagements", engagements);
        return "engagements";
    }

    @GetMapping("/addEngagement")
    public String addEngagement(Model model) {
        model.addAttribute("engagement", new Engagement());
        return "addEngagement";
    }

    @PostMapping("/addEngagement")
    public String saveEngagement(Engagement engagement) {
        engagementService.saveEngagement(engagement);
        return "redirect:/engagements";
    }
}

