package edu.miu.cs489.tsogt.mockexam.dto.retirementplan;

import java.time.LocalDate;
import java.util.Date;

public record RetirementPlanResponce (
        long id,
        String referenceNumber,
        LocalDate enrollmentDate,
        LocalDate retirementDate,
        double monthlyContribution
){}
