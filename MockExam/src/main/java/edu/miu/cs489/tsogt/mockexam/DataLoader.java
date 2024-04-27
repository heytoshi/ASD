package edu.miu.cs489.tsogt.mockexam;

import edu.miu.cs489.tsogt.mockexam.model.Employee;
import edu.miu.cs489.tsogt.mockexam.model.RetirementPlan;
import edu.miu.cs489.tsogt.mockexam.repository.EmployeeRepository;
import edu.miu.cs489.tsogt.mockexam.repository.RetirementPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final EmployeeRepository employeeRepository;
    private final RetirementPlanRepository retirementPlanRepository;

    @Autowired
    public DataLoader(EmployeeRepository employeeRepository, RetirementPlanRepository retirementPlanRepository) {
        this.employeeRepository = employeeRepository;
        this.retirementPlanRepository = retirementPlanRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        RetirementPlan plan1 = new RetirementPlan("EX1089", LocalDate.parse("2022-01-17"), LocalDate.parse("2023-09-13"), 100.00f);
        RetirementPlan plan2 = new RetirementPlan("SM1104", LocalDate.parse("2023-02-20"), LocalDate.parse("2023-09-21"), 950.00f);
        RetirementPlan plan3 = new RetirementPlan("SM2307", LocalDate.parse("2020-05-16"), LocalDate.parse("2023-11-04"), 1555.50f);
        RetirementPlan plan4 = new RetirementPlan("SM4133", LocalDate.parse("2019-12-01"), LocalDate.parse("2024-05-30"), 85.00f);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Daniel", "Agar", 105945.50f, plan1));
        employeeList.add(new Employee("Benard", "Shaw", 197750.00f, plan2));
        employeeList.add(new Employee("Carly", "DeFiori", 842000.75f, plan3));
        employeeList.add(new Employee("Wesley", "Schneider",  74500f, plan4));

        employeeRepository.saveAll(employeeList);
    }
}
