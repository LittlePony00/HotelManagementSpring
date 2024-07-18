package com.zaurtregulov.spring.data.entity.models;

import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;

import java.time.LocalDateTime;
import java.util.List;

public class TaskAssignmentRequest {
    private String description;
    private LocalDateTime dueDate;
    private TaskStatus taskStatus;
    private HotelStaffTask hotelStaffTasks;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }

    public HotelStaffTask getHotelStaffTasks() {
        return hotelStaffTasks;
    }

    public void setHotelStaffTasks(HotelStaffTask hotelStaffTasks) {
        this.hotelStaffTasks = hotelStaffTasks;
    }
}
