package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.RoomType;

public class TaskDto {

    private String employeeName;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isPetsFriendly() {
        return isPetsFriendly;
    }

    public void setPetsFriendly(boolean petsFriendly) {
        isPetsFriendly = petsFriendly;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    private Integer roomNumber;
    private RoomType roomType;
    private int capacity;
    private double pricePerNight;
    private boolean isPetsFriendly;
    private boolean availability;
}
