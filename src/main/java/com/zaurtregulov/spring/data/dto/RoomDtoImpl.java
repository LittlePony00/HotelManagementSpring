package com.zaurtregulov.spring.data.dto;

import com.zaurtregulov.spring.domain.dto.RoomDto;
import com.zaurtregulov.spring.data.entity.enums.RoomType;

public class RoomDtoImpl implements RoomDto {
    private RoomType roomType;
    private int capacity;
    private double pricePerNight;
    private boolean availability;

    protected RoomDtoImpl() {}

    public RoomDtoImpl(RoomType roomType, int capacity, double pricePerNight, boolean availability) {
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
    }

    @Override
    public RoomType getRoomType() {
        return roomType;
    }

    @Override
    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    @Override
    public int getCapacity() {
        return capacity;
    }

    @Override
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double getPricePerNight() {
        return pricePerNight;
    }

    @Override
    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    @Override
    public boolean isAvailability() {
        return availability;
    }

    @Override
    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
