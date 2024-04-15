package edu.miu.cs489.tsogt.lab_7.repository;

import edu.miu.cs489.tsogt.lab_7.model.Dentist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DentistRepository extends JpaRepository<Dentist, Integer> {
}
