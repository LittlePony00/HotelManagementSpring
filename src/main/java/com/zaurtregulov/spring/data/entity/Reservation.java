package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.ReservationStatus;
import jakarta.persistence.*;
import java.util.Date;

//@Entity
//@Table(name = "reservation")
//public class Reservation extends IdEntity {
//
//    private Guest guest;
//    private Room room;
//    private Date checkInDate;
//    private Date checkOutDate;
//    private ReservationStatus status;
//
//    public Reservation(Guest guest, Room room, Date checkInDate, Date checkOutDate, ReservationStatus status) {
//        this.guest = guest;
//        this.room = room;
//        this.checkInDate = checkInDate;
//        this.checkOutDate = checkOutDate;
//        this.status = status;
//    }
//
//    protected Reservation() {}
//
//    @ManyToOne
//    @JoinColumn(name = "guest_id", nullable = false)
//    public Guest getGuest() {
//        return guest;
//    }
//
//    public void setGuest(Guest guest) {
//        this.guest = guest;
//    }
//
//    @ManyToOne
//    @JoinColumn(name = "room_id", nullable = false)
//    public Room getRoom() {
//        return room;
//    }
//
//    public void setRoom(Room room) {
//        this.room = room;
//    }
//
//    @Column(name = "check_in_date", nullable = false)
//    public Date getCheckInDate() {
//        return checkInDate;
//    }
//
//    public void setCheckInDate(Date checkInDate) {
//        this.checkInDate = checkInDate;
//    }
//
//    @Column(name = "check_out_date", nullable = false)
//    public Date getCheckOutDate() {
//        return checkOutDate;
//    }
//
//    public void setCheckOutDate(Date checkOutDate) {
//        this.checkOutDate = checkOutDate;
//    }
//
//    @Column(name = "status", nullable = false)
//    public ReservationStatus getStatus() {
//        return status;
//    }
//
//    public void setStatus(ReservationStatus status) {
//        this.status = status;
//    }
//}

@Entity
@Table(name = "reservation")
public class Reservation extends IdEntity {

    private Guest guest;
    private Room room;
    private Date checkInDate;
    private Date checkOutDate;
    private ReservationStatus status;

    public Reservation(Guest guest, Room room, Date checkInDate, Date checkOutDate, ReservationStatus status) {
        this.guest = guest;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.status = status;
    }

    protected Reservation() {}

    @ManyToOne
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
}
