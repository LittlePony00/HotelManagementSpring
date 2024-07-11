package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
public class Guest extends IdEntity {

    private String name;
    private String contactInfo;
    private List<Reservation> reservations;

    public Guest(Long guestId, String name, String contactInfo, List<Reservation> reservations) {
        this.name = name;
        this.contactInfo = contactInfo;
        this.reservations = reservations;
    }

    protected Guest() {}

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "contact_info", nullable = false)
    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @OneToMany(mappedBy = "guest")
    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }
}
