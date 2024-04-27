package edu.miu.cs489.tsogt.mockexam.controller;
import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.service.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class EmployeeController {
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(value = "mock/api/v1/employee/list")
    public ResponseEntity<List<EmployeeResponce>> getAllEmployees() {
        List<EmployeeResponce> employees = employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    @GetMapping(value = "mock/api/v1/employee/list/retirement")
    public ResponseEntity<List<EmployeeResponce>> getAllRetiringEmployees() {
        List<EmployeeResponce> employees = employeeService.getAllEmployeesByPlan();
        return ResponseEntity.ok(employees);
    }
}
