package edu.miu.cs489.tsogt.lab_11.repository;

import edu.miu.cs489.tsogt.lab_11.model.Surgery;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurgeryRepository extends JpaRepository<Surgery, Integer> {
}
