package com.example.Autisto.controller;



import com.example.Autisto.model.ProgressReport;
import com.example.Autisto.services.ProgressReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ProgressReportController {

    @Autowired
    private ProgressReportService progressReportService;

    @GetMapping("/progressReports")
    public String listProgressReports(Model model) {
        List<ProgressReport> progressReports = progressReportService.findAllProgressReports();
        model.addAttribute("progressReports", progressReports);
        return "progressReports";
    }

    @GetMapping("/addProgressReport")
    public String addProgressReport(Model model) {
        model.addAttribute("progressReport", new ProgressReport());
        return "addProgressReport";
    }

    @PostMapping("/addProgressReport")
    public String saveProgressReport(ProgressReport progressReport) {
        progressReportService.saveProgressReport(progressReport);
        return "redirect:/progressReports";
    }
}
