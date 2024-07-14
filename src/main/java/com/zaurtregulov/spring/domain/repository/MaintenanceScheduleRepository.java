package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaintenanceScheduleRepository extends JpaRepository<MaintenanceSchedule, String> {

}
