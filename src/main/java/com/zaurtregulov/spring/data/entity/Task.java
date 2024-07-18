package com.zaurtregulov.spring.data.entity;

import com.zaurtregulov.spring.data.entity.enums.HotelBenefit;
import com.zaurtregulov.spring.data.entity.enums.HotelStaffTask;
import com.zaurtregulov.spring.data.entity.enums.TaskStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "task")
public class Task extends IdEntity {

    private String description;
    private Employee employee;
    private LocalDateTime dueDate;
    private TaskStatus status;
    private HotelStaffTask hotelStaffTask;
    private Set<Room> rooms;

    public Task(String description, Employee employee, LocalDateTime dueDate, TaskStatus status, HotelStaffTask hotelStaffTask) {
        this.description = description;
        this.employee = employee;
        this.dueDate = dueDate;
        this.status = status;
        this.hotelStaffTask = hotelStaffTask;
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
    public LocalDateTime getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }

    @Column(name = "status", nullable = false)
    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    @Column(name = "hotel_staff_task")
    public HotelStaffTask getHotelStaffTask() {
        return hotelStaffTask;
    }

    public void setHotelStaffTask(HotelStaffTask hotelStaffTask) {
        this.hotelStaffTask = hotelStaffTask;
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
