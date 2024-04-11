package edu.miu.cs489.tsogt.lab_6.model;

import com.google.gson.JsonObject;
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


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Appointment{");
        sb.append("id=").append(id);
        sb.append(", appointmentDate='").append(appointmentDate).append('\'');
        sb.append(", appointmentTime='").append(appointmentTime).append('\'');
        return sb.toString();
    }
}
