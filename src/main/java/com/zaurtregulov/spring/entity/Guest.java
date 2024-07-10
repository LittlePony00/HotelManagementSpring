package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "guest")
public class Guest {

    private Long guestId;
    private String name;
    private String contactInfo;
    private List<Reservation> reservations;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "guest_id")
    public Long getGuestId() {
        return guestId;
    }

    public void setGuestId(Long guestId) {
        this.guestId = guestId;
    }

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
