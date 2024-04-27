package edu.miu.cs489.tsogt.mockexam.service.impl;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.model.Employee;
import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;
import edu.miu.cs489.tsogt.mockexam.repository.EmployeeRepository;
import edu.miu.cs489.tsogt.mockexam.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<EmployeeResponce> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream().map(employee -> new EmployeeResponce(
                employee.getEmployeeId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getYearlySalary(),
                employee.getRetirementPlan()
        )).sorted(Comparator.comparing(EmployeeResponce::lastName))
                .collect(Collectors.toList());
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public List<EmployeeResponce> getAllEmployeesByPlan() {
        LocalDate today = LocalDate.now();
        LocalDate nextMonthFirstDay = today.plusMonths(1).withDayOfMonth(1);
        LocalDate nextMonthLastDay = nextMonthFirstDay.plusMonths(1).minusDays(1);
        List<Employee> employees = employeeRepository.findRetirement(nextMonthFirstDay, nextMonthLastDay);
        return employees.stream().map(employee -> new EmployeeResponce(
                        employee.getEmployeeId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getYearlySalary(),
                        employee.getRetirementPlan()
                )).collect(Collectors.toList());
    }
}
