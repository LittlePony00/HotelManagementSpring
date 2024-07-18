package com.zaurtregulov.spring.domain.service;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;

import java.time.LocalDateTime;

public interface MaintenanceScheduleService {

    void createTask(
            Integer roomNumber,
            LocalDateTime date,
            MaintenanceType maintenanceType,
            MaintenanceScheduleStatus maintenanceScheduleStatus
    );
}
