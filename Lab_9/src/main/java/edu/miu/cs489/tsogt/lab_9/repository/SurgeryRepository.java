package edu.miu.cs489.tsogt.lab_9.repository;

import edu.miu.cs489.tsogt.lab_9.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Integer> {
}
