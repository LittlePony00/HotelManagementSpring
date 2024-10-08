package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.RoomType;
import jakarta.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "room")
public class Room {

    private Integer roomNumber;
    private RoomType roomType;
    private int capacity;
    private double pricePerNight;
    private boolean isPetsFriendly;
    private boolean availability;
    private MaintenanceSchedule maintenanceSchedule;
    private Set<Task> tasks = new HashSet<>();

    public Room(Integer roomNumber, RoomType roomType, int capacity, double pricePerNight, boolean availability, boolean isPetsFriendly) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.isPetsFriendly = isPetsFriendly;
    }

    protected Room() {}

    @Id
    @Column(name = "room_number")
    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Column(name = "room_type", nullable = false)
    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
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

    @OneToOne(mappedBy = "room", cascade = CascadeType.ALL)
    public MaintenanceSchedule getMaintenanceSchedule() {
        return maintenanceSchedule;
    }

    public void setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
        this.maintenanceSchedule = maintenanceSchedule;
    }

    @Column(name = "is_pets_friendly", nullable = false)
    public boolean isPetsFriendly() {
        return isPetsFriendly;
    }

    public void setPetsFriendly(boolean petsFriendly) {
        isPetsFriendly = petsFriendly;
    }
}
