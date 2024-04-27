package edu.miu.cs489.tsogt.mockexam.dto.retirementplan;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce2;
import edu.miu.cs489.tsogt.mockexam.model.Employee;

import java.time.LocalDate;

public record RetirementPlanResponce2 (
        Long id,
        String referenceNumber,
        LocalDate enrollmentDate,
        LocalDate retirementDate,
        double monthlyContribution,
        EmployeeResponce2 employee
){}
