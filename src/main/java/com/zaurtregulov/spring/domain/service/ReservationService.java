package com.zaurtregulov.spring.domain.service;

import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import com.zaurtregulov.spring.domain.dto.ReservationDto;

import java.sql.Date;
import java.util.List;

public interface ReservationService {

    void bookingRoom(
            HotelBenefit hotelBenefits,
            String description,
            HotelQuota hotelQuota,
            Integer guestId,
            Date check_in,
            Date check_out
    );
}
