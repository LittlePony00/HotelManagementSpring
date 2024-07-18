package com.zaurtregulov.spring.domain.service;

import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.domain.dto.TaskDto;
import com.zaurtregulov.spring.dto.TaskDtoImpl;

import java.time.LocalDateTime;

public interface TaskService {

    void createTask(
            String description,
            LocalDateTime dueDate,
            TaskStatus taskStatus,
            HotelStaffTask hotelStaffTask
    );
}
