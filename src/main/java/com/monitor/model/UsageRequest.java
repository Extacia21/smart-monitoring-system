package com.monitor.model;

public class UsageRequest {
    private String homeId;
    private Double waterUsage;
    private Double electricityUsage;

    public UsageRequest() {}

    public String getHomeId() {
        return homeId;
    }

    public void setHomeId(String homeId) {
        this.homeId = homeId;
    }

    public Double getWaterUsage() {
        return waterUsage;
    }

    public void setWaterUsage(Double waterUsage) {
        this.waterUsage = waterUsage;
    }

    public Double getElectricityUsage() {
        return electricityUsage;
    }

    public void setElectricityUsage(Double electricityUsage) {
        this.electricityUsage = electricityUsage;
    }
}
