package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleType;

import java.util.Date;

public interface MaintenanceScheduleDto {
    Date getMaintenanceDate();
    void setMaintenanceDate(Date maintenanceDate);

    MaintenanceScheduleType getMaintenanceType();
    void setMaintenanceType(MaintenanceScheduleType maintenanceType);

    MaintenanceScheduleStatus getStatus();
    void setStatus(MaintenanceScheduleStatus status);
}
