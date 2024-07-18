package com.zaurtregulov.spring.contollers;

import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import com.zaurtregulov.spring.domain.service.EmployeeService;
import com.zaurtregulov.spring.dto.EmployeeDtoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/save")
    public void saveEmployee(@RequestBody EmployeeDtoImpl employeeDto) {
        employeeService.registerEmployee(employeeDto);
    }
}
