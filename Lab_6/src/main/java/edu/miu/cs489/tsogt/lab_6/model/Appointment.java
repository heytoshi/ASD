package edu.miu.cs489.tsogt.lab_6.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Appointment")
@Data
public class Appointment {
    @Id
    private int id;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Dentist dentist;
    @ManyToOne
    private Surgery surgery;
    private String appointmentDate;
    private Double appointmentTime;


}
