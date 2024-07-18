package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.dto.EmployeeDtoImpl;
import com.zaurtregulov.spring.dto.RoomDtoImpl;

import java.time.LocalDateTime;
import java.util.Date;

public interface MaintenanceScheduleDto {

    EmployeeDtoImpl getEmployee();
    void setEmployee(EmployeeDtoImpl employee);

    RoomDtoImpl getRoom();

    void setRoom(RoomDtoImpl roomNumber);

    LocalDateTime getMaintenanceDate();
    void setMaintenanceDate(LocalDateTime maintenanceDate);

    MaintenanceType getMaintenanceType();
    void setMaintenanceType(MaintenanceType maintenanceType);

    MaintenanceScheduleStatus getStatus();
    void setStatus(MaintenanceScheduleStatus status);
}
