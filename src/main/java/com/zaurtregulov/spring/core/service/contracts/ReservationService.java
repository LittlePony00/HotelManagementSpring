package com.zaurtregulov.spring.core.service.contracts;

import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import com.zaurtregulov.spring.domain.dto.ReservationDto;

import java.sql.Date;

public interface ReservationService {

    void bookingRoom(ReservationDto reservationDto);
}
