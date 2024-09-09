package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.MaintenanceScheduleService;
import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import com.zaurtregulov.spring.data.entity.Room;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;
import com.zaurtregulov.spring.domain.repository.contracts.EmployeeRepository;
import com.zaurtregulov.spring.domain.repository.contracts.MaintenanceScheduleRepository;
import com.zaurtregulov.spring.domain.repository.contracts.RoomRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class MaintenanceScheduleIServiceImpl implements MaintenanceScheduleService {

    @Autowired
    MaintenanceScheduleRepository maintenanceScheduleRepository;

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    public void attachMaintenance(MaintenanceScheduleDto maintenanceScheduleDto) {
        Employee employee = employeeRepository.finById(maintenanceScheduleDto.getEmployee_id());
        Room room = roomRepository.findRoomByRoomNumber(maintenanceScheduleDto.getRoomNumber());
        MaintenanceSchedule maintenanceSchedule = new MaintenanceSchedule(
                employee,
                room,
                maintenanceScheduleDto.getMaintenanceDate(),
                maintenanceScheduleDto.getMaintenanceType(),
                maintenanceScheduleDto.getStatus()
        );

        maintenanceScheduleRepository.createMaintenance(maintenanceSchedule);
    }
}
