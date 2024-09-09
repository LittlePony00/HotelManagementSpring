package com.zaurtregulov.spring.domain.repository.contracts;

import com.zaurtregulov.spring.data.entity.Employee;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository {

    Employee finById(Long id);
}
