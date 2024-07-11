package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "maintenance_schedule")
public class MaintenanceSchedule extends IdEntity {

    private Room room;
    private Date maintenanceDate;
    private String maintenanceType;
    private String status;

    public MaintenanceSchedule(Room room, Date maintenanceDate, String maintenanceType, String status) {
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
    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
