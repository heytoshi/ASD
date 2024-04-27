package edu.miu.cs489.tsogt.mockexam.controller;


import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeRequest;
import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.dto.retirementplan.RetirementPlanResponce2;
import edu.miu.cs489.tsogt.mockexam.service.RetirementPlanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RetirementPlanController {
    private RetirementPlanService retirementPlanService;
    public RetirementPlanController(RetirementPlanService retirementPlanService) {
        this.retirementPlanService = retirementPlanService;
    }

    @GetMapping(value = "mock/api/v1/retirementplan/{employeeid}")
    public ResponseEntity<RetirementPlanResponce2> getRetirementPlanWithEmployee(@PathVariable Long employeeid) {
        RetirementPlanResponce2 retirementplan = retirementPlanService.getRetirementPlanWithEmployee(employeeid);
        return ResponseEntity.ok(retirementplan);
    }

    @PostMapping(value = "mock/api/v1/retirementplan/")
    public ResponseEntity<RetirementPlanResponce2> createRetirementPlanWithEmployee(@RequestBody EmployeeRequest employee) {
        RetirementPlanResponce2 retirementplan = retirementPlanService.createRetirementPlan(employee);
        return ResponseEntity.ok(retirementplan);
    }
}
