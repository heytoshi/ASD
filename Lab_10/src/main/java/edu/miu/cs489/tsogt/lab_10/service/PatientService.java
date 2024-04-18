package edu.miu.cs489.tsogt.lab_10.service;

import edu.miu.cs489.tsogt.lab_10.dto.patient.PatientRequest;
import edu.miu.cs489.tsogt.lab_10.dto.patient.PatientResponse;
import edu.miu.cs489.tsogt.lab_10.exception.PatientNotFoundException;

import java.util.List;

public interface PatientService {
    List<PatientResponse> getPatients();

    PatientResponse getPatient(Integer id) throws PatientNotFoundException;

    PatientResponse addPatient(PatientRequest patient);

    PatientResponse updatePatient(Integer id, PatientRequest patient) throws PatientNotFoundException;

    void deletePatient(Integer id);

    List<PatientResponse> searchPatients(String searchString);

}