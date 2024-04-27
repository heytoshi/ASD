package edu.miu.cs489.tsogt.mockexam.repository;

import edu.miu.cs489.tsogt.mockexam.dto.employee.EmployeeResponce;
import edu.miu.cs489.tsogt.mockexam.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query(value = "SELECT e FROM Employee e JOIN RetirementPlan r " +
            "on r.planId = e.retirementPlan.planId WHERE " +
            "r.retirementDate >= :nextMonthFirstDay AND " +
            "r.retirementDate <= :nextMonthLastDay order by r.retirementDate asc")
    List<Employee> findRetirement(LocalDate nextMonthFirstDay, LocalDate nextMonthLastDay);

}
