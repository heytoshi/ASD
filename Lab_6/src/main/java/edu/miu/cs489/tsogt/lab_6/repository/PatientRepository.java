package edu.miu.cs489.tsogt.lab_6.repository;

import edu.miu.cs489.tsogt.lab_6.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, String> {
}
