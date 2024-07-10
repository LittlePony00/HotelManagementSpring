package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reservation")
public class Reservation {

    private Long reservationId;
    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id")
    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    @ManyToOne
    @JoinColumn(name = "guest_id", nullable = false)
    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    @ManyToOne
    @JoinColumn(name = "room_id", nullable = false)
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

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
