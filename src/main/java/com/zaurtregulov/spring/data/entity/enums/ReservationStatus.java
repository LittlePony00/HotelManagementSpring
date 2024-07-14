package com.zaurtregulov.spring.data.entity.enums;

public enum ReservationStatus {
    PENDING("Pending", 0),
    CONFIRMED("Confirmed", 1),
    CHECKED_IN("Checked_in", 2),
    CHECKED_OUT("Checked_out", 3),
    CANCELLED("Cancelled", 4),
    ;

    private String statusName;
    private int number;

    ReservationStatus(String statusName, int number) {
        this.statusName = statusName;
        this.number = number;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
