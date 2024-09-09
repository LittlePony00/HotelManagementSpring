package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultMaintenanceScheduleRepository;
import com.zaurtregulov.spring.domain.repository.contracts.MaintenanceScheduleRepository;
import org.springframework.stereotype.Repository;

@Repository
public class MaintenanceScheduleRepositoryImpl extends BaseRepository<DefaultMaintenanceScheduleRepository> implements MaintenanceScheduleRepository {

    @Override
    public void createMaintenance(MaintenanceSchedule maintenanceSchedule) {
        repository.save(maintenanceSchedule);
    }
}
