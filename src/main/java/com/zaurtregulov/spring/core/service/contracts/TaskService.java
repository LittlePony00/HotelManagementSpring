package com.zaurtregulov.spring.core.service.contracts;

import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;

import java.time.LocalDateTime;

public interface TaskService {

    void createTask(
            String description,
            LocalDateTime dueDate,
            TaskStatus taskStatus,
            HotelStaffTask hotelStaffTask
    );
}
