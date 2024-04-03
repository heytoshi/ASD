package edu.miu.cs.cs489appsd.lab1b.employeepensionapp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.sun.tools.jconsole.JConsoleContext;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        List<Employee> employees = new ArrayList<>();

        PensionPlan plan1 = new PensionPlan("EX1089", "2023-01-17", 100.00);
        PensionPlan plan2 = new PensionPlan("SM2307", "2019-11-04", 1555.50);

        employees.add(new Employee(1, "Daniel", "Agar", "2018-01-17", 105945.50, plan1));
        employees.add(new Employee(2, "Benard", "Shaw", "2018-10-03", 197750.00));
        employees.add(new Employee(3, "Carly", "Agar", "2014-05-16", 842000.75, plan2));
        employees.add(new Employee(4, "Wesley", "Schneider", "2018-11-02", 74500.00));


        printEmployees(employees);
        printUpcoming(employees);
    }

    public static void printEmployees(List<Employee> employees) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        Collections.sort(employees, Comparator.comparing(Employee::getLastName).thenComparing(Employee::getYearlySalary, Comparator.reverseOrder()));
        System.out.println("Employees");
        System.out.println("[");
        for (int i = 0; i < employees.size(); i++) {
            String json = mapper.writeValueAsString(employees.get(i));
            System.out.println("    " + json + (i < employees.size() - 1 ? "," : ""));
        }


        System.out.println("]");
    }

    public static void printUpcoming(List<Employee> employees) throws  JsonProcessingException {
        LocalDate today = LocalDate.now();
        LocalDate nextMonthLastDay = today.plusMonths(2).minusDays(2);

        List<Employee> eligibleEmployees = new ArrayList<>();
        for (Employee employee : employees) {
            LocalDate employmentDate = LocalDate.parse(employee.getEmploymentDate());
            LocalDate employmentDateWith5 = employmentDate.plusYears(5);

            if (employee.getPlan() == null && employmentDateWith5.isBefore(nextMonthLastDay)) {
                eligibleEmployees.add(employee);
            }
        }
        ObjectMapper mapper = new ObjectMapper();
        eligibleEmployees.sort(Comparator.comparing(Employee::getEmploymentDate));
        System.out.println("Monthly Upcoming Enrollees");
        System.out.println("[");
        for (int i = 0; i < eligibleEmployees.size(); i++) {
            String json = mapper.writeValueAsString(eligibleEmployees.get(i));
            System.out.println("    " + json + (i < eligibleEmployees.size() - 1 ? "," : ""));
        }
        System.out.println("]");
    }
}
