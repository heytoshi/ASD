package edu.miu.cs489.tsogt.lab_9.service;

import edu.miu.cs489.tsogt.lab_9.model.Surgery;

import java.util.List;

public interface SurgeryService {
    List<Surgery> findAll();

    Surgery findById(int id);

    Surgery save(Surgery surgery);

    void delete(Surgery surgery);
}
