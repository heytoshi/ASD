package edu.miu.cs489.tsogt.lab_7.dto.address;

import edu.miu.cs489.tsogt.lab_7.dto.patient.PatientResponse1;
import edu.miu.cs489.tsogt.lab_7.model.Patient;

public record AddressResponse(
        int id,
        String streetAddress,
        String city,
        String state,
        String postalCod,
        PatientResponse1 patient
) {
}