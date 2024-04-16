package edu.miu.cs489.tsogt.lab_9.dto.patient;

public record PatientResponse1(
        int id,
        String firstName,
        String lastName,
        String contactPhoneNumber,
        String email,
        String dateOfBirth
) {
}