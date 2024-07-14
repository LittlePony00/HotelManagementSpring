package com.zaurtregulov.spring.data.entity.enums;

public enum RoomType {
    SINGLE("Single Room", 1),
    DOUBLE("Double Room", 2),
    TWIN("Twin Room", 2),
    TRIPLE("Triple Room", 3),
    QUAD("Quad Room", 4),
    QUEEN("Queen Room", 2),
    KING("King Room", 2),
    SUITE("Suite", 2),
    EXECUTIVE_SUITE("Executive Suite", 2),
    PRESIDENTIAL_SUITE("Presidential Suite", 4),
    CONNECTING_ROOMS("Connecting Rooms", 4),
    ACCESSIBLE("Accessible Room", 2);

    private final String description;
    private final int standardOccupancy;

    RoomType(String description, int standardOccupancy) {
        this.description = description;
        this.standardOccupancy = standardOccupancy;
    }
}
