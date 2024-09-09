package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.TaskService;
import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.domain.repository.contracts.TaskRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    @Transactional
    public void createTask(
            String description,
            LocalDateTime dueDate,
            TaskStatus taskStatus,
            HotelStaffTask hotelStaffTask
    ) {
//        Employee employee = employeeRepository.findUnassignedEmployee();
//
//        Task task = new Task(
//                description,
//                employee,
//                dueDate,
//                taskStatus,
//                hotelStaffTask
//        );
//
//        taskRepository.save(task);
    }
}
