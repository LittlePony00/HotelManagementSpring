package com.zaurtregulov.spring.data.entity.enums;

public enum MaintenanceScheduleType {
    ROUTINE("Routine Maintenance"),
    PREVENTIVE("Preventive Maintenance"),
    CORRECTIVE("Corrective Maintenance"),
    PREDICTIVE("Predictive Maintenance"),
    CONDITION_BASED("Condition-Based Maintenance"),
    EMERGENCY("Emergency Maintenance");

    private final String description;

    MaintenanceScheduleType(String description) {
        this.description = description;
    }
}
