package com.zaurtregulov.spring.domain.dto;

import java.util.Date;
import java.util.List;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import com.zaurtregulov.spring.dto.GuestDtoImpl;
import com.zaurtregulov.spring.dto.RoomDtoImpl;

public interface ReservationDto {
    GuestDtoImpl getGuest();
    void setGuest(GuestDtoImpl guest);

    RoomDtoImpl getRoom();
    void setRoom(RoomDtoImpl room);

    HotelQuota getHotelQuota();
    void setHotelQuota(HotelQuota hotelQuota);

    HotelBenefit getHotelBenefits();
    void setHotelBenefits(HotelBenefit hotelBenefits);

    String getDescription();
    void setDescription(String description);

    Date getCheckInDate();
    void setCheckInDate(Date checkInDate);

    Date getCheckOutDate();
    void setCheckOutDate(Date checkOutDate);

    ReservationStatus getStatus();
    void setStatus(ReservationStatus status);
}
