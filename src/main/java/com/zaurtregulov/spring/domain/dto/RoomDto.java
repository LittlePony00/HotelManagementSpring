package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.data.entity.enums.RoomType;
import com.zaurtregulov.spring.dto.MaintenanceScheduleDtoImpl;

public interface RoomDto {

    Room getRoom();

    void setRoom(Room room);

    Guest getGuest();

    void setGuest(Guest guest);

    Integer getRoomNumber();
    void setRoomNumber(Integer roomNumber);

    MaintenanceScheduleDtoImpl getMaintenanceSchedule();
    void setMaintenance(MaintenanceScheduleDtoImpl maintenance);

    Boolean getIsPetsFriendly();
    void setIsPetsFriendly(Boolean isPetsFriendly);

    RoomType getRoomType();
    void setRoomType(RoomType roomType);

    int getCapacity();
    void setCapacity(int capacity);

    double getPricePerNight();
    void setPricePerNight(double pricePerNight);

    boolean isAvailability();
    void setAvailability(boolean availability);
}
