package com.zaurtregulov.spring.data.entity.enums;

public enum TaskStatus {
    DONE("Done"),
    IN_PROGRESS("In progress"),
    NOT_STARTED("Not started"),
    ;

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }
}
