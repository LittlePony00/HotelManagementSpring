package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import jakarta.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task extends IdEntity {

    private String description;
    private Employee employee;
    private Date dueDate;
    private TaskStatus status;
    private Set<Room> rooms;

    public Task(String description, Employee employee, Date dueDate, TaskStatus status, Set<Room> rooms) {
        this.description = description;
        this.employee = employee;
        this.dueDate = dueDate;
        this.status = status;
        this.rooms = rooms;
    }

    protected Task() {}

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "due_date", nullable = false)
    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Column(name = "status", nullable = false)
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @ManyToOne
    @JoinColumn(name = "employee", nullable = false)
    public Employee getEmployee() { return employee; }

    public void setEmployee(Employee employee) { this.employee = employee; }

    @ManyToMany
    @JoinTable(
            name = "room_task",
            joinColumns = @JoinColumn(name = "task_id"),
            inverseJoinColumns = @JoinColumn(name = "room_id")
    )
    public Set<Room> getRooms() {
        return rooms;
    }

    public void setRooms(Set<Room> rooms) {
        this.rooms = rooms;
    }
}
