package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.RoomType;

public interface RoomDto {
    RoomType getRoomType();
    void setRoomType(RoomType roomType);

    int getCapacity();
    void setCapacity(int capacity);

    double getPricePerNight();
    void setPricePerNight(double pricePerNight);

    boolean isAvailability();
    void setAvailability(boolean availability);
}
