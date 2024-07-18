package com.zaurtregulov.spring.dto;

import com.zaurtregulov.spring.data.entity.enums.HotelRole;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;

public class EmployeeDtoImpl implements EmployeeDto {
    private String name;
    private HotelRole role;
    private String schedule;

    protected EmployeeDtoImpl() {}

    public EmployeeDtoImpl(String name, HotelRole role, String schedule) {
        this.name = name;
        this.role = role;
        this.schedule = schedule;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public HotelRole getRole() {
        return role;
    }

    @Override
    public void setRole(HotelRole role) {
        this.role = role;
    }

    @Override
    public String getSchedule() {
        return schedule;
    }

    @Override
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
