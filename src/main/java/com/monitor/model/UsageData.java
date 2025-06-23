package com.monitor.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class UsageData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String homeId;
    private Double waterUsage;
    private Double electricityUsage;
    private LocalDateTime timestamp;

    public UsageData() {}

    public UsageData(String homeId, Double waterUsage, Double electricityUsage, LocalDateTime timestamp) {
        this.homeId = homeId;
        this.waterUsage = waterUsage;
        this.electricityUsage = electricityUsage;
        this.timestamp = timestamp;
    }

    // ✅ Add this getter
    public Long getId() {
        return id;
    }

    // (Optional: also add other getters/setters if needed)
}
