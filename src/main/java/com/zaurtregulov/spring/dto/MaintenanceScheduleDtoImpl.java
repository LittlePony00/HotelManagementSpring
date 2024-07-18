package com.zaurtregulov.spring.dto;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;
import com.zaurtregulov.spring.domain.dto.RoomDto;

import java.time.LocalDateTime;
import java.util.Date;

public class MaintenanceScheduleDtoImpl implements MaintenanceScheduleDto {

    private EmployeeDtoImpl employee;
    private LocalDateTime maintenanceDate;
    private MaintenanceType maintenanceType;
    private MaintenanceScheduleStatus status;

    private RoomDtoImpl room;

    protected MaintenanceScheduleDtoImpl() {
    }

    public MaintenanceScheduleDtoImpl(
            EmployeeDtoImpl employee,
            LocalDateTime maintenanceDate,
            MaintenanceType maintenanceType,
            MaintenanceScheduleStatus status,
            RoomDtoImpl room
    ) {
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.status = status;
        this.room = room;
    }

    @Override
    public EmployeeDtoImpl getEmployee() {
        return this.employee;
    }

    @Override
    public void setEmployee(EmployeeDtoImpl employee) {
        this.employee = employee;
    }

    @Override
    public RoomDtoImpl getRoom() {
        return room;
    }

    @Override
    public void setRoom(RoomDtoImpl room) {
        this.room = room;
    }

    @Override
    public LocalDateTime getMaintenanceDate() {
        return maintenanceDate;
    }

    @Override
    public void setMaintenanceDate(LocalDateTime maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    @Override
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    @Override
    public void setMaintenanceType(MaintenanceType maintenanceType) {
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
