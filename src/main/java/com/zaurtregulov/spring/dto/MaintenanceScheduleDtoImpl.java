package com.zaurtregulov.spring.dto;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleType;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;

import java.util.Date;

public class MaintenanceScheduleDtoImpl implements MaintenanceScheduleDto {
    private Date maintenanceDate;
    private MaintenanceScheduleType maintenanceType;
    private MaintenanceScheduleStatus status;

    protected MaintenanceScheduleDtoImpl() {}

    public MaintenanceScheduleDtoImpl(Date maintenanceDate, MaintenanceScheduleType maintenanceType, MaintenanceScheduleStatus status) {
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.status = status;
    }

    @Override
    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    @Override
    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    @Override
    public MaintenanceScheduleType getMaintenanceType() {
        return maintenanceType;
    }

    @Override
    public void setMaintenanceType(MaintenanceScheduleType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    @Override
    public MaintenanceScheduleStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(MaintenanceScheduleStatus status) {
        this.status = status;
    }
}
