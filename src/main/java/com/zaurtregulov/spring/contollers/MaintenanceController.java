package com.zaurtregulov.spring.contollers;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.domain.repository.MaintenanceScheduleRepository;
import com.zaurtregulov.spring.domain.service.MaintenanceScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    private final MaintenanceScheduleService maintenanceScheduleService;

    @Autowired
    public MaintenanceController(MaintenanceScheduleService maintenanceScheduleService) {
        this.maintenanceScheduleService = maintenanceScheduleService;
    }

    @PostMapping("/assign")
    public void assignMaintenance(
            @RequestParam Integer roomNumber,
            @RequestParam LocalDateTime date,
            @RequestParam MaintenanceType maintenanceType,
            @RequestParam MaintenanceScheduleStatus maintenanceScheduleStatus
    ) {
        maintenanceScheduleService.createTask(
                roomNumber,
                date,
                maintenanceType,
                maintenanceScheduleStatus
        );
    }
}
