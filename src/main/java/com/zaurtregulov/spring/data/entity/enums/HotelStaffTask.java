package com.zaurtregulov.spring.data.entity.enums;

public enum HotelStaffTask {
    ROOM_CLEANING("Clean and prepare guest rooms", 60),
    MAKE_BEDS("Make beds and change linens", 15),
    RESTOCK_AMENITIES("Restock room amenities", 10),
    VACUUM_FLOORS("Vacuum floors and carpets", 20),
    DUST_SURFACES("Dust furniture and surfaces", 15),
    CLEAN_BATHROOM("Clean and sanitize bathrooms", 30),
    EMPTY_TRASH("Empty and replace trash bins", 5),
    LAUNDRY_SERVICE("Collect and deliver laundry", 25),
    TURN_DOWN_SERVICE("Perform evening turn-down service", 10),
    REPORT_MAINTENANCE("Report maintenance issues", 5),
    RESTOCK_CART("Restock housekeeping cart", 15),
    PUBLIC_AREA_CLEANING("Clean public areas and lobbies", 45),
    HANDLE_GUEST_REQUESTS("Respond to guest requests", 20),
    INSPECT_ROOMS("Inspect rooms for quality assurance", 15),
    LOST_AND_FOUND("Handle lost and found items", 10),
    PETS("Pets", 40),
    ;

    private final String taskDescription;
    private final int estimatedMinutes;

    HotelStaffTask(String taskDescription, int estimatedMinutes) {
        this.taskDescription = taskDescription;
        this.estimatedMinutes = estimatedMinutes;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public int getEstimatedMinutes() {
        return estimatedMinutes;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
