package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;

public interface MaintenanceScheduleRepository {

    void createMaintenance(MaintenanceSchedule maintenanceSchedule);
}
