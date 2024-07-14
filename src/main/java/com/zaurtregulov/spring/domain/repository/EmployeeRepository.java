package com.zaurtregulov.spring.domain.repository;

import com.zaurtregulov.spring.data.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
