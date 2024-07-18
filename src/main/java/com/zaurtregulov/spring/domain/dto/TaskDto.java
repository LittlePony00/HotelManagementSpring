package com.zaurtregulov.spring.domain.dto;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.dto.EmployeeDtoImpl;

public interface TaskDto {

    EmployeeDtoImpl getEmployee();
    void setEmployee(EmployeeDtoImpl employee);

    HotelStaffTask getHotelStaffTasks();
    void setHotelStaffTasks(HotelStaffTask hotelStaffTasks);

    String getDescription();
    void setDescription(String description);

    LocalDateTime getDueDate();
    void setDueDate(LocalDateTime dueDate);

    TaskStatus getStatus();
    void setStatus(TaskStatus status);
}
