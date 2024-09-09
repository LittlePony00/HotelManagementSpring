package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.data.entity.models.TaskAssignmentRequest;
import com.zaurtregulov.spring.core.service.contracts.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController {

    @Autowired
    TaskService taskService;


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

