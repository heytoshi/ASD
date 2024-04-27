package edu.miu.cs489.tsogt.mockexam.service;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeRequest;
import edu.miu.cs489.tsogt.mockexam.dto.retirementplan.RetirementPlanResponce2;
import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;

public interface RetirementPlanService {
    RetirementPlanResponce2 createRetirementPlan(EmployeeRequest employee);
    RetirementPlanResponce2 getRetirementPlanWithEmployee(Long employeeId);
}
