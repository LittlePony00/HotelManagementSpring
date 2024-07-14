package com.zaurtregulov.spring.data.entity.enums;

public enum TaskStatus {
    // Housekeeping Tasks
    ROOM_CLEANING("Room Cleaning"),
    BED_MAKING("Bed Making"),
    BATHROOM_CLEANING("Bathroom Cleaning"),
    LINEN_CHANGE("Linen Change"),
    RESTOCKING_AMENITIES("Restocking Amenities"),
    DEEP_CLEANING("Deep Cleaning"),

    // Maintenance Tasks
    HVAC_MAINTENANCE("HVAC Maintenance"),BING_REPAIR("Plumbing Repair"),
    ELECTRICAL_REPAIR("Electrical Repair"),
    PAINTING("Painting"),
    FURNITURE_REPAIR("Furniture Repair"),

    // Front Desk Tasks
    CHECK_IN("Guest Check-In"),OUT("Guest Check-Out"),
    RESERVATION_MANAGEMENT("Reservation Management"),
    GUEST_INQUIRY_HANDLING("Guest Inquiry Handling"),

    // Food and BevMEAL_PREPARATION("Meal Preparation"),
    ROOM_SERVICE("Room Service"),
    BAR_SERVICE("Bar Service"),
    RESTAURANT_SERVICE("Restaurant Service"),

    // Security Tasks
    SECURITY_PATROL("Security Patrol"),
    CCTV_MONITORING("CCTV Monitoring"),
    GUEST_SAFETY_ASSISTANCE("Guest Safety Assistance"),

    // Concierge Tasks
    LUGGAGE_HANDLING("Luggage Handling"),
    VALET_PARKING("Valet Parking"),
    PROVIDING_LOCAL_INFORMATION("Providing Local Information"),
    BOOKING_EXTERNAL_SERVICES("Booking External Services");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }
}
