package com.zaurtregulov.spring.dto;

import java.util.Date;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.domain.dto.TaskDto;

public class TaskDtoImpl implements TaskDto {
    private String description;
    private Date dueDate;
    private TaskStatus status;

    protected TaskDtoImpl() {}

    public TaskDtoImpl(String description, Date dueDate, TaskStatus status) {
        this.description = description;
        this.dueDate = dueDate;
        this.status = status;
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
    public Date getDueDate() {
        return dueDate;
    }

    @Override
    public void setDueDate(Date dueDate) {
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
