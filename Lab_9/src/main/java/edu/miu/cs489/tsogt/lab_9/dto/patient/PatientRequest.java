package edu.miu.cs489.tsogt.lab_9.dto.patient;

import edu.miu.cs489.tsogt.lab_9.model.Address;

public record PatientRequest (
        String firstName,
        String lastName,
        String contactPhoneNumber,
        String email,
        String dateOfBirth,
        Address address
) {
}
