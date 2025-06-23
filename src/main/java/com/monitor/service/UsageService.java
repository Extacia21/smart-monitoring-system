package com.monitor.service;

import com.monitor.model.UsageData;
import com.monitor.model.UsageRequest;
import com.monitor.repository.UsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class UsageService {
    @Autowired
    private UsageRepository repo;

    public UsageData saveUsage(UsageRequest req) {
        return repo.save(new UsageData(req.getHomeId(), req.getWaterUsage(), req.getElectricityUsage(), LocalDateTime.now()));
    }

    public List<UsageData> getAll() {
        return repo.findAll();
    }
}
