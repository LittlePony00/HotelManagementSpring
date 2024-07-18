package com.zaurtregulov.spring.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.dto.TaskDto;

public class TaskDtoImpl implements TaskDto {
    private String description;
    private LocalDateTime dueDate;
    private TaskStatus status;
    private HotelStaffTask hotelStaffTasks;
    private EmployeeDtoImpl employee;

    protected TaskDtoImpl() {}

    public TaskDtoImpl(String description, LocalDateTime dueDate, TaskStatus status, EmployeeDtoImpl employee, HotelStaffTask hotelStaffTasks) {
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
        this.employee = employee;
        this.hotelStaffTasks = hotelStaffTasks;
    }

    @Override
    public EmployeeDtoImpl getEmployee() {
        return this.employee;
    }

    @Override
    public void setEmployee(EmployeeDtoImpl employee) {
        this.employee = employee;
    }

    @Override
    public HotelStaffTask getHotelStaffTasks() {
        return this.hotelStaffTasks;
    }

    @Override
    public void setHotelStaffTasks(HotelStaffTask hotelStaffTasks) {
        this.hotelStaffTasks = hotelStaffTasks;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    @Override
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public TaskStatus getStatus() {
        return status;
    }

    @Override
    public void setStatus(TaskStatus status) {
        this.status = status;
    }
}
