package com.monitor.controller;

import com.monitor.model.UsageRequest;
import com.monitor.model.UsageData;
import com.monitor.service.UsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/data")
public class UsageController {
    @Autowired private UsageService usageService;
    @Autowired private SimpMessagingTemplate messaging;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody UsageRequest req) {
        UsageData data = usageService.saveUsage(req);
        messaging.convertAndSend("/topic/usage", data);
        return ResponseEntity.ok("Saved ID: " + data.getId());
    }

    @GetMapping("/all")
    public List<UsageData> getAll() {
        return usageService.getAll();
    }
}
