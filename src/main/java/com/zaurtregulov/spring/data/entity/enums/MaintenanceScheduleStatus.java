package com.zaurtregulov.spring.data.entity.enums;

import java.time.Period;

public enum MaintenanceScheduleStatus {
    DAILY("Daily", Period.ofDays(1)),
    WEEKLY("Weekly", Period.ofWeeks(1)),
    BI_WEEKLY("Bi-weekly", Period.ofWeeks(2)),
    MONTHLY("Monthly", Period.ofMonths(1)),
    QUARTERLY("Quarterly", Period.ofMonths(3)),
    SEMI_ANNUALLY("Semi-annually", Period.ofMonths(6)),
    ANNUALLY("Annually", Period.ofYears(1)),
    AS_NEEDED("As needed", null);

    private final String description;
    private final Period interval;

    MaintenanceScheduleStatus(String description, Period interval) {
        this.description = description;
        this.interval = interval;
    }
}
