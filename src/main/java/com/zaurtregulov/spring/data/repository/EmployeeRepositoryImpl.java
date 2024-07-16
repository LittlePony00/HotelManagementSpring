package com.zaurtregulov.spring.data.repository;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.repository.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl extends BaseRepository<Employee, Long> implements EmployeeRepository {

}
