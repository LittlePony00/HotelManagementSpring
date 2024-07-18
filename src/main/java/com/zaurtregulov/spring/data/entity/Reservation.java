package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelQuota;
import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "reservation")
public class Reservation extends IdEntity {

    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private ReservationStatus status;
    private HotelQuota hotelQuota;
    private HotelBenefit hotelBenefit;
    private String description;

    public Reservation(
            Room room,
            Guest guest,
            Date checkInDate,
            Date checkOutDate,
            String description,
            ReservationStatus status,
            HotelQuota hotelQuota,
            HotelBenefit hotelBenefit
    ) {
        this.room = room;
        this.guest = guest;
        this.status = status;
        this.hotelQuota = hotelQuota;
        this.description = description;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.hotelBenefit = hotelBenefit;
    }

    protected Reservation() {}

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "guest_id", nullable = false)
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @ManyToOne
    @JoinColumn(name = "room_number", nullable = false)
    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    @Column(name = "check_in_date", nullable = false)
    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    @Column(name = "check_out_date", nullable = false)
    public Date getCheckOutDate() {
        return checkOutDate;
    }

    @Column(name = "description", nullable = true)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "hotel_benefit", nullable = false)
    public HotelBenefit getHotelBenefit() {
        return hotelBenefit;
    }

    public void setHotelBenefit(HotelBenefit hotelBenefit) {
        this.hotelBenefit = hotelBenefit;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Column(name = "status", nullable = false)
    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    @Column(name = "hotel_quota", nullable = false)
    public HotelQuota getHotelQuota() { return this.hotelQuota; }

    public void setHotelQuota(HotelQuota hotelQuota) { this.hotelQuota = hotelQuota; }
}
