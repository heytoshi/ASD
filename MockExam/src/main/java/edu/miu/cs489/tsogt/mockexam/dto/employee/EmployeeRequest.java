package edu.miu.cs489.tsogt.mockexam.dto.employee;
import java.time.LocalDate;

public record EmployeeRequest(
        String firstName,
        String lastName,
        double yearlySalary,
        String referenceNumber,
        LocalDate enrollmentDate,
        LocalDate retirementDate,
        double monthlyContribution
) {
}
