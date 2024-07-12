package com.zaurtregulov.spring.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "employee")
public class Employee extends IdEntity {

    private String name;
    private String role;
    private String schedule;

    public Employee(String name, String role, String schedule, List<Task> tasks) {
        this.name = name;
        this.role = role;
        this.schedule = schedule;
        this.tasks = tasks;
    }

    protected Employee() {}

    private List<Task> tasks;

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Column(name = "schedule", nullable = false)
    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @OneToMany(mappedBy = "employee", targetEntity = Task.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
