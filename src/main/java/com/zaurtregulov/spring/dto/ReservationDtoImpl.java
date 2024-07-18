package com.zaurtregulov.spring.dto;

import java.util.Date;
import java.util.List;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import com.zaurtregulov.spring.domain.dto.GuestDto;
import com.zaurtregulov.spring.domain.dto.ReservationDto;
import com.zaurtregulov.spring.domain.dto.RoomDto;

public class ReservationDtoImpl implements ReservationDto {
    private GuestDtoImpl guest;
    private RoomDtoImpl room;
    private Date checkInDate;
    private Date checkOutDate;
    private ReservationStatus status;
    private HotelQuota hotelQuota;
    private HotelBenefit hotelBenefit;
    private String description;

    protected ReservationDtoImpl() {}

    public ReservationDtoImpl(
            Date checkInDate,
            Date checkOutDate,
            ReservationStatus status,
            GuestDtoImpl guest,
            RoomDtoImpl room,
            HotelQuota hotelQuota,
            HotelBenefit hotelBenefit,
            String description
    ) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
        this.guest = guest;
        this.room = room;
        this.hotelBenefit = hotelBenefit;
        this.hotelQuota = hotelQuota;
        this.description = description;
    }

    @Override
    public GuestDtoImpl getGuest() {
        return this.guest;
    }

    @Override
    public void setGuest(GuestDtoImpl guest) {
        this.guest = guest;
    }

    @Override
    public RoomDtoImpl getRoom() {
        return this.room;
    }

    @Override
    public void setRoom(RoomDtoImpl room) {
        this.room = room;
    }

    @Override
    public HotelQuota getHotelQuota() {
        return this.hotelQuota;
    }

    @Override
    public void setHotelQuota(HotelQuota hotelQuota) {
        this.hotelQuota = hotelQuota;
    }

    @Override
    public HotelBenefit getHotelBenefits() {
        return hotelBenefit;
    }

    @Override
    public void setHotelBenefits(HotelBenefit hotelBenefits) {
        this.hotelBenefit = hotelBenefits;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
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
