package edu.miu.cs489.tsogt.lab_6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Patient")
public class Patient {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String dateOfBirth;

    @OneToMany
    private List<Appointment> appointmentList;

    @OneToOne
    private Address address;
}
