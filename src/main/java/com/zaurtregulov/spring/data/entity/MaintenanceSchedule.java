package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "maintenance_schedule")
public class MaintenanceSchedule extends IdEntity {

    private Room room;
    private LocalDateTime maintenanceDate;
    private MaintenanceType maintenanceType;
    private MaintenanceScheduleStatus status;
    private Employee employee;

    public MaintenanceSchedule(
            Employee employee,
            Room room,
            LocalDateTime maintenanceDate,
            MaintenanceType maintenanceType,
            MaintenanceScheduleStatus status
    ) {
        this.employee = employee;
        this.room = room;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.status = status;
    }

    protected MaintenanceSchedule() {}

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "employee_id", nullable = false)
    public Employee getEmployee() { return employee; }

    public void setEmployee(Employee employee) { this.employee = employee; }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "room_number", nullable = false)
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Column(name = "maintenance_date", nullable = false)
    public LocalDateTime getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(LocalDateTime maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    @Column(name = "maintenance_type", nullable = false)
    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    @Column(name = "status", nullable = false)
    public MaintenanceScheduleStatus getStatus() {
        return status;
    }

    public void setStatus(MaintenanceScheduleStatus status) {
        this.status = status;
    }
}
