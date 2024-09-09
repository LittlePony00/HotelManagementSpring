package com.zaurtregulov.spring.domain.repository.impl;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.repository.contracts.DefaultEmployeeRepository;
import com.zaurtregulov.spring.domain.repository.contracts.EmployeeRepository;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepositoryImpl extends BaseRepository<DefaultEmployeeRepository> implements EmployeeRepository {

    @Override
    public Employee finById(Long id) {
        return repository.getReferenceById(id);
    }
}
