package com.example.Autisto.service.impl;


import com.example.Autisto.model.ProgressReport;
import com.example.Autisto.repository.ProgressReportRepository;
import com.example.Autisto.services.ProgressReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProgressReportServiceImpl implements ProgressReportService {

    @Autowired
    private ProgressReportRepository progressReportRepository;

    @Override
    public ProgressReport saveProgressReport(ProgressReport progressReport) {
        return progressReportRepository.save(progressReport);
    }

    @Override
    public List<ProgressReport> findAllProgressReports() {
        return progressReportRepository.findAll();
    }

    @Override
    public ProgressReport findById(Long id) {
        return progressReportRepository.findById(id).orElse(null);
    }
}
