package edu.miu.cs489.tsogt.mockexam.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;
import lombok.NonNull;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "retirement_plan")
public class RetirementPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long planId;
    @Column(nullable = false, unique = true)
    @NotBlank(message = "* reference number is required")
    private String referenceNumber;
    @Column(nullable = false)
    @NotNull
    private LocalDate enrollmentDate;
    @Column(nullable = false)
    @NotNull
    private LocalDate retirementDate;
    @Column(nullable = true)
    private double monthlyContribution;


    public RetirementPlan(String referenceNumber, LocalDate enrollmentDate, LocalDate retirementDate, double monthlyContribution) {
        this.referenceNumber = referenceNumber;
        this.enrollmentDate = enrollmentDate;
        this.retirementDate = retirementDate;
        this.monthlyContribution = monthlyContribution;
    }
}
