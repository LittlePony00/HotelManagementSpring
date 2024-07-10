package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "maintenance_schedule")
public class MaintenanceSchedule {

    private Long scheduleId;
    private Room room;
    private Date maintenanceDate;
    private String maintenanceType;
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schedule_id")
    public Long getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

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
