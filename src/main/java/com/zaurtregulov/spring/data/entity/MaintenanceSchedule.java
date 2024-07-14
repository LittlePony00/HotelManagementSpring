package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleType;
import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "maintenance_schedule")
public class MaintenanceSchedule extends IdEntity {

    private Room room;
    private Date maintenanceDate;
    private MaintenanceScheduleType maintenanceType;
    private MaintenanceScheduleStatus status;

    public MaintenanceSchedule(Room room, Date maintenanceDate, MaintenanceScheduleType maintenanceType, MaintenanceScheduleStatus status) {
        this.room = room;
        this.maintenanceDate = maintenanceDate;
        this.maintenanceType = maintenanceType;
        this.status = status;
    }

    protected MaintenanceSchedule() {}

    @OneToOne
    @JoinColumn(name = "room_id", unique = true)
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Column(name = "maintenance_date", nullable = false)
    public Date getMaintenanceDate() {
        return maintenanceDate;
    }

    public void setMaintenanceDate(Date maintenanceDate) {
        this.maintenanceDate = maintenanceDate;
    }

    @Column(name = "maintenance_type", nullable = false)
    public MaintenanceScheduleType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceScheduleType maintenanceType) {
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