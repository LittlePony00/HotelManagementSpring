package com.zaurtregulov.spring.network.contollers;

import com.zaurtregulov.spring.core.service.contracts.EmployeeService;
import com.zaurtregulov.spring.domain.dto.EmployeeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/save")
    public void saveEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.registerEmployee(employeeDto);
    }
}
