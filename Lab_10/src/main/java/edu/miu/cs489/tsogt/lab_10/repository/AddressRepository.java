package edu.miu.cs489.tsogt.lab_10.repository;

import edu.miu.cs489.tsogt.lab_10.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {
}