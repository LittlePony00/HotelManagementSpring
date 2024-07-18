package com.zaurtregulov.spring.service;

import com.zaurtregulov.spring.data.entity.Employee;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.repository.EmployeeRepository;
import com.zaurtregulov.spring.domain.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }


    @Override
    @Transactional
    public void registerEmployee(EmployeeDto employeeDto) {
        Employee employee = modelMapper.map(employeeDto, Employee.class);
        employeeRepository.save(employee);
    }

    private Employee mapClientDTOToEntity(EmployeeDto clientDTO) {
        return modelMapper.map(clientDTO, Employee.class);
    }
}
