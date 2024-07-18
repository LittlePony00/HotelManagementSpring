package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository {

    public Employee findUnassignedEmployee();

    @Transactional
    void save(Employee employee);
}
