package com.zaurtregulov.spring.core.service.contracts;

import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;

import java.time.LocalDateTime;

public interface MaintenanceScheduleService {

    void attachMaintenance(MaintenanceScheduleDto maintenanceScheduleDto);
}
