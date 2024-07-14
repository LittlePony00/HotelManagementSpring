package com.zaurtregulov.spring.domain.dto;

import java.util.Date;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;

public interface TaskDto {
    String getDescription();
    void setDescription(String description);

    Date getDueDate();
    void setDueDate(Date dueDate);

    TaskStatus getStatus();
    void setStatus(TaskStatus status);
}
