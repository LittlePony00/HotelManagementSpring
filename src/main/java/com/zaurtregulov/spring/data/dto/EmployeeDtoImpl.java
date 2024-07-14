package com.zaurtregulov.spring.data.dto;

import com.zaurtregulov.spring.domain.dto.EmployeeDto;

public class EmployeeDtoImpl implements EmployeeDto {
    private String name;
    private String role;
    private String schedule;

    protected EmployeeDtoImpl() {}

    public EmployeeDtoImpl(String name, String role, String schedule) {
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
    public String getRole() {
        return role;
    }

    @Override
    public void setRole(String role) {
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
