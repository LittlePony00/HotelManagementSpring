package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "room")
public class Room extends IdEntity {

    private String roomType;
    private int capacity;
    private double pricePerNight;
    private boolean availability;
    private Set<Task> tasks = new HashSet<>();
    private MaintenanceSchedule maintenanceSchedule;

    public Room(String roomType, int capacity, double pricePerNight, boolean availability, Set<Task> tasks, MaintenanceSchedule maintenanceSchedule) {
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.tasks = tasks;
        this.maintenanceSchedule = maintenanceSchedule;
    }

    protected Room() {}

    @Column(name = "room_type", nullable = false)
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    @Column(name = "capacity", nullable = false)
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Column(name = "price_per_night", nullable = false)
    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Column(name = "availability", nullable = false)
    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @ManyToMany(mappedBy = "rooms")
    public Set<Task> getTasks() {
        return tasks;
    }

    public void setTasks(Set<Task> tasks) {
        this.tasks = tasks;
    }

    @OneToOne(mappedBy = "room")
    public MaintenanceSchedule getMaintenanceSchedule() {
        return maintenanceSchedule;
    }

    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        this.maintenanceSchedule = maintenanceSchedule;
    }
}
