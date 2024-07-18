package com.zaurtregulov.spring.dto;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;
import com.zaurtregulov.spring.domain.dto.RoomDto;
import com.zaurtregulov.spring.data.entity.enums.RoomType;

public class RoomDtoImpl implements RoomDto {

    private Room room;
    private Guest guest;
    private Integer roomNumber;
    private RoomType roomType;
    private int capacity;
    private double pricePerNight;
    private boolean availability;
    private MaintenanceScheduleDtoImpl maintenanceScheduleDto;
    private boolean isPetsFriendly;


    protected RoomDtoImpl() {}

    public RoomDtoImpl(
            Room room,
            Guest guest,
            Integer roomNumber,
            RoomType roomType,
            int capacity,
            double pricePerNight,
            boolean availability,
            MaintenanceScheduleDtoImpl maintenanceScheduleDto,
            boolean isPetsFriendly
    ) {
        this.room = room;
        this.guest = guest;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.capacity = capacity;
        this.pricePerNight = pricePerNight;
        this.availability = availability;
        this.maintenanceScheduleDto = maintenanceScheduleDto;
        this.isPetsFriendly = isPetsFriendly;
    }

    @Override
    public Room getRoom() {
        return room;
    }

    @Override
    public void setRoom(Room room) {
        this.room = room;
    }

    @Override
    public Guest getGuest() {
        return guest;
    }

    @Override
    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public MaintenanceScheduleDtoImpl getMaintenanceScheduleDto() {
        return maintenanceScheduleDto;
    }

    public void setMaintenanceScheduleDto(MaintenanceScheduleDtoImpl maintenanceScheduleDto) {
        this.maintenanceScheduleDto = maintenanceScheduleDto;
    }

    public boolean isPetsFriendly() {
        return isPetsFriendly;
    }

    public void setPetsFriendly(boolean petsFriendly) {
        isPetsFriendly = petsFriendly;
    }

    @Override
    public Integer getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public MaintenanceScheduleDtoImpl getMaintenanceSchedule() {
        return this.maintenanceScheduleDto;
    }

    @Override
    public void setMaintenance(MaintenanceScheduleDtoImpl maintenance) {
        this.maintenanceScheduleDto = maintenance;
    }

    @Override
    public Boolean getIsPetsFriendly() {
        return this.isPetsFriendly;
    }

    @Override
    public void setIsPetsFriendly(Boolean isPetsFriendly) {
        this.isPetsFriendly = isPetsFriendly;
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
