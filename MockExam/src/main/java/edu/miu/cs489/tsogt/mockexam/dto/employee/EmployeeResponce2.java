package edu.miu.cs489.tsogt.mockexam.dto.employee;

import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;

public record EmployeeResponce2(
        long id,
        String firstName,
        String lastName,
        double yearlySalary
) {
}
