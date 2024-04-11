package edu.miu.cs489.tsogt.lab_6.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "Dentist")
public class Dentist {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private String contactPhoneNumber;
    private String email;
    private String specialization;

    @OneToMany(mappedBy = "dentist")
    private List<Appointment> appointments;

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{\n");
        sb.append("  \"id\": ").append(id).append(",\n");
        sb.append("  \"firstName\": \"").append(firstName).append("\",\n");
        sb.append("  \"lastName\": \"").append(lastName).append("\",\n");
        sb.append("  \"contactPhoneNumber\": \"").append(contactPhoneNumber).append("\",\n");
        sb.append("  \"email\": \"").append(email).append("\",\n");
        sb.append("  \"specialization\": \"").append(specialization).append("\"\n");
        sb.append("}");
        return sb.toString();
    }
}
