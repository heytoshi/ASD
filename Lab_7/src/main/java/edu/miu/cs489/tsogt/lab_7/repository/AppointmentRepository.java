package edu.miu.cs489.tsogt.lab_7.repository;

import edu.miu.cs489.tsogt.lab_7.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
