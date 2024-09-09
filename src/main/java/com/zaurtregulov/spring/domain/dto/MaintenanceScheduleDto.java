package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.HotelRole;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;

import java.time.LocalDateTime;

public class MaintenanceScheduleDto {

    private Integer roomNumber;
    private Long employee_id;
    private LocalDateTime maintenanceDate;
    private MaintenanceType maintenanceType;
    private MaintenanceScheduleStatus status;

    public Long getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public LocalDateTime getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDateTime maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public MaintenanceScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(MaintenanceScheduleStatus status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HotelRole getHotelRole() {
        return hotelRole;
    }

    public void setHotelRole(HotelRole hotelRole) {
        this.hotelRole = hotelRole;
    }

    private String name;
    private HotelRole hotelRole;
}
