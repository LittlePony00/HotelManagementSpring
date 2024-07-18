package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.HotelRole;

public interface EmployeeDto {
    String getName();
    void setName(String name);

    HotelRole getRole();
    void setRole(HotelRole role);

    String getSchedule();
    void setSchedule(String schedule);
}
