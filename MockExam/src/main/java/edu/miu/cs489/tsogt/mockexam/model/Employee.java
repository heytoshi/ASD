package edu.miu.cs489.tsogt.mockexam.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employeeId;
    @Column(nullable = false)
    @NotBlank(message = "* First Name is required")
    private String firstName;
    @Column(nullable = false)
    @NotBlank(message = "* Last Name is required")
    private String lastName;
    @Column(nullable = true)
    private double yearlySalary;

    @OneToOne(cascade = CascadeType.PERSIST)
    private RetirementPlan retirementPlan;

    public Employee(String firstName, String lastName, double yearlySalary, RetirementPlan retirementPlan) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.yearlySalary = yearlySalary;
        this.retirementPlan = retirementPlan;
    }

}
