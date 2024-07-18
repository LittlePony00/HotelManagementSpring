package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.HotelRole;
import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends IdEntity {

    private String name;
    private HotelRole hotelRole;
    private String schedule;
    private List<Task> tasks;

    public Employee(String name, String schedule, List<Task> tasks, HotelRole hotelRole) {
        this.name = name;
        this.schedule = schedule;
        this.tasks = tasks;
        this.hotelRole = hotelRole;
    }

    protected Employee() {}

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "schedule", nullable = false)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @Column(name = "hotel_role", nullable = false)
    public HotelRole getHotelRole() {
        return hotelRole;
    }

    public void setHotelRole(HotelRole hotelRole) {
        this.hotelRole = hotelRole;
    }

    @OneToMany(mappedBy = "employee", targetEntity = Task.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Task> getTasks() { return tasks; }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
