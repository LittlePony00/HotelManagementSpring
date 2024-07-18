package com.zaurtregulov.spring.data.entity.models;

import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;

import java.sql.Date;
import java.util.List;

public class BookingRequest {
    private HotelBenefit hotelBenefits;
    private String description;
    private HotelQuota hotelQuota;
    private Date checkIn;
    private Date checkOut;
    private Integer guestId;

    public HotelBenefit getHotelBenefits() {
        return hotelBenefits;
    }

    public void setHotelBenefits(HotelBenefit hotelBenefits) {
        this.hotelBenefits = hotelBenefits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public HotelQuota getHotelQuota() {
        return hotelQuota;
    }

    public void setHotelQuota(HotelQuota hotelQuota) {
        this.hotelQuota = hotelQuota;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public Integer getGuestId() {
        return guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }
}
