package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.MaintenanceSchedule;
import org.springframework.stereotype.Repository;

@Repository
public interface DefaultMaintenanceScheduleRepository extends DefaultRepository<MaintenanceSchedule> {
}
