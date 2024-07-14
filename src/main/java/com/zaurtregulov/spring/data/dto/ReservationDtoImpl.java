package com.zaurtregulov.spring.data.dto;

import java.util.Date;

import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import com.zaurtregulov.spring.domain.dto.ReservationDto;

public class ReservationDtoImpl implements ReservationDto {
    private Date checkInDate;
    private Date checkOutDate;
    private ReservationStatus status;

    protected ReservationDtoImpl() {}

    public ReservationDtoImpl(Date checkInDate, Date checkOutDate, ReservationStatus status) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
    }

    @Override
    public Date getCheckInDate() {
        return checkInDate;
    }

    @Override
    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Override
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Override
    public ReservationStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(ReservationStatus status) {
        this.status = status;
    }
}
