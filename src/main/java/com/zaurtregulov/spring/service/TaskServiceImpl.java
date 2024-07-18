package com.zaurtregulov.spring.service;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.data.entity.Task;
import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.dto.TaskDto;
import com.zaurtregulov.spring.domain.repository.EmployeeRepository;
import com.zaurtregulov.spring.domain.repository.TaskRepository;
import com.zaurtregulov.spring.domain.service.TaskService;
import com.zaurtregulov.spring.dto.EmployeeDtoImpl;
import com.zaurtregulov.spring.dto.TaskDtoImpl;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.List;

public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;
    private final EmployeeRepository employeeRepository;

    private final ModelMapper modelMapper;

    public TaskServiceImpl(TaskRepository taskRepository, EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.taskRepository = taskRepository;
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    @Transactional
    public void createTask(
            String description,
            LocalDateTime dueDate,
            TaskStatus taskStatus,
            HotelStaffTask hotelStaffTask
    ) {
        Employee employee = employeeRepository.findUnassignedEmployee();

        Task task = new Task(
                description,
                employee,
                dueDate,
                taskStatus,
                hotelStaffTask
        );

        taskRepository.save(task);
    }
}
