package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.Guest;
import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;

import java.util.Date;

public class ReservationDto {

    private GuestDto guest;
    private int roomNumber;
    private Date checkInDate;
    private Date checkOutDate;
    private ReservationStatus status;
    private HotelQuota hotelQuota;
    private HotelBenefit hotelBenefit;
    private String description;

    public GuestDto getGuest() {
        return guest;
    }

    public void setGuest(GuestDto guest) {
        this.guest = guest;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public HotelQuota getHotelQuota() {
        return hotelQuota;
    }

    public void setHotelQuota(HotelQuota hotelQuota) {
        this.hotelQuota = hotelQuota;
    }

    public HotelBenefit getHotelBenefit() {
        return hotelBenefit;
    }

    public void setHotelBenefit(HotelBenefit hotelBenefit) {
        this.hotelBenefit = hotelBenefit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
