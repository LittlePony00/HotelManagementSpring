package com.zaurtregulov.spring.domain.dto;

import com.zaurtregulov.spring.data.entity.enums.HotelRole;

public class EmployeeDto {

    private String employeeName;
    private HotelRole hotelRole;

    private String schedule;

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public HotelRole getHotelRole() {
        return hotelRole;
    }

    public void setHotelRole(HotelRole hotelRole) {
        this.hotelRole = hotelRole;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
}
