package com.zaurtregulov.spring.domain.dto;

import java.util.Date;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;

public interface ReservationDto {
    Date getCheckInDate();
    void setCheckInDate(Date checkInDate);

    Date getCheckOutDate();
    void setCheckOutDate(Date checkOutDate);

    ReservationStatus getStatus();
    void setStatus(ReservationStatus status);
}
