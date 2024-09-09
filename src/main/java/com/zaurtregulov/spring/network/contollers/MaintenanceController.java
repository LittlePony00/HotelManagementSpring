package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.data.entity.enums.MaintenanceScheduleStatus;
import com.zaurtregulov.spring.data.entity.enums.MaintenanceType;
import com.zaurtregulov.spring.core.service.contracts.MaintenanceScheduleService;
import com.zaurtregulov.spring.domain.dto.MaintenanceScheduleDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/maintenance")
public class MaintenanceController {

    @Autowired
    MaintenanceScheduleService maintenanceScheduleService;

    @PostMapping("/assign")
    public ResponseEntity<String> assignMaintenance(@RequestBody MaintenanceScheduleDto maintenanceScheduleDto) {
        try {
            maintenanceScheduleService.attachMaintenance(maintenanceScheduleDto);
            return ResponseEntity.ok("Maintenance was assigned");
        } catch (Exception exception) {
            return ResponseEntity.badRequest().body(exception.toString());
        }
    }
}
