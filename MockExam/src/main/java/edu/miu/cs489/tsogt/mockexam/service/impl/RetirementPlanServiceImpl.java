package edu.miu.cs489.tsogt.mockexam.service.impl;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeRequest;
import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce2;
import edu.miu.cs489.tsogt.mockexam.dto.retirementplan.RetirementPlanResponce2;
import edu.miu.cs489.tsogt.mockexam.model.Employee;
import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;
import edu.miu.cs489.tsogt.mockexam.repository.EmployeeRepository;
import edu.miu.cs489.tsogt.mockexam.repository.RetirementPlanRepository;
import edu.miu.cs489.tsogt.mockexam.service.RetirementPlanService;
import org.springframework.stereotype.Service;

@Service
public class RetirementPlanServiceImpl implements RetirementPlanService {

    private RetirementPlanRepository retirementPlanRepository;
    private EmployeeRepository employeeRepository;

    public RetirementPlanServiceImpl(RetirementPlanRepository retirementPlanRepository, EmployeeRepository employeeRepository) {
        this.retirementPlanRepository = retirementPlanRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public RetirementPlanResponce2 createRetirementPlan(EmployeeRequest employee) {


        var newEmployeeWithPlan = new Employee(
                employee.firstName(),
                employee.lastName(),
                employee.yearlySalary(),
                new RetirementPlan(
                        employee.referenceNumber(),
                        employee.enrollmentDate(),
                        employee.retirementDate(),
                        employee.monthlyContribution()
                )
        );
        var newEmployee = employeeRepository.save(newEmployeeWithPlan);

        RetirementPlanResponce2 planWithEmployee = new RetirementPlanResponce2(
                newEmployee.getRetirementPlan().getPlanId(),
                newEmployee.getRetirementPlan().getReferenceNumber(),
                newEmployee.getRetirementPlan().getEnrollmentDate(),
                newEmployee.getRetirementPlan().getRetirementDate(),
                newEmployee.getRetirementPlan().getMonthlyContribution(),
                new EmployeeResponce2(
                        newEmployee.getEmployeeId(),
                        newEmployee.getFirstName(),
                        newEmployee.getLastName(),
                        newEmployee.getYearlySalary()
                )
        );

        return planWithEmployee;
    }

    @Override
    public RetirementPlanResponce2 getRetirementPlanWithEmployee(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId).get();
        RetirementPlanResponce2 planWithEmployee = new RetirementPlanResponce2(
                employee.getRetirementPlan().getPlanId(),
                employee.getRetirementPlan().getReferenceNumber(),
                employee.getRetirementPlan().getEnrollmentDate(),
                employee.getRetirementPlan().getRetirementDate(),
                employee.getRetirementPlan().getMonthlyContribution(),
                new EmployeeResponce2(
                        employee.getEmployeeId(),
                        employee.getFirstName(),
                        employee.getLastName(),
                        employee.getYearlySalary()
                )
        );
        return planWithEmployee;
    }
}
