package edu.miu.cs489.tsogt.lab_11.repository;

import edu.miu.cs489.tsogt.lab_11.model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer> {
}
