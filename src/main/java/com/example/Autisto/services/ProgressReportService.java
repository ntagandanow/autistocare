package com.example.Autisto.services;

import com.example.Autisto.model.ProgressReport;

import java.util.List;

public interface ProgressReportService {
    ProgressReport saveProgressReport(ProgressReport progressReport);
    List<ProgressReport> findAllProgressReports();
    ProgressReport findById(Long id);
}

