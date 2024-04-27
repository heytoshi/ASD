package edu.miu.cs489.tsogt.mockexam.service;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponce> getAllEmployees();
    Employee addEmployee(Employee employee);

    List<EmployeeResponce> getAllEmployeesByPlan();
}
