package com.zaurtregulov.spring.data.repository;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl extends BaseRepository<Employee, Long> implements EmployeeRepository {

    @Override
    public Employee findUnassignedEmployee() {
        String jpql = "SELECT e FROM Employee e " +
                "WHERE e.id NOT IN (SELECT t.employee.id FROM Task t)";

        return entityManager.createQuery(jpql, Employee.class)
                .setMaxResults(1)
                .getSingleResult();
    }
}
