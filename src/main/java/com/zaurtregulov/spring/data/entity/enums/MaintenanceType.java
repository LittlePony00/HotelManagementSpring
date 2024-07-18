package com.zaurtregulov.spring.data.entity.enums;

public enum MaintenanceType {
    ROUTINE_CLEANING("Daily room cleaning", 1),
    DEEP_CLEANING("Thorough room deep cleaning", 3),
    HVAC_SERVICE("HVAC system maintenance", 4),
    PLUMBING_REPAIR("Plumbing system repair", 3),
    ELECTRICAL_WORK("Electrical system maintenance", 4),
    ELEVATOR_MAINTENANCE("Elevator maintenance and inspection", 5),
    POOL_MAINTENANCE("Swimming pool cleaning and maintenance", 2),
    PEST_CONTROL("Pest control treatment", 3),
    LANDSCAPING("Grounds and landscaping maintenance", 2),
    FURNITURE_REPAIR("Furniture repair and replacement", 2),
    PAINTING("Room and common area painting", 3),
    CARPET_CLEANING("Carpet deep cleaning", 2),
    WINDOW_CLEANING("Window and facade cleaning", 3),
    SECURITY_SYSTEM_CHECK("Security system inspection and maintenance", 4),
    FIRE_SAFETY_INSPECTION("Fire safety equipment inspection", 5);

    private String maintenanceName;
    private int priorityLevel;

    MaintenanceType(String maintenanceName, int priorityLevel) {
        this.maintenanceName = maintenanceName;
        this.priorityLevel = priorityLevel;
    }

    public String getMaintenanceName() {
        return maintenanceName;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    @Override
    public String toString() {
        return name().charAt(0) + name().substring(1).toLowerCase().replace('_', ' ');
    }
}
