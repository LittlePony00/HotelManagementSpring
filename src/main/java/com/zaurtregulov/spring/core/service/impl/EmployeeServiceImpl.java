package com.zaurtregulov.spring.core.service.impl;

import com.zaurtregulov.spring.core.service.contracts.EmployeeService;
import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.repository.contracts.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    ModelMapper modelMapper;


    @Override
    @Transactional
    public void registerEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
//        employeeRepository.save(employee);
    }

    private Employee mapClientDTOToEntity(EmployeeDto clientDTO) {
        return modelMapper.map(clientDTO, Employee.class);
    }
}
