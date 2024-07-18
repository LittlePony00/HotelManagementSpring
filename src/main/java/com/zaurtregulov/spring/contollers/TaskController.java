package com.zaurtregulov.spring.contollers;

import com.zaurtregulov.spring.data.entity.models.TaskAssignmentRequest;
import com.zaurtregulov.spring.domain.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping("/assign")
    public void assignTask(@RequestBody TaskAssignmentRequest request) {
        taskService.createTask(
                request.getDescription(),
                request.getDueDate(),
                request.getTaskStatus(),
                request.getHotelStaffTasks()
        );
    }
}

