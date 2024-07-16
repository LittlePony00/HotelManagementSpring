package com.zaurtregulov.spring.cfg;
import com.zaurtregulov.spring.data.repository.*;
import com.zaurtregulov.spring.domain.repository.*;
import com.zaurtregulov.spring.domain.service.*;
import com.zaurtregulov.spring.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() { return new ModelMapper(); }

    @Bean
    public EmployeeRepository employeeRepository() {
        return new EmployeeRepositoryImpl();
    }

    @Bean
    public GuestRepository guestRepository() {
        return new GuestRepositoryImpl();
    }

    @Bean
    public MaintenanceScheduleRepository maintenanceScheduleRepository() {
        return new MaintenanceScheduleRepositoryImpl();
    }

    @Bean
    public ReservationRepository reservationRepository() {
        return new ReservationRepositoryImpl();
    }

    @Bean
    public RoomRepository roomRepository() {
        return new RoomRepositoryImpl();
    }

    @Bean
    public TaskRepository taskRepository() {
        return new TaskRepositoryImpl();
    }

    @Bean
    public EmployeeService employeeService() {
        return new EmployeeServiceImpl();
    }

    @Bean
    public GuestService guestService() {
        return new GuestServiceImpl();
    }

    @Bean
    public MaintenanceScheduleService maintenanceScheduleService() {
        return new MaintenanceScheduleIServiceImpl();
    }

    @Bean
    public ReservationService reservationService() {
        return new ReservationServiceImpl();
    }

    @Bean
    public RoomService roomService() {
        return new RoomServiceImpl();
    }

    @Bean
    public TaskService taskService() {
        return new TaskServiceImpl();
    }
}
