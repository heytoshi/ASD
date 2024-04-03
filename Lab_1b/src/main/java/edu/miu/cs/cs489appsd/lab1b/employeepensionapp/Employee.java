package edu.miu.cs.cs489appsd.lab1b.employeepensionapp;

public class Employee {
    private long employeeId;
    private String firstName;
    private String lastName;
    private String employmentDate;
    private double yearlySalary;
    private PensionPlan plan;

    public Employee() {

    }

    public Employee(long employeeId, String firstName, String lastName, String employmentDate, double yearlySalary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
    }

    public Employee(long employeeId, String firstName, String lastName, String employmentDate, double yearlySalary, PensionPlan plan) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.plan = plan;
    }

    public PensionPlan getPlan() {
        return plan;
    }

    public void setPlan(PensionPlan plan) {
        this.plan = plan;
    }

    public long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(String employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }
}
