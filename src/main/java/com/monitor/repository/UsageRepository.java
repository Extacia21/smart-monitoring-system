package com.monitor.repository;

import com.monitor.model.UsageData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsageRepository extends JpaRepository<UsageData, Long> {}
