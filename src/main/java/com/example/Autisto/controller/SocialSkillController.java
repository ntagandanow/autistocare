package com.example.Autisto.controller;


import com.example.Autisto.model.SocialSkill;
import com.example.Autisto.services.SocialSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SocialSkillController {

    @Autowired
    private SocialSkillService socialSkillService;

    @GetMapping("/socialSkills")
    public String listSocialSkills(Model model) {
        List<SocialSkill> socialSkills = socialSkillService.findAllSocialSkills();
        model.addAttribute("socialSkills", socialSkills);
        return "socialSkills";
    }

    @GetMapping("/addSocialSkill")
    public String addSocialSkill(Model model) {
        model.addAttribute("socialSkill", new SocialSkill());
        return "addSocialSkill";
    }

    @PostMapping("/addSocialSkill")
    public String saveSocialSkill(SocialSkill socialSkill) {
        socialSkillService.saveSocialSkill(socialSkill);
        return "redirect:/socialSkills";
    }
}
