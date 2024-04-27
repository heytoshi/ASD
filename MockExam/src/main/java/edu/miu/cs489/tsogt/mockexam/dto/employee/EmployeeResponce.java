package edu.miu.cs489.tsogt.mockexam.dto.employee;

import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;

public record EmployeeResponce(
        long id,
        String firstName,
        String lastName,
        double yearlySalary,
        RetirementPlan retirementPlan
) {
}
