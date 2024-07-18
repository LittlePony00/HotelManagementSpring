package com.zaurtregulov.spring.service;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.data.entity.Task;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.domain.repository.EmployeeRepository;
import com.zaurtregulov.spring.domain.repository.MaintenanceScheduleRepository;
import com.zaurtregulov.spring.domain.repository.RoomRepository;
import com.zaurtregulov.spring.domain.repository.TaskRepository;
import com.zaurtregulov.spring.domain.service.MaintenanceScheduleService;
import org.modelmapper.ModelMapper;

import java.time.LocalDateTime;
import java.util.Date;

public class MaintenanceScheduleIServiceImpl implements MaintenanceScheduleService {

    private final MaintenanceScheduleRepository maintenanceScheduleRepository;
    private final EmployeeRepository employeeRepository;
    private final RoomRepository roomRepository;

    private final ModelMapper modelMapper;

    public MaintenanceScheduleIServiceImpl(
            MaintenanceScheduleRepository maintenanceScheduleRepository,
            EmployeeRepository employeeRepository,
            ModelMapper modelMapper,
            RoomRepository roomRepository
    ) {
        this.maintenanceScheduleRepository = maintenanceScheduleRepository;
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
        this.roomRepository = roomRepository;
    }

    @Override
    public void createTask(
            Integer roomNumber,
            LocalDateTime date,
            MaintenanceType maintenanceType,
            MaintenanceScheduleStatus maintenanceScheduleStatus
    ) {
        Employee employee = employeeRepository.findUnassignedEmployee();
        Room room = roomRepository.findRoomByRoomNumber(roomNumber);

        MaintenanceSchedule maintenanceSchedule = new MaintenanceSchedule(
                employee,
                roomNumber,
                room,
                date,
                maintenanceType,
                maintenanceScheduleStatus
        );

        maintenanceScheduleRepository.save(maintenanceSchedule);
    }
}
